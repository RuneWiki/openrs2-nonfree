import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OVNURGUS")
public final class Class33 {

	@OriginalMember(owner = "client!OVNURGUS", name = "d", descriptor = "[B")
	private static byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!OVNURGUS", name = "a", descriptor = "B")
	private byte aByte25 = -27;

	@OriginalMember(owner = "client!OVNURGUS", name = "b", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!OVNURGUS", name = "c", descriptor = "I")
	private int anInt586 = 7;

	@OriginalMember(owner = "client!OVNURGUS", name = "h", descriptor = "I")
	private int anInt588 = 65000;

	@OriginalMember(owner = "client!OVNURGUS", name = "g", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!OVNURGUS", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!OVNURGUS", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!OVNURGUS", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt587 = arg3;
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			this.aRandomAccessFile1 = arg2;
			this.aRandomAccessFile2 = arg1;
			this.anInt588 = arg4;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("64151, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OVNURGUS", name = "a", descriptor = "(BI)[B")
	public synchronized byte[] method328(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) int local7;
			if (arg0 != this.aByte25) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			try {
				this.method331(this.aRandomAccessFile2, arg1 * 6);
				@Pc(33) int local33;
				for (local7 = 0; local7 < 6; local7 += local33) {
					local33 = this.aRandomAccessFile2.read(aByteArray7, local7, 6 - local7);
					if (local33 == -1) {
						return null;
					}
				}
				local33 = ((aByteArray7[0] & 0xFF) << 16) + ((aByteArray7[1] & 0xFF) << 8) + (aByteArray7[2] & 0xFF);
				@Pc(89) int local89 = ((aByteArray7[3] & 0xFF) << 16) + ((aByteArray7[4] & 0xFF) << 8) + (aByteArray7[5] & 0xFF);
				if (local33 < 0 || local33 > this.anInt588) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(113) byte[] local113 = new byte[local33];
					@Pc(115) int local115 = 0;
					@Pc(117) int local117 = 0;
					while (local115 < local33) {
						if (local89 == 0) {
							return null;
						}
						this.method331(this.aRandomAccessFile1, local89 * 520);
						local7 = 0;
						@Pc(137) int local137 = local33 - local115;
						if (local137 > 512) {
							local137 = 512;
						}
						@Pc(155) int local155;
						while (local7 < local137 + 8) {
							local155 = this.aRandomAccessFile1.read(aByteArray7, local7, local137 + 8 - local7);
							if (local155 == -1) {
								return null;
							}
							local7 += local155;
						}
						local155 = ((aByteArray7[0] & 0xFF) << 8) + (aByteArray7[1] & 0xFF);
						@Pc(197) int local197 = ((aByteArray7[2] & 0xFF) << 8) + (aByteArray7[3] & 0xFF);
						@Pc(219) int local219 = ((aByteArray7[4] & 0xFF) << 16) + ((aByteArray7[5] & 0xFF) << 8) + (aByteArray7[6] & 0xFF);
						@Pc(225) int local225 = aByteArray7[7] & 0xFF;
						if (local155 == arg1 && local197 == local117 && local225 == this.anInt587) {
							if (local219 >= 0 && (long) local219 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(252) int local252 = 0; local252 < local137; local252++) {
									local113[local115++] = aByteArray7[local252 + 8];
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
			signlink.reporterror("65371, " + arg0 + ", " + arg1 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OVNURGUS", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method329(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method330(arg1, (byte) 7, arg0, arg2, true);
			if (!local7) {
				local7 = this.method330(arg1, (byte) 7, arg0, arg2, false);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("94665, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OVNURGUS", name = "a", descriptor = "(IB[BIZ)Z")
	private synchronized boolean method330(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(73) int local73;
				@Pc(28) int local28;
				@Pc(39) int local39;
				if (arg4) {
					this.method331(this.aRandomAccessFile2, arg3 * 6);
					for (local28 = 0; local28 < 6; local28 += local39) {
						local39 = this.aRandomAccessFile2.read(aByteArray7, local28, 6 - local28);
						if (local39 == -1) {
							return false;
						}
					}
					local73 = ((aByteArray7[3] & 0xFF) << 16) + ((aByteArray7[4] & 0xFF) << 8) + (aByteArray7[5] & 0xFF);
					if (local73 <= 0 || (long) local73 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				aByteArray7[0] = (byte) (arg0 >> 16);
				aByteArray7[1] = (byte) (arg0 >> 8);
				aByteArray7[2] = (byte) arg0;
				aByteArray7[3] = (byte) (local73 >> 16);
				aByteArray7[4] = (byte) (local73 >> 8);
				aByteArray7[5] = (byte) local73;
				this.method331(this.aRandomAccessFile2, arg3 * 6);
				this.aRandomAccessFile2.write(aByteArray7, 0, 6);
				local28 = 0;
				local39 = 0;
				while (local28 < arg0) {
					@Pc(159) int local159 = 0;
					@Pc(171) int local171;
					if (arg4) {
						this.method331(this.aRandomAccessFile1, local73 * 520);
						@Pc(182) int local182;
						for (local171 = 0; local171 < 8; local171 += local182) {
							local182 = this.aRandomAccessFile1.read(aByteArray7, local171, 8 - local171);
							if (local182 == -1) {
								break;
							}
						}
						if (local171 == 8) {
							local182 = ((aByteArray7[0] & 0xFF) << 8) + (aByteArray7[1] & 0xFF);
							@Pc(223) int local223 = ((aByteArray7[2] & 0xFF) << 8) + (aByteArray7[3] & 0xFF);
							local159 = ((aByteArray7[4] & 0xFF) << 16) + ((aByteArray7[5] & 0xFF) << 8) + (aByteArray7[6] & 0xFF);
							@Pc(251) int local251 = aByteArray7[7] & 0xFF;
							if (local182 != arg3 || local223 != local39 || local251 != this.anInt587) {
								return false;
							}
							if (local159 < 0 || (long) local159 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local159 == 0) {
						arg4 = false;
						local159 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local159 == 0) {
							local159++;
						}
						if (local159 == local73) {
							local159++;
						}
					}
					if (arg0 - local28 <= 512) {
						local159 = 0;
					}
					aByteArray7[0] = (byte) (arg3 >> 8);
					aByteArray7[1] = (byte) arg3;
					aByteArray7[2] = (byte) (local39 >> 8);
					aByteArray7[3] = (byte) local39;
					aByteArray7[4] = (byte) (local159 >> 16);
					aByteArray7[5] = (byte) (local159 >> 8);
					aByteArray7[6] = (byte) local159;
					aByteArray7[7] = (byte) this.anInt587;
					this.method331(this.aRandomAccessFile1, local73 * 520);
					this.aRandomAccessFile1.write(aByteArray7, 0, 8);
					local171 = arg0 - local28;
					if (local171 > 512) {
						local171 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local28, local171);
					local28 += local171;
					local73 = local159;
					local39++;
				}
				return true;
			} catch (@Pc(394) IOException local394) {
				return false;
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("14774, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OVNURGUS", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method331(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1) throws IOException {
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
			signlink.reporterror("3589, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
