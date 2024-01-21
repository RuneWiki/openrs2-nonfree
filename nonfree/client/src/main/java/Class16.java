import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IGSLDTHC")
public final class Class16 {

	@OriginalMember(owner = "client!IGSLDTHC", name = "c", descriptor = "[B")
	private static byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "I")
	private int anInt392 = 923;

	@OriginalMember(owner = "client!IGSLDTHC", name = "b", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!IGSLDTHC", name = "g", descriptor = "I")
	private int anInt394 = 65000;

	@OriginalMember(owner = "client!IGSLDTHC", name = "f", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!IGSLDTHC", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!IGSLDTHC", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!IGSLDTHC", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;IZ)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.anInt393 = arg3;
			this.aRandomAccessFile1 = arg1;
			this.aRandomAccessFile2 = arg2;
			this.anInt394 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("33536, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method214(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method217(this.aRandomAccessFile2, arg0 * 6);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray7, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray7[0] & 0xFF) << 16) + ((aByteArray7[1] & 0xFF) << 8) + (aByteArray7[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray7[3] & 0xFF) << 16) + ((aByteArray7[4] & 0xFF) << 8) + (aByteArray7[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt394) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method217(this.aRandomAccessFile1, local84 * 520);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile1.read(aByteArray7, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray7[0] & 0xFF) << 8) + (aByteArray7[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray7[2] & 0xFF) << 8) + (aByteArray7[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray7[4] & 0xFF) << 16) + ((aByteArray7[5] & 0xFF) << 8) + (aByteArray7[6] & 0xFF);
						@Pc(220) int local220 = aByteArray7[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt393) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray7[local247 + 8];
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
			signlink.reporterror("78178, " + true + ", " + arg0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(I[BBI)Z")
	public synchronized boolean method215(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) boolean local7 = this.method216(true, 923, arg3, arg0, arg1);
			@Pc(12) boolean local12 = false;
			if (!local7) {
				local7 = this.method216(false, 923, arg3, arg0, arg1);
			}
			return local7;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("94130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(ZIII[B)Z")
	private synchronized boolean method216(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(62) int local62;
				@Pc(17) int local17;
				@Pc(28) int local28;
				if (arg0) {
					this.method217(this.aRandomAccessFile2, arg2 * 6);
					for (local17 = 0; local17 < 6; local17 += local28) {
						local28 = this.aRandomAccessFile2.read(aByteArray7, local17, 6 - local17);
						if (local28 == -1) {
							return false;
						}
					}
					local62 = ((aByteArray7[3] & 0xFF) << 16) + ((aByteArray7[4] & 0xFF) << 8) + (aByteArray7[5] & 0xFF);
					if (local62 <= 0 || (long) local62 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local62 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local62 == 0) {
						local62 = 1;
					}
				}
				aByteArray7[0] = (byte) (arg3 >> 16);
				aByteArray7[1] = (byte) (arg3 >> 8);
				aByteArray7[2] = (byte) arg3;
				aByteArray7[3] = (byte) (local62 >> 16);
				aByteArray7[4] = (byte) (local62 >> 8);
				aByteArray7[5] = (byte) local62;
				this.method217(this.aRandomAccessFile2, arg2 * 6);
				this.aRandomAccessFile2.write(aByteArray7, 0, 6);
				local17 = 0;
				local28 = 0;
				while (local17 < arg3) {
					@Pc(148) int local148 = 0;
					@Pc(160) int local160;
					if (arg0) {
						this.method217(this.aRandomAccessFile1, local62 * 520);
						@Pc(171) int local171;
						for (local160 = 0; local160 < 8; local160 += local171) {
							local171 = this.aRandomAccessFile1.read(aByteArray7, local160, 8 - local160);
							if (local171 == -1) {
								break;
							}
						}
						if (local160 == 8) {
							local171 = ((aByteArray7[0] & 0xFF) << 8) + (aByteArray7[1] & 0xFF);
							@Pc(212) int local212 = ((aByteArray7[2] & 0xFF) << 8) + (aByteArray7[3] & 0xFF);
							local148 = ((aByteArray7[4] & 0xFF) << 16) + ((aByteArray7[5] & 0xFF) << 8) + (aByteArray7[6] & 0xFF);
							@Pc(240) int local240 = aByteArray7[7] & 0xFF;
							if (local171 != arg2 || local212 != local28 || local240 != this.anInt393) {
								return false;
							}
							if (local148 < 0 || (long) local148 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local148 == 0) {
						arg0 = false;
						local148 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local148 == 0) {
							local148++;
						}
						if (local148 == local62) {
							local148++;
						}
					}
					if (arg3 - local17 <= 512) {
						local148 = 0;
					}
					aByteArray7[0] = (byte) (arg2 >> 8);
					aByteArray7[1] = (byte) arg2;
					aByteArray7[2] = (byte) (local28 >> 8);
					aByteArray7[3] = (byte) local28;
					aByteArray7[4] = (byte) (local148 >> 16);
					aByteArray7[5] = (byte) (local148 >> 8);
					aByteArray7[6] = (byte) local148;
					aByteArray7[7] = (byte) this.anInt393;
					this.method217(this.aRandomAccessFile1, local62 * 520);
					this.aRandomAccessFile1.write(aByteArray7, 0, 8);
					local160 = arg3 - local17;
					if (local160 > 512) {
						local160 = 512;
					}
					this.aRandomAccessFile1.write(arg4, local17, local160);
					local17 += local160;
					local62 = local148;
					local28++;
				}
				return true;
			} catch (@Pc(383) IOException local383) {
				return false;
			}
		} catch (@Pc(386) RuntimeException local386) {
			signlink.reporterror("3304, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method217(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(29) Exception local29) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("97845, " + arg0 + ", " + -660 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
