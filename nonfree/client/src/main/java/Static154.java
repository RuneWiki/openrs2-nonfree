import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
	public static int anInt3151;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
	public static int anInt3148 = -2;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
	public static int anInt3152 = 0;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
	public static final int anInt3153 = -1;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public static void method2734() {
		Static453.aClass103Array19 = null;
		Static585.aClass103Array24 = null;
		Static355.aClass103_47 = null;
		Static519.aClass103_44 = null;
		Static319.aClass103Array13 = null;
		Static497.aClass103Array9 = null;
		Static138.aClass103Array2 = null;
		Static457.aClass103Array20 = null;
		Static232.aClass63_6 = null;
		Static142.aClass103Array23 = null;
		Static431.aClass103Array17 = null;
		Static266.aClass103Array8 = null;
		Static427.aClass103Array16 = null;
		Static374.aClass63_9 = null;
		Static205.aClass103Array22 = null;
		Static305.aClass103Array11 = null;
		Static484.aClass103Array21 = null;
		Static227.aClass63_5 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B[I[I)V")
	public static void method2735(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static640.anIntArray663 = null;
			Static331.anIntArray342 = null;
			Static542.aByteArrayArrayArray11 = null;
			return;
		}
		Static331.anIntArray342 = arg0;
		Static640.anIntArray663 = new int[arg0.length];
		Static542.aByteArrayArrayArray11 = new byte[arg0.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static331.anIntArray342.length; local33++) {
			Static542.aByteArrayArrayArray11[local33] = new byte[arg1[local33]][];
		}
	}
}
