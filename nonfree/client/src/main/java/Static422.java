import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qea", name = "x", descriptor = "Lclient!tb;")
	public static final Class316 aClass316_5 = new Class316();

	@OriginalMember(owner = "client!qea", name = "C", descriptor = "I")
	public static int anInt7420 = 0;

	@OriginalMember(owner = "client!qea", name = "R", descriptor = "I")
	public static int anInt7430 = -1;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!laa;ZLclient!ac;)V")
	public static void method5976(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(3) Class1_Sub3 arg2) {
		@Pc(9) Class1_Sub29 local9 = new Class1_Sub29();
		local9.anInt4322 = arg2.method7974();
		local9.anInt4323 = arg2.method7940();
		local9.anIntArray221 = new int[local9.anInt4322];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt4322][][];
		local9.aClass191Array1 = new Class191[local9.anInt4322];
		local9.anIntArray220 = new int[local9.anInt4322];
		local9.anIntArray222 = new int[local9.anInt4322];
		local9.aClass191Array2 = new Class191[local9.anInt4322];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt4322; local51++) {
			try {
				@Pc(57) int local57 = arg2.method7974();
				@Pc(75) String local75;
				@Pc(79) String local79;
				@Pc(83) int local83;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local75 = arg2.method7951();
					local79 = arg2.method7951();
					local83 = 0;
					if (local57 == 1) {
						local83 = arg2.method7940();
					}
					local9.anIntArray222[local51] = local57;
					local9.anIntArray220[local51] = local83;
					local9.aClass191Array1[local51] = arg1.method4290(Static131.method2300(local75), local79);
				} else if (local57 == 3 || local57 == 4) {
					local75 = arg2.method7951();
					local79 = arg2.method7951();
					local83 = arg2.method7974();
					@Pc(86) String[] local86 = new String[local83];
					for (@Pc(88) int local88 = 0; local88 < local83; local88++) {
						local86[local88] = arg2.method7951();
					}
					@Pc(107) byte[][] local107 = new byte[local83][];
					@Pc(120) int local120;
					if (local57 == 3) {
						for (@Pc(114) int local114 = 0; local114 < local83; local114++) {
							local120 = arg2.method7940();
							local107[local114] = new byte[local120];
							arg2.method7957(local107[local114], local120);
						}
					}
					local9.anIntArray222[local51] = local57;
					@Pc(145) Class[] local145 = new Class[local83];
					for (local120 = 0; local120 < local83; local120++) {
						local145[local120] = Static131.method2300(local86[local120]);
					}
					local9.aClass191Array2[local51] = arg1.method4300(local79, local145, Static131.method2300(local75));
					local9.aByteArrayArrayArray4[local51] = local107;
				}
			} catch (@Pc(224) ClassNotFoundException local224) {
				local9.anIntArray221[local51] = -1;
			} catch (@Pc(231) SecurityException local231) {
				local9.anIntArray221[local51] = -2;
			} catch (@Pc(238) NullPointerException local238) {
				local9.anIntArray221[local51] = -3;
			} catch (@Pc(245) Exception local245) {
				local9.anIntArray221[local51] = -4;
			} catch (@Pc(252) Throwable local252) {
				local9.anIntArray221[local51] = -5;
			}
		}
		Static379.aClass111_42.method2552(local9);
	}
}
