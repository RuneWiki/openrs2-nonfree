import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jb", name = "ub", descriptor = "I")
	public static int anInt4662;

	@OriginalMember(owner = "client!jb", name = "jc", descriptor = "I")
	public static int anInt4664;

	@OriginalMember(owner = "client!jb", name = "cc", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_53 = new Class387(5, 4);

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!el;")
	public static final Class109 aClass109_103 = new Class109(61, -2);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!sb;Lclient!ha;Lclient!co;I)V")
	public static void method3996(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class5_Sub8 arg2) {
		@Pc(12) Class134 local12 = arg0.method7599(arg1);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = local12.method9236();
		if (local12.method9219() > local19) {
			local19 = local12.method9219();
		}
		@Pc(31) int local31 = arg2.anInt1428;
		@Pc(34) int local34 = arg2.anInt1431;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(54) int local54;
		@Pc(77) int local77;
		if (arg0.aString116 != null) {
			local36 = Static473.aClass224_10.method5255(arg0.aString116, (Class134[]) null, Static433.aStringArray51, (int[]) null);
			for (local54 = 0; local54 < local36; local54++) {
				@Pc(60) String local60 = Static433.aStringArray51[local54];
				if (local36 - 1 > local54) {
					local60 = local60.substring(0, local60.length() - 4);
				}
				local77 = Static305.aClass158_6.method3130(local60);
				if (local38 < local77) {
					local38 = local77;
				}
			}
			local40 = local36 * Static305.aClass158_6.method3128() + Static305.aClass158_6.method3133() / 2;
		}
		local54 = local19 / 2 + arg2.anInt1428;
		@Pc(106) int local106 = arg2.anInt1431;
		if (local19 + Static629.anInt9762 > local31) {
			local54 = local38 / 2 + local19 / 2 + Static629.anInt9762 + 5 + 10;
			local31 = Static629.anInt9762;
		} else if (local31 > Static629.anInt9770 - local19) {
			local54 = Static629.anInt9770 - local38 / 2 - local19 / 2 - 5 - 10;
			local31 = Static629.anInt9770 - local19;
		}
		if (local34 < Static629.anInt9761 + local19) {
			local106 = local19 / 2 + Static629.anInt9761 + 10;
			local34 = Static629.anInt9761;
		} else if (local34 > Static629.anInt9771 - local19) {
			local106 = Static629.anInt9771 - local19 / 2 - local40 - 10;
			local34 = Static629.anInt9771 - local19;
		}
		local77 = (int) (Math.atan2((double) (local31 - arg2.anInt1428), (double) (local34 - arg2.anInt1431)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local12.method9221((float) local31 + (float) local19 / 2.0F, (float) local19 / 2.0F + (float) local34, 4096, local77);
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		if (arg0.aString116 != null) {
			local251 = local106;
			local249 = local54 - local38 / 2 - 5;
			local253 = local38 + local249 + 10;
			local255 = local106 + Static305.aClass158_6.method3128() * local36 + 3;
			if (arg0.anInt8889 != 0) {
				arg1.method7731(arg0.anInt8889, local249, local255 - local106, -local249 + local253, local106);
			}
			if (arg0.anInt8894 != 0) {
				arg1.method7723(local249, local255 - local106, arg0.anInt8894, local253 - local249, local106);
			}
			for (@Pc(325) int local325 = 0; local325 < local36; local325++) {
				@Pc(331) String local331 = Static433.aStringArray51[local325];
				if (local36 - 1 > local325) {
					local331 = local331.substring(0, local331.length() - 4);
				}
				Static305.aClass158_6.method3131(arg1, local331, local54, local106, arg0.anInt8886);
				local106 += Static305.aClass158_6.method3128();
			}
		}
		if (arg0.anInt8895 == -1 && arg0.aString116 == null) {
			return;
		}
		local19 >>= 0x1;
		@Pc(386) Class5_Sub26 local386 = new Class5_Sub26(arg2);
		local386.anInt4764 = local251;
		local386.anInt4754 = local34 + local19;
		local386.anInt4755 = local34 - local19;
		local386.anInt4757 = local253;
		local386.anInt4762 = local255;
		local386.anInt4761 = local19 + local31;
		local386.anInt4758 = local249;
		local386.anInt4760 = local31 - local19;
		Static199.aClass102_64.method1921(local386);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public static void method4000(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub5_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class22 local8 = Static220.aClass22Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static526.anInt8863; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static328.anInt5870; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static611.anInt10115;
							@Pc(32) int local32 = local12 << Static611.anInt10115;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class22 local41 = Static220.aClass22Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8038(local12, local15) - local41.method8038(local12, local15);
									@Pc(71) int local71 = local8.method8038(local12, local15 + 1) - local41.method8038(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8038(local12 + 1, local15 + 1) - local41.method8038(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8038(local12 + 1, local15) - local41.method8038(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
