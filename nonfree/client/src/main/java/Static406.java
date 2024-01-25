import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_80 = new Class94(19, -1);

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Z")
	public static boolean aBoolean551 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!at;)V")
	public static void method6596(@OriginalArg(1) Class24 arg0) {
		if (!Static475.aBoolean695) {
			return;
		}
		if (arg0.anObjectArray2 != null) {
			@Pc(23) Class24 local23 = Static330.method5694(Static194.anInt4509, Static397.anInt7582);
			if (local23 != null) {
				@Pc(29) Class2_Sub44 local29 = new Class2_Sub44();
				local29.aClass24_15 = arg0;
				local29.aClass24_14 = local23;
				local29.anObjectArray32 = arg0.anObjectArray2;
				Static284.method5153(local29);
			}
		}
		@Pc(46) Class2_Sub52 local46 = Static130.method3019(Static11.aClass94_66, Static361.aClass183_1);
		local46.aClass2_Sub11_Sub2_7.method8387(arg0.anInt510);
		local46.aClass2_Sub11_Sub2_7.method8352(Static397.anInt7582);
		local46.aClass2_Sub11_Sub2_7.method8331(Static194.anInt4509);
		local46.aClass2_Sub11_Sub2_7.method8333(Static64.anInt2065);
		local46.aClass2_Sub11_Sub2_7.method8331(arg0.anInt439);
		local46.aClass2_Sub11_Sub2_7.method8333(arg0.anInt501);
		Static96.method2563(local46);
	}
}
