import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static int anInt2541;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!dea;")
	public static final Class74 aClass74_1 = new Class74(1);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method2318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg1, 4);
		local9.method9256();
		local9.anInt10896 = arg0;
		local9.anInt10897 = arg2;
		local9.anInt10899 = arg3;
	}
}
