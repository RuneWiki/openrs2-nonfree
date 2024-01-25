import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[Lclient!nw;")
	public static Class246[] aClass246Array1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!jc;)V")
	public static void method2213(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub13_5 != null) {
			arg0.aClass1_Sub13_5.anInt912 = 0;
		}
		arg0.aBoolean613 = false;
		for (@Pc(26) Class1_Sub6 local26 = arg0.method6577(); local26 != null; local26 = arg0.method6578()) {
			method2213(local26);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
	public static void method2216(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static122.method2188(0, arg0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!rs;B)V")
	public static void method2218(@OriginalArg(0) Class301 arg0) {
		Static231.aClass301_1 = arg0;
	}
}
