import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!tj;")
	public static final Class320 aClass320_2 = new Class320();

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Lclient!tj;")
	public static final Class320 aClass320_5 = new Class320();

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!tj;")
	public static final Class320 aClass320_3 = new Class320();

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!tj;")
	public static final Class320 aClass320_4 = new Class320();

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Lclient!kp;")
	public static Class196 aClass196_11 = null;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!rca;")
	public static final Class280 aClass280_4 = new Class280();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z")
	public static boolean method7100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lclient!vb;")
	public static Class2_Sub46 method7102() {
		if (Static270.aClass8_9 == null || Static136.aClass308_1 == null) {
			return null;
		}
		Static136.aClass308_1.method6867(Static270.aClass8_9);
		@Pc(25) Class2_Sub46 local25 = (Class2_Sub46) Static136.aClass308_1.method6870();
		if (local25 == null) {
			return null;
		} else {
			@Pc(37) Class366 local37 = Static270.aClass25_2.method435(local25.anInt9117);
			return local37 != null && local37.aBoolean735 && local37.method7995(Static270.anInterface9_2) ? local25 : Static421.method6465();
		}
	}
}
