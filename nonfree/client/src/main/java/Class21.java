import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KQOBJHBO")
public final class Class21 {

	@OriginalMember(owner = "client!KQOBJHBO", name = "b", descriptor = "[B")
	private static byte[] aByteArray4 = new byte[520];

	@OriginalMember(owner = "client!KQOBJHBO", name = "a", descriptor = "I")
	private int anInt382 = 4;

	@OriginalMember(owner = "client!KQOBJHBO", name = "f", descriptor = "I")
	private int anInt384 = 65000;

	@OriginalMember(owner = "client!KQOBJHBO", name = "e", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!KQOBJHBO", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!KQOBJHBO", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!KQOBJHBO", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) RandomAccessFile arg1, @OriginalArg(2) RandomAccessFile arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt383 = arg0;
			this.aRandomAccessFile1 = arg1;
			this.aRandomAccessFile2 = arg2;
			this.anInt384 = arg3;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("81667, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQOBJHBO", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method288(@OriginalArg(0) int arg0) {
		try {
			try {
				this.method291(this.aRandomAccessFile2, arg0 * 6);
				@Pc(20) int local20;
				@Pc(31) int local31;
				for (local20 = 0; local20 < 6; local20 += local31) {
					local31 = this.aRandomAccessFile2.read(aByteArray4, local20, 6 - local20);
					if (local31 == -1) {
						return null;
					}
				}
				local31 = ((aByteArray4[0] & 0xFF) << 16) + ((aByteArray4[1] & 0xFF) << 8) + (aByteArray4[2] & 0xFF);
				@Pc(87) int local87 = ((aByteArray4[3] & 0xFF) << 16) + ((aByteArray4[4] & 0xFF) << 8) + (aByteArray4[5] & 0xFF);
				if (local31 < 0 || local31 > this.anInt384) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(111) byte[] local111 = new byte[local31];
					@Pc(113) int local113 = 0;
					@Pc(115) int local115 = 0;
					while (local113 < local31) {
						if (local87 == 0) {
							return null;
						}
						this.method291(this.aRandomAccessFile1, local87 * 520);
						local20 = 0;
						@Pc(135) int local135 = local31 - local113;
						if (local135 > 512) {
							local135 = 512;
						}
						@Pc(153) int local153;
						while (local20 < local135 + 8) {
							local153 = this.aRandomAccessFile1.read(aByteArray4, local20, local135 + 8 - local20);
							if (local153 == -1) {
								return null;
							}
							local20 += local153;
						}
						local153 = ((aByteArray4[0] & 0xFF) << 8) + (aByteArray4[1] & 0xFF);
						@Pc(195) int local195 = ((aByteArray4[2] & 0xFF) << 8) + (aByteArray4[3] & 0xFF);
						@Pc(217) int local217 = ((aByteArray4[4] & 0xFF) << 16) + ((aByteArray4[5] & 0xFF) << 8) + (aByteArray4[6] & 0xFF);
						@Pc(223) int local223 = aByteArray4[7] & 0xFF;
						if (local153 == arg0 && local195 == local115 && local223 == this.anInt383) {
							if (local217 >= 0 && (long) local217 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(250) int local250 = 0; local250 < local135; local250++) {
									local111[local113++] = aByteArray4[local250 + 8];
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
			signlink.reporterror("71787, " + arg0 + ", " + 0 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQOBJHBO", name = "a", descriptor = "([BIII)Z")
	public synchronized boolean method289(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(14) boolean local14 = this.method290(arg1, arg2, this.anInt382, arg0, true);
			if (!local14) {
				local14 = this.method290(arg1, arg2, this.anInt382, arg0, false);
			}
			return local14;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("93201, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQOBJHBO", name = "a", descriptor = "(III[BZ)Z")
	private synchronized boolean method290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) boolean arg4) {
		try {
			if (arg2 != 4) {
				throw new NullPointerException();
			}
			try {
				@Pc(65) int local65;
				@Pc(20) int local20;
				@Pc(31) int local31;
				if (arg4) {
					this.method291(this.aRandomAccessFile2, arg0 * 6);
					for (local20 = 0; local20 < 6; local20 += local31) {
						local31 = this.aRandomAccessFile2.read(aByteArray4, local20, 6 - local20);
						if (local31 == -1) {
							return false;
						}
					}
					local65 = ((aByteArray4[3] & 0xFF) << 16) + ((aByteArray4[4] & 0xFF) << 8) + (aByteArray4[5] & 0xFF);
					if (local65 <= 0 || (long) local65 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local65 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				aByteArray4[0] = (byte) (arg1 >> 16);
				aByteArray4[1] = (byte) (arg1 >> 8);
				aByteArray4[2] = (byte) arg1;
				aByteArray4[3] = (byte) (local65 >> 16);
				aByteArray4[4] = (byte) (local65 >> 8);
				aByteArray4[5] = (byte) local65;
				this.method291(this.aRandomAccessFile2, arg0 * 6);
				this.aRandomAccessFile2.write(aByteArray4, 0, 6);
				local20 = 0;
				local31 = 0;
				while (local20 < arg1) {
					@Pc(151) int local151 = 0;
					@Pc(163) int local163;
					if (arg4) {
						this.method291(this.aRandomAccessFile1, local65 * 520);
						@Pc(174) int local174;
						for (local163 = 0; local163 < 8; local163 += local174) {
							local174 = this.aRandomAccessFile1.read(aByteArray4, local163, 8 - local163);
							if (local174 == -1) {
								break;
							}
						}
						if (local163 == 8) {
							local174 = ((aByteArray4[0] & 0xFF) << 8) + (aByteArray4[1] & 0xFF);
							@Pc(215) int local215 = ((aByteArray4[2] & 0xFF) << 8) + (aByteArray4[3] & 0xFF);
							local151 = ((aByteArray4[4] & 0xFF) << 16) + ((aByteArray4[5] & 0xFF) << 8) + (aByteArray4[6] & 0xFF);
							@Pc(243) int local243 = aByteArray4[7] & 0xFF;
							if (local174 != arg0 || local215 != local31 || local243 != this.anInt383) {
								return false;
							}
							if (local151 < 0 || (long) local151 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local151 == 0) {
						arg4 = false;
						local151 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local151 == 0) {
							local151++;
						}
						if (local151 == local65) {
							local151++;
						}
					}
					if (arg1 - local20 <= 512) {
						local151 = 0;
					}
					aByteArray4[0] = (byte) (arg0 >> 8);
					aByteArray4[1] = (byte) arg0;
					aByteArray4[2] = (byte) (local31 >> 8);
					aByteArray4[3] = (byte) local31;
					aByteArray4[4] = (byte) (local151 >> 16);
					aByteArray4[5] = (byte) (local151 >> 8);
					aByteArray4[6] = (byte) local151;
					aByteArray4[7] = (byte) this.anInt383;
					this.method291(this.aRandomAccessFile1, local65 * 520);
					this.aRandomAccessFile1.write(aByteArray4, 0, 8);
					local163 = arg1 - local20;
					if (local163 > 512) {
						local163 = 512;
					}
					this.aRandomAccessFile1.write(arg3, local20, local163);
					local20 += local163;
					local65 = local151;
					local31++;
				}
				return true;
			} catch (@Pc(386) IOException local386) {
				return false;
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("81949, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQOBJHBO", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method291(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(35) Exception local35) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("15206, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
