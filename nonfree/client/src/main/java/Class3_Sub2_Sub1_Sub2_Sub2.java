import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class3_Sub2_Sub1_Sub2_Sub2 extends Class3_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!hh", name = "lc", descriptor = "Lclient!fh;")
	public Class3_Sub2_Sub7 aClass3_Sub2_Sub7_1;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1436() {
		return this.aClass3_Sub2_Sub7_1 != null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass3_Sub2_Sub7_1 == null) {
			return;
		}
		@Pc(24) Class3_Sub2_Sub4 local24 = super.anInt1833 != -1 && super.anInt1832 == 0 ? Static21.method594(super.anInt1833) : null;
		@Pc(46) Class3_Sub2_Sub4 local46 = super.anInt1827 == -1 || super.anInt1821 == super.anInt1827 && local24 != null ? null : Static21.method594(super.anInt1827);
		@Pc(57) Class3_Sub2_Sub1_Sub1 local57 = this.aClass3_Sub2_Sub7_1.method1116(local24, local46, super.anInt1799, super.anInt1814);
		if (local57 == null) {
			return;
		}
		local57.method191();
		super.aShort36 = local57.aShort36;
		if (this.aClass3_Sub2_Sub7_1.aShort22 != 0 && this.aClass3_Sub2_Sub7_1.aShort23 != 0) {
			@Pc(78) short local78 = this.aClass3_Sub2_Sub7_1.aShort23;
			@Pc(82) short local82 = this.aClass3_Sub2_Sub7_1.aShort22;
			@Pc(86) int local86 = Class3_Sub2_Sub2_Sub2.anIntArray129[arg0];
			@Pc(90) int local90 = Class3_Sub2_Sub2_Sub2.anIntArray127[arg0];
			@Pc(95) int local95 = -local78 / 2;
			@Pc(100) int local100 = -local78 / 2;
			@Pc(104) int local104 = local82 / 2;
			@Pc(115) int local115 = local86 * local100 - local104 * local90 >> 16;
			@Pc(120) int local120 = -local82 / 2;
			@Pc(130) int local130 = local90 * local95 + local120 * local86 >> 16;
			@Pc(140) int local140 = local95 * local86 - local90 * local120 >> 16;
			@Pc(152) int local152 = Static33.method848(super.anInt1800 + local130, Static171.anInt4109, local140 + super.anInt1792);
			@Pc(162) int local162 = local100 * local90 + local86 * local104 >> 16;
			@Pc(174) int local174 = Static33.method848(local162 + super.anInt1800, Static171.anInt4109, local115 + super.anInt1792);
			@Pc(179) int local179 = -local82 / 2;
			@Pc(183) int local183 = local78 / 2;
			@Pc(194) int local194 = local90 * local183 + local179 * local86 >> 16;
			@Pc(205) int local205 = local86 * local183 - local90 * local179 >> 16;
			@Pc(209) int local209 = local82 / 2;
			@Pc(221) int local221 = Static33.method848(local194 + super.anInt1800, Static171.anInt4109, local205 + super.anInt1792);
			@Pc(225) int local225 = local78 / 2;
			@Pc(235) int local235 = local209 * local86 + local90 * local225 >> 16;
			@Pc(246) int local246 = local225 * local86 - local90 * local209 >> 16;
			@Pc(258) int local258 = Static33.method848(local235 + super.anInt1800, Static171.anInt4109, super.anInt1792 + local246);
			@Pc(269) int local269 = local174 <= local152 ? local174 : local152;
			@Pc(280) int local280 = local221 >= local258 ? local258 : local221;
			@Pc(291) int local291 = local258 > local174 ? local174 : local258;
			@Pc(302) int local302 = local152 < local221 ? local152 : local221;
			@Pc(316) int local316 = (int) (Math.atan2((double) (local269 - local280), (double) local78) * 320.0D) & 0x7FF;
			local57.method202(local316);
			@Pc(333) int local333 = (int) (Math.atan2((double) (local302 - local291), (double) local82) * 320.0D) & 0x7FF;
			@Pc(343) int local343 = (local302 + local291 + local280 + local269) / 4;
			local57.method197(local333);
			local57.method189(0, local343 - super.anInt1809, 0);
		}
		@Pc(357) Class3_Sub2_Sub1_Sub1 local357 = null;
		if (super.anInt1790 != -1 && super.anInt1838 != -1) {
			local357 = Static1.method8(super.anInt1790).method553(super.anInt1838);
			if (local357 != null) {
				local357.method189(0, -super.anInt1824, 0);
			}
		}
		if (local357 != null) {
			local57 = ((Class3_Sub2_Sub1_Sub1_Sub1) local57).method208(local357);
		}
		if (this.aClass3_Sub2_Sub7_1.anInt1338 == 1) {
			local57.aBoolean13 = true;
		}
		local57.method2763(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
