import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "C", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "I")
	public static int anInt5461 = 0;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Lclient!va;")
	public static Class4_Sub42 aClass4_Sub42_3 = null;

	@OriginalMember(owner = "client!af", name = "L", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_71 = new Class215(66, 8);

	@OriginalMember(owner = "client!af", name = "N", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_254 = new Class22(89, 8);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)I")
	public static int method4190(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V")
	public static void method4194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class155 local14 = Static1.aClass155ArrayArray1[arg0][arg1];
		if (local14 != null) {
			Static108.anInt2361 = local14.anInt4770;
			Static328.anInt5676 = local14.anInt4778;
			Static101.anInt2036 = local14.anInt4775;
		}
		Static12.method127();
	}
}
