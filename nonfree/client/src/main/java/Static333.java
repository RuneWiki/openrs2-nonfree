import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "Lclient!dg;")
	public static Class50 aClass50_3;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	public static final int anInt3902 = 4;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(Z)V")
	public static void method3538() {
		Static407.method5568();
		Static435.aClass133_4 = null;
		Static35.aClass133_1 = null;
		Static307.aClass28_42 = null;
		Static78.aClass125ArrayArray1 = null;
		Static293.aClass133_3 = null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!vl;Lclient!hf;Ljava/awt/Canvas;)Lclient!qq;")
	public static synchronized Class28 method3577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface11 arg2, @OriginalArg(4) Class103 arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static130.aBooleanArray14[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(58) Class28 local58;
		if (arg1 == 0) {
			local58 = Static33.method676(local7, arg4, arg2);
		} else if (arg1 == 1) {
			local58 = Static238.method3716(arg0, arg3, local7, arg4, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static130.aBooleanArray14[local7] = true;
		return local58;
	}
}
