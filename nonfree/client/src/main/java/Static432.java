import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray50;

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
	public static int anInt7421;

	@OriginalMember(owner = "client!ot", name = "hb", descriptor = "I")
	public static int anInt7423;

	@OriginalMember(owner = "client!ot", name = "K", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_39 = new Class391(8);

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(III)Z")
	public static boolean method6393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(II)Lclient!kia;")
	public static Class201 method6403(@OriginalArg(0) int arg0) {
		@Pc(6) Class201[] local6 = Static578.method8304();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(18) Class201 local18 = local6[local8];
			if (arg0 == local18.anInt5506) {
				return local18;
			}
		}
		return null;
	}
}
