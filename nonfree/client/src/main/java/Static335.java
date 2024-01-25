import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!ij;")
	public static Class93 aClass93_123;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!fk;")
	public static Class71 aClass71_9;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!tn;")
	public static final Class190 aClass190_32 = new Class190(16);

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public static int anInt6568 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!vg;ILclient!vg;)V")
	public static void method5817(@OriginalArg(0) Class201 arg0, @OriginalArg(2) Class201 arg1) {
		Static125.aClass5_Sub12_Sub2_3.method5125(72);
		Static125.aClass5_Sub12_Sub2_3.method5070(arg1.anInt6541);
		Static125.aClass5_Sub12_Sub2_3.method5095(arg1.anInt6548);
		Static125.aClass5_Sub12_Sub2_3.method5076(arg1.anInt6509);
		Static125.aClass5_Sub12_Sub2_3.method5070(arg0.anInt6541);
		Static125.aClass5_Sub12_Sub2_3.method5095(arg0.anInt6509);
		Static125.aClass5_Sub12_Sub2_3.method5088(arg0.anInt6548);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method5820(@OriginalArg(1) Class5_Sub12 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static117.anInt2167; local1++) {
			@Pc(8) int local8 = arg0.method5060();
			@Pc(12) int local12 = arg0.method5106();
			if (local12 == 65535) {
				local12 = -1;
			}
			if (Static1.aClass6_Sub1Array1[local8] != null) {
				Static1.aClass6_Sub1Array1[local8].anInt82 = local12;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method5823() {
		Static136.anIntArray264 = Static223.method4063(0.4F);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method5824(@OriginalArg(0) Class93 arg0) {
		Static229.aClass93_87 = arg0;
	}
}
