import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MQOIEGDZ")
public final class Class21 {

	@OriginalMember(owner = "client!MQOIEGDZ", name = "c", descriptor = "[B")
	private static byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!MQOIEGDZ", name = "a", descriptor = "B")
	private byte aByte15 = 37;

	@OriginalMember(owner = "client!MQOIEGDZ", name = "b", descriptor = "I")
	private int anInt454 = -296;

	@OriginalMember(owner = "client!MQOIEGDZ", name = "g", descriptor = "I")
	private int anInt456 = 65000;

	@OriginalMember(owner = "client!MQOIEGDZ", name = "f", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!MQOIEGDZ", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!MQOIEGDZ", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!MQOIEGDZ", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIBLjava/io/RandomAccessFile;)V")
	public Class21(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt455 = arg1;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg0;
			if (arg3 != this.aByte15) {
				this.anInt454 = 85;
			}
			this.anInt456 = arg2;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("4250, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQOIEGDZ", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method287(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method290(arg0 * 6, this.aRandomAccessFile2);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray9, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray9[0] & 0xFF) << 16) + ((aByteArray9[1] & 0xFF) << 8) + (aByteArray9[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray9[3] & 0xFF) << 16) + ((aByteArray9[4] & 0xFF) << 8) + (aByteArray9[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt456) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method290(local85 * 520, this.aRandomAccessFile1);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray9, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray9[0] & 0xFF) << 8) + (aByteArray9[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray9[2] & 0xFF) << 8) + (aByteArray9[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray9[4] & 0xFF) << 16) + ((aByteArray9[5] & 0xFF) << 8) + (aByteArray9[6] & 0xFF);
						@Pc(221) int local221 = aByteArray9[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt455) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray9[local248 + 8];
								}
								local85 = local215;
								local113++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local109;
				} else {
					return null;
				}
			} catch (@Pc(272) IOException local272) {
				return null;
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("52076, " + -7321 + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQOIEGDZ", name = "a", descriptor = "(III[B)Z")
	public synchronized boolean method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg1 < 0 || arg1 > 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(18) boolean local18 = this.method289(arg0, (byte) 3, true, arg2, arg3);
			if (!local18) {
				local18 = this.method289(arg0, (byte) 3, false, arg2, arg3);
			}
			return local18;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("60087, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQOIEGDZ", name = "a", descriptor = "(IBZI[B)Z")
	private synchronized boolean method289(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg2) {
					this.method290(arg0 * 6, this.aRandomAccessFile2);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile2.read(aByteArray9, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((aByteArray9[3] & 0xFF) << 16) + ((aByteArray9[4] & 0xFF) << 8) + (aByteArray9[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				aByteArray9[0] = (byte) (arg3 >> 16);
				aByteArray9[1] = (byte) (arg3 >> 8);
				aByteArray9[2] = (byte) arg3;
				aByteArray9[3] = (byte) (local69 >> 16);
				aByteArray9[4] = (byte) (local69 >> 8);
				aByteArray9[5] = (byte) local69;
				this.method290(arg0 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray9, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg3) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg2) {
						this.method290(local69 * 520, this.aRandomAccessFile1);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile1.read(aByteArray9, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((aByteArray9[0] & 0xFF) << 8) + (aByteArray9[1] & 0xFF);
							@Pc(219) int local219 = ((aByteArray9[2] & 0xFF) << 8) + (aByteArray9[3] & 0xFF);
							local155 = ((aByteArray9[4] & 0xFF) << 16) + ((aByteArray9[5] & 0xFF) << 8) + (aByteArray9[6] & 0xFF);
							@Pc(247) int local247 = aByteArray9[7] & 0xFF;
							if (local178 != arg0 || local219 != local35 || local247 != this.anInt455) {
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
					if (arg3 - local24 <= 512) {
						local155 = 0;
					}
					aByteArray9[0] = (byte) (arg0 >> 8);
					aByteArray9[1] = (byte) arg0;
					aByteArray9[2] = (byte) (local35 >> 8);
					aByteArray9[3] = (byte) local35;
					aByteArray9[4] = (byte) (local155 >> 16);
					aByteArray9[5] = (byte) (local155 >> 8);
					aByteArray9[6] = (byte) local155;
					aByteArray9[7] = (byte) this.anInt455;
					this.method290(local69 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray9, 0, 8);
					local167 = arg3 - local24;
					if (local167 > 512) {
						local167 = 512;
					}
					this.aRandomAccessFile1.write(arg4, local24, local167);
					local24 += local167;
					local69 = local155;
					local35++;
				}
				return true;
			} catch (@Pc(390) IOException local390) {
				return false;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("10403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQOIEGDZ", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
	private synchronized void method290(@OriginalArg(1) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			arg1.seek((long) arg0);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("14779, " + true + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
