import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static534 {

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	public static int anInt9700;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "[Lclient!rn;")
	public static final Class51_Sub1[] aClass51_Sub1Array12 = new Class51_Sub1[37];

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "Lclient!mca;")
	public static final Class229 aClass229_16 = new Class229("stellardawn", 1);

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZILclient!kja;)V")
	public static void method8491(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8_Sub2 arg1) {
		Static17.aBoolean633 = false;
		Static318.anInt5798 = 0;
		Static84.method1421(arg1);
		Static217.method4044(arg1);
		if (Static17.aBoolean633) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt5725 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt5725 + " psize:" + arg0);
		}
	}
}
