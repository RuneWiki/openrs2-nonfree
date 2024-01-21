import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class44 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private int anInt1004 = 65000;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(BLjava/io/RandomAccessFile;IILjava/io/RandomAccessFile;)V")
	public Class44(@OriginalArg(0) byte arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt1003 = arg2;
			this.aRandomAccessFile2 = arg1;
			this.aRandomAccessFile3 = arg4;
			this.anInt1004 = arg3;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("39698, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method666(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method669(this.aRandomAccessFile3, arg0 * 6);
				@Pc(16) int local16;
				@Pc(27) int local27;
				for (local16 = 0; local16 < 6; local16 += local27) {
					local27 = this.aRandomAccessFile3.read(aByteArray20, local16, 6 - local16);
					if (local27 == -1) {
						return null;
					}
				}
				local27 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(83) int local83 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local27 < 0 || local27 > this.anInt1004) {
					return null;
				} else if (local83 > 0 && (long) local83 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(107) byte[] local107 = new byte[local27];
					@Pc(109) int local109 = 0;
					@Pc(111) int local111 = 0;
					while (local109 < local27) {
						if (local83 == 0) {
							return null;
						}
						this.method669(this.aRandomAccessFile2, local83 * 520);
						local16 = 0;
						@Pc(131) int local131 = local27 - local109;
						if (local131 > 512) {
							local131 = 512;
						}
						@Pc(149) int local149;
						while (local16 < local131 + 8) {
							local149 = this.aRandomAccessFile2.read(aByteArray20, local16, local131 + 8 - local16);
							if (local149 == -1) {
								return null;
							}
							local16 += local149;
						}
						local149 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(191) int local191 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(213) int local213 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(219) int local219 = aByteArray20[7] & 0xFF;
						if (local149 == arg0 && local191 == local111 && local219 == this.anInt1003) {
							if (local213 >= 0 && (long) local213 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(246) int local246 = 0; local246 < local131; local246++) {
									local107[local109++] = aByteArray20[local246 + 8];
								}
								local83 = local213;
								local111++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local107;
				} else {
					return null;
				}
			} catch (@Pc(270) IOException local270) {
				return null;
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("67757, " + true + ", " + arg0 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BIIB)Z")
	public synchronized boolean method667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(14) boolean local14 = this.method668(arg1, arg2, arg0, true);
			if (!local14) {
				local14 = this.method668(arg1, arg2, arg0, false);
			}
			return local14;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("39795, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -115 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BZZ)Z")
	private synchronized boolean method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg3) {
					this.method669(this.aRandomAccessFile3, arg0 * 6);
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
				aByteArray20[0] = (byte) (arg1 >> 16);
				aByteArray20[1] = (byte) (arg1 >> 8);
				aByteArray20[2] = (byte) arg1;
				aByteArray20[3] = (byte) (local64 >> 16);
				aByteArray20[4] = (byte) (local64 >> 8);
				aByteArray20[5] = (byte) local64;
				this.method669(this.aRandomAccessFile3, arg0 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg1) {
					@Pc(150) int local150 = 0;
					@Pc(162) int local162;
					if (arg3) {
						this.method669(this.aRandomAccessFile2, local64 * 520);
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
							if (local173 != arg0 || local214 != local30 || local242 != this.anInt1003) {
								return false;
							}
							if (local150 < 0 || (long) local150 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local150 == 0) {
						arg3 = false;
						local150 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local150 == 0) {
							local150++;
						}
						if (local150 == local64) {
							local150++;
						}
					}
					if (arg1 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray20[0] = (byte) (arg0 >> 8);
					aByteArray20[1] = (byte) arg0;
					aByteArray20[2] = (byte) (local30 >> 8);
					aByteArray20[3] = (byte) local30;
					aByteArray20[4] = (byte) (local150 >> 16);
					aByteArray20[5] = (byte) (local150 >> 8);
					aByteArray20[6] = (byte) local150;
					aByteArray20[7] = (byte) this.anInt1003;
					this.method669(this.aRandomAccessFile2, local64 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local162 = arg1 - local19;
					if (local162 > 512) {
						local162 = 512;
					}
					this.aRandomAccessFile2.write(arg2, local19, local162);
					local19 += local162;
					local64 = local150;
					local30++;
				}
				return true;
			} catch (@Pc(385) IOException local385) {
				return false;
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("94535, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
	private synchronized void method669(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
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
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("49253, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
