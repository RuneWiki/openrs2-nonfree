import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "Lclient!bt;")
	public static Class34 aClass34_132;

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
	public static int anInt10290 = 0;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILclient!kq;)Lclient!kq;")
	public static Class199 method8704(@OriginalArg(1) Class199 arg0) {
		if (arg0.anInt4982 != -1) {
			return Static569.method7534(arg0.anInt4982);
		}
		@Pc(24) int local24 = arg0.anInt5041 >>> 16;
		@Pc(29) Class181 local29 = new Class181(Static242.aClass66_17);
		for (@Pc(36) Class4_Sub28 local36 = (Class4_Sub28) local29.method4072(); local36 != null; local36 = (Class4_Sub28) local29.method4071()) {
			if (local36.anInt4697 == local24) {
				return Static569.method7534((int) local36.aLong307);
			}
		}
		return null;
	}
}
