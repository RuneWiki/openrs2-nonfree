import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[Lclient!maa;")
	public static final Class87_Sub1[] aClass87_Sub1Array4 = new Class87_Sub1[37];

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
	public static final int[] anIntArray656 = new int[13];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
	public static boolean method7564(@OriginalArg(1) int arg0) {
		return arg0 == 45 || arg0 == 10 || arg0 == 11 || arg0 == 15 || arg0 == 22 || arg0 == 20 || arg0 == 6;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!wg;)Z")
	public static boolean method7565(@OriginalArg(1) Class379 arg0) {
		return arg0 == null ? false : Static149.method2635(arg0.anInt10296, arg0.anInt10298, arg0.anInt10300, arg0.anInt10291 - arg0.anInt10298, arg0.anInt10289 - arg0.anInt10296, arg0.anInt10295 - arg0.anInt10300);
	}
}
