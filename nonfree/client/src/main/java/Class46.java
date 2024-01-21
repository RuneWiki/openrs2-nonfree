import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class46 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
	private static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	private int anInt990 = 901;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private int anInt992 = 65000;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(BLjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
	public Class46(@OriginalArg(0) byte arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt991 = arg4;
			this.aRandomAccessFile2 = arg1;
			this.aRandomAccessFile3 = arg2;
			this.anInt992 = arg3;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("94944, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				this.method673(arg1 * 6, (byte) 2, this.aRandomAccessFile3);
				@Pc(15) int local15;
				@Pc(26) int local26;
				for (local15 = 0; local15 < 6; local15 += local26) {
					local26 = this.aRandomAccessFile3.read(aByteArray20, local15, 6 - local15);
					if (local26 == -1) {
						return null;
					}
				}
				local26 = ((aByteArray20[0] & 0xFF) << 16) + ((aByteArray20[1] & 0xFF) << 8) + (aByteArray20[2] & 0xFF);
				@Pc(82) int local82 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
				if (local26 < 0 || local26 > this.anInt992) {
					return null;
				} else if (local82 > 0 && (long) local82 <= this.aRandomAccessFile2.length() / 520L) {
					@Pc(106) byte[] local106 = new byte[local26];
					@Pc(108) int local108 = 0;
					@Pc(110) int local110 = 0;
					while (local108 < local26) {
						if (local82 == 0) {
							return null;
						}
						this.method673(local82 * 520, (byte) 2, this.aRandomAccessFile2);
						local15 = 0;
						@Pc(130) int local130 = local26 - local108;
						if (local130 > 512) {
							local130 = 512;
						}
						@Pc(148) int local148;
						while (local15 < local130 + 8) {
							local148 = this.aRandomAccessFile2.read(aByteArray20, local15, local130 + 8 - local15);
							if (local148 == -1) {
								return null;
							}
							local15 += local148;
						}
						local148 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
						@Pc(190) int local190 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
						@Pc(212) int local212 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
						@Pc(218) int local218 = aByteArray20[7] & 0xFF;
						if (local148 == arg1 && local190 == local110 && local218 == this.anInt991) {
							if (local212 >= 0 && (long) local212 <= this.aRandomAccessFile2.length() / 520L) {
								for (@Pc(245) int local245 = 0; local245 < local130; local245++) {
									local106[local108++] = aByteArray20[local245 + 8];
								}
								local82 = local212;
								local110++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local106;
				} else {
					return null;
				}
			} catch (@Pc(269) IOException local269) {
				return null;
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("32818, " + arg0 + ", " + arg1 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[BBI)Z")
	public synchronized boolean method671(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 != 8) {
				throw new NullPointerException();
			}
			@Pc(4) boolean local4 = false;
			@Pc(17) boolean local17 = this.method672(true, arg1, arg0, arg3);
			if (!local17) {
				local17 = this.method672(false, arg1, arg0, arg3);
			}
			return local17;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("61366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[BIII)Z")
	private synchronized boolean method672(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(63) int local63;
				@Pc(18) int local18;
				@Pc(29) int local29;
				if (arg0) {
					this.method673(arg2 * 6, (byte) 2, this.aRandomAccessFile3);
					for (local18 = 0; local18 < 6; local18 += local29) {
						local29 = this.aRandomAccessFile3.read(aByteArray20, local18, 6 - local18);
						if (local29 == -1) {
							return false;
						}
					}
					local63 = ((aByteArray20[3] & 0xFF) << 16) + ((aByteArray20[4] & 0xFF) << 8) + (aByteArray20[5] & 0xFF);
					if (local63 <= 0 || (long) local63 > this.aRandomAccessFile2.length() / 520L) {
						return false;
					}
				} else {
					local63 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
					if (local63 == 0) {
						local63 = 1;
					}
				}
				aByteArray20[0] = (byte) (arg3 >> 16);
				aByteArray20[1] = (byte) (arg3 >> 8);
				aByteArray20[2] = (byte) arg3;
				aByteArray20[3] = (byte) (local63 >> 16);
				aByteArray20[4] = (byte) (local63 >> 8);
				aByteArray20[5] = (byte) local63;
				this.method673(arg2 * 6, (byte) 2, this.aRandomAccessFile3);
				this.aRandomAccessFile3.write(aByteArray20, 0, 6);
				local18 = 0;
				local29 = 0;
				while (local18 < arg3) {
					@Pc(149) int local149 = 0;
					@Pc(161) int local161;
					if (arg0) {
						this.method673(local63 * 520, (byte) 2, this.aRandomAccessFile2);
						@Pc(172) int local172;
						for (local161 = 0; local161 < 8; local161 += local172) {
							local172 = this.aRandomAccessFile2.read(aByteArray20, local161, 8 - local161);
							if (local172 == -1) {
								break;
							}
						}
						if (local161 == 8) {
							local172 = ((aByteArray20[0] & 0xFF) << 8) + (aByteArray20[1] & 0xFF);
							@Pc(213) int local213 = ((aByteArray20[2] & 0xFF) << 8) + (aByteArray20[3] & 0xFF);
							local149 = ((aByteArray20[4] & 0xFF) << 16) + ((aByteArray20[5] & 0xFF) << 8) + (aByteArray20[6] & 0xFF);
							@Pc(241) int local241 = aByteArray20[7] & 0xFF;
							if (local172 != arg2 || local213 != local29 || local241 != this.anInt991) {
								return false;
							}
							if (local149 < 0 || (long) local149 > this.aRandomAccessFile2.length() / 520L) {
								return false;
							}
						}
					}
					if (local149 == 0) {
						arg0 = false;
						local149 = (int) ((this.aRandomAccessFile2.length() + 519L) / 520L);
						if (local149 == 0) {
							local149++;
						}
						if (local149 == local63) {
							local149++;
						}
					}
					if (arg3 - local18 <= 512) {
						local149 = 0;
					}
					aByteArray20[0] = (byte) (arg2 >> 8);
					aByteArray20[1] = (byte) arg2;
					aByteArray20[2] = (byte) (local29 >> 8);
					aByteArray20[3] = (byte) local29;
					aByteArray20[4] = (byte) (local149 >> 16);
					aByteArray20[5] = (byte) (local149 >> 8);
					aByteArray20[6] = (byte) local149;
					aByteArray20[7] = (byte) this.anInt991;
					this.method673(local63 * 520, (byte) 2, this.aRandomAccessFile2);
					this.aRandomAccessFile2.write(aByteArray20, 0, 8);
					local161 = arg3 - local18;
					if (local161 > 512) {
						local161 = 512;
					}
					this.aRandomAccessFile2.write(arg1, local18, local161);
					local18 += local161;
					local63 = local149;
					local29++;
				}
				return true;
			} catch (@Pc(384) IOException local384) {
				return false;
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("6292, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBLjava/io/RandomAccessFile;)V")
	private synchronized void method673(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) RandomAccessFile arg2) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(24) Exception local24) {
				}
			}
			arg2.seek((long) arg0);
			@Pc(34) boolean local34 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("57023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
