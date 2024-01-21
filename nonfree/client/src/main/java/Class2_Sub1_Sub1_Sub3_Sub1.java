import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub1_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!dg", name = "mc", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!dg", name = "rc", descriptor = "Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!dg", name = "sc", descriptor = "I")
	public int anInt1277;

	@OriginalMember(owner = "client!dg", name = "yc", descriptor = "I")
	public int anInt1280;

	@OriginalMember(owner = "client!dg", name = "zc", descriptor = "I")
	public int anInt1281;

	@OriginalMember(owner = "client!dg", name = "Ac", descriptor = "Lclient!hc;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!dg", name = "Bc", descriptor = "I")
	public int anInt1282;

	@OriginalMember(owner = "client!dg", name = "Gc", descriptor = "I")
	public int anInt1286;

	@OriginalMember(owner = "client!dg", name = "Ic", descriptor = "Lclient!ob;")
	public Class60 aClass60_288;

	@OriginalMember(owner = "client!dg", name = "Jc", descriptor = "I")
	public int anInt1288;

	@OriginalMember(owner = "client!dg", name = "oc", descriptor = "I")
	public int anInt1275 = 0;

	@OriginalMember(owner = "client!dg", name = "jc", descriptor = "S")
	private short aShort11 = 0;

	@OriginalMember(owner = "client!dg", name = "lc", descriptor = "I")
	public int anInt1272 = -1;

	@OriginalMember(owner = "client!dg", name = "hc", descriptor = "I")
	public int anInt1269 = 0;

	@OriginalMember(owner = "client!dg", name = "xc", descriptor = "S")
	private short aShort12 = 0;

	@OriginalMember(owner = "client!dg", name = "Ec", descriptor = "I")
	public int anInt1284 = -1;

	@OriginalMember(owner = "client!dg", name = "uc", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!dg", name = "Cc", descriptor = "I")
	public int anInt1283 = 0;

	@OriginalMember(owner = "client!dg", name = "qc", descriptor = "I")
	public int anInt1276 = 0;

	@OriginalMember(owner = "client!dg", name = "Kc", descriptor = "I")
	public int anInt1289 = 0;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2554() {
		return this.aClass32_1 != null;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		return super.anInt3266;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass32_1 == null) {
			return;
		}
		@Pc(26) Class2_Sub1_Sub5 local26 = super.anInt3270 != -1 && super.anInt3280 == 0 ? Static103.method2357(super.anInt3270) : null;
		@Pc(52) Class2_Sub1_Sub5 local52 = super.anInt3250 == -1 || this.aBoolean45 || super.anInt3250 == super.anInt3289 && local26 != null ? null : Static103.method2357(super.anInt3250);
		@Pc(63) Class2_Sub1_Sub1_Sub4 local63 = this.aClass32_1.method1580(super.anInt3290, super.anInt3301, local52, local26);
		if (local63 == null) {
			return;
		}
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = 0;
		super.anInt3266 = local63.method3179();
		@Pc(76) int local76 = 0;
		if (this.aShort11 != 0 && this.aShort12 != 0) {
			@Pc(92) int local92 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
			@Pc(96) int local96 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
			@Pc(99) short local99 = this.aShort11;
			@Pc(102) short local102 = this.aShort12;
			@Pc(107) int local107 = -local99 / 2;
			@Pc(112) int local112 = -local102 / 2;
			@Pc(123) int local123 = local96 * local112 - local107 * local92 >> 16;
			@Pc(134) int local134 = local92 * local112 + local107 * local96 >> 16;
			@Pc(146) int local146 = Static182.method3393(Static62.anInt1923, local134 + super.anInt3302, super.anInt3273 + local123);
			@Pc(151) int local151 = -local102 / 2;
			@Pc(155) int local155 = local99 / 2;
			@Pc(165) int local165 = local92 * local151 + local96 * local155 >> 16;
			@Pc(175) int local175 = local96 * local151 - local155 * local92 >> 16;
			@Pc(187) int local187 = Static182.method3393(Static62.anInt1923, super.anInt3302 + local165, local175 + super.anInt3273);
			@Pc(192) int local192 = -local99 / 2;
			@Pc(196) int local196 = local102 / 2;
			@Pc(207) int local207 = local96 * local196 - local92 * local192 >> 16;
			@Pc(217) int local217 = local96 * local192 + local92 * local196 >> 16;
			@Pc(230) int local230 = Static182.method3393(Static62.anInt1923, super.anInt3302 + local217, super.anInt3273 - -local207);
			@Pc(234) int local234 = local99 / 2;
			@Pc(238) int local238 = local102 / 2;
			@Pc(248) int local248 = local96 * local234 + local92 * local238 >> 16;
			@Pc(259) int local259 = local96 * local238 - local92 * local234 >> 16;
			@Pc(266) int local266 = local146 >= local187 ? local187 : local146;
			@Pc(278) int local278 = Static182.method3393(Static62.anInt1923, local248 + super.anInt3302, local259 + super.anInt3273);
			local76 = local278 + local146;
			@Pc(289) int local289 = local278 > local230 ? local230 : local278;
			if (local230 + local187 < local76) {
				local76 = local187 + local230;
			}
			@Pc(314) int local314 = local187 >= local278 ? local278 : local187;
			@Pc(321) int local321 = local146 < local230 ? local146 : local230;
			local68 = (int) (Math.atan2((double) (local266 - local289), (double) local102) * 325.95D) & 0x7FF;
			if (local68 != 0) {
				local63.method1616(local68);
			}
			local70 = (int) (Math.atan2((double) (local321 - local314), (double) local99) * 325.95D) & 0x7FF;
			if (local70 != 0) {
				local63.method1618(local70);
			}
			local76 = (local76 >> 1) - super.anInt3283;
			if (local76 != 0) {
				local63.method1622(0, local76, 0);
			}
		}
		@Pc(379) Class2_Sub1_Sub1_Sub4 local379 = null;
		if (!this.aBoolean45 && super.anInt3249 != -1 && super.anInt3297 != -1) {
			@Pc(397) Class2_Sub1_Sub14 local397 = Static101.method2313(super.anInt3249);
			local379 = local397.method2261(super.anInt3297);
			if (local379 != null) {
				local379.method1622(0, -super.anInt3251, 0);
				if (local397.aBoolean110) {
					if (local68 != 0) {
						local379.method1616(local68);
					}
					if (local70 != 0) {
						local379.method1618(local70);
					}
					if (local76 != 0) {
						local379.method1622(0, local76, 0);
					}
				}
			}
		}
		@Pc(440) Class2_Sub1_Sub1_Sub4 local440 = null;
		if (!this.aBoolean45 && this.aClass2_Sub1_Sub1_Sub4_1 != null) {
			if (Static20.anInt580 >= this.anInt1269) {
				this.aClass2_Sub1_Sub1_Sub4_1 = null;
			}
			if (Static20.anInt580 >= this.anInt1275 && Static20.anInt580 < this.anInt1269) {
				local440 = this.aClass2_Sub1_Sub1_Sub4_1;
				local440.method1622(this.anInt1281 - super.anInt3302, this.anInt1273 + -super.anInt3283, this.anInt1282 - super.anInt3273);
				if (super.anInt3255 == 512) {
					local440.method1612();
				} else if (super.anInt3255 == 1024) {
					local440.method1620();
				} else if (super.anInt3255 == 1536) {
					local440.method1617();
				}
			}
		}
		if (local379 != null) {
			local63 = ((Class2_Sub1_Sub1_Sub4_Sub1) local63).method1626(local379);
		}
		if (local440 != null) {
			local63 = ((Class2_Sub1_Sub1_Sub4_Sub1) local63).method1626(local440);
		}
		local63.aBoolean89 = true;
		local63.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local440 == null) {
			return;
		}
		if (super.anInt3255 == 512) {
			local440.method1617();
		} else if (super.anInt3255 == 1024) {
			local440.method1620();
		} else if (super.anInt3255 == 1536) {
			local440.method1612();
		}
		local440.method1622(super.anInt3302 - this.anInt1281, -this.anInt1273 + super.anInt3283, super.anInt3273 - this.anInt1282);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!og;)V")
	public void method902(@OriginalArg(1) Class2_Sub3 arg0) {
		arg0.anInt273 = 0;
		@Pc(20) int local20 = arg0.method218();
		if ((local20 & 0x2) == 2) {
			this.aShort11 = (short) (arg0.method218() << 2);
			this.aShort12 = (short) (arg0.method218() << 2);
		} else {
			this.aShort12 = 0;
			this.aShort11 = 0;
		}
		@Pc(64) boolean local64 = (local20 & 0x4) != 0;
		@Pc(67) int[] local67 = new int[12];
		@Pc(71) int local71 = local20 & 0x1;
		@Pc(73) int local73 = -1;
		super.anInt3286 = (local20 >> 3) + 1;
		this.anInt1284 = arg0.method227();
		this.anInt1272 = arg0.method227();
		this.anInt1289 = 0;
		@Pc(116) int local116;
		@Pc(122) int local122;
		for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
			@Pc(101) int local101 = arg0.method218();
			if (local101 == 0) {
				local67[local95] = 0;
			} else {
				local116 = arg0.method218();
				local122 = (local101 << 8) + local116;
				if (local95 == 0 && local122 == 65535) {
					local73 = arg0.method234();
					break;
				}
				if (local122 >= 32768) {
					local122 = Static97.anIntArray325[local122 - 32768];
					local67[local95] = local122 | 0x40000000;
					@Pc(158) int local158 = Static88.method2046(local122).anInt1565;
					if (local158 != 0) {
						this.anInt1289 = local158;
					}
				} else {
					local67[local95] = Integer.MIN_VALUE | local122 - 256;
				}
			}
		}
		@Pc(183) int[] local183 = new int[5];
		for (local116 = 0; local116 < 5; local116++) {
			local122 = arg0.method218();
			if (local122 < 0 || Static100.aShortArrayArray4[local116].length <= local122) {
				local122 = 0;
			}
			local183[local116] = local122;
		}
		super.anInt3289 = arg0.method234();
		if (super.anInt3289 == 65535) {
			super.anInt3289 = -1;
		}
		super.anInt3296 = arg0.method234();
		if (super.anInt3296 == 65535) {
			super.anInt3296 = -1;
		}
		super.anInt3252 = super.anInt3296;
		super.anInt3258 = arg0.method234();
		if (super.anInt3258 == 65535) {
			super.anInt3258 = -1;
		}
		super.anInt3278 = arg0.method234();
		if (super.anInt3278 == 65535) {
			super.anInt3278 = -1;
		}
		super.anInt3279 = arg0.method234();
		if (super.anInt3279 == 65535) {
			super.anInt3279 = -1;
		}
		super.anInt3268 = arg0.method234();
		if (super.anInt3268 == 65535) {
			super.anInt3268 = -1;
		}
		super.anInt3277 = arg0.method234();
		if (super.anInt3277 == 65535) {
			super.anInt3277 = -1;
		}
		this.aClass60_288 = Static182.method3394(arg0.method204()).method2663();
		this.anInt1283 = arg0.method218();
		if (local64) {
			this.anInt1276 = arg0.method234();
		} else {
			this.anInt1276 = 0;
		}
		if (this.aClass32_1 == null) {
			this.aClass32_1 = new Class32();
		}
		this.aClass32_1.method1579(local183, local67, local73, local71 == 1);
	}
}
