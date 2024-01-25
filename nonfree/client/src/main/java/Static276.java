import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_108 = new Class40(81, 2);

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_109 = new Class40(88, 3);

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_110 = new Class40(18, -1);

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_8 = new Class188(7, 0, 1, 1);

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_59 = new Class160(42, 3);

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
	public static int anInt4600 = 16777215;

	@OriginalMember(owner = "client!lb", name = "ab", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_7 = new Class216(7, 14);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)C")
	public static char method3963(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(48) char local48 = Static486.aCharArray9[local12 - 128];
			if (local48 == '\u0000') {
				local48 = '?';
			}
			local12 = local48;
		}
		return (char) local12;
	}
}
