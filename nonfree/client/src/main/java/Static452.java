import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
	public static int anInt7846;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_16 = new Class180(11, 3);

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
	public static int anInt7845 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ws;IIII)V")
	public static void method6083(@OriginalArg(0) Class2_Sub45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 28 | arg2 << 14 | arg1);
		@Pc(22) Class2_Sub21 local22 = (Class2_Sub21) Static383.aClass240_34.method5439(local16);
		if (local22 == null) {
			local22 = new Class2_Sub21();
			Static383.aClass240_34.method5430(local16, local22);
			local22.aClass265_28.method5999(arg0);
			return;
		}
		@Pc(45) Class30 local45 = Static350.aClass149_2.method3483(arg0.anInt7831);
		@Pc(53) int local53 = local45.anInt1064;
		if (local45.anInt1053 == 1) {
			local53 *= arg0.anInt7832 + 1;
		}
		for (@Pc(70) Class2_Sub45 local70 = (Class2_Sub45) local22.aClass265_28.method6005(); local70 != null; local70 = (Class2_Sub45) local22.aClass265_28.method6001()) {
			local45 = Static350.aClass149_2.method3483(local70.anInt7831);
			@Pc(83) int local83 = local45.anInt1064;
			if (local45.anInt1053 == 1) {
				local83 *= local70.anInt7832 + 1;
			}
			if (local83 < local53) {
				Static117.method1718(local70, arg0);
				return;
			}
		}
		local22.aClass265_28.method5999(arg0);
	}
}
