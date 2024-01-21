import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!ig;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1600 = Static193.method3027("::errortest");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public static void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class3_Sub27 local14 = (Class3_Sub27) Static87.aClass10_125.method267(); local14 != null; local14 = (Class3_Sub27) Static87.aClass10_125.method268()) {
			if (local14.anInt4158 != -1 || local14.anIntArray360 != null) {
				@Pc(26) int local26 = 0;
				if (local14.anInt4168 < arg0) {
					local26 = arg0 - local14.anInt4168;
				} else if (arg0 < local14.anInt4170) {
					local26 = local14.anInt4170 - arg0;
				}
				if (local14.anInt4166 < arg2) {
					local26 += arg2 - local14.anInt4166;
				} else if (local14.anInt4164 > arg2) {
					local26 += local14.anInt4164 - arg2;
				}
				if (local26 - 64 > local14.anInt4171 || Static42.anInt879 == 0 || local14.anInt4159 != arg1) {
					if (local14.aClass3_Sub19_Sub4_2 != null) {
						Static169.aClass3_Sub19_Sub3_2.method2923(local14.aClass3_Sub19_Sub4_2);
						local14.aClass3_Sub19_Sub4_2 = null;
					}
					if (local14.aClass3_Sub19_Sub4_3 != null) {
						Static169.aClass3_Sub19_Sub3_2.method2923(local14.aClass3_Sub19_Sub4_3);
						local14.aClass3_Sub19_Sub4_3 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(137) int local137 = (local14.anInt4171 - local26) * Static42.anInt879 / local14.anInt4171;
					if (local14.aClass3_Sub19_Sub4_2 != null) {
						local14.aClass3_Sub19_Sub4_2.method3269(local137);
					} else if (local14.anInt4158 >= 0) {
						@Pc(149) Class7 local149 = Static214.method241(Static199.aClass52_Sub1_26, local14.anInt4158, 0);
						if (local149 != null) {
							@Pc(156) Class3_Sub24_Sub1 local156 = local149.method242().method2831(Static71.aClass58_1);
							@Pc(161) Class3_Sub19_Sub4 local161 = Static220.method3252(local156, local137);
							local161.method3285(-1);
							Static169.aClass3_Sub19_Sub3_2.method2922(local161);
							local14.aClass3_Sub19_Sub4_2 = local161;
						}
					}
					if (local14.aClass3_Sub19_Sub4_3 != null) {
						local14.aClass3_Sub19_Sub4_3.method3269(local137);
						if (!local14.aClass3_Sub19_Sub4_3.method3321()) {
							local14.aClass3_Sub19_Sub4_3 = null;
						}
					} else if (local14.anIntArray360 != null && (local14.anInt4165 -= arg3) <= 0) {
						@Pc(198) int local198 = (int) ((double) local14.anIntArray360.length * Math.random());
						@Pc(206) Class7 local206 = Static214.method241(Static199.aClass52_Sub1_26, local14.anIntArray360[local198], 0);
						if (local206 != null) {
							@Pc(213) Class3_Sub24_Sub1 local213 = local206.method242().method2831(Static71.aClass58_1);
							@Pc(218) Class3_Sub19_Sub4 local218 = Static220.method3252(local213, local137);
							local218.method3285(0);
							Static169.aClass3_Sub19_Sub3_2.method2922(local218);
							local14.aClass3_Sub19_Sub4_3 = local218;
							local14.anInt4165 = local14.anInt4162 + (int) (Math.random() * (double) (local14.anInt4160 - local14.anInt4162));
						}
					}
				}
			}
		}
	}
}
