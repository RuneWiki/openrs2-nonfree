import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_115 = new Class145(5, 8);

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean467 = true;

	@OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
	public static int anInt6641 = 0;

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_145 = new Class200(16, 8);

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B[Lclient!iea;)V")
	public static void method5686(@OriginalArg(1) Class31[] arg0) {
		Static482.anInt7782 = arg0.length;
		Static629.anIntArray726 = new int[Static482.anInt7782 + 10];
		Static402.aClass31Array11 = new Class31[Static482.anInt7782 + 10];
		Static650.method2268(arg0, 0, Static402.aClass31Array11, 0, Static482.anInt7782);
		for (@Pc(24) int local24 = 0; local24 < Static482.anInt7782; local24++) {
			Static629.anIntArray726[local24] = Static402.aClass31Array11[local24].method8807();
		}
		for (@Pc(38) int local38 = Static482.anInt7782; local38 < Static402.aClass31Array11.length; local38++) {
			Static629.anIntArray726[local38] = 12;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!rba;III)V")
	public static void method5687(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class84 local12;
		if (arg2 < Static595.anInt9881) {
			local12 = Static348.aClass84ArrayArrayArray5[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass16_Sub1_Sub3_1 != null && local12.aClass16_Sub1_Sub3_1.method6976()) {
				arg0.method6984(0, local12.aClass16_Sub1_Sub3_1, Static380.aClass13_86, true, 0, Static519.anInt8387);
			}
		}
		if (arg3 < Static595.anInt9881) {
			local12 = Static348.aClass84ArrayArrayArray5[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass16_Sub1_Sub3_1 != null && local12.aClass16_Sub1_Sub3_1.method6976()) {
				arg0.method6984(0, local12.aClass16_Sub1_Sub3_1, Static380.aClass13_86, true, Static519.anInt8387, 0);
			}
		}
		if (arg2 < Static595.anInt9881 && arg3 < Static389.anInt6693) {
			local12 = Static348.aClass84ArrayArrayArray5[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass16_Sub1_Sub3_1 != null && local12.aClass16_Sub1_Sub3_1.method6976()) {
				arg0.method6984(0, local12.aClass16_Sub1_Sub3_1, Static380.aClass13_86, true, Static519.anInt8387, Static519.anInt8387);
			}
		}
		if (arg2 < Static595.anInt9881 && arg3 > 0) {
			local12 = Static348.aClass84ArrayArrayArray5[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass16_Sub1_Sub3_1 != null && local12.aClass16_Sub1_Sub3_1.method6976()) {
				arg0.method6984(0, local12.aClass16_Sub1_Sub3_1, Static380.aClass13_86, true, -Static519.anInt8387, Static519.anInt8387);
			}
		}
	}
}
