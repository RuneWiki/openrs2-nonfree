import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class46 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt991 = 880;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	private int anInt992 = -96;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private int anInt994 = 65000;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt993 = arg4;
			this.aRandomAccessFile2 = arg2;
			this.aRandomAccessFile3 = arg1;
			this.anInt994 = arg3;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("6680, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method670(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method673(this.aRandomAccessFile3, this.anInt991, arg0 * 6);
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
				if (local33 < 0 || local33 > this.anInt994) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(113) byte[] local113 = new byte[local33];
					@Pc(115) int local115 = 0;
					@Pc(117) int local117 = 0;
					while (local115 < local33) {
						if (local89 == 0) {
							return null;
						}
						this.method673(this.aRandomAccessFile2, this.anInt991, local89 * 520);
						local22 = 0;
						@Pc(138) int local138 = local33 - local115;
						if (local138 > 512) {
							local138 = 512;
						}
						@Pc(156) int local156;
						while (local22 < local138 + 8) {
							local156 = this.aRandomAccessFile2.read(aByteArray20, local22, local138 + 8 - local22);
							if (local156 == -1) {
								return null;
							}
							local22 += local156;
						}
						local156 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(198) int local198 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(220) int local220 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(226) int local226 = aByteArray20[7] & 0xFF;
						if (local156 == arg0 && local198 == local117 && local226 == this.anInt993) {
							if (local220 >= 0 && (long) local220 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(253) int local253 = 0; local253 < local138; local253++) {
									local113[local115++] = aByteArray20[local253 + 8];
								}
								local89 = local220;
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
			} catch (@Pc(277) IOException local277) {
				return null;
			}
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("70837, " + 0 + ", " + arg0 + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BZII)Z")
	public synchronized boolean method671(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method672(true, arg1, arg2, arg0);
			if (!local7) {
				local7 = this.method672(false, arg1, arg2, arg0);
			}
			return local7;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("64422, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIII[B)Z")
	private synchronized boolean method672(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		try {
			try {
				@Pc(64) int local64;
				@Pc(19) int local19;
				@Pc(30) int local30;
				if (arg0) {
					this.method673(this.aRandomAccessFile3, this.anInt991, arg1 * 6);
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
				this.method673(this.aRandomAccessFile3, this.anInt991, arg1 * 6);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg2) {
					@Pc(151) int local151 = 0;
					@Pc(164) int local164;
					if (arg0) {
						this.method673(this.aRandomAccessFile2, this.anInt991, local64 * 520);
						@Pc(175) int local175;
						for (local164 = 0; local164 < 8; local164 += local175) {
							local175 = this.aRandomAccessFile2.read(aByteArray20, local164, 8 - local164);
							if (local175 == -1) {
								break;
							}
						}
						if (local164 == 8) {
							local175 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(216) int local216 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local151 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(244) int local244 = aByteArray20[7] & 0xFF;
							if (local175 != arg1 || local216 != local30 || local244 != this.anInt993) {
								return false;
							}
							if (local151 < 0 || (long) local151 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local151 == 0) {
						arg0 = false;
						local151 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local151 == 0) {
							local151++;
						}
						if (local151 == local64) {
							local151++;
						}
					}
					if (arg2 - local19 <= 512) {
						local151 = 0;
					}
					aByteArray20[0] = (byte) (arg1 >> 8);
					aByteArray20[1] = (byte) arg1;
					aByteArray20[2] = (byte) (local30 >> 8);
					aByteArray20[3] = (byte) local30;
					aByteArray20[4] = (byte) (local151 >> 16);
					aByteArray20[5] = (byte) (local151 >> 8);
					aByteArray20[6] = (byte) local151;
					aByteArray20[7] = (byte) this.anInt993;
					this.method673(this.aRandomAccessFile2, this.anInt991, local64 * 520);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local164 = arg2 - local19;
					if (local164 > 512) {
						local164 = 512;
					}
					this.aRandomAccessFile2.write(arg3, local19, local164);
					local19 += local164;
					local64 = local151;
					local30++;
				}
				return true;
			} catch (@Pc(388) IOException local388) {
				return false;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("87967, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method673(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 <= 0) {
				this.aBoolean233 = !this.aBoolean233;
			}
			if (arg2 < 0 || arg2 > 62914560) {
				System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
				arg2 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(34) Exception local34) {
				}
			}
			arg0.seek((long) arg2);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("96179, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
