import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RZNFVLPG")
public final class Class32 {

	@OriginalMember(owner = "client!RZNFVLPG", name = "d", descriptor = "[B")
	private static byte[] aByteArray14 = new byte[520];

	@OriginalMember(owner = "client!RZNFVLPG", name = "a", descriptor = "I")
	private int anInt446 = -24385;

	@OriginalMember(owner = "client!RZNFVLPG", name = "b", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!RZNFVLPG", name = "c", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!RZNFVLPG", name = "h", descriptor = "I")
	private int anInt448 = 65000;

	@OriginalMember(owner = "client!RZNFVLPG", name = "g", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!RZNFVLPG", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!RZNFVLPG", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!RZNFVLPG", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ZIILjava/io/RandomAccessFile;)V")
	public Class32(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			this.anInt447 = arg2;
			this.aRandomAccessFile1 = arg0;
			this.aRandomAccessFile2 = arg4;
			this.anInt448 = arg3;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("10126, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZNFVLPG", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 8 || arg0 > 8) {
				this.anInt446 = -105;
			}
			try {
				this.method353(this.aRandomAccessFile2, arg1 * 6);
				@Pc(20) int local20;
				@Pc(31) int local31;
				for (local20 = 0; local20 < 6; local20 += local31) {
					local31 = this.aRandomAccessFile2.read(aByteArray14, local20, 6 - local20);
					if (local31 == -1) {
						return null;
					}
				}
				local31 = ((aByteArray14[0] & 0xFF) << 16) + ((aByteArray14[1] & 0xFF) << 8) + (aByteArray14[2] & 0xFF);
				@Pc(87) int local87 = ((aByteArray14[3] & 0xFF) << 16) + ((aByteArray14[4] & 0xFF) << 8) + (aByteArray14[5] & 0xFF);
				if (local31 < 0 || local31 > this.anInt448) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(111) byte[] local111 = new byte[local31];
					@Pc(113) int local113 = 0;
					@Pc(115) int local115 = 0;
					while (local113 < local31) {
						if (local87 == 0) {
							return null;
						}
						this.method353(this.aRandomAccessFile1, local87 * 520);
						local20 = 0;
						@Pc(135) int local135 = local31 - local113;
						if (local135 > 512) {
							local135 = 512;
						}
						@Pc(153) int local153;
						while (local20 < local135 + 8) {
							local153 = this.aRandomAccessFile1.read(aByteArray14, local20, local135 + 8 - local20);
							if (local153 == -1) {
								return null;
							}
							local20 += local153;
						}
						local153 = ((aByteArray14[0] & 0xFF) << 8) + (aByteArray14[1] & 0xFF);
						@Pc(195) int local195 = ((aByteArray14[2] & 0xFF) << 8) + (aByteArray14[3] & 0xFF);
						@Pc(217) int local217 = ((aByteArray14[4] & 0xFF) << 16) + ((aByteArray14[5] & 0xFF) << 8) + (aByteArray14[6] & 0xFF);
						@Pc(223) int local223 = aByteArray14[7] & 0xFF;
						if (local153 == arg1 && local195 == local115 && local223 == this.anInt447) {
							if (local217 >= 0 && (long) local217 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(250) int local250 = 0; local250 < local135; local250++) {
									local111[local113++] = aByteArray14[local250 + 8];
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
			signlink.reporterror("57280, " + arg0 + ", " + arg1 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZNFVLPG", name = "a", descriptor = "(BII[B)Z")
	public synchronized boolean method351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(18) boolean local18 = this.method352(true, arg1, arg2, arg0);
			if (!local18) {
				local18 = this.method352(false, arg1, arg2, arg0);
			}
			return local18;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("76614, " + -43 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZNFVLPG", name = "a", descriptor = "(ZII[BI)Z")
	private synchronized boolean method352(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(63) int local63;
				@Pc(18) int local18;
				@Pc(29) int local29;
				if (arg0) {
					this.method353(this.aRandomAccessFile2, arg3 * 6);
					for (local18 = 0; local18 < 6; local18 += local29) {
						local29 = this.aRandomAccessFile2.read(aByteArray14, local18, 6 - local18);
						if (local29 == -1) {
							return false;
						}
					}
					local63 = ((aByteArray14[3] & 0xFF) << 16) + ((aByteArray14[4] & 0xFF) << 8) + (aByteArray14[5] & 0xFF);
					if (local63 <= 0 || (long) local63 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local63 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local63 == 0) {
						local63 = 1;
					}
				}
				aByteArray14[0] = (byte) (arg1 >> 16);
				aByteArray14[1] = (byte) (arg1 >> 8);
				aByteArray14[2] = (byte) arg1;
				aByteArray14[3] = (byte) (local63 >> 16);
				aByteArray14[4] = (byte) (local63 >> 8);
				aByteArray14[5] = (byte) local63;
				this.method353(this.aRandomAccessFile2, arg3 * 6);
				this.aRandomAccessFile2.write(aByteArray14, 0, 6);
				local18 = 0;
				local29 = 0;
				while (local18 < arg1) {
					@Pc(149) int local149 = 0;
					@Pc(161) int local161;
					if (arg0) {
						this.method353(this.aRandomAccessFile1, local63 * 520);
						@Pc(172) int local172;
						for (local161 = 0; local161 < 8; local161 += local172) {
							local172 = this.aRandomAccessFile1.read(aByteArray14, local161, 8 - local161);
							if (local172 == -1) {
								break;
							}
						}
						if (local161 == 8) {
							local172 = ((aByteArray14[0] & 0xFF) << 8) + (aByteArray14[1] & 0xFF);
							@Pc(213) int local213 = ((aByteArray14[2] & 0xFF) << 8) + (aByteArray14[3] & 0xFF);
							local149 = ((aByteArray14[4] & 0xFF) << 16) + ((aByteArray14[5] & 0xFF) << 8) + (aByteArray14[6] & 0xFF);
							@Pc(241) int local241 = aByteArray14[7] & 0xFF;
							if (local172 != arg3 || local213 != local29 || local241 != this.anInt447) {
								return false;
							}
							if (local149 < 0 || (long) local149 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local149 == 0) {
						arg0 = false;
						local149 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local149 == 0) {
							local149++;
						}
						if (local149 == local63) {
							local149++;
						}
					}
					if (arg1 - local18 <= 512) {
						local149 = 0;
					}
					aByteArray14[0] = (byte) (arg3 >> 8);
					aByteArray14[1] = (byte) arg3;
					aByteArray14[2] = (byte) (local29 >> 8);
					aByteArray14[3] = (byte) local29;
					aByteArray14[4] = (byte) (local149 >> 16);
					aByteArray14[5] = (byte) (local149 >> 8);
					aByteArray14[6] = (byte) local149;
					aByteArray14[7] = (byte) this.anInt447;
					this.method353(this.aRandomAccessFile1, local63 * 520);
					this.aRandomAccessFile1.write(aByteArray14, 0, 8);
					local161 = arg1 - local18;
					if (local161 > 512) {
						local161 = 512;
					}
					this.aRandomAccessFile1.write(arg2, local18, local161);
					local18 += local161;
					local63 = local149;
					local29++;
				}
				return true;
			} catch (@Pc(384) IOException local384) {
				return false;
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("36530, " + arg0 + ", " + -913 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZNFVLPG", name = "a", descriptor = "(ZLjava/io/RandomAccessFile;I)V")
	private synchronized void method353(@OriginalArg(1) RandomAccessFile arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (arg1 < 0 || arg1 > 62914560) {
				System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
				arg1 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (@Pc(34) Exception local34) {
				}
			}
			arg0.seek((long) arg1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("66929, " + false + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
