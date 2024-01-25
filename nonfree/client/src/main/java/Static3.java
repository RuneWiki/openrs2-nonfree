import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!ep;")
	public static final Class5_Sub18 aClass5_Sub18_1 = new Class5_Sub18(0, -1);

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_1 = new Class306(4);

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([BZI)V")
	public static void method29(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static76.aClass5_Sub36_1 == null) {
			Static76.aClass5_Sub36_1 = new Class5_Sub36(20000);
		}
		Static76.aClass5_Sub36_1.method7313(0, arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static293.method6187(Static76.aClass5_Sub36_1.aByteArray89);
		Static592.aClass51_Sub1Array2 = new Class51_Sub1[Static41.anInt698];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static13.anInt166; local35 <= Static470.anInt7634; local35++) {
			@Pc(43) Class51_Sub1 local43 = Static8.method137(local35);
			if (local43 != null) {
				Static592.aClass51_Sub1Array2[local33++] = local43;
			}
		}
		Static426.aBoolean475 = false;
		Static18.aLong10 = Static480.method6763();
		Static76.aClass5_Sub36_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V")
	public static void method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class283 local9 = Static611.aClass283ArrayArray1[arg1][arg0];
		Static528.method7232(local9 == null ? Static39.aClass283_1 : local9, arg2);
	}
}
