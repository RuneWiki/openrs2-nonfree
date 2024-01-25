import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!mo;")
	public static Class143 aClass143_66;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public static int anInt3349;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!al;")
	public static final Class11 aClass11_73 = new Class11(32);

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "S")
	public static short aShort47 = 205;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method3096() {
		Static117.aClass11_120.method213();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)I")
	public static int method3097(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(38) int local38 = local25 | local25 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return ~local44 & arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method3098() {
		Static149.aBoolean209 = true;
	}
}
