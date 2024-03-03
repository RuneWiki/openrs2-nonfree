import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!br", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!br", name = "R", descriptor = "I")
	public static int anInt798;

	@OriginalMember(owner = "client!br", name = "V", descriptor = "Lclient!cf;")
	public static Class2_Sub5 aClass2_Sub5_2;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!wm;Lclient!hp;III)V", line = 11)
	public static void method990(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class67 local12;
		if (arg3 < Static68.anInt1682) {
			local12 = Static307.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6077()) {
				arg1.method6076(Class11_Sub5_Sub3.anInt4707, 0, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg4 < Static68.anInt1682) {
			local12 = Static307.aClass67ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6077()) {
				arg1.method6076(0, Class11_Sub5_Sub3.anInt4707, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg3 < Static68.anInt1682 && arg4 < Static196.anInt3769) {
			local12 = Static307.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6077()) {
				arg1.method6076(Class11_Sub5_Sub3.anInt4707, Class11_Sub5_Sub3.anInt4707, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg3 < Static68.anInt1682 && arg4 > 0) {
			local12 = Static307.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6077()) {
				arg1.method6076(Class11_Sub5_Sub3.anInt4707, -Class11_Sub5_Sub3.anInt4707, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(Z)I", line = 59)
	public static int method991() {
		return 2;
	}
}
