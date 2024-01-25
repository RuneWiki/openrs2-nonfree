import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Z")
	public static boolean aBoolean307;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public static int anInt4470 = -1;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!mea;I)Lclient!mea;")
	public static Class230 method3712(@OriginalArg(0) Class230 arg0) {
		if (arg0.anInt6668 != -1) {
			return Static655.method9094(arg0.anInt6668);
		}
		@Pc(19) int local19 = arg0.anInt6663 >>> 16;
		@Pc(24) Class318 local24 = new Class318(Static547.aClass187_69);
		for (@Pc(29) Class14_Sub32 local29 = (Class14_Sub32) local24.method7646(); local29 != null; local29 = (Class14_Sub32) local24.method7648()) {
			if (local29.anInt6351 == local19) {
				return Static655.method9094((int) local29.aLong305);
			}
		}
		return null;
	}
}
