import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HOAULYFF")
public final class Class14 {

	@OriginalMember(owner = "client!HOAULYFF", name = "d", descriptor = "[B")
	private static byte[] aByteArray5 = new byte[520];

	@OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "I")
	private int anInt176 = 3;

	@OriginalMember(owner = "client!HOAULYFF", name = "b", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!HOAULYFF", name = "c", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!HOAULYFF", name = "h", descriptor = "I")
	private int anInt178 = 65000;

	@OriginalMember(owner = "client!HOAULYFF", name = "g", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!HOAULYFF", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!HOAULYFF", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!HOAULYFF", name = "<init>", descriptor = "(IIBLjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt177 = arg1;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg4;
			this.anInt178 = arg0;
			@Pc(30) boolean local30 = false;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("25567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method117(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method120(this.aRandomAccessFile2, (byte) 4, arg0 * 6);
				@Pc(22) int local22;
				@Pc(33) int local33;
				for (local22 = 0; local22 < 6; local22 += local33) {
					local33 = this.aRandomAccessFile2.read(aByteArray5, local22, 6 - local22);
					if (local33 == -1) {
						return null;
					}
				}
				local33 = ((aByteArray5[0] & 0xFF) << 16) + ((aByteArray5[1] & 0xFF) << 8) + (aByteArray5[2] & 0xFF);
				@Pc(89) int local89 = ((aByteArray5[3] & 0xFF) << 16) + ((aByteArray5[4] & 0xFF) << 8) + (aByteArray5[5] & 0xFF);
				if (local33 < 0 || local33 > this.anInt178) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(113) byte[] local113 = new byte[local33];
					@Pc(115) int local115 = 0;
					@Pc(117) int local117 = 0;
					while (local115 < local33) {
						if (local89 == 0) {
							return null;
						}
						this.method120(this.aRandomAccessFile1, (byte) 4, local89 * 520);
						local22 = 0;
						@Pc(137) int local137 = local33 - local115;
						if (local137 > 512) {
							local137 = 512;
						}
						@Pc(155) int local155;
						while (local22 < local137 + 8) {
							local155 = this.aRandomAccessFile1.read(aByteArray5, local22, local137 + 8 - local22);
							if (local155 == -1) {
								return null;
							}
							local22 += local155;
						}
						local155 = ((aByteArray5[0] & 0xFF) << 8) + (aByteArray5[1] & 0xFF);
						@Pc(197) int local197 = ((aByteArray5[2] & 0xFF) << 8) + (aByteArray5[3] & 0xFF);
						@Pc(219) int local219 = ((aByteArray5[4] & 0xFF) << 16) + ((aByteArray5[5] & 0xFF) << 8) + (aByteArray5[6] & 0xFF);
						@Pc(225) int local225 = aByteArray5[7] & 0xFF;
						if (local155 == arg0 && local197 == local117 && local225 == this.anInt177) {
							if (local219 >= 0 && (long) local219 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(252) int local252 = 0; local252 < local137; local252++) {
									local113[local115++] = aByteArray5[local252 + 8];
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
			signlink.reporterror("51095, " + 5 + ", " + arg0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(ZII[B)Z")
	public synchronized boolean method118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(7) boolean local7 = this.method119(arg0, arg2, arg1, true);
			if (!local7) {
				local7 = this.method119(arg0, arg2, arg1, false);
			}
			return local7;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("93402, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(I[BIIZ)Z")
	private synchronized boolean method119(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			if (this.anInt176 > 3 || this.anInt176 < 3) {
				this.aBoolean56 = !this.aBoolean56;
			}
			try {
				@Pc(74) int local74;
				@Pc(29) int local29;
				@Pc(40) int local40;
				if (arg3) {
					this.method120(this.aRandomAccessFile2, (byte) 4, arg2 * 6);
					for (local29 = 0; local29 < 6; local29 += local40) {
						local40 = this.aRandomAccessFile2.read(aByteArray5, local29, 6 - local29);
						if (local40 == -1) {
							return false;
						}
					}
					local74 = ((aByteArray5[3] & 0xFF) << 16) + ((aByteArray5[4] & 0xFF) << 8) + (aByteArray5[5] & 0xFF);
					if (local74 <= 0 || (long) local74 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local74 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local74 == 0) {
						local74 = 1;
					}
				}
				aByteArray5[0] = (byte) (arg0 >> 16);
				aByteArray5[1] = (byte) (arg0 >> 8);
				aByteArray5[2] = (byte) arg0;
				aByteArray5[3] = (byte) (local74 >> 16);
				aByteArray5[4] = (byte) (local74 >> 8);
				aByteArray5[5] = (byte) local74;
				this.method120(this.aRandomAccessFile2, (byte) 4, arg2 * 6);
				this.aRandomAccessFile2.write(aByteArray5, 0, 6);
				local29 = 0;
				local40 = 0;
				while (local29 < arg0) {
					@Pc(160) int local160 = 0;
					@Pc(172) int local172;
					if (arg3) {
						this.method120(this.aRandomAccessFile1, (byte) 4, local74 * 520);
						@Pc(183) int local183;
						for (local172 = 0; local172 < 8; local172 += local183) {
							local183 = this.aRandomAccessFile1.read(aByteArray5, local172, 8 - local172);
							if (local183 == -1) {
								break;
							}
						}
						if (local172 == 8) {
							local183 = ((aByteArray5[0] & 0xFF) << 8) + (aByteArray5[1] & 0xFF);
							@Pc(224) int local224 = ((aByteArray5[2] & 0xFF) << 8) + (aByteArray5[3] & 0xFF);
							local160 = ((aByteArray5[4] & 0xFF) << 16) + ((aByteArray5[5] & 0xFF) << 8) + (aByteArray5[6] & 0xFF);
							@Pc(252) int local252 = aByteArray5[7] & 0xFF;
							if (local183 != arg2 || local224 != local40 || local252 != this.anInt177) {
								return false;
							}
							if (local160 < 0 || (long) local160 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local160 == 0) {
						arg3 = false;
						local160 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local160 == 0) {
							local160++;
						}
						if (local160 == local74) {
							local160++;
						}
					}
					if (arg0 - local29 <= 512) {
						local160 = 0;
					}
					aByteArray5[0] = (byte) (arg2 >> 8);
					aByteArray5[1] = (byte) arg2;
					aByteArray5[2] = (byte) (local40 >> 8);
					aByteArray5[3] = (byte) local40;
					aByteArray5[4] = (byte) (local160 >> 16);
					aByteArray5[5] = (byte) (local160 >> 8);
					aByteArray5[6] = (byte) local160;
					aByteArray5[7] = (byte) this.anInt177;
					this.method120(this.aRandomAccessFile1, (byte) 4, local74 * 520);
					this.aRandomAccessFile1.write(aByteArray5, 0, 8);
					local172 = arg0 - local29;
					if (local172 > 512) {
						local172 = 512;
					}
					this.aRandomAccessFile1.write(arg1, local29, local172);
					local29 += local172;
					local74 = local160;
					local40++;
				}
				return true;
			} catch (@Pc(395) IOException local395) {
				return false;
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("66905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + arg3 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(Ljava/io/RandomAccessFile;BI)V")
	private synchronized void method120(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			@Pc(4) boolean local4 = false;
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
			signlink.reporterror("81599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
