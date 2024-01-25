import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "Lclient!oea;")
	public static Class246 aClass246_1;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_71 = new Class70(72, -1);

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "[I")
	public static int[] anIntArray543 = new int[2];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!qba;IIZI)V")
	public static void method5644(@OriginalArg(0) Class1_Sub40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 14 | arg2 << 28 | arg1);
		@Pc(22) Class1_Sub28 local22 = (Class1_Sub28) Static19.aClass187_3.method3797(local16);
		if (local22 == null) {
			local22 = new Class1_Sub28();
			Static19.aClass187_3.method3795(local22, local16);
			local22.aClass353_28.method7679(arg0);
			return;
		}
		@Pc(45) Class245 local45 = Static175.aClass114_4.method2217(arg0.anInt7304);
		@Pc(48) int local48 = local45.anInt6183;
		if (local45.anInt6233 == 1) {
			local48 *= arg0.anInt7305 + 1;
		}
		for (@Pc(65) Class1_Sub40 local65 = (Class1_Sub40) local22.aClass353_28.method7677(); local65 != null; local65 = (Class1_Sub40) local22.aClass353_28.method7687()) {
			local45 = Static175.aClass114_4.method2217(local65.anInt7304);
			@Pc(76) int local76 = local45.anInt6183;
			if (local45.anInt6233 == 1) {
				local76 *= local65.anInt7305 + 1;
			}
			if (local76 < local48) {
				Static509.method4319(arg0, local65);
				return;
			}
		}
		local22.aClass353_28.method7679(arg0);
	}
}
