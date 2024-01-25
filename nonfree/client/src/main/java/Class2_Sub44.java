import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int anInt9401;

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "Lclient!laa;")
	private final Class2_Sub12 aClass2_Sub12_2;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!ed;")
	private final Class91_Sub1 aClass91_Sub1_3;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_41;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	private final int anInt9407;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	private final int anInt9408;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
	private final int anInt9410;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	private final int anInt9409;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
	private int anInt9406;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "Lclient!sl;")
	private Class2_Sub17 aClass2_Sub17_10;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "Lclient!fm;")
	private Class2_Sub17_Sub2 aClass2_Sub17_Sub2_3;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Lclient!tba;")
	private Class323 aClass323_39;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "Lclient!g;")
	private final Interface7 anInterface7_5;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "Lclient!ju;")
	private final Interface14 anInterface14_6;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!uo;")
	private final Class352 aClass352_15;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "Lclient!uo;")
	private final Class352 aClass352_16;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!bi;Lclient!ed;Lclient!laa;[I)V")
	public Class2_Sub44(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class91_Sub1 arg1, @OriginalArg(2) Class2_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub12_2 = arg2;
		this.aClass91_Sub1_3 = arg1;
		this.aClass13_Sub2_41 = arg0;
		@Pc(23) int local23 = this.aClass2_Sub12_2.method7418() - (arg1.anInt8647 >> 1);
		this.anInt9407 = this.aClass2_Sub12_2.method7415() - local23 >> arg1.anInt8641;
		this.anInt9408 = local23 + this.aClass2_Sub12_2.method7415() >> arg1.anInt8641;
		this.anInt9410 = this.aClass2_Sub12_2.method7421() - local23 >> arg1.anInt8641;
		this.anInt9409 = local23 + this.aClass2_Sub12_2.method7421() >> arg1.anInt8641;
		@Pc(77) int local77 = this.anInt9408 + 1 - this.anInt9407;
		@Pc(86) int local86 = this.anInt9409 + 1 - this.anInt9410;
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(173) int local173;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt9410 + local115;
			if (local122 > 0 && local122 < this.aClass91_Sub1_3.anInt8645 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = local137 + this.anInt9407;
					if (local144 > 0 && local144 < this.aClass91_Sub1_3.anInt8650 - 1) {
						local173 = arg1.method7447(local122, local144 + 1) - arg1.method7447(local122, local144 - 1);
						local189 = arg1.method7447(local122 + 1, local144) - arg1.method7447(local122 - 1, local144);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local173 * local173 + 65536)));
						this.aFloatArrayArray11[local137][local115] = (float) local173 * local204;
						this.aFloatArrayArray12[local137][local115] = -256.0F * local204;
						this.aFloatArrayArray13[local137][local115] = local204 * (float) local189;
					}
				}
			}
		}
		local122 = 0;
		@Pc(300) int local300;
		for (local137 = this.anInt9410; local137 <= this.anInt9409; local137++) {
			if (local137 >= 0 && arg1.anInt8645 > local137) {
				for (local144 = this.anInt9407; local144 <= this.anInt9408; local144++) {
					if (local144 >= 0 && arg1.anInt8650 > local144) {
						local173 = arg3[local122];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray6[local144][local137];
						if (local291 != null && local173 != 0) {
							if (local173 == 1) {
								local300 = 0;
								while (local291.length > local300) {
									if (local291[local300++] != -1 && local291[local300++] != -1 && local291[local300++] != -1) {
										this.anInt9406 += 3;
									}
								}
							} else {
								this.anInt9406 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt9408 - this.anInt9407;
			}
		}
		if (this.anInt9406 > 0) {
			this.aClass2_Sub17_10 = new Class2_Sub17(this.anInt9406 * 2);
			this.aClass2_Sub17_Sub2_3 = new Class2_Sub17_Sub2(this.anInt9406 * 16);
			this.aClass323_39 = new Class323(Static613.method8565(this.anInt9406));
			local144 = 0;
			local122 = 0;
			for (local173 = this.anInt9410; local173 <= this.anInt9409; local173++) {
				if (local173 >= 0 && local173 < arg1.anInt8645) {
					local189 = 0;
					for (local300 = this.anInt9407; local300 <= this.anInt9408; local300++) {
						if (local300 >= 0 && arg1.anInt8650 > local300) {
							@Pc(448) int local448 = arg3[local122];
							@Pc(455) int[] local455 = arg1.anIntArrayArrayArray6[local300][local173];
							if (local455 != null && local448 != 0) {
								if (local448 == 1) {
									@Pc(609) int[] local609 = arg1.anIntArrayArrayArray3[local300][local173];
									@Pc(616) int[] local616 = arg1.anIntArrayArrayArray5[local300][local173];
									@Pc(618) int local618 = 0;
									label107: while (true) {
										while (true) {
											if (local455.length <= local618) {
												break label107;
											}
											if (local455[local618] == -1 || local455[local618 + 1] == -1 || local455[local618 + 2] == -1) {
												local618 += 3;
											} else {
												this.method8007(local300, local616[local618], local144, local189, local173, local609[local618]);
												local618++;
												this.method8007(local300, local616[local618], local144, local189, local173, local609[local618]);
												local618++;
												this.method8007(local300, local616[local618], local144, local189, local173, local609[local618]);
												local618++;
											}
										}
									}
								} else if (local448 == 3) {
									this.method8007(local300, 0, local144, local189, local173, 0);
									this.method8007(local300, 0, local144, local189, local173, arg1.anInt8647);
									this.method8007(local300, arg1.anInt8647, local144, local189, local173, 0);
								} else if (local448 == 2) {
									this.method8007(local300, 0, local144, local189, local173, arg1.anInt8647);
									this.method8007(local300, arg1.anInt8647, local144, local189, local173, arg1.anInt8647);
									this.method8007(local300, 0, local144, local189, local173, 0);
								} else if (local448 == 5) {
									this.method8007(local300, arg1.anInt8647, local144, local189, local173, arg1.anInt8647);
									this.method8007(local300, arg1.anInt8647, local144, local189, local173, 0);
									this.method8007(local300, 0, local144, local189, local173, arg1.anInt8647);
								} else if (local448 == 4) {
									this.method8007(local300, arg1.anInt8647, local144, local189, local173, 0);
									this.method8007(local300, 0, local144, local189, local173, 0);
									this.method8007(local300, arg1.anInt8647, local144, local189, local173, arg1.anInt8647);
								}
							}
						}
						local189++;
						local122++;
					}
				} else {
					local122 += this.anInt9408 - this.anInt9407;
				}
				local144++;
			}
			this.anInterface7_5 = this.aClass13_Sub2_41.method1020(this.aClass2_Sub17_10.anInt3378, false, this.aClass2_Sub17_10.aByteArray26);
			this.anInterface14_6 = this.aClass13_Sub2_41.method1060(this.aClass2_Sub17_Sub2_3.aByteArray26, false, this.aClass2_Sub17_Sub2_3.anInt3378, 16);
			this.aClass352_15 = new Class352(this.anInterface14_6, 5126, 3, 0);
			this.aClass352_16 = new Class352(this.anInterface14_6, 5121, 4, 12);
		} else {
			this.aClass352_16 = null;
			this.anInterface7_5 = null;
			this.aClass352_15 = null;
			this.anInterface14_6 = null;
		}
		this.aClass323_39 = null;
		this.aClass2_Sub17_Sub2_3 = null;
		this.aClass2_Sub17_10 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray12 = this.aFloatArrayArray13 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[[ZI)V")
	public void method8004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface7_5 == null || (this.anInt9407 > arg3 + arg0 || (this.anInt9408 < arg0 - arg3 || (arg3 + arg1 < this.anInt9410 || arg1 - arg3 > this.anInt9409)))) {
			return;
		}
		for (@Pc(52) int local52 = this.anInt9410; local52 <= this.anInt9409; local52++) {
			for (@Pc(57) int local57 = this.anInt9407; local57 <= this.anInt9408; local57++) {
				@Pc(64) int local64 = local57 - arg0;
				@Pc(69) int local69 = local52 - arg1;
				if (local64 > -arg3 && local64 < arg3 && local69 > -arg3 && arg3 > local69 && arg2[local64 + arg3][local69 + arg3]) {
					this.aClass13_Sub2_41.method1068((int) (this.aClass2_Sub12_2.method7422() * 255.0F) << 24);
					this.aClass13_Sub2_41.method1067((Class352) null, this.aClass352_15, this.aClass352_16, (Class352) null);
					this.aClass13_Sub2_41.method1100(0, this.anInt9406, this.anInterface7_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIIII)V")
	private void method8007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg0 << this.aClass91_Sub1_3.anInt8641);
		@Pc(23) int local23 = arg1 + (arg4 << this.aClass91_Sub1_3.anInt8641);
		@Pc(30) int local30 = this.aClass91_Sub1_3.method7446(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(59) Class2 local59 = this.aClass323_39.method7484(local7);
			if (local59 != null) {
				this.method8008(((Class2_Sub22) local59).aShort63);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt9401++;
		if (local7 != -1L) {
			this.aClass323_39.method7477(new Class2_Sub22(local77), local7);
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(204) float local204;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(226) float local226;
		@Pc(233) float local233;
		@Pc(242) float local242;
		@Pc(251) float local251;
		@Pc(325) float local325;
		if (arg5 == 0 && arg1 == 0) {
			local109 = this.aFloatArrayArray11[arg3][arg2];
			local116 = this.aFloatArrayArray12[arg3][arg2];
			local123 = this.aFloatArrayArray13[arg3][arg2];
		} else if (this.aClass91_Sub1_3.anInt8647 == arg5 && arg1 == 0) {
			local123 = this.aFloatArrayArray13[arg3 + 1][arg2];
			local116 = this.aFloatArrayArray12[arg3 + 1][arg2];
			local109 = this.aFloatArrayArray11[arg3 + 1][arg2];
		} else if (this.aClass91_Sub1_3.anInt8647 == arg5 && this.aClass91_Sub1_3.anInt8647 == arg1) {
			local123 = this.aFloatArrayArray13[arg3 + 1][arg2 + 1];
			local109 = this.aFloatArrayArray11[arg3 + 1][arg2 + 1];
			local116 = this.aFloatArrayArray12[arg3 + 1][arg2 + 1];
		} else if (arg5 == 0 && arg1 == this.aClass91_Sub1_3.anInt8647) {
			local123 = this.aFloatArrayArray13[arg3][arg2 + 1];
			local116 = this.aFloatArrayArray12[arg3][arg2 + 1];
			local109 = this.aFloatArrayArray11[arg3][arg2 + 1];
		} else {
			local204 = (float) arg5 / (float) this.aClass91_Sub1_3.anInt8647;
			local212 = (float) arg1 / (float) this.aClass91_Sub1_3.anInt8647;
			local219 = this.aFloatArrayArray11[arg3][arg2];
			local226 = this.aFloatArrayArray12[arg3][arg2];
			local233 = this.aFloatArrayArray13[arg3][arg2];
			local242 = this.aFloatArrayArray11[arg3 + 1][arg2];
			local251 = this.aFloatArrayArray12[arg3 + 1][arg2];
			@Pc(267) float local267 = local233 + local204 * (this.aFloatArrayArray13[arg3][arg2 + 1] - local233);
			@Pc(282) float local282 = local226 + (this.aFloatArrayArray12[arg3][arg2 + 1] - local226) * local204;
			@Pc(298) float local298 = local219 + (this.aFloatArrayArray11[arg3][arg2 + 1] - local219) * local204;
			@Pc(316) float local316 = local242 + (this.aFloatArrayArray11[arg3 + 1][arg2 + 1] - local242) * local204;
			local325 = this.aFloatArrayArray13[arg3 + 1][arg2];
			@Pc(342) float local342 = local251 + (this.aFloatArrayArray12[arg3 + 1][arg2 + 1] - local251) * local204;
			@Pc(359) float local359 = local325 + local204 * (this.aFloatArrayArray13[arg3 + 1][arg2 + 1] - local325);
			local109 = local298 + local212 * (local316 - local298);
			local116 = (local342 - local282) * local212 + local282;
			local123 = local267 + local212 * (local359 - local267);
		}
		local204 = (float) (this.aClass2_Sub12_2.method7415() - local15);
		local212 = (float) (this.aClass2_Sub12_2.method7420() - local30);
		local219 = (float) (this.aClass2_Sub12_2.method7421() - local23);
		local226 = (float) Math.sqrt((double) (local219 * local219 + local204 * local204 + local212 * local212));
		local233 = 1.0F / local226;
		local204 *= local233;
		local212 *= local233;
		local219 *= local233;
		local242 = local226 / (float) this.aClass2_Sub12_2.method7418();
		local251 = 1.0F - local242 * local242;
		if (local251 < 0.0F) {
			local251 = 0.0F;
		}
		local325 = local219 * local123 + local212 * local116 + local204 * local109;
		if (local325 < 0.0F) {
			local325 = 0.0F;
		}
		@Pc(551) float local551 = local251 * local325 * 2.0F;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass2_Sub12_2.method7417();
		@Pc(572) int local572 = (int) (local551 * (float) (local562 >> 16 & 0xFF));
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(587) int local587 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(600) int local600 = (int) ((float) (local562 & 0xFF) * local551);
		if (this.aClass13_Sub2_41.aBoolean102) {
			this.aClass2_Sub17_Sub2_3.method2890((float) local15);
			this.aClass2_Sub17_Sub2_3.method2890((float) local30);
			this.aClass2_Sub17_Sub2_3.method2890((float) local23);
		} else {
			this.aClass2_Sub17_Sub2_3.method2892((float) local15);
			this.aClass2_Sub17_Sub2_3.method2892((float) local30);
			this.aClass2_Sub17_Sub2_3.method2892((float) local23);
		}
		if (local600 > 255) {
			local600 = 255;
		}
		this.aClass2_Sub17_Sub2_3.method2837(local572);
		this.aClass2_Sub17_Sub2_3.method2837(local587);
		this.aClass2_Sub17_Sub2_3.method2837(local600);
		this.aClass2_Sub17_Sub2_3.method2837(255);
		this.method8008(local77);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BS)V")
	private void method8008(@OriginalArg(1) short arg0) {
		if (this.aClass13_Sub2_41.aBoolean102) {
			this.aClass2_Sub17_10.method2879(arg0);
		} else {
			this.aClass2_Sub17_10.method2878(arg0);
		}
	}
}
