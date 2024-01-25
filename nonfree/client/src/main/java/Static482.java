import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
	public static int anInt8354;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "Lclient!cs;")
	public static Class6_Sub2_Sub4 aClass6_Sub2_Sub4_4;

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
	public static int anInt8362;

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
	public static int anInt8366;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "Z")
	public static boolean aBoolean567 = false;

	@OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
	public static int anInt8364 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z")
	public static boolean method7212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static581.method6717(arg1, arg0) & ((arg1 & 0x2000) != 0 | Static494.method7399(arg0, arg1) | Static301.method5139(arg1, arg0));
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7216(@OriginalArg(0) String arg0) {
		@Pc(6) Class6_Sub9 local6 = Static573.method8156();
		local6.aClass6_Sub40_Sub2_1.method8589(Static640.aClass218_12.anInt6779);
		local6.aClass6_Sub40_Sub2_1.method8561(0);
		@Pc(21) int local21 = local6.aClass6_Sub40_Sub2_1.anInt10169;
		local6.aClass6_Sub40_Sub2_1.method8561(639);
		@Pc(30) int[] local30 = Static288.method5012(local6);
		@Pc(34) int local34 = local6.aClass6_Sub40_Sub2_1.anInt10169;
		local6.aClass6_Sub40_Sub2_1.method8551(arg0);
		local6.aClass6_Sub40_Sub2_1.method8589(Static307.anInt5931);
		local6.aClass6_Sub40_Sub2_1.anInt10169 += 7;
		local6.aClass6_Sub40_Sub2_1.method8591(local6.aClass6_Sub40_Sub2_1.anInt10169, local30, local34);
		local6.aClass6_Sub40_Sub2_1.method8559(local6.aClass6_Sub40_Sub2_1.anInt10169 - local21);
		Static263.method4681(local6);
		Static128.anInt2438 = 0;
		Static292.anInt5761 = 0;
		Static114.anInt2256 = 1;
		Static612.anInt8715 = -3;
	}
}
