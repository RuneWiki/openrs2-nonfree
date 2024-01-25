import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "[S")
	public static short[] aShortArray92;

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "[I")
	public static final int[] anIntArray510 = new int[25];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!jl;I)V")
	public static void method6100(@OriginalArg(0) Class13_Sub6 arg0) {
		arg0.aClass13_Sub1_2 = null;
		@Pc(12) int local12 = arg0.aClass13_Sub2Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass13_Sub2Array1[local14].aBoolean48 = false;
		}
		@Pc(28) Class171[] local28 = Class169.aClass171Array1;
		synchronized (Class169.aClass171Array1) {
			if (local12 < Class169.aClass171Array1.length && Static470.anIntArray544[local12] < 200) {
				Class169.aClass171Array1[local12].method3746(arg0);
				@Pc(55) int local55 = Static470.anIntArray544[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!vj;B)Lclient!wt;")
	public static Class379 method6101(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(15) Class379 local15 = new Class379();
		local15.anInt10329 = arg0.method8546();
		local15.aClass2_Sub2_Sub10_1 = Static295.aClass362_2.method8112(local15.anInt10329);
		return local15;
	}
}
