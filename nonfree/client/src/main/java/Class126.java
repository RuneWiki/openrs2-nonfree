import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class126 {

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	public int anInt3183;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	private int anInt3184;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	private int anInt3185;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "Lclient!rn;")
	private Class18 aClass18_14;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
	private int anInt3186;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
	private int anInt3189;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
	private final int anInt3179;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	private final int anInt3178;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	private final int anInt3181;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	private final int anInt3180;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	private final int anInt3182;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
	private final int anInt3188;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	private final int anInt3187;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3179 = arg2;
		this.anInt3178 = arg3;
		this.anInt3181 = arg4;
		this.aBoolean242 = arg7;
		this.anInt3180 = arg1;
		this.anInt3182 = arg6;
		this.anInt3188 = arg5;
		this.anInt3187 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!vc;Lclient!jp;)Z")
	private boolean method2928(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class126 arg1) {
		if (this.aClass18_14 == null) {
			if (this.anInt3187 == 0) {
				if (Static371.anInterface9_7.method142(this.anInt3180)) {
					@Pc(23) int[] local23 = Static371.anInterface9_7.method141(this.anInt3184, 0.7F, this.anInt3184, this.anInt3180);
					this.aClass18_14 = arg0.method2029(local23, this.anInt3184, this.anInt3184, this.anInt3184);
				}
			} else if (this.anInt3187 == 2) {
				this.method2930(arg0, arg1);
			} else if (this.anInt3187 == 1) {
				this.method2934(arg0, arg1);
			}
		}
		return this.aClass18_14 != null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)Z")
	public boolean method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean242) {
			this.anInt3183 = 1073741823;
			local7 = this.anInt3179;
			local12 = this.anInt3178;
			local17 = this.anInt3181;
		} else {
			local7 = this.anInt3179 - arg0;
			local12 = this.anInt3178 - arg1;
			local17 = this.anInt3181 - arg2;
			this.anInt3183 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3183 == 0) {
				this.anInt3183 = 1;
			}
			local7 = (local7 << 8) / this.anInt3183;
			local12 = (local12 << 8) / this.anInt3183;
			local17 = (local17 << 8) / this.anInt3183;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3186 = this.anInt3188 * arg3 / (this.aBoolean242 ? 1024 : this.anInt3183);
		} else {
			this.anInt3186 = 0;
		}
		if (this.anInt3186 < 8) {
			this.aClass18_14 = null;
			return false;
		}
		@Pc(143) int local143 = Static6.method148(this.anInt3186);
		if (local143 > arg3) {
			local143 = Static259.method4011(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3184) {
			this.anInt3184 = local143;
		}
		this.anInt3189 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3185 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass18_14 = null;
		return true;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lclient!vc;Lclient!jp;)V")
	private void method2930(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class126 arg1) {
		@Pc(6) Class200 local6 = Static331.method4882(Static345.aClass171_98, this.anInt3180);
		if (local6 == null) {
			return;
		}
		arg0.method1962(Static166.anIntArray630);
		arg0.method1958(0, 0, this.anInt3184, this.anInt3184);
		arg0.method1982(0, 0, this.anInt3184, this.anInt3184, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean242) {
				local32 = -arg1.anInt3179;
				local34 = -arg1.anInt3178;
				local36 = -arg1.anInt3181;
			} else {
				local32 = this.anInt3179 - arg1.anInt3179;
				local34 = this.anInt3178 - arg1.anInt3178;
				local36 = this.anInt3181 - arg1.anInt3181;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3189 != 0) {
			local81 = -this.anInt3189 & 0x3FFF;
			local85 = Class177.anIntArray843[local81];
			local89 = Class177.anIntArray844[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3185 != 0) {
			local81 = -this.anInt3185 & 0x3FFF;
			local85 = Class177.anIntArray843[local81];
			local89 = Class177.anIntArray844[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method1959(1.0F);
		arg0.method2038(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class66 local172 = arg0.method1998(local6, 1024, 0, 64, 768);
		local85 = local172.method5134() - local172.method5161();
		local89 = local172.method5160() - local172.method5140();
		local99 = local172.method5161() + local85 / 2;
		@Pc(198) int local198 = local172.method5140() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2006(local99, local198, local205, local205);
		arg0.method1961(arg0.method1995());
		@Pc(218) Class44 local218 = arg0.method2024();
		local218.method3541(0, 0, arg0.method2039() - local172.method5146());
		local172.method5162(local218, null, arg0.method2039());
		this.aClass18_14 = arg0.method2046(0, 0, this.anInt3184, this.anInt3184, true);
		this.aClass18_14.method4565(3);
		arg0.method1958(Static166.anIntArray630[0], Static166.anIntArray630[1], Static166.anIntArray630[2], Static166.anIntArray630[3]);
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(Lclient!vc;Lclient!jp;)Z")
	public boolean method2933(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class126 arg1) {
		return this.aClass18_14 != null || this.method2928(arg0, arg1);
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(Lclient!vc;Lclient!jp;)V")
	private void method2934(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class126 arg1) {
		Static166.method2927(arg0);
		Static166.method2926(arg0);
		arg0.method1962(Static166.anIntArray630);
		arg0.method1958(0, 0, this.anInt3184, this.anInt3184);
		arg0.method2041();
		arg0.method1982(0, 0, this.anInt3184, this.anInt3184, this.anInt3182 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean242) {
				local31 = -arg1.anInt3179;
				local33 = -arg1.anInt3178;
				local35 = -arg1.anInt3181;
			} else {
				local31 = arg1.anInt3179 - this.anInt3179;
				local33 = arg1.anInt3178 - this.anInt3178;
				local35 = arg1.anInt3181 - this.anInt3181;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3189 != 0) {
			local79 = Class177.anIntArray843[this.anInt3189];
			local84 = Class177.anIntArray844[this.anInt3189];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3185 != 0) {
			local79 = Class177.anIntArray843[this.anInt3185];
			local84 = Class177.anIntArray844[this.anInt3185];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class66 local147 = Static166.aClass66_5.method5119((byte) 0, 25600, true);
		if (arg0.method1957()) {
			local147.method5124((short) 0, (short) this.anInt3180);
		} else {
			local147.method5147((short) 127, Static371.anInterface9_7.method139(this.anInt3180).aShort52);
			local147.method5124((short) 0, (short) -1);
		}
		arg0.method1959(1.0F);
		arg0.method2038(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3184 * 1024 / (local147.method5134() - local147.method5161());
		if (this.anInt3182 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2006(this.anInt3184 / 2, this.anInt3184 / 2, local84, local84);
		arg0.method1961(arg0.method1995());
		@Pc(223) Class44 local223 = arg0.method1995();
		local223.method3541(0, 0, arg0.method2039() - local147.method5146());
		local147.method5162(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3184 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3184 - local245) / 2;
		Static166.aClass18_15.method4569(local252, local252, local245, local245, 1, this.anInt3182 | 0xFF000000, 1);
		this.aClass18_14 = arg0.method2046(0, 0, this.anInt3184, this.anInt3184, true);
		arg0.method2041();
		arg0.method1982(0, 0, this.anInt3184, this.anInt3184, 0, 0);
		Static166.aClass18_13.method4569(0, 0, this.anInt3184, this.anInt3184, 0, 0, 0);
		this.aClass18_14.method4565(0);
		arg0.method1958(Static166.anIntArray630[0], Static166.anIntArray630[1], Static166.anIntArray630[2], Static166.anIntArray630[3]);
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "()V")
	public void method2935() {
		this.aClass18_14 = null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!vc;IIIIII)V")
	public void method2936(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass18_14 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3189 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3185 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3186) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3186) / 2;
		if (local38 < arg4 && local38 + this.anInt3186 > 0 && local51 < arg3 && local51 + this.anInt3186 > 0) {
			this.aClass18_14.method4570(local51 + arg1, local38 + arg2, this.anInt3186, this.anInt3186);
		}
	}
}
