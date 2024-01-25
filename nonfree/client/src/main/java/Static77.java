import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eo", name = "xb", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!eo", name = "Eb", descriptor = "Lclient!tq;")
	public static Class191 aClass191_49;

	@OriginalMember(owner = "client!eo", name = "Jb", descriptor = "Lclient!ae;")
	public static Class4 aClass4_6;

	@OriginalMember(owner = "client!eo", name = "Qb", descriptor = "I")
	public static int anInt1706 = 0;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(Z)V")
	public static void method1750() {
		Static151.aClass119_95.method3304();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)I")
	public static int method1764(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ae;Lclient!or;Z)I")
	public static int method1765(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class150 arg1) {
		if (arg1.anInt4538 != -1) {
			return arg1.anInt4538;
		}
		if (arg1.anInt4545 != -1) {
			@Pc(42) Class213 local42 = Static274.anInterface7_5.method5778(arg0.method4297() ? arg1.anInt4545 : arg1.anInt4534);
			if (!local42.aBoolean608) {
				return local42.aShort92;
			}
		}
		return arg1.anInt4535;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(IIII)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(11, arg0);
		local8.method5537();
		local8.anInt6362 = arg2;
		local8.anInt6365 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(II)Lclient!si;")
	public static Class182 method1775(@OriginalArg(0) int arg0) {
		@Pc(10) Class182 local10 = (Class182) Static312.aClass119_189.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static146.aClass191_95.method5459(34, arg0);
		local10 = new Class182();
		if (local20 != null) {
			local10.method5124(arg0, new Class2_Sub10(local20));
		}
		Static312.aClass119_189.method3308(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILclient!bk;ZILclient!ae;III)Lclient!bk;")
	public static Class7 method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class7 local12 = (Class7) Static345.aClass119_21.method3311(local6);
		if (local12 == null) {
			@Pc(22) Class192 local22 = Static111.method2400(Static201.aClass191_132, arg5);
			if (local22 == null) {
				return null;
			}
			local12 = arg6.method4237(local22, 1031, Static78.anInt1734, 64, 768);
			Static345.aClass119_21.method3308(local12, local6);
		}
		local12 = local12.method1436((byte) 2, 1031, true);
		if (arg0 != 0) {
			local12.method1438(arg0);
		}
		if (arg7 != 0) {
			local12.method1428(arg7);
		}
		if (arg1 != 0) {
			local12.method1432(arg1);
		}
		if (arg2 != 0) {
			local12.method1413(0, arg2, 0);
		}
		return local12;
	}
}
