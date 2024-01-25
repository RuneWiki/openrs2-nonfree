import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_17 = new Class222(0, 2, 2, 1);

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_119 = new Class179(17, -1);

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "Lclient!fha;")
	public static Class109 aClass109_66 = new Class109();

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BJLclient!ha;)V")
	public static void method7795(@OriginalArg(1) long arg0, @OriginalArg(2) Class95 arg1) {
		Static133.anInt2249 = 0;
		Static324.anInt5141 = 0;
		Static79.anInt1412 = Static546.anInt8995;
		Static546.anInt8995 = 0;
		@Pc(21) long local21 = Static476.method6413();
		for (@Pc(26) Class13_Sub9 local26 = (Class13_Sub9) Static82.aClass171_1.method3745(); local26 != null; local26 = (Class13_Sub9) Static82.aClass171_1.method3744()) {
			if (local26.method5653(arg1, arg0)) {
				Static324.anInt5141++;
			}
		}
		if (Static55.aBoolean81 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static82.aClass171_1.method3751() + ", running: " + Static324.anInt5141);
			System.out.println("Emitters: " + Static133.anInt2249 + " Particles: " + Static546.anInt8995 + ". Time taken: " + (Static476.method6413() - local21) + "ms");
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZIIIII)V")
	public static void method7796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static5.method102(0, arg4, arg1, arg2, arg5, arg0, arg3);
	}
}
