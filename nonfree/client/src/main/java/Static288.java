import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!en;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)I")
	public static int method4404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public static void method4405(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static6.aClass4_Sub19ArrayArrayArray1 = Static299.aClass4_Sub19ArrayArrayArray3;
			Static243.anIntArrayArrayArray13 = Static36.anIntArrayArrayArray2;
			Static189.aClass4_Sub12ArrayArray2 = Static291.aClass4_Sub12ArrayArray3;
		} else {
			Static6.aClass4_Sub19ArrayArrayArray1 = Static133.aClass4_Sub19ArrayArrayArray2;
			Static243.anIntArrayArrayArray13 = Static259.anIntArrayArrayArray14;
			Static189.aClass4_Sub12ArrayArray2 = Static105.aClass4_Sub12ArrayArray1;
		}
		Static224.anInt4310 = Static6.aClass4_Sub19ArrayArrayArray1.length;
	}
}
