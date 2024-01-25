import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!cga;")
	public static Class50 aClass50_15;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "J")
	public static long aLong253;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt9465 = 100;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIFZIZ)[I")
	public static int[] method8158(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub2_Sub19 local10 = new Class3_Sub2_Sub19();
		local10.anInt7084 = 4;
		local10.anInt7080 = 8;
		local10.anInt7082 = 35;
		local10.aBoolean512 = true;
		local10.anInt7076 = (int) (arg0 * 4096.0F);
		local10.anInt7081 = 8;
		local10.method8598();
		Static55.method1569(2048, 1);
		local10.method6095(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	public static void method8160() {
		@Pc(11) Class175 local11 = null;
		try {
			@Pc(17) Class304 local17 = Static205.aClass138_2.method3581("2");
			while (local17.anInt8838 == 0) {
				Static258.method4293(1L);
			}
			if (local17.anInt8838 == 1) {
				local11 = (Class175) local17.anObject16;
				@Pc(44) byte[] local44 = new byte[(int) local11.method4458()];
				@Pc(59) int local59;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local59) {
					local59 = local11.method4466(local44.length - local46, local46, local44);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static330.method5393(new Class3_Sub3(local44));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local11 != null) {
				local11.method4462();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}
}
