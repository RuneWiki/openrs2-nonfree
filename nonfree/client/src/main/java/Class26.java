import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MMZHRHUG")
public final class Class26 {

	@OriginalMember(owner = "client!MMZHRHUG", name = "a", descriptor = "[B")
	private static byte[] aByteArray10 = new byte[520];

	@OriginalMember(owner = "client!MMZHRHUG", name = "e", descriptor = "I")
	private int anInt481 = 65000;

	@OriginalMember(owner = "client!MMZHRHUG", name = "d", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "client!MMZHRHUG", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!MMZHRHUG", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!MMZHRHUG", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;IILjava/io/RandomAccessFile;)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt480 = arg0;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg1;
			this.anInt481 = arg2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("70886, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMZHRHUG", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				this.method338(arg1 * 6, this.aRandomAccessFile2);
				@Pc(15) int local15;
				@Pc(26) int local26;
				for (local15 = 0; local15 < 6; local15 += local26) {
					local26 = this.aRandomAccessFile2.read(aByteArray10, local15, 6 - local15);
					if (local26 == -1) {
						return null;
					}
				}
				local26 = ((aByteArray10[0] & 0xFF) << 16) + ((aByteArray10[1] & 0xFF) << 8) + (aByteArray10[2] & 0xFF);
				@Pc(82) int local82 = ((aByteArray10[3] & 0xFF) << 16) + ((aByteArray10[4] & 0xFF) << 8) + (aByteArray10[5] & 0xFF);
				if (local26 < 0 || local26 > this.anInt481) {
					return null;
				} else if (local82 > 0 && (long) local82 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(106) byte[] local106 = new byte[local26];
					@Pc(108) int local108 = 0;
					@Pc(110) int local110 = 0;
					while (local108 < local26) {
						if (local82 == 0) {
							return null;
						}
						this.method338(local82 * 520, this.aRandomAccessFile1);
						local15 = 0;
						@Pc(130) int local130 = local26 - local108;
						if (local130 > 512) {
							local130 = 512;
						}
						@Pc(148) int local148;
						while (local15 < local130 + 8) {
							local148 = this.aRandomAccessFile1.read(aByteArray10, local15, local130 + 8 - local15);
							if (local148 == -1) {
								return null;
							}
							local15 += local148;
						}
						local148 = ((aByteArray10[0] & 0xFF) << 8) + (aByteArray10[1] & 0xFF);
						@Pc(190) int local190 = ((aByteArray10[2] & 0xFF) << 8) + (aByteArray10[3] & 0xFF);
						@Pc(212) int local212 = ((aByteArray10[4] & 0xFF) << 16) + ((aByteArray10[5] & 0xFF) << 8) + (aByteArray10[6] & 0xFF);
						@Pc(218) int local218 = aByteArray10[7] & 0xFF;
						if (local148 == arg1 && local190 == local110 && local218 == this.anInt480) {
							if (local212 >= 0 && (long) local212 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(245) int local245 = 0; local245 < local130; local245++) {
									local106[local108++] = aByteArray10[local245 + 8];
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
			signlink.reporterror("4997, " + arg0 + ", " + arg1 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMZHRHUG", name = "a", descriptor = "(IBI[B)Z")
	public synchronized boolean method336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(14) boolean local14 = this.method337(arg2, arg0, arg1, true);
			if (!local14) {
				local14 = this.method337(arg2, arg0, arg1, false);
			}
			return local14;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("28741, " + arg0 + ", " + -41 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMZHRHUG", name = "a", descriptor = "([BIIIZ)Z")
	private synchronized boolean method337(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			try {
				@Pc(65) int local65;
				@Pc(20) int local20;
				@Pc(31) int local31;
				if (arg3) {
					this.method338(arg1 * 6, this.aRandomAccessFile2);
					for (local20 = 0; local20 < 6; local20 += local31) {
						local31 = this.aRandomAccessFile2.read(aByteArray10, local20, 6 - local20);
						if (local31 == -1) {
							return false;
						}
					}
					local65 = ((aByteArray10[3] & 0xFF) << 16) + ((aByteArray10[4] & 0xFF) << 8) + (aByteArray10[5] & 0xFF);
					if (local65 <= 0 || (long) local65 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local65 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				aByteArray10[0] = (byte) (arg2 >> 16);
				aByteArray10[1] = (byte) (arg2 >> 8);
				aByteArray10[2] = (byte) arg2;
				aByteArray10[3] = (byte) (local65 >> 16);
				aByteArray10[4] = (byte) (local65 >> 8);
				aByteArray10[5] = (byte) local65;
				this.method338(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray10, 0, 6);
				local20 = 0;
				local31 = 0;
				while (local20 < arg2) {
					@Pc(151) int local151 = 0;
					@Pc(163) int local163;
					if (arg3) {
						this.method338(local65 * 520, this.aRandomAccessFile1);
						@Pc(174) int local174;
						for (local163 = 0; local163 < 8; local163 += local174) {
							local174 = this.aRandomAccessFile1.read(aByteArray10, local163, 8 - local163);
							if (local174 == -1) {
								break;
							}
						}
						if (local163 == 8) {
							local174 = ((aByteArray10[0] & 0xFF) << 8) + (aByteArray10[1] & 0xFF);
							@Pc(215) int local215 = ((aByteArray10[2] & 0xFF) << 8) + (aByteArray10[3] & 0xFF);
							local151 = ((aByteArray10[4] & 0xFF) << 16) + ((aByteArray10[5] & 0xFF) << 8) + (aByteArray10[6] & 0xFF);
							@Pc(243) int local243 = aByteArray10[7] & 0xFF;
							if (local174 != arg1 || local215 != local31 || local243 != this.anInt480) {
								return false;
							}
							if (local151 < 0 || (long) local151 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local151 == 0) {
						arg3 = false;
						local151 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local151 == 0) {
							local151++;
						}
						if (local151 == local65) {
							local151++;
						}
					}
					if (arg2 - local20 <= 512) {
						local151 = 0;
					}
					aByteArray10[0] = (byte) (arg1 >> 8);
					aByteArray10[1] = (byte) arg1;
					aByteArray10[2] = (byte) (local31 >> 8);
					aByteArray10[3] = (byte) local31;
					aByteArray10[4] = (byte) (local151 >> 16);
					aByteArray10[5] = (byte) (local151 >> 8);
					aByteArray10[6] = (byte) local151;
					aByteArray10[7] = (byte) this.anInt480;
					this.method338(local65 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray10, 0, 8);
					local163 = arg2 - local20;
					if (local163 > 512) {
						local163 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local20, local163);
					local20 += local163;
					local65 = local151;
					local31++;
				}
				return true;
			} catch (@Pc(386) IOException local386) {
				return false;
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("66686, " + arg0 + ", " + 17611 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMZHRHUG", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
	private synchronized void method338(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("53093, " + arg0 + ", " + arg1 + ", " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
