import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub4_Sub9 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
	private int anInt2197;

	@OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
	private int anInt2204;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(20) int local20 = Static98.anInt3017 / this.anInt2197;
			@Pc(24) int local24 = arg0 % local20;
			@Pc(34) int[] local34 = this.method3215(local24 * Static98.anInt3017 / local20, 0);
			for (@Pc(36) int local36 = 0; local36 < Static73.anInt1888; local36++) {
				@Pc(43) int local43 = Static73.anInt1888 / this.anInt2204;
				@Pc(47) int local47 = local36 % local43;
				local11[local36] = local34[Static73.anInt1888 * local47 / local43];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(26) int local26 = Static98.anInt3017 / this.anInt2197;
			@Pc(30) int local30 = arg0 % local26;
			@Pc(40) int[][] local40 = this.method3217(0, Static98.anInt3017 * local30 / local26);
			@Pc(44) int[] local44 = local40[1];
			@Pc(48) int[] local48 = local17[0];
			@Pc(52) int[] local52 = local40[0];
			@Pc(56) int[] local56 = local40[2];
			@Pc(60) int[] local60 = local17[1];
			@Pc(64) int[] local64 = local17[2];
			for (@Pc(66) int local66 = 0; local66 < Static73.anInt1888; local66++) {
				@Pc(73) int local73 = Static73.anInt1888 / this.anInt2204;
				@Pc(77) int local77 = local66 % local73;
				@Pc(83) int local83 = Static73.anInt1888 * local77 / local73;
				local48[local66] = local52[local83];
				local60[local66] = local44[local83];
				local64[local66] = local56[local83];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2204 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt2197 = arg0.method544();
		}
	}
}
