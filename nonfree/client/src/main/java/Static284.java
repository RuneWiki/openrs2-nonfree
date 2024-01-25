import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!m;")
	public static final Class235 aClass235_27 = new Class235(43);

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	public static int anInt5151 = 2;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_26 = new Class136(8);

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)Z")
	public static boolean method4284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static272.method4183(arg0, arg1)) {
			return Static309.method4680(arg1, arg0) | (arg0 & 0x9000) != 0 | Static10.method141(arg1, arg0) ? true : (Static71.method909(arg0, arg1) | (arg0 & 0x2000) != 0 | Static672.method8910(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZIZI)I")
	public static int method4285(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) Class3_Sub51 local12 = Static321.method5223(false, arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local12.anIntArray577.length; local27++) {
			if (local12.anIntArray577[local27] >= 0 && Static243.aClass406_2.anInt11253 > local12.anIntArray577[local27]) {
				@Pc(60) Class91 local60 = Static243.aClass406_2.method9394(local12.anIntArray577[local27]);
				@Pc(74) int local74 = local60.method2368(Static646.aClass106_1.method2677(arg2).anInt9232, arg2);
				if (arg0) {
					local25 += local12.anIntArray576[local27] * local74;
				} else {
					local25 += local74;
				}
			}
		}
		return local25;
	}
}
