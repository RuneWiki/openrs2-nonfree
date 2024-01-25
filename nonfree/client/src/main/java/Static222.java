import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Z")
	public static boolean aBoolean223;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean224 = true;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!qp;)V")
	public static void method3226(@OriginalArg(1) Class6_Sub8 arg0) {
		if (arg0.aClass6_Sub21_6 != null) {
			arg0.aClass6_Sub21_6.anInt2709 = 0;
		}
		arg0.aBoolean744 = false;
		for (@Pc(18) Class6_Sub8 local18 = arg0.method9121(); local18 != null; local18 = arg0.method9124()) {
			method3226(local18);
		}
	}
}
