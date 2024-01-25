import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!vc;")
	public static Class200_Sub1 aClass200_Sub1_2;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_161 = new Class202("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!ud;")
	public static final Class281 aClass281_4 = new Class281();

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[Lclient!vq;")
	public static final Class2_Sub13_Sub18[] aClass2_Sub13_Sub18Array2 = new Class2_Sub13_Sub18[14];

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method4605() {
		@Pc(1) Class231 local1 = Static291.aClass231_45;
		synchronized (Static291.aClass231_45) {
			Static291.aClass231_45.method6231(5);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4606(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local21 + 2 < local19) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(74) int local74;
				if (local27 >= '0' && local27 <= '9') {
					local74 = local27 - '0';
				} else if (local27 >= 'a' && local27 <= 'f') {
					local74 = local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local74 = local27 + 10 - 65;
				}
				local27 = arg0.charAt(local21 + 2);
				local74 *= 16;
				if (local27 >= '0' && local27 <= '9') {
					local74 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local74 += local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local74 += local27 + '\n' - 65;
				}
				local21 += 2;
				if (local74 != 0 && Static83.method1625((byte) local74)) {
					local9.append(Static431.method6618((byte) local74));
				}
			} else if (local27 == '+') {
				local9.append(' ');
			} else {
				local9.append(local27);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	public static void method4608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg1, 12);
		local8.method6968();
		local8.anInt8318 = arg0;
	}
}
