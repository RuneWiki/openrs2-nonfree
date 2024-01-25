import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!ag;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
	public static void method5899() {
		Static154.anInt2536 = -1;
		Static443.anInt7790 = -1;
		Static514.anInt8684 = 0;
		Static32.anInt444 = -1;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ha;I)Lclient!kf;")
	public static Class198 method5900(@OriginalArg(1) Class143 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class176 local9 = Static300.method4080(true, arg0, arg1);
		return local9 == null ? null : local9.aClass198_6;
	}
}
