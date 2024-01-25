import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!dl;")
	public static final Class87 aClass87_3 = new Class87(1);

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_115 = new Class359(110, 2);

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_49 = new Class305(73, 7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method5090() {
		if (!Static535.aBoolean752) {
			Static235.aFloat91 += (24.0F - Static235.aFloat91) / 2.0F;
			Static535.aBoolean752 = true;
			Static260.aBoolean411 = true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	public static int method5091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
