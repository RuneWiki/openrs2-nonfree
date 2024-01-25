import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "I")
	public static int anInt6647;

	@OriginalMember(owner = "client!hga", name = "B", descriptor = "[Lclient!fba;")
	public static Class92[] aClass92Array9;

	@OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
	public static int anInt6643 = 0;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
	public static int anInt6644 = 0;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIILclient!ha;ILclient!qg;)V")
	public static void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class272 arg4) {
		@Pc(9) Class164 local9 = Static168.aClass204_3.method5447(arg4.anInt8268);
		if (local9.anInt5796 == -1) {
			return;
		}
		if (arg4.aBoolean703) {
			@Pc(27) int local27 = arg3 + arg4.anInt8250;
			arg3 = local27 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(39) Class5 local39 = local9.method4907(arg4.aBoolean700, arg3, arg2);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg4.anInt8263;
		@Pc(54) int local54 = arg4.anInt8284;
		if ((arg3 & 0x1) == 1) {
			local54 = arg4.anInt8263;
			local45 = arg4.anInt8284;
		}
		@Pc(68) int local68 = local39.method7589();
		@Pc(71) int local71 = local39.method7585();
		if (local9.aBoolean504) {
			local68 = local45 * 4;
			local71 = local54 * 4;
		}
		if (local9.anInt5791 == 0) {
			local39.method7590(arg0, arg1 - (local54 - 1) * 4, local68, local71);
		} else {
			local39.method7596(arg0, arg1 + 4 - local54 * 4, local68, local71, 0, local9.anInt5791 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "(Z)Lclient!kl;")
	public static Class2_Sub7 method5563() {
		@Pc(13) Class2_Sub7 local13 = (Class2_Sub7) Static339.aClass375_6.method8633();
		if (local13 == null) {
			return new Class2_Sub7();
		} else {
			Static452.anInt8206--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(II)V")
	public static void method5564(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 17);
		local8.method8628();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZI)B")
	public static byte method5565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
