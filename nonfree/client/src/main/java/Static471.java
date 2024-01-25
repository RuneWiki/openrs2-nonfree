import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!ow", name = "E", descriptor = "J")
	public static long aLong231;

	@OriginalMember(owner = "client!ow", name = "F", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_138 = new Class225(118, -2);

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "(I)Z")
	public static boolean method6759() {
		Static84.anInt1420++;
		Static46.aBoolean79 = true;
		return true;
	}

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "(I)V")
	public static void method6760() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static610.anInt10726 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIBIZLclient!nca;Lclient!rha;)V")
	public static void method6761(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class254 arg2, @OriginalArg(6) Class2_Sub23_Sub5 arg3) {
		Static704.method9423(arg0, arg2, arg1);
		Static478.aClass2_Sub23_Sub5_4 = arg3;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIBI)Z")
	public static boolean method6762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static334.aBoolean436 || !Static11.aBoolean26) {
			return false;
		} else if (Static170.anInt2918 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static613.anIntArrayArrayArray18[arg1][arg0][arg2];
			if (local28 == -Static9.anInt163) {
				return false;
			} else if (Static9.anInt163 == local28) {
				return true;
			} else if (Static685.aClass133Array5 == Static158.aClass133Array4) {
				return false;
			} else {
				@Pc(55) int local55 = arg0 << Static260.anInt4053;
				@Pc(59) int local59 = arg2 << Static260.anInt4053;
				if (Static159.method2362(Static158.aClass133Array4[arg1].method8217(arg0, arg2 + 1), Static158.aClass133Array4[arg1].method8217(arg0, arg2), local55 + 1, local59 + Static60.anInt1042 + -1, local59 + 1, local59 + -1 + Static60.anInt1042, local55 + 1, local55 + Static60.anInt1042 + -1, Static158.aClass133Array4[arg1].method8217(arg0 + 1, arg2 - -1)) && Static159.method2362(Static158.aClass133Array4[arg1].method8217(arg0 + 1, arg2 + 1), Static158.aClass133Array4[arg1].method8217(arg0, arg2), local55 + 1, local59 + Static60.anInt1042 + -1, local59 + 1, local59 + 1, local55 + Static60.anInt1042 - 1, Static60.anInt1042 + local55 - 1, Static158.aClass133Array4[arg1].method8217(arg0 + 1, arg2))) {
					Static373.anInt5942++;
					Static613.anIntArrayArrayArray18[arg1][arg0][arg2] = Static9.anInt163;
					return true;
				} else {
					Static613.anIntArrayArrayArray18[arg1][arg0][arg2] = -Static9.anInt163;
					return false;
				}
			}
		}
	}
}
