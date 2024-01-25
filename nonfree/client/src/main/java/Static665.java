import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "Lclient!nh;")
	public static Class92 aClass92_9;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "[Lclient!gb;")
	public static Class129[] aClass129Array1 = new Class129[50];

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_155 = new Class216(67, 12);

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Lclient!ml;")
	public static final Class236 aClass236_11 = new Class236();

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
	public static int anInt10447 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Lclient!wk;")
	public static Class3_Sub10 method8803() {
		@Pc(8) Class3_Sub10 local8 = (Class3_Sub10) aClass236_11.method4951();
		if (local8 == null) {
			return new Class3_Sub10();
		} else {
			Static429.anInt6769--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBZ)Lclient!rk;")
	public static Class3_Sub6 method8806(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) Class236[] local15 = Class4_Sub36.aClass236Array1;
		synchronized (Class4_Sub36.aClass236Array1) {
			@Pc(34) Class3_Sub6 local34;
			if (arg0 >= Class4_Sub36.aClass236Array1.length || Class4_Sub36.aClass236Array1[arg0].method4956()) {
				local34 = new Class3_Sub6();
				local34.aClass3_Sub4Array1 = new Class3_Sub4[arg0];
				for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
					local34.aClass3_Sub4Array1[local56] = new Class3_Sub4();
				}
			} else {
				local34 = (Class3_Sub6) Class4_Sub36.aClass236Array1[arg0].method4957();
				local34.method8898();
				@Pc(41) int local41 = Static433.anIntArray471[arg0]--;
			}
			local34.aBoolean632 = arg1;
			return local34;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method8811() {
		if (Static656.anInt10356 == 7) {
			Static306.method4298(false);
		} else {
			Static102.aClass192_3 = Static375.aClass192_2;
			Static375.aClass192_2 = null;
			Static53.method1256(13);
		}
	}
}
