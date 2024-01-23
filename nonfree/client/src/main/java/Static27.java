import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
	public static int anInt576;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
	public static int[] anIntArray40 = new int[100];

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
	public static int anInt579 = 0;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[8];

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt580 = 0;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method518(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			anIntArray40[local3] = anIntArray40[local3 - 1];
			Static251.aStringArray29[local3] = Static251.aStringArray29[local3 - 1];
			Static274.aStringArray32[local3] = Static274.aStringArray32[local3 - 1];
			Static16.aStringArray1[local3] = Static16.aStringArray1[local3 - 1];
			Static81.anIntArray137[local3] = Static81.anIntArray137[local3 - 1];
		}
		Static251.aStringArray29[0] = arg4;
		anIntArray40[0] = arg2;
		Static68.anInt1502++;
		Static231.anInt4771 = Static13.anInt334;
		Static274.aStringArray32[0] = arg0;
		Static16.aStringArray1[0] = arg3;
		Static81.anIntArray137[0] = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg1, 5);
		local8.method2718();
		local8.anInt3327 = arg0;
	}
}
