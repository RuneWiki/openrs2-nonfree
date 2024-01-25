import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lclient!gs;")
	public static Class11_Sub1[] aClass11_Sub1Array1;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
	public static final int anInt3881 = -1;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_38 = new Class269(28, 3);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!wc;B)V")
	public static void method3221(@OriginalArg(0) Class2_Sub5_Sub20 arg0) {
		if (arg0 == null) {
			return;
		}
		Static261.aClass238_28.method5837(arg0);
		Static90.anInt1824++;
		@Pc(32) Class2_Sub5_Sub2 local32;
		if (arg0.aBoolean744 || "".equals(arg0.aString101)) {
			local32 = new Class2_Sub5_Sub2(arg0.aString101);
			Static178.anInt3981++;
		} else {
			@Pc(40) long local40 = arg0.aLong277;
			for (local32 = (Class2_Sub5_Sub2) Static294.aClass222_18.method5468(local40); local32 != null && !local32.aString8.equals(arg0.aString101); local32 = (Class2_Sub5_Sub2) Static294.aClass222_18.method5475()) {
			}
			if (local32 == null) {
				local32 = (Class2_Sub5_Sub2) Static465.aClass233_42.method5669(local40);
				if (local32 != null && !local32.aString8.equals(arg0.aString101)) {
					local32 = null;
				}
				if (local32 == null) {
					local32 = new Class2_Sub5_Sub2(arg0.aString101);
				}
				Static294.aClass222_18.method5476(local32, local40);
				Static178.anInt3981++;
			}
		}
		if (local32.method857(arg0)) {
			Static215.method3732(local32);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3222(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub29 local10 = (Class2_Sub29) Static581.aClass222_41.method5468((long) arg0);
		if (local10 != null) {
			@Pc(17) Class2_Sub16_Sub3 local17 = local10.aClass52_Sub1_1.method1220();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass52_Sub1_1.method1215();
				if (local24 >= (double) local17.method3279() && (double) local17.method3277() >= local24) {
					return local17.method3278();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)I")
	public static int method3223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
