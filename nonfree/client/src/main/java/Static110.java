import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gs", name = "bb", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "Lclient!bt;")
	public static Class21 aClass21_71 = new Class21(64);

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_6 = new Class105("", 16);

	@OriginalMember(owner = "client!gs", name = "V", descriptor = "I")
	public static int anInt2477 = 0;

	@OriginalMember(owner = "client!gs", name = "W", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_84 = new Class106("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!gs", name = "X", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_85 = new Class106("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!gs", name = "Y", descriptor = "Lclient!kg;")
	public static Class112 aClass112_8 = null;

	@OriginalMember(owner = "client!gs", name = "Z", descriptor = "I")
	public static final int anInt2478 = 1407;

	@OriginalMember(owner = "client!gs", name = "ab", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)Lclient!ip;")
	public static Class95 method2347(@OriginalArg(0) int arg0) {
		@Pc(10) Class95 local10 = (Class95) Static258.aClass21_42.method854((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static157.aClass30_47.method1161(arg0, 33);
		local10 = new Class95();
		if (local27 != null) {
			local10.method2824(arg0, new Class1_Sub7(local27));
		}
		Static258.aClass21_42.method843(local10, (long) arg0);
		return local10;
	}
}
