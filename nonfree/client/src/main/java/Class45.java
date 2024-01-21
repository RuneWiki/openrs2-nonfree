import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean254 = true;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt966 = 65000;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
	public Class45(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt965 = arg2;
			this.aRandomAccessFile2 = arg0;
			this.aRandomAccessFile3 = arg3;
			this.anInt966 = arg1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("68653, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method658(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method661(arg0 * 6, this.aRandomAccessFile3, this.aBoolean254);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile3.read(aByteArray20, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt966) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method661(local88 * 520, this.aRandomAccessFile2, this.aBoolean254);
						local21 = 0;
						@Pc(137) int local137 = local32 - local114;
						if (local137 > 512) {
							local137 = 512;
						}
						@Pc(155) int local155;
						while (local21 < local137 + 8) {
							local155 = this.aRandomAccessFile2.read(aByteArray20, local21, local137 + 8 - local21);
							if (local155 == -1) {
								return null;
							}
							local21 += local155;
						}
						local155 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(197) int local197 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(219) int local219 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(225) int local225 = aByteArray20[7] & 0xFF;
						if (local155 == arg0 && local197 == local116 && local225 == this.anInt965) {
							if (local219 >= 0 && (long) local219 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(252) int local252 = 0; local252 < local137; local252++) {
									local112[local114++] = aByteArray20[local252 + 8];
								}
								local88 = local219;
								local116++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local112;
				} else {
					return null;
				}
			} catch (@Pc(276) IOException local276) {
				return null;
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("87266, " + false + ", " + arg0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[B)Z")
	public synchronized boolean method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(7) boolean local7 = this.method660(arg2, arg0, arg1, true);
			if (!local7) {
				local7 = this.method660(arg2, arg0, arg1, false);
			}
			return local7;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("28853, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIIZB)Z")
	private synchronized boolean method660(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			try {
				@Pc(66) int local66;
				@Pc(21) int local21;
				@Pc(32) int local32;
				if (arg3) {
					this.method661(arg2 * 6, this.aRandomAccessFile3, this.aBoolean254);
					for (local21 = 0; local21 < 6; local21 += local32) {
						local32 = this.aRandomAccessFile3.read(aByteArray20, local21, 6 - local21);
						if (local32 == -1) {
							return false;
						}
					}
					local66 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local66 <= 0 || (long) local66 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local66 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local66 == 0) {
						local66 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg1 >> 16);
				aByteArray20[1] = (byte) (arg1 >> 8);
				aByteArray20[2] = (byte) arg1;
				aByteArray20[3] = (byte) (local66 >> 16);
				aByteArray20[4] = (byte) (local66 >> 8);
				aByteArray20[5] = (byte) local66;
				this.method661(arg2 * 6, this.aRandomAccessFile3, this.aBoolean254);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local21 = 0;
				local32 = 0;
				while (local21 < arg1) {
					@Pc(153) int local153 = 0;
					@Pc(166) int local166;
					if (arg3) {
						this.method661(local66 * 520, this.aRandomAccessFile2, this.aBoolean254);
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
							local153 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(246) int local246 = aByteArray20[7] & 0xFF;
							if (local177 != arg2 || local218 != local32 || local246 != this.anInt965) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg3 = false;
						local153 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local153 == 0) {
							local153++;
						}
						if (local153 == local66) {
							local153++;
						}
					}
					if (arg1 - local21 <= 512) {
						local153 = 0;
					}
					aByteArray20[0] = (byte) (arg2 >> 8);
					aByteArray20[1] = (byte) arg2;
					aByteArray20[2] = (byte) (local32 >> 8);
					aByteArray20[3] = (byte) local32;
					aByteArray20[4] = (byte) (local153 >> 16);
					aByteArray20[5] = (byte) (local153 >> 8);
					aByteArray20[6] = (byte) local153;
					aByteArray20[7] = (byte) this.anInt965;
					this.method661(local66 * 520, this.aRandomAccessFile2, this.aBoolean254);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local166 = arg1 - local21;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile2.write(arg0, local21, local166);
					local21 += local166;
					local66 = local153;
					local32++;
				}
				return true;
			} catch (@Pc(390) IOException local390) {
				return false;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("48590, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
	private synchronized void method661(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) boolean arg2) throws IOException {
		try {
			if (!arg2) {
				this.anInt964 = 426;
			}
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(29) Exception local29) {
				}
			}
			arg1.seek((long) arg0);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("55820, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
