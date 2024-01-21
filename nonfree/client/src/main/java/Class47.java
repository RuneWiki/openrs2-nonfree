import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XFNDANMT")
public final class Class47 {

	@OriginalMember(owner = "client!XFNDANMT", name = "c", descriptor = "[B")
	private static byte[] aByteArray19 = new byte[520];

	@OriginalMember(owner = "client!XFNDANMT", name = "a", descriptor = "I")
	private int anInt752 = -13325;

	@OriginalMember(owner = "client!XFNDANMT", name = "b", descriptor = "I")
	private int anInt753 = -192;

	@OriginalMember(owner = "client!XFNDANMT", name = "h", descriptor = "I")
	private int anInt755 = 65000;

	@OriginalMember(owner = "client!XFNDANMT", name = "g", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!XFNDANMT", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!XFNDANMT", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!XFNDANMT", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;II)V")
	public Class47(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt754 = arg4;
			this.aRandomAccessFile1 = arg2;
			this.aRandomAccessFile2 = arg0;
			this.anInt755 = arg1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("52910, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XFNDANMT", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method538(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method541(this.aRandomAccessFile2, arg0 * 6);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray19, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray19[0] & 0xFF) << 16) + ((aByteArray19[1] & 0xFF) << 8) + (aByteArray19[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray19[3] & 0xFF) << 16) + ((aByteArray19[4] & 0xFF) << 8) + (aByteArray19[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt755) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method541(this.aRandomAccessFile1, local84 * 520);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile1.read(aByteArray19, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray19[0] & 0xFF) << 8) + (aByteArray19[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray19[2] & 0xFF) << 8) + (aByteArray19[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray19[4] & 0xFF) << 16) + ((aByteArray19[5] & 0xFF) << 8) + (aByteArray19[6] & 0xFF);
						@Pc(220) int local220 = aByteArray19[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt754) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray19[local247 + 8];
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
			signlink.reporterror("5524, " + -13096 + ", " + arg0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XFNDANMT", name = "a", descriptor = "(III[B)Z")
	public synchronized boolean method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			@Pc(7) boolean local7 = this.method540(true, arg0, arg1, arg3);
			@Pc(11) boolean local11 = false;
			if (!local7) {
				local7 = this.method540(false, arg0, arg1, arg3);
			}
			return local7;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("95643, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XFNDANMT", name = "a", descriptor = "(ZIII[B)Z")
	private synchronized boolean method540(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg0) {
					this.method541(this.aRandomAccessFile2, arg1 * 6);
					for (local19 = 0; local19 < 6; local19 += local30) {
						local30 = this.aRandomAccessFile2.read(aByteArray19, local19, 6 - local19);
						if (local30 == -1) {
							return false;
						}
					}
					local64 = ((aByteArray19[3] & 0xFF) << 16) + ((aByteArray19[4] & 0xFF) << 8) + (aByteArray19[5] & 0xFF);
					if (local64 <= 0 || (long) local64 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local64 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local64 == 0) {
						local64 = 1;
					}
				}
				aByteArray19[0] = (byte) (arg2 >> 16);
				aByteArray19[1] = (byte) (arg2 >> 8);
				aByteArray19[2] = (byte) arg2;
				aByteArray19[3] = (byte) (local64 >> 16);
				aByteArray19[4] = (byte) (local64 >> 8);
				aByteArray19[5] = (byte) local64;
				this.method541(this.aRandomAccessFile2, arg1 * 6);
				this.aRandomAccessFile2.write(aByteArray19, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg2) {
					@Pc(150) int local150 = 0;
					@Pc(162) int local162;
					if (arg0) {
						this.method541(this.aRandomAccessFile1, local64 * 520);
						@Pc(173) int local173;
						for (local162 = 0; local162 < 8; local162 += local173) {
							local173 = this.aRandomAccessFile1.read(aByteArray19, local162, 8 - local162);
							if (local173 == -1) {
								break;
							}
						}
						if (local162 == 8) {
							local173 = ((aByteArray19[0] & 0xFF) << 8) + (aByteArray19[1] & 0xFF);
							@Pc(214) int local214 = ((aByteArray19[2] & 0xFF) << 8) + (aByteArray19[3] & 0xFF);
							local150 = ((aByteArray19[4] & 0xFF) << 16) + ((aByteArray19[5] & 0xFF) << 8) + (aByteArray19[6] & 0xFF);
							@Pc(242) int local242 = aByteArray19[7] & 0xFF;
							if (local173 != arg1 || local214 != local30 || local242 != this.anInt754) {
								return false;
							}
							if (local150 < 0 || (long) local150 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local150 == 0) {
						arg0 = false;
						local150 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local150 == 0) {
							local150++;
						}
						if (local150 == local64) {
							local150++;
						}
					}
					if (arg2 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray19[0] = (byte) (arg1 >> 8);
					aByteArray19[1] = (byte) arg1;
					aByteArray19[2] = (byte) (local30 >> 8);
					aByteArray19[3] = (byte) local30;
					aByteArray19[4] = (byte) (local150 >> 16);
					aByteArray19[5] = (byte) (local150 >> 8);
					aByteArray19[6] = (byte) local150;
					aByteArray19[7] = (byte) this.anInt754;
					this.method541(this.aRandomAccessFile1, local64 * 520);
					this.aRandomAccessFile1.write(aByteArray19, 0, 8);
					local162 = arg2 - local19;
					if (local162 > 512) {
						local162 = 512;
					}
					this.aRandomAccessFile1.write(arg3, local19, local162);
					local19 += local162;
					local64 = local150;
					local30++;
				}
				return true;
			} catch (@Pc(385) IOException local385) {
				return false;
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("95229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XFNDANMT", name = "a", descriptor = "(BLjava/io/RandomAccessFile;I)V")
	private synchronized void method541(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(30) Exception local30) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("79167, " + -127 + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
