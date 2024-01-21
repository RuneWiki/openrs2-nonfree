import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IJFFCIDM")
public final class Class19 {

	@OriginalMember(owner = "client!IJFFCIDM", name = "b", descriptor = "[B")
	private static byte[] aByteArray4 = new byte[520];

	@OriginalMember(owner = "client!IJFFCIDM", name = "a", descriptor = "Z")
	private boolean aBoolean96 = true;

	@OriginalMember(owner = "client!IJFFCIDM", name = "f", descriptor = "I")
	private int anInt291 = 65000;

	@OriginalMember(owner = "client!IJFFCIDM", name = "e", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!IJFFCIDM", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!IJFFCIDM", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!IJFFCIDM", name = "<init>", descriptor = "(BILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
	public Class19(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt290 = arg4;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg2;
			this.anInt291 = arg1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("82122, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJFFCIDM", name = "a", descriptor = "(ZI)[B")
	public synchronized byte[] method147(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			try {
				this.method150(arg1 * 6, this.aRandomAccessFile2);
				@Pc(17) int local17;
				@Pc(28) int local28;
				for (local17 = 0; local17 < 6; local17 += local28) {
					local28 = this.aRandomAccessFile2.read(aByteArray4, local17, 6 - local17);
					if (local28 == -1) {
						return null;
					}
				}
				local28 = ((aByteArray4[0] & 0xFF) << 16) + ((aByteArray4[1] & 0xFF) << 8) + (aByteArray4[2] & 0xFF);
				@Pc(84) int local84 = ((aByteArray4[3] & 0xFF) << 16) + ((aByteArray4[4] & 0xFF) << 8) + (aByteArray4[5] & 0xFF);
				if (local28 < 0 || local28 > this.anInt291) {
					return null;
				} else if (local84 > 0 && (long) local84 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(108) byte[] local108 = new byte[local28];
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					while (local110 < local28) {
						if (local84 == 0) {
							return null;
						}
						this.method150(local84 * 520, this.aRandomAccessFile1);
						local17 = 0;
						@Pc(132) int local132 = local28 - local110;
						if (local132 > 512) {
							local132 = 512;
						}
						@Pc(150) int local150;
						while (local17 < local132 + 8) {
							local150 = this.aRandomAccessFile1.read(aByteArray4, local17, local132 + 8 - local17);
							if (local150 == -1) {
								return null;
							}
							local17 += local150;
						}
						local150 = ((aByteArray4[0] & 0xFF) << 8) + (aByteArray4[1] & 0xFF);
						@Pc(192) int local192 = ((aByteArray4[2] & 0xFF) << 8) + (aByteArray4[3] & 0xFF);
						@Pc(214) int local214 = ((aByteArray4[4] & 0xFF) << 16) + ((aByteArray4[5] & 0xFF) << 8) + (aByteArray4[6] & 0xFF);
						@Pc(220) int local220 = aByteArray4[7] & 0xFF;
						if (local150 == arg1 && local192 == local112 && local220 == this.anInt290) {
							if (local214 >= 0 && (long) local214 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(247) int local247 = 0; local247 < local132; local247++) {
									local108[local110++] = aByteArray4[local247 + 8];
								}
								local84 = local214;
								local112++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local108;
				} else {
					return null;
				}
			} catch (@Pc(271) IOException local271) {
				return null;
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("98069, " + arg0 + ", " + arg1 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJFFCIDM", name = "a", descriptor = "(IB[BI)Z")
	public synchronized boolean method148(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = this.method149(arg2, arg1, true, arg0);
			if (!local7) {
				local7 = this.method149(arg2, arg1, false, arg0);
			}
			return local7;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("26423, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJFFCIDM", name = "a", descriptor = "(I[BZII)Z")
	private synchronized boolean method149(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(71) int local71;
				@Pc(26) int local26;
				@Pc(37) int local37;
				if (arg2) {
					this.method150(arg0 * 6, this.aRandomAccessFile2);
					for (local26 = 0; local26 < 6; local26 += local37) {
						local37 = this.aRandomAccessFile2.read(aByteArray4, local26, 6 - local26);
						if (local37 == -1) {
							return false;
						}
					}
					local71 = ((aByteArray4[3] & 0xFF) << 16) + ((aByteArray4[4] & 0xFF) << 8) + (aByteArray4[5] & 0xFF);
					if (local71 <= 0 || (long) local71 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local71 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				aByteArray4[0] = (byte) (arg3 >> 16);
				aByteArray4[1] = (byte) (arg3 >> 8);
				aByteArray4[2] = (byte) arg3;
				aByteArray4[3] = (byte) (local71 >> 16);
				aByteArray4[4] = (byte) (local71 >> 8);
				aByteArray4[5] = (byte) local71;
				this.method150(arg0 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray4, 0, 6);
				local26 = 0;
				local37 = 0;
				while (local26 < arg3) {
					@Pc(157) int local157 = 0;
					@Pc(169) int local169;
					if (arg2) {
						this.method150(local71 * 520, this.aRandomAccessFile1);
						@Pc(180) int local180;
						for (local169 = 0; local169 < 8; local169 += local180) {
							local180 = this.aRandomAccessFile1.read(aByteArray4, local169, 8 - local169);
							if (local180 == -1) {
								break;
							}
						}
						if (local169 == 8) {
							local180 = ((aByteArray4[0] & 0xFF) << 8) + (aByteArray4[1] & 0xFF);
							@Pc(221) int local221 = ((aByteArray4[2] & 0xFF) << 8) + (aByteArray4[3] & 0xFF);
							local157 = ((aByteArray4[4] & 0xFF) << 16) + ((aByteArray4[5] & 0xFF) << 8) + (aByteArray4[6] & 0xFF);
							@Pc(249) int local249 = aByteArray4[7] & 0xFF;
							if (local180 != arg0 || local221 != local37 || local249 != this.anInt290) {
								return false;
							}
							if (local157 < 0 || (long) local157 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local157 == 0) {
						arg2 = false;
						local157 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local157 == 0) {
							local157++;
						}
						if (local157 == local71) {
							local157++;
						}
					}
					if (arg3 - local26 <= 512) {
						local157 = 0;
					}
					aByteArray4[0] = (byte) (arg0 >> 8);
					aByteArray4[1] = (byte) arg0;
					aByteArray4[2] = (byte) (local37 >> 8);
					aByteArray4[3] = (byte) local37;
					aByteArray4[4] = (byte) (local157 >> 16);
					aByteArray4[5] = (byte) (local157 >> 8);
					aByteArray4[6] = (byte) local157;
					aByteArray4[7] = (byte) this.anInt290;
					this.method150(local71 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray4, 0, 8);
					local169 = arg3 - local26;
					if (local169 > 512) {
						local169 = 512;
					}
					this.aRandomAccessFile1.write(arg1, local26, local169);
					local26 += local169;
					local71 = local157;
					local37++;
				}
				return true;
			} catch (@Pc(392) IOException local392) {
				return false;
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("43735, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + arg3 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJFFCIDM", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
	private synchronized void method150(@OriginalArg(0) int arg0, @OriginalArg(2) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("67256, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
