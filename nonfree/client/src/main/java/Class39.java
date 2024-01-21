import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UEKAQTXH")
public final class Class39 {

	@OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "[B")
	private static byte[] aByteArray14 = new byte[520];

	@OriginalMember(owner = "client!UEKAQTXH", name = "e", descriptor = "I")
	private int anInt632 = 65000;

	@OriginalMember(owner = "client!UEKAQTXH", name = "d", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!UEKAQTXH", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!UEKAQTXH", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!UEKAQTXH", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
	public Class39(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RandomAccessFile arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt631 = arg2;
			this.aRandomAccessFile1 = arg3;
			this.aRandomAccessFile2 = arg0;
			this.anInt632 = arg1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("94101, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method465(@OriginalArg(1) int arg0) {
		try {
			try {
				this.method468(arg0 * 6, this.aRandomAccessFile2);
				@Pc(24) int local24;
				@Pc(35) int local35;
				for (local24 = 0; local24 < 6; local24 += local35) {
					local35 = this.aRandomAccessFile2.read(aByteArray14, local24, 6 - local24);
					if (local35 == -1) {
						return null;
					}
				}
				local35 = ((aByteArray14[0] & 0xFF) << 16) + ((aByteArray14[1] & 0xFF) << 8) + (aByteArray14[2] & 0xFF);
				@Pc(91) int local91 = ((aByteArray14[3] & 0xFF) << 16) + ((aByteArray14[4] & 0xFF) << 8) + (aByteArray14[5] & 0xFF);
				if (local35 < 0 || local35 > this.anInt632) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(115) byte[] local115 = new byte[local35];
					@Pc(117) int local117 = 0;
					@Pc(119) int local119 = 0;
					while (local117 < local35) {
						if (local91 == 0) {
							return null;
						}
						this.method468(local91 * 520, this.aRandomAccessFile1);
						local24 = 0;
						@Pc(139) int local139 = local35 - local117;
						if (local139 > 512) {
							local139 = 512;
						}
						@Pc(157) int local157;
						while (local24 < local139 + 8) {
							local157 = this.aRandomAccessFile1.read(aByteArray14, local24, local139 + 8 - local24);
							if (local157 == -1) {
								return null;
							}
							local24 += local157;
						}
						local157 = ((aByteArray14[0] & 0xFF) << 8) + (aByteArray14[1] & 0xFF);
						@Pc(199) int local199 = ((aByteArray14[2] & 0xFF) << 8) + (aByteArray14[3] & 0xFF);
						@Pc(221) int local221 = ((aByteArray14[4] & 0xFF) << 16) + ((aByteArray14[5] & 0xFF) << 8) + (aByteArray14[6] & 0xFF);
						@Pc(227) int local227 = aByteArray14[7] & 0xFF;
						if (local157 == arg0 && local199 == local119 && local227 == this.anInt631) {
							if (local221 >= 0 && (long) local221 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(254) int local254 = 0; local254 < local139; local254++) {
									local115[local117++] = aByteArray14[local254 + 8];
								}
								local91 = local221;
								local119++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local115;
				} else {
					return null;
				}
			} catch (@Pc(278) IOException local278) {
				return null;
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("88906, " + 3 + ", " + arg0 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(IB[BI)Z")
	public synchronized boolean method466(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) boolean local17 = this.method467(110, arg2, arg1, arg0, true);
			if (!local17) {
				local17 = this.method467(110, arg2, arg1, arg0, false);
			}
			return local17;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("27504, " + arg0 + ", " + 74 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(II[BIZ)Z")
	private synchronized boolean method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(62) int local62;
				@Pc(17) int local17;
				@Pc(28) int local28;
				if (arg4) {
					this.method468(arg1 * 6, this.aRandomAccessFile2);
					for (local17 = 0; local17 < 6; local17 += local28) {
						local28 = this.aRandomAccessFile2.read(aByteArray14, local17, 6 - local17);
						if (local28 == -1) {
							return false;
						}
					}
					local62 = ((aByteArray14[3] & 0xFF) << 16) + ((aByteArray14[4] & 0xFF) << 8) + (aByteArray14[5] & 0xFF);
					if (local62 <= 0 || (long) local62 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local62 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local62 == 0) {
						local62 = 1;
					}
				}
				aByteArray14[0] = (byte) (arg3 >> 16);
				aByteArray14[1] = (byte) (arg3 >> 8);
				aByteArray14[2] = (byte) arg3;
				aByteArray14[3] = (byte) (local62 >> 16);
				aByteArray14[4] = (byte) (local62 >> 8);
				aByteArray14[5] = (byte) local62;
				this.method468(arg1 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray14, 0, 6);
				local17 = 0;
				local28 = 0;
				while (local17 < arg3) {
					@Pc(148) int local148 = 0;
					@Pc(160) int local160;
					if (arg4) {
						this.method468(local62 * 520, this.aRandomAccessFile1);
						@Pc(171) int local171;
						for (local160 = 0; local160 < 8; local160 += local171) {
							local171 = this.aRandomAccessFile1.read(aByteArray14, local160, 8 - local160);
							if (local171 == -1) {
								break;
							}
						}
						if (local160 == 8) {
							local171 = ((aByteArray14[0] & 0xFF) << 8) + (aByteArray14[1] & 0xFF);
							@Pc(212) int local212 = ((aByteArray14[2] & 0xFF) << 8) + (aByteArray14[3] & 0xFF);
							local148 = ((aByteArray14[4] & 0xFF) << 16) + ((aByteArray14[5] & 0xFF) << 8) + (aByteArray14[6] & 0xFF);
							@Pc(240) int local240 = aByteArray14[7] & 0xFF;
							if (local171 != arg1 || local212 != local28 || local240 != this.anInt631) {
								return false;
							}
							if (local148 < 0 || (long) local148 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local148 == 0) {
						arg4 = false;
						local148 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local148 == 0) {
							local148++;
						}
						if (local148 == local62) {
							local148++;
						}
					}
					if (arg3 - local17 <= 512) {
						local148 = 0;
					}
					aByteArray14[0] = (byte) (arg1 >> 8);
					aByteArray14[1] = (byte) arg1;
					aByteArray14[2] = (byte) (local28 >> 8);
					aByteArray14[3] = (byte) local28;
					aByteArray14[4] = (byte) (local148 >> 16);
					aByteArray14[5] = (byte) (local148 >> 8);
					aByteArray14[6] = (byte) local148;
					aByteArray14[7] = (byte) this.anInt631;
					this.method468(local62 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray14, 0, 8);
					local160 = arg3 - local17;
					if (local160 > 512) {
						local160 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local17, local160);
					local17 += local160;
					local62 = local148;
					local28++;
				}
				return true;
			} catch (@Pc(383) IOException local383) {
				return false;
			}
		} catch (@Pc(386) RuntimeException local386) {
			signlink.reporterror("58706, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
	private synchronized void method468(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1) throws IOException {
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
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("77838, " + arg0 + ", " + arg1 + ", " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
