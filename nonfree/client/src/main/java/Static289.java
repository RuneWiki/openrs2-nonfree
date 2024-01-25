import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
	public static int anInt4838;

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_107 = new Class253(94, -1);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
	public static void method3834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg2, 9);
		local8.method4716();
		local8.anInt5867 = arg1;
		local8.anInt5868 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	public static void method3844(@OriginalArg(0) int arg0) {
		if (Static424.anIntArray597 == null || Static424.anIntArray597.length < arg0) {
			Static424.anIntArray597 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	public static int method3845() {
		@Pc(7) Class51 local7 = Static269.aClass51_9;
		@Pc(9) boolean local9 = false;
		if (Static377.anInt6113 != 0) {
			@Pc(16) Canvas local16 = new Canvas();
			local16.setSize(100, 100);
			local7 = Static459.method5294(0, null, local16, null, 0);
			local9 = true;
		}
		@Pc(33) long local33 = Static158.method2342();
		for (@Pc(35) int local35 = 0; local35 < 10000; local35++) {
			local7.method5297();
		}
		@Pc(59) int local59 = (int) (Static158.method2342() - local33);
		local7.method5286(100, -16777216, 0, 100, 0);
		if (local9) {
			local7.method5315();
		}
		return local59;
	}
}
