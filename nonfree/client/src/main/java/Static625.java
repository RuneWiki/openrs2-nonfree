import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!rha;")
	public static final Class309 aClass309_9 = new Class309("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)Lclient!qj;")
	public static Class3_Sub44 method8254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub44 local5 = null;
		if (arg1 == 0) {
			local5 = Static275.method5689(Static486.aClass376_113, Static540.aClass282_4);
		}
		if (arg1 == 1) {
			local5 = Static275.method5689(Static605.aClass376_137, Static540.aClass282_4);
		}
		local5.aClass3_Sub17_Sub2_3.method4886(arg0 + Static347.anInt7851);
		local5.aClass3_Sub17_Sub2_3.method4885(Static417.anInt7047 + arg2);
		local5.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
		Static75.anInt1704 = arg2;
		Static217.anInt4007 = arg0;
		Static301.aBoolean425 = false;
		Static349.method5246();
		return local5;
	}
}
