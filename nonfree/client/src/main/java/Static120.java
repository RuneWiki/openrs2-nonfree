import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!md", name = "J", descriptor = "Lclient!kh;")
	public static Class60 aClass60_886 = Static200.method3116("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!kh;")
	public static Class60 aClass60_887 = Static200.method3116("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILclient!dd;Lclient!dd;IIJ)V")
	public static void method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class47 local8 = new Class47();
		local8.aLong58 = arg8;
		local8.anInt1946 = arg1 * 128 + 64;
		local8.anInt1952 = arg2 * 128 + 64;
		local8.anInt1948 = arg3;
		local8.aClass9_4 = arg4;
		local8.aClass9_5 = arg5;
		local8.anInt1947 = arg6;
		local8.anInt1951 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static100.aClass1_Sub22ArrayArrayArray3[local42][arg1][arg2] == null) {
				Static100.aClass1_Sub22ArrayArrayArray3[local42][arg1][arg2] = new Class1_Sub22(local42, arg1, arg2);
			}
		}
		Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass47_1 = local8;
	}
}
