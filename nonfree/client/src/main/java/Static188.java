import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_48 = new Class84("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	public static int anInt3449 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I")
	public static int method2886(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIII)V")
	public static void method2889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(arg1, 11);
		local13.method202();
		local13.anInt218 = arg0;
		local13.anInt214 = arg2;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method2891() {
		Static82.anInt1627 = 0;
		Static8.aClass266_2.method6004();
		Static8.aClass266_2.method5998(Static228.aClass1_Sub8_2);
		Static82.anInt1627++;
	}
}
