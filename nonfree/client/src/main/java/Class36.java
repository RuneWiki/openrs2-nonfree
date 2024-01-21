import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TPHBVXKD")
public final class Class36 {

	@OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "[B")
	private static byte[] aByteArray15 = new byte[520];

	@OriginalMember(owner = "client!TPHBVXKD", name = "e", descriptor = "I")
	private int anInt709 = 65000;

	@OriginalMember(owner = "client!TPHBVXKD", name = "d", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!TPHBVXKD", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!TPHBVXKD", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!TPHBVXKD", name = "<init>", descriptor = "(ZLjava/io/RandomAccessFile;IILjava/io/RandomAccessFile;)V")
	public Class36(@OriginalArg(0) boolean arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt708 = arg3;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg1;
			this.anInt709 = arg2;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("27225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method496(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method499(this.aRandomAccessFile2, arg0 * 6);
				@Pc(21) int local21;
				@Pc(32) int local32;
				for (local21 = 0; local21 < 6; local21 += local32) {
					local32 = this.aRandomAccessFile2.read(aByteArray15, local21, 6 - local21);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((aByteArray15[0] & 0xFF) << 16) + ((aByteArray15[1] & 0xFF) << 8) + (aByteArray15[2] & 0xFF);
				@Pc(88) int local88 = ((aByteArray15[3] & 0xFF) << 16) + ((aByteArray15[4] & 0xFF) << 8) + (aByteArray15[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt709) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method499(this.aRandomAccessFile1, local88 * 520);
						local21 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local21 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(aByteArray15, local21, local136 + 8 - local21);
							if (local154 == -1) {
								return null;
							}
							local21 += local154;
						}
						local154 = ((aByteArray15[0] & 0xFF) << 8) + (aByteArray15[1] & 0xFF);
						@Pc(196) int local196 = ((aByteArray15[2] & 0xFF) << 8) + (aByteArray15[3] & 0xFF);
						@Pc(218) int local218 = ((aByteArray15[4] & 0xFF) << 16) + ((aByteArray15[5] & 0xFF) << 8) + (aByteArray15[6] & 0xFF);
						@Pc(224) int local224 = aByteArray15[7] & 0xFF;
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt708) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = aByteArray15[local251 + 8];
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
			signlink.reporterror("72323, " + 7 + ", " + arg0 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(I[BIB)Z")
	public synchronized boolean method497(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(9) boolean local9 = this.method498(arg0, arg1, arg2, true);
			@Pc(14) boolean local14 = false;
			if (!local9) {
				local9 = this.method498(arg0, arg1, arg2, false);
			}
			return local9;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("6237, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(II[BIZ)Z")
	private synchronized boolean method498(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			try {
				@Pc(65) int local65;
				@Pc(20) int local20;
				@Pc(31) int local31;
				if (arg3) {
					this.method499(this.aRandomAccessFile2, arg0 * 6);
					for (local20 = 0; local20 < 6; local20 += local31) {
						local31 = this.aRandomAccessFile2.read(aByteArray15, local20, 6 - local20);
						if (local31 == -1) {
							return false;
						}
					}
					local65 = ((aByteArray15[3] & 0xFF) << 16) + ((aByteArray15[4] & 0xFF) << 8) + (aByteArray15[5] & 0xFF);
					if (local65 <= 0 || (long) local65 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local65 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				aByteArray15[0] = (byte) (arg2 >> 16);
				aByteArray15[1] = (byte) (arg2 >> 8);
				aByteArray15[2] = (byte) arg2;
				aByteArray15[3] = (byte) (local65 >> 16);
				aByteArray15[4] = (byte) (local65 >> 8);
				aByteArray15[5] = (byte) local65;
				this.method499(this.aRandomAccessFile2, arg0 * 6);
				this.aRandomAccessFile2.write(aByteArray15, 0, 6);
				local20 = 0;
				local31 = 0;
				while (local20 < arg2) {
					@Pc(151) int local151 = 0;
					@Pc(163) int local163;
					if (arg3) {
						this.method499(this.aRandomAccessFile1, local65 * 520);
						@Pc(174) int local174;
						for (local163 = 0; local163 < 8; local163 += local174) {
							local174 = this.aRandomAccessFile1.read(aByteArray15, local163, 8 - local163);
							if (local174 == -1) {
								break;
							}
						}
						if (local163 == 8) {
							local174 = ((aByteArray15[0] & 0xFF) << 8) + (aByteArray15[1] & 0xFF);
							@Pc(215) int local215 = ((aByteArray15[2] & 0xFF) << 8) + (aByteArray15[3] & 0xFF);
							local151 = ((aByteArray15[4] & 0xFF) << 16) + ((aByteArray15[5] & 0xFF) << 8) + (aByteArray15[6] & 0xFF);
							@Pc(243) int local243 = aByteArray15[7] & 0xFF;
							if (local174 != arg0 || local215 != local31 || local243 != this.anInt708) {
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
					aByteArray15[0] = (byte) (arg0 >> 8);
					aByteArray15[1] = (byte) arg0;
					aByteArray15[2] = (byte) (local31 >> 8);
					aByteArray15[3] = (byte) local31;
					aByteArray15[4] = (byte) (local151 >> 16);
					aByteArray15[5] = (byte) (local151 >> 8);
					aByteArray15[6] = (byte) local151;
					aByteArray15[7] = (byte) this.anInt708;
					this.method499(this.aRandomAccessFile1, local65 * 520);
					this.aRandomAccessFile1.write(aByteArray15, 0, 8);
					local163 = arg2 - local20;
					if (local163 > 512) {
						local163 = 512;
					}
					this.aRandomAccessFile1.write(arg1, local20, local163);
					local20 += local163;
					local65 = local151;
					local31++;
				}
				return true;
			} catch (@Pc(386) IOException local386) {
				return false;
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("94284, " + 45664 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(ZLjava/io/RandomAccessFile;I)V")
	private synchronized void method499(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("20515, " + false + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
