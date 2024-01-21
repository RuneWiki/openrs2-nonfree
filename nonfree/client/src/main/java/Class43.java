import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WSLQJCTU")
public final class Class43 {

	@OriginalMember(owner = "client!WSLQJCTU", name = "d", descriptor = "[B")
	private static byte[] aByteArray18 = new byte[520];

	@OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "Z")
	private boolean aBoolean157 = true;

	@OriginalMember(owner = "client!WSLQJCTU", name = "b", descriptor = "I")
	private int anInt685 = -27531;

	@OriginalMember(owner = "client!WSLQJCTU", name = "c", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!WSLQJCTU", name = "h", descriptor = "I")
	private int anInt687 = 65000;

	@OriginalMember(owner = "client!WSLQJCTU", name = "g", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!WSLQJCTU", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!WSLQJCTU", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!WSLQJCTU", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;IZLjava/io/RandomAccessFile;)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt686 = arg2;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg1;
			this.anInt687 = arg0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("61063, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method492(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method495(this.aRandomAccessFile2, arg0 * 6, 100);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray18, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray18[0] & 0xFF) << 16) + ((aByteArray18[1] & 0xFF) << 8) + (aByteArray18[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt687) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method495(this.aRandomAccessFile1, local88 * 520, 100);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray18, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
						@Pc(224) int local224 = aByteArray18[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt686) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray18[local251 + 8];
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
			signlink.reporterror("40633, " + arg0 + ", " + 0 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method493(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anInt685 != -27531) {
				throw new NullPointerException();
			}
			@Pc(15) boolean local15 = this.method494(arg0, true, arg1, arg2);
			if (!local15) {
				local15 = this.method494(arg0, false, arg1, arg2);
			}
			return local15;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("6262, " + arg0 + ", " + -27531 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "(Z[BZII)Z")
	private synchronized boolean method494(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg1) {
					this.method495(this.aRandomAccessFile2, arg2 * 6, 100);
					for (local19 = 0; local19 < 6; local19 += local30) {
						local30 = this.aRandomAccessFile2.read(aByteArray18, local19, 6 - local19);
						if (local30 == -1) {
							return false;
						}
					}
					local64 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
					if (local64 <= 0 || (long) local64 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local64 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local64 == 0) {
						local64 = 1;
					}
				}
				aByteArray18[0] = (byte) (arg3 >> 16);
				aByteArray18[1] = (byte) (arg3 >> 8);
				aByteArray18[2] = (byte) arg3;
				aByteArray18[3] = (byte) (local64 >> 16);
				aByteArray18[4] = (byte) (local64 >> 8);
				aByteArray18[5] = (byte) local64;
				this.method495(this.aRandomAccessFile2, arg2 * 6, 100);
				this.aRandomAccessFile2.write(aByteArray18, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg3) {
					@Pc(150) int local150 = 0;
					@Pc(162) int local162;
					if (arg1) {
						this.method495(this.aRandomAccessFile1, local64 * 520, 100);
						@Pc(173) int local173;
						for (local162 = 0; local162 < 8; local162 += local173) {
							local173 = this.aRandomAccessFile1.read(aByteArray18, local162, 8 - local162);
							if (local173 == -1) {
								break;
							}
						}
						if (local162 == 8) {
							local173 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
							@Pc(214) int local214 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
							local150 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
							@Pc(242) int local242 = aByteArray18[7] & 0xFF;
							if (local173 != arg2 || local214 != local30 || local242 != this.anInt686) {
								return false;
							}
							if (local150 < 0 || (long) local150 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local150 == 0) {
						arg1 = false;
						local150 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local150 == 0) {
							local150++;
						}
						if (local150 == local64) {
							local150++;
						}
					}
					if (arg3 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray18[0] = (byte) (arg2 >> 8);
					aByteArray18[1] = (byte) arg2;
					aByteArray18[2] = (byte) (local30 >> 8);
					aByteArray18[3] = (byte) local30;
					aByteArray18[4] = (byte) (local150 >> 16);
					aByteArray18[5] = (byte) (local150 >> 8);
					aByteArray18[6] = (byte) local150;
					aByteArray18[7] = (byte) this.anInt686;
					this.method495(this.aRandomAccessFile1, local64 * 520, 100);
					this.aRandomAccessFile1.write(aByteArray18, 0, 8);
					local162 = arg3 - local19;
					if (local162 > 512) {
						local162 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local19, local162);
					local19 += local162;
					local64 = local150;
					local30++;
				}
				return true;
			} catch (@Pc(385) IOException local385) {
				return false;
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("64184, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method495(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
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
			@Pc(33) boolean local33 = false;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("3675, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}
}
