import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int anInt1222;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	public static void method922(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static165.method2751(arg0)) {
			return;
		}
		@Pc(19) Class1[] local19 = Static54.aClass1ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class1 local27 = local19[local21];
			if (local27.anObjectArray8 != null) {
				@Pc(34) Class4_Sub21 local34 = new Class4_Sub21();
				local34.aClass1_40 = local27;
				local34.anObjectArray28 = local27.anObjectArray8;
				Static135.method2369(2000000, local34);
			}
		}
	}
}
