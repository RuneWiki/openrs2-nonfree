import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YXBFJZDP")
public final class Class47 {

	@OriginalMember(owner = "client!YXBFJZDP", name = "b", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!YXBFJZDP", name = "f", descriptor = "I")
	private int anInt780 = 65000;

	@OriginalMember(owner = "client!YXBFJZDP", name = "e", descriptor = "I")
	private int anInt779;

	@OriginalMember(owner = "client!YXBFJZDP", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!YXBFJZDP", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!YXBFJZDP", name = "<init>", descriptor = "(IIILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt779 = arg1;
			@Pc(14) int local14 = 95 / arg2;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg3;
			this.anInt780 = arg0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("19125, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(IB)[B")
	public synchronized byte[] method568(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method571(this.aRandomAccessFile2, arg0 * 6);
				@Pc(22) int local22;
				@Pc(33) int local33;
				for (local22 = 0; local22 < 6; local22 += local33) {
					local33 = this.aRandomAccessFile2.read(aByteArray20, local22, 6 - local22);
					if (local33 == -1) {
						return null;
					}
				}
				local33 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(89) int local89 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local33 < 0 || local33 > this.anInt780) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(113) byte[] local113 = new byte[local33];
					@Pc(115) int local115 = 0;
					@Pc(117) int local117 = 0;
					while (local115 < local33) {
						if (local89 == 0) {
							return null;
						}
						this.method571(this.aRandomAccessFile1, local89 * 520);
						local22 = 0;
						@Pc(137) int local137 = local33 - local115;
						if (local137 > 512) {
							local137 = 512;
						}
						@Pc(155) int local155;
						while (local22 < local137 + 8) {
							local155 = this.aRandomAccessFile1.read(aByteArray20, local22, local137 + 8 - local22);
							if (local155 == -1) {
								return null;
							}
							local22 += local155;
						}
						local155 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(197) int local197 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(219) int local219 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(225) int local225 = aByteArray20[7] & 0xFF;
						if (local155 == arg0 && local197 == local117 && local225 == this.anInt779) {
							if (local219 >= 0 && (long) local219 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(252) int local252 = 0; local252 < local137; local252++) {
									local113[local115++] = aByteArray20[local252 + 8];
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
			signlink.reporterror("2824, " + arg0 + ", " + 46 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(B[BII)Z")
	public synchronized boolean method569(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method570(true, 699, arg1, arg2, arg0);
			if (!local7) {
				local7 = this.method570(false, 699, arg1, arg2, arg0);
			}
			return local7;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("7005, " + 56 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(ZIII[B)Z")
	private synchronized boolean method570(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(62) int local62;
				@Pc(17) int local17;
				@Pc(28) int local28;
				if (arg0) {
					this.method571(this.aRandomAccessFile2, arg3 * 6);
					for (local17 = 0; local17 < 6; local17 += local28) {
						local28 = this.aRandomAccessFile2.read(aByteArray20, local17, 6 - local17);
						if (local28 == -1) {
							return false;
						}
					}
					local62 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local62 <= 0 || (long) local62 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local62 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local62 == 0) {
						local62 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg2 >> 16);
				aByteArray20[1] = (byte) (arg2 >> 8);
				aByteArray20[2] = (byte) arg2;
				aByteArray20[3] = (byte) (local62 >> 16);
				aByteArray20[4] = (byte) (local62 >> 8);
				aByteArray20[5] = (byte) local62;
				this.method571(this.aRandomAccessFile2, arg3 * 6);
				this.aRandomAccessFile2.write(aByteArray20, 0, 6);
				local17 = 0;
				local28 = 0;
				while (local17 < arg2) {
					@Pc(148) int local148 = 0;
					@Pc(160) int local160;
					if (arg0) {
						this.method571(this.aRandomAccessFile1, local62 * 520);
						@Pc(171) int local171;
						for (local160 = 0; local160 < 8; local160 += local171) {
							local171 = this.aRandomAccessFile1.read(aByteArray20, local160, 8 - local160);
							if (local171 == -1) {
								break;
							}
						}
						if (local160 == 8) {
							local171 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(212) int local212 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local148 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(240) int local240 = aByteArray20[7] & 0xFF;
							if (local171 != arg3 || local212 != local28 || local240 != this.anInt779) {
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
					if (arg2 - local17 <= 512) {
						local148 = 0;
					}
					aByteArray20[0] = (byte) (arg3 >> 8);
					aByteArray20[1] = (byte) arg3;
					aByteArray20[2] = (byte) (local28 >> 8);
					aByteArray20[3] = (byte) local28;
					aByteArray20[4] = (byte) (local148 >> 16);
					aByteArray20[5] = (byte) (local148 >> 8);
					aByteArray20[6] = (byte) local148;
					aByteArray20[7] = (byte) this.anInt779;
					this.method571(this.aRandomAccessFile1, local62 * 520);
					this.aRandomAccessFile1.write(aByteArray20, 0, 8);
					local160 = arg2 - local17;
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
			signlink.reporterror("27322, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method571(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1) throws IOException {
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
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("45507, " + arg0 + ", " + arg1 + ", " + 593 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
