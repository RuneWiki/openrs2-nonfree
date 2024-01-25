import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "[B")
	public static final byte[] aByteArray2 = new byte[520];

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "Lclient!ada;")
	public static final Class4_Sub3 aClass4_Sub3_1 = new Class4_Sub3(0, 0);

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)V")
	public static void method259(@OriginalArg(0) int arg0) {
		Static77.anInt1283 = 3;
		Static425.anInt7984 = 100;
		Static257.anInt4733 = -1;
		Static387.anInt7402 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)I")
	public static int method260(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)[I")
	public static int[] method261() {
		return new int[] { Static329.anInt6334, Static273.anInt7288, Static189.anInt3711 };
	}
}
