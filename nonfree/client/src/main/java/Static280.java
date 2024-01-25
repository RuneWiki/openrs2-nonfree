import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "Lclient!mt;")
	public static Class4_Sub7_Sub3 aClass4_Sub7_Sub3_2;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "Lclient!mt;")
	public static Class4_Sub7_Sub3 aClass4_Sub7_Sub3_3;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
	public static int anInt5745 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)V")
	public static void method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg1, 1);
		local8.method7133();
		local8.anInt8736 = arg0;
	}
}
