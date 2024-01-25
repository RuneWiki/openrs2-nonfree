import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
	public static void method2215() {
		if (Static217.aClass187_7 != Static432.aClass187_10) {
			try {
				Static682.method3657("tbrefresh", Static209.aClient2);
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!fda;I)V")
	public static void method2216(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub1_Sub4_Sub2 arg1) {
		if (arg1.anIntArray305 == null) {
			return;
		}
		@Pc(9) int local9 = arg1.anIntArray305[arg0 + 1];
		if (arg1.anInt5482 == local9) {
			return;
		}
		arg1.anInt5482 = local9;
		arg1.anInt5504 = 0;
		arg1.anInt5453 = 0;
		arg1.anInt5456 = 1;
		arg1.anInt5498 = 0;
		arg1.anInt5525 = arg1.anInt5524;
		if (arg1.anInt5482 != -1) {
			Static146.method2653(arg1.anInt5498, Static591.aClass66_2.method1768(arg1.anInt5482), arg1);
		}
	}
}
