import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "[J")
	public static final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ge;Z)Z")
	public static boolean method1873(@OriginalArg(0) Interface7 arg0) {
		@Pc(15) Class306 local15 = Static146.aClass214_1.method4897(arg0.method7276());
		if (local15.anInt8391 == -1) {
			return true;
		} else {
			@Pc(27) Class223 local27 = Static74.aClass184_1.method4074(local15.anInt8391);
			return local27.anInt6070 == -1 ? true : local27.method5097();
		}
	}
}
