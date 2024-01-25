import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Lclient!qb;")
	public static Class247 aClass247_3;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public static int anInt6151 = 0;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I")
	public static int method5150(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local10 >>> 2 & 0x73333333) + (local10 & 0x33333333);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(45) int local45 = local39 + (local39 >>> 16);
		return local45 & 0xFF;
	}
}
