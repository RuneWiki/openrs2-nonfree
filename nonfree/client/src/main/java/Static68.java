import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt4584;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt4582 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static final int anInt4583 = -1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
	public static int[] anIntArray382 = new int[2];

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!si;")
	public static final Class217 aClass217_21 = new Class217(13, 7);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ic;B)I")
	public static int method3473(@OriginalArg(0) Class4_Sub21 arg0) {
		@Pc(14) String local14 = Static381.method5199(arg0);
		@Pc(16) int[] local16 = null;
		if (Static390.method5265(arg0.anInt3041)) {
			local16 = Static390.aClass204_2.method4629((int) arg0.aLong82).anIntArray292;
		} else if (arg0.anInt3046 != -1) {
			local16 = Static390.aClass204_2.method4629(arg0.anInt3046).anIntArray292;
		} else if (Static41.method736(arg0.anInt3041)) {
			@Pc(45) Class6_Sub2_Sub1_Sub2 local45 = Static176.aClass6_Sub2_Sub1_Sub2Array1[(int) arg0.aLong82];
			if (local45 != null) {
				@Pc(50) Class243 local50 = local45.aClass243_1;
				if (local50.anIntArray613 != null) {
					local50 = local50.method5337(Static155.aClass149_1);
				}
				if (local50 != null) {
					local16 = local50.anIntArray610;
				}
			}
		} else if (Static286.method4000(arg0.anInt3041)) {
			@Pc(86) Class71 local86;
			if (arg0.anInt3041 == 1006) {
				local86 = Static2.aClass74_13.method1683((int) arg0.aLong82);
			} else {
				local86 = Static2.aClass74_13.method1683((int) (arg0.aLong82 >>> 32 & 0x7FFFFFFFL));
			}
			if (local86.anIntArray138 != null) {
				local86 = local86.method1626(Static155.aClass149_1);
			}
			if (local86 != null) {
				local16 = local86.anIntArray141;
			}
		}
		if (local16 != null) {
			local14 = local14 + Static54.method5870(local16);
		}
		@Pc(135) int local135 = Static266.aClass215_8.method4973(local14, Static208.aClass3Array9);
		if (arg0.aBoolean217) {
			local135 += Static241.aClass3_13.UA() + 4;
		}
		return local135;
	}
}
