import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QQNRPAWO")
public final class Class34 {

	@OriginalMember(owner = "client!QQNRPAWO", name = "c", descriptor = "[B")
	private static byte[] aByteArray15 = new byte[520];

	@OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "I")
	private int anInt648 = -30470;

	@OriginalMember(owner = "client!QQNRPAWO", name = "b", descriptor = "Z")
	private boolean aBoolean134 = true;

	@OriginalMember(owner = "client!QQNRPAWO", name = "h", descriptor = "I")
	private int anInt650 = 65000;

	@OriginalMember(owner = "client!QQNRPAWO", name = "g", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!QQNRPAWO", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!QQNRPAWO", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!QQNRPAWO", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
	public Class34(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt649 = arg1;
			this.aRandomAccessFile1 = arg4;
			@Pc(20) int local20 = 67 / arg3;
			this.aRandomAccessFile2 = arg0;
			this.anInt650 = arg2;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("14940, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				this.method439(arg1 * 6, this.aRandomAccessFile2);
				@Pc(15) int local15;
				@Pc(26) int local26;
				for (local15 = 0; local15 < 6; local15 += local26) {
					local26 = this.aRandomAccessFile2.read(aByteArray15, local15, 6 - local15);
					if (local26 == -1) {
						return null;
					}
				}
				local26 = ((aByteArray15[0] & 0xFF) << 16) + ((aByteArray15[1] & 0xFF) << 8) + (aByteArray15[2] & 0xFF);
				@Pc(82) int local82 = ((aByteArray15[3] & 0xFF) << 16) + ((aByteArray15[4] & 0xFF) << 8) + (aByteArray15[5] & 0xFF);
				if (local26 < 0 || local26 > this.anInt650) {
					return null;
				} else if (local82 > 0 && (long) local82 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(106) byte[] local106 = new byte[local26];
					@Pc(108) int local108 = 0;
					@Pc(110) int local110 = 0;
					while (local108 < local26) {
						if (local82 == 0) {
							return null;
						}
						this.method439(local82 * 520, this.aRandomAccessFile1);
						local15 = 0;
						@Pc(130) int local130 = local26 - local108;
						if (local130 > 512) {
							local130 = 512;
						}
						@Pc(148) int local148;
						while (local15 < local130 + 8) {
							local148 = this.aRandomAccessFile1.read(aByteArray15, local15, local130 + 8 - local15);
							if (local148 == -1) {
								return null;
							}
							local15 += local148;
						}
						local148 = ((aByteArray15[0] & 0xFF) << 8) + (aByteArray15[1] & 0xFF);
						@Pc(190) int local190 = ((aByteArray15[2] & 0xFF) << 8) + (aByteArray15[3] & 0xFF);
						@Pc(212) int local212 = ((aByteArray15[4] & 0xFF) << 16) + ((aByteArray15[5] & 0xFF) << 8) + (aByteArray15[6] & 0xFF);
						@Pc(218) int local218 = aByteArray15[7] & 0xFF;
						if (local148 == arg1 && local190 == local110 && local218 == this.anInt649) {
							if (local212 >= 0 && (long) local212 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(245) int local245 = 0; local245 < local130; local245++) {
									local106[local108++] = aByteArray15[local245 + 8];
								}
								local82 = local212;
								local110++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local106;
				} else {
					return null;
				}
			} catch (@Pc(269) IOException local269) {
				return null;
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("95278, " + arg0 + ", " + arg1 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(III[B)Z")
	public synchronized boolean method437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(7) boolean local7 = this.method438(arg1, true, arg0, arg2);
			if (!local7) {
				local7 = this.method438(arg1, false, arg0, arg2);
			}
			return local7;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("74668, " + arg0 + ", " + 192 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(IIZI[B)Z")
	private synchronized boolean method438(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(63) int local63;
				@Pc(18) int local18;
				@Pc(29) int local29;
				if (arg1) {
					this.method439(arg2 * 6, this.aRandomAccessFile2);
					for (local18 = 0; local18 < 6; local18 += local29) {
						local29 = this.aRandomAccessFile2.read(aByteArray15, local18, 6 - local18);
						if (local29 == -1) {
							return false;
						}
					}
					local63 = ((aByteArray15[3] & 0xFF) << 16) + ((aByteArray15[4] & 0xFF) << 8) + (aByteArray15[5] & 0xFF);
					if (local63 <= 0 || (long) local63 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local63 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local63 == 0) {
						local63 = 1;
					}
				}
				aByteArray15[0] = (byte) (arg0 >> 16);
				aByteArray15[1] = (byte) (arg0 >> 8);
				aByteArray15[2] = (byte) arg0;
				aByteArray15[3] = (byte) (local63 >> 16);
				aByteArray15[4] = (byte) (local63 >> 8);
				aByteArray15[5] = (byte) local63;
				this.method439(arg2 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray15, 0, 6);
				local18 = 0;
				local29 = 0;
				while (local18 < arg0) {
					@Pc(149) int local149 = 0;
					@Pc(161) int local161;
					if (arg1) {
						this.method439(local63 * 520, this.aRandomAccessFile1);
						@Pc(172) int local172;
						for (local161 = 0; local161 < 8; local161 += local172) {
							local172 = this.aRandomAccessFile1.read(aByteArray15, local161, 8 - local161);
							if (local172 == -1) {
								break;
							}
						}
						if (local161 == 8) {
							local172 = ((aByteArray15[0] & 0xFF) << 8) + (aByteArray15[1] & 0xFF);
							@Pc(213) int local213 = ((aByteArray15[2] & 0xFF) << 8) + (aByteArray15[3] & 0xFF);
							local149 = ((aByteArray15[4] & 0xFF) << 16) + ((aByteArray15[5] & 0xFF) << 8) + (aByteArray15[6] & 0xFF);
							@Pc(241) int local241 = aByteArray15[7] & 0xFF;
							if (local172 != arg2 || local213 != local29 || local241 != this.anInt649) {
								return false;
							}
							if (local149 < 0 || (long) local149 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local149 == 0) {
						arg1 = false;
						local149 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local149 == 0) {
							local149++;
						}
						if (local149 == local63) {
							local149++;
						}
					}
					if (arg0 - local18 <= 512) {
						local149 = 0;
					}
					aByteArray15[0] = (byte) (arg2 >> 8);
					aByteArray15[1] = (byte) arg2;
					aByteArray15[2] = (byte) (local29 >> 8);
					aByteArray15[3] = (byte) local29;
					aByteArray15[4] = (byte) (local149 >> 16);
					aByteArray15[5] = (byte) (local149 >> 8);
					aByteArray15[6] = (byte) local149;
					aByteArray15[7] = (byte) this.anInt649;
					this.method439(local63 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray15, 0, 8);
					local161 = arg0 - local18;
					if (local161 > 512) {
						local161 = 512;
					}
					this.aRandomAccessFile1.write(arg3, local18, local161);
					local18 += local161;
					local63 = local149;
					local29++;
				}
				return true;
			} catch (@Pc(384) IOException local384) {
				return false;
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("69061, " + arg0 + ", " + -752 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
	private synchronized void method439(@OriginalArg(0) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(35) Exception local35) {
				}
			}
			arg1.seek((long) arg0);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("48160, " + arg0 + ", " + 4848 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
