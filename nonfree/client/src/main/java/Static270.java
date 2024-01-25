import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	public static int anInt4789;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_40 = new Class263(2, 4, 4, 0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)Z")
	public static boolean method3651() {
		@Pc(8) Class4_Sub21 local8 = (Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262;
		if (local8 == null || Static126.aClass258_19.aClass4_240 == local8) {
			return false;
		} else {
			if (local8.anInt3041 >= 2000) {
				local8.anInt3041 -= 2000;
			}
			return local8.anInt3041 == 1008;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!qa;JB)V")
	public static void method3652(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1) {
		Static415.anInt7048 = 0;
		Static356.anInt6386 = Static375.anInt5262;
		Static375.anInt5262 = 0;
		@Pc(14) long local14 = Static199.method2845();
		for (@Pc(27) Class41_Sub1 local27 = (Class41_Sub1) Static129.aClass27_3.method730(); local27 != null; local27 = (Class41_Sub1) Static129.aClass27_3.method735()) {
			if (local27.method3163(arg0, arg1)) {
				Static415.anInt7048++;
			}
		}
		if (Static2.aBoolean470 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static129.aClass27_3.method726() + ", running: " + Static415.anInt7048 + ". Particles: " + Static375.anInt5262 + ". Time taken: " + (Static199.method2845() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II[ILclient!bv;IZ)Lclient!og;")
	public static Class1_Sub3_Sub1 method3653(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class30_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (arg2.aBoolean62 || Static315.method4350(arg0) && Static315.method4350(arg3)) {
			return new Class1_Sub3_Sub1(arg2, 3553, arg0, arg3, false, arg1);
		} else if (arg2.aBoolean68) {
			return new Class1_Sub3_Sub1(arg2, 34037, arg0, arg3, false, arg1);
		} else {
			return new Class1_Sub3_Sub1(arg2, arg0, arg3, Static183.method2711(arg0), Static183.method2711(arg3), arg1);
		}
	}
}
