import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!ih;")
	public static Class116 aClass116_32;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_404 = new Class123(6, 18);

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public static final int anInt7707 = 52;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public static int anInt7711 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
	public static int method6308(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg1.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local24 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local44 >= '0' && local44 <= '9') {
				local76 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local76 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local76 = local44 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local76 >= arg0) {
				throw new NumberFormatException();
			}
			if (local24) {
				local76 = -local76;
			}
			@Pc(123) int local123 = arg0 * local33 + local76;
			if (local33 != local123 / arg0) {
				throw new NumberFormatException();
			}
			local31 = true;
			local33 = local123;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local33;
	}
}
