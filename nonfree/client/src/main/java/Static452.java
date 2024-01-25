import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
	public static final int anInt7936 = 1;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "Z")
	public static final boolean aBoolean545 = false;

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean546 = true;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "S")
	public static short aShort83 = 32767;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(II)Lclient!ls;")
	public static Class222 method6558(@OriginalArg(0) int arg0) {
		@Pc(8) Class222[] local8 = Static297.method4373();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class222 local16 = local8[local10];
			if (arg0 == local16.anInt6401) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!sd;Z)V")
	public static void method6559(@OriginalArg(0) Class14_Sub5 arg0) {
		arg0.aBoolean727 = false;
		if (arg0.aClass14_Sub14_6 != null) {
			arg0.aClass14_Sub14_6.anInt2148 = 0;
		}
		for (@Pc(24) Class14_Sub5 local24 = arg0.method8691(); local24 != null; local24 = arg0.method8692()) {
			method6559(local24);
		}
	}
}
