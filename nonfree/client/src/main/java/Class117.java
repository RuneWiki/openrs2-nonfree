import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class117 {

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
	private int anInt2972 = 65000;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Lclient!jv;")
	private Class142 aClass142_4 = null;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Lclient!jv;")
	private Class142 aClass142_3 = null;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
	private final int anInt2971;

	static {
		new Class15(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILclient!jv;Lclient!jv;I)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) Class142 arg2, @OriginalArg(3) int arg3) {
		this.aClass142_3 = arg1;
		this.anInt2972 = arg3;
		this.aClass142_4 = arg2;
		this.anInt2971 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[B")
	public byte[] method2250(@OriginalArg(1) int arg0) {
		@Pc(8) Class142 local8 = this.aClass142_3;
		synchronized (this.aClass142_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass142_4.method2806()) {
					return null;
				}
				this.aClass142_4.method2808((long) (arg0 * 6));
				this.aClass142_4.method2812(0, Static37.aByteArray5, 6);
				@Pc(70) int local70 = ((Static37.aByteArray5[1] & 0xFF) << 8) + (Static37.aByteArray5[0] << 16 & 0xFF0000) + (Static37.aByteArray5[2] & 0xFF);
				@Pc(93) int local93 = ((Static37.aByteArray5[4] & 0xFF) << 8) + ((Static37.aByteArray5[3] & 0xFF) << 16) + (Static37.aByteArray5[5] & 0xFF);
				if (local70 < 0 || this.anInt2972 < local70) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass142_3.method2806() / 520L) {
					@Pc(136) byte[] local136 = new byte[local70];
					@Pc(147) int local147 = 0;
					@Pc(149) int local149 = 0;
					label55: while (local147 < local70) {
						if (local93 == 0) {
							return null;
						}
						this.aClass142_3.method2808((long) (local93 * 520));
						@Pc(177) int local177 = local70 - local147;
						if (local177 > 512) {
							local177 = 512;
						}
						this.aClass142_3.method2812(0, Static37.aByteArray5, local177 + 8);
						@Pc(205) int local205 = (Static37.aByteArray5[1] & 0xFF) + ((Static37.aByteArray5[0] & 0xFF) << 8);
						@Pc(220) int local220 = ((Static37.aByteArray5[2] & 0xFF) << 8) + (Static37.aByteArray5[3] & 0xFF);
						@Pc(243) int local243 = (Static37.aByteArray5[6] & 0xFF) + ((Static37.aByteArray5[4] & 0xFF) << 16) + ((Static37.aByteArray5[5] & 0xFF) << 8);
						@Pc(249) int local249 = Static37.aByteArray5[7] & 0xFF;
						if (arg0 == local205 && local220 == local149 && this.anInt2971 == local249) {
							if (local243 >= 0 && this.aClass142_3.method2806() / 520L >= (long) local243) {
								local93 = local243;
								local149++;
								@Pc(304) int local304 = 0;
								while (true) {
									if (local304 >= local177) {
										continue label55;
									}
									local136[local147++] = Static37.aByteArray5[local304 + 8];
									local304++;
								}
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(329) IOException local329) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III[B)Z")
	public boolean method2251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class142 local6 = this.aClass142_3;
		synchronized (this.aClass142_3) {
			if (arg1 < 0 || arg1 > this.anInt2972) {
				throw new IllegalArgumentException();
			}
			@Pc(40) boolean local40 = this.method2252(arg0, true, arg1, arg2);
			if (!local40) {
				local40 = this.method2252(arg0, false, arg1, arg2);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BIZI[B)Z")
	private boolean method2252(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class142 local8 = this.aClass142_3;
		synchronized (this.aClass142_3) {
			try {
				@Pc(68) int local68;
				if (arg1) {
					if (this.aClass142_4.method2806() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass142_4.method2808((long) (arg0 * 6));
					this.aClass142_4.method2812(0, Static37.aByteArray5, 6);
					local68 = ((Static37.aByteArray5[3] & 0xFF) << 16) + (((Static37.aByteArray5[4] & 0xFF) << 8) + (Static37.aByteArray5[5] & 0xFF));
					if (local68 <= 0 || (long) local68 > this.aClass142_3.method2806() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass142_3.method2806() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static37.aByteArray5[4] = (byte) (local68 >> 8);
				Static37.aByteArray5[0] = (byte) (arg2 >> 16);
				Static37.aByteArray5[2] = (byte) arg2;
				Static37.aByteArray5[5] = (byte) local68;
				Static37.aByteArray5[3] = (byte) (local68 >> 16);
				Static37.aByteArray5[1] = (byte) (arg2 >> 8);
				this.aClass142_4.method2808((long) (arg0 * 6));
				this.aClass142_4.method2810(Static37.aByteArray5, 6, 0);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (arg2 > local174) {
					@Pc(180) int local180 = 0;
					@Pc(217) int local217;
					if (arg1) {
						this.aClass142_3.method2808((long) (local68 * 520));
						try {
							this.aClass142_3.method2812(0, Static37.aByteArray5, 8);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local217 = (Static37.aByteArray5[1] & 0xFF) + ((Static37.aByteArray5[0] & 0xFF) << 8);
						local180 = (Static37.aByteArray5[6] & 0xFF) + ((Static37.aByteArray5[5] & 0xFF) << 8) + ((Static37.aByteArray5[4] & 0xFF) << 16);
						@Pc(254) int local254 = ((Static37.aByteArray5[2] & 0xFF) << 8) + (Static37.aByteArray5[3] & 0xFF);
						@Pc(260) int local260 = Static37.aByteArray5[7] & 0xFF;
						if (arg0 != local217 || local254 != local176 || local260 != this.anInt2971) {
							return false;
						}
						if (local180 < 0 || this.aClass142_3.method2806() / 520L < (long) local180) {
							return false;
						}
					}
					if (local180 == 0) {
						arg1 = false;
						local180 = (int) ((this.aClass142_3.method2806() + 519L) / 520L);
						if (local180 == 0) {
							local180++;
						}
						if (local180 == local68) {
							local180++;
						}
					}
					Static37.aByteArray5[2] = (byte) (local176 >> 8);
					if (arg2 - local174 <= 512) {
						local180 = 0;
					}
					Static37.aByteArray5[1] = (byte) arg0;
					Static37.aByteArray5[3] = (byte) local176;
					Static37.aByteArray5[0] = (byte) (arg0 >> 8);
					Static37.aByteArray5[4] = (byte) (local180 >> 16);
					Static37.aByteArray5[7] = (byte) this.anInt2971;
					Static37.aByteArray5[5] = (byte) (local180 >> 8);
					Static37.aByteArray5[6] = (byte) local180;
					this.aClass142_3.method2808((long) (local68 * 520));
					this.aClass142_3.method2810(Static37.aByteArray5, 8, 0);
					local217 = arg2 - local174;
					if (local217 > 512) {
						local217 = 512;
					}
					this.aClass142_3.method2810(arg3, local217, local174);
					local174 += local217;
					local176++;
					local68 = local180;
				}
				return true;
			} catch (@Pc(444) IOException local444) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2971;
	}
}
