import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AOYWVYEX")
public final class Class1 {

	@OriginalMember(owner = "client!AOYWVYEX", name = "d", descriptor = "[B")
	private static byte[] aByteArray1 = new byte[520];

	@OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "B")
	private byte aByte1 = -61;

	@OriginalMember(owner = "client!AOYWVYEX", name = "b", descriptor = "I")
	private int anInt1 = 287;

	@OriginalMember(owner = "client!AOYWVYEX", name = "c", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!AOYWVYEX", name = "h", descriptor = "I")
	private int anInt3 = 65000;

	@OriginalMember(owner = "client!AOYWVYEX", name = "g", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AOYWVYEX", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!AOYWVYEX", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!AOYWVYEX", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
	public Class1(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt2 = arg1;
			this.aRandomAccessFile1 = arg0;
			this.aRandomAccessFile2 = arg3;
			if (arg4 != 14733) {
				this.anInt1 = -86;
			}
			this.anInt3 = arg2;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("16019, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "(BI)[B")
	public synchronized byte[] method1(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method4(arg0 * 6, this.aRandomAccessFile2);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray1, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray1[0] & 0xFF) << 16) + ((aByteArray1[1] & 0xFF) << 8) + (aByteArray1[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray1[3] & 0xFF) << 16) + ((aByteArray1[4] & 0xFF) << 8) + (aByteArray1[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt3) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method4(local85 * 520, this.aRandomAccessFile1);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray1, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray1[0] & 0xFF) << 8) + (aByteArray1[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray1[2] & 0xFF) << 8) + (aByteArray1[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray1[4] & 0xFF) << 16) + ((aByteArray1[5] & 0xFF) << 8) + (aByteArray1[6] & 0xFF);
						@Pc(221) int local221 = aByteArray1[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt2) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray1[local248 + 8];
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
			signlink.reporterror("14000, " + 6 + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "([BZII)Z")
	public synchronized boolean method2(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) boolean local17 = this.method3(arg0, arg1, arg2, true);
			if (!local17) {
				local17 = this.method3(arg0, arg1, arg2, false);
			}
			return local17;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("72493, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "([BZIIZ)Z")
	private synchronized boolean method3(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			try {
				@Pc(67) int local67;
				@Pc(22) int local22;
				@Pc(33) int local33;
				if (arg3) {
					this.method4(arg1 * 6, this.aRandomAccessFile2);
					for (local22 = 0; local22 < 6; local22 += local33) {
						local33 = this.aRandomAccessFile2.read(aByteArray1, local22, 6 - local22);
						if (local33 == -1) {
							return false;
						}
					}
					local67 = ((aByteArray1[3] & 0xFF) << 16) + ((aByteArray1[4] & 0xFF) << 8) + (aByteArray1[5] & 0xFF);
					if (local67 <= 0 || (long) local67 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				aByteArray1[0] = (byte) (arg2 >> 16);
				aByteArray1[1] = (byte) (arg2 >> 8);
				aByteArray1[2] = (byte) arg2;
				aByteArray1[3] = (byte) (local67 >> 16);
				aByteArray1[4] = (byte) (local67 >> 8);
				aByteArray1[5] = (byte) local67;
				this.method4(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray1, 0, 6);
				local22 = 0;
				local33 = 0;
				while (local22 < arg2) {
					@Pc(153) int local153 = 0;
					@Pc(165) int local165;
					if (arg3) {
						this.method4(local67 * 520, this.aRandomAccessFile1);
						@Pc(176) int local176;
						for (local165 = 0; local165 < 8; local165 += local176) {
							local176 = this.aRandomAccessFile1.read(aByteArray1, local165, 8 - local165);
							if (local176 == -1) {
								break;
							}
						}
						if (local165 == 8) {
							local176 = ((aByteArray1[0] & 0xFF) << 8) + (aByteArray1[1] & 0xFF);
							@Pc(217) int local217 = ((aByteArray1[2] & 0xFF) << 8) + (aByteArray1[3] & 0xFF);
							local153 = ((aByteArray1[4] & 0xFF) << 16) + ((aByteArray1[5] & 0xFF) << 8) + (aByteArray1[6] & 0xFF);
							@Pc(245) int local245 = aByteArray1[7] & 0xFF;
							if (local176 != arg1 || local217 != local33 || local245 != this.anInt2) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg3 = false;
						local153 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
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
					aByteArray1[0] = (byte) (arg1 >> 8);
					aByteArray1[1] = (byte) arg1;
					aByteArray1[2] = (byte) (local33 >> 8);
					aByteArray1[3] = (byte) local33;
					aByteArray1[4] = (byte) (local153 >> 16);
					aByteArray1[5] = (byte) (local153 >> 8);
					aByteArray1[6] = (byte) local153;
					aByteArray1[7] = (byte) this.anInt2;
					this.method4(local67 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray1, 0, 8);
					local165 = arg2 - local22;
					if (local165 > 512) {
						local165 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local22, local165);
					local22 += local165;
					local67 = local153;
					local33++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("54128, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "(IBLjava/io/RandomAccessFile;)V")
	private synchronized void method4(@OriginalArg(0) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
			if (this.aByte1 == -61) {
				;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("4330, " + arg0 + ", " + -61 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}
}
