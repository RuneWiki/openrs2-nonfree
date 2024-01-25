import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!ij;")
	public static Class93 aClass93_106;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!mb;")
	public static final Class19[] aClass19Array3 = new Class19[128];

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method4829(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 5);
		local8.method856();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ij;Lclient!ij;I)V")
	public static void method4831(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		Static198.aClass93_76 = arg0;
		Static130.aClass93_108 = arg1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZB)V")
	public static void method4832(@OriginalArg(1) boolean arg0) {
		Static163.anInt3233++;
		Static77.method1406();
		if (arg0) {
			Static310.anInt6635++;
			Static192.method3439();
		}
	}
}
