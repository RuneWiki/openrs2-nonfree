import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method6110() {
		Static581.method8084(Static650.aClass2_Sub30_29.aClass11_Sub11_1.method2678() == 1);
		Static479.aClass70_2 = Static462.method6678(0, Static316.aCanvas1, 22050, Static135.aClass389_2);
		Static641.method8681(Static667.method9088((Class2_Sub23_Sub5) null));
		Static600.aClass70_3 = Static462.method6678(1, Static316.aCanvas1, 2048, Static135.aClass389_2);
		Static130.aClass2_Sub23_Sub3_1 = new Class2_Sub23_Sub3();
		Static600.aClass70_3.method9365(Static130.aClass2_Sub23_Sub3_1);
		Static182.aClass51_6 = new Class51(22050, Static24.anInt294);
		Static321.method4455(3712);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Lclient!oh;")
	public static Class273 method6111(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static581.aClass273ArrayArray2[local7] == null || Static581.aClass273ArrayArray2[local7][local11] == null) {
			@Pc(35) boolean local35 = Static268.method3778(local7);
			if (!local35) {
				return null;
			}
		}
		return Static581.aClass273ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)[Lclient!via;")
	public static Class386[] method6112() {
		return new Class386[] { Static661.aClass386_10, Static11.aClass386_3, Static114.aClass386_5, Static469.aClass386_9, Static501.aClass386_8, Static60.aClass386_4, Static666.aClass386_11 };
	}
}
