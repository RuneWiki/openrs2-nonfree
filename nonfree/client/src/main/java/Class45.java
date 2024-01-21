import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YSPVLGYE")
public final class Class45 {

	@OriginalMember(owner = "client!YSPVLGYE", name = "b", descriptor = "[B")
	private static byte[] aByteArray19 = new byte[520];

	@OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!YSPVLGYE", name = "f", descriptor = "I")
	private int anInt653 = 65000;

	@OriginalMember(owner = "client!YSPVLGYE", name = "e", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!YSPVLGYE", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!YSPVLGYE", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!YSPVLGYE", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;I)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt652 = arg4;
			this.aRandomAccessFile1 = arg1;
			this.aRandomAccessFile2 = arg3;
			this.anInt653 = arg2;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("74543, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method462(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method465(arg0 * 6, this.aRandomAccessFile2);
				@Pc(18) int local18;
				@Pc(29) int local29;
				for (local18 = 0; local18 < 6; local18 += local29) {
					local29 = this.aRandomAccessFile2.read(aByteArray19, local18, 6 - local18);
					if (local29 == -1) {
						return null;
					}
				}
				local29 = ((aByteArray19[0] & 0xFF) << 16) + ((aByteArray19[1] & 0xFF) << 8) + (aByteArray19[2] & 0xFF);
				@Pc(85) int local85 = ((aByteArray19[3] & 0xFF) << 16) + ((aByteArray19[4] & 0xFF) << 8) + (aByteArray19[5] & 0xFF);
				if (local29 < 0 || local29 > this.anInt653) {
					return null;
				} else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(109) byte[] local109 = new byte[local29];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local29) {
						if (local85 == 0) {
							return null;
						}
						this.method465(local85 * 520, this.aRandomAccessFile1);
						local18 = 0;
						@Pc(133) int local133 = local29 - local111;
						if (local133 > 512) {
							local133 = 512;
						}
						@Pc(151) int local151;
						while (local18 < local133 + 8) {
							local151 = this.aRandomAccessFile1.read(aByteArray19, local18, local133 + 8 - local18);
							if (local151 == -1) {
								return null;
							}
							local18 += local151;
						}
						local151 = ((aByteArray19[0] & 0xFF) << 8) + (aByteArray19[1] & 0xFF);
						@Pc(193) int local193 = ((aByteArray19[2] & 0xFF) << 8) + (aByteArray19[3] & 0xFF);
						@Pc(215) int local215 = ((aByteArray19[4] & 0xFF) << 16) + ((aByteArray19[5] & 0xFF) << 8) + (aByteArray19[6] & 0xFF);
						@Pc(221) int local221 = aByteArray19[7] & 0xFF;
						if (local151 == arg0 && local193 == local113 && local221 == this.anInt652) {
							if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
									local109[local111++] = aByteArray19[local248 + 8];
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
			signlink.reporterror("78872, " + 1016 + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method463(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method464(true, arg1, arg2, arg0);
			if (!local7) {
				local7 = this.method464(false, arg1, arg2, arg0);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("44903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -225 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "(IZII[B)Z")
	private synchronized boolean method464(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg0) {
					this.method465(arg2 * 6, this.aRandomAccessFile2);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile2.read(aByteArray19, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((aByteArray19[3] & 0xFF) << 16) + ((aByteArray19[4] & 0xFF) << 8) + (aByteArray19[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				aByteArray19[0] = (byte) (arg1 >> 16);
				aByteArray19[1] = (byte) (arg1 >> 8);
				aByteArray19[2] = (byte) arg1;
				aByteArray19[3] = (byte) (local69 >> 16);
				aByteArray19[4] = (byte) (local69 >> 8);
				aByteArray19[5] = (byte) local69;
				this.method465(arg2 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray19, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg1) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg0) {
						this.method465(local69 * 520, this.aRandomAccessFile1);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile1.read(aByteArray19, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((aByteArray19[0] & 0xFF) << 8) + (aByteArray19[1] & 0xFF);
							@Pc(219) int local219 = ((aByteArray19[2] & 0xFF) << 8) + (aByteArray19[3] & 0xFF);
							local155 = ((aByteArray19[4] & 0xFF) << 16) + ((aByteArray19[5] & 0xFF) << 8) + (aByteArray19[6] & 0xFF);
							@Pc(247) int local247 = aByteArray19[7] & 0xFF;
							if (local178 != arg2 || local219 != local35 || local247 != this.anInt652) {
								return false;
							}
							if (local155 < 0 || (long) local155 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local155 == 0) {
						arg0 = false;
						local155 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local155 == 0) {
							local155++;
						}
						if (local155 == local69) {
							local155++;
						}
					}
					if (arg1 - local24 <= 512) {
						local155 = 0;
					}
					aByteArray19[0] = (byte) (arg2 >> 8);
					aByteArray19[1] = (byte) arg2;
					aByteArray19[2] = (byte) (local35 >> 8);
					aByteArray19[3] = (byte) local35;
					aByteArray19[4] = (byte) (local155 >> 16);
					aByteArray19[5] = (byte) (local155 >> 8);
					aByteArray19[6] = (byte) local155;
					aByteArray19[7] = (byte) this.anInt652;
					this.method465(local69 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray19, 0, 8);
					local167 = arg1 - local24;
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
			signlink.reporterror("70845, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
	private synchronized void method465(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
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
			signlink.reporterror("85954, " + arg0 + ", " + arg1 + ", " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
