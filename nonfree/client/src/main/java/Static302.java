import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!uq;")
	public static Class362 aClass362_60;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_74 = new Class171(29, -2);

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Z")
	private static final boolean aBoolean340 = false;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_75 = new Class171(97, -1);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(JLclient!ha;B)V")
	public static void method4384(@OriginalArg(0) long arg0, @OriginalArg(1) Class95 arg1) {
		Static211.anInt3662 = 0;
		Static339.anInt5829 = Static567.anInt6323;
		Static619.anInt10270 = 0;
		Static567.anInt6323 = 0;
		@Pc(16) long local16 = Static15.method380();
		for (@Pc(21) Class34_Sub7 local21 = (Class34_Sub7) Static372.aClass317_6.method6891(); local21 != null; local21 = (Class34_Sub7) Static372.aClass317_6.method6894()) {
			if (local21.method5087(arg1, arg0)) {
				Static211.anInt3662++;
			}
		}
		if (aBoolean340 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static372.aClass317_6.method6892() + ", running: " + Static211.anInt3662);
			System.out.println("Emitters: " + Static619.anInt10270 + " Particles: " + Static567.anInt6323 + ". Time taken: " + (Static15.method380() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public static void method4386(@OriginalArg(0) int arg0) {
		if (Static367.anInt10954 == 1) {
			Static61.anInt1285 = arg0;
		} else if (Static367.anInt10954 == 2) {
			Static355.anInt6076 = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
	public static void method4387(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static117.method1795(arg1.length - 1, arg0, arg1, 0);
	}
}
