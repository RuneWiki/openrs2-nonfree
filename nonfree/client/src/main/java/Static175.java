import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!io", name = "O", descriptor = "I")
	public static int anInt3399 = 100;

	@OriginalMember(owner = "client!io", name = "T", descriptor = "[S")
	public static final short[] aShortArray44 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BIIIIZLclient!pc;)V")
	public static void method2758(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class188 arg3) {
		Static434.anInt7559 = arg2;
		Static229.anInt4373 = arg0;
		Static415.anInt7247 = 1;
		Static358.anInt6316 = 0;
		Static206.aBoolean322 = false;
		Static391.aClass188_113 = arg3;
		Static158.anInt3122 = Static151.aClass2_Sub18_Sub2_1.method2902() / arg1;
		if (Static158.anInt3122 < 1) {
			Static158.anInt3122 = 1;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	public static void method2761(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub2_Sub2 local15 = Static15.method236(arg0, 16);
		local15.method435();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method2762(@OriginalArg(1) String arg0) {
		return Static223.method3427(arg0, 10);
	}
}
