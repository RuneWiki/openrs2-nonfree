import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static int anInt822;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!in;")
	public static Class157 aClass157_28;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array2;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "J")
	public static long aLong28 = 0L;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt823 = 100;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIC)I")
	public static int method869(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}
}
