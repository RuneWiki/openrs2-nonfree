import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "Lclient!rk;")
	public static Class296 aClass296_1;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
	public static int anInt718;

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_1 = new Class271(15, 0, 1, 0);

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
	public static int anInt720 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!ee;)Z")
	public static boolean method586(@OriginalArg(1) Class86 arg0) {
		return Static81.aClass86_4 == arg0 || arg0 == Static20.aClass86_1 || arg0 == Static567.aClass86_9 || arg0 == Static613.aClass86_3;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(CIB)I")
	public static int method588(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(21) char local21 = Character.toLowerCase(arg0);
			local7 = (local21 << 4) + 1;
		}
		return local7;
	}
}
