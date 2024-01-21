import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt946 = 37801;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt948 = 65000;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt947 = arg3;
			this.aRandomAccessFile2 = arg2;
			this.aRandomAccessFile3 = arg1;
			this.anInt948 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("26137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method650(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method653(arg0 * 6, this.aRandomAccessFile3);
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
				if (local29 < 0 || local29 > this.anInt948) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method653(local85 * 520, this.aRandomAccessFile2);
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
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt947) {
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
			signlink.reporterror("83916, " + arg0 + ", " + -32477 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method651(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) boolean local7 = this.method652(arg2, arg0, arg1, true, 230);
			@Pc(11) boolean local11 = false;
			if (!local7) {
				local7 = this.method652(arg2, arg0, arg1, false, 230);
			}
			return local7;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99547, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[BIZI)Z")
	private synchronized boolean method652(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(62) int local62;
				@Pc(17) int local17;
				@Pc(28) int local28;
				if (arg3) {
					this.method653(arg2 * 6, this.aRandomAccessFile3);
					for (local17 = 0; local17 < 6; local17 += local28) {
						local28 = this.aRandomAccessFile3.read(aByteArray20, local17, 6 - local17);
						if (local28 == -1) {
							return false;
						}
					}
					local62 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local62 <= 0 || (long) local62 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local62 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local62 == 0) {
						local62 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg0 >> 16);
				aByteArray20[1] = (byte) (arg0 >> 8);
				aByteArray20[2] = (byte) arg0;
				aByteArray20[3] = (byte) (local62 >> 16);
				aByteArray20[4] = (byte) (local62 >> 8);
				aByteArray20[5] = (byte) local62;
				this.method653(arg2 * 6, this.aRandomAccessFile3);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local17 = 0;
				local28 = 0;
				while (local17 < arg0) {
					@Pc(148) int local148 = 0;
					@Pc(160) int local160;
					if (arg3) {
						this.method653(local62 * 520, this.aRandomAccessFile2);
						@Pc(171) int local171;
						for (local160 = 0; local160 < 8; local160 += local171) {
							local171 = this.aRandomAccessFile2.read(aByteArray20, local160, 8 - local160);
							if (local171 == -1) {
								break;
							}
						}
						if (local160 == 8) {
							local171 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(212) int local212 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local148 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(240) int local240 = aByteArray20[7] & 0xFF;
							if (local171 != arg2 || local212 != local28 || local240 != this.anInt947) {
								return false;
							}
							if (local148 < 0 || (long) local148 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local148 == 0) {
						arg3 = false;
						local148 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local148 == 0) {
							local148++;
						}
						if (local148 == local62) {
							local148++;
						}
					}
					if (arg0 - local17 <= 512) {
						local148 = 0;
					}
					aByteArray20[0] = (byte) (arg2 >> 8);
					aByteArray20[1] = (byte) arg2;
					aByteArray20[2] = (byte) (local28 >> 8);
					aByteArray20[3] = (byte) local28;
					aByteArray20[4] = (byte) (local148 >> 16);
					aByteArray20[5] = (byte) (local148 >> 8);
					aByteArray20[6] = (byte) local148;
					aByteArray20[7] = (byte) this.anInt947;
					this.method653(local62 * 520, this.aRandomAccessFile2);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local160 = arg0 - local17;
					if (local160 > 512) {
						local160 = 512;
					}
					this.aRandomAccessFile2.write(arg1, local17, local160);
					local17 += local160;
					local62 = local148;
					local28++;
				}
				return true;
			} catch (@Pc(383) IOException local383) {
				return false;
			}
		} catch (@Pc(386) RuntimeException local386) {
			signlink.reporterror("54858, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
	private synchronized void method653(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
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
			signlink.reporterror("71709, " + arg0 + ", " + arg1 + ", " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
