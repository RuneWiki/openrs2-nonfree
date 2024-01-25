import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "Lclient!br;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	public static int anInt2633;

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "[B")
	public static byte[] aByteArray34;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_23 = new Class5(260);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZLclient!dn;I)Lclient!tq;")
	public static Class226 method2161(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class56 arg2) {
		@Pc(10) int local10 = arg2.method1368(arg0);
		if (local10 == -1) {
			return new Class226(0);
		}
		@Pc(29) int[] local29 = arg2.method1363(local10);
		@Pc(35) Class226 local35 = new Class226(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt6743 > local37) {
				@Pc(53) Class3_Sub2 local53 = new Class3_Sub2(arg2.method1384(local10, local29[local39++]));
				@Pc(57) int local57 = local53.method6014();
				@Pc(61) int local61 = local53.method6004();
				@Pc(65) int local65 = local53.method6053();
				if (!arg1 && local65 == 1) {
					local35.anInt6743--;
				} else {
					local35.anIntArray487[local37] = local57;
					local35.anIntArray486[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!md;")
	public static Class74 method2162(@OriginalArg(1) Component arg0) {
		return new Class74_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIIIIIIII)V")
	public static void method2167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static142.anInt3212 <= arg2 && Static450.anInt7594 >= arg2 && arg5 >= Static142.anInt3212 && arg5 <= Static450.anInt7594 && Static142.anInt3212 <= arg6 && Static450.anInt7594 >= arg6 && Static142.anInt3212 <= arg7 && Static450.anInt7594 >= arg7 && Static161.anInt3448 <= arg1 && arg1 <= Static163.anInt3488 && Static161.anInt3448 <= arg8 && Static163.anInt3488 >= arg8 && arg4 >= Static161.anInt3448 && Static163.anInt3488 >= arg4 && arg3 >= Static161.anInt3448 && arg3 <= Static163.anInt3488) {
			Static93.method1632(arg1, arg6, arg0, arg8, arg2, arg4, arg5, arg7, arg3);
		} else {
			Static15.method458(arg4, arg6, arg0, arg5, arg2, arg7, arg8, arg3, arg1);
		}
	}
}
