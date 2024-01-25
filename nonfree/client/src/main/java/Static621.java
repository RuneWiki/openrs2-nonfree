import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
	public static int anInt9974;

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
	public static int anInt9968 = 0;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Z")
	public static boolean aBoolean729 = false;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
	public static int anInt9980 = -1;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!vj;Ljava/lang/String;I)I")
	public static int method8308(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt10247;
		@Pc(10) byte[] local10 = Static288.method4009(arg1);
		arg0.method8534(local10.length);
		arg0.anInt10247 += Static106.aClass86_1.method1797(0, arg0.aByteArray115, local10, local10.length, arg0.anInt10247);
		return arg0.anInt10247 - local6;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZZI)V")
	public static void method8309(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static514.anInt8569--;
			if (Static514.anInt8569 == 0) {
				Static486.anIntArray562 = null;
			}
		}
		if (arg0) {
			Static301.anInt4923--;
			if (Static301.anInt4923 == 0) {
				Static343.anIntArray359 = null;
			}
		}
	}
}
