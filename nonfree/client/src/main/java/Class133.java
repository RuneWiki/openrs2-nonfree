import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class133 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public int anInt3284;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	private int anInt3287;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	private int anInt3288;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	private int anInt3290;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!f;")
	private Class22 aClass22_17;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	private int anInt3293;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	private final int anInt3283;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	private final int anInt3289;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	private final int anInt3291;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
	private final boolean aBoolean244;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private final int anInt3292;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	private final int anInt3294;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	private final int anInt3285;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	private final int anInt3286;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3283 = arg2;
		this.anInt3289 = arg3;
		this.anInt3291 = arg4;
		this.aBoolean244 = arg7;
		this.anInt3292 = arg1;
		this.anInt3294 = arg6;
		this.anInt3285 = arg5;
		this.anInt3286 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!r;Lclient!he;)Z")
	public boolean method2603(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class133 arg1) {
		return this.aClass22_17 != null || this.method2611(arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method2604(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass22_17 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3287 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3293 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3288) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3288) / 2;
		if (local38 < arg4 && local38 + this.anInt3288 > 0 && local51 < arg3 && local51 + this.anInt3288 > 0) {
			this.aClass22_17.method7653(local51 + arg1, local38 + arg2, this.anInt3288, this.anInt3288);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!r;Lclient!he;)V")
	private void method2607(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class133 arg1) {
		Static186.method2613(arg0);
		Static186.method2612(arg0);
		arg0.oa(Static186.anIntArray304);
		arg0.da(0, 0, this.anInt3290, this.anInt3290);
		arg0.ya();
		arg0.J(0, 0, this.anInt3290, this.anInt3290, this.anInt3294 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean244) {
				local31 = -arg1.anInt3283;
				local33 = -arg1.anInt3289;
				local35 = -arg1.anInt3291;
			} else {
				local31 = arg1.anInt3283 - this.anInt3283;
				local33 = arg1.anInt3289 - this.anInt3289;
				local35 = arg1.anInt3291 - this.anInt3291;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3287 != 0) {
			local79 = Class1_Sub6_Sub2.anIntArray675[this.anInt3287];
			local84 = Class1_Sub6_Sub2.anIntArray676[this.anInt3287];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt3293 != 0) {
			local79 = Class1_Sub6_Sub2.anIntArray675[this.anInt3293];
			local84 = Class1_Sub6_Sub2.anIntArray676[this.anInt3293];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class63 local147 = Static186.aClass63_2.method7417((byte) 0, 51200, true);
		if (arg0.method6931()) {
			local147.DA((short) 0, (short) this.anInt3292);
		} else {
			local147.d((short) 127, Static71.anInterface7_2.method3874(this.anInt3292).aShort1);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3290 * 1024 / (local147.l() - local147.KA());
		if (this.anInt3294 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt3290 / 2, this.anInt3290 / 2, local84, local84);
		arg0.method6919(arg0.method6924());
		@Pc(223) Class113 local223 = arg0.method6924();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7420(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt3290 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3290 - local245) / 2;
		Static186.aClass22_18.method7654(local252, local252, local245, local245, 0, this.anInt3294 | 0xFF000000, 1);
		this.aClass22_17 = arg0.method6918(0, 0, this.anInt3290, this.anInt3290, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt3290, this.anInt3290, 0, 0);
		Static186.aClass22_16.method7654(0, 0, this.anInt3290, this.anInt3290, 1, 0, 0);
		this.aClass22_17.xa(0, 0, 0);
		arg0.da(Static186.anIntArray304[0], Static186.anIntArray304[1], Static186.anIntArray304[2], Static186.anIntArray304[3]);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!r;Lclient!he;)V")
	private void method2608(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class133 arg1) {
		@Pc(6) Class210 local6 = Static127.method2013(this.anInt3292, Static236.aClass270_51);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static186.anIntArray304);
		arg0.da(0, 0, this.anInt3290, this.anInt3290);
		arg0.J(0, 0, this.anInt3290, this.anInt3290, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean244) {
				local32 = -arg1.anInt3283;
				local34 = -arg1.anInt3289;
				local36 = -arg1.anInt3291;
			} else {
				local32 = this.anInt3283 - arg1.anInt3283;
				local34 = this.anInt3289 - arg1.anInt3289;
				local36 = this.anInt3291 - arg1.anInt3291;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3287 != 0) {
			local81 = -this.anInt3287 & 0x3FFF;
			local85 = Class1_Sub6_Sub2.anIntArray675[local81];
			local89 = Class1_Sub6_Sub2.anIntArray676[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt3293 != 0) {
			local81 = -this.anInt3293 & 0x3FFF;
			local85 = Class1_Sub6_Sub2.anIntArray675[local81];
			local89 = Class1_Sub6_Sub2.anIntArray676[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class63 local172 = arg0.method6910(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method6919(arg0.method6924());
		@Pc(218) Class113 local218 = arg0.method6963();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7420(local218, null, arg0.BA(), 1);
		this.aClass22_17 = arg0.method6918(0, 0, this.anInt3290, this.anInt3290, true);
		this.aClass22_17.xa(0, 0, 3);
		arg0.da(Static186.anIntArray304[0], Static186.anIntArray304[1], Static186.anIntArray304[2], Static186.anIntArray304[3]);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
	public boolean method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean244) {
			this.anInt3284 = 1073741823;
			local7 = this.anInt3283;
			local12 = this.anInt3289;
			local17 = this.anInt3291;
		} else {
			local7 = this.anInt3283 - arg0;
			local12 = this.anInt3289 - arg1;
			local17 = this.anInt3291 - arg2;
			this.anInt3284 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3284 == 0) {
				this.anInt3284 = 1;
			}
			local7 = (local7 << 8) / this.anInt3284;
			local12 = (local12 << 8) / this.anInt3284;
			local17 = (local17 << 8) / this.anInt3284;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3288 = this.anInt3285 * arg3 / (this.aBoolean244 ? 1024 : this.anInt3284);
		} else {
			this.anInt3288 = 0;
		}
		if (this.anInt3288 < 8) {
			this.aClass22_17 = null;
			return false;
		}
		@Pc(143) int local143 = Static457.method6299(this.anInt3288);
		if (local143 > arg3) {
			local143 = Static558.method7589(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3290) {
			this.anInt3290 = local143;
		}
		this.anInt3287 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt3293 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass22_17 = null;
		return true;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
	public void method2610() {
		this.aClass22_17 = null;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Lclient!r;Lclient!he;)Z")
	private boolean method2611(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class133 arg1) {
		if (this.aClass22_17 == null) {
			if (this.anInt3286 == 0) {
				if (Static71.anInterface7_2.method3871(this.anInt3292)) {
					@Pc(23) int[] local23 = Static71.anInterface7_2.method3872(this.anInt3290, this.anInt3290, this.anInt3292, 0.7F);
					this.aClass22_17 = arg0.method6970(local23, this.anInt3290, this.anInt3290, this.anInt3290);
				}
			} else if (this.anInt3286 == 2) {
				this.method2608(arg0, arg1);
			} else if (this.anInt3286 == 1) {
				this.method2607(arg0, arg1);
			}
		}
		return this.aClass22_17 != null;
	}
}
