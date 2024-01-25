import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public static int anInt5369;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	public static int anInt5370;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "Lclient!al;")
	public static Class11 aClass11_125 = new Class11(64);

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "[S")
	public static final short[] aShortArray108 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
	public static int[] anIntArray487 = new int[2];

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "[S")
	public static final short[] aShortArray109 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
	public static void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static215.anIntArray386[local3] = Static215.anIntArray386[local3 - 1];
			Static162.anIntArray299[local3] = Static162.anIntArray299[local3 - 1];
			Static2.aStringArray1[local3] = Static2.aStringArray1[local3 - 1];
			Static107.aStringArray32[local3] = Static107.aStringArray32[local3 - 1];
			Static222.aStringArray57[local3] = Static222.aStringArray57[local3 - 1];
			Static106.aStringArray31[local3] = Static106.aStringArray31[local3 - 1];
			Static85.anIntArray190[local3] = Static85.anIntArray190[local3 - 1];
		}
		Static215.anIntArray386[0] = arg0;
		Static2.aStringArray1[0] = arg2;
		Static162.anIntArray299[0] = arg3;
		Static107.aStringArray32[0] = arg4;
		Static222.aStringArray57[0] = arg6;
		Static85.anIntArray190[0] = arg5;
		Static192.anInt3924 = Static348.anInt5338;
		Static106.aStringArray31[0] = arg1;
		Static104.anInt2317++;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	public static void method4776() {
		Static245.aClass11_82.method213();
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public static void method4777() {
		Static313.aClass11_130.method213();
	}
}
