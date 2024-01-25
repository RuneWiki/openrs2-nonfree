import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lw", name = "tb", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!lw", name = "zb", descriptor = "Lclient!vk;")
	public static final Class302 aClass302_3 = new Class302("LIVE", 0);

	@OriginalMember(owner = "client!lw", name = "Cb", descriptor = "I")
	public static int anInt5474 = 0;

	@OriginalMember(owner = "client!lw", name = "Db", descriptor = "Z")
	public static final boolean aBoolean402 = false;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V")
	public static void method4666(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static99.anInt1988 = 0;
		Static216.anInt4203 = arg1;
		Static358.anInt8908 = 0;
		Static205.anInt4042 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!ge;Lclient!gaa;II)V")
	public static void method4670(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub41 local9 = new Class1_Sub41();
		local9.anInt7511 = arg0.method3922();
		local9.anInt7512 = arg0.method3925();
		local9.aClass157Array2 = new Class157[local9.anInt7511];
		local9.aByteArrayArrayArray16 = new byte[local9.anInt7511][][];
		local9.anIntArray714 = new int[local9.anInt7511];
		local9.aClass157Array1 = new Class157[local9.anInt7511];
		local9.anIntArray715 = new int[local9.anInt7511];
		local9.anIntArray713 = new int[local9.anInt7511];
		for (@Pc(57) int local57 = 0; local57 < local9.anInt7511; local57++) {
			try {
				@Pc(63) int local63 = arg0.method3922();
				@Pc(88) String local88;
				@Pc(92) String local92;
				@Pc(96) int local96;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local88 = arg0.method3954();
					local92 = arg0.method3954();
					local96 = 0;
					if (local63 == 1) {
						local96 = arg0.method3925();
					}
					local9.anIntArray714[local57] = local63;
					local9.anIntArray713[local57] = local96;
					local9.aClass157Array2[local57] = arg1.method2380(local92, Static458.method6487(local88));
				} else if (local63 == 3 || local63 == 4) {
					local88 = arg0.method3954();
					local92 = arg0.method3954();
					local96 = arg0.method3922();
					@Pc(99) String[] local99 = new String[local96];
					for (@Pc(101) int local101 = 0; local101 < local96; local101++) {
						local99[local101] = arg0.method3954();
					}
					@Pc(122) byte[][] local122 = new byte[local96][];
					@Pc(135) int local135;
					if (local63 == 3) {
						for (@Pc(129) int local129 = 0; local129 < local96; local129++) {
							local135 = arg0.method3925();
							local122[local129] = new byte[local135];
							arg0.method3963(local122[local129], local135);
						}
					}
					local9.anIntArray714[local57] = local63;
					@Pc(160) Class[] local160 = new Class[local96];
					for (local135 = 0; local135 < local96; local135++) {
						local160[local135] = Static458.method6487(local99[local135]);
					}
					local9.aClass157Array1[local57] = arg1.method2397(local92, Static458.method6487(local88), local160);
					local9.aByteArrayArrayArray16[local57] = local122;
				}
			} catch (@Pc(241) ClassNotFoundException local241) {
				local9.anIntArray715[local57] = -1;
			} catch (@Pc(248) SecurityException local248) {
				local9.anIntArray715[local57] = -2;
			} catch (@Pc(255) NullPointerException local255) {
				local9.anIntArray715[local57] = -3;
			} catch (@Pc(262) Exception local262) {
				local9.anIntArray715[local57] = -4;
			} catch (@Pc(269) Throwable local269) {
				local9.anIntArray715[local57] = -5;
			}
		}
		Static491.aClass37_89.method970(local9);
	}
}
