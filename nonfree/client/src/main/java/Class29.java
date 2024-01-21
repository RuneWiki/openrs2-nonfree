import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RRDZGTNX")
public final class Class29 {

	@OriginalMember(owner = "client!RRDZGTNX", name = "d", descriptor = "[B")
	private static byte[] aByteArray18 = new byte[520];

	@OriginalMember(owner = "client!RRDZGTNX", name = "c", descriptor = "I")
	private int anInt595;

	@OriginalMember(owner = "client!RRDZGTNX", name = "a", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!RRDZGTNX", name = "b", descriptor = "I")
	private int anInt594 = -6346;

	@OriginalMember(owner = "client!RRDZGTNX", name = "h", descriptor = "I")
	private int anInt597 = 65000;

	@OriginalMember(owner = "client!RRDZGTNX", name = "g", descriptor = "I")
	private int anInt596;

	@OriginalMember(owner = "client!RRDZGTNX", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!RRDZGTNX", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!RRDZGTNX", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt596 = arg0;
			this.aRandomAccessFile1 = arg2;
			this.aRandomAccessFile2 = arg3;
			this.anInt597 = arg4;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("67140, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RRDZGTNX", name = "a", descriptor = "(IB)[B")
	public synchronized byte[] method393(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method396((byte) 8, arg0 * 6, this.aRandomAccessFile2);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray18, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray18[0] & 0xFF) << 16) + ((aByteArray18[1] & 0xFF) << 8) + (aByteArray18[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt597) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method396((byte) 8, local88 * 520, this.aRandomAccessFile1);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray18, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
						@Pc(224) int local224 = aByteArray18[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt596) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray18[local251 + 8];
								}
								local88 = local218;
								local116++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local112;
				} else {
					return null;
				}
			} catch (@Pc(275) IOException local275) {
				return null;
			}
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("83096, " + arg0 + ", " + 2 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RRDZGTNX", name = "a", descriptor = "(IB[BI)Z")
	public synchronized boolean method394(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aByte28 != 0) {
				throw new NullPointerException();
			}
			@Pc(15) boolean local15 = this.method395(arg1, arg0, true, arg2);
			if (!local15) {
				local15 = this.method395(arg1, arg0, false, arg2);
			}
			return local15;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("52765, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RRDZGTNX", name = "a", descriptor = "([BIZII)Z")
	private synchronized boolean method395(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(67) int local67;
				@Pc(22) int local22;
				@Pc(33) int local33;
				if (arg2) {
					this.method396((byte) 8, arg1 * 6, this.aRandomAccessFile2);
					for (local22 = 0; local22 < 6; local22 += local33) {
						local33 = this.aRandomAccessFile2.read(aByteArray18, local22, 6 - local22);
						if (local33 == -1) {
							return false;
						}
					}
					local67 = ((aByteArray18[3] & 0xFF) << 16) + ((aByteArray18[4] & 0xFF) << 8) + (aByteArray18[5] & 0xFF);
					if (local67 <= 0 || (long) local67 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				aByteArray18[0] = (byte) (arg3 >> 16);
				aByteArray18[1] = (byte) (arg3 >> 8);
				aByteArray18[2] = (byte) arg3;
				aByteArray18[3] = (byte) (local67 >> 16);
				aByteArray18[4] = (byte) (local67 >> 8);
				aByteArray18[5] = (byte) local67;
				this.method396((byte) 8, arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray18, 0, 6);
				local22 = 0;
				local33 = 0;
				while (local22 < arg3) {
					@Pc(153) int local153 = 0;
					@Pc(165) int local165;
					if (arg2) {
						this.method396((byte) 8, local67 * 520, this.aRandomAccessFile1);
						@Pc(176) int local176;
						for (local165 = 0; local165 < 8; local165 += local176) {
							local176 = this.aRandomAccessFile1.read(aByteArray18, local165, 8 - local165);
							if (local176 == -1) {
								break;
							}
						}
						if (local165 == 8) {
							local176 = ((aByteArray18[0] & 0xFF) << 8) + (aByteArray18[1] & 0xFF);
							@Pc(217) int local217 = ((aByteArray18[2] & 0xFF) << 8) + (aByteArray18[3] & 0xFF);
							local153 = ((aByteArray18[4] & 0xFF) << 16) + ((aByteArray18[5] & 0xFF) << 8) + (aByteArray18[6] & 0xFF);
							@Pc(245) int local245 = aByteArray18[7] & 0xFF;
							if (local176 != arg1 || local217 != local33 || local245 != this.anInt596) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg2 = false;
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
					aByteArray18[0] = (byte) (arg1 >> 8);
					aByteArray18[1] = (byte) arg1;
					aByteArray18[2] = (byte) (local33 >> 8);
					aByteArray18[3] = (byte) local33;
					aByteArray18[4] = (byte) (local153 >> 16);
					aByteArray18[5] = (byte) (local153 >> 8);
					aByteArray18[6] = (byte) local153;
					aByteArray18[7] = (byte) this.anInt596;
					this.method396((byte) 8, local67 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray18, 0, 8);
					local165 = arg3 - local22;
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
			signlink.reporterror("33836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -242 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RRDZGTNX", name = "a", descriptor = "(BILjava/io/RandomAccessFile;)V")
	private synchronized void method396(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			arg2.seek((long) arg1);
			@Pc(34) boolean local34 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("45405, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
