import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class28 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	private int anInt1935 = 65000;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!v;")
	private Class88 aClass88_3 = null;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Lclient!v;")
	private Class88 aClass88_4 = null;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private final int anInt1930;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILclient!v;Lclient!v;I)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) int arg3) {
		this.aClass88_4 = arg2;
		this.aClass88_3 = arg1;
		this.anInt1935 = arg3;
		this.anInt1930 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI[BI)Z")
	private boolean method1439(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class88 local8 = this.aClass88_3;
		synchronized (this.aClass88_3) {
			try {
				@Pc(72) int local72;
				if (arg1) {
					if (this.aClass88_4.method2929() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass88_4.method2928((long) (arg0 * 6));
					this.aClass88_4.method2931(6, Static4.aByteArray2, 0);
					local72 = ((Static4.aByteArray2[3] & 0xFF) << 16) + (((Static4.aByteArray2[4] & 0xFF) << 8) + (Static4.aByteArray2[5] & 0xFF));
					if (local72 <= 0 || (long) local72 > this.aClass88_3.method2929() / 520L) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass88_3.method2929() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static4.aByteArray2[2] = (byte) arg3;
				Static4.aByteArray2[5] = (byte) local72;
				Static4.aByteArray2[3] = (byte) (local72 >> 16);
				Static4.aByteArray2[4] = (byte) (local72 >> 8);
				Static4.aByteArray2[0] = (byte) (arg3 >> 16);
				@Pc(144) int local144 = 0;
				Static4.aByteArray2[1] = (byte) (arg3 >> 8);
				this.aClass88_4.method2928((long) (arg0 * 6));
				this.aClass88_4.method2927(0, 6, Static4.aByteArray2);
				@Pc(173) int local173 = 0;
				while (arg3 > local144) {
					@Pc(177) int local177 = 0;
					@Pc(236) int local236;
					if (arg1) {
						this.aClass88_3.method2928((long) (local72 * 520));
						try {
							this.aClass88_3.method2931(8, Static4.aByteArray2, 0);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local177 = ((Static4.aByteArray2[5] & 0xFF) << 8) + (((Static4.aByteArray2[4] & 0xFF) << 16) + (Static4.aByteArray2[6] & 0xFF));
						local236 = ((Static4.aByteArray2[0] & 0xFF) << 8) + (Static4.aByteArray2[1] & 0xFF);
						@Pc(251) int local251 = ((Static4.aByteArray2[2] & 0xFF) << 8) + (Static4.aByteArray2[3] & 0xFF);
						@Pc(257) int local257 = Static4.aByteArray2[7] & 0xFF;
						if (arg0 != local236 || local251 != local173 || local257 != this.anInt1930) {
							return false;
						}
						if (local177 < 0 || (long) local177 > this.aClass88_3.method2929() / 520L) {
							return false;
						}
					}
					if (local177 == 0) {
						arg1 = false;
						local177 = (int) ((this.aClass88_3.method2929() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local72 == local177) {
							local177++;
						}
					}
					Static4.aByteArray2[1] = (byte) arg0;
					Static4.aByteArray2[3] = (byte) local173;
					Static4.aByteArray2[0] = (byte) (arg0 >> 8);
					Static4.aByteArray2[2] = (byte) (local173 >> 8);
					if (arg3 - local144 <= 512) {
						local177 = 0;
					}
					Static4.aByteArray2[4] = (byte) (local177 >> 16);
					Static4.aByteArray2[7] = (byte) this.anInt1930;
					Static4.aByteArray2[5] = (byte) (local177 >> 8);
					local236 = arg3 - local144;
					local173++;
					Static4.aByteArray2[6] = (byte) local177;
					if (local236 > 512) {
						local236 = 512;
					}
					this.aClass88_3.method2928((long) (local72 * 520));
					this.aClass88_3.method2927(0, 8, Static4.aByteArray2);
					local72 = local177;
					this.aClass88_3.method2927(local144, local236, arg2);
					local144 += local236;
				}
				return true;
			} catch (@Pc(438) IOException local438) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIIZ)Z")
	public boolean method1441(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class88 local6 = this.aClass88_3;
		synchronized (this.aClass88_3) {
			if (arg1 < 0 || arg1 > this.anInt1935) {
				throw new IllegalArgumentException();
			}
			@Pc(26) boolean local26 = this.method1439(arg2, true, arg0, arg1);
			if (!local26) {
				local26 = this.method1439(arg2, false, arg0, arg1);
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1930;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[B")
	public byte[] method1444(@OriginalArg(0) int arg0) {
		@Pc(8) Class88 local8 = this.aClass88_3;
		synchronized (this.aClass88_3) {
			try {
				if (this.aClass88_4.method2929() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass88_4.method2928((long) (arg0 * 6));
				this.aClass88_4.method2931(6, Static4.aByteArray2, 0);
				@Pc(70) int local70 = ((Static4.aByteArray2[0] & 0xFF) << 16) + (((Static4.aByteArray2[1] & 0xFF) << 8) + (Static4.aByteArray2[2] & 0xFF));
				@Pc(93) int local93 = (Static4.aByteArray2[5] & 0xFF) + (((Static4.aByteArray2[3] & 0xFF) << 16) + ((Static4.aByteArray2[4] & 0xFF) << 8));
				if (local70 < 0 || this.anInt1935 < local70) {
					return null;
				} else if (local93 > 0 && this.aClass88_3.method2929() / 520L >= (long) local93) {
					@Pc(125) int local125 = 0;
					@Pc(137) byte[] local137 = new byte[local70];
					@Pc(139) int local139 = 0;
					label55: while (local139 < local70) {
						if (local93 == 0) {
							return null;
						}
						this.aClass88_3.method2928((long) (local93 * 520));
						@Pc(164) int local164 = local70 - local139;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass88_3.method2931(local164 + 8, Static4.aByteArray2, 0);
						@Pc(192) int local192 = ((Static4.aByteArray2[0] & 0xFF) << 8) + (Static4.aByteArray2[1] & 0xFF);
						@Pc(207) int local207 = ((Static4.aByteArray2[2] & 0xFF) << 8) + (Static4.aByteArray2[3] & 0xFF);
						@Pc(229) int local229 = (Static4.aByteArray2[6] & 0xFF) + ((Static4.aByteArray2[4] & 0xFF) << 16) + ((Static4.aByteArray2[5] & 0xFF) << 8);
						@Pc(235) int local235 = Static4.aByteArray2[7] & 0xFF;
						if (local192 == arg0 && local207 == local125 && local235 == this.anInt1930) {
							if (local229 >= 0 && (long) local229 <= this.aClass88_3.method2929() / 520L) {
								local93 = local229;
								local125++;
								@Pc(286) int local286 = 0;
								while (true) {
									if (local164 <= local286) {
										continue label55;
									}
									local137[local139++] = Static4.aByteArray2[local286 + 8];
									local286++;
								}
							}
							return null;
						}
						return null;
					}
					return local137;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}
}
