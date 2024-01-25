import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_102 = new Class216(88, -1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public static void method5198(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0, 9);
		local14.method3956();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public static void method5201() {
		Static417.anInt6044 = 0;
		@Pc(17) int local17 = Static445.anInt6949 + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9);
		@Pc(24) int local24 = Static321.anInt5000 + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static417.anInt6044 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static417.anInt6044 = 1;
		}
		if (Static417.anInt6044 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static417.anInt6044 = 0;
		}
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	public static void method5203() {
		Static676.method8966();
		Static253.method3677();
	}
}
