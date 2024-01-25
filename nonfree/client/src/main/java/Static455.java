import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "[B")
	public static byte[] aByteArray92;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)V")
	public static void method5580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1001) {
			Static266.method4409(Static134.aClass142_6, arg2, arg1);
		} else if (arg0 == 1011) {
			Static266.method4409(Static384.aClass142_17, arg2, arg1);
		} else if (arg0 == 1009) {
			Static266.method4409(Static500.aClass142_19, arg2, arg1);
		} else if (arg0 == 1008) {
			Static266.method4409(Static520.aClass142_21, arg2, arg1);
		} else if (arg0 == 1002) {
			Static266.method4409(Static424.aClass142_18, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V")
	public static void method5583() {
		@Pc(3) Class77[] local3 = Class267.aClass77Array1;
		synchronized (Class267.aClass77Array1) {
			for (@Pc(12) int local12 = 0; local12 < Class267.aClass77Array1.length; local12++) {
				Class267.aClass77Array1[local12] = new Class77();
				Static314.anIntArray289[local12] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public static void method5585() {
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("availableProcessors");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Integer local34 = (Integer) local24.invoke(local28, (Object[]) null);
					Static397.anInt7131 = local34;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
