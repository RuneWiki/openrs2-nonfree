import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!io", name = "u", descriptor = "I")
	public static int anInt4082;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "I")
	public static int anInt4085;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_5 = new Class307(0, 2, 2, 1);

	@OriginalMember(owner = "client!io", name = "x", descriptor = "[Lclient!va;")
	public static final Class5_Sub2_Sub20[] aClass5_Sub2_Sub20Array2 = new Class5_Sub2_Sub20[14];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lclient!mja;")
	public static Class234 method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class234 local7 = new Class234();
		local7.anInt6489 = arg1 + 1 + 5;
		local7.anInt6490 = -1;
		local7.anInt6501 = arg0 + 5 + 1;
		local7.anInt6497 = -1;
		local7.anIntArrayArray50 = new int[local7.anInt6501][local7.anInt6489];
		local7.method5453();
		return local7;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public static void method3588() {
		Static96.aClass143_3.xa(((float) Static655.aClass5_Sub36_29.aClass2_Sub7_1.method3489() * 0.1F + 0.7F) * Static560.aFloat170);
		Static96.aClass143_3.ZA(Static668.anInt10415, Static522.aFloat163, Static248.aFloat58, (float) (Static505.anInt8570 << 2), (float) (Static113.anInt2004 << 2), (float) (Static55.anInt889 << 2));
		Static96.aClass143_3.method6249(Static189.aClass11_2);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B[BI)I")
	public static int method3589(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static323.method5027(arg1, arg0, 0);
	}
}
