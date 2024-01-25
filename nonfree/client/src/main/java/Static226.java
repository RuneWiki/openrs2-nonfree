import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
	public static int anInt3803 = 0;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "[Lclient!pp;")
	public static final Class2_Sub34[] aClass2_Sub34Array1 = new Class2_Sub34[1024];

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	public static int anInt3804 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!hw;I)V")
	public static void method3100(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		if (Static291.aClass201_5 == null) {
			return;
		}
		try {
			Static291.aClass201_5.method4606(0L);
			Static291.aClass201_5.method4611(arg1.aByteArray94, 24, arg0);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method3101(@OriginalArg(0) Class75_Sub2 arg0) {
		@Pc(17) byte[] local17;
		if (Static85.anObject5 == null) {
			@Pc(10) Class43_Sub2_Sub1 local10 = new Class43_Sub2_Sub1();
			local17 = local10.method3187();
			Static85.anObject5 = Static191.method2759(local17);
		}
		if (Static150.anObject21 == null) {
			@Pc(32) Class43_Sub1_Sub1 local32 = new Class43_Sub1_Sub1();
			local17 = local32.method966();
			Static150.anObject21 = Static191.method2759(local17);
		}
		@Pc(47) Class205 local47 = arg0.aClass205_1;
		if (local47.method4760() && Static112.anObject8 == null) {
			local17 = Static59.method5176(4.0F, new Class27_Sub1(419684), 0.6F, 0.5F, 4.0F, 16.0F);
			Static112.anObject8 = Static191.method2759(local17);
		}
	}
}
