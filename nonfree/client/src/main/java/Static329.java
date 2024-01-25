import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!laa", name = "A", descriptor = "I")
	public static int anInt5474;

	@OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
	public static int anInt5476;

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
	public static int anInt5472 = 0;

	@OriginalMember(owner = "client!laa", name = "C", descriptor = "Lclient!or;")
	public static Class260 aClass260_12 = null;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(JLclient!ha;B)V")
	public static void method5010(@OriginalArg(0) long arg0, @OriginalArg(1) Class13 arg1) {
		Static551.anInt9027 = Static71.anInt1337;
		Static297.anInt4986 = 0;
		Static646.anInt10250 = 0;
		Static71.anInt1337 = 0;
		@Pc(20) long local20 = Static524.method7320();
		for (@Pc(25) Class28_Sub7 local25 = (Class28_Sub7) Static544.aClass371_6.method8911(); local25 != null; local25 = (Class28_Sub7) Static544.aClass371_6.method8917()) {
			if (local25.method7913(arg1, arg0)) {
				Static646.anInt10250++;
			}
		}
		if (Static112.aBoolean406 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static544.aClass371_6.method8914() + ", running: " + Static646.anInt10250);
			System.out.println("Emitters: " + Static297.anInt4986 + " Particles: " + Static71.anInt1337 + ". Time taken: " + (Static524.method7320() - local20) + "ms");
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II[BIII)V")
	public static void method5011(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(30) int local30 = arg3 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local30--;
			if (local30 < 0) {
				local30 = arg3 - arg2 & 0x3;
				while (true) {
					local30--;
					if (local30 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(39) int local39 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local39] = 1;
			@Pc(49) int local49 = local44 + 1;
			arg0[local44] = 1;
			arg1 = local49 + 1;
			arg0[local49] = 1;
		}
	}
}
