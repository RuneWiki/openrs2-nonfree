import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public static int anInt3304;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
	public static int anInt3305;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
	public static int anInt3306;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "[I")
	public static final int[] anIntArray168 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!dt;B)Lclient!dv;")
	public static Class88 method2821(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) String local7 = arg0.method7922();
		@Pc(14) Class266 local14 = Static404.method5594()[arg0.method7954()];
		@Pc(21) Class131 local21 = Static296.method4347()[arg0.method7954()];
		@Pc(25) int local25 = arg0.method7918();
		@Pc(29) int local29 = arg0.method7918();
		@Pc(33) int local33 = arg0.method7954();
		@Pc(37) int local37 = arg0.method7954();
		@Pc(41) int local41 = arg0.method7954();
		@Pc(45) int local45 = arg0.method7951();
		@Pc(49) int local49 = arg0.method7951();
		@Pc(53) int local53 = arg0.method7895();
		@Pc(57) int local57 = arg0.method7895();
		@Pc(66) int local66 = arg0.method7895();
		return new Class88(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57, local66);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!nga;")
	public static Class34_Sub1_Sub1 method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class205 local14 = local7.aClass205_4; local14 != null; local14 = local14.aClass205_3) {
			@Pc(18) Class34_Sub1_Sub1 local18 = local14.aClass34_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort98 == arg1 && local18.aShort99 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
