import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XGQETHKV")
public final class Class44 {

	@OriginalMember(owner = "client!XGQETHKV", name = "c", descriptor = "[B")
	private static byte[] aByteArray18 = new byte[520];

	@OriginalMember(owner = "client!XGQETHKV", name = "a", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!XGQETHKV", name = "b", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!XGQETHKV", name = "h", descriptor = "I")
	private int anInt659 = 65000;

	@OriginalMember(owner = "client!XGQETHKV", name = "g", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!XGQETHKV", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!XGQETHKV", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!XGQETHKV", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
	public Class44(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt658 = arg2;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg0;
			this.anInt659 = arg4;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("93143, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGQETHKV", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method478(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method481(this.aRandomAccessFile2, arg0 * 6);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray18, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray18[0] & 0xFF) << 16) + ((aByteArray18[1] & 0xFF) << 8) + (aByteArray18[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt659) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method481(this.aRandomAccessFile1, local84 * 520);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile1.read(aByteArray18, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
						@Pc(220) int local220 = aByteArray18[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt658) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray18[local247 + 8];
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
			signlink.reporterror("92802, " + false + ", " + arg0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGQETHKV", name = "a", descriptor = "(IZ[BI)Z")
	public synchronized boolean method479(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) boolean local13 = this.method480(true, arg0, arg1, 988, arg2);
			if (!local13) {
				local13 = this.method480(false, arg0, arg1, 988, arg2);
			}
			return local13;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("55414, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGQETHKV", name = "a", descriptor = "(ZI[BII)Z")
	private synchronized boolean method480(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(62) int local62;
				@Pc(17) int local17;
				@Pc(28) int local28;
				if (arg0) {
					this.method481(this.aRandomAccessFile2, arg4 * 6);
					for (local17 = 0; local17 < 6; local17 += local28) {
						local28 = this.aRandomAccessFile2.read(aByteArray18, local17, 6 - local17);
						if (local28 == -1) {
							return false;
						}
					}
					local62 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
					if (local62 <= 0 || (long) local62 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local62 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local62 == 0) {
						local62 = 1;
					}
				}
				aByteArray18[0] = (byte) (arg1 >> 16);
				aByteArray18[1] = (byte) (arg1 >> 8);
				aByteArray18[2] = (byte) arg1;
				aByteArray18[3] = (byte) (local62 >> 16);
				aByteArray18[4] = (byte) (local62 >> 8);
				aByteArray18[5] = (byte) local62;
				this.method481(this.aRandomAccessFile2, arg4 * 6);
				this.aRandomAccessFile2.write(aByteArray18, 0, 6);
				local17 = 0;
				local28 = 0;
				while (local17 < arg1) {
					@Pc(148) int local148 = 0;
					@Pc(160) int local160;
					if (arg0) {
						this.method481(this.aRandomAccessFile1, local62 * 520);
						@Pc(171) int local171;
						for (local160 = 0; local160 < 8; local160 += local171) {
							local171 = this.aRandomAccessFile1.read(aByteArray18, local160, 8 - local160);
							if (local171 == -1) {
								break;
							}
						}
						if (local160 == 8) {
							local171 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
							@Pc(212) int local212 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
							local148 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
							@Pc(240) int local240 = aByteArray18[7] & 0xFF;
							if (local171 != arg4 || local212 != local28 || local240 != this.anInt658) {
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
					if (arg1 - local17 <= 512) {
						local148 = 0;
					}
					aByteArray18[0] = (byte) (arg4 >> 8);
					aByteArray18[1] = (byte) arg4;
					aByteArray18[2] = (byte) (local28 >> 8);
					aByteArray18[3] = (byte) local28;
					aByteArray18[4] = (byte) (local148 >> 16);
					aByteArray18[5] = (byte) (local148 >> 8);
					aByteArray18[6] = (byte) local148;
					aByteArray18[7] = (byte) this.anInt658;
					this.method481(this.aRandomAccessFile1, local62 * 520);
					this.aRandomAccessFile1.write(aByteArray18, 0, 8);
					local160 = arg1 - local17;
					if (local160 > 512) {
						local160 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local17, local160);
					local17 += local160;
					local62 = local148;
					local28++;
				}
				return true;
			} catch (@Pc(383) IOException local383) {
				return false;
			}
		} catch (@Pc(386) RuntimeException local386) {
			signlink.reporterror("46892, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGQETHKV", name = "a", descriptor = "(BLjava/io/RandomAccessFile;I)V")
	private synchronized void method481(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
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
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("10678, " + 88 + ", " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
