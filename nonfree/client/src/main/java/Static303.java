import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!qq;")
	public static Class269 aClass269_8;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_2 = new Class162("stellardawn", 1);

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!li;")
	public static final Class199 aClass199_4 = new Class199(16);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method4902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class93 local8 = Static100.method2145(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray5 != null) {
			@Pc(18) Class6_Sub38 local18 = new Class6_Sub38();
			local18.anInt7663 = arg1;
			local18.aString98 = arg2;
			local18.anObjectArray36 = local8.anObjectArray5;
			local18.aClass93_14 = local8;
			Static89.method1979(local18);
		}
		if (Static325.anInt6149 != 10 || !Static69.method1454(local8).method7360(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static298.method4854(Static33.aClass181_9);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 2) {
			Static298.method4854(Static217.aClass181_44);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 3) {
			Static298.method4854(Static223.aClass181_55);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 4) {
			Static298.method4854(Static201.aClass181_50);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 5) {
			Static298.method4854(Static554.aClass181_114);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 6) {
			Static298.method4854(Static194.aClass181_48);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 7) {
			Static298.method4854(Static527.aClass181_107);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 8) {
			Static298.method4854(Static339.aClass181_72);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 9) {
			Static298.method4854(Static452.aClass181_94);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
		if (arg1 == 10) {
			Static298.method4854(Static83.aClass181_20);
			Static335.method5313(arg3, arg0, local8.anInt2822);
		}
	}
}
