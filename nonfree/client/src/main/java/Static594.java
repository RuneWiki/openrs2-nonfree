import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!ss;")
	public static Class205 aClass205_4;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!eg;")
	public static Class3_Sub7_Sub2 aClass3_Sub7_Sub2_3;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	public static final int[] anIntArray634 = new int[13];

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public static int anInt9735 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)Z")
	public static boolean method8339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method8340() {
		for (@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static597.aClass280_45.method7110(); local15 != null; local15 = (Class3_Sub25) Static597.aClass280_45.method7108()) {
			if (local15.aClass119_Sub1_1.method3533()) {
				Static176.method3079(local15.anInt3577);
			} else {
				local15.aClass119_Sub1_1.method3535();
				try {
					local15.aClass119_Sub1_1.method3521();
				} catch (@Pc(32) Exception local32) {
					Static335.method5467("TV: " + local15.anInt3577, local32);
					Static176.method3079(local15.anInt3577);
				}
				if (!local15.aBoolean228 && !local15.aBoolean229) {
					@Pc(58) Class3_Sub6_Sub4 local58 = local15.aClass119_Sub1_1.method3519();
					if (local58 != null) {
						@Pc(64) Class3_Sub7_Sub4 local64 = local58.method8695();
						if (local64 != null) {
							local64.method6828(local15.anInt3576);
							Static204.aClass3_Sub7_Sub1_1.method1626(local64);
							local15.aBoolean228 = true;
						}
					}
				}
			}
		}
	}
}
