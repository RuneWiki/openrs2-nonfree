import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt949 = 1;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt951 = 65000;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
	public Class45(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt950 = arg1;
			this.aRandomAccessFile2 = arg4;
			this.aRandomAccessFile3 = arg0;
			this.anInt951 = arg3;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("51621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method658(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method661(this.aRandomAccessFile3, arg0 * 6);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile3.read(aByteArray20, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt951) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method661(this.aRandomAccessFile2, local88 * 520);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile2.read(aByteArray20, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(224) int local224 = aByteArray20[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt950) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray20[local251 + 8];
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
			signlink.reporterror("31212, " + 210 + ", " + arg0 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method659(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method660(true, arg0, arg2, arg1);
			if (!local7) {
				local7 = this.method660(false, arg0, arg2, arg1);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("63279, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -556 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z[BZII)Z")
	private synchronized boolean method660(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(67) int local67;
				@Pc(22) int local22;
				@Pc(33) int local33;
				if (arg0) {
					this.method661(this.aRandomAccessFile3, arg3 * 6);
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
				this.method661(this.aRandomAccessFile3, arg3 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local22 = 0;
				local33 = 0;
				while (local22 < arg2) {
					@Pc(153) int local153 = 0;
					@Pc(165) int local165;
					if (arg0) {
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
							if (local176 != arg3 || local217 != local33 || local245 != this.anInt950) {
								return false;
							}
							if (local153 < 0 || (long) local153 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local153 == 0) {
						arg0 = false;
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
					aByteArray20[0] = (byte) (arg3 >> 8);
					aByteArray20[1] = (byte) arg3;
					aByteArray20[2] = (byte) (local33 >> 8);
					aByteArray20[3] = (byte) local33;
					aByteArray20[4] = (byte) (local153 >> 16);
					aByteArray20[5] = (byte) (local153 >> 8);
					aByteArray20[6] = (byte) local153;
					aByteArray20[7] = (byte) this.anInt950;
					this.method661(this.aRandomAccessFile2, local67 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local165 = arg2 - local22;
					if (local165 > 512) {
						local165 = 512;
					}
					this.aRandomAccessFile2.write(arg1, local22, local165);
					local22 += local165;
					local67 = local153;
					local33++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("23157, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
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
				} catch (@Pc(35) Exception local35) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("60732, " + arg0 + ", " + arg1 + ", " + -73 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
