import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
	public static int anInt260;

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!ah", name = "V", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!js;Lclient!md;ZI)V")
	public static void method182(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub36 local9 = new Class2_Sub36();
		local9.anInt6098 = arg1.method3737();
		local9.anInt6099 = arg1.method3731();
		local9.anIntArray410 = new int[local9.anInt6098];
		local9.aByteArrayArrayArray15 = new byte[local9.anInt6098][][];
		local9.anIntArray408 = new int[local9.anInt6098];
		local9.aClass128Array2 = new Class128[local9.anInt6098];
		local9.anIntArray409 = new int[local9.anInt6098];
		local9.aClass128Array1 = new Class128[local9.anInt6098];
		for (@Pc(57) int local57 = 0; local57 < local9.anInt6098; local57++) {
			try {
				@Pc(63) int local63 = arg1.method3737();
				@Pc(80) String local80;
				@Pc(84) String local84;
				@Pc(86) int local86;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local80 = arg1.method3717();
					local84 = arg1.method3717();
					local86 = 0;
					if (local63 == 1) {
						local86 = arg1.method3731();
					}
					local9.anIntArray410[local57] = local63;
					local9.anIntArray408[local57] = local86;
					local9.aClass128Array2[local57] = arg0.method3061(local84, Static100.method5890(local80));
				} else if (local63 == 3 || local63 == 4) {
					local80 = arg1.method3717();
					local84 = arg1.method3717();
					local86 = arg1.method3737();
					@Pc(139) String[] local139 = new String[local86];
					for (@Pc(141) int local141 = 0; local141 < local86; local141++) {
						local139[local141] = arg1.method3717();
					}
					@Pc(156) byte[][] local156 = new byte[local86][];
					@Pc(167) int local167;
					if (local63 == 3) {
						for (@Pc(161) int local161 = 0; local161 < local86; local161++) {
							local167 = arg1.method3731();
							local156[local161] = new byte[local167];
							arg1.method3690(local156[local161], local167);
						}
					}
					local9.anIntArray410[local57] = local63;
					@Pc(196) Class[] local196 = new Class[local86];
					for (local167 = 0; local167 < local86; local167++) {
						local196[local167] = Static100.method5890(local139[local167]);
					}
					local9.aClass128Array1[local57] = arg0.method3069(local84, Static100.method5890(local80), local196);
					local9.aByteArrayArrayArray15[local57] = local156;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.anIntArray409[local57] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.anIntArray409[local57] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.anIntArray409[local57] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.anIntArray409[local57] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.anIntArray409[local57] = -5;
			}
		}
		Static201.aClass265_30.method5999(local9);
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public static void method183() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static10.aBooleanArray5[local5] = true;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V")
	public static void method184(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg0, 7);
		local12.method435();
	}
}
