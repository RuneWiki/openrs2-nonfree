import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	public static int anInt9055;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
	public static int anInt9058;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "Lclient!id;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_272 = new Class235(52, 3);

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	public static int anInt9060 = -1;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
	public static int anInt9061 = 0;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([IB[I)V")
	public static void method7391(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static342.anIntArray467 = null;
			Static556.anIntArray707 = null;
			Static518.aByteArrayArrayArray18 = null;
			return;
		}
		Static342.anIntArray467 = arg0;
		Static556.anIntArray707 = new int[arg0.length];
		Static518.aByteArrayArrayArray18 = new byte[arg0.length][][];
		for (@Pc(35) int local35 = 0; local35 < Static342.anIntArray467.length; local35++) {
			Static518.aByteArrayArrayArray18[local35] = new byte[arg1[local35]][];
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZZ)V")
	public static void method7393(@OriginalArg(0) boolean arg0) {
		Static510.method7089();
		if (!Static443.method6122(Static216.anInt4135)) {
			return;
		}
		Static516.anInt8761++;
		if (Static516.anInt8761 < 50 && !arg0) {
			return;
		}
		Static516.anInt8761 = 0;
		if (!Static90.aBoolean154 && Static568.aClass149_2 != null) {
			@Pc(39) Class1_Sub11 local39 = Static276.method3885(Static28.aClass70_6, Static481.aClass276_2);
			Static48.method743(local39);
			try {
				Static173.method2438();
			} catch (@Pc(46) IOException local46) {
				Static90.aBoolean154 = true;
			}
		}
		Static510.method7089();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B[FI)[F")
	public static float[] method7394(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static598.method1176(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)V")
	public static void method7395(@OriginalArg(1) int arg0) {
		Static426.anInt7374 = arg0;
		Static42.aClass222_3.method4428();
	}
}
