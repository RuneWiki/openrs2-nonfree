import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt989 = 65000;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;Z)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.anInt988 = arg2;
			this.aRandomAccessFile2 = arg3;
			this.aRandomAccessFile3 = arg1;
			this.anInt989 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("36733, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)[B")
	public synchronized byte[] method658(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method661(arg0 * 6, this.aRandomAccessFile3);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile3.read(aByteArray20, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt989) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method661(local84 * 520, this.aRandomAccessFile2);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile2.read(aByteArray20, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(220) int local220 = aByteArray20[7] & 0xFF;
						if (local150 == arg0 && local192 == local112 && local220 == this.anInt988) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray20[local247 + 8];
								}
								local84 = local214;
								local112++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local108;
				} else {
					return null;
				}
			} catch (@Pc(271) IOException local271) {
				return null;
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("16696, " + arg0 + ", " + false + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI[BI)Z")
	public synchronized boolean method659(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) boolean local17 = this.method660(arg2, true, arg0, arg1);
			if (!local17) {
				local17 = this.method660(arg2, false, arg0, arg1);
			}
			return local17;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("84126, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZZI[B)Z")
	private synchronized boolean method660(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(67) int local67;
				@Pc(22) int local22;
				@Pc(33) int local33;
				if (arg1) {
					this.method661(arg0 * 6, this.aRandomAccessFile3);
					for (local22 = 0; local22 < 6; local22 += local33) {
						local33 = this.aRandomAccessFile3.read(aByteArray20, local22, 6 - local22);
						if (local33 == -1) {
							return false;
						}
					}
					local67 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local67 <= 0 || (long) local67 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg2 >> 16);
				aByteArray20[1] = (byte) (arg2 >> 8);
				aByteArray20[2] = (byte) arg2;
				aByteArray20[3] = (byte) (local67 >> 16);
				aByteArray20[4] = (byte) (local67 >> 8);
				aByteArray20[5] = (byte) local67;
				this.method661(arg0 * 6, this.aRandomAccessFile3);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local22 = 0;
				local33 = 0;
				while (local22 < arg2) {
					@Pc(153) int local153 = 0;
					@Pc(165) int local165;
					if (arg1) {
						this.method661(local67 * 520, this.aRandomAccessFile2);
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
							local153 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(245) int local245 = aByteArray20[7] & 0xFF;
							if (local176 != arg0 || local217 != local33 || local245 != this.anInt988) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg1 = false;
						local153 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local153 == 0) {
							local153++;
						}
						if (local153 == local67) {
							local153++;
						}
					}
					if (arg2 - local22 <= 512) {
						local153 = 0;
					}
					aByteArray20[0] = (byte) (arg0 >> 8);
					aByteArray20[1] = (byte) arg0;
					aByteArray20[2] = (byte) (local33 >> 8);
					aByteArray20[3] = (byte) local33;
					aByteArray20[4] = (byte) (local153 >> 16);
					aByteArray20[5] = (byte) (local153 >> 8);
					aByteArray20[6] = (byte) local153;
					aByteArray20[7] = (byte) this.anInt988;
					this.method661(local67 * 520, this.aRandomAccessFile2);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local165 = arg2 - local22;
					if (local165 > 512) {
						local165 = 512;
					}
					this.aRandomAccessFile2.write(arg3, local22, local165);
					local22 += local165;
					local67 = local153;
					local33++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("4799, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
	private synchronized void method661(@OriginalArg(1) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("36896, " + true + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
