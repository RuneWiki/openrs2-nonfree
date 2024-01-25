import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wp", name = "R", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_327 = new Class123(46, 5);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ie;)Lclient!lf;")
	public static Class38_Sub2 method8140(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(12) Class38 local12 = Static262.method4026(arg0);
		@Pc(16) int local16 = arg0.method6816();
		@Pc(20) int local20 = arg0.method6816();
		return new Class38_Sub2(local12.aClass154_12, local12.aClass201_13, local12.anInt8021, local12.anInt8017, local12.anInt8020, local12.anInt8019, local12.anInt8022, local12.anInt8024, local12.anInt8023, local16, local20);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
	public static void method8145(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static189.aClass333ArrayArrayArray1 = Static590.aClass333ArrayArrayArray3;
			Static256.aClass127Array3 = Static108.aClass127Array5;
		} else {
			Static189.aClass333ArrayArrayArray1 = Static566.aClass333ArrayArrayArray2;
			Static256.aClass127Array3 = Static420.aClass127Array6;
		}
		Static590.anInt10277 = Static189.aClass333ArrayArrayArray1.length;
	}
}
