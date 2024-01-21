import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RUMGIOMW")
public final class Class34 {

	@OriginalMember(owner = "client!RUMGIOMW", name = "d", descriptor = "[B")
	private static byte[] aByteArray12 = new byte[520];

	@OriginalMember(owner = "client!RUMGIOMW", name = "a", descriptor = "I")
	private int anInt562 = 46093;

	@OriginalMember(owner = "client!RUMGIOMW", name = "b", descriptor = "Z")
	private boolean aBoolean148 = true;

	@OriginalMember(owner = "client!RUMGIOMW", name = "c", descriptor = "I")
	private int anInt563 = -620;

	@OriginalMember(owner = "client!RUMGIOMW", name = "h", descriptor = "I")
	private int anInt565 = 65000;

	@OriginalMember(owner = "client!RUMGIOMW", name = "g", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!RUMGIOMW", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!RUMGIOMW", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!RUMGIOMW", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt564 = arg4;
			this.aRandomAccessFile1 = arg1;
			if (arg0 != this.anInt562) {
				this.aBoolean148 = !this.aBoolean148;
			}
			this.aRandomAccessFile2 = arg2;
			this.anInt565 = arg3;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("12209, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUMGIOMW", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			try {
				this.method436(arg0 * 6, this.aRandomAccessFile2);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray12, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray12[0] & 0xFF) << 16) + ((aByteArray12[1] & 0xFF) << 8) + (aByteArray12[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray12[3] & 0xFF) << 16) + ((aByteArray12[4] & 0xFF) << 8) + (aByteArray12[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt565) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method436(local84 * 520, this.aRandomAccessFile1);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile1.read(aByteArray12, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray12[0] & 0xFF) << 8) + (aByteArray12[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray12[2] & 0xFF) << 8) + (aByteArray12[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray12[4] & 0xFF) << 16) + ((aByteArray12[5] & 0xFF) << 8) + (aByteArray12[6] & 0xFF);
						@Pc(220) int local220 = aByteArray12[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt564) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray12[local247 + 8];
								}
								local84 = local214;
								local112++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local108;
				} else {
					return null;
				}
			} catch (@Pc(271) IOException local271) {
				return null;
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("53243, " + arg0 + ", " + arg1 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUMGIOMW", name = "a", descriptor = "(ZI[BI)Z")
	public synchronized boolean method434(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method435(arg1, arg2, true, arg0);
			if (!local7) {
				local7 = this.method435(arg1, arg2, false, arg0);
			}
			return local7;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("65707, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUMGIOMW", name = "a", descriptor = "([BIIZI)Z")
	private synchronized boolean method435(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg2) {
					this.method436(arg1 * 6, this.aRandomAccessFile2);
					for (local19 = 0; local19 < 6; local19 += local30) {
						local30 = this.aRandomAccessFile2.read(aByteArray12, local19, 6 - local19);
						if (local30 == -1) {
							return false;
						}
					}
					local64 = ((aByteArray12[3] & 0xFF) << 16) + ((aByteArray12[4] & 0xFF) << 8) + (aByteArray12[5] & 0xFF);
					if (local64 <= 0 || (long) local64 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local64 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local64 == 0) {
						local64 = 1;
					}
				}
				aByteArray12[0] = (byte) (arg3 >> 16);
				aByteArray12[1] = (byte) (arg3 >> 8);
				aByteArray12[2] = (byte) arg3;
				aByteArray12[3] = (byte) (local64 >> 16);
				aByteArray12[4] = (byte) (local64 >> 8);
				aByteArray12[5] = (byte) local64;
				this.method436(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray12, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg3) {
					@Pc(150) int local150 = 0;
					@Pc(162) int local162;
					if (arg2) {
						this.method436(local64 * 520, this.aRandomAccessFile1);
						@Pc(173) int local173;
						for (local162 = 0; local162 < 8; local162 += local173) {
							local173 = this.aRandomAccessFile1.read(aByteArray12, local162, 8 - local162);
							if (local173 == -1) {
								break;
							}
						}
						if (local162 == 8) {
							local173 = ((aByteArray12[0] & 0xFF) << 8) + (aByteArray12[1] & 0xFF);
							@Pc(214) int local214 = ((aByteArray12[2] & 0xFF) << 8) + (aByteArray12[3] & 0xFF);
							local150 = ((aByteArray12[4] & 0xFF) << 16) + ((aByteArray12[5] & 0xFF) << 8) + (aByteArray12[6] & 0xFF);
							@Pc(242) int local242 = aByteArray12[7] & 0xFF;
							if (local173 != arg1 || local214 != local30 || local242 != this.anInt564) {
								return false;
							}
							if (local150 < 0 || (long) local150 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local150 == 0) {
						arg2 = false;
						local150 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local150 == 0) {
							local150++;
						}
						if (local150 == local64) {
							local150++;
						}
					}
					if (arg3 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray12[0] = (byte) (arg1 >> 8);
					aByteArray12[1] = (byte) arg1;
					aByteArray12[2] = (byte) (local30 >> 8);
					aByteArray12[3] = (byte) local30;
					aByteArray12[4] = (byte) (local150 >> 16);
					aByteArray12[5] = (byte) (local150 >> 8);
					aByteArray12[6] = (byte) local150;
					aByteArray12[7] = (byte) this.anInt564;
					this.method436(local64 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray12, 0, 8);
					local162 = arg3 - local19;
					if (local162 > 512) {
						local162 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local19, local162);
					local19 += local162;
					local64 = local150;
					local30++;
				}
				return true;
			} catch (@Pc(385) IOException local385) {
				return false;
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("52462, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUMGIOMW", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
	private synchronized void method436(@OriginalArg(1) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("81782, " + true + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
