import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public static int anInt3018;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt3015 = 0;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt3016 = -1;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_37 = new Class179(55, 3);

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_68 = new Class7("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!hp;)V")
	public static void method2621(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (Static312.aClass26_4 == null) {
			return;
		}
		try {
			Static312.aClass26_4.method669(0L);
			Static312.aClass26_4.method668(arg0, arg1.aByteArray89, 24);
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V")
	public static void method2622(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static125.anInt2545 = arg0;
		Static173.anInt3208 = arg1;
		Static108.anInt2276 = 0;
		Static28.anInt644 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	public static int method2623(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ah;Z)V")
	public static void method2624(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		arg0.method312();
		@Pc(14) int local14 = Static102.anInt2165;
		@Pc(24) Class31_Sub2_Sub1_Sub1 local24 = Static452.aClass31_Sub2_Sub1_Sub1_2 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local14] = new Class31_Sub2_Sub1_Sub1();
		local24.anInt7301 = local14;
		@Pc(32) int local32 = arg0.method316(30);
		@Pc(37) byte local37 = (byte) (local32 >> 28);
		@Pc(43) int local43 = local32 >> 14 & 0x3FFF;
		@Pc(47) int local47 = local32 & 0x3FFF;
		local24.anIntArray658[0] = local43 - Static165.anInt3049;
		local24.anInt7300 = (local24.anIntArray658[0] << 7) + (local24.method5989() << 6);
		local24.anIntArray657[0] = local47 - Static345.anInt5799;
		local24.anInt7298 = (local24.anIntArray657[0] << 7) + (local24.method5989() << 6);
		Static357.anInt5881 = local24.aByte100 = local37;
		if (Static164.aClass1_Sub5Array1[local14] != null) {
			local24.method1188(Static164.aClass1_Sub5Array1[local14]);
		}
		Static155.anInt2952 = 0;
		Static381.anIntArray619[Static155.anInt2952++] = local14;
		Static130.aByteArray48[local14] = 0;
		Static152.anInt2904 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local14) {
				@Pc(138) int local138 = arg0.method316(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				@Pc(160) Class59 local160 = Static358.aClass59Array1[local124] = new Class59();
				local160.anInt1876 = 0;
				local160.anInt1879 = local152 + (local142 << 28) + (local148 << 14);
				local160.aBoolean114 = false;
				local160.anInt1878 = -1;
				Static186.anIntArray299[Static152.anInt2904++] = local124;
				Static130.aByteArray48[local124] = 0;
			}
		}
		arg0.method313();
	}
}
