import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!mo;")
	public static Class202 aClass202_1;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
	public static final int[] anIntArray57 = new int[4096];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method682() {
		Static400.aBoolean553 = true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBIILclient!ng;)V")
	public static void method684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub38 arg3) {
		@Pc(16) long local16 = (long) (arg0 << 28 | arg1 << 14 | arg2);
		@Pc(22) Class6_Sub32 local22 = (Class6_Sub32) Static303.aClass212_22.method5106(local16);
		if (local22 == null) {
			local22 = new Class6_Sub32();
			Static303.aClass212_22.method5104(local16, local22);
			local22.aClass275_97.method6370(arg3);
			return;
		}
		@Pc(45) Class110 local45 = Static295.aClass256_2.method5924(arg3.anInt5948);
		@Pc(48) int local48 = local45.anInt2652;
		if (local45.anInt2639 == 1) {
			local48 *= arg3.anInt5951 + 1;
		}
		for (@Pc(65) Class6_Sub38 local65 = (Class6_Sub38) local22.aClass275_97.method6366(); local65 != null; local65 = (Class6_Sub38) local22.aClass275_97.method6364()) {
			local45 = Static295.aClass256_2.method5924(local65.anInt5948);
			@Pc(78) int local78 = local45.anInt2652;
			if (local45.anInt2639 == 1) {
				local78 *= local65.anInt5951 + 1;
			}
			if (local48 > local78) {
				Static105.method1694(arg3, local65);
				return;
			}
		}
		local22.aClass275_97.method6370(arg3);
	}
}
