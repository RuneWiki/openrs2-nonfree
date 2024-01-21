import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class45 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private int anInt972 = 29615;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt973 = 7228;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	private int anInt975 = 65000;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;II)V")
	public Class45(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt974 = arg3;
			this.aRandomAccessFile2 = arg0;
			if (arg1 != this.anInt972) {
				for (@Pc(25) int local25 = 1; local25 > 0; local25++) {
				}
			}
			this.aRandomAccessFile3 = arg2;
			this.anInt975 = arg4;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("8348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)[B")
	public synchronized byte[] method651(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				this.method654(arg1 * 6, this.aRandomAccessFile3);
				@Pc(22) int local22;
				@Pc(33) int local33;
				for (local22 = 0; local22 < 6; local22 += local33) {
					local33 = this.aRandomAccessFile3.read(aByteArray20, local22, 6 - local22);
					if (local33 == -1) {
						return null;
					}
				}
				local33 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(89) int local89 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local33 < 0 || local33 > this.anInt975) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(113) byte[] local113 = new byte[local33];
					@Pc(115) int local115 = 0;
					@Pc(117) int local117 = 0;
					while (local115 < local33) {
						if (local89 == 0) {
							return null;
						}
						this.method654(local89 * 520, this.aRandomAccessFile2);
						local22 = 0;
						@Pc(137) int local137 = local33 - local115;
						if (local137 > 512) {
							local137 = 512;
						}
						@Pc(155) int local155;
						while (local22 < local137 + 8) {
							local155 = this.aRandomAccessFile2.read(aByteArray20, local22, local137 + 8 - local22);
							if (local155 == -1) {
								return null;
							}
							local22 += local155;
						}
						local155 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(197) int local197 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(219) int local219 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(225) int local225 = aByteArray20[7] & 0xFF;
						if (local155 == arg1 && local197 == local117 && local225 == this.anInt974) {
							if (local219 >= 0 && (long) local219 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(252) int local252 = 0; local252 < local137; local252++) {
									local113[local115++] = aByteArray20[local252 + 8];
								}
								local89 = local219;
								local117++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local113;
				} else {
					return null;
				}
			} catch (@Pc(276) IOException local276) {
				return null;
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("77044, " + arg0 + ", " + arg1 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[BB)Z")
	public synchronized boolean method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(18) boolean local18 = this.method653(true, arg2, arg1, arg0);
			if (!local18) {
				local18 = this.method653(false, arg2, arg1, arg0);
			}
			return local18;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("63721, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z[BIIB)Z")
	private synchronized boolean method653(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg0) {
					this.method654(arg2 * 6, this.aRandomAccessFile3);
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
				aByteArray20[0] = (byte) (arg3 >> 16);
				aByteArray20[1] = (byte) (arg3 >> 8);
				aByteArray20[2] = (byte) arg3;
				aByteArray20[3] = (byte) (local64 >> 16);
				aByteArray20[4] = (byte) (local64 >> 8);
				aByteArray20[5] = (byte) local64;
				this.method654(arg2 * 6, this.aRandomAccessFile3);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg3) {
					@Pc(150) int local150 = 0;
					@Pc(162) int local162;
					if (arg0) {
						this.method654(local64 * 520, this.aRandomAccessFile2);
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
							if (local173 != arg2 || local214 != local30 || local242 != this.anInt974) {
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
					if (arg3 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray20[0] = (byte) (arg2 >> 8);
					aByteArray20[1] = (byte) arg2;
					aByteArray20[2] = (byte) (local30 >> 8);
					aByteArray20[3] = (byte) local30;
					aByteArray20[4] = (byte) (local150 >> 16);
					aByteArray20[5] = (byte) (local150 >> 8);
					aByteArray20[6] = (byte) local150;
					aByteArray20[7] = (byte) this.anInt974;
					this.method654(local64 * 520, this.aRandomAccessFile2);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local162 = arg3 - local19;
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
			signlink.reporterror("8337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -48 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLjava/io/RandomAccessFile;)V")
	private synchronized void method654(@OriginalArg(0) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(34) Exception local34) {
				}
			}
			arg1.seek((long) arg0);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("3524, " + arg0 + ", " + false + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
