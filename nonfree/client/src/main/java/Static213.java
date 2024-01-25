import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt3813;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "Z")
	public static boolean aBoolean232;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Z")
	public static boolean aBoolean230 = true;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!ea;Lclient!ea;)V")
	public static void method3050(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		if (arg0.aClass7_261 != null) {
			arg0.method5802();
		}
		arg0.aClass7_261 = arg1.aClass7_261;
		arg0.aClass7_262 = arg1;
		arg0.aClass7_261.aClass7_262 = arg0;
		arg0.aClass7_262.aClass7_261 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vi;I)V")
	public static void method3051(@OriginalArg(0) Class26_Sub2_Sub4_Sub2 arg0) {
		@Pc(16) Class7_Sub13 local16 = (Class7_Sub13) Static338.aClass164_31.method3512((long) arg0.anInt7080);
		if (local16 == null) {
			return;
		}
		if (local16.aClass7_Sub8_Sub4_3 != null) {
			Static452.aClass7_Sub8_Sub1_2.method2428(local16.aClass7_Sub8_Sub4_3);
			local16.aClass7_Sub8_Sub4_3 = null;
		}
		local16.method5802();
	}
}
