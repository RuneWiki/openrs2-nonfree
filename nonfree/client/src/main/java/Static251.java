import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!ph;")
	public static Class187 aClass187_110;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!os;")
	public static final Class182 aClass182_216 = new Class182("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt6026 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZI)V")
	public static void method4760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(14, arg0);
		local8.method5345();
		local8.anInt6806 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!lt;Ljava/lang/String;B)Lclient!wp;")
	public static Class270 method4761(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 0) {
			return arg1.method3502(arg2);
		}
		@Pc(41) Class270 local41;
		if (arg0 == 1) {
			try {
				Static464.method2257(new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, arg1.anApplet1, "openjs");
				local41 = new Class270();
				local41.anInt7548 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class270();
				local41.anInt7548 = 2;
				return local41;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class270();
				local41.anInt7548 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class270();
				local41.anInt7548 = 2;
				return local41;
			}
		} else if (arg0 == 3) {
			try {
				Static464.method2259(arg1.anApplet1, "loggedout");
			} catch (@Pc(111) Throwable local111) {
			}
			@Pc(127) Class270 local127;
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local127 = new Class270();
				local127.anInt7548 = 1;
				return local127;
			} catch (@Pc(133) Exception local133) {
				local127 = new Class270();
				local127.anInt7548 = 2;
				return local127;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
