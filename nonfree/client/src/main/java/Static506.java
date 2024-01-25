import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rea", name = "N", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_51 = new Class340(64);

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!ha;JI)V")
	public static void method7238(@OriginalArg(0) Class65 arg0, @OriginalArg(1) long arg1) {
		Static496.anInt8307 = 0;
		Static48.anInt9831 = Static23.anInt331;
		Static250.anInt4568 = 0;
		Static23.anInt331 = 0;
		@Pc(16) long local16 = Static547.method7619();
		for (@Pc(21) Class28_Sub5 local21 = (Class28_Sub5) Static288.aClass156_3.method3776(); local21 != null; local21 = (Class28_Sub5) Static288.aClass156_3.method3783()) {
			if (local21.method5846(arg0, arg1)) {
				Static250.anInt4568++;
			}
		}
		if (Static53.aBoolean56 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static288.aClass156_3.method3777() + ", running: " + Static250.anInt4568);
			System.out.println("Emitters: " + Static496.anInt8307 + " Particles: " + Static23.anInt331 + ". Time taken: " + (Static547.method7619() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(III)Lclient!si;")
	public static Class28_Sub1_Sub5 method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub1_Sub5_2;
	}
}
