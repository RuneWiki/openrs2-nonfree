import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JXARNXDE")
public final class Class20 {

	@OriginalMember(owner = "client!JXARNXDE", name = "e", descriptor = "[B")
	private static byte[] aByteArray13 = new byte[520];

	@OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "I")
	private int anInt310 = 697;

	@OriginalMember(owner = "client!JXARNXDE", name = "b", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!JXARNXDE", name = "d", descriptor = "I")
	private int anInt312 = -817;

	@OriginalMember(owner = "client!JXARNXDE", name = "i", descriptor = "I")
	private int anInt314 = 65000;

	@OriginalMember(owner = "client!JXARNXDE", name = "h", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!JXARNXDE", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!JXARNXDE", name = "c", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!JXARNXDE", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!JXARNXDE", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt313 = arg3;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg2;
			this.anInt314 = arg0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("18627, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method182(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method185(this.aRandomAccessFile2, arg0 * 6, this.aBoolean74);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray13, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray13[0] & 0xFF) << 16) + ((aByteArray13[1] & 0xFF) << 8) + (aByteArray13[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray13[3] & 0xFF) << 16) + ((aByteArray13[4] & 0xFF) << 8) + (aByteArray13[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt314) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method185(this.aRandomAccessFile1, local84 * 520, this.aBoolean74);
						local17 = 0;
						@Pc(133) int local133 = local28 - local110;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local17 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray13, local17, local133 + 8 - local17);
							if (local151 == -1) {
								return null;
							}
							local17 += local151;
						}
						local151 = ((aByteArray13[0] & 0xFF) << 8) + (aByteArray13[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray13[2] & 0xFF) << 8) + (aByteArray13[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray13[4] & 0xFF) << 16) + ((aByteArray13[5] & 0xFF) << 8) + (aByteArray13[6] & 0xFF);
						@Pc(221) int local221 = aByteArray13[7] & 0xFF;
						if (local151 == arg0 && local193 == local112 && local221 == this.anInt313) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local108[local110++] = aByteArray13[local248 + 8];
								}
								local84 = local215;
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
			} catch (@Pc(272) IOException local272) {
				return null;
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("42450, " + arg0 + ", " + 767 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(III[B)Z")
	public synchronized boolean method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			@Pc(7) boolean local7 = this.method184(arg3, arg0, true, arg2);
			@Pc(11) boolean local11 = false;
			if (!local7) {
				local7 = this.method184(arg3, arg0, false, arg2);
			}
			return local7;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("37240, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(B[BIZI)Z")
	private synchronized boolean method184(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg2) {
					this.method185(this.aRandomAccessFile2, arg1 * 6, this.aBoolean74);
					for (local19 = 0; local19 < 6; local19 += local30) {
						local30 = this.aRandomAccessFile2.read(aByteArray13, local19, 6 - local19);
						if (local30 == -1) {
							return false;
						}
					}
					local64 = ((aByteArray13[3] & 0xFF) << 16) + ((aByteArray13[4] & 0xFF) << 8) + (aByteArray13[5] & 0xFF);
					if (local64 <= 0 || (long) local64 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local64 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local64 == 0) {
						local64 = 1;
					}
				}
				aByteArray13[0] = (byte) (arg3 >> 16);
				aByteArray13[1] = (byte) (arg3 >> 8);
				aByteArray13[2] = (byte) arg3;
				aByteArray13[3] = (byte) (local64 >> 16);
				aByteArray13[4] = (byte) (local64 >> 8);
				aByteArray13[5] = (byte) local64;
				this.method185(this.aRandomAccessFile2, arg1 * 6, this.aBoolean74);
				this.aRandomAccessFile2.write(aByteArray13, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg3) {
					@Pc(151) int local151 = 0;
					@Pc(164) int local164;
					if (arg2) {
						this.method185(this.aRandomAccessFile1, local64 * 520, this.aBoolean74);
						@Pc(175) int local175;
						for (local164 = 0; local164 < 8; local164 += local175) {
							local175 = this.aRandomAccessFile1.read(aByteArray13, local164, 8 - local164);
							if (local175 == -1) {
								break;
							}
						}
						if (local164 == 8) {
							local175 = ((aByteArray13[0] & 0xFF) << 8) + (aByteArray13[1] & 0xFF);
							@Pc(216) int local216 = ((aByteArray13[2] & 0xFF) << 8) + (aByteArray13[3] & 0xFF);
							local151 = ((aByteArray13[4] & 0xFF) << 16) + ((aByteArray13[5] & 0xFF) << 8) + (aByteArray13[6] & 0xFF);
							@Pc(244) int local244 = aByteArray13[7] & 0xFF;
							if (local175 != arg1 || local216 != local30 || local244 != this.anInt313) {
								return false;
							}
							if (local151 < 0 || (long) local151 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local151 == 0) {
						arg2 = false;
						local151 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local151 == 0) {
							local151++;
						}
						if (local151 == local64) {
							local151++;
						}
					}
					if (arg3 - local19 <= 512) {
						local151 = 0;
					}
					aByteArray13[0] = (byte) (arg1 >> 8);
					aByteArray13[1] = (byte) arg1;
					aByteArray13[2] = (byte) (local30 >> 8);
					aByteArray13[3] = (byte) local30;
					aByteArray13[4] = (byte) (local151 >> 16);
					aByteArray13[5] = (byte) (local151 >> 8);
					aByteArray13[6] = (byte) local151;
					aByteArray13[7] = (byte) this.anInt313;
					this.method185(this.aRandomAccessFile1, local64 * 520, this.aBoolean74);
					this.aRandomAccessFile1.write(aByteArray13, 0, 8);
					local164 = arg3 - local19;
					if (local164 > 512) {
						local164 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local19, local164);
					local19 += local164;
					local64 = local151;
					local30++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("18052, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IZ)V")
	private synchronized void method185(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			arg0.seek((long) arg1);
			if (arg2) {
				;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("57255, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
