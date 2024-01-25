import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
	private int anInt7282;

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "Lclient!daa;")
	private final Class67_Sub1 aClass67_Sub1_2;

	@OriginalMember(owner = "client!qca", name = "u", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_18;

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "Lclient!gga;")
	private final Class2_Sub14 aClass2_Sub14_2;

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
	private final int anInt7271;

	@OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
	private final int anInt7276;

	@OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
	private final int anInt7273;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
	private final int anInt7275;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!qca", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
	private int anInt7279;

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "Lclient!il;")
	private Class162 aClass162_30;

	@OriginalMember(owner = "client!qca", name = "r", descriptor = "Lclient!hh;")
	private final Interface11 anInterface11_7;

	@OriginalMember(owner = "client!qca", name = "y", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "Lclient!nba;")
	private final Interface16 anInterface16_13;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!en;Lclient!daa;Lclient!gga;[I)V")
	public Class2_Sub38(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class67_Sub1 arg1, @OriginalArg(2) Class2_Sub14 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass67_Sub1_2 = arg1;
		this.aClass100_Sub1_18 = arg0;
		this.aClass2_Sub14_2 = arg2;
		@Pc(23) int local23 = this.aClass2_Sub14_2.method7691() - (arg1.anInt8104 >> 1);
		this.anInt7271 = this.aClass2_Sub14_2.method7694() - local23 >> arg1.anInt8108;
		this.anInt7276 = local23 + this.aClass2_Sub14_2.method7694() >> arg1.anInt8108;
		this.anInt7273 = this.aClass2_Sub14_2.method7693() - local23 >> arg1.anInt8108;
		this.anInt7275 = local23 + this.aClass2_Sub14_2.method7693() >> arg1.anInt8108;
		@Pc(78) int local78 = this.anInt7276 + 1 - this.anInt7271;
		@Pc(86) int local86 = this.anInt7275 + 1 - this.anInt7273;
		this.aFloatArrayArray12 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(173) int local173;
		@Pc(190) int local190;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt7273 + local115;
			if (local122 > 0 && this.aClass67_Sub1_2.anInt8110 - 1 > local122) {
				for (local140 = 0; local140 <= local78; local140++) {
					local147 = this.anInt7271 + local140;
					if (local147 > 0 && local147 < this.aClass67_Sub1_2.anInt8111 - 1) {
						local173 = arg1.method6707(local122, local147 + 1) - arg1.method6707(local122, local147 - 1);
						local190 = arg1.method6707(local122 + 1, local147) - arg1.method6707(local122 - 1, local147);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + local173 * local173 + 65536)));
						this.aFloatArrayArray13[local140][local115] = (float) local173 * local205;
						this.aFloatArrayArray11[local140][local115] = -256.0F * local205;
						this.aFloatArrayArray12[local140][local115] = (float) local190 * local205;
					}
				}
			}
		}
		local122 = 0;
		@Pc(308) int local308;
		for (local140 = this.anInt7273; local140 <= this.anInt7275; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt8110) {
				for (local147 = this.anInt7271; local147 <= this.anInt7276; local147++) {
					if (local147 >= 0 && local147 < arg1.anInt8111) {
						local173 = arg3[local122];
						@Pc(288) int[] local288 = arg1.anIntArrayArrayArray6[local147][local140];
						if (local288 != null && local173 != 0) {
							if (local173 == 1) {
								local308 = 0;
								while (local288.length > local308) {
									if (local288[local308++] != -1 && local288[local308++] != -1 && local288[local308++] != -1) {
										this.anInt7279 += 3;
									}
								}
							} else {
								this.anInt7279 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt7276 - this.anInt7271;
			}
		}
		if (this.anInt7279 > 0) {
			this.aClass162_30 = new Class162(Static89.method7259(this.anInt7279));
			this.anInterface11_7 = this.aClass100_Sub1_18.method4777(false);
			this.anInterface11_7.method4117(this.anInt7279);
			@Pc(397) NativeHeapBuffer local397 = this.aClass100_Sub1_18.method4788(this.anInt7279 * 16, false);
			this.aStream6 = new Stream(local397);
			while (true) {
				@Pc(409) Buffer local409;
				do {
					local409 = this.anInterface11_7.method4114();
				} while (local409 == null);
				this.aStream7 = new Stream(local409);
				local122 = 0;
				local190 = 0;
				for (local308 = this.anInt7273; local308 <= this.anInt7275; local308++) {
					if (local308 >= 0 && arg1.anInt8110 > local308) {
						@Pc(441) int local441 = 0;
						for (@Pc(444) int local444 = this.anInt7271; local444 <= this.anInt7276; local444++) {
							if (local444 >= 0 && local444 < arg1.anInt8111) {
								@Pc(456) int local456 = arg3[local122];
								@Pc(463) int[] local463 = arg1.anIntArrayArrayArray6[local444][local308];
								if (local463 != null && local456 != 0) {
									if (local456 == 1) {
										@Pc(479) int[] local479 = arg1.anIntArrayArrayArray5[local444][local308];
										@Pc(486) int[] local486 = arg1.anIntArrayArrayArray3[local444][local308];
										@Pc(488) int local488 = 0;
										label119: while (true) {
											while (true) {
												if (local463.length <= local488) {
													break label119;
												}
												if (local463[local488] == -1 || local463[local488 + 1] == -1 || local463[local488 + 2] == -1) {
													local488 += 3;
												} else {
													this.method6111(local486[local488], local190, local444, local479[local488], local441, local308);
													local488++;
													this.method6111(local486[local488], local190, local444, local479[local488], local441, local308);
													local488++;
													this.method6111(local486[local488], local190, local444, local479[local488], local441, local308);
													local488++;
												}
											}
										}
									} else if (local456 == 3) {
										this.method6111(0, local190, local444, 0, local441, local308);
										this.method6111(0, local190, local444, arg1.anInt8104, local441, local308);
										this.method6111(arg1.anInt8104, local190, local444, 0, local441, local308);
									} else if (local456 == 2) {
										this.method6111(0, local190, local444, arg1.anInt8104, local441, local308);
										this.method6111(arg1.anInt8104, local190, local444, arg1.anInt8104, local441, local308);
										this.method6111(0, local190, local444, 0, local441, local308);
									} else if (local456 == 5) {
										this.method6111(arg1.anInt8104, local190, local444, arg1.anInt8104, local441, local308);
										this.method6111(arg1.anInt8104, local190, local444, 0, local441, local308);
										this.method6111(0, local190, local444, arg1.anInt8104, local441, local308);
									} else if (local456 == 4) {
										this.method6111(arg1.anInt8104, local190, local444, 0, local441, local308);
										this.method6111(0, local190, local444, 0, local441, local308);
										this.method6111(arg1.anInt8104, local190, local444, arg1.anInt8104, local441, local308);
									}
								}
							}
							local122++;
							local441++;
						}
					} else {
						local122 += this.anInt7276 - this.anInt7271;
					}
					local190++;
				}
				this.aStream7.c();
				if (this.anInterface11_7.method4118()) {
					this.aStream6.c();
					this.anInterface16_13 = this.aClass100_Sub1_18.method4837(false);
					this.anInterface16_13.method5773(local397, 16, this.anInt7282 * 16);
					break;
				}
				this.aStream6.b(0);
				this.aClass162_30.method3518();
			}
		} else {
			this.anInterface11_7 = null;
			this.anInterface16_13 = null;
		}
		this.aClass162_30 = null;
		this.aStream7 = null;
		this.aStream6 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray11 = this.aFloatArrayArray12 = null;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(SI)V")
	private void method6107(@OriginalArg(0) short arg0) {
		if (Stream.a()) {
			this.aStream7.c(arg0);
		} else {
			this.aStream7.e(arg0);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II[[ZII)V")
	public void method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface11_7 == null || (this.anInt7271 > arg1 + arg3 || (this.anInt7276 < arg3 - arg1 || (this.anInt7273 > arg1 + arg0 || this.anInt7275 < arg0 - arg1)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt7273; local54 <= this.anInt7275; local54++) {
			for (@Pc(59) int local59 = this.anInt7271; local59 <= this.anInt7276; local59++) {
				@Pc(66) int local66 = local59 - arg3;
				@Pc(71) int local71 = local54 - arg0;
				if (local66 > -arg1 && local66 < arg1 && local71 > -arg1 && local71 < arg1 && arg2[arg1 + local66][arg1 + local71]) {
					this.aClass100_Sub1_18.method4760((byte) (this.aClass2_Sub14_2.method7689() * 255.0F));
					this.aClass100_Sub1_18.method4863(this.anInterface16_13, 0);
					this.aClass100_Sub1_18.method4757(this.aClass100_Sub1_18.aClass199_17);
					this.aClass100_Sub1_18.method4764(this.anInt7282, Static341.aClass213_5, 0, this.anInt7279 / 3, 0, this.anInterface11_7);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIII)V")
	private void method6111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass67_Sub1_2.anInt8108) + arg3;
		@Pc(23) int local23 = arg0 + (arg5 << this.aClass67_Sub1_2.anInt8108);
		@Pc(30) int local30 = this.aClass67_Sub1_2.method6711(local23, local15);
		if ((arg3 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(64) Class2 local64 = this.aClass162_30.method3519(local7);
			if (local64 != null) {
				this.method6107(((Class2_Sub29) local64).aShort60);
				return;
			}
		}
		@Pc(84) short local84 = (short) this.anInt7282++;
		if (local7 != -1L) {
			this.aClass162_30.method3522(new Class2_Sub29(local84), local7);
		}
		@Pc(126) float local126;
		@Pc(144) float local144;
		@Pc(135) float local135;
		@Pc(179) float local179;
		@Pc(187) float local187;
		@Pc(194) float local194;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(217) float local217;
		@Pc(226) float local226;
		@Pc(251) float local251;
		if (arg3 == 0 && arg0 == 0) {
			local126 = this.aFloatArrayArray13[arg4][arg1];
			local135 = this.aFloatArrayArray12[arg4][arg1];
			local144 = this.aFloatArrayArray11[arg4][arg1];
		} else if (arg3 == this.aClass67_Sub1_2.anInt8104 && arg0 == 0) {
			local126 = this.aFloatArrayArray13[arg4 + 1][arg1];
			local135 = this.aFloatArrayArray12[arg4 + 1][arg1];
			local144 = this.aFloatArrayArray11[arg4 + 1][arg1];
		} else if (arg3 == this.aClass67_Sub1_2.anInt8104 && this.aClass67_Sub1_2.anInt8104 == arg0) {
			local126 = this.aFloatArrayArray13[arg4 + 1][arg1 + 1];
			local135 = this.aFloatArrayArray12[arg4 + 1][arg1 + 1];
			local144 = this.aFloatArrayArray11[arg4 + 1][arg1 + 1];
		} else if (arg3 == 0 && arg0 == this.aClass67_Sub1_2.anInt8104) {
			local144 = this.aFloatArrayArray11[arg4][arg1 + 1];
			local126 = this.aFloatArrayArray13[arg4][arg1 + 1];
			local135 = this.aFloatArrayArray12[arg4][arg1 + 1];
		} else {
			local179 = (float) arg3 / (float) this.aClass67_Sub1_2.anInt8104;
			local187 = (float) arg0 / (float) this.aClass67_Sub1_2.anInt8104;
			local194 = this.aFloatArrayArray13[arg4][arg1];
			local201 = this.aFloatArrayArray11[arg4][arg1];
			local208 = this.aFloatArrayArray12[arg4][arg1];
			local217 = this.aFloatArrayArray13[arg4 + 1][arg1];
			local226 = this.aFloatArrayArray11[arg4 + 1][arg1];
			@Pc(242) float local242 = local208 + local179 * (this.aFloatArrayArray12[arg4][arg1 + 1] - local208);
			local251 = this.aFloatArrayArray12[arg4 + 1][arg1];
			@Pc(267) float local267 = local201 + local179 * (this.aFloatArrayArray11[arg4][arg1 + 1] - local201);
			@Pc(283) float local283 = local194 + local179 * (this.aFloatArrayArray13[arg4][arg1 + 1] - local194);
			@Pc(301) float local301 = local226 + (this.aFloatArrayArray11[arg4 + 1][arg1 + 1] - local226) * local179;
			@Pc(318) float local318 = local217 + (this.aFloatArrayArray13[arg4 + 1][arg1 + 1] - local217) * local179;
			local144 = local267 + (local301 - local267) * local187;
			@Pc(344) float local344 = local251 + local179 * (this.aFloatArrayArray12[arg4 + 1][arg1 + 1] - local251);
			local126 = local283 + local187 * (local318 - local283);
			local135 = (local344 - local242) * local187 + local242;
		}
		local179 = this.aClass2_Sub14_2.method7694() - local15;
		local187 = this.aClass2_Sub14_2.method7696() - local30;
		local194 = this.aClass2_Sub14_2.method7693() - local23;
		local201 = (float) Math.sqrt((double) (local194 * local194 + local179 * local179 + local187 * local187));
		local208 = 1.0F / local201;
		local194 *= local208;
		local179 *= local208;
		local187 *= local208;
		local217 = local201 / (float) this.aClass2_Sub14_2.method7691();
		local226 = 1.0F - local217 * local217;
		if (local226 < 0.0F) {
			local226 = 0.0F;
		}
		local251 = local194 * local135 + local179 * local126 + local144 * local187;
		if (local251 < 0.0F) {
			local251 = 0.0F;
		}
		@Pc(551) float local551 = local251 * 2.0F * local226;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass2_Sub14_2.method7687();
		@Pc(572) int local572 = (int) (local551 * (float) (local562 >> 16 & 0xFF));
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(587) int local587 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(612) int local612 = (int) (local551 * (float) (local562 & 0xFF));
		if (local612 > 255) {
			local612 = 255;
		}
		if (Stream.a()) {
			this.aStream6.a((float) local15);
			this.aStream6.a((float) local30);
			this.aStream6.a((float) local23);
		} else {
			this.aStream6.b((float) local15);
			this.aStream6.b((float) local30);
			this.aStream6.b((float) local23);
		}
		if (this.aClass100_Sub1_18.anInt5791 == 0) {
			this.aStream6.d(local612);
			this.aStream6.d(local587);
			this.aStream6.d(local572);
		} else {
			this.aStream6.d(local572);
			this.aStream6.d(local587);
			this.aStream6.d(local612);
		}
		this.aStream6.d(255);
		this.method6107(local84);
	}
}
