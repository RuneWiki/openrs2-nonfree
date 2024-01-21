import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt967 = 65000;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;BLjava/io/RandomAccessFile;II)V")
	public Class45(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt966 = arg3;
			this.aRandomAccessFile2 = arg0;
			this.aRandomAccessFile3 = arg2;
			this.anInt967 = arg4;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("3810, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				this.method661(this.aRandomAccessFile3, arg0 * 6);
				@Pc(15) int local15;
				@Pc(26) int local26;
				for (local15 = 0; local15 < 6; local15 += local26) {
					local26 = this.aRandomAccessFile3.read(aByteArray20, local15, 6 - local15);
					if (local26 == -1) {
						return null;
					}
				}
				local26 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(82) int local82 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local26 < 0 || local26 > this.anInt967) {
					return null;
				} else if (local82 > 0 && (long) local82 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(106) byte[] local106 = new byte[local26];
					@Pc(108) int local108 = 0;
					@Pc(110) int local110 = 0;
					while (local108 < local26) {
						if (local82 == 0) {
							return null;
						}
						this.method661(this.aRandomAccessFile2, local82 * 520);
						local15 = 0;
						@Pc(130) int local130 = local26 - local108;
						if (local130 > 512) {
							local130 = 512;
						}
						@Pc(148) int local148;
						while (local15 < local130 + 8) {
							local148 = this.aRandomAccessFile2.read(aByteArray20, local15, local130 + 8 - local15);
							if (local148 == -1) {
								return null;
							}
							local15 += local148;
						}
						local148 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(190) int local190 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(212) int local212 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(218) int local218 = aByteArray20[7] & 0xFF;
						if (local148 == arg0 && local190 == local110 && local218 == this.anInt966) {
							if (local212 >= 0 && (long) local212 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(245) int local245 = 0; local245 < local130; local245++) {
									local106[local108++] = aByteArray20[local245 + 8];
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
			signlink.reporterror("59079, " + arg0 + ", " + arg1 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[BI)Z")
	public synchronized boolean method659(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method660(arg2, arg0, arg1, true);
			if (!local7) {
				local7 = this.method660(arg2, arg0, arg1, false);
			}
			return local7;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("52401, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[BZ)Z")
	private synchronized boolean method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		try {
			try {
				@Pc(67) int local67;
				@Pc(22) int local22;
				@Pc(33) int local33;
				if (arg3) {
					this.method661(this.aRandomAccessFile3, arg1 * 6);
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
				aByteArray20[0] = (byte) (arg0 >> 16);
				aByteArray20[1] = (byte) (arg0 >> 8);
				aByteArray20[2] = (byte) arg0;
				aByteArray20[3] = (byte) (local67 >> 16);
				aByteArray20[4] = (byte) (local67 >> 8);
				aByteArray20[5] = (byte) local67;
				this.method661(this.aRandomAccessFile3, arg1 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local22 = 0;
				local33 = 0;
				while (local22 < arg0) {
					@Pc(153) int local153 = 0;
					@Pc(165) int local165;
					if (arg3) {
						this.method661(this.aRandomAccessFile2, local67 * 520);
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
							if (local176 != arg1 || local217 != local33 || local245 != this.anInt966) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg3 = false;
						local153 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local153 == 0) {
							local153++;
						}
						if (local153 == local67) {
							local153++;
						}
					}
					if (arg0 - local22 <= 512) {
						local153 = 0;
					}
					aByteArray20[0] = (byte) (arg1 >> 8);
					aByteArray20[1] = (byte) arg1;
					aByteArray20[2] = (byte) (local33 >> 8);
					aByteArray20[3] = (byte) local33;
					aByteArray20[4] = (byte) (local153 >> 16);
					aByteArray20[5] = (byte) (local153 >> 8);
					aByteArray20[6] = (byte) local153;
					aByteArray20[7] = (byte) this.anInt966;
					this.method661(this.aRandomAccessFile2, local67 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local165 = arg0 - local22;
					if (local165 > 512) {
						local165 = 512;
					}
					this.aRandomAccessFile2.write(arg2, local22, local165);
					local22 += local165;
					local67 = local153;
					local33++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("86425, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
	private synchronized void method661(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1) throws IOException {
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
			signlink.reporterror("85467, " + arg0 + ", " + arg1 + ", " + -115 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
