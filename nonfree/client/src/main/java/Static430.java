import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "Lclient!tk;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "[Lclient!aa;")
	public static Class2_Sub1[] aClass2_Sub1Array3;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
	public static final int anInt7165 = 1401;

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
	public static int anInt7171 = 0;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "Lclient!nv;")
	public static Class177 aClass177_47 = new Class177();

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
	public static int anInt7181 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIILclient!fi;)V")
	public static void method5693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2) {
		@Pc(8) Class97 local8 = arg2.method1688(Static407.aClass200_9);
		if (local8 == null) {
			return;
		}
		Static407.aClass200_9.ba(arg0, arg1, arg2.anInt2127 + arg0, arg2.anInt2106 + arg1);
		if (Static221.anInt3661 < 3) {
			Static429.aClass49_24.method5793((float) arg0 + (float) arg2.anInt2127 / 2.0F, (float) arg2.anInt2106 / 2.0F + (float) arg1, ((int) -Static99.aFloat33 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static407.aClass200_9.ra(-16777216, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lclient!ne;")
	public static Class170 method5694(@OriginalArg(0) int arg0) {
		@Pc(16) Class170[] local16 = Static27.method447();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class170 local24 = local16[local18];
			if (local24.anInt4323 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	public static void method5695() {
		Static281.aClass5_Sub15_Sub2_13.method5550(Static242.aClass243_133.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static297.aClass243_162.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static322.aClass243_181.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static324.aClass243_183.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static318.aClass243_176.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static71.aClass243_255.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static451.aClass243_252.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static265.aClass243_145.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static344.aClass243_196.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static191.aClass243_108.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static110.aClass243_64.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static183.aClass243_101.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static29.aClass243_24.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static281.aClass243_250.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static448.aClass243_248.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static107.aClass243_62.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static136.aClass243_256.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static373.aClass243_217.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static415.aClass243_237.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static125.aClass243_70.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static204.aClass243_115.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static5.aClass243_4.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static183.aClass243_102.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static129.aClass243_72.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static366.aClass243_209.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static353.aClass243_201.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static228.aClass243_124.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static291.aClass243_159.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static125.aClass243_69.method5460());
		Static281.aClass5_Sub15_Sub2_13.method5550(Static73.aClass243_45.method5460());
	}
}
