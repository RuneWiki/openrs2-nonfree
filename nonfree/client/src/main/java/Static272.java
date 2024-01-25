import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ifa", name = "y", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[Lclient!nt;I)V")
	public static void method6406(@OriginalArg(0) int arg0, @OriginalArg(1) Class270[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class270 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt7008 == 0) {
					if (local14.aClass270Array2 != null) {
						method6406(arg0, local14.aClass270Array2);
					}
					@Pc(41) Class3_Sub20 local41 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local14.anInt6973);
					if (local41 != null) {
						Static682.method9051(arg0, local41.anInt2493);
					}
				}
				@Pc(61) Class3_Sub41 local61;
				if (arg0 == 0 && local14.anObjectArray20 != null) {
					local61 = new Class3_Sub41();
					local61.aClass270_12 = local14;
					local61.anObjectArray4 = local14.anObjectArray20;
					Static540.method7160(local61);
				}
				if (arg0 == 1 && local14.anObjectArray7 != null) {
					if (local14.anInt7020 >= 0) {
						@Pc(90) Class270 local90 = Static254.method3544(local14.anInt6973);
						if (local90 == null || local90.aClass270Array3 == null || local14.anInt7020 >= local90.aClass270Array3.length || local90.aClass270Array3[local14.anInt7020] != local14) {
							continue;
						}
					}
					local61 = new Class3_Sub41();
					local61.anObjectArray4 = local14.anObjectArray7;
					local61.aClass270_12 = local14;
					Static540.method7160(local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Z")
	public static boolean method6407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
