import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "Lclient!ed;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public static void method108() {
		if (Static381.aClass174Array1 == null) {
			Static381.aClass174Array1 = Static262.method4527();
			Static357.aClass174_32 = Static381.aClass174Array1[0];
		}
		@Pc(20) Class174 local20 = Static357.aClass174_32;
		@Pc(23) int local23 = Static302.method5730();
		if (local20 == Static357.aClass174_32) {
			Static510.aString75 = Static357.aClass174_32.aClass152_109.method4002(Static286.anInt5468);
			if (Static357.aClass174_32.aBoolean396) {
				Static510.aString75 = Static510.aString75 + local23 + "%";
			}
			Static258.anInt5219 = Static357.aClass174_32.anInt5263;
		} else if (Static262.aClass174_31 == Static357.aClass174_32) {
			Static145.method2683(3);
		} else {
			Static510.aString75 = local20.aClass152_110.method4002(Static286.anInt5468);
			Static258.anInt5219 = local20.anInt5261;
		}
		if (Static330.anInterface8Array1 == null) {
			return;
		}
		for (@Pc(74) int local74 = Static369.anInt6984 + 1; local74 < Static330.anInterface8Array1.length; local74++) {
			if (Static330.anInterface8Array1[local74].method6515() >= 100 && Static369.anInt6984 == local74 - 1 && Static325.anInt6149 >= 1 && Static330.anInterface8Array1[local74].method6513()) {
				Static330.anInterface8Array1[local74].method6512();
				Static204.method3801(Static330.anInterface8Array1[local74]);
				Static369.anInt6984++;
			}
		}
	}
}
