import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "[I")
	public static final int[] anIntArray314 = new int[14];

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_46 = new Class316(22, 3);

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "[I")
	public static final int[] anIntArray315 = new int[4096];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[Lclient!faa;B)V")
	public static void method3241(@OriginalArg(0) int arg0, @OriginalArg(1) Class97[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class97 local21 = arg1[local15];
			if (local21 != null) {
				if (local21.anInt2637 == 0) {
					if (local21.aClass97Array2 != null) {
						method3241(arg0, local21.aClass97Array2);
					}
					@Pc(42) Class6_Sub43 local42 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local21.anInt2678);
					if (local42 != null) {
						Static398.method5756(local42.anInt8192, arg0);
					}
				}
				@Pc(61) Class6_Sub1 local61;
				if (arg0 == 0 && local21.anObjectArray9 != null) {
					local61 = new Class6_Sub1();
					local61.anObjectArray1 = local21.anObjectArray9;
					local61.aClass97_2 = local21;
					Static199.method3316(local61);
				}
				if (arg0 == 1 && local21.anObjectArray10 != null) {
					if (local21.anInt2675 >= 0) {
						@Pc(86) Class97 local86 = Static495.method7281(local21.anInt2678);
						if (local86 == null || local86.aClass97Array2 == null || local86.aClass97Array2.length <= local21.anInt2675 || local86.aClass97Array2[local21.anInt2675] != local21) {
							continue;
						}
					}
					local61 = new Class6_Sub1();
					local61.aClass97_2 = local21;
					local61.anObjectArray1 = local21.anObjectArray10;
					Static199.method3316(local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(IZ)Lclient!wc;")
	public static Class60_Sub8 method3243(@OriginalArg(0) int arg0) {
		@Pc(7) Class349[] local7 = Class319.aClass349Array1;
		synchronized (Class319.aClass349Array1) {
			@Pc(30) Class60_Sub8 local30;
			if (arg0 >= Class319.aClass349Array1.length || Class319.aClass349Array1[arg0].method7889()) {
				local30 = new Class60_Sub8();
				local30.aClass60_Sub6Array1 = new Class60_Sub6[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass60_Sub6Array1[local52] = new Class60_Sub6();
				}
			} else {
				local30 = (Class60_Sub8) Class319.aClass349Array1[arg0].method7894();
				local30.method7802();
				@Pc(37) int local37 = Static231.anIntArray714[arg0]--;
			}
			return local30;
		}
	}
}
