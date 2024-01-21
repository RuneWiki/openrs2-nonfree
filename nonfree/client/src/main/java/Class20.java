import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JJRYTWDH")
public final class Class20 {

	@OriginalMember(owner = "client!JJRYTWDH", name = "d", descriptor = "[B")
	private static byte[] aByteArray10 = new byte[520];

	@OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!JJRYTWDH", name = "b", descriptor = "I")
	private int anInt334 = -648;

	@OriginalMember(owner = "client!JJRYTWDH", name = "c", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!JJRYTWDH", name = "h", descriptor = "I")
	private int anInt336 = 65000;

	@OriginalMember(owner = "client!JJRYTWDH", name = "g", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!JJRYTWDH", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!JJRYTWDH", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!JJRYTWDH", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;ZI)V")
	public Class20(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt335 = arg4;
			this.aRandomAccessFile1 = arg2;
			this.aRandomAccessFile2 = arg0;
			this.anInt336 = arg1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("27344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method235(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method238(this.aRandomAccessFile2, arg0 * 6);
				@Pc(16) int local16;
				@Pc(27) int local27;
				for (local16 = 0; local16 < 6; local16 += local27) {
					local27 = this.aRandomAccessFile2.read(aByteArray10, local16, 6 - local16);
					if (local27 == -1) {
						return null;
					}
				}
				local27 = ((aByteArray10[0] & 0xFF) << 16) + ((aByteArray10[1] & 0xFF) << 8) + (aByteArray10[2] & 0xFF);
				@Pc(83) int local83 = ((aByteArray10[3] & 0xFF) << 16) + ((aByteArray10[4] & 0xFF) << 8) + (aByteArray10[5] & 0xFF);
				if (local27 < 0 || local27 > this.anInt336) {
					return null;
				} else if (local83 > 0 && (long) local83 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(107) byte[] local107 = new byte[local27];
					@Pc(109) int local109 = 0;
					@Pc(111) int local111 = 0;
					while (local109 < local27) {
						if (local83 == 0) {
							return null;
						}
						this.method238(this.aRandomAccessFile1, local83 * 520);
						local16 = 0;
						@Pc(131) int local131 = local27 - local109;
						if (local131 > 512) {
							local131 = 512;
						}
						@Pc(149) int local149;
						while (local16 < local131 + 8) {
							local149 = this.aRandomAccessFile1.read(aByteArray10, local16, local131 + 8 - local16);
							if (local149 == -1) {
								return null;
							}
							local16 += local149;
						}
						local149 = ((aByteArray10[0] & 0xFF) << 8) + (aByteArray10[1] & 0xFF);
						@Pc(191) int local191 = ((aByteArray10[2] & 0xFF) << 8) + (aByteArray10[3] & 0xFF);
						@Pc(213) int local213 = ((aByteArray10[4] & 0xFF) << 16) + ((aByteArray10[5] & 0xFF) << 8) + (aByteArray10[6] & 0xFF);
						@Pc(219) int local219 = aByteArray10[7] & 0xFF;
						if (local149 == arg0 && local191 == local111 && local219 == this.anInt335) {
							if (local213 >= 0 && (long) local213 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(246) int local246 = 0; local246 < local131; local246++) {
									local107[local109++] = aByteArray10[local246 + 8];
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
			signlink.reporterror("62031, " + arg0 + ", " + -593 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(II[BI)Z")
	public synchronized boolean method236(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(16) boolean local16 = this.method237(true, arg2, arg0, arg1);
			if (!local16) {
				local16 = this.method237(false, arg2, arg0, arg1);
			}
			return local16;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("13053, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(ZIII[B)Z")
	private synchronized boolean method237(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg0) {
					this.method238(this.aRandomAccessFile2, arg2 * 6);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile2.read(aByteArray10, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((aByteArray10[3] & 0xFF) << 16) + ((aByteArray10[4] & 0xFF) << 8) + (aByteArray10[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				aByteArray10[0] = (byte) (arg1 >> 16);
				aByteArray10[1] = (byte) (arg1 >> 8);
				aByteArray10[2] = (byte) arg1;
				aByteArray10[3] = (byte) (local69 >> 16);
				aByteArray10[4] = (byte) (local69 >> 8);
				aByteArray10[5] = (byte) local69;
				this.method238(this.aRandomAccessFile2, arg2 * 6);
				this.aRandomAccessFile2.write(aByteArray10, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg1) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg0) {
						this.method238(this.aRandomAccessFile1, local69 * 520);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile1.read(aByteArray10, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((aByteArray10[0] & 0xFF) << 8) + (aByteArray10[1] & 0xFF);
							@Pc(219) int local219 = ((aByteArray10[2] & 0xFF) << 8) + (aByteArray10[3] & 0xFF);
							local155 = ((aByteArray10[4] & 0xFF) << 16) + ((aByteArray10[5] & 0xFF) << 8) + (aByteArray10[6] & 0xFF);
							@Pc(247) int local247 = aByteArray10[7] & 0xFF;
							if (local178 != arg2 || local219 != local35 || local247 != this.anInt335) {
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
					aByteArray10[0] = (byte) (arg2 >> 8);
					aByteArray10[1] = (byte) arg2;
					aByteArray10[2] = (byte) (local35 >> 8);
					aByteArray10[3] = (byte) local35;
					aByteArray10[4] = (byte) (local155 >> 16);
					aByteArray10[5] = (byte) (local155 >> 8);
					aByteArray10[6] = (byte) local155;
					aByteArray10[7] = (byte) this.anInt335;
					this.method238(this.aRandomAccessFile1, local69 * 520);
					this.aRandomAccessFile1.write(aByteArray10, 0, 8);
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
			signlink.reporterror("85933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + arg3 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(ZLjava/io/RandomAccessFile;I)V")
	private synchronized void method238(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
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
			signlink.reporterror("62455, " + true + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
