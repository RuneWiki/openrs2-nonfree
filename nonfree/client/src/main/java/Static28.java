import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	public static int anInt9243;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "Lclient!ot;")
	public static Class5_Sub16_Sub4 aClass5_Sub16_Sub4_6;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "Lclient!la;")
	public static Class208 aClass208_122;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_53 = new Class391(10);

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	public static int anInt9247 = 1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ec;II)V")
	public static void method7935(@OriginalArg(0) Class8_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray412 == null) {
			return;
		}
		@Pc(9) int local9 = arg0.anIntArray412[arg1 + 1];
		if (local9 == arg0.anInt7023) {
			return;
		}
		arg0.anInt7046 = 0;
		arg0.anInt7028 = 0;
		arg0.anInt6979 = 1;
		arg0.anInt7006 = 0;
		arg0.anInt7049 = arg0.anInt7050;
		arg0.anInt7023 = local9;
		if (arg0.anInt7023 != -1) {
			Static268.method4004(Static158.aClass317_1.method7882(arg0.anInt7023, 100), arg0, arg0.anInt7028);
		}
	}
}
