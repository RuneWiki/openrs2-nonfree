import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PJMJGLFE")
public final class Class34 {

	@OriginalMember(owner = "client!PJMJGLFE", name = "c", descriptor = "[B")
	private static byte[] aByteArray16 = new byte[520];

	@OriginalMember(owner = "client!PJMJGLFE", name = "a", descriptor = "I")
	private int anInt630 = 22486;

	@OriginalMember(owner = "client!PJMJGLFE", name = "b", descriptor = "I")
	private int anInt631 = 8;

	@OriginalMember(owner = "client!PJMJGLFE", name = "g", descriptor = "I")
	private int anInt633 = 65000;

	@OriginalMember(owner = "client!PJMJGLFE", name = "f", descriptor = "I")
	private int anInt632;

	@OriginalMember(owner = "client!PJMJGLFE", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!PJMJGLFE", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!PJMJGLFE", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt632 = arg3;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg2;
			this.anInt633 = arg1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("96848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJMJGLFE", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method415(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt630 != 22486) {
				this.anInt630 = -74;
			}
			try {
				this.method418(arg0 * 6, this.aRandomAccessFile2);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray16, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray16[0] & 0xFF) << 16) + ((aByteArray16[1] & 0xFF) << 8) + (aByteArray16[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray16[3] & 0xFF) << 16) + ((aByteArray16[4] & 0xFF) << 8) + (aByteArray16[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt633) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method418(local85 * 520, this.aRandomAccessFile1);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray16, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray16[0] & 0xFF) << 8) + (aByteArray16[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray16[2] & 0xFF) << 8) + (aByteArray16[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray16[4] & 0xFF) << 16) + ((aByteArray16[5] & 0xFF) << 8) + (aByteArray16[6] & 0xFF);
						@Pc(221) int local221 = aByteArray16[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt632) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray16[local248 + 8];
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
			signlink.reporterror("26833, " + arg0 + ", " + 22486 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJMJGLFE", name = "a", descriptor = "(II[BZ)Z")
	public synchronized boolean method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (!arg3) {
				throw new NullPointerException();
			}
			@Pc(13) boolean local13 = this.method417(arg1, arg0, true, arg2);
			if (!local13) {
				local13 = this.method417(arg1, arg0, false, arg2);
			}
			return local13;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("66760, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJMJGLFE", name = "a", descriptor = "(IIIZ[B)Z")
	private synchronized boolean method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		try {
			@Pc(11) int local11;
			if (this.anInt631 > 8 || this.anInt631 < 8) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			try {
				@Pc(28) int local28;
				@Pc(39) int local39;
				if (arg2) {
					this.method418(arg1 * 6, this.aRandomAccessFile2);
					for (local28 = 0; local28 < 6; local28 += local39) {
						local39 = this.aRandomAccessFile2.read(aByteArray16, local28, 6 - local28);
						if (local39 == -1) {
							return false;
						}
					}
					local11 = ((aByteArray16[3] & 0xFF) << 16) + ((aByteArray16[4] & 0xFF) << 8) + (aByteArray16[5] & 0xFF);
					if (local11 <= 0 || (long) local11 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local11 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local11 == 0) {
						local11 = 1;
					}
				}
				aByteArray16[0] = (byte) (arg0 >> 16);
				aByteArray16[1] = (byte) (arg0 >> 8);
				aByteArray16[2] = (byte) arg0;
				aByteArray16[3] = (byte) (local11 >> 16);
				aByteArray16[4] = (byte) (local11 >> 8);
				aByteArray16[5] = (byte) local11;
				this.method418(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray16, 0, 6);
				local28 = 0;
				local39 = 0;
				while (local28 < arg0) {
					@Pc(159) int local159 = 0;
					@Pc(171) int local171;
					if (arg2) {
						this.method418(local11 * 520, this.aRandomAccessFile1);
						@Pc(182) int local182;
						for (local171 = 0; local171 < 8; local171 += local182) {
							local182 = this.aRandomAccessFile1.read(aByteArray16, local171, 8 - local171);
							if (local182 == -1) {
								break;
							}
						}
						if (local171 == 8) {
							local182 = ((aByteArray16[0] & 0xFF) << 8) + (aByteArray16[1] & 0xFF);
							@Pc(223) int local223 = ((aByteArray16[2] & 0xFF) << 8) + (aByteArray16[3] & 0xFF);
							local159 = ((aByteArray16[4] & 0xFF) << 16) + ((aByteArray16[5] & 0xFF) << 8) + (aByteArray16[6] & 0xFF);
							@Pc(251) int local251 = aByteArray16[7] & 0xFF;
							if (local182 != arg1 || local223 != local39 || local251 != this.anInt632) {
								return false;
							}
							if (local159 < 0 || (long) local159 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local159 == 0) {
						arg2 = false;
						local159 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local159 == 0) {
							local159++;
						}
						if (local159 == local11) {
							local159++;
						}
					}
					if (arg0 - local28 <= 512) {
						local159 = 0;
					}
					aByteArray16[0] = (byte) (arg1 >> 8);
					aByteArray16[1] = (byte) arg1;
					aByteArray16[2] = (byte) (local39 >> 8);
					aByteArray16[3] = (byte) local39;
					aByteArray16[4] = (byte) (local159 >> 16);
					aByteArray16[5] = (byte) (local159 >> 8);
					aByteArray16[6] = (byte) local159;
					aByteArray16[7] = (byte) this.anInt632;
					this.method418(local11 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray16, 0, 8);
					local171 = arg0 - local28;
					if (local171 > 512) {
						local171 = 512;
					}
					this.aRandomAccessFile1.write(arg3, local28, local171);
					local28 += local171;
					local11 = local159;
					local39++;
				}
				return true;
			} catch (@Pc(394) IOException local394) {
				return false;
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("38730, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJMJGLFE", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
	private synchronized void method418(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(28) Exception local28) {
				}
			}
			arg1.seek((long) arg0);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("37096, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}
}
