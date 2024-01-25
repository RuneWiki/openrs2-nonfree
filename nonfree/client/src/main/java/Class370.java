import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class370 {

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "Lclient!ee;")
	private Class76 aClass76_4 = null;

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "I")
	private int anInt10353 = 65000;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "Lclient!ee;")
	private Class76 aClass76_5 = null;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
	private final int anInt10346;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(ILclient!ee;Lclient!ee;I)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) int arg3) {
		this.aClass76_5 = arg2;
		this.anInt10346 = arg0;
		this.aClass76_4 = arg1;
		this.anInt10353 = arg3;
	}

	@OriginalMember(owner = "client!wea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt10346;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[BZII)Z")
	private boolean method8494(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class76 local8 = this.aClass76_4;
		synchronized (this.aClass76_4) {
			try {
				@Pc(71) int local71;
				if (arg1) {
					if (this.aClass76_5.method2769() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass76_5.method2777((long) (arg3 * 6));
					this.aClass76_5.method2768(0, Static644.aByteArray107, 6);
					local71 = (Static644.aByteArray107[5] & 0xFF) + ((Static644.aByteArray107[4] & 0xFF) << 8) + ((Static644.aByteArray107[3] & 0xFF) << 16);
					if (local71 <= 0 || this.aClass76_4.method2769() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass76_4.method2769() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static644.aByteArray107[2] = (byte) arg2;
				Static644.aByteArray107[3] = (byte) (local71 >> 16);
				Static644.aByteArray107[4] = (byte) (local71 >> 8);
				Static644.aByteArray107[0] = (byte) (arg2 >> 16);
				Static644.aByteArray107[1] = (byte) (arg2 >> 8);
				Static644.aByteArray107[5] = (byte) local71;
				this.aClass76_5.method2777((long) (arg3 * 6));
				this.aClass76_5.method2770(0, Static644.aByteArray107, 6);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (arg2 > local174) {
					@Pc(180) int local180 = 0;
					@Pc(215) int local215;
					if (arg1) {
						this.aClass76_4.method2777((long) (local71 * 520));
						try {
							this.aClass76_4.method2768(0, Static644.aByteArray107, 8);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local215 = (Static644.aByteArray107[1] & 0xFF) + ((Static644.aByteArray107[0] & 0xFF) << 8);
						local180 = (Static644.aByteArray107[6] & 0xFF) + ((Static644.aByteArray107[5] & 0xFF) << 8) + ((Static644.aByteArray107[4] & 0xFF) << 16);
						@Pc(251) int local251 = ((Static644.aByteArray107[2] & 0xFF) << 8) + (Static644.aByteArray107[3] & 0xFF);
						@Pc(257) int local257 = Static644.aByteArray107[7] & 0xFF;
						if (local215 != arg3 || local251 != local176 || this.anInt10346 != local257) {
							return false;
						}
						if (local180 < 0 || this.aClass76_4.method2769() / 520L < (long) local180) {
							return false;
						}
					}
					if (local180 == 0) {
						local180 = (int) ((this.aClass76_4.method2769() + 519L) / 520L);
						arg1 = false;
						if (local180 == 0) {
							local180++;
						}
						if (local180 == local71) {
							local180++;
						}
					}
					Static644.aByteArray107[0] = (byte) (arg3 >> 8);
					Static644.aByteArray107[3] = (byte) local176;
					if (arg2 - local174 <= 512) {
						local180 = 0;
					}
					Static644.aByteArray107[1] = (byte) arg3;
					Static644.aByteArray107[2] = (byte) (local176 >> 8);
					Static644.aByteArray107[4] = (byte) (local180 >> 16);
					Static644.aByteArray107[5] = (byte) (local180 >> 8);
					Static644.aByteArray107[6] = (byte) local180;
					Static644.aByteArray107[7] = (byte) this.anInt10346;
					this.aClass76_4.method2777((long) (local71 * 520));
					this.aClass76_4.method2770(0, Static644.aByteArray107, 8);
					local215 = arg2 - local174;
					if (local215 > 512) {
						local215 = 512;
					}
					this.aClass76_4.method2770(local174, arg0, local215);
					local176++;
					local71 = local180;
					local174 += local215;
				}
				return true;
			} catch (@Pc(438) IOException local438) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "([BIII)Z")
	public boolean method8495(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class76 local6 = this.aClass76_4;
		synchronized (this.aClass76_4) {
			if (arg1 < 0 || arg1 > this.anInt10353) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method8494(arg0, true, arg1, arg2);
			if (!local39) {
				local39 = this.method8494(arg0, false, arg1, arg2);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[B")
	public byte[] method8497(@OriginalArg(1) int arg0) {
		@Pc(8) Class76 local8 = this.aClass76_4;
		synchronized (this.aClass76_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass76_5.method2769()) {
					return null;
				}
				this.aClass76_5.method2777((long) (arg0 * 6));
				this.aClass76_5.method2768(0, Static644.aByteArray107, 6);
				@Pc(79) int local79 = ((Static644.aByteArray107[0] & 0xFF) << 16) + ((Static644.aByteArray107[1] & 0xFF) << 8) + (Static644.aByteArray107[2] & 0xFF);
				@Pc(101) int local101 = (Static644.aByteArray107[5] & 0xFF) + ((Static644.aByteArray107[4] & 0xFF) << 8) + ((Static644.aByteArray107[3] & 0xFF) << 16);
				if (local79 < 0 || local79 > this.anInt10353) {
					return null;
				} else if (local101 > 0 && this.aClass76_4.method2769() / 520L >= (long) local101) {
					@Pc(141) byte[] local141 = new byte[local79];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local143 < local79) {
						if (local101 == 0) {
							return null;
						}
						this.aClass76_4.method2777((long) (local101 * 520));
						@Pc(167) int local167 = local79 - local143;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass76_4.method2768(0, Static644.aByteArray107, local167 + 8);
						@Pc(195) int local195 = (Static644.aByteArray107[1] & 0xFF) + ((Static644.aByteArray107[0] & 0xFF) << 8);
						@Pc(209) int local209 = (Static644.aByteArray107[3] & 0xFF) + ((Static644.aByteArray107[2] & 0xFF) << 8);
						@Pc(231) int local231 = (Static644.aByteArray107[6] & 0xFF) + ((Static644.aByteArray107[5] & 0xFF) << 8) + ((Static644.aByteArray107[4] & 0xFF) << 16);
						@Pc(237) int local237 = Static644.aByteArray107[7] & 0xFF;
						if (local195 == arg0 && local209 == local145 && local237 == this.anInt10346) {
							if (local231 >= 0 && (long) local231 <= this.aClass76_4.method2769() / 520L) {
								local101 = local231;
								for (@Pc(282) int local282 = 0; local282 < local167; local282++) {
									local141[local143++] = Static644.aByteArray107[local282 + 8];
								}
								local145++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}
}
