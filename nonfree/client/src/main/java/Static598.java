import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Z")
	public static boolean aBoolean714;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!wia;")
	public static Class386 aClass386_124;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
	public static int[] anIntArray735;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "J")
	public static long aLong266 = 0L;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!qfa;ZI[BIII)Lclient!cw;")
	public static Class66_Sub1_Sub1 method8450(@OriginalArg(0) int arg0, @OriginalArg(1) Class137_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1.aBoolean595 || Static178.method2845(arg0) && Static178.method2845(arg2)) {
			return new Class66_Sub1_Sub1(arg1, 3553, 6406, arg0, arg2, false, arg3, 6406);
		} else if (arg1.aBoolean596) {
			return new Class66_Sub1_Sub1(arg1, 34037, 6406, arg0, arg2, false, arg3, 6406);
		} else {
			return new Class66_Sub1_Sub1(arg1, 6406, arg0, arg2, Static330.method5181(arg0), Static330.method5181(arg2), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!je;III)V")
	public static void method8451(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class58 local12;
		if (arg2 < Static28.anInt704) {
			local12 = Static486.aClass58ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass12_Sub2_Sub4_1 != null && local12.aClass12_Sub2_Sub4_1.method9160()) {
				arg0.method9166(true, local12.aClass12_Sub2_Sub4_1, 0, Static222.anInt4166, Static533.aClass137_41, 0);
			}
		}
		if (arg3 < Static28.anInt704) {
			local12 = Static486.aClass58ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass12_Sub2_Sub4_1 != null && local12.aClass12_Sub2_Sub4_1.method9160()) {
				arg0.method9166(true, local12.aClass12_Sub2_Sub4_1, Static222.anInt4166, 0, Static533.aClass137_41, 0);
			}
		}
		if (arg2 < Static28.anInt704 && arg3 < Static55.anInt1384) {
			local12 = Static486.aClass58ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass12_Sub2_Sub4_1 != null && local12.aClass12_Sub2_Sub4_1.method9160()) {
				arg0.method9166(true, local12.aClass12_Sub2_Sub4_1, Static222.anInt4166, Static222.anInt4166, Static533.aClass137_41, 0);
			}
		}
		if (arg2 < Static28.anInt704 && arg3 > 0) {
			local12 = Static486.aClass58ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass12_Sub2_Sub4_1 != null && local12.aClass12_Sub2_Sub4_1.method9160()) {
				arg0.method9166(true, local12.aClass12_Sub2_Sub4_1, -Static222.anInt4166, Static222.anInt4166, Static533.aClass137_41, 0);
			}
		}
	}
}
