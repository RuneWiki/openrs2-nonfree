import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public static int anInt5850;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLclient!gt;)[Lclient!kw;")
	public static Class146[] method4637(@OriginalArg(1) Class93 arg0) {
		if (!arg0.method2075()) {
			return new Class146[0];
		}
		@Pc(16) Class268 local16 = arg0.method2094();
		while (local16.anInt7420 == 0) {
			Static140.method2004(10L);
		}
		if (local16.anInt7420 == 2) {
			return new Class146[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject10;
		@Pc(48) Class146[] local48 = new Class146[local35.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class146 local56 = new Class146();
			local48[local50] = local56;
			local56.anInt3802 = local35[local50 << 2];
			local56.anInt3803 = local35[(local50 << 2) + 1];
			local56.anInt3804 = local35[(local50 << 2) + 2];
			local56.anInt3801 = local35[(local50 << 2) + 3];
		}
		return local48;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public static void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass2_Sub2_2 != null) {
			local7.aClass2_Sub2_2 = null;
		}
		if (local7.aClass2_Sub2_3 != null) {
			local7.aClass2_Sub2_3 = null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public static void method4639() {
		Static113.aClass75Array1 = new Class75[50];
		Static344.anInt5625 = 0;
	}
}
