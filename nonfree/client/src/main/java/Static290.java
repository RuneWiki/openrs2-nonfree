import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!ro;")
	public static Class81 aClass81_6;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray22 = new byte[250][];

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public static int anInt5649 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!br;II)V")
	public static void method4876(@OriginalArg(1) Class21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static123.anInt2949 = arg2;
		Static251.aClass21_14 = arg0;
		Static40.anInt1097 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Z")
	public static boolean method4877() {
		return Static261.anInt5280 == 0 ? Static229.aClass4_Sub1_Sub4_3.method3806() : true;
	}
}
