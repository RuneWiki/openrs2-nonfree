import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_99 = new Class94(60, 8);

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8021(@OriginalArg(0) Class20 arg0) {
		for (@Pc(16) Class3_Sub9 local16 = (Class3_Sub9) Static403.aClass325_5.method8016(); local16 != null; local16 = (Class3_Sub9) Static403.aClass325_5.method8022()) {
			if (local16.aBoolean703) {
				local16.method8579(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)V")
	public static void method8023(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static395.aClass100ArrayArrayArray3 = Static283.aClass100ArrayArrayArray2;
			Static9.aClass65Array1 = Static103.aClass65Array3;
		} else {
			Static395.aClass100ArrayArrayArray3 = Static281.aClass100ArrayArrayArray1;
			Static9.aClass65Array1 = Static40.aClass65Array2;
		}
		Static462.anInt8470 = Static395.aClass100ArrayArrayArray3.length;
	}
}
