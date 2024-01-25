import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!jca", name = "If", descriptor = "Lclient!ss;")
	public static Class348 aClass348_4;

	@OriginalMember(owner = "client!jca", name = "Qc", descriptor = "I")
	public static int anInt10426 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)V")
	public static void method8947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class3_Sub7_Sub21 local18 = Static136.method2378((long) arg0, 7);
		local18.method9256();
		local18.anInt10899 = arg1;
	}
}
