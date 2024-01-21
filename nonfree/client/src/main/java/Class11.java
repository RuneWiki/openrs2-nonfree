import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EEVNVHNQ")
public final class Class11 {

	@OriginalMember(owner = "client!EEVNVHNQ", name = "c", descriptor = "[B")
	private static byte[] aByteArray6 = new byte[520];

	@OriginalMember(owner = "client!EEVNVHNQ", name = "a", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!EEVNVHNQ", name = "b", descriptor = "I")
	private int anInt227 = 258;

	@OriginalMember(owner = "client!EEVNVHNQ", name = "h", descriptor = "I")
	private int anInt229 = 65000;

	@OriginalMember(owner = "client!EEVNVHNQ", name = "g", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!EEVNVHNQ", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!EEVNVHNQ", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!EEVNVHNQ", name = "<init>", descriptor = "(ZILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
	public Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt228 = arg1;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg2;
			this.anInt229 = arg4;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("27389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EEVNVHNQ", name = "a", descriptor = "(IZ)[B")
	public synchronized byte[] method149(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method152(this.aRandomAccessFile2, arg0 * 6, (byte) 6);
				@Pc(20) int local20;
				@Pc(31) int local31;
				for (local20 = 0; local20 < 6; local20 += local31) {
					local31 = this.aRandomAccessFile2.read(aByteArray6, local20, 6 - local20);
					if (local31 == -1) {
						return null;
					}
				}
				local31 = ((aByteArray6[0] & 0xFF) << 16) + ((aByteArray6[1] & 0xFF) << 8) + (aByteArray6[2] & 0xFF);
				@Pc(87) int local87 = ((aByteArray6[3] & 0xFF) << 16) + ((aByteArray6[4] & 0xFF) << 8) + (aByteArray6[5] & 0xFF);
				if (local31 < 0 || local31 > this.anInt229) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(111) byte[] local111 = new byte[local31];
					@Pc(113) int local113 = 0;
					@Pc(115) int local115 = 0;
					while (local113 < local31) {
						if (local87 == 0) {
							return null;
						}
						this.method152(this.aRandomAccessFile1, local87 * 520, (byte) 6);
						local20 = 0;
						@Pc(135) int local135 = local31 - local113;
						if (local135 > 512) {
							local135 = 512;
						}
						@Pc(153) int local153;
						while (local20 < local135 + 8) {
							local153 = this.aRandomAccessFile1.read(aByteArray6, local20, local135 + 8 - local20);
							if (local153 == -1) {
								return null;
							}
							local20 += local153;
						}
						local153 = ((aByteArray6[0] & 0xFF) << 8) + (aByteArray6[1] & 0xFF);
						@Pc(195) int local195 = ((aByteArray6[2] & 0xFF) << 8) + (aByteArray6[3] & 0xFF);
						@Pc(217) int local217 = ((aByteArray6[4] & 0xFF) << 16) + ((aByteArray6[5] & 0xFF) << 8) + (aByteArray6[6] & 0xFF);
						@Pc(223) int local223 = aByteArray6[7] & 0xFF;
						if (local153 == arg0 && local195 == local115 && local223 == this.anInt228) {
							if (local217 >= 0 && (long) local217 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(250) int local250 = 0; local250 < local135; local250++) {
									local111[local113++] = aByteArray6[local250 + 8];
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
			signlink.reporterror("89723, " + arg0 + ", " + true + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EEVNVHNQ", name = "a", descriptor = "(I[BII)Z")
	public synchronized boolean method150(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method151((byte) 9, arg2, true, arg1, arg0);
			if (!local7) {
				local7 = this.method151((byte) 9, arg2, false, arg1, arg0);
			}
			return local7;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("12795, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EEVNVHNQ", name = "a", descriptor = "(BIZI[B)Z")
	private synchronized boolean method151(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(68) int local68;
				@Pc(23) int local23;
				@Pc(34) int local34;
				if (arg2) {
					this.method152(this.aRandomAccessFile2, arg1 * 6, (byte) 6);
					for (local23 = 0; local23 < 6; local23 += local34) {
						local34 = this.aRandomAccessFile2.read(aByteArray6, local23, 6 - local23);
						if (local34 == -1) {
							return false;
						}
					}
					local68 = ((aByteArray6[3] & 0xFF) << 16) + ((aByteArray6[4] & 0xFF) << 8) + (aByteArray6[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				aByteArray6[0] = (byte) (arg3 >> 16);
				aByteArray6[1] = (byte) (arg3 >> 8);
				aByteArray6[2] = (byte) arg3;
				aByteArray6[3] = (byte) (local68 >> 16);
				aByteArray6[4] = (byte) (local68 >> 8);
				aByteArray6[5] = (byte) local68;
				this.method152(this.aRandomAccessFile2, arg1 * 6, (byte) 6);
				this.aRandomAccessFile2.write(aByteArray6, 0, 6);
				local23 = 0;
				local34 = 0;
				while (local23 < arg3) {
					@Pc(154) int local154 = 0;
					@Pc(166) int local166;
					if (arg2) {
						this.method152(this.aRandomAccessFile1, local68 * 520, (byte) 6);
						@Pc(177) int local177;
						for (local166 = 0; local166 < 8; local166 += local177) {
							local177 = this.aRandomAccessFile1.read(aByteArray6, local166, 8 - local166);
							if (local177 == -1) {
								break;
							}
						}
						if (local166 == 8) {
							local177 = ((aByteArray6[0] & 0xFF) << 8) + (aByteArray6[1] & 0xFF);
							@Pc(218) int local218 = ((aByteArray6[2] & 0xFF) << 8) + (aByteArray6[3] & 0xFF);
							local154 = ((aByteArray6[4] & 0xFF) << 16) + ((aByteArray6[5] & 0xFF) << 8) + (aByteArray6[6] & 0xFF);
							@Pc(246) int local246 = aByteArray6[7] & 0xFF;
							if (local177 != arg1 || local218 != local34 || local246 != this.anInt228) {
								return false;
							}
							if (local154 < 0 || (long) local154 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local154 == 0) {
						arg2 = false;
						local154 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local154 == 0) {
							local154++;
						}
						if (local154 == local68) {
							local154++;
						}
					}
					if (arg3 - local23 <= 512) {
						local154 = 0;
					}
					aByteArray6[0] = (byte) (arg1 >> 8);
					aByteArray6[1] = (byte) arg1;
					aByteArray6[2] = (byte) (local34 >> 8);
					aByteArray6[3] = (byte) local34;
					aByteArray6[4] = (byte) (local154 >> 16);
					aByteArray6[5] = (byte) (local154 >> 8);
					aByteArray6[6] = (byte) local154;
					aByteArray6[7] = (byte) this.anInt228;
					this.method152(this.aRandomAccessFile1, local68 * 520, (byte) 6);
					this.aRandomAccessFile1.write(aByteArray6, 0, 8);
					local166 = arg3 - local23;
					if (local166 > 512) {
						local166 = 512;
					}
					this.aRandomAccessFile1.write(arg4, local23, local166);
					local23 += local166;
					local68 = local154;
					local34++;
				}
				return true;
			} catch (@Pc(389) IOException local389) {
				return false;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("38745, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EEVNVHNQ", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
	private synchronized void method152(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			@Pc(4) boolean local4 = false;
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(39) Exception local39) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("34914, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}
