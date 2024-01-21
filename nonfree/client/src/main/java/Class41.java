import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VXBCLRCG")
public final class Class41 {

	@OriginalMember(owner = "client!VXBCLRCG", name = "c", descriptor = "[B")
	private static byte[] aByteArray18 = new byte[520];

	@OriginalMember(owner = "client!VXBCLRCG", name = "b", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!VXBCLRCG", name = "h", descriptor = "I")
	private int anInt730 = 65000;

	@OriginalMember(owner = "client!VXBCLRCG", name = "g", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!VXBCLRCG", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!VXBCLRCG", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!VXBCLRCG", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
	public Class41(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt729 = arg1;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg0;
			this.anInt730 = arg2;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("14326, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(BI)[B")
	public synchronized byte[] method492(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method495(this.aRandomAccessFile2, this.aBoolean178, arg0 * 6);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray18, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray18[0] & 0xFF) << 16) + ((aByteArray18[1] & 0xFF) << 8) + (aByteArray18[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt730) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method495(this.aRandomAccessFile1, this.aBoolean178, local85 * 520);
						local18 = 0;
						@Pc(134) int local134 = local29 - local111;
						if (local134 > 512) {
							local134 = 512;
						}
						@Pc(152) int local152;
						while (local18 < local134 + 8) {
							local152 = this.aRandomAccessFile1.read(aByteArray18, local18, local134 + 8 - local18);
							if (local152 == -1) {
								return null;
							}
							local18 += local152;
						}
						local152 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
						@Pc(194) int local194 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
						@Pc(216) int local216 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
						@Pc(222) int local222 = aByteArray18[7] & 0xFF;
						if (local152 == arg0 && local194 == local113 && local222 == this.anInt729) {
							if (local216 >= 0 && (long) local216 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(249) int local249 = 0; local249 < local134; local249++) {
									local109[local111++] = aByteArray18[local249 + 8];
								}
								local85 = local216;
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
			} catch (@Pc(273) IOException local273) {
				return null;
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("79804, " + -11 + ", " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(II[BI)Z")
	public synchronized boolean method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(16) boolean local16 = this.method494(arg0, true, arg2, arg1);
			if (!local16) {
				local16 = this.method494(arg0, false, arg2, arg1);
			}
			return local16;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("22587, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(IIZ[BI)Z")
	private synchronized boolean method494(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg1) {
					this.method495(this.aRandomAccessFile2, this.aBoolean178, arg0 * 6);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile2.read(aByteArray18, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray18[0] = (byte) (arg3 >> 16);
				aByteArray18[1] = (byte) (arg3 >> 8);
				aByteArray18[2] = (byte) arg3;
				aByteArray18[3] = (byte) (local68 >> 16);
				aByteArray18[4] = (byte) (local68 >> 8);
				aByteArray18[5] = (byte) local68;
				this.method495(this.aRandomAccessFile2, this.aBoolean178, arg0 * 6);
				this.aRandomAccessFile2.write(aByteArray18, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg3) {
					@Pc(155) int local155 = 0;
					@Pc(168) int local168;
					if (arg1) {
						this.method495(this.aRandomAccessFile1, this.aBoolean178, local68 * 520);
						@Pc(179) int local179;
						for (local168 = 0; local168 < 8; local168 += local179) {
							local179 = this.aRandomAccessFile1.read(aByteArray18, local168, 8 - local168);
							if (local179 == -1) {
								break;
							}
						}
						if (local168 == 8) {
							local179 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
							@Pc(220) int local220 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
							local155 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
							@Pc(248) int local248 = aByteArray18[7] & 0xFF;
							if (local179 != arg0 || local220 != local34 || local248 != this.anInt729) {
								return false;
							}
							if (local155 < 0 || (long) local155 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local155 == 0) {
						arg1 = false;
						local155 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local155 == 0) {
							local155++;
						}
						if (local155 == local68) {
							local155++;
						}
					}
					if (arg3 - local23 <= 512) {
						local155 = 0;
					}
					aByteArray18[0] = (byte) (arg0 >> 8);
					aByteArray18[1] = (byte) arg0;
					aByteArray18[2] = (byte) (local34 >> 8);
					aByteArray18[3] = (byte) local34;
					aByteArray18[4] = (byte) (local155 >> 16);
					aByteArray18[5] = (byte) (local155 >> 8);
					aByteArray18[6] = (byte) local155;
					aByteArray18[7] = (byte) this.anInt729;
					this.method495(this.aRandomAccessFile1, this.aBoolean178, local68 * 520);
					this.aRandomAccessFile1.write(aByteArray18, 0, 8);
					local168 = arg3 - local23;
					if (local168 > 512) {
						local168 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local23, local168);
					local23 += local168;
					local68 = local155;
					local34++;
				}
				return true;
			} catch (@Pc(392) IOException local392) {
				return false;
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("19901, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(Ljava/io/RandomAccessFile;ZI)V")
	private synchronized void method495(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (!arg1) {
				this.anInt728 = 98;
			}
			if (arg2 < 0 || arg2 > 62914560) {
				System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
				arg2 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(29) Exception local29) {
				}
			}
			arg0.seek((long) arg2);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("14100, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
