import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_126 = new Class220(7, 0, 1, 1);

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
	public static int anInt5817 = 0;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	public static int anInt5822 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method4613(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class76 local8 = Static371.method4859(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray13 != null) {
			@Pc(18) Class5_Sub33 local18 = new Class5_Sub33();
			local18.aString61 = arg0;
			local18.anInt5632 = arg3;
			local18.aClass76_12 = local8;
			local18.anObjectArray35 = local8.anObjectArray13;
			Static181.method2470(local18);
		}
		if (Static376.anInt6324 != 9 || !Static55.method885(local8).method5380(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static288.method3576(Static249.aClass194_68);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 2) {
			Static288.method3576(Static145.aClass194_38);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 3) {
			Static288.method3576(Static444.aClass194_120);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 4) {
			Static288.method3576(Static257.aClass194_71);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 5) {
			Static288.method3576(Static139.aClass194_33);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 6) {
			Static288.method3576(Static63.aClass194_16);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 7) {
			Static288.method3576(Static263.aClass194_74);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 8) {
			Static288.method3576(Static401.aClass194_30);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 9) {
			Static288.method3576(Static136.aClass194_122);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
		if (arg3 == 10) {
			Static288.method3576(Static251.aClass194_70);
			Static78.method3683(arg1, local8.anInt2057, arg2);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZB)V")
	public static void method4615(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static404.anInt6788--;
			if (Static404.anInt6788 == 0) {
				Static175.anIntArray132 = null;
			}
		}
		if (arg1) {
			Static158.anInt2749--;
			if (Static158.anInt2749 == 0) {
				Static219.anIntArray223 = null;
			}
		}
	}
}
