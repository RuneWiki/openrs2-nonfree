import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "Lclient!ut;")
	public static Class349 aClass349_1;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
	public static int anInt3322;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_54 = new Class215(18, 0);

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_55 = new Class215(10, -2);

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
	public static int anInt3323 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZLclient!uba;I)V")
	public static void method3047(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub48 arg2) {
		@Pc(8) int local8 = arg2.anInt10125;
		@Pc(12) int local12 = (int) arg2.aLong278;
		arg2.method9253();
		if (arg0) {
			Static204.method8295(local8);
		}
		Static424.method6825(local8);
		@Pc(33) Class24 local33 = Static87.method8101(local12);
		if (local33 != null) {
			Static553.method8248(local33);
		}
		Static198.method3990();
		if (!arg1 && Static475.anInt10143 != -1) {
			Static26.method659(Static475.anInt10143, 1);
		}
		@Pc(55) Class11 local55 = new Class11(Static372.aClass99_51);
		for (@Pc(60) Class2_Sub48 local60 = (Class2_Sub48) local55.method218(); local60 != null; local60 = (Class2_Sub48) local55.method220()) {
			if (!local60.method9250()) {
				local60 = (Class2_Sub48) local55.method218();
				if (local60 == null) {
					return;
				}
			}
			if (local60.anInt10127 == 3) {
				@Pc(82) int local82 = (int) local60.aLong278;
				if (local8 == local82 >>> 16) {
					method3047(true, arg1, local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public static void method3048() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Integer local34 = (Integer) local16.invoke(local28, (Object[]) null);
					Static597.anInt10516 = local34;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
