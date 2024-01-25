import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_4 = new Class186(4, 1, 1, 1);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
	public static boolean method1926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static387.method5966(arg1, arg0)) {
			return (arg1 & 0x9000) != 0 | Static598.method8368(arg0, arg1) | Static559.method7848(arg1, arg0) ? true : ((arg1 & 0x2000) != 0 | Static601.method8391(arg1, arg0) | Static399.method6178(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!dg;Lclient!dg;B)V")
	public static void method1928(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(1) Class5_Sub4 arg1) {
		if (arg1.aClass5_Sub4_66 != null) {
			arg1.method8741();
		}
		arg1.aClass5_Sub4_67 = arg0.aClass5_Sub4_67;
		arg1.aClass5_Sub4_66 = arg0;
		arg1.aClass5_Sub4_66.aClass5_Sub4_67 = arg1;
		arg1.aClass5_Sub4_67.aClass5_Sub4_66 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BZI)I")
	public static int method1929(@OriginalArg(2) int arg0) {
		@Pc(14) Class5_Sub37 local14 = Static498.method7299(false, arg0);
		if (local14 == null) {
			return Static221.aClass324_1.method7725(arg0).anInt1093;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray552.length; local26++) {
			if (local14.anIntArray552[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static221.aClass324_1.method7725(arg0).anInt1093 - local14.anIntArray552.length;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!va;Lclient!va;)V")
	public static void method1930(@OriginalArg(1) Class14 arg0, @OriginalArg(2) Class14 arg1) {
		if (arg1.aClass14_68 != null) {
			arg1.method8904();
		}
		arg1.aClass14_67 = arg0;
		arg1.aClass14_68 = arg0.aClass14_68;
		arg1.aClass14_68.aClass14_67 = arg1;
		arg1.aClass14_67.aClass14_68 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!ha;BIIII)Lclient!ka;")
	public static Class180 method1931(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14 = (long) arg3;
		@Pc(20) Class180 local20 = (Class180) Static645.aClass293_77.method6921(local14);
		if (local20 == null) {
			@Pc(32) Class349 local32 = Static277.method4157(Static107.aClass384_33, arg3);
			if (local32 == null) {
				return null;
			}
			if (local32.anInt9580 < 13) {
				local32.method8212();
			}
			local20 = arg1.method6982(local32, 2055, Static435.anInt7354, 64, 768);
			Static645.aClass293_77.method6925(local14, local20);
		}
		local20 = local20.method7945((byte) 2, 2055, true);
		if (arg5 != 0) {
			local20.a(arg5);
		}
		if (arg2 != 0) {
			local20.FA(arg2);
		}
		if (arg0 != 0) {
			local20.VA(arg0);
		}
		if (arg4 != 0) {
			local20.H(0, arg4, 0);
		}
		return local20;
	}
}
