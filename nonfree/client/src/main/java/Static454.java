import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "Lclient!om;")
	public static Class246 aClass246_214;

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "Lclient!f;")
	public static Class46 aClass46_28;

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_154 = new Class298(14, 16);

	@OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
	public static int anInt7435 = 0;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BII)V")
	public static void method6306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub3_Sub7 local12 = Static363.method5457(arg1, 13);
		local12.method839();
		local12.anInt1088 = arg0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method6307(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				@Pc(67) char local67 = Static151.aCharArray5[(int) (local53 - arg0 * 37L)];
				if (local67 == '_') {
					@Pc(77) int local77 = local49.length() - 1;
					local49.setCharAt(local77, Character.toUpperCase(local49.charAt(local77)));
					local67 = ' ';
				}
				local49.append(local67);
			}
			local49.reverse();
			local49.setCharAt(0, Character.toUpperCase(local49.charAt(0)));
			return local49.toString();
		}
	}
}
