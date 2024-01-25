import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!iia", name = "w", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!iia", name = "q", descriptor = "Lclient!sia;")
	public static final Class323 aClass323_4 = new Class323();

	@OriginalMember(owner = "client!iia", name = "y", descriptor = "[I")
	public static int[] anIntArray264 = new int[1];

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3815(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static367.anInt10954 = 2;
		Static399.anInt6574 = arg0;
		Static220.method3264(arg2, arg1, false);
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)Lclient!su;")
	public static Class3_Sub46 method3816() {
		if (Static671.aClass302_68 == null || Static289.aClass178_1 == null) {
			return null;
		}
		Static289.aClass178_1.method4059(Static671.aClass302_68);
		@Pc(25) Class3_Sub46 local25 = (Class3_Sub46) Static289.aClass178_1.method4057();
		if (local25 == null) {
			return null;
		} else {
			@Pc(37) Class188 local37 = Static671.aClass378_4.method8708(local25.anInt9112);
			return local37 != null && local37.aBoolean329 && local37.method4283(Static671.anInterface6_2) ? local25 : Static230.method3489();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZZZ)V")
	public static void method3817(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static603.anInt10075++;
			Static345.method5019();
		}
		if (arg0) {
			Static500.anInt7899++;
			Static669.method8385();
		}
	}
}
