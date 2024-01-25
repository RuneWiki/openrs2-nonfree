import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	public static int anInt6493;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	public static int anInt6498;

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
	public static int anInt6500;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_87 = new Class84("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "[I")
	public static final int[] anIntArray539 = new int[25];

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	public static int anInt6499 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method5191(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static271.aCharArray4[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}
