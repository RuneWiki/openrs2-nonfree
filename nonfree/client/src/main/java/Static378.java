import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!oda", name = "s", descriptor = "Lclient!mv;")
	public static Class229 aClass229_90;

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "Lclient!cw;")
	public static final Class68 aClass68_3 = new Class68(0);

	@OriginalMember(owner = "client!oda", name = "q", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[4];

	@OriginalMember(owner = "client!oda", name = "t", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_103 = new Class349(9, 2);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!ew;)[Lclient!sg;")
	public static Class311[] method5262(@OriginalArg(1) Class99 arg0) {
		if (!arg0.method1776()) {
			return new Class311[0];
		}
		@Pc(16) Class5 local16 = arg0.method1785();
		while (local16.anInt151 == 0) {
			Static263.method3671(10L);
		}
		if (local16.anInt151 == 2) {
			return new Class311[0];
		}
		@Pc(45) int[] local45 = (int[]) local16.anObject1;
		@Pc(51) Class311[] local51 = new Class311[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class311 local59 = new Class311();
			local51[local53] = local59;
			local59.anInt7735 = local45[local53 << 2];
			local59.anInt7736 = local45[(local53 << 2) + 1];
			local59.anInt7734 = local45[(local53 << 2) + 2];
			local59.anInt7730 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!wo;)Lclient!jp;")
	public static Class180 method5263(@OriginalArg(1) Class12_Sub2_Sub1 arg0) {
		@Pc(14) Class180 local14;
		if (Static256.aClass180_1 == null) {
			local14 = new Class180();
		} else {
			local14 = Static256.aClass180_1;
			Static256.aClass180_1 = Static256.aClass180_1.aClass180_2;
			Static474.anInt7611--;
			local14.aClass180_2 = null;
		}
		local14.aClass12_Sub2_Sub1_1 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
	public static void method5265() {
		if (Static540.anInt8912 == 3) {
			Static115.method1686(4);
		} else if (Static540.anInt8912 == 7) {
			Static115.method1686(8);
		} else if (Static540.anInt8912 == 10) {
			Static115.method1686(11);
		}
	}
}
