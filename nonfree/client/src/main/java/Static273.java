import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!f;")
	public static Class22 aClass22_14;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
	public static int anInt5049 = 0;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	public static int anInt5050 = -1;

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean374 = false;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILclient!bt;)Ljava/lang/String;")
	public static String method4053(@OriginalArg(2) Class3_Sub2 arg0) {
		try {
			@Pc(9) int local9 = arg0.method6040();
			if (local9 > 32767) {
				local9 = 32767;
			}
			@Pc(21) byte[] local21 = new byte[local9];
			arg0.anInt7620 += Static9.aClass253_1.method5697(local21, arg0.aByteArray95, 0, local9, arg0.anInt7620);
			return Static172.method2969(local9, 0, local21);
		} catch (@Pc(45) Exception local45) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!wt;B)V")
	public static void method4055(@OriginalArg(0) Class3_Sub2_Sub2 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static442.anInt7517; local1++) {
			@Pc(6) int local6 = Static412.anIntArray499[local1];
			@Pc(10) Class1_Sub3_Sub3_Sub1 local10 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local6];
			@Pc(14) int local14 = arg0.method6053();
			if ((local14 & 0x8) != 0) {
				local14 += arg0.method6053() << 8;
			}
			if ((local14 & 0x100) != 0) {
				local14 += arg0.method6053() << 16;
			}
			Static234.method3683(local6, local14, arg0, local10);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!eo;ILclient!qa;)V")
	public static void method4057(@OriginalArg(0) Class68 arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(36) boolean local36 = Static89.aClass157_1.method3834(arg0.aBoolean170 ? Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 : null, arg0.anInt2144, arg0.anInt2149, arg0.anInt2186, arg0.anInt2179 | 0xFF000000, arg0.anInt2192, arg1) == null;
		if (local36) {
			Static334.aClass229_38.method5321(new Class3_Sub45(arg0.anInt2192, arg0.anInt2186, arg0.anInt2144, arg0.anInt2179 | 0xFF000000, arg0.anInt2149, arg0.aBoolean170));
		}
	}
}
