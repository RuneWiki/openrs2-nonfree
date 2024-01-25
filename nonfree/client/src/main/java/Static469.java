import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Lclient!hba;")
	public static Class115 aClass115_8;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!em;")
	public static Class6_Sub5_Sub9 aClass6_Sub5_Sub9_2;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!fh;")
	public static final Class100 aClass100_3 = new Class100(true);

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_150 = new Class73(82, 0);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!gv;I[I[I[I)V")
	public static void method6991(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) int local18 = arg3[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg2[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg0.aClass241Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass241Array3[local28] = null;
					} else {
						@Pc(50) Class113 local50 = Static528.aClass198_2.method5706(local18);
						@Pc(53) int local53 = local50.anInt3849;
						@Pc(58) Class241 local58 = arg0.aClass241Array3[local28];
						if (local58 != null) {
							if (local18 == local58.anInt7475) {
								if (local53 == 0) {
									local58 = arg0.aClass241Array3[local28] = null;
								} else if (local53 == 1) {
									local58.anInt7482 = 0;
									local58.anInt7479 = 0;
									local58.anInt7478 = local26;
									local58.anInt7477 = 0;
									local58.anInt7476 = 1;
									if (!arg0.aBoolean350) {
										Static598.method8288(arg0, 0, local50);
									}
								} else if (local53 == 2) {
									local58.anInt7479 = 0;
								}
							} else if (local50.anInt3857 >= Static528.aClass198_2.method5706(local58.anInt7475).anInt3857) {
								local58 = arg0.aClass241Array3[local28] = null;
							}
						}
						if (local58 == null) {
							local58 = arg0.aClass241Array3[local28] = new Class241();
							local58.anInt7478 = local26;
							local58.anInt7482 = 0;
							local58.anInt7475 = local18;
							local58.anInt7477 = 0;
							local58.anInt7479 = 0;
							local58.anInt7476 = 1;
							if (!arg0.aBoolean350) {
								Static598.method8288(arg0, 0, local50);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method6992() {
		if (Static294.anInterface12Array1 == null) {
			return;
		}
		@Pc(9) Interface12[] local9 = Static294.anInterface12Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface12 local17 = local9[local11];
			local17.method7299();
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method6995() {
		if (Static91.aClass90_1 != null) {
			Static272.aClass61_1 = new Class61();
			Static272.aClass61_1.method2363(Static416.aLong205, Static91.aClass90_1.anInt3323, Static91.aClass90_1, Static91.aClass90_1.aClass316_2.method7577(Static638.anInt10709));
			Static450.aThread4 = new Thread(Static272.aClass61_1, "");
			Static450.aThread4.start();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIILclient!ic;)V")
	public static void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9_Sub4_Sub4 arg4) {
		@Pc(4) Class186 local4 = Static180.method3388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10360 = (arg1 << Static606.anInt10280) + Static375.anInt7139;
		arg4.anInt10365 = arg3;
		arg4.anInt10357 = (arg2 << Static606.anInt10280) + Static375.anInt7139;
		local4.aClass9_Sub4_Sub4_1 = arg4;
		@Pc(33) int local33 = Static148.aClass245Array1 == Static152.aClass245Array3 ? 1 : 0;
		if (arg4.method8413()) {
			if (arg4.method8422()) {
				arg4.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local33];
				Static611.aClass9_Sub4Array5[local33] = arg4;
				return;
			}
			arg4.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local33];
			Static645.aClass9_Sub4Array6[local33] = arg4;
			Static610.aBoolean810 = true;
			return;
		}
		arg4.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local33];
		Static249.aClass9_Sub4Array4[local33] = arg4;
	}
}
