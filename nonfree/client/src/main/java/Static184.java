import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public static int anInt3826;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public static int anInt3827;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public static int anInt3830;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_159 = new Class305(18, 3);

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	public static int anInt3831 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)I")
	public static int method3549(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()V")
	public static void method3550() {
		for (@Pc(1) int local1 = 0; local1 < Static316.anInt6013; local1++) {
			@Pc(6) Class20_Sub1 local6 = Static227.aClass20_Sub1Array3[local1];
			Static468.method7128(local6);
			Static227.aClass20_Sub1Array3[local1] = null;
		}
		Static316.anInt6013 = 0;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lclient!wt;")
	public static Class1_Sub51 method3551() {
		if (Static335.aClass295_19 == null || Static282.aClass314_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub51 local16 = (Class1_Sub51) Static282.aClass314_1.method8056(); local16 != null; local16 = (Class1_Sub51) Static282.aClass314_1.method8056()) {
			@Pc(30) Class65 local30 = Static335.aClass32_4.method1129(local16.anInt9566);
			if (local30 != null && local30.aBoolean156 && local30.method1818(Static335.anInterface19_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public static void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass20_Sub2_1 != null) {
			local7.aClass20_Sub2_1 = null;
		}
		if (local7.aClass20_Sub2_2 != null) {
			local7.aClass20_Sub2_2 = null;
		}
	}
}
