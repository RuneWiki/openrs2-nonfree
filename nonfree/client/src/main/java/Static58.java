import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	public static int anInt1276;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_16 = new Class216(28, -1);

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "Lclient!hj;")
	public static Class151 aClass151_23 = null;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "[Lclient!mfa;")
	public static final Class228[] aClass228Array1 = new Class228[2048];

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IB)V")
	public static void method1306() {
		Static466.aBoolean583 = false;
		Static670.anInt6846 = 2;
		Static554.aClass4_Sub3_Sub4_5 = null;
		Static586.aClass34_116 = null;
		Static414.anInt5938 = 0;
		Static91.anInt1809 = 1;
		Static46.anInt907 = -1;
		Static566.anInt8739 = -1;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIII)V")
	public static void method1307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg3, 10);
		local9.method3955();
		local9.anInt4427 = arg2;
		local9.anInt4425 = arg0;
		local9.anInt4429 = arg1;
	}
}
