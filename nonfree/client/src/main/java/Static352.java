import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "Lclient!jn;")
	public static final Class183 aClass183_10 = new Class183();

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_66 = new Class46(32, 2);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BZLclient!ha;I)Lclient!li;")
	public static Class214 method5258(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static438.anIntArray599 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static438.anIntArray599.length; local14++) {
				if (arg2 == Static438.anIntArray599[local14]) {
					return Static156.aClass214Array1[local14];
				}
			}
		}
		@Pc(41) Class214 local41 = (Class214) Static102.aClass87_57.method1805((long) arg2);
		if (local41 != null) {
			if (arg0 && local41.aClass272_10 == null) {
				@Pc(53) Class272 local53 = Static531.method7862(Static227.aClass207_47, arg2);
				if (local53 == null) {
					return null;
				}
				local41.aClass272_10 = local53;
			}
			return local41;
		}
		@Pc(66) Class131[] local66 = Static649.method2902(Static33.aClass207_8, arg2);
		if (local66 == null) {
			return null;
		}
		@Pc(77) Class272 local77 = Static531.method7862(Static227.aClass207_47, arg2);
		if (local77 == null) {
			return null;
		}
		if (arg0) {
			local41 = new Class214(arg1.method7255(local77, local66), local77);
		} else {
			local41 = new Class214(arg1.method7255(local77, local66));
		}
		Static102.aClass87_57.method1792((long) arg2, local41);
		return local41;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method5259(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static329.method2414(arg0, arg0.length - 1, 0, arg1);
	}
}
