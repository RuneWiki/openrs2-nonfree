import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "Lclient!tc;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
	public static int anInt220;

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
	public static int anInt222;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_11 = new Class337(63, 6);

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	public static int anInt221 = 0;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIBIIII)I")
	public static int method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(14) int local14 = arg5;
			arg5 = arg0;
			arg0 = local14;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg1;
		} else {
			return 8 - arg0 - arg3;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	public static void method203() {
		Static623.aBoolean741 = true;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB[B)V")
	public static void method204(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static83.aClass5_Sub22_13 == null) {
			Static83.aClass5_Sub22_13 = new Class5_Sub22(20000);
		}
		Static83.aClass5_Sub22_13.method5925(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Static91.method1551(Static83.aClass5_Sub22_13.aByteArray71);
		Static103.aClass33_Sub1Array2 = new Class33_Sub1[Static85.anInt1713];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static527.anInt9062; local37 <= Static511.anInt8847; local37++) {
			@Pc(43) Class33_Sub1 local43 = Static516.method4855(local37);
			if (local43 != null) {
				Static103.aClass33_Sub1Array2[local35++] = local43;
			}
		}
		Static426.aBoolean524 = false;
		Static621.aLong271 = Static95.method1587();
		Static83.aClass5_Sub22_13 = null;
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V")
	public static void method206() {
		for (@Pc(18) Class5_Sub5_Sub15 local18 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local18 != null; local18 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
			if (Static157.method2277(local18.anInt6765)) {
				Static196.method3497(local18);
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!fc;I)[Lclient!hga;")
	public static Class142[] method207(@OriginalArg(0) Class100 arg0) {
		if (!arg0.method2090()) {
			return new Class142[0];
		}
		@Pc(18) Class91 local18 = arg0.method2091();
		while (local18.anInt2271 == 0) {
			Static314.method4821(10L);
		}
		if (local18.anInt2271 == 2) {
			return new Class142[0];
		}
		@Pc(44) int[] local44 = (int[]) local18.anObject2;
		@Pc(50) Class142[] local50 = new Class142[local44.length >> 2];
		for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
			@Pc(58) Class142 local58 = new Class142();
			local50[local52] = local58;
			local58.anInt3955 = local44[local52 << 2];
			local58.anInt3959 = local44[(local52 << 2) + 1];
			local58.anInt3958 = local44[(local52 << 2) + 2];
			local58.anInt3957 = local44[(local52 << 2) + 3];
		}
		return local50;
	}
}
