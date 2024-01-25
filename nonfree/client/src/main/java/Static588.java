import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
	public static final boolean aBoolean810 = false;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lclient!ida;")
	public static Class3_Sub26 method8070() {
		@Pc(14) Class3_Sub26 local14 = Static23.method412();
		local14.anInt5179 = 0;
		local14.aClass344_55 = null;
		local14.aClass3_Sub15_Sub1_3 = new Class3_Sub15_Sub1(5000);
		return local14;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method8071() {
		if (Static631.anInt10399 == 1 || Static631.anInt10399 == 3 || Static324.anInt6511 != Static631.anInt10399 && (Static631.anInt10399 == 0 || Static324.anInt6511 == 0)) {
			Static377.anInt7132 = 0;
			Static234.anInt5314 = 0;
			Static60.aClass307_6.method7427();
		}
		Static324.anInt6511 = Static631.anInt10399;
	}
}
