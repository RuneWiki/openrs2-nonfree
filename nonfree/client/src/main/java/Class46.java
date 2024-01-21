import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class46 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt1021 = 18717;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private int anInt1023 = 65000;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt1022 = arg3;
			this.aRandomAccessFile2 = arg2;
			this.aRandomAccessFile3 = arg4;
			this.anInt1023 = arg1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("68188, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[B")
	public synchronized byte[] method670(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method673(arg0 * 6, this.aRandomAccessFile3);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile3.read(aByteArray20, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt1023) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method673(local85 * 520, this.aRandomAccessFile2);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile2.read(aByteArray20, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(221) int local221 = aByteArray20[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt1022) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray20[local248 + 8];
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
			signlink.reporterror("18583, " + arg0 + ", " + 66 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BZ)Z")
	public synchronized boolean method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(7) boolean local7 = this.method672(arg0, arg1, true, arg2);
			if (!local7) {
				local7 = this.method672(arg0, arg1, false, arg2);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("2110, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIZ[B)Z")
	private synchronized boolean method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg2) {
					this.method673(arg1 * 6, this.aRandomAccessFile3);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile3.read(aByteArray20, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg0 >> 16);
				aByteArray20[1] = (byte) (arg0 >> 8);
				aByteArray20[2] = (byte) arg0;
				aByteArray20[3] = (byte) (local69 >> 16);
				aByteArray20[4] = (byte) (local69 >> 8);
				aByteArray20[5] = (byte) local69;
				this.method673(arg1 * 6, this.aRandomAccessFile3);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg0) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg2) {
						this.method673(local69 * 520, this.aRandomAccessFile2);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile2.read(aByteArray20, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(219) int local219 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local155 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(247) int local247 = aByteArray20[7] & 0xFF;
							if (local178 != arg1 || local219 != local35 || local247 != this.anInt1022) {
								return false;
							}
							if (local155 < 0 || (long) local155 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local155 == 0) {
						arg2 = false;
						local155 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
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
					aByteArray20[0] = (byte) (arg1 >> 8);
					aByteArray20[1] = (byte) arg1;
					aByteArray20[2] = (byte) (local35 >> 8);
					aByteArray20[3] = (byte) local35;
					aByteArray20[4] = (byte) (local155 >> 16);
					aByteArray20[5] = (byte) (local155 >> 8);
					aByteArray20[6] = (byte) local155;
					aByteArray20[7] = (byte) this.anInt1022;
					this.method673(local69 * 520, this.aRandomAccessFile2);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local167 = arg0 - local24;
					if (local167 > 512) {
						local167 = 512;
					}
					this.aRandomAccessFile2.write(arg3, local24, local167);
					local24 += local167;
					local69 = local155;
					local35++;
				}
				return true;
			} catch (@Pc(390) IOException local390) {
				return false;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("51268, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
	private synchronized void method673(@OriginalArg(1) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
		try {
			if (this.anInt1021 == 18717) {
				if (arg0 < 0 || arg0 > 62914560) {
					System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
					arg0 = 62914560;
					try {
						Thread.sleep(1000L);
					} catch (@Pc(29) Exception local29) {
					}
				}
				arg1.seek((long) arg0);
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("4060, " + 18717 + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
