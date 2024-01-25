import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!bl;")
	public static Class24 aClass24_6;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt5621;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public static int anInt5622;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!wv;")
	public static final Class269 aClass269_10 = new Class269("LIVE", 0);

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
	public static boolean aBoolean500 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!js;Ljava/lang/Object;B)V")
	public static void method4556(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static443.method5991(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)V")
	public static void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static389.aClass209_2 == Static107.aClass209_1) {
			if (!Static437.method5919(-2, 1, arg1, 0, 1, false, arg0, 0)) {
				Static437.method5919(-3, 1, arg1, 0, 1, false, arg0, 0);
			}
		} else if (!Static437.method5919(-3, 1, arg1, 0, 1, false, arg0, 0)) {
			Static437.method5919(-2, 1, arg1, 0, 1, false, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method4558() {
		Static200.anInt7590 = 0;
		@Pc(11) int local11 = Static426.aClass2_Sub20_Sub1_2.method3732();
		@Pc(15) int local15 = Static426.aClass2_Sub20_Sub1_2.method3744();
		@Pc(30) boolean local30 = Static426.aClass2_Sub20_Sub1_2.method3716() == 1;
		@Pc(36) int local36 = Static426.aClass2_Sub20_Sub1_2.method3721();
		Static257.method3907(local36);
		@Pc(49) int local49 = (Static193.anInt3787 - Static426.aClass2_Sub20_Sub1_2.anInt4608) / 16;
		Static257.anIntArrayArray37 = new int[local49][4];
		@Pc(59) int local59;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static257.anIntArrayArray37[local55][local59] = Static426.aClass2_Sub20_Sub1_2.method3731();
			}
		}
		Static170.anIntArray218 = new int[local49];
		Static287.aByteArrayArray16 = new byte[local49][];
		Static312.anIntArray200 = new int[local49];
		Static342.aByteArrayArray20 = new byte[local49][];
		Static280.aByteArrayArray14 = new byte[local49][];
		Static57.anIntArray69 = new int[local49];
		Static340.aByteArrayArray19 = new byte[local49][];
		Static253.aByteArrayArray12 = null;
		Static83.anIntArray110 = new int[local49];
		Static420.anIntArray494 = null;
		Static96.anIntArray119 = new int[local49];
		local49 = 0;
		for (local59 = (local15 - (Static81.anInt1950 >> 4)) / 8; local59 <= ((Static81.anInt1950 >> 4) + local15) / 8; local59++) {
			for (@Pc(132) int local132 = (local11 - (Static171.anInt3288 >> 4)) / 8; local132 <= (local11 + (Static171.anInt3288 >> 4)) / 8; local132++) {
				Static96.anIntArray119[local49] = local132 + (local59 << 8);
				Static57.anIntArray69[local49] = Static438.aClass188_126.method4279("m" + local59 + "_" + local132);
				Static83.anIntArray110[local49] = Static438.aClass188_126.method4279("l" + local59 + "_" + local132);
				Static170.anIntArray218[local49] = Static438.aClass188_126.method4279("um" + local59 + "_" + local132);
				Static312.anIntArray200[local49] = Static438.aClass188_126.method4279("ul" + local59 + "_" + local132);
				local49++;
			}
		}
		Static356.method4998(local15, local11, false, local30);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public static void method4559(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 4);
		local8.method435();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Lclient!pc;ZB)Lclient!qi;")
	public static Class201 method4560(@OriginalArg(0) String arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg1.method4279(arg0);
		if (local10 == -1) {
			return new Class201(0);
		}
		@Pc(24) int[] local24 = arg1.method4294(local10);
		@Pc(30) Class201 local30 = new Class201(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local30.anInt5614 > local37) {
				@Pc(53) Class2_Sub20 local53 = new Class2_Sub20(arg1.method4283(local10, local24[local39++]));
				@Pc(57) int local57 = local53.method3731();
				@Pc(61) int local61 = local53.method3711();
				@Pc(65) int local65 = local53.method3737();
				if (!arg2 && local65 == 1) {
					local30.anInt5614--;
				} else {
					local30.anIntArray368[local37] = local57;
					local30.anIntArray369[local37] = local61;
					local37++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIIII)I")
	public static int method4562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg2;
			arg2 = local12;
		}
		@Pc(25) int local25 = arg3 & 0x3;
		if (local25 == 0) {
			return arg4;
		} else if (local25 == 1) {
			return arg5;
		} else if (local25 == 2) {
			return 7 + 1 - arg4 - arg0;
		} else {
			return 7 + 1 - arg5 - arg2;
		}
	}
}
