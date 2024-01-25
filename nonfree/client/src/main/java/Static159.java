import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Lclient!lm;")
	public static Class134 aClass134_143;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!qp;")
	public static Class171 aClass171_4;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "Lclient!fh;")
	public static Interface2 anInterface2_7;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString248 = "";

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public static int anInt6380 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZI)V")
	public static void method5484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class22 local14 = Static157.method2796(arg0);
		@Pc(17) int local17 = local14.anInt444;
		@Pc(20) int local20 = local14.anInt435;
		@Pc(23) int local23 = local14.anInt440;
		@Pc(30) int local30 = Class1_Sub5_Sub14.anIntArray329[local23 - local20];
		if (arg1 < 0 || local30 < arg1) {
			arg1 = 0;
		}
		local30 <<= local20;
		Static110.method1763(local30 & arg1 << local20 | ~local30 & Static326.anIntArray552[local17], local17);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZLjava/lang/String;Lclient!wl;)V")
	public static void method5486(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(21) int local21 = Static20.aClass34_1.method786(250, arg1, null);
		@Pc(30) int local30 = Static20.aClass34_1.method791(250, null, arg1) * 13;
		Static217.aClass105_5.method4249(6, 6, local21 + 4 + 4, local30 + 4 - -4, -16777216, 0);
		Static217.aClass105_5.method4275(6, 6, local21 + 4 + 4, local30 + 4 + 4, -1, 0);
		arg2.method3741(0, 10, arg1, null, -1, 0, -1, null, 10, local21, null, 0, local30, 1, 1);
		Static177.method3159(6, local30 + 4 + 4, 6, local21 + 4 + 4);
		if (arg0) {
			Static217.aClass105_5.method4245();
		}
	}
}
