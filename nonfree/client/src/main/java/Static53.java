import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!br", name = "l", descriptor = "[I")
	public static final int[] anIntArray72 = new int[50];

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class133 method911(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class133_Sub3(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!la;III)Lclient!pha;")
	public static Class5_Sub5_Sub16 method912(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class5_Sub22 local14 = new Class5_Sub22(arg0.method4681(arg1, arg2));
		@Pc(53) Class5_Sub5_Sub16 local53 = new Class5_Sub5_Sub16(arg2, local14.method5937(), local14.method5937(), local14.method5913(), local14.method5913(), local14.method5966() == 1, local14.method5966(), local14.method5966());
		@Pc(57) int local57 = local14.method5966();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local53.aClass330_43.method7917(new Class5_Sub15(local14.method5966(), local14.method5968(), local14.method5968(), local14.method5968(), local14.method5968(), local14.method5968(), local14.method5968(), local14.method5968(), local14.method5968()));
		}
		local53.method6564();
		return local53;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	public static void method914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		if (arg0 != Static597.anInt10025) {
			Static352.anIntArray331 = new int[arg0];
			for (local16 = 0; local16 < arg0; local16++) {
				Static352.anIntArray331[local16] = (local16 << 12) / arg0;
			}
			Static597.anInt10025 = arg0;
			Static219.anInt4124 = arg0 * 32;
			Static28.anInt365 = arg0 - 1;
		}
		if (Static591.anInt9907 == arg1) {
			return;
		}
		if (Static597.anInt10025 == arg1) {
			Static493.anIntArray476 = Static352.anIntArray331;
		} else {
			Static493.anIntArray476 = new int[arg1];
			for (local16 = 0; local16 < arg1; local16++) {
				Static493.anIntArray476[local16] = (local16 << 12) / arg1;
			}
		}
		Static591.anInt9907 = arg1;
		Static273.anInt4903 = arg1 - 1;
	}
}
