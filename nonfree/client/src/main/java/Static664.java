import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "Z")
	public static boolean aBoolean795;

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public static int anInt10421 = 0;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)I")
	public static int method8791(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static71.anInt1495 - 1; local3++) {
			if (arg0 < Static562.anIntArray614[local3] + Static405.anIntArray446[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static71.anInt1495 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)[Lclient!fj;")
	public static Class117[] method8795() {
		return new Class117[] { Static258.aClass117_9, Static144.aClass117_5, Static666.aClass117_17, Static486.aClass117_13, Static189.aClass117_6, Static96.aClass117_2, Static228.aClass117_7, Static23.aClass117_1, Static355.aClass117_10, Static254.aClass117_8, Static446.aClass117_11, Static451.aClass117_12, Static140.aClass117_14, Static587.aClass117_15, Static614.aClass117_16 };
	}
}
