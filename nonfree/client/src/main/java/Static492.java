import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static492 {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
	public static int anInt8283;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array23;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public static int anInt8284;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_49 = new Class326(4);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLclient!lfa;Lclient!ga;Lclient!ga;Lclient!ga;)Z")
	public static boolean method6899(@OriginalArg(1) Class1_Sub8_Sub3 arg0, @OriginalArg(2) Class111 arg1, @OriginalArg(3) Class111 arg2, @OriginalArg(4) Class111 arg3) {
		Static213.aClass111_48 = arg2;
		Static25.aClass111_4 = arg1;
		Static69.aClass111_15 = arg3;
		Static504.aClass1_Sub8_Sub3_33 = arg0;
		return true;
	}
}
