import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "Lclient!re;")
	public static Class308 aClass308_1;

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
	public static int anInt9965;

	// $FF: synthetic field
	@OriginalMember(owner = "client!uca", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass51;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!ak;)V")
	public static void method8541(@OriginalArg(1) Class14_Sub3 arg0) {
		if (Static63.aClass89ArrayArrayArray1 == null) {
			return;
		}
		@Pc(9) Interface16 local9 = null;
		if (arg0.anInt227 == 0) {
			local9 = (Interface16) Static34.method575(arg0.anInt231, arg0.anInt233, arg0.anInt224);
		}
		if (arg0.anInt227 == 1) {
			local9 = (Interface16) Static161.method1396(arg0.anInt231, arg0.anInt233, arg0.anInt224);
		}
		if (arg0.anInt227 == 2) {
			local9 = (Interface16) Static492.method7403(arg0.anInt231, arg0.anInt233, arg0.anInt224, aClass51 == null ? (aClass51 = Class361.a("np")) : aClass51);
		}
		if (arg0.anInt227 == 3) {
			local9 = (Interface16) Static447.method6640(arg0.anInt231, arg0.anInt233, arg0.anInt224);
		}
		if (local9 == null) {
			arg0.anInt228 = 0;
			arg0.anInt229 = 0;
			arg0.anInt223 = -1;
		} else {
			arg0.anInt223 = local9.method9501();
			arg0.anInt228 = local9.method9498();
			arg0.anInt229 = local9.method9502();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8542(@OriginalArg(0) String arg0) {
		Static187.method2752(arg0, 0, "", "", 0, "");
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!ha;BI)Lclient!tja;")
	public static Class350 method8543(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class272 local10 = Static613.method8648(arg0, true, arg1, true);
		return local10 == null ? null : local10.aClass350_8;
	}
}
