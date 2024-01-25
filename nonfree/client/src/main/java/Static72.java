import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_31 = new Class160(114, 4);

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_41 = new Class251(65, -1);

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!k;Lclient!nha;)Lclient!vv;")
	public static Class14_Sub54 method1195(@OriginalArg(1) Class197 arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(6) Class14_Sub54 local6 = Static544.method8199();
		local6.anInt10787 = arg1.anInt7040;
		local6.aClass251_271 = arg1;
		if (local6.anInt10787 == -1) {
			local6.aClass14_Sub21_Sub2_2 = new Class14_Sub21_Sub2(260);
		} else if (local6.anInt10787 == -2) {
			local6.aClass14_Sub21_Sub2_2 = new Class14_Sub21_Sub2(10000);
		} else if (local6.anInt10787 <= 18) {
			local6.aClass14_Sub21_Sub2_2 = new Class14_Sub21_Sub2(20);
		} else if (local6.anInt10787 <= 98) {
			local6.aClass14_Sub21_Sub2_2 = new Class14_Sub21_Sub2(100);
		} else {
			local6.aClass14_Sub21_Sub2_2 = new Class14_Sub21_Sub2(260);
		}
		local6.aClass14_Sub21_Sub2_2.method7759(arg0);
		local6.aClass14_Sub21_Sub2_2.method7761(local6.aClass251_271.method6136());
		local6.anInt10785 = 0;
		return local6;
	}
}
