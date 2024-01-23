import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!mg;")
	public static Class108 aClass108_14 = new Class108();

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt5495 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILclient!hd;JZ)V")
	public static void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class119 local6 = new Class119();
		local6.aClass2_7 = arg4;
		local6.anInt4258 = arg1 * 128 + 64;
		local6.anInt4261 = arg2 * 128 + 64;
		local6.anInt4260 = arg3;
		local6.aLong154 = arg5;
		local6.aBoolean263 = arg6;
		if (Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub2(arg0, arg1, arg2);
		}
		Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass119_1 = local6;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method4161(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static247.method3812(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method4162() {
		if (Static170.anIntArray341 != null && Static170.anIntArray340 != null) {
			return;
		}
		Static170.anIntArray341 = new int[256];
		Static170.anIntArray340 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(36) double local36 = (double) local24 / 255.0D * 6.283185307179586D;
			Static170.anIntArray341[local24] = (int) (Math.sin(local36) * 4096.0D);
			Static170.anIntArray340[local24] = (int) (Math.cos(local36) * 4096.0D);
		}
	}
}
