import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!kea;")
	public static Class161 aClass161_108;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!kea;")
	public static Class161 aClass161_109;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_120 = new Class158(64, 6);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!vba;Lclient!vba;I)V")
	public static void method7172(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) Class3_Sub10 arg1) {
		if (arg1.aClass3_Sub10_60 != null) {
			arg1.method7643();
		}
		arg1.aClass3_Sub10_59 = arg0.aClass3_Sub10_59;
		arg1.aClass3_Sub10_60 = arg0;
		arg1.aClass3_Sub10_60.aClass3_Sub10_59 = arg1;
		arg1.aClass3_Sub10_59.aClass3_Sub10_60 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
	public static void method7173(@OriginalArg(1) int arg0) {
		Static140.anInt2892 = arg0;
		@Pc(11) Class125 local11 = Static260.aClass125_36;
		synchronized (Static260.aClass125_36) {
			Static260.aClass125_36.method3521();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method7175() {
		if (Static512.anInt8932 == 6) {
			Static180.method3441(false);
		} else {
			Static509.aClass41_2 = Static467.aClass41_1;
			Static467.aClass41_1 = null;
			Static333.method5283(12);
		}
	}
}
