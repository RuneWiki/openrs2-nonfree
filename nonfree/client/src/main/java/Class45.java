import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt964 = 887;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	private int anInt966 = 65000;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;IB)V")
	public Class45(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			this.anInt965 = arg3;
			@Pc(18) boolean local18 = false;
			this.aRandomAccessFile2 = arg0;
			this.aRandomAccessFile3 = arg2;
			this.anInt966 = arg1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("43459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method654(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method657(this.aRandomAccessFile3, arg0 * 6);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile3.read(aByteArray20, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt966) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method657(this.aRandomAccessFile2, local84 * 520);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile2.read(aByteArray20, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(220) int local220 = aByteArray20[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt965) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray20[local247 + 8];
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
			signlink.reporterror("83435, " + false + ", " + arg0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BBII)Z")
	public synchronized boolean method655(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) boolean local14 = this.method656(true, arg1, this.anInt963, arg2, arg0);
			if (!local14) {
				local14 = this.method656(false, arg1, this.anInt963, arg2, arg0);
			}
			return local14;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("64351, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIII[B)Z")
	private synchronized boolean method656(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			if (arg2 != 0) {
				this.aBoolean248 = !this.aBoolean248;
			}
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg0) {
					this.method657(this.aRandomAccessFile3, arg3 * 6);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile3.read(aByteArray20, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg1 >> 16);
				aByteArray20[1] = (byte) (arg1 >> 8);
				aByteArray20[2] = (byte) arg1;
				aByteArray20[3] = (byte) (local68 >> 16);
				aByteArray20[4] = (byte) (local68 >> 8);
				aByteArray20[5] = (byte) local68;
				this.method657(this.aRandomAccessFile3, arg3 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg1) {
					@Pc(154) int local154 = 0;
					@Pc(166) int local166;
					if (arg0) {
						this.method657(this.aRandomAccessFile2, local68 * 520);
						@Pc(177) int local177;
						for (local166 = 0; local166 < 8; local166 += local177) {
							local177 = this.aRandomAccessFile2.read(aByteArray20, local166, 8 - local166);
							if (local177 == -1) {
								break;
							}
						}
						if (local166 == 8) {
							local177 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(218) int local218 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local154 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(246) int local246 = aByteArray20[7] & 0xFF;
							if (local177 != arg3 || local218 != local34 || local246 != this.anInt965) {
								return false;
							}
							if (local154 < 0 || (long) local154 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local154 == 0) {
						arg0 = false;
						local154 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local154 == 0) {
							local154++;
						}
						if (local154 == local68) {
							local154++;
						}
					}
					if (arg1 - local23 <= 512) {
						local154 = 0;
					}
					aByteArray20[0] = (byte) (arg3 >> 8);
					aByteArray20[1] = (byte) arg3;
					aByteArray20[2] = (byte) (local34 >> 8);
					aByteArray20[3] = (byte) local34;
					aByteArray20[4] = (byte) (local154 >> 16);
					aByteArray20[5] = (byte) (local154 >> 8);
					aByteArray20[6] = (byte) local154;
					aByteArray20[7] = (byte) this.anInt965;
					this.method657(this.aRandomAccessFile2, local68 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local166 = arg1 - local23;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile2.write(arg4, local23, local166);
					local23 += local166;
					local68 = local154;
					local34++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("7982, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method657(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(34) Exception local34) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("78209, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
