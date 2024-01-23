import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class111 {

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	private int anInt3727 = 65000;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!hd;")
	private Class59 aClass59_3 = null;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!hd;")
	private Class59 aClass59_2 = null;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	private int anInt3726;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(ILclient!hd;Lclient!hd;I)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3) {
		this.aClass59_2 = arg2;
		this.anInt3727 = arg3;
		this.anInt3726 = arg0;
		this.aClass59_3 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI[BI)Z")
	private boolean method2989(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class59 local9 = this.aClass59_3;
		synchronized (this.aClass59_3) {
			try {
				@Pc(22) int local22;
				@Pc(43) boolean local43;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass59_2.method1754()) {
						local43 = false;
						return local43;
					}
					this.aClass59_2.method1757((long) (arg0 * 6));
					this.aClass59_2.method1761(0, Static264.aByteArray67, 6);
					local22 = (Static264.aByteArray67[5] & 0xFF) + ((Static264.aByteArray67[3] & 0xFF) << 16) + ((Static264.aByteArray67[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass59_3.method1754() / 520L < (long) local22) {
						local43 = false;
						return local43;
					}
				} else {
					local22 = (int) ((this.aClass59_3.method1754() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static264.aByteArray67[5] = (byte) local22;
				Static264.aByteArray67[4] = (byte) (local22 >> 8);
				Static264.aByteArray67[1] = (byte) (arg3 >> 8);
				Static264.aByteArray67[3] = (byte) (local22 >> 16);
				@Pc(135) int local135 = 0;
				Static264.aByteArray67[2] = (byte) arg3;
				@Pc(142) int local142 = 0;
				Static264.aByteArray67[0] = (byte) (arg3 >> 16);
				this.aClass59_2.method1757((long) (arg0 * 6));
				this.aClass59_2.method1763(0, 6, Static264.aByteArray67);
				while (true) {
					if (local135 < arg3) {
						label139: {
							@Pc(173) int local173 = 0;
							@Pc(232) int local232;
							if (arg1) {
								this.aClass59_3.method1757((long) (local22 * 520));
								try {
									this.aClass59_3.method1761(0, Static264.aByteArray67, 8);
								} catch (@Pc(192) EOFException local192) {
									break label139;
								}
								local173 = ((Static264.aByteArray67[5] & 0xFF) << 8) + ((Static264.aByteArray67[4] & 0xFF) << 16) + (Static264.aByteArray67[6] & 0xFF);
								local232 = ((Static264.aByteArray67[0] & 0xFF) << 8) + (Static264.aByteArray67[1] & 0xFF);
								@Pc(246) int local246 = ((Static264.aByteArray67[2] & 0xFF) << 8) + (Static264.aByteArray67[3] & 0xFF);
								@Pc(252) int local252 = Static264.aByteArray67[7] & 0xFF;
								if (arg0 != local232 || local246 != local142 || local252 != this.anInt3726) {
									local43 = false;
									return local43;
								}
								if (local173 < 0 || this.aClass59_3.method1754() / 520L < (long) local173) {
									local43 = false;
									return local43;
								}
							}
							local232 = arg3 - local135;
							if (local173 == 0) {
								arg1 = false;
								local173 = (int) ((this.aClass59_3.method1754() + 519L) / 520L);
								if (local173 == 0) {
									local173++;
								}
								if (local22 == local173) {
									local173++;
								}
							}
							if (local232 > 512) {
								local232 = 512;
							}
							Static264.aByteArray67[0] = (byte) (arg0 >> 8);
							Static264.aByteArray67[7] = (byte) this.anInt3726;
							Static264.aByteArray67[1] = (byte) arg0;
							Static264.aByteArray67[2] = (byte) (local142 >> 8);
							Static264.aByteArray67[3] = (byte) local142;
							local142++;
							if (arg3 - local135 <= 512) {
								local173 = 0;
							}
							Static264.aByteArray67[5] = (byte) (local173 >> 8);
							Static264.aByteArray67[6] = (byte) local173;
							Static264.aByteArray67[4] = (byte) (local173 >> 16);
							this.aClass59_3.method1757((long) (local22 * 520));
							local22 = local173;
							this.aClass59_3.method1763(0, 8, Static264.aByteArray67);
							this.aClass59_3.method1763(local135, local232, arg2);
							local135 += local232;
							continue;
						}
					}
					local43 = true;
					return local43;
				}
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[B")
	public byte[] method2990(@OriginalArg(1) int arg0) {
		@Pc(9) Class59 local9 = this.aClass59_3;
		synchronized (this.aClass59_3) {
			try {
				@Pc(27) Object local27;
				if (this.aClass59_2.method1754() < (long) (arg0 * 6 + 6)) {
					local27 = null;
					return (byte[]) local27;
				}
				this.aClass59_2.method1757((long) (arg0 * 6));
				this.aClass59_2.method1761(0, Static264.aByteArray67, 6);
				@Pc(67) int local67 = (Static264.aByteArray67[5] & 0xFF) + ((Static264.aByteArray67[3] & 0xFF) << 16) + ((Static264.aByteArray67[4] & 0xFF) << 8);
				@Pc(89) int local89 = ((Static264.aByteArray67[1] & 0xFF) << 8) + ((Static264.aByteArray67[0] & 0xFF) << 16) + (Static264.aByteArray67[2] & 0xFF);
				if (local89 < 0 || this.anInt3727 < local89) {
					local27 = null;
					return (byte[]) local27;
				} else if (local67 <= 0 || (long) local67 > this.aClass59_3.method1754() / 520L) {
					local27 = null;
					return (byte[]) local27;
				} else {
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					@Pc(134) byte[] local134 = new byte[local89];
					while (local131 < local89) {
						if (local67 == 0) {
							local27 = null;
							return (byte[]) local27;
						}
						this.aClass59_3.method1757((long) (local67 * 520));
						@Pc(158) int local158 = local89 - local131;
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass59_3.method1761(0, Static264.aByteArray67, local158 + 8);
						@Pc(188) int local188 = ((Static264.aByteArray67[2] & 0xFF) << 8) + (Static264.aByteArray67[3] & 0xFF);
						@Pc(194) int local194 = Static264.aByteArray67[7] & 0xFF;
						@Pc(208) int local208 = (Static264.aByteArray67[1] & 0xFF) + ((Static264.aByteArray67[0] & 0xFF) << 8);
						@Pc(231) int local231 = ((Static264.aByteArray67[4] & 0xFF) << 16) + (((Static264.aByteArray67[5] & 0xFF) << 8) + (Static264.aByteArray67[6] & 0xFF));
						if (arg0 != local208 || local129 != local188 || local194 != this.anInt3726) {
							local27 = null;
							return (byte[]) local27;
						}
						if (local231 < 0 || this.aClass59_3.method1754() / 520L < (long) local231) {
							local27 = null;
							return (byte[]) local27;
						}
						local129++;
						for (@Pc(277) int local277 = 0; local277 < local158; local277++) {
							local134[local131++] = Static264.aByteArray67[local277 + 8];
						}
						local67 = local231;
					}
					@Pc(297) byte[] local297 = local134;
					return local297;
				}
			} catch (@Pc(301) IOException local301) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3726;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([BIZI)Z")
	public boolean method2991(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class59 local7 = this.aClass59_3;
		synchronized (this.aClass59_3) {
			if (arg2 < 0 || arg2 > this.anInt3727) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method2989(arg1, true, arg0, arg2);
			if (!local29) {
				local29 = this.method2989(arg1, false, arg0, arg2);
			}
			return local29;
		}
	}
}
