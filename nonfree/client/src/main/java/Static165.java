import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	public static int anInt3234;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
	public static int anInt3237;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_2 = new Class146(9, 2);

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	public static int anInt3235 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method2918(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub14 local12 = Static139.method2308(Static319.aClass130_89, Static24.aClass233_1);
		local12.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0) + 1);
		local12.aClass3_Sub3_Sub2_2.method4241(arg0);
		local12.aClass3_Sub3_Sub2_2.method4220(arg1);
		Static562.method8096(local12);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[B)V")
	public static void method2920(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class3_Sub3 local15 = new Class3_Sub3(arg0);
		while (true) {
			@Pc(19) int local19 = local15.method4225();
			if (local19 == 0) {
				return;
			}
			if (local19 == 2) {
				Static130.anInt2693 = local15.method4221();
			}
		}
	}
}
