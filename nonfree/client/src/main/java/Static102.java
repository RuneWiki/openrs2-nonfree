import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!et", name = "l", descriptor = "Lclient!ns;")
	public static Class166 aClass166_75;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "[I")
	public static final int[] anIntArray137 = new int[4096];

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_25 = new Class242("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!et", name = "m", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!et", name = "o", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_52 = new Class36(81, 3);

	@OriginalMember(owner = "client!et", name = "q", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_53 = new Class36(50, 7);

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	public static int anInt2155 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	public static int method1610() {
		@Pc(7) Class30 local7 = Static16.aClass30_11;
		@Pc(9) boolean local9 = false;
		if (Static286.anInt5207 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static316.method4691(0, null, null, local18, 0);
		}
		@Pc(43) long local43 = Static199.method2845();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method4638();
		}
		@Pc(70) int local70 = (int) (Static199.method2845() - local43);
		local7.method4692(100, 100, 0, -16777216, 0);
		if (local9) {
			local7.method4695();
		}
		return local70;
	}
}
