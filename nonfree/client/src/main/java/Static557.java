import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public static void method7541(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub8_Sub9 local10 = Static465.method6470(arg0, 5);
		local10.method4835();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJLclient!r;)V")
	public static void method7542(@OriginalArg(1) long arg0, @OriginalArg(2) Class78 arg1) {
		Static15.anInt444 = 0;
		Static298.anInt5552 = 0;
		Static223.anInt4112 = Static74.anInt3298;
		Static74.anInt3298 = 0;
		@Pc(16) long local16 = Static480.method6650();
		for (@Pc(21) Class11_Sub9 local21 = (Class11_Sub9) Static485.aClass196_8.method4024(); local21 != null; local21 = (Class11_Sub9) Static485.aClass196_8.method4028()) {
			if (local21.method5346(arg1, arg0)) {
				Static298.anInt5552++;
			}
		}
		if (Static122.aBoolean191 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static485.aClass196_8.method4029() + ", running: " + Static298.anInt5552);
			System.out.println("Emitters: " + Static15.anInt444 + " Particles: " + Static74.anInt3298 + ". Time taken: " + (Static480.method6650() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!i;)V")
	public static void method7543(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		Static310.aClass129Array5[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	public static void method7544() {
		Static490.aClass207_51.method4398();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method7545() {
		if (Static385.aClass93_4 != Static405.aClass93_6) {
			try {
				Static597.method645(Static475.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}
}
