import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YFAYUBGF")
public final class Class45 {

	@OriginalMember(owner = "client!YFAYUBGF", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!YFAYUBGF", name = "b", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!YFAYUBGF", name = "h", descriptor = "I")
	private int anInt774 = 65000;

	@OriginalMember(owner = "client!YFAYUBGF", name = "g", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!YFAYUBGF", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!YFAYUBGF", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!YFAYUBGF", name = "<init>", descriptor = "(IZILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt773 = arg2;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg4;
			this.anInt774 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("10102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(IZ)[B")
	public synchronized byte[] method525(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method528(arg0 * 6, this.aRandomAccessFile2);
				@Pc(20) int local20;
				@Pc(31) int local31;
				for (local20 = 0; local20 < 6; local20 += local31) {
					local31 = this.aRandomAccessFile2.read(aByteArray20, local20, 6 - local20);
					if (local31 == -1) {
						return null;
					}
				}
				local31 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(87) int local87 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local31 < 0 || local31 > this.anInt774) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(111) byte[] local111 = new byte[local31];
					@Pc(113) int local113 = 0;
					@Pc(115) int local115 = 0;
					while (local113 < local31) {
						if (local87 == 0) {
							return null;
						}
						this.method528(local87 * 520, this.aRandomAccessFile1);
						local20 = 0;
						@Pc(135) int local135 = local31 - local113;
						if (local135 > 512) {
							local135 = 512;
						}
						@Pc(153) int local153;
						while (local20 < local135 + 8) {
							local153 = this.aRandomAccessFile1.read(aByteArray20, local20, local135 + 8 - local20);
							if (local153 == -1) {
								return null;
							}
							local20 += local153;
						}
						local153 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(195) int local195 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(217) int local217 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(223) int local223 = aByteArray20[7] & 0xFF;
						if (local153 == arg0 && local195 == local115 && local223 == this.anInt773) {
							if (local217 >= 0 && (long) local217 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(250) int local250 = 0; local250 < local135; local250++) {
									local111[local113++] = aByteArray20[local250 + 8];
								}
								local87 = local217;
								local115++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local111;
				} else {
					return null;
				}
			} catch (@Pc(274) IOException local274) {
				return null;
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("73687, " + arg0 + ", " + false + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(Z[BII)Z")
	public synchronized boolean method526(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(16) boolean local16 = this.method527(arg2, true, arg1, arg0);
			if (!local16) {
				local16 = this.method527(arg2, false, arg1, arg0);
			}
			return local16;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93508, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(IZIB[B)Z")
	private synchronized boolean method527(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg1) {
					this.method528(arg0 * 6, this.aRandomAccessFile2);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile2.read(aByteArray20, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg2 >> 16);
				aByteArray20[1] = (byte) (arg2 >> 8);
				aByteArray20[2] = (byte) arg2;
				aByteArray20[3] = (byte) (local69 >> 16);
				aByteArray20[4] = (byte) (local69 >> 8);
				aByteArray20[5] = (byte) local69;
				this.method528(arg0 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray20, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg2) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg1) {
						this.method528(local69 * 520, this.aRandomAccessFile1);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile1.read(aByteArray20, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(219) int local219 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local155 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(247) int local247 = aByteArray20[7] & 0xFF;
							if (local178 != arg0 || local219 != local35 || local247 != this.anInt773) {
								return false;
							}
							if (local155 < 0 || (long) local155 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local155 == 0) {
						arg1 = false;
						local155 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local155 == 0) {
							local155++;
						}
						if (local155 == local69) {
							local155++;
						}
					}
					if (arg2 - local24 <= 512) {
						local155 = 0;
					}
					aByteArray20[0] = (byte) (arg0 >> 8);
					aByteArray20[1] = (byte) arg0;
					aByteArray20[2] = (byte) (local35 >> 8);
					aByteArray20[3] = (byte) local35;
					aByteArray20[4] = (byte) (local155 >> 16);
					aByteArray20[5] = (byte) (local155 >> 8);
					aByteArray20[6] = (byte) local155;
					aByteArray20[7] = (byte) this.anInt773;
					this.method528(local69 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray20, 0, 8);
					local167 = arg2 - local24;
					if (local167 > 512) {
						local167 = 512;
					}
					this.aRandomAccessFile1.write(arg3, local24, local167);
					local24 += local167;
					local69 = local155;
					local35++;
				}
				return true;
			} catch (@Pc(390) IOException local390) {
				return false;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("19857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -43 + ", " + arg3 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
	private synchronized void method528(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
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
			if (0 != this.anInt772) {
				this.anInt772 = 129;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("31912, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}
