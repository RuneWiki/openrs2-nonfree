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

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
	private boolean aBoolean200 = true;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt988 = 65000;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;B)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) byte arg4) {
		try {
			this.anInt987 = arg2;
			this.aRandomAccessFile2 = arg1;
			this.aRandomAccessFile3 = arg3;
			this.anInt988 = arg0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("30847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method636(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method639(this.aRandomAccessFile3, arg0 * 6);
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
				if (local32 < 0 || local32 > this.anInt988) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method639(this.aRandomAccessFile2, local88 * 520);
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
						if (local154 == arg0 && local196 == local116 && local224 == this.anInt987) {
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
			signlink.reporterror("3679, " + 3251 + ", " + arg0 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BB)Z")
	public synchronized boolean method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(7) boolean local7 = this.method638(true, arg2, arg1, arg0);
			if (!local7) {
				local7 = this.method638(false, arg2, arg1, arg0);
			}
			return local7;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("58674, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -83 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[BIII)Z")
	private synchronized boolean method638(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg0) {
					this.method639(this.aRandomAccessFile3, arg3 * 6);
					for (local19 = 0; local19 < 6; local19 += local30) {
						local30 = this.aRandomAccessFile3.read(aByteArray20, local19, 6 - local19);
						if (local30 == -1) {
							return false;
						}
					}
					local64 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local64 <= 0 || (long) local64 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local64 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local64 == 0) {
						local64 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg2 >> 16);
				aByteArray20[1] = (byte) (arg2 >> 8);
				aByteArray20[2] = (byte) arg2;
				aByteArray20[3] = (byte) (local64 >> 16);
				aByteArray20[4] = (byte) (local64 >> 8);
				aByteArray20[5] = (byte) local64;
				this.method639(this.aRandomAccessFile3, arg3 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg2) {
					@Pc(150) int local150 = 0;
					@Pc(162) int local162;
					if (arg0) {
						this.method639(this.aRandomAccessFile2, local64 * 520);
						@Pc(173) int local173;
						for (local162 = 0; local162 < 8; local162 += local173) {
							local173 = this.aRandomAccessFile2.read(aByteArray20, local162, 8 - local162);
							if (local173 == -1) {
								break;
							}
						}
						if (local162 == 8) {
							local173 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(214) int local214 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local150 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(242) int local242 = aByteArray20[7] & 0xFF;
							if (local173 != arg3 || local214 != local30 || local242 != this.anInt987) {
								return false;
							}
							if (local150 < 0 || (long) local150 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local150 == 0) {
						arg0 = false;
						local150 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local150 == 0) {
							local150++;
						}
						if (local150 == local64) {
							local150++;
						}
					}
					if (arg2 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray20[0] = (byte) (arg3 >> 8);
					aByteArray20[1] = (byte) arg3;
					aByteArray20[2] = (byte) (local30 >> 8);
					aByteArray20[3] = (byte) local30;
					aByteArray20[4] = (byte) (local150 >> 16);
					aByteArray20[5] = (byte) (local150 >> 8);
					aByteArray20[6] = (byte) local150;
					aByteArray20[7] = (byte) this.anInt987;
					this.method639(this.aRandomAccessFile2, local64 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local162 = arg2 - local19;
					if (local162 > 512) {
						local162 = 512;
					}
					this.aRandomAccessFile2.write(arg1, local19, local162);
					local19 += local162;
					local64 = local150;
					local30++;
				}
				return true;
			} catch (@Pc(385) IOException local385) {
				return false;
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("92835, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;ZI)V")
	private synchronized void method639(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
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
			signlink.reporterror("84372, " + arg0 + ", " + false + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
