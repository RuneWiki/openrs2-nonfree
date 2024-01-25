import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIILclient!ku;Lclient!qa;)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class139 arg3, @OriginalArg(5) Class30 arg4) {
		@Pc(9) Class33 local9 = Static261.aClass8_4.method69(arg3.anInt4364);
		if (local9.anInt974 == -1) {
			return;
		}
		if (arg3.aBoolean286) {
			@Pc(37) int local37 = arg1 + arg3.anInt4372;
			arg1 = local37 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(51) Class2 local51 = local9.method915(arg1, arg4, arg3.aBoolean282);
		if (local51 == null) {
			return;
		}
		@Pc(57) int local57 = arg3.anInt4353;
		@Pc(60) int local60 = arg3.anInt4350;
		if ((arg1 & 0x1) == 1) {
			local57 = arg3.anInt4350;
			local60 = arg3.anInt4353;
		}
		@Pc(74) int local74 = local51.d();
		@Pc(77) int local77 = local51.ga();
		if (local9.aBoolean68) {
			local77 = local60 * 4;
			local74 = local57 * 4;
		}
		if (local9.anInt975 == 0) {
			local51.method5914(arg0, arg2 + 4 - local60 * 4, local74, local77);
		} else {
			local51.XA(arg0, arg2 - (local60 - 1) * 4, local74, local77, 0, local9.anInt975 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public static void method454() {
		Static151.aClass89_1.method3424();
		for (@Pc(20) int local20 = 0; local20 < 32; local20++) {
			Static271.aLongArray6[local20] = 0L;
		}
		for (@Pc(34) int local34 = 0; local34 < 32; local34++) {
			Static464.aLongArray8[local34] = 0L;
		}
		Static143.anInt2937 = 0;
	}
}
