import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
	public static int anInt6694;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!saa;")
	public static final Class317 aClass317_8 = new Class317();

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "[Lclient!hp;")
	public static final Class152[] aClass152Array1 = new Class152[37];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ofa;BI)V")
	public static void method5612(@OriginalArg(0) int arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray10 != null) {
			@Pc(17) Class3_Sub53 local17 = new Class3_Sub53();
			local17.aClass265_16 = arg1;
			local17.anObjectArray35 = arg1.anObjectArray10;
			Static250.method3767(local17);
		}
		Static530.anInt8325 = arg1.anInt7028;
		Static47.aBoolean59 = true;
		Static341.anInt5871 = arg0;
		Static454.anInt7316 = arg1.anInt7005;
		Static376.anInt5867 = arg1.anInt7032;
		Static344.anInt5895 = arg2;
		Static284.anInt4811 = arg1.anInt7004;
		Static213.anInt3686 = arg1.anInt7006;
		Static218.method3194(arg1);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
	public static int method5614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
