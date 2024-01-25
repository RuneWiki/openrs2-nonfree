import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ql;")
	public static Class4_Sub39 aClass4_Sub39_1;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "[S")
	public static final short[] aShortArray109 = new short[] { 45, 21, 60, 9, 5, 19, 30, 6 };

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!fg;)V")
	public static void method4908(@OriginalArg(1) Class4_Sub18 arg0) {
		if (!aBoolean431) {
			arg0.method8013();
			Static300.anInt5730--;
		}
	}
}
