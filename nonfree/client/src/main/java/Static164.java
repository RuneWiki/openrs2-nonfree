import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt3419;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public static int anInt3423;

	@OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString134 = "cyan:";

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/String;JBIILjava/lang/String;)V")
	public static void method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		if (!Static179.aBoolean310 && Static277.anInt6207 < 500) {
			@Pc(19) int local19 = arg0 == -1 ? Static177.anInt3670 : arg0;
			@Pc(30) Class1_Sub41 local30 = new Class1_Sub41(arg6, arg2, local19, arg4, arg3, arg5, arg1);
			Static175.aClass195_36.method5018(local30);
			Static277.anInt6207++;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method3164() {
		for (@Pc(15) Class1_Sub41 local15 = (Class1_Sub41) Static175.aClass195_36.method5029(); local15 != null; local15 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			if (Static217.method3975(local15.anInt6339)) {
				Static44.method1014(local15);
			}
		}
		if (Static277.anInt6207 == 1) {
			Static179.aBoolean310 = false;
			Static50.method1133(Static115.anInt2299, Static139.anInt2759, Static13.anInt269, Static288.anInt6178);
			return;
		}
		Static50.method1133(Static115.anInt2299, Static139.anInt2759, Static13.anInt269, Static288.anInt6178);
		@Pc(55) int local55 = Static180.aClass38_5.method1316(Static205.aString166);
		for (@Pc(60) Class1_Sub41 local60 = (Class1_Sub41) Static175.aClass195_36.method5029(); local60 != null; local60 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			@Pc(66) int local66 = Static141.method931(local60);
			if (local55 < local66) {
				local55 = local66;
			}
		}
		Static139.anInt2759 = local55 + 8;
		Static115.anInt2299 = (Static273.aBoolean458 ? 26 : 22) + Static277.anInt6207 * 16;
	}
}
