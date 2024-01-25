import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ku", name = "B", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_64 = new Class179(50, 3);

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
	public static int anInt5352 = 0;

	@OriginalMember(owner = "client!ku", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_119 = new Class7("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_154 = new Class107(80, -1);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method4406(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local10);
			if (local24 >= 'A' && local24 <= 'Z') {
				local5 += local24 - 64;
			} else if (local24 >= 'a' && local24 <= 'z') {
				local5 += local24 + 1 - 97;
			} else if (local24 >= '0' && local24 <= '9') {
				local5 += local24 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public static void method4407() {
		if (Static415.aClass39_11.method4537()) {
			Static415.aClass39_11.method4514(Static155.aCanvas4);
			Static16.method461();
			Static415.aClass39_11.method4519(Static155.aCanvas4);
			Static415.aClass39_11.method4496(Static155.aCanvas4);
		} else {
			Static178.method2844(Static143.anInt2766);
		}
		Static319.method3515();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BZZ)V")
	public static void method4408(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static34.anInt716++;
			Static369.method5059();
		}
		if (arg1) {
			Static234.anInt4226++;
			Static210.method3334();
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(III)I")
	public static int method4409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static399.anIntArray652[arg1 & 0x3] : 256;
	}
}
