import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt3893;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	public static int anInt3903;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_62 = new Class96("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_206 = new Class12(13, 0);

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method3271() {
		Static254.aClass10_1.method224();
		Static38.aClass32_1.method3516();
		if (Static386.aClass224_1 != null) {
			Static386.aClass224_1.method5334(Static159.aCanvas3);
		}
		Static451.aClient1.method725();
		Static159.aCanvas3.setBackground(Color.black);
		Static360.anInt6588 = -1;
		Static254.aClass10_1 = Static26.method372(Static159.aCanvas3);
		Static38.aClass32_1 = Static397.method5469(Static159.aCanvas3);
		if (Static386.aClass224_1 != null) {
			Static386.aClass224_1.method5336(Static159.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!vp;)V")
	public static void method3272(@OriginalArg(1) Class254 arg0) {
		Static201.aClass1_Sub14_Sub2_2.method4562(arg0.method5804());
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!hh;II)Lclient!ds;")
	public static Class62 method3273(@OriginalArg(1) Class109 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method2349(arg1, 0);
		return local9 == null ? null : new Class62(local9);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!tn;)Ljava/lang/String;")
	public static String method3275(@OriginalArg(1) Class229 arg0) {
		if (Static51.method751(arg0).method958() == 0) {
			return null;
		} else if (arg0.aString81 == null || arg0.aString81.trim().length() == 0) {
			return Static424.aBoolean633 ? "Hidden-use" : null;
		} else {
			return arg0.aString81;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
	public static void method3276() {
		Static85.aClass51_6.method921();
	}
}
