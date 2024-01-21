import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MACXPWDL")
public final class Class25 {

	@OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "[B")
	private static byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!MACXPWDL", name = "e", descriptor = "I")
	private int anInt318 = 65000;

	@OriginalMember(owner = "client!MACXPWDL", name = "d", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!MACXPWDL", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!MACXPWDL", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!MACXPWDL", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;BI)V")
	public Class25(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt317 = arg4;
			this.aRandomAccessFile1 = arg0;
			this.aRandomAccessFile2 = arg2;
			this.anInt318 = arg1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("58661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "(IB)[B")
	public synchronized byte[] method318(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method321(arg0 * 6, this.aRandomAccessFile2);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray9, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray9[0] & 0xFF) << 16) + ((aByteArray9[1] & 0xFF) << 8) + (aByteArray9[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray9[3] & 0xFF) << 16) + ((aByteArray9[4] & 0xFF) << 8) + (aByteArray9[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt318) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method321(local85 * 520, this.aRandomAccessFile1);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray9, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray9[0] & 0xFF) << 8) + (aByteArray9[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray9[2] & 0xFF) << 8) + (aByteArray9[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray9[4] & 0xFF) << 16) + ((aByteArray9[5] & 0xFF) << 8) + (aByteArray9[6] & 0xFF);
						@Pc(221) int local221 = aByteArray9[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt317) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray9[local248 + 8];
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
			signlink.reporterror("17446, " + arg0 + ", " + 59 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "([BIZI)Z")
	public synchronized boolean method319(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) boolean local13 = this.method320(true, arg1, arg0, arg2);
			if (!local13) {
				local13 = this.method320(false, arg1, arg0, arg2);
			}
			return local13;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("23097, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "(ZII[BI)Z")
	private synchronized boolean method320(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(67) int local67;
				@Pc(22) int local22;
				@Pc(33) int local33;
				if (arg0) {
					this.method321(arg1 * 6, this.aRandomAccessFile2);
					for (local22 = 0; local22 < 6; local22 += local33) {
						local33 = this.aRandomAccessFile2.read(aByteArray9, local22, 6 - local22);
						if (local33 == -1) {
							return false;
						}
					}
					local67 = ((aByteArray9[3] & 0xFF) << 16) + ((aByteArray9[4] & 0xFF) << 8) + (aByteArray9[5] & 0xFF);
					if (local67 <= 0 || (long) local67 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				aByteArray9[0] = (byte) (arg3 >> 16);
				aByteArray9[1] = (byte) (arg3 >> 8);
				aByteArray9[2] = (byte) arg3;
				aByteArray9[3] = (byte) (local67 >> 16);
				aByteArray9[4] = (byte) (local67 >> 8);
				aByteArray9[5] = (byte) local67;
				this.method321(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray9, 0, 6);
				local22 = 0;
				local33 = 0;
				while (local22 < arg3) {
					@Pc(153) int local153 = 0;
					@Pc(165) int local165;
					if (arg0) {
						this.method321(local67 * 520, this.aRandomAccessFile1);
						@Pc(176) int local176;
						for (local165 = 0; local165 < 8; local165 += local176) {
							local176 = this.aRandomAccessFile1.read(aByteArray9, local165, 8 - local165);
							if (local176 == -1) {
								break;
							}
						}
						if (local165 == 8) {
							local176 = ((aByteArray9[0] & 0xFF) << 8) + (aByteArray9[1] & 0xFF);
							@Pc(217) int local217 = ((aByteArray9[2] & 0xFF) << 8) + (aByteArray9[3] & 0xFF);
							local153 = ((aByteArray9[4] & 0xFF) << 16) + ((aByteArray9[5] & 0xFF) << 8) + (aByteArray9[6] & 0xFF);
							@Pc(245) int local245 = aByteArray9[7] & 0xFF;
							if (local176 != arg1 || local217 != local33 || local245 != this.anInt317) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg0 = false;
						local153 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local153 == 0) {
							local153++;
						}
						if (local153 == local67) {
							local153++;
						}
					}
					if (arg3 - local22 <= 512) {
						local153 = 0;
					}
					aByteArray9[0] = (byte) (arg1 >> 8);
					aByteArray9[1] = (byte) arg1;
					aByteArray9[2] = (byte) (local33 >> 8);
					aByteArray9[3] = (byte) local33;
					aByteArray9[4] = (byte) (local153 >> 16);
					aByteArray9[5] = (byte) (local153 >> 8);
					aByteArray9[6] = (byte) local153;
					aByteArray9[7] = (byte) this.anInt317;
					this.method321(local67 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray9, 0, 8);
					local165 = arg3 - local22;
					if (local165 > 512) {
						local165 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local22, local165);
					local22 += local165;
					local67 = local153;
					local33++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("40881, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
	private synchronized void method321(@OriginalArg(1) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
			signlink.reporterror("57788, " + true + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
