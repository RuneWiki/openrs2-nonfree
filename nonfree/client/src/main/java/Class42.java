import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UZKSGXIW")
public final class Class42 {

	@OriginalMember(owner = "client!UZKSGXIW", name = "d", descriptor = "[B")
	private static byte[] aByteArray19 = new byte[520];

	@OriginalMember(owner = "client!UZKSGXIW", name = "a", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!UZKSGXIW", name = "b", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!UZKSGXIW", name = "c", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!UZKSGXIW", name = "h", descriptor = "I")
	private int anInt679 = 65000;

	@OriginalMember(owner = "client!UZKSGXIW", name = "g", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!UZKSGXIW", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!UZKSGXIW", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!UZKSGXIW", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ZILjava/io/RandomAccessFile;)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt678 = arg3;
			this.aRandomAccessFile1 = arg1;
			this.aRandomAccessFile2 = arg4;
			this.anInt679 = arg0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("48735, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZKSGXIW", name = "a", descriptor = "(IZ)[B")
	public synchronized byte[] method473(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aBoolean181 = !this.aBoolean181;
			}
			try {
				this.method476(this.aRandomAccessFile2, arg0 * 6);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray19, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray19[0] & 0xFF) << 16) + ((aByteArray19[1] & 0xFF) << 8) + (aByteArray19[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray19[3] & 0xFF) << 16) + ((aByteArray19[4] & 0xFF) << 8) + (aByteArray19[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt679) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method476(this.aRandomAccessFile1, local88 * 520);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray19, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray19[0] & 0xFF) << 8) + (aByteArray19[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray19[2] & 0xFF) << 8) + (aByteArray19[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray19[4] & 0xFF) << 16) + ((aByteArray19[5] & 0xFF) << 8) + (aByteArray19[6] & 0xFF);
						@Pc(224) int local224 = aByteArray19[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt678) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray19[local251 + 8];
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
			signlink.reporterror("66598, " + arg0 + ", " + arg1 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZKSGXIW", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method474(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(19) boolean local19 = this.method475(true, (byte) 8, arg1, arg0, arg2);
			if (!local19) {
				local19 = this.method475(false, (byte) 8, arg1, arg0, arg2);
			}
			return local19;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("97934, " + arg0 + ", " + arg1 + ", " + -737 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZKSGXIW", name = "a", descriptor = "(ZBI[BI)Z")
	private synchronized boolean method475(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(72) int local72;
				@Pc(27) int local27;
				@Pc(38) int local38;
				if (arg0) {
					this.method476(this.aRandomAccessFile2, arg2 * 6);
					for (local27 = 0; local27 < 6; local27 += local38) {
						local38 = this.aRandomAccessFile2.read(aByteArray19, local27, 6 - local27);
						if (local38 == -1) {
							return false;
						}
					}
					local72 = ((aByteArray19[3] & 0xFF) << 16) + ((aByteArray19[4] & 0xFF) << 8) + (aByteArray19[5] & 0xFF);
					if (local72 <= 0 || (long) local72 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local72 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				aByteArray19[0] = (byte) (arg4 >> 16);
				aByteArray19[1] = (byte) (arg4 >> 8);
				aByteArray19[2] = (byte) arg4;
				aByteArray19[3] = (byte) (local72 >> 16);
				aByteArray19[4] = (byte) (local72 >> 8);
				aByteArray19[5] = (byte) local72;
				this.method476(this.aRandomAccessFile2, arg2 * 6);
				this.aRandomAccessFile2.write(aByteArray19, 0, 6);
				local27 = 0;
				local38 = 0;
				while (local27 < arg4) {
					@Pc(158) int local158 = 0;
					@Pc(170) int local170;
					if (arg0) {
						this.method476(this.aRandomAccessFile1, local72 * 520);
						@Pc(181) int local181;
						for (local170 = 0; local170 < 8; local170 += local181) {
							local181 = this.aRandomAccessFile1.read(aByteArray19, local170, 8 - local170);
							if (local181 == -1) {
								break;
							}
						}
						if (local170 == 8) {
							local181 = ((aByteArray19[0] & 0xFF) << 8) + (aByteArray19[1] & 0xFF);
							@Pc(222) int local222 = ((aByteArray19[2] & 0xFF) << 8) + (aByteArray19[3] & 0xFF);
							local158 = ((aByteArray19[4] & 0xFF) << 16) + ((aByteArray19[5] & 0xFF) << 8) + (aByteArray19[6] & 0xFF);
							@Pc(250) int local250 = aByteArray19[7] & 0xFF;
							if (local181 != arg2 || local222 != local38 || local250 != this.anInt678) {
								return false;
							}
							if (local158 < 0 || (long) local158 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local158 == 0) {
						arg0 = false;
						local158 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local158 == 0) {
							local158++;
						}
						if (local158 == local72) {
							local158++;
						}
					}
					if (arg4 - local27 <= 512) {
						local158 = 0;
					}
					aByteArray19[0] = (byte) (arg2 >> 8);
					aByteArray19[1] = (byte) arg2;
					aByteArray19[2] = (byte) (local38 >> 8);
					aByteArray19[3] = (byte) local38;
					aByteArray19[4] = (byte) (local158 >> 16);
					aByteArray19[5] = (byte) (local158 >> 8);
					aByteArray19[6] = (byte) local158;
					aByteArray19[7] = (byte) this.anInt678;
					this.method476(this.aRandomAccessFile1, local72 * 520);
					this.aRandomAccessFile1.write(aByteArray19, 0, 8);
					local170 = arg4 - local27;
					if (local170 > 512) {
						local170 = 512;
					}
					this.aRandomAccessFile1.write(arg3, local27, local170);
					local27 += local170;
					local72 = local158;
					local38++;
				}
				return true;
			} catch (@Pc(393) IOException local393) {
				return false;
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("44466, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZKSGXIW", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method476(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1) throws IOException {
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
			signlink.reporterror("49379, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
