import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class402 {

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
	private int anInt10858 = 65000;

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "Lclient!nk;")
	private Class260 aClass260_4 = null;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "Lclient!nk;")
	private Class260 aClass260_5 = null;

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
	private final int anInt10856;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(ILclient!nk;Lclient!nk;I)V")
	public Class402(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class260 arg2, @OriginalArg(3) int arg3) {
		this.aClass260_5 = arg2;
		this.anInt10858 = arg3;
		this.aClass260_4 = arg1;
		this.anInt10856 = arg0;
	}

	@OriginalMember(owner = "client!wia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt10856;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II[BI)Z")
	public boolean method9472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(14) Class260 local14 = this.aClass260_4;
		synchronized (this.aClass260_4) {
			if (arg0 < 0 || arg0 > this.anInt10858) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method9474(arg2, arg1, arg0, true);
			if (!local35) {
				local35 = this.method9474(arg2, arg1, arg0, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)[B")
	public byte[] method9473(@OriginalArg(0) int arg0) {
		@Pc(8) Class260 local8 = this.aClass260_4;
		synchronized (this.aClass260_4) {
			try {
				if (this.aClass260_5.method6267() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass260_5.method6257((long) (arg0 * 6));
				this.aClass260_5.method6266(Static154.aByteArray30, 6, 0);
				@Pc(65) int local65 = ((Static154.aByteArray30[1] & 0xFF) << 8) + ((Static154.aByteArray30[0] & 0xFF) << 16) + (Static154.aByteArray30[2] & 0xFF);
				@Pc(87) int local87 = (Static154.aByteArray30[5] & 0xFF) + ((Static154.aByteArray30[4] & 0xFF) << 8) + ((Static154.aByteArray30[3] & 0xFF) << 16);
				if (local65 < 0 || this.anInt10858 < local65) {
					return null;
				} else if (local87 > 0 && this.aClass260_4.method6267() / 520L >= (long) local87) {
					@Pc(127) byte[] local127 = new byte[local65];
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					label55: while (local65 > local129) {
						if (local87 == 0) {
							return null;
						}
						this.aClass260_4.method6257((long) (local87 * 520));
						@Pc(155) int local155 = local65 - local129;
						if (local155 > 512) {
							local155 = 512;
						}
						this.aClass260_4.method6266(Static154.aByteArray30, local155 + 8, 0);
						@Pc(184) int local184 = ((Static154.aByteArray30[0] & 0xFF) << 8) + (Static154.aByteArray30[1] & 0xFF);
						@Pc(199) int local199 = ((Static154.aByteArray30[2] & 0xFF) << 8) + (Static154.aByteArray30[3] & 0xFF);
						@Pc(223) int local223 = ((Static154.aByteArray30[4] & 0xFF) << 16) - (-((Static154.aByteArray30[5] & 0xFF) << 8) - (Static154.aByteArray30[6] & 0xFF));
						@Pc(229) int local229 = Static154.aByteArray30[7] & 0xFF;
						if (local184 == arg0 && local131 == local199 && local229 == this.anInt10856) {
							if (local223 >= 0 && (long) local223 <= this.aClass260_4.method6267() / 520L) {
								local87 = local223;
								local131++;
								@Pc(286) int local286 = 0;
								while (true) {
									if (local155 <= local286) {
										continue label55;
									}
									local127[local129++] = Static154.aByteArray30[local286 + 8];
									local286++;
								}
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(321) IOException local321) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z[BIIZ)Z")
	private boolean method9474(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class260 local8 = this.aClass260_4;
		synchronized (this.aClass260_4) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass260_5.method6267()) {
						return false;
					}
					this.aClass260_5.method6257((long) (arg1 * 6));
					this.aClass260_5.method6266(Static154.aByteArray30, 6, 0);
					local22 = (Static154.aByteArray30[5] & 0xFF) + ((Static154.aByteArray30[3] & 0xFF) << 16) + ((Static154.aByteArray30[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass260_4.method6267() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass260_4.method6267() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static154.aByteArray30[5] = (byte) local22;
				Static154.aByteArray30[2] = (byte) arg2;
				Static154.aByteArray30[4] = (byte) (local22 >> 8);
				Static154.aByteArray30[3] = (byte) (local22 >> 16);
				Static154.aByteArray30[0] = (byte) (arg2 >> 16);
				Static154.aByteArray30[1] = (byte) (arg2 >> 8);
				this.aClass260_5.method6257((long) (arg1 * 6));
				this.aClass260_5.method6263(6, 0, Static154.aByteArray30);
				@Pc(171) int local171 = 0;
				@Pc(173) int local173 = 0;
				while (true) {
					if (local171 < arg2) {
						label102: {
							@Pc(179) int local179 = 0;
							@Pc(215) int local215;
							if (arg3) {
								this.aClass260_4.method6257((long) (local22 * 520));
								try {
									this.aClass260_4.method6266(Static154.aByteArray30, 8, 0);
								} catch (@Pc(199) EOFException local199) {
									break label102;
								}
								local215 = (Static154.aByteArray30[1] & 0xFF) + ((Static154.aByteArray30[0] & 0xFF) << 8);
								local179 = ((Static154.aByteArray30[4] & 0xFF) << 16) + ((Static154.aByteArray30[5] & 0xFF) << 8) + (Static154.aByteArray30[6] & 0xFF);
								@Pc(252) int local252 = ((Static154.aByteArray30[2] & 0xFF) << 8) + (Static154.aByteArray30[3] & 0xFF);
								@Pc(258) int local258 = Static154.aByteArray30[7] & 0xFF;
								if (arg1 != local215 || local252 != local173 || this.anInt10856 != local258) {
									return false;
								}
								if (local179 < 0 || this.aClass260_4.method6267() / 520L < (long) local179) {
									return false;
								}
							}
							if (local179 == 0) {
								arg3 = false;
								local179 = (int) ((this.aClass260_4.method6267() + 519L) / 520L);
								if (local179 == 0) {
									local179++;
								}
								if (local179 == local22) {
									local179++;
								}
							}
							if (arg2 - local171 <= 512) {
								local179 = 0;
							}
							Static154.aByteArray30[0] = (byte) (arg1 >> 8);
							Static154.aByteArray30[2] = (byte) (local173 >> 8);
							Static154.aByteArray30[3] = (byte) local173;
							Static154.aByteArray30[1] = (byte) arg1;
							Static154.aByteArray30[5] = (byte) (local179 >> 8);
							Static154.aByteArray30[4] = (byte) (local179 >> 16);
							Static154.aByteArray30[6] = (byte) local179;
							Static154.aByteArray30[7] = (byte) this.anInt10856;
							this.aClass260_4.method6257((long) (local22 * 520));
							this.aClass260_4.method6263(8, 0, Static154.aByteArray30);
							local215 = arg2 - local171;
							if (local215 > 512) {
								local215 = 512;
							}
							this.aClass260_4.method6263(local215, local171, arg0);
							local173++;
							local22 = local179;
							local171 += local215;
							continue;
						}
					}
					@Pc(447) boolean local447 = true;
					return true;
				}
			} catch (@Pc(452) IOException local452) {
				return false;
			}
		}
	}
}
