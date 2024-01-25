import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ua", name = "Ab", descriptor = "I")
	public static int anInt6607;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lclient!ku;")
	public static final Class138 aClass138_6 = new Class138();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIII)V")
	public static void method5127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static392.method5076(local35, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!ob;)V")
	public static void method5156(@OriginalArg(1) Class7_Sub2_Sub3 arg0) {
		if (arg0 instanceof Class7_Sub2_Sub3_Sub1) {
			@Pc(28) Class7_Sub2_Sub3_Sub1 local28 = (Class7_Sub2_Sub3_Sub1) arg0;
			if (local28.aClass47_1 != null) {
				Static336.method4490(Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 != local28.aByte77, local28);
			}
		} else if (arg0 instanceof Class7_Sub2_Sub3_Sub2) {
			@Pc(8) Class7_Sub2_Sub3_Sub2 local8 = (Class7_Sub2_Sub3_Sub2) arg0;
			Static249.method3738(local8, local8.aByte77 != Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77);
		}
	}
}
