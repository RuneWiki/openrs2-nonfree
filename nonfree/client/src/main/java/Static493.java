import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!su", name = "u", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_44 = new Class10(20);

	@OriginalMember(owner = "client!su", name = "y", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!su", name = "C", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_141 = new Class298(75, 4);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(JLclient!r;I)V")
	public static void method5818(@OriginalArg(0) long arg0, @OriginalArg(1) Class43 arg1) {
		Static596.anInt9426 = 0;
		Static573.anInt9160 = 0;
		Static32.anInt719 = Static135.anInt2895;
		Static135.anInt2895 = 0;
		@Pc(16) long local16 = Static587.method7753();
		for (@Pc(21) Class9_Sub6 local21 = (Class9_Sub6) Static337.aClass309_10.method6590(); local21 != null; local21 = (Class9_Sub6) Static337.aClass309_10.method6594()) {
			if (local21.method3054(arg1, arg0)) {
				Static596.anInt9426++;
			}
		}
		if (Static437.aBoolean571 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static337.aClass309_10.method6593() + ", running: " + Static596.anInt9426);
			System.out.println("Emitters: " + Static573.anInt9160 + " Particles: " + Static135.anInt2895 + ". Time taken: " + (Static587.method7753() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(B)I")
	public static int method5819() {
		@Pc(7) Class43 local7 = Static4.aClass43_1;
		@Pc(9) boolean local9 = false;
		if (Static260.anInt4932 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static442.method7138(0, null, 0, null, local18);
		}
		@Pc(35) long local35 = Static587.method7753();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method7194();
		}
		@Pc(67) int local67 = (int) (Static587.method7753() - local35);
		local7.method7185(0, 100, 100, 0, -16777216);
		if (local9) {
			local7.method7179();
		}
		return local67;
	}
}
