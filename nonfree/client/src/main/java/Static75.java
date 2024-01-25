import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt1422;

	@OriginalMember(owner = "client!dk", name = "J", descriptor = "Lclient!en;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_23 = new Class134("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "Z")
	public static final boolean aBoolean114 = false;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method1101() {
		Static420.aClass163_11.method5517(Static9.aFloat1, Static422.aFloat102, Static280.aFloat54);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!sv;II)Ljava/lang/String;")
	public static String method1116(@OriginalArg(0) Class2_Sub13 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3588();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt4347 += Static431.aClass131_1.method2693(arg0.aByteArray52, local7, 0, arg0.anInt4347, local19);
			return Static230.method3015(local7, 0, local19);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
	public static void method1120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub5_Sub11 local16 = Static316.method4316(11, arg2);
		local16.method3098();
		local16.anInt3916 = arg1;
		local16.anInt3911 = arg0;
	}
}
