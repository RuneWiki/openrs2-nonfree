import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!lk;")
	public static Class4_Sub23 aClass4_Sub23_1;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array9;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!rj;")
	public static Class219 aClass219_1;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_6 = new Class49(0, 17);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method909() {
		Static402.anInt7091 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static116.aClass4_Sub20Array1[local9] = null;
			Static326.aByteArray82[local9] = 1;
			Static228.aClass112Array1[local9] = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!wn;)V")
	public static void method914(@OriginalArg(1) Class4_Sub20 arg0) {
		@Pc(14) byte[] local14 = new byte[24];
		if (Static103.aClass159_1 != null) {
			@Pc(26) int local26;
			try {
				Static103.aClass159_1.method4067(0L);
				Static103.aClass159_1.method4070(local14);
				for (local26 = 0; local26 < 24 && local14[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local26 = 0; local26 < 24; local26++) {
					local14[local26] = -1;
				}
			}
		}
		arg0.method4600(local14, 24);
	}
}
