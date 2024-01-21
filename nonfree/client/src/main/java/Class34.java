import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SJIXUDLP")
public final class Class34 {

	@OriginalMember(owner = "client!SJIXUDLP", name = "e", descriptor = "[B")
	private static byte[] aByteArray16 = new byte[520];

	@OriginalMember(owner = "client!SJIXUDLP", name = "a", descriptor = "I")
	private int anInt599 = 16191;

	@OriginalMember(owner = "client!SJIXUDLP", name = "b", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!SJIXUDLP", name = "c", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!SJIXUDLP", name = "d", descriptor = "I")
	private int anInt600 = 1;

	@OriginalMember(owner = "client!SJIXUDLP", name = "i", descriptor = "I")
	private int anInt602 = 65000;

	@OriginalMember(owner = "client!SJIXUDLP", name = "h", descriptor = "I")
	private int anInt601;

	@OriginalMember(owner = "client!SJIXUDLP", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!SJIXUDLP", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!SJIXUDLP", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;I)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt601 = arg2;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg1;
			this.anInt602 = arg0;
			if (arg4 != 22279) {
				throw new NullPointerException();
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("74205, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJIXUDLP", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method486(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt599 != 16191) {
				this.anInt600 = 416;
			}
			try {
				this.method489(arg0 * 6, this.aRandomAccessFile2);
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
				if (local29 < 0 || local29 > this.anInt602) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method489(local85 * 520, this.aRandomAccessFile1);
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
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt601) {
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
			signlink.reporterror("21694, " + arg0 + ", " + 16191 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJIXUDLP", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method487(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) boolean local7 = this.method488(arg1, true, arg0, arg3);
			@Pc(11) boolean local11 = false;
			if (!local7) {
				local7 = this.method488(arg1, false, arg0, arg3);
			}
			return local7;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9628, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJIXUDLP", name = "a", descriptor = "(IBZ[BI)Z")
	private synchronized boolean method488(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg1) {
					this.method489(arg0 * 6, this.aRandomAccessFile2);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile2.read(aByteArray16, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray16[3] & 0xFF) << 16) + ((aByteArray16[4] & 0xFF) << 8) + (aByteArray16[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray16[0] = (byte) (arg3 >> 16);
				aByteArray16[1] = (byte) (arg3 >> 8);
				aByteArray16[2] = (byte) arg3;
				aByteArray16[3] = (byte) (local68 >> 16);
				aByteArray16[4] = (byte) (local68 >> 8);
				aByteArray16[5] = (byte) local68;
				this.method489(arg0 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray16, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg3) {
					@Pc(154) int local154 = 0;
					@Pc(166) int local166;
					if (arg1) {
						this.method489(local68 * 520, this.aRandomAccessFile1);
						@Pc(177) int local177;
						for (local166 = 0; local166 < 8; local166 += local177) {
							local177 = this.aRandomAccessFile1.read(aByteArray16, local166, 8 - local166);
							if (local177 == -1) {
								break;
							}
						}
						if (local166 == 8) {
							local177 = ((aByteArray16[0] & 0xFF) << 8) + (aByteArray16[1] & 0xFF);
							@Pc(218) int local218 = ((aByteArray16[2] & 0xFF) << 8) + (aByteArray16[3] & 0xFF);
							local154 = ((aByteArray16[4] & 0xFF) << 16) + ((aByteArray16[5] & 0xFF) << 8) + (aByteArray16[6] & 0xFF);
							@Pc(246) int local246 = aByteArray16[7] & 0xFF;
							if (local177 != arg0 || local218 != local34 || local246 != this.anInt601) {
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
					if (arg3 - local23 <= 512) {
						local154 = 0;
					}
					aByteArray16[0] = (byte) (arg0 >> 8);
					aByteArray16[1] = (byte) arg0;
					aByteArray16[2] = (byte) (local34 >> 8);
					aByteArray16[3] = (byte) local34;
					aByteArray16[4] = (byte) (local154 >> 16);
					aByteArray16[5] = (byte) (local154 >> 8);
					aByteArray16[6] = (byte) local154;
					aByteArray16[7] = (byte) this.anInt601;
					this.method489(local68 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray16, 0, 8);
					local166 = arg3 - local23;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local23, local166);
					local23 += local166;
					local68 = local154;
					local34++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("57589, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJIXUDLP", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
	private synchronized void method489(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
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
			signlink.reporterror("79809, " + arg0 + ", " + arg1 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
