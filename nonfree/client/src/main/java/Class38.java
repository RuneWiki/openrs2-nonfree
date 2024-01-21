import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TUZTEZTO")
public final class Class38 {

	@OriginalMember(owner = "client!TUZTEZTO", name = "c", descriptor = "[B")
	private static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "B")
	private byte aByte27 = 5;

	@OriginalMember(owner = "client!TUZTEZTO", name = "b", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!TUZTEZTO", name = "h", descriptor = "I")
	private int anInt554 = 65000;

	@OriginalMember(owner = "client!TUZTEZTO", name = "g", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!TUZTEZTO", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!TUZTEZTO", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!TUZTEZTO", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;II)V")
	public Class38(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt553 = arg4;
			this.aRandomAccessFile1 = arg0;
			this.aRandomAccessFile2 = arg2;
			this.anInt554 = arg3;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("41063, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method371(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method374(arg0 * 6, this.aRandomAccessFile2);
				@Pc(22) int local22;
				@Pc(33) int local33;
				for (local22 = 0; local22 < 6; local22 += local33) {
					local33 = this.aRandomAccessFile2.read(aByteArray17, local22, 6 - local22);
					if (local33 == -1) {
						return null;
					}
				}
				local33 = ((aByteArray17[0] & 0xFF) << 16) + ((aByteArray17[1] & 0xFF) << 8) + (aByteArray17[2] & 0xFF);
				@Pc(89) int local89 = ((aByteArray17[3] & 0xFF) << 16) + ((aByteArray17[4] & 0xFF) << 8) + (aByteArray17[5] & 0xFF);
				if (local33 < 0 || local33 > this.anInt554) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(113) byte[] local113 = new byte[local33];
					@Pc(115) int local115 = 0;
					@Pc(117) int local117 = 0;
					while (local115 < local33) {
						if (local89 == 0) {
							return null;
						}
						this.method374(local89 * 520, this.aRandomAccessFile1);
						local22 = 0;
						@Pc(137) int local137 = local33 - local115;
						if (local137 > 512) {
							local137 = 512;
						}
						@Pc(155) int local155;
						while (local22 < local137 + 8) {
							local155 = this.aRandomAccessFile1.read(aByteArray17, local22, local137 + 8 - local22);
							if (local155 == -1) {
								return null;
							}
							local22 += local155;
						}
						local155 = ((aByteArray17[0] & 0xFF) << 8) + (aByteArray17[1] & 0xFF);
						@Pc(197) int local197 = ((aByteArray17[2] & 0xFF) << 8) + (aByteArray17[3] & 0xFF);
						@Pc(219) int local219 = ((aByteArray17[4] & 0xFF) << 16) + ((aByteArray17[5] & 0xFF) << 8) + (aByteArray17[6] & 0xFF);
						@Pc(225) int local225 = aByteArray17[7] & 0xFF;
						if (local155 == arg0 && local197 == local117 && local225 == this.anInt553) {
							if (local219 >= 0 && (long) local219 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(252) int local252 = 0; local252 < local137; local252++) {
									local113[local115++] = aByteArray17[local252 + 8];
								}
								local89 = local219;
								local117++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local113;
				} else {
					return null;
				}
			} catch (@Pc(276) IOException local276) {
				return null;
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("96665, " + -934 + ", " + arg0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "([BBII)Z")
	public synchronized boolean method372(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aByte27 == 5) {
				@Pc(5) boolean local5 = false;
			} else {
				this.aBoolean129 = !this.aBoolean129;
			}
			@Pc(23) boolean local23 = this.method373(arg2, arg3, arg0, true);
			if (!local23) {
				local23 = this.method373(arg2, arg3, arg0, false);
			}
			return local23;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("53998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "(II[BIZ)Z")
	private synchronized boolean method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) boolean arg3) {
		try {
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg3) {
					this.method374(arg1 * 6, this.aRandomAccessFile2);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile2.read(aByteArray17, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray17[3] & 0xFF) << 16) + ((aByteArray17[4] & 0xFF) << 8) + (aByteArray17[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray17[0] = (byte) (arg0 >> 16);
				aByteArray17[1] = (byte) (arg0 >> 8);
				aByteArray17[2] = (byte) arg0;
				aByteArray17[3] = (byte) (local68 >> 16);
				aByteArray17[4] = (byte) (local68 >> 8);
				aByteArray17[5] = (byte) local68;
				this.method374(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray17, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg0) {
					@Pc(154) int local154 = 0;
					@Pc(166) int local166;
					if (arg3) {
						this.method374(local68 * 520, this.aRandomAccessFile1);
						@Pc(177) int local177;
						for (local166 = 0; local166 < 8; local166 += local177) {
							local177 = this.aRandomAccessFile1.read(aByteArray17, local166, 8 - local166);
							if (local177 == -1) {
								break;
							}
						}
						if (local166 == 8) {
							local177 = ((aByteArray17[0] & 0xFF) << 8) + (aByteArray17[1] & 0xFF);
							@Pc(218) int local218 = ((aByteArray17[2] & 0xFF) << 8) + (aByteArray17[3] & 0xFF);
							local154 = ((aByteArray17[4] & 0xFF) << 16) + ((aByteArray17[5] & 0xFF) << 8) + (aByteArray17[6] & 0xFF);
							@Pc(246) int local246 = aByteArray17[7] & 0xFF;
							if (local177 != arg1 || local218 != local34 || local246 != this.anInt553) {
								return false;
							}
							if (local154 < 0 || (long) local154 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local154 == 0) {
						arg3 = false;
						local154 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local154 == 0) {
							local154++;
						}
						if (local154 == local68) {
							local154++;
						}
					}
					if (arg0 - local23 <= 512) {
						local154 = 0;
					}
					aByteArray17[0] = (byte) (arg1 >> 8);
					aByteArray17[1] = (byte) arg1;
					aByteArray17[2] = (byte) (local34 >> 8);
					aByteArray17[3] = (byte) local34;
					aByteArray17[4] = (byte) (local154 >> 16);
					aByteArray17[5] = (byte) (local154 >> 8);
					aByteArray17[6] = (byte) local154;
					aByteArray17[7] = (byte) this.anInt553;
					this.method374(local68 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray17, 0, 8);
					local166 = arg0 - local23;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local23, local166);
					local23 += local166;
					local68 = local154;
					local34++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("12397, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
	private synchronized void method374(@OriginalArg(0) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("35110, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
