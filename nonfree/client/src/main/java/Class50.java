import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZLYJLLFY")
public final class Class50 {

	@OriginalMember(owner = "client!ZLYJLLFY", name = "b", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "I")
	private int anInt817 = 1;

	@OriginalMember(owner = "client!ZLYJLLFY", name = "f", descriptor = "I")
	private int anInt819 = 65000;

	@OriginalMember(owner = "client!ZLYJLLFY", name = "e", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!ZLYJLLFY", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ZLYJLLFY", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!ZLYJLLFY", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;ZII)V")
	public Class50(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt818 = arg3;
			this.aRandomAccessFile1 = arg0;
			this.aRandomAccessFile2 = arg1;
			this.anInt819 = arg4;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("99753, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "(IB)[B")
	public synchronized byte[] method572(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method575(this.aRandomAccessFile2, arg0 * 6);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray20, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt819) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method575(this.aRandomAccessFile1, local85 * 520);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray20, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(221) int local221 = aByteArray20[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt818) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray20[local248 + 8];
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
			signlink.reporterror("7258, " + arg0 + ", " + 4 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "([BIIZ)Z")
	public synchronized boolean method573(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method574(arg0, arg1, arg2, true);
			if (!local7) {
				local7 = this.method574(arg0, arg1, arg2, false);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("24687, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "([BIIZI)Z")
	private synchronized boolean method574(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			try {
				@Pc(65) int local65;
				@Pc(20) int local20;
				@Pc(31) int local31;
				if (arg3) {
					this.method575(this.aRandomAccessFile2, arg2 * 6);
					for (local20 = 0; local20 < 6; local20 += local31) {
						local31 = this.aRandomAccessFile2.read(aByteArray20, local20, 6 - local20);
						if (local31 == -1) {
							return false;
						}
					}
					local65 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local65 <= 0 || (long) local65 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local65 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg1 >> 16);
				aByteArray20[1] = (byte) (arg1 >> 8);
				aByteArray20[2] = (byte) arg1;
				aByteArray20[3] = (byte) (local65 >> 16);
				aByteArray20[4] = (byte) (local65 >> 8);
				aByteArray20[5] = (byte) local65;
				this.method575(this.aRandomAccessFile2, arg2 * 6);
				this.aRandomAccessFile2.write(aByteArray20, 0, 6);
				local20 = 0;
				local31 = 0;
				while (local20 < arg1) {
					@Pc(151) int local151 = 0;
					@Pc(163) int local163;
					if (arg3) {
						this.method575(this.aRandomAccessFile1, local65 * 520);
						@Pc(174) int local174;
						for (local163 = 0; local163 < 8; local163 += local174) {
							local174 = this.aRandomAccessFile1.read(aByteArray20, local163, 8 - local163);
							if (local174 == -1) {
								break;
							}
						}
						if (local163 == 8) {
							local174 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(215) int local215 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local151 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(243) int local243 = aByteArray20[7] & 0xFF;
							if (local174 != arg2 || local215 != local31 || local243 != this.anInt818) {
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
					if (arg1 - local20 <= 512) {
						local151 = 0;
					}
					aByteArray20[0] = (byte) (arg2 >> 8);
					aByteArray20[1] = (byte) arg2;
					aByteArray20[2] = (byte) (local31 >> 8);
					aByteArray20[3] = (byte) local31;
					aByteArray20[4] = (byte) (local151 >> 16);
					aByteArray20[5] = (byte) (local151 >> 8);
					aByteArray20[6] = (byte) local151;
					aByteArray20[7] = (byte) this.anInt818;
					this.method575(this.aRandomAccessFile1, local65 * 520);
					this.aRandomAccessFile1.write(aByteArray20, 0, 8);
					local163 = arg1 - local20;
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
			signlink.reporterror("12607, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 10595 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "(BLjava/io/RandomAccessFile;I)V")
	private synchronized void method575(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(28) Exception local28) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("87317, " + -20 + ", " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}
}
