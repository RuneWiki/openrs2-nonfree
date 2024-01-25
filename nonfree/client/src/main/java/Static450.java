import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_103 = new Class61(34, -1);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!vj;B)I")
	public static int method6351(@OriginalArg(0) Class10_Sub1_Sub2 arg0) {
		if (arg0.anInt8513 == 0) {
			return 0;
		}
		@Pc(73) int local73;
		@Pc(66) int local66;
		if (arg0.anInt8465 != -1) {
			@Pc(25) Class10_Sub1_Sub2 local25 = null;
			if (arg0.anInt8465 < 32768) {
				@Pc(39) Class4_Sub50 local39 = (Class4_Sub50) Static106.aClass183_8.method4289((long) arg0.anInt8465);
				if (local39 != null) {
					local25 = local39.aClass10_Sub1_Sub2_Sub1_1;
				}
			} else if (arg0.anInt8465 >= 32768) {
				local25 = Static246.aClass10_Sub1_Sub2_Sub2Array1[arg0.anInt8465 - 32768];
			}
			if (local25 != null) {
				local66 = arg0.anInt8934 - local25.anInt8934;
				local73 = arg0.anInt8929 - local25.anInt8929;
				if (local66 != 0 || local73 != 0) {
					arg0.method7034((int) (Math.atan2((double) local66, (double) local73) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class10_Sub1_Sub2_Sub2) {
			@Pc(175) Class10_Sub1_Sub2_Sub2 local175 = (Class10_Sub1_Sub2_Sub2) arg0;
			if (local175.anInt8547 != -1 && (local175.anInt8537 == 0 || local175.anInt8538 > 0)) {
				local175.method7034(local175.anInt8547);
				local175.anInt8547 = -1;
			}
		} else if (arg0 instanceof Class10_Sub1_Sub2_Sub1) {
			@Pc(99) Class10_Sub1_Sub2_Sub1 local99 = (Class10_Sub1_Sub2_Sub1) arg0;
			if (local99.anInt4177 != -1 && (local99.anInt8537 == 0 || local99.anInt8538 > 0)) {
				local66 = local99.anInt8934 - (local99.anInt4177 - Static373.anInt6695 - Static373.anInt6695) * 256;
				local73 = local99.anInt8929 - (local99.anInt4155 - Static6.anInt97 - Static6.anInt97) * 256;
				if (local66 != 0 || local73 != 0) {
					local99.method7034((int) (Math.atan2((double) local66, (double) local73) * 2607.5945876176133D) & 0x3FFF);
				}
				local99.anInt4177 = -1;
			}
		}
		return arg0.method7030();
	}
}
