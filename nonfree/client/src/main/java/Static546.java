import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!si", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray56;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	public static int anInt9529;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!in;")
	public static final Class169 aClass169_226 = new Class169(67, 6);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
	public static void method8351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg3 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static167.method3347(arg3, arg2, arg4, arg0);
			}
		} else if (local15 == 0) {
			Static409.method6744(arg2, arg4, arg0, arg1);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local10;
			@Pc(56) int local56 = arg0 - (local48 * arg4 >> 12);
			@Pc(76) int local76;
			@Pc(74) int local74;
			if (arg1 < Static457.anInt8209) {
				local74 = local56 + (local48 * Static457.anInt8209 >> 12);
				local76 = Static457.anInt8209;
			} else if (Static407.anInt7583 < arg1) {
				local74 = (local48 * Static407.anInt7583 >> 12) + local56;
				local76 = Static407.anInt7583;
			} else {
				local76 = arg1;
				local74 = arg3;
			}
			@Pc(110) int local110;
			@Pc(119) int local119;
			if (Static457.anInt8209 > arg4) {
				local119 = local56 + (Static457.anInt8209 * local48 >> 12);
				local110 = Static457.anInt8209;
			} else if (arg4 > Static407.anInt7583) {
				local110 = Static407.anInt7583;
				local119 = local56 + (Static407.anInt7583 * local48 >> 12);
			} else {
				local110 = arg4;
				local119 = arg0;
			}
			if (local119 < Static427.anInt7845) {
				local119 = Static427.anInt7845;
				local110 = (Static427.anInt7845 - local56 << 12) / local48;
			} else if (local119 > Static631.anInt10922) {
				local110 = (Static631.anInt10922 - local56 << 12) / local48;
				local119 = Static631.anInt10922;
			}
			if (local74 < Static427.anInt7845) {
				local76 = (Static427.anInt7845 - local56 << 12) / local48;
				local74 = Static427.anInt7845;
			} else if (local74 > Static631.anInt10922) {
				local76 = (Static631.anInt10922 - local56 << 12) / local48;
				local74 = Static631.anInt10922;
			}
			Static414.method6774(local76, local74, arg2, local110, local119);
		}
	}
}
