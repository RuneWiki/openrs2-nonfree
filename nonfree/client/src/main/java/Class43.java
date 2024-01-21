import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class43 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt980 = -258;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt982 = 65000;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt981 = arg1;
			this.aRandomAccessFile2 = arg4;
			this.aRandomAccessFile3 = arg3;
			if (arg0 != -31142) {
				throw new NullPointerException();
			}
			this.anInt982 = arg2;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("66606, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method631(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method634(this.anInt980, this.aRandomAccessFile3, arg0 * 6);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile3.read(aByteArray20, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt982) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method634(this.anInt980, this.aRandomAccessFile2, local85 * 520);
						local18 = 0;
						@Pc(134) int local134 = local29 - local111;
						if (local134 > 512) {
							local134 = 512;
						}
						@Pc(152) int local152;
						while (local18 < local134 + 8) {
							local152 = this.aRandomAccessFile2.read(aByteArray20, local18, local134 + 8 - local18);
							if (local152 == -1) {
								return null;
							}
							local18 += local152;
						}
						local152 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(194) int local194 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(216) int local216 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(222) int local222 = aByteArray20[7] & 0xFF;
						if (local152 == arg0 && local194 == local113 && local222 == this.anInt981) {
							if (local216 >= 0 && (long) local216 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(249) int local249 = 0; local249 < local134; local249++) {
									local109[local111++] = aByteArray20[local249 + 8];
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
			signlink.reporterror("28763, " + false + ", " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[BII)Z")
	public synchronized boolean method632(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method633(arg0, true, arg2, arg1);
			if (!local7) {
				local7 = this.method633(arg0, false, arg2, arg1);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("50328, " + arg0 + ", " + arg1 + ", " + -437 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZZI[B)Z")
	private synchronized boolean method633(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(65) int local65;
				@Pc(20) int local20;
				@Pc(31) int local31;
				if (arg1) {
					this.method634(this.anInt980, this.aRandomAccessFile3, arg2 * 6);
					for (local20 = 0; local20 < 6; local20 += local31) {
						local31 = this.aRandomAccessFile3.read(aByteArray20, local20, 6 - local20);
						if (local31 == -1) {
							return false;
						}
					}
					local65 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local65 <= 0 || (long) local65 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local65 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg0 >> 16);
				aByteArray20[1] = (byte) (arg0 >> 8);
				aByteArray20[2] = (byte) arg0;
				aByteArray20[3] = (byte) (local65 >> 16);
				aByteArray20[4] = (byte) (local65 >> 8);
				aByteArray20[5] = (byte) local65;
				this.method634(this.anInt980, this.aRandomAccessFile3, arg2 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local20 = 0;
				local31 = 0;
				while (local20 < arg0) {
					@Pc(152) int local152 = 0;
					@Pc(165) int local165;
					if (arg1) {
						this.method634(this.anInt980, this.aRandomAccessFile2, local65 * 520);
						@Pc(176) int local176;
						for (local165 = 0; local165 < 8; local165 += local176) {
							local176 = this.aRandomAccessFile2.read(aByteArray20, local165, 8 - local165);
							if (local176 == -1) {
								break;
							}
						}
						if (local165 == 8) {
							local176 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(217) int local217 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local152 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(245) int local245 = aByteArray20[7] & 0xFF;
							if (local176 != arg2 || local217 != local31 || local245 != this.anInt981) {
								return false;
							}
							if (local152 < 0 || (long) local152 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local152 == 0) {
						arg1 = false;
						local152 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local152 == 0) {
							local152++;
						}
						if (local152 == local65) {
							local152++;
						}
					}
					if (arg0 - local20 <= 512) {
						local152 = 0;
					}
					aByteArray20[0] = (byte) (arg2 >> 8);
					aByteArray20[1] = (byte) arg2;
					aByteArray20[2] = (byte) (local31 >> 8);
					aByteArray20[3] = (byte) local31;
					aByteArray20[4] = (byte) (local152 >> 16);
					aByteArray20[5] = (byte) (local152 >> 8);
					aByteArray20[6] = (byte) local152;
					aByteArray20[7] = (byte) this.anInt981;
					this.method634(this.anInt980, this.aRandomAccessFile2, local65 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local165 = arg0 - local20;
					if (local165 > 512) {
						local165 = 512;
					}
					this.aRandomAccessFile2.write(arg3, local20, local165);
					local20 += local165;
					local65 = local152;
					local31++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("40433, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
	private synchronized void method634(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0 >= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (arg2 < 0 || arg2 > 62914560) {
				System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
				arg2 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(33) Exception local33) {
				}
			}
			arg1.seek((long) arg2);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("46416, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
