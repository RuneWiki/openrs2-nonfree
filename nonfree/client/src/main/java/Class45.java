import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt972 = 284;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean249 = true;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt974 = 65000;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt973 = arg3;
			this.aRandomAccessFile2 = arg4;
			this.aRandomAccessFile3 = arg2;
			this.anInt974 = arg1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("85085, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[B")
	public synchronized byte[] method652(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method655(this.aRandomAccessFile3, arg0 * 6);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile3.read(aByteArray20, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt974) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method655(this.aRandomAccessFile2, local88 * 520);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile2.read(aByteArray20, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(224) int local224 = aByteArray20[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt973) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray20[local251 + 8];
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
			signlink.reporterror("12887, " + arg0 + ", " + 81 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method653(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(15) boolean local15 = this.method654(true, arg1, arg2, arg0);
			if (!local15) {
				local15 = this.method654(false, arg1, arg2, arg0);
			}
			return local15;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("25965, " + arg0 + ", " + -381 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZII[B)Z")
	private synchronized boolean method654(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg0) {
					this.method655(this.aRandomAccessFile3, arg1 * 6);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile3.read(aByteArray20, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg2 >> 16);
				aByteArray20[1] = (byte) (arg2 >> 8);
				aByteArray20[2] = (byte) arg2;
				aByteArray20[3] = (byte) (local68 >> 16);
				aByteArray20[4] = (byte) (local68 >> 8);
				aByteArray20[5] = (byte) local68;
				this.method655(this.aRandomAccessFile3, arg1 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg2) {
					@Pc(154) int local154 = 0;
					@Pc(166) int local166;
					if (arg0) {
						this.method655(this.aRandomAccessFile2, local68 * 520);
						@Pc(177) int local177;
						for (local166 = 0; local166 < 8; local166 += local177) {
							local177 = this.aRandomAccessFile2.read(aByteArray20, local166, 8 - local166);
							if (local177 == -1) {
								break;
							}
						}
						if (local166 == 8) {
							local177 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(218) int local218 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local154 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(246) int local246 = aByteArray20[7] & 0xFF;
							if (local177 != arg1 || local218 != local34 || local246 != this.anInt973) {
								return false;
							}
							if (local154 < 0 || (long) local154 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local154 == 0) {
						arg0 = false;
						local154 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local154 == 0) {
							local154++;
						}
						if (local154 == local68) {
							local154++;
						}
					}
					if (arg2 - local23 <= 512) {
						local154 = 0;
					}
					aByteArray20[0] = (byte) (arg1 >> 8);
					aByteArray20[1] = (byte) arg1;
					aByteArray20[2] = (byte) (local34 >> 8);
					aByteArray20[3] = (byte) local34;
					aByteArray20[4] = (byte) (local154 >> 16);
					aByteArray20[5] = (byte) (local154 >> 8);
					aByteArray20[6] = (byte) local154;
					aByteArray20[7] = (byte) this.anInt973;
					this.method655(this.aRandomAccessFile2, local68 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local166 = arg2 - local23;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile2.write(arg3, local23, local166);
					local23 += local166;
					local68 = local154;
					local34++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("55537, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
	private synchronized void method655(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(33) Exception local33) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("7582, " + 115 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
