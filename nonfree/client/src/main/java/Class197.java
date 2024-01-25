import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class197 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	private int anInt4724 = 65000;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!js;")
	private Class128 aClass128_4 = null;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!js;")
	private Class128 aClass128_5 = null;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	private final int anInt4728;

	static {
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(ILclient!js;Lclient!js;I)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) int arg3) {
		this.aClass128_5 = arg1;
		this.anInt4724 = arg3;
		this.anInt4728 = arg0;
		this.aClass128_4 = arg2;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[B")
	public byte[] method4169(@OriginalArg(0) int arg0) {
		@Pc(8) Class128 local8 = this.aClass128_5;
		synchronized (this.aClass128_5) {
			try {
				if (this.aClass128_4.method2964() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass128_4.method2974((long) (arg0 * 6));
				this.aClass128_4.method2972(6, 0, Static378.aByteArray113);
				@Pc(66) int local66 = ((Static378.aByteArray113[1] & 0xFF) << 8) + ((Static378.aByteArray113[0] & 0xFF) << 16) + (Static378.aByteArray113[2] & 0xFF);
				@Pc(89) int local89 = ((Static378.aByteArray113[4] & 0xFF) << 8) + (((Static378.aByteArray113[3] & 0xFF) << 16) + (Static378.aByteArray113[5] & 0xFF));
				if (local66 < 0 || local66 > this.anInt4724) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aClass128_5.method2964() / 520L) {
					@Pc(132) byte[] local132 = new byte[local66];
					@Pc(134) int local134 = 0;
					@Pc(144) int local144 = 0;
					while (local66 > local134) {
						if (local89 == 0) {
							return null;
						}
						this.aClass128_5.method2974((long) (local89 * 520));
						@Pc(166) int local166 = local66 - local134;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass128_5.method2972(local166 + 8, 0, Static378.aByteArray113);
						@Pc(194) int local194 = (Static378.aByteArray113[1] & 0xFF) + ((Static378.aByteArray113[0] & 0xFF) << 8);
						@Pc(208) int local208 = ((Static378.aByteArray113[2] & 0xFF) << 8) + (Static378.aByteArray113[3] & 0xFF);
						@Pc(230) int local230 = ((Static378.aByteArray113[5] & 0xFF) << 8) + (Static378.aByteArray113[4] << 16 & 0xFF0000) + (Static378.aByteArray113[6] & 0xFF);
						@Pc(236) int local236 = Static378.aByteArray113[7] & 0xFF;
						if (local194 == arg0 && local208 == local144 && local236 == this.anInt4728) {
							if (local230 >= 0 && this.aClass128_5.method2964() / 520L >= (long) local230) {
								local144++;
								for (@Pc(284) int local284 = 0; local284 < local166; local284++) {
									local132[local134++] = Static378.aByteArray113[local284 + 8];
								}
								local89 = local230;
								continue;
							}
							return null;
						}
						return null;
					}
					return local132;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BII)Z")
	public boolean method4170(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class128 local6 = this.aClass128_5;
		synchronized (this.aClass128_5) {
			if (arg2 < 0 || this.anInt4724 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method4172(arg1, true, arg0, arg2);
			if (!local30) {
				local30 = this.method4172(arg1, false, arg0, arg2);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!q", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4728;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([BZIZI)Z")
	private boolean method4172(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class128 local8 = this.aClass128_5;
		synchronized (this.aClass128_5) {
			try {
				@Pc(68) int local68;
				if (arg1) {
					if ((long) (arg2 * 6 + 6) > this.aClass128_4.method2964()) {
						return false;
					}
					this.aClass128_4.method2974((long) (arg2 * 6));
					this.aClass128_4.method2972(6, 0, Static378.aByteArray113);
					local68 = ((Static378.aByteArray113[4] & 0xFF) << 8) + (((Static378.aByteArray113[3] & 0xFF) << 16) + (Static378.aByteArray113[5] & 0xFF));
					if (local68 <= 0 || this.aClass128_5.method2964() / 520L < (long) local68) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass128_5.method2964() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static378.aByteArray113[5] = (byte) local68;
				Static378.aByteArray113[0] = (byte) (arg3 >> 16);
				Static378.aByteArray113[2] = (byte) arg3;
				Static378.aByteArray113[1] = (byte) (arg3 >> 8);
				Static378.aByteArray113[4] = (byte) (local68 >> 8);
				Static378.aByteArray113[3] = (byte) (local68 >> 16);
				this.aClass128_4.method2974((long) (arg2 * 6));
				this.aClass128_4.method2971(0, 6, Static378.aByteArray113);
				@Pc(165) int local165 = 0;
				@Pc(167) int local167 = 0;
				while (arg3 > local165) {
					@Pc(171) int local171 = 0;
					@Pc(207) int local207;
					if (arg1) {
						this.aClass128_5.method2974((long) (local68 * 520));
						try {
							this.aClass128_5.method2972(8, 0, Static378.aByteArray113);
						} catch (@Pc(190) EOFException local190) {
							return true;
						}
						local207 = ((Static378.aByteArray113[0] & 0xFF) << 8) + (Static378.aByteArray113[1] & 0xFF);
						@Pc(222) int local222 = ((Static378.aByteArray113[2] & 0xFF) << 8) + (Static378.aByteArray113[3] & 0xFF);
						local171 = (Static378.aByteArray113[6] & 0xFF) + ((Static378.aByteArray113[5] & 0xFF) << 8) + ((Static378.aByteArray113[4] & 0xFF) << 16);
						@Pc(250) int local250 = Static378.aByteArray113[7] & 0xFF;
						if (arg2 != local207 || local222 != local167 || local250 != this.anInt4728) {
							return false;
						}
						if (local171 < 0 || (long) local171 > this.aClass128_5.method2964() / 520L) {
							return false;
						}
					}
					if (local171 == 0) {
						arg1 = false;
						local171 = (int) ((this.aClass128_5.method2964() + 519L) / 520L);
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local68) {
							local171++;
						}
					}
					if (arg3 - local165 <= 512) {
						local171 = 0;
					}
					Static378.aByteArray113[2] = (byte) (local167 >> 8);
					Static378.aByteArray113[3] = (byte) local167;
					Static378.aByteArray113[0] = (byte) (arg2 >> 8);
					Static378.aByteArray113[1] = (byte) arg2;
					Static378.aByteArray113[4] = (byte) (local171 >> 16);
					Static378.aByteArray113[6] = (byte) local171;
					Static378.aByteArray113[5] = (byte) (local171 >> 8);
					Static378.aByteArray113[7] = (byte) this.anInt4728;
					this.aClass128_5.method2974((long) (local68 * 520));
					this.aClass128_5.method2971(0, 8, Static378.aByteArray113);
					local207 = arg3 - local165;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass128_5.method2971(local165, local207, arg0);
					local68 = local171;
					local165 += local207;
					local167++;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}
}
