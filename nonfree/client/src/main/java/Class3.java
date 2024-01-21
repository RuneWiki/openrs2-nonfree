import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ARIAIPRE")
public final class Class3 {

	@OriginalMember(owner = "client!ARIAIPRE", name = "f", descriptor = "[B")
	private static byte[] aByteArray2 = new byte[520];

	@OriginalMember(owner = "client!ARIAIPRE", name = "d", descriptor = "I")
	private int anInt5;

	@OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "I")
	private int anInt4 = 358;

	@OriginalMember(owner = "client!ARIAIPRE", name = "b", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ARIAIPRE", name = "c", descriptor = "B")
	private byte aByte2 = -9;

	@OriginalMember(owner = "client!ARIAIPRE", name = "e", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ARIAIPRE", name = "j", descriptor = "I")
	private int anInt7 = 65000;

	@OriginalMember(owner = "client!ARIAIPRE", name = "i", descriptor = "I")
	private int anInt6;

	@OriginalMember(owner = "client!ARIAIPRE", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ARIAIPRE", name = "h", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!ARIAIPRE", name = "<init>", descriptor = "(ZILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
	public Class3(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt6 = arg1;
			this.aRandomAccessFile1 = arg2;
			this.aRandomAccessFile2 = arg3;
			this.anInt7 = arg4;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("72757, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method8(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method11(arg0 * 6, this.aRandomAccessFile2);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray2, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray2[0] & 0xFF) << 16) + ((aByteArray2[1] & 0xFF) << 8) + (aByteArray2[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray2[3] & 0xFF) << 16) + ((aByteArray2[4] & 0xFF) << 8) + (aByteArray2[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt7) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method11(local88 * 520, this.aRandomAccessFile1);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray2, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray2[0] & 0xFF) << 8) + (aByteArray2[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray2[2] & 0xFF) << 8) + (aByteArray2[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray2[4] & 0xFF) << 16) + ((aByteArray2[5] & 0xFF) << 8) + (aByteArray2[6] & 0xFF);
						@Pc(224) int local224 = aByteArray2[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt6) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray2[local251 + 8];
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
			signlink.reporterror("28760, " + arg0 + ", " + 799 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "(B[BII)Z")
	public synchronized boolean method9(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) boolean local8 = this.method10(arg0, true, arg2, this.anInt4, arg1);
			if (this.aByte2 != -9) {
				throw new NullPointerException();
			}
			if (!local8) {
				local8 = this.method10(arg0, false, arg2, this.anInt4, arg1);
			}
			return local8;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("74817, " + -9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "([BZIII)Z")
	private synchronized boolean method10(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 <= 0) {
				this.aBoolean5 = !this.aBoolean5;
			}
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg1) {
					this.method11(arg2 * 6, this.aRandomAccessFile2);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile2.read(aByteArray2, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray2[3] & 0xFF) << 16) + ((aByteArray2[4] & 0xFF) << 8) + (aByteArray2[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray2[0] = (byte) (arg4 >> 16);
				aByteArray2[1] = (byte) (arg4 >> 8);
				aByteArray2[2] = (byte) arg4;
				aByteArray2[3] = (byte) (local68 >> 16);
				aByteArray2[4] = (byte) (local68 >> 8);
				aByteArray2[5] = (byte) local68;
				this.method11(arg2 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray2, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg4) {
					@Pc(154) int local154 = 0;
					@Pc(166) int local166;
					if (arg1) {
						this.method11(local68 * 520, this.aRandomAccessFile1);
						@Pc(177) int local177;
						for (local166 = 0; local166 < 8; local166 += local177) {
							local177 = this.aRandomAccessFile1.read(aByteArray2, local166, 8 - local166);
							if (local177 == -1) {
								break;
							}
						}
						if (local166 == 8) {
							local177 = ((aByteArray2[0] & 0xFF) << 8) + (aByteArray2[1] & 0xFF);
							@Pc(218) int local218 = ((aByteArray2[2] & 0xFF) << 8) + (aByteArray2[3] & 0xFF);
							local154 = ((aByteArray2[4] & 0xFF) << 16) + ((aByteArray2[5] & 0xFF) << 8) + (aByteArray2[6] & 0xFF);
							@Pc(246) int local246 = aByteArray2[7] & 0xFF;
							if (local177 != arg2 || local218 != local34 || local246 != this.anInt6) {
								return false;
							}
							if (local154 < 0 || (long) local154 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local154 == 0) {
						arg1 = false;
						local154 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local154 == 0) {
							local154++;
						}
						if (local154 == local68) {
							local154++;
						}
					}
					if (arg4 - local23 <= 512) {
						local154 = 0;
					}
					aByteArray2[0] = (byte) (arg2 >> 8);
					aByteArray2[1] = (byte) arg2;
					aByteArray2[2] = (byte) (local34 >> 8);
					aByteArray2[3] = (byte) local34;
					aByteArray2[4] = (byte) (local154 >> 16);
					aByteArray2[5] = (byte) (local154 >> 8);
					aByteArray2[6] = (byte) local154;
					aByteArray2[7] = (byte) this.anInt6;
					this.method11(local68 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray2, 0, 8);
					local166 = arg4 - local23;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local23, local166);
					local23 += local166;
					local68 = local154;
					local34++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("89177, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
	private synchronized void method11(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
		try {
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
			signlink.reporterror("36855, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
