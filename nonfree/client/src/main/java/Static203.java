import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_64 = new Class286(49, 2);

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_65 = new Class286(6, 4);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!r;IIB)V")
	public static void method3298(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static312.aClass100_7 = arg0;
		Static423.aClass216ArrayArray1 = new Class216[arg2][arg1];
		if (Static515.anIntArray619 != null) {
			Static78.aClass37_8 = Static583.method7914(Static515.anIntArray619[0], Static515.anIntArray619[3], Static515.anIntArray619[4], Static515.anIntArray619[5], Static515.anIntArray619[2], Static515.anIntArray619[1]);
		}
		Static510.aClass216_1 = new Class216();
		Static116.method1745();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	public static void method3300() {
		@Pc(12) Class2_Sub3_Sub13 local12 = Static382.method5650(15, 0);
		local12.method6095();
	}
}
