import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLclient!gj;)I")
	public static int method2116(@OriginalArg(1) Class143 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method3130(Static200.anInt3602)) {
			local12++;
		}
		if (arg0.method3130(Static538.anInt8818)) {
			local12++;
		}
		if (arg0.method3130(Static521.anInt8695)) {
			local12++;
		}
		if (arg0.method3130(Static109.anInt2253)) {
			local12++;
		}
		if (arg0.method3130(Static302.anInt5504)) {
			local12++;
		}
		if (arg0.method3130(Static635.anInt9807)) {
			local12++;
		}
		if (arg0.method3130(Static453.anInt7752)) {
			local12++;
		}
		if (arg0.method3130(Static137.anInt2536)) {
			local12++;
		}
		if (arg0.method3130(Static304.anInt5557)) {
			local12++;
		}
		if (arg0.method3130(Static173.anInt3297)) {
			local12++;
		}
		if (arg0.method3130(Static616.anInt9561)) {
			local12++;
		}
		if (arg0.method3130(Static626.anInt9695)) {
			local12++;
		}
		if (arg0.method3130(Static486.anInt8257)) {
			local12++;
		}
		if (arg0.method3130(Static610.anInt9524)) {
			local12++;
		}
		if (arg0.method3130(Static140.anInt2654)) {
			local12++;
		}
		if (arg0.method3130(Static512.anInt8559)) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	public static void method2117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static535.aClass16_10 == null) {
			return;
		}
		@Pc(10) int local10 = Static67.anInt9115;
		@Pc(12) int local12 = Static653.anInt10053;
		Static485.method6944(arg1, arg0);
		if (Static418.anInt7055 == 0) {
			Static632.anInterface8_1 = null;
			Static632.anInterface8_1 = Static535.aClass16_10.method8166(Static535.aClass16_10.method8176(Static137.anInt2535, Static554.anInt8569), Static535.aClass16_10.method8160(Static137.anInt2535, Static554.anInt8569));
		} else if (Static418.anInt7055 == 1 && (Static560.anInterface8Array1 == null || local10 != Static67.anInt9115 || Static653.anInt10053 != local12)) {
			Static560.anInterface8Array1 = new Interface8[Static653.anInt10053 * Static67.anInt9115];
			for (@Pc(59) int local59 = 0; local59 < Static560.anInterface8Array1.length; local59++) {
				Static560.anInterface8Array1[local59] = Static535.aClass16_10.method8166(Static535.aClass16_10.method8176(Static552.anInt8938, Static502.anInt8445), Static535.aClass16_10.method8160(Static552.anInt8938, Static502.anInt8445));
			}
			Static611.anInt9531 = 1;
			Static256.anIntArray322 = new int[Static67.anInt9115 * Static653.anInt10053];
		}
		Static674.aBoolean763 = true;
	}
}
