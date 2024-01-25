import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZ)Lclient!ie;")
	public static Class2_Sub6 method2823(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) Class375[] local15 = Class3_Sub1_Sub6_Sub1.aClass375Array1;
		synchronized (Class3_Sub1_Sub6_Sub1.aClass375Array1) {
			@Pc(31) Class2_Sub6 local31;
			if (Class3_Sub1_Sub6_Sub1.aClass375Array1.length <= arg0 || Class3_Sub1_Sub6_Sub1.aClass375Array1[arg0].method8634()) {
				local31 = new Class2_Sub6();
				local31.aClass2_Sub5Array1 = new Class2_Sub5[arg0];
				for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
					local31.aClass2_Sub5Array1[local37] = new Class2_Sub5();
				}
			} else {
				local31 = (Class2_Sub6) Class3_Sub1_Sub6_Sub1.aClass375Array1[arg0].method8640();
				local31.method8558();
				@Pc(66) int local66 = Static605.anIntArray608[arg0]--;
			}
			local31.aBoolean455 = arg1;
			return local31;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
	public static void method2825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static240.method4614(false, local35, true);
	}
}
