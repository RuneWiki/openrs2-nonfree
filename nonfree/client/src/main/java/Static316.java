import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pq", name = "O", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "S")
	public static short aShort67 = 1;

	@OriginalMember(owner = "client!pq", name = "M", descriptor = "[I")
	public static final int[] anIntArray462 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
	public static int anInt5738 = 0;

	@OriginalMember(owner = "client!pq", name = "R", descriptor = "Z")
	public static boolean aBoolean426 = true;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4760(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILclient!ci;)Lclient!tg;")
	public static Class4_Sub1_Sub18 method4761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class38 arg2) {
		@Pc(14) Class4_Sub20 local14 = new Class4_Sub20(arg2.method1039(arg1, arg0));
		@Pc(47) Class4_Sub1_Sub18 local47 = new Class4_Sub1_Sub18(arg1, local14.method4624(), local14.method4624(), local14.method4595(), local14.method4595(), local14.method4614() == 1, local14.method4614(), local14.method4614());
		@Pc(51) int local51 = local14.method4614();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass91_49.method2587(new Class4_Sub22(local14.method4614(), local14.method4560(), local14.method4560(), local14.method4560(), local14.method4560(), local14.method4560(), local14.method4560(), local14.method4560(), local14.method4560()));
		}
		local47.method5564();
		return local47;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BIZ)V")
	public static void method4763(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static67.anInt1640 = arg0;
		Static147.anInt3063 = 3;
		Static37.method743(Static108.aClass9_4.aString1, Static108.aClass9_4.anInt84);
		if (arg1) {
			Static430.method5922("", "");
		} else {
			Static177.method3242();
			Static430.method5922(Static133.aString20, Static235.aString41);
		}
	}
}
