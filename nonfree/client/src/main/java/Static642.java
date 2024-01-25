import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public static int anInt10397 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method8834(@OriginalArg(1) String arg0) {
		return Static621.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
	public static void method8835() {
		@Pc(12) byte[] local12;
		if (Static70.anObject4 == null) {
			@Pc(5) Class44_Sub1_Sub1 local5 = new Class44_Sub1_Sub1();
			local12 = local5.method1254();
			Static70.anObject4 = Static325.method4947(local12);
		}
		if (Static612.anObject18 == null) {
			@Pc(27) Class44_Sub2_Sub2 local27 = new Class44_Sub2_Sub2();
			local12 = local27.method8035();
			Static612.anObject18 = Static325.method4947(local12);
		}
	}
}
