import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!k", name = "S", descriptor = "I")
	public static int anInt4733 = -1;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "Lclient!wo;")
	public static Class362 aClass362_105 = null;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method4154() {
		Static577.aClass223_67.method5398();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIBI)V")
	public static void method4156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class4_Sub5_Sub16 local14 = Static219.method3587(arg1, 8);
		local14.method7133();
		local14.anInt8736 = arg3;
		local14.anInt8738 = arg2;
		local14.anInt8739 = arg0;
	}
}
