import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!ub;")
	public static Class163 aClass163_4;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public static int anInt857;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
	public static int[] anIntArray60 = new int[5];

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString37 = "Members object";

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!bk;IIIII)Ljava/awt/Frame;")
	public static Frame method610(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method447()) {
			return null;
		}
		@Pc(22) Class126[] local22 = Static209.method3310(arg0);
		if (local22 == null) {
			return null;
		}
		@Pc(29) boolean local29 = false;
		for (@Pc(31) int local31 = 0; local31 < local22.length; local31++) {
			if (arg2 == local22[local31].anInt3884 && local22[local31].anInt3887 == arg3 && (!local29 || local22[local31].anInt3882 > arg1)) {
				local29 = true;
				arg1 = local22[local31].anInt3882;
			}
		}
		if (!local29) {
			return null;
		}
		@Pc(97) Class163 local97 = arg0.method440(arg1, arg2, arg3);
		while (local97.anInt5259 == 0) {
			Static162.method2645(10L);
		}
		@Pc(112) Frame local112 = (Frame) local97.anObject7;
		if (local112 == null) {
			return null;
		} else if (local97.anInt5259 == 2) {
			Static178.method2735(arg0, local112);
			return null;
		} else {
			return local112;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)Lclient!nn;")
	public static Class13_Sub1 method611(@OriginalArg(1) int arg0) {
		return Static158.aBoolean272 && arg0 >= Static270.anInt5333 && arg0 <= Static10.anInt104 ? Static91.aClass13_Sub1Array2[arg0 - Static270.anInt5333] : null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method612(@OriginalArg(1) int arg0) {
		@Pc(22) byte[] local22;
		if (arg0 == 100 && Static64.anInt1389 > 0) {
			local22 = Static213.aByteArrayArray13[--Static64.anInt1389];
			Static213.aByteArrayArray13[Static64.anInt1389] = null;
			return local22;
		} else if (arg0 == 5000 && Static190.anInt3821 > 0) {
			local22 = Static172.aByteArrayArray11[--Static190.anInt3821];
			Static172.aByteArrayArray11[Static190.anInt3821] = null;
			return local22;
		} else if (arg0 == 30000 && Static172.anInt3427 > 0) {
			local22 = Static193.aByteArrayArray12[--Static172.anInt3427];
			Static193.aByteArrayArray12[Static172.anInt3427] = null;
			return local22;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == arg0) {
			Static275.method4080(arg0, arg4, arg5, arg6, arg3, arg2);
		} else if (Static253.anInt4996 <= arg5 - arg0 && arg0 + arg5 <= Static52.anInt1146 && arg6 - arg1 >= Static228.anInt4643 && Static244.anInt4872 >= arg6 + arg1) {
			Static23.method407(arg2, arg4, arg5, arg3, arg6, arg1, arg0);
		} else {
			Static105.method1697(arg2, arg3, arg6, arg1, arg0, arg5, arg4);
		}
	}
}
