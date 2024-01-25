import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
	public static int anInt6791 = 0;

	@OriginalMember(owner = "client!paa", name = "A", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_109 = new Class67("M", "M", "M", "M");

	@OriginalMember(owner = "client!paa", name = "D", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!paa", name = "E", descriptor = "[Lclient!or;")
	public static final Class222[] aClass222Array1 = new Class222[4];

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method5699(@OriginalArg(0) String arg0) {
		return Static53.method1120(16, arg0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IBI)Lclient!rc;")
	public static Class3_Sub10_Sub16 method5701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub10_Sub16 local15 = (Class3_Sub10_Sub16) Static317.aClass267_28.method6644((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class3_Sub10_Sub16(arg1, arg0);
			Static317.aClass267_28.method6640(local15, local15.aLong285);
		}
		return local15;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!qd;III)V")
	public static void method5702(@OriginalArg(0) int arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class3_Sub16 local18 = (Class3_Sub16) Static529.aClass71_66.method2089(); local18 != null; local18 = (Class3_Sub16) Static529.aClass71_66.method2086()) {
			if (local18.anInt2633 == arg0 && arg2 << 9 == local18.anInt2636 && arg3 << 9 == local18.anInt2630 && local18.aClass242_1.anInt7168 == arg1.anInt7168) {
				if (local18.aClass3_Sub9_Sub2_2 != null) {
					Static530.aClass3_Sub9_Sub3_2.method5653(local18.aClass3_Sub9_Sub2_2);
					local18.aClass3_Sub9_Sub2_2 = null;
				}
				if (local18.aClass3_Sub9_Sub2_3 != null) {
					Static530.aClass3_Sub9_Sub3_2.method5653(local18.aClass3_Sub9_Sub2_3);
					local18.aClass3_Sub9_Sub2_3 = null;
				}
				local18.method7820();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIZ)V")
	public static void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub10_Sub16 local8 = method5701(arg1, 8);
		local8.method6211();
		local8.anInt7561 = arg2;
		local8.anInt7556 = arg0;
		local8.anInt7557 = arg3;
	}
}
