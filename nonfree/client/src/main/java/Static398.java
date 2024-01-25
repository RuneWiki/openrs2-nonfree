import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public static int anInt7207 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method5755() {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(15, 0);
		local8.method3257();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
	public static void method5756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static76.method1083(arg0)) {
			Static191.method3241(arg1, Static360.aClass97ArrayArray2[arg0]);
		}
	}
}
