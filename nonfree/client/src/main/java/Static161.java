import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "Lclient!lq;")
	public static Class153 aClass153_2;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_73 = new Class129(48, -1);

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "Lclient!fi;")
	public static Class76 aClass76_6 = null;

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_74 = new Class129(13, 5);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public static void method2279(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(16, arg0);
		local8.method3024();
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	public static int method2281() {
		@Pc(7) Class200 local7 = Static407.aClass200_9;
		@Pc(9) boolean local9 = false;
		if (Static146.anInt2644 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static464.method5875(null, local18, 0, null, 0);
		}
		@Pc(35) long local35 = Static446.method5903();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method5828();
		}
		@Pc(64) int local64 = (int) (Static446.method5903() - local35);
		local7.method5856(0, -16777216, 100, 100, 0);
		if (local9) {
			local7.method5827();
		}
		return local64;
	}
}
