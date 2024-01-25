import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "F")
	public static float aFloat253;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!kea;")
	public static Class161 aClass161_106;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!gh;")
	public static Class106 aClass106_8;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt8652;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)Lclient!ar;")
	public static Class3_Sub5 method7117(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub5) Static430.aClass267_45.method6644(local16);
	}
}
