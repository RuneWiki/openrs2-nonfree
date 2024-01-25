import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!lha", name = "Q", descriptor = "I")
	public static int anInt5880;

	@OriginalMember(owner = "client!lha", name = "kb", descriptor = "[Lclient!s;")
	public static Class159[] aClass159Array2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!lha", name = "q", descriptor = "Ljava/lang/Class;")
	public static Class aClass34;

	@OriginalMember(owner = "client!lha", name = "bb", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_149 = new Class251(31, 4);

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "(I)I")
	public static int method5277() {
		@Pc(5) Class144 local5 = Static103.aClass144_3;
		@Pc(7) boolean local7 = false;
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 0) {
			@Pc(19) Canvas local19 = new Canvas();
			local19.setSize(100, 100);
			local5 = Static11.method237(local19, 0, (Interface4) null, (Class310) null, 0);
			local7 = true;
		}
		@Pc(36) long local36 = Static26.method382();
		for (@Pc(38) int local38 = 0; local38 < 10000; local38++) {
			local5.method6971();
		}
		@Pc(67) int local67 = (int) (Static26.method382() - local36);
		local5.method6887(0, -16777216, 100, 100, 0);
		if (local7) {
			local5.method6932();
		}
		return local67;
	}
}
