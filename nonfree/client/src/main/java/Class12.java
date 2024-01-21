import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GYSQYVEV")
public final class Class12 {

	@OriginalMember(owner = "client!GYSQYVEV", name = "d", descriptor = "[B")
	private static byte[] aByteArray4 = new byte[520];

	@OriginalMember(owner = "client!GYSQYVEV", name = "a", descriptor = "I")
	private int anInt206 = -94;

	@OriginalMember(owner = "client!GYSQYVEV", name = "b", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!GYSQYVEV", name = "c", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!GYSQYVEV", name = "h", descriptor = "I")
	private int anInt208 = 65000;

	@OriginalMember(owner = "client!GYSQYVEV", name = "g", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!GYSQYVEV", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!GYSQYVEV", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!GYSQYVEV", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt207 = arg0;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg2;
			this.anInt208 = arg1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("22701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYSQYVEV", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method178(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method181(arg0 * 6, this.aRandomAccessFile2);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray4, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray4[0] & 0xFF) << 16) + ((aByteArray4[1] & 0xFF) << 8) + (aByteArray4[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray4[3] & 0xFF) << 16) + ((aByteArray4[4] & 0xFF) << 8) + (aByteArray4[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt208) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method181(local88 * 520, this.aRandomAccessFile1);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray4, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray4[0] & 0xFF) << 8) + (aByteArray4[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray4[2] & 0xFF) << 8) + (aByteArray4[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray4[4] & 0xFF) << 16) + ((aByteArray4[5] & 0xFF) << 8) + (aByteArray4[6] & 0xFF);
						@Pc(224) int local224 = aByteArray4[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt207) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray4[local251 + 8];
								}
								local88 = local218;
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
			} catch (@Pc(275) IOException local275) {
				return null;
			}
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("51473, " + arg0 + ", " + -25 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYSQYVEV", name = "a", descriptor = "(I[BII)Z")
	public synchronized boolean method179(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method180(arg2, arg1, true, arg0);
			if (!local7) {
				local7 = this.method180(arg2, arg1, false, arg0);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("12459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYSQYVEV", name = "a", descriptor = "(I[BZII)Z")
	private synchronized boolean method180(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			try {
				@Pc(66) int local66;
				@Pc(21) int local21;
				@Pc(32) int local32;
				if (arg2) {
					this.method181(arg0 * 6, this.aRandomAccessFile2);
					for (local21 = 0; local21 < 6; local21 += local32) {
						local32 = this.aRandomAccessFile2.read(aByteArray4, local21, 6 - local21);
						if (local32 == -1) {
							return false;
						}
					}
					local66 = ((aByteArray4[3] & 0xFF) << 16) + ((aByteArray4[4] & 0xFF) << 8) + (aByteArray4[5] & 0xFF);
					if (local66 <= 0 || (long) local66 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local66 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local66 == 0) {
						local66 = 1;
					}
				}
				aByteArray4[0] = (byte) (arg3 >> 16);
				aByteArray4[1] = (byte) (arg3 >> 8);
				aByteArray4[2] = (byte) arg3;
				aByteArray4[3] = (byte) (local66 >> 16);
				aByteArray4[4] = (byte) (local66 >> 8);
				aByteArray4[5] = (byte) local66;
				this.method181(arg0 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray4, 0, 6);
				local21 = 0;
				local32 = 0;
				while (local21 < arg3) {
					@Pc(152) int local152 = 0;
					@Pc(164) int local164;
					if (arg2) {
						this.method181(local66 * 520, this.aRandomAccessFile1);
						@Pc(175) int local175;
						for (local164 = 0; local164 < 8; local164 += local175) {
							local175 = this.aRandomAccessFile1.read(aByteArray4, local164, 8 - local164);
							if (local175 == -1) {
								break;
							}
						}
						if (local164 == 8) {
							local175 = ((aByteArray4[0] & 0xFF) << 8) + (aByteArray4[1] & 0xFF);
							@Pc(216) int local216 = ((aByteArray4[2] & 0xFF) << 8) + (aByteArray4[3] & 0xFF);
							local152 = ((aByteArray4[4] & 0xFF) << 16) + ((aByteArray4[5] & 0xFF) << 8) + (aByteArray4[6] & 0xFF);
							@Pc(244) int local244 = aByteArray4[7] & 0xFF;
							if (local175 != arg0 || local216 != local32 || local244 != this.anInt207) {
								return false;
							}
							if (local152 < 0 || (long) local152 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local152 == 0) {
						arg2 = false;
						local152 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local152 == 0) {
							local152++;
						}
						if (local152 == local66) {
							local152++;
						}
					}
					if (arg3 - local21 <= 512) {
						local152 = 0;
					}
					aByteArray4[0] = (byte) (arg0 >> 8);
					aByteArray4[1] = (byte) arg0;
					aByteArray4[2] = (byte) (local32 >> 8);
					aByteArray4[3] = (byte) local32;
					aByteArray4[4] = (byte) (local152 >> 16);
					aByteArray4[5] = (byte) (local152 >> 8);
					aByteArray4[6] = (byte) local152;
					aByteArray4[7] = (byte) this.anInt207;
					this.method181(local66 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray4, 0, 8);
					local164 = arg3 - local21;
					if (local164 > 512) {
						local164 = 512;
					}
					this.aRandomAccessFile1.write(arg1, local21, local164);
					local21 += local164;
					local66 = local152;
					local32++;
				}
				return true;
			} catch (@Pc(387) IOException local387) {
				return false;
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("17421, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -486 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYSQYVEV", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
	private synchronized void method181(@OriginalArg(1) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("25313, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
