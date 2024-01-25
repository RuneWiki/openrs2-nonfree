import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public static void method139() {
		@Pc(10) Class3_Sub49 local10;
		for (local10 = (Class3_Sub49) Static462.aClass193_48.method4457(); local10 != null; local10 = (Class3_Sub49) Static462.aClass193_48.method4459()) {
			if (local10.aBoolean665) {
				local10.method8770();
			} else {
				local10.aBoolean664 = true;
				if (local10.anInt8929 >= 0 && local10.anInt8924 >= 0 && local10.anInt8929 < Static251.anInt4680 && Static406.anInt6924 > local10.anInt8924) {
					Static573.method7743(local10);
				}
			}
		}
		for (local10 = (Class3_Sub49) Static647.aClass193_70.method4457(); local10 != null; local10 = (Class3_Sub49) Static647.aClass193_70.method4459()) {
			if (local10.aBoolean665) {
				local10.method8770();
			} else {
				local10.aBoolean664 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	public static void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static301.anIntArrayArray59 != null) {
			Static301.anIntArrayArray59[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static273.aShortArrayArray10 != null) {
			Static273.aShortArrayArray10[arg0][arg1] = (short) arg3;
		}
		if (Static614.aByteArrayArray23 != null) {
			Static614.aByteArrayArray23[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method144(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static121.anInt2381; local11++) {
			if (arg0.equalsIgnoreCase(Static260.aStringArray36[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34);
	}
}
