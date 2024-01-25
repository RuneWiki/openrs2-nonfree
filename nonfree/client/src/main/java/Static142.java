import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)Lclient!pba;")
	public static Class4_Sub1_Sub2 method6599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZILclient!wq;)Ljava/lang/String;")
	public static String method6600(@OriginalArg(2) Class5_Sub36 arg0) {
		try {
			@Pc(19) int local19 = arg0.method7306();
			if (local19 > 32767) {
				local19 = 32767;
			}
			@Pc(31) byte[] local31 = new byte[local19];
			arg0.anInt8456 += Static209.aClass311_1.method7024(arg0.anInt8456, local19, local31, arg0.aByteArray89, 0);
			return Static262.method4274(local31, 0, local19);
		} catch (@Pc(55) Exception local55) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V")
	public static void method6601() {
		Static543.aClass168_79.method3852(50);
		Static481.aClass168_67.method3852(50);
		Static267.aClass168_45.method3852(50);
		Static38.aClass168_9.method3852(50);
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(III)V")
	public static void method6602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static548.aClass100_13 == null) {
			return;
		}
		@Pc(19) int local19 = Static492.anInt7974;
		@Pc(21) int local21 = Static58.anInt7090;
		Static594.method8181(arg1, arg0);
		if (Static181.anInt3401 == 0) {
			Static682.anInterface24_1 = null;
			Static682.anInterface24_1 = Static548.aClass100_13.method8664(Static548.aClass100_13.method8629(Static95.anInt1605, Static166.anInt3251), Static548.aClass100_13.method8642(Static95.anInt1605, Static166.anInt3251));
		} else if (Static181.anInt3401 == 1 && (Static111.anInterface24Array1 == null || Static492.anInt7974 != local19 || Static58.anInt7090 != local21)) {
			Static111.anInterface24Array1 = new Interface24[Static58.anInt7090 * Static492.anInt7974];
			for (@Pc(55) int local55 = 0; local55 < Static111.anInterface24Array1.length; local55++) {
				Static111.anInterface24Array1[local55] = Static548.aClass100_13.method8664(Static548.aClass100_13.method8629(Static659.anInt10729, Static122.anInt2024), Static548.aClass100_13.method8642(Static659.anInt10729, Static122.anInt2024));
			}
			Static662.anInt10762 = 1;
			Static483.anIntArray454 = new int[Static492.anInt7974 * Static58.anInt7090];
		}
		Static597.aBoolean675 = true;
	}
}
