import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ENNRILHF")
public final class Class8 {

	@OriginalMember(owner = "client!ENNRILHF", name = "b", descriptor = "[B")
	private static byte[] aByteArray1 = new byte[520];

	@OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ENNRILHF", name = "f", descriptor = "I")
	private int anInt289 = 65000;

	@OriginalMember(owner = "client!ENNRILHF", name = "e", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!ENNRILHF", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ENNRILHF", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!ENNRILHF", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;II)V")
	public Class8(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt288 = arg1;
			this.aRandomAccessFile1 = arg0;
			this.aRandomAccessFile2 = arg2;
			this.anInt289 = arg3;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("83709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(BI)[B")
	public synchronized byte[] method137(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method140(this.aRandomAccessFile2, arg0 * 6, (byte) 7);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray1, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray1[0] & 0xFF) << 16) + ((aByteArray1[1] & 0xFF) << 8) + (aByteArray1[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray1[3] & 0xFF) << 16) + ((aByteArray1[4] & 0xFF) << 8) + (aByteArray1[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt289) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method140(this.aRandomAccessFile1, local88 * 520, (byte) 7);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray1, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray1[0] & 0xFF) << 8) + (aByteArray1[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray1[2] & 0xFF) << 8) + (aByteArray1[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray1[4] & 0xFF) << 16) + ((aByteArray1[5] & 0xFF) << 8) + (aByteArray1[6] & 0xFF);
						@Pc(224) int local224 = aByteArray1[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt288) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray1[local251 + 8];
								}
								local88 = local218;
								local116++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local112;
				} else {
					return null;
				}
			} catch (@Pc(275) IOException local275) {
				return null;
			}
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("48179, " + 5 + ", " + arg0 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(III[B)Z")
	public synchronized boolean method138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(7) boolean local7 = this.method139(arg0, arg2, true, arg1);
			if (!local7) {
				local7 = this.method139(arg0, arg2, false, arg1);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("21546, " + arg0 + ", " + -78 + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(BI[BZI)Z")
	private synchronized boolean method139(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg2) {
					this.method140(this.aRandomAccessFile2, arg3 * 6, (byte) 7);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile2.read(aByteArray1, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((aByteArray1[3] & 0xFF) << 16) + ((aByteArray1[4] & 0xFF) << 8) + (aByteArray1[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				aByteArray1[0] = (byte) (arg0 >> 16);
				aByteArray1[1] = (byte) (arg0 >> 8);
				aByteArray1[2] = (byte) arg0;
				aByteArray1[3] = (byte) (local69 >> 16);
				aByteArray1[4] = (byte) (local69 >> 8);
				aByteArray1[5] = (byte) local69;
				this.method140(this.aRandomAccessFile2, arg3 * 6, (byte) 7);
				this.aRandomAccessFile2.write(aByteArray1, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg0) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg2) {
						this.method140(this.aRandomAccessFile1, local69 * 520, (byte) 7);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile1.read(aByteArray1, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((aByteArray1[0] & 0xFF) << 8) + (aByteArray1[1] & 0xFF);
							@Pc(219) int local219 = ((aByteArray1[2] & 0xFF) << 8) + (aByteArray1[3] & 0xFF);
							local155 = ((aByteArray1[4] & 0xFF) << 16) + ((aByteArray1[5] & 0xFF) << 8) + (aByteArray1[6] & 0xFF);
							@Pc(247) int local247 = aByteArray1[7] & 0xFF;
							if (local178 != arg3 || local219 != local35 || local247 != this.anInt288) {
								return false;
							}
							if (local155 < 0 || (long) local155 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local155 == 0) {
						arg2 = false;
						local155 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local155 == 0) {
							local155++;
						}
						if (local155 == local69) {
							local155++;
						}
					}
					if (arg0 - local24 <= 512) {
						local155 = 0;
					}
					aByteArray1[0] = (byte) (arg3 >> 8);
					aByteArray1[1] = (byte) arg3;
					aByteArray1[2] = (byte) (local35 >> 8);
					aByteArray1[3] = (byte) local35;
					aByteArray1[4] = (byte) (local155 >> 16);
					aByteArray1[5] = (byte) (local155 >> 8);
					aByteArray1[6] = (byte) local155;
					aByteArray1[7] = (byte) this.anInt288;
					this.method140(this.aRandomAccessFile1, local69 * 520, (byte) 7);
					this.aRandomAccessFile1.write(aByteArray1, 0, 8);
					local167 = arg0 - local24;
					if (local167 > 512) {
						local167 = 512;
					}
					this.aRandomAccessFile1.write(arg1, local24, local167);
					local24 += local167;
					local69 = local155;
					local35++;
				}
				return true;
			} catch (@Pc(390) IOException local390) {
				return false;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("83412, " + 25 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
	private synchronized void method140(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(40) Exception local40) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("27053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
