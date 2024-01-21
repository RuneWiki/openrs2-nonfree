import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XEGQQHIM")
public final class Class44 {

	@OriginalMember(owner = "client!XEGQQHIM", name = "c", descriptor = "[B")
	private static byte[] aByteArray15 = new byte[520];

	@OriginalMember(owner = "client!XEGQQHIM", name = "a", descriptor = "B")
	private byte aByte34 = 7;

	@OriginalMember(owner = "client!XEGQQHIM", name = "b", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!XEGQQHIM", name = "h", descriptor = "I")
	private int anInt767 = 65000;

	@OriginalMember(owner = "client!XEGQQHIM", name = "g", descriptor = "I")
	private int anInt766;

	@OriginalMember(owner = "client!XEGQQHIM", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!XEGQQHIM", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!XEGQQHIM", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;IBLjava/io/RandomAccessFile;)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt766 = arg0;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg1;
			this.anInt767 = arg2;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("76150, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XEGQQHIM", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method520(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method523(this.aRandomAccessFile2, arg0 * 6);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray15, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray15[0] & 0xFF) << 16) + ((aByteArray15[1] & 0xFF) << 8) + (aByteArray15[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray15[3] & 0xFF) << 16) + ((aByteArray15[4] & 0xFF) << 8) + (aByteArray15[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt767) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method523(this.aRandomAccessFile1, local84 * 520);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile1.read(aByteArray15, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray15[0] & 0xFF) << 8) + (aByteArray15[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray15[2] & 0xFF) << 8) + (aByteArray15[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray15[4] & 0xFF) << 16) + ((aByteArray15[5] & 0xFF) << 8) + (aByteArray15[6] & 0xFF);
						@Pc(220) int local220 = aByteArray15[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt766) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray15[local247 + 8];
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
			signlink.reporterror("46367, " + arg0 + ", " + 0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XEGQQHIM", name = "a", descriptor = "(I[BBI)Z")
	public synchronized boolean method521(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) boolean local7 = this.method522(arg0, arg1, arg3, true);
			if (this.aByte34 != 7) {
				throw new NullPointerException();
			}
			@Pc(13) boolean local13 = false;
			if (!local7) {
				local7 = this.method522(arg0, arg1, arg3, false);
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("41909, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XEGQQHIM", name = "a", descriptor = "(I[BIBZ)Z")
	private synchronized boolean method522(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			try {
				@Pc(65) int local65;
				@Pc(20) int local20;
				@Pc(31) int local31;
				if (arg3) {
					this.method523(this.aRandomAccessFile2, arg0 * 6);
					for (local20 = 0; local20 < 6; local20 += local31) {
						local31 = this.aRandomAccessFile2.read(aByteArray15, local20, 6 - local20);
						if (local31 == -1) {
							return false;
						}
					}
					local65 = ((aByteArray15[3] & 0xFF) << 16) + ((aByteArray15[4] & 0xFF) << 8) + (aByteArray15[5] & 0xFF);
					if (local65 <= 0 || (long) local65 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local65 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				aByteArray15[0] = (byte) (arg2 >> 16);
				aByteArray15[1] = (byte) (arg2 >> 8);
				aByteArray15[2] = (byte) arg2;
				aByteArray15[3] = (byte) (local65 >> 16);
				aByteArray15[4] = (byte) (local65 >> 8);
				aByteArray15[5] = (byte) local65;
				this.method523(this.aRandomAccessFile2, arg0 * 6);
				this.aRandomAccessFile2.write(aByteArray15, 0, 6);
				local20 = 0;
				local31 = 0;
				while (local20 < arg2) {
					@Pc(151) int local151 = 0;
					@Pc(163) int local163;
					if (arg3) {
						this.method523(this.aRandomAccessFile1, local65 * 520);
						@Pc(174) int local174;
						for (local163 = 0; local163 < 8; local163 += local174) {
							local174 = this.aRandomAccessFile1.read(aByteArray15, local163, 8 - local163);
							if (local174 == -1) {
								break;
							}
						}
						if (local163 == 8) {
							local174 = ((aByteArray15[0] & 0xFF) << 8) + (aByteArray15[1] & 0xFF);
							@Pc(215) int local215 = ((aByteArray15[2] & 0xFF) << 8) + (aByteArray15[3] & 0xFF);
							local151 = ((aByteArray15[4] & 0xFF) << 16) + ((aByteArray15[5] & 0xFF) << 8) + (aByteArray15[6] & 0xFF);
							@Pc(243) int local243 = aByteArray15[7] & 0xFF;
							if (local174 != arg0 || local215 != local31 || local243 != this.anInt766) {
								return false;
							}
							if (local151 < 0 || (long) local151 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local151 == 0) {
						arg3 = false;
						local151 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local151 == 0) {
							local151++;
						}
						if (local151 == local65) {
							local151++;
						}
					}
					if (arg2 - local20 <= 512) {
						local151 = 0;
					}
					aByteArray15[0] = (byte) (arg0 >> 8);
					aByteArray15[1] = (byte) arg0;
					aByteArray15[2] = (byte) (local31 >> 8);
					aByteArray15[3] = (byte) local31;
					aByteArray15[4] = (byte) (local151 >> 16);
					aByteArray15[5] = (byte) (local151 >> 8);
					aByteArray15[6] = (byte) local151;
					aByteArray15[7] = (byte) this.anInt766;
					this.method523(this.aRandomAccessFile1, local65 * 520);
					this.aRandomAccessFile1.write(aByteArray15, 0, 8);
					local163 = arg2 - local20;
					if (local163 > 512) {
						local163 = 512;
					}
					this.aRandomAccessFile1.write(arg1, local20, local163);
					local20 += local163;
					local65 = local151;
					local31++;
				}
				return true;
			} catch (@Pc(386) IOException local386) {
				return false;
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("14891, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + arg3 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XEGQQHIM", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
	private synchronized void method523(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(35) Exception local35) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23329, " + arg0 + ", " + arg1 + ", " + 101 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
