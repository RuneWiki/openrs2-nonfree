import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_8 = new Class353();

	@OriginalMember(owner = "client!bu", name = "B", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_13 = new Class70(32, -1);

	@OriginalMember(owner = "client!bu", name = "F", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_35 = new Class235(15, -2);

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)V")
	public static void method740() {
		@Pc(7) int local7 = Static220.anInt4237;
		@Pc(9) int[] local9 = Static572.anIntArray717;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class8_Sub3_Sub3_Sub1_Sub1 local25 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local9[local17]];
			if (local25 != null) {
				Static297.method4157(local25, local25.method5434());
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!rt;")
	public static Class295 method741(@OriginalArg(1) Component arg0) {
		return new Class295_Sub1(arg0);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!d;I)V")
	public static void method743(@OriginalArg(0) Class1_Sub11 arg0) {
		Static242.aClass353_27.method7679(arg0);
		arg0.anInt1433 = arg0.aClass1_Sub35_Sub2_1.anInt7214;
		arg0.aClass1_Sub35_Sub2_1.anInt7214 = 0;
		Static278.anInt6257 += arg0.anInt1433;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIZIIII)V")
	public static void method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static170.method2425(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(24) int local24 = -arg2;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (arg5 >= Static514.anInt8722 && Static451.anInt7775 >= arg5) {
			@Pc(56) int[] local56 = Static171.anIntArrayArray79[arg5];
			local65 = Static176.method2504(arg4 - arg2, Static162.anInt2935, Static270.anInt4759);
			local73 = Static176.method2504(arg2 + arg4, Static162.anInt2935, Static270.anInt4759);
			local82 = Static176.method2504(arg4 - local15, Static162.anInt2935, Static270.anInt4759);
			local91 = Static176.method2504(arg4 + local15, Static162.anInt2935, Static270.anInt4759);
			Static433.method6039(arg3, local82, local56, local65);
			Static433.method6039(arg0, local91, local56, local82);
			Static433.method6039(arg3, local73, local56, local91);
		}
		@Pc(111) int local111 = -1;
		while (local21 > local10) {
			local111 += 2;
			local42 += 2;
			local24 += local42;
			local29 += local111;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				local29 -= local26 << 1;
				Static38.anIntArray77[local26] = local10;
			}
			local10++;
			@Pc(246) int local246;
			@Pc(255) int local255;
			@Pc(266) int[] local266;
			@Pc(153) int local153;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local153 = arg5 - local21;
				local65 = arg5 + local21;
				if (local65 >= Static514.anInt8722 && Static451.anInt7775 >= local153) {
					if (local21 >= local15) {
						local73 = Static176.method2504(arg4 + local10, Static162.anInt2935, Static270.anInt4759);
						local82 = Static176.method2504(arg4 - local10, Static162.anInt2935, Static270.anInt4759);
						if (Static451.anInt7775 >= local65) {
							Static433.method6039(arg3, local73, Static171.anIntArrayArray79[local65], local82);
						}
						if (Static514.anInt8722 <= local153) {
							Static433.method6039(arg3, local73, Static171.anIntArrayArray79[local153], local82);
						}
					} else {
						local73 = Static38.anIntArray77[local21];
						local82 = Static176.method2504(arg4 + local10, Static162.anInt2935, Static270.anInt4759);
						local91 = Static176.method2504(arg4 - local10, Static162.anInt2935, Static270.anInt4759);
						local246 = Static176.method2504(arg4 + local73, Static162.anInt2935, Static270.anInt4759);
						local255 = Static176.method2504(arg4 - local73, Static162.anInt2935, Static270.anInt4759);
						if (Static451.anInt7775 >= local65) {
							local266 = Static171.anIntArrayArray79[local65];
							Static433.method6039(arg3, local255, local266, local91);
							Static433.method6039(arg0, local246, local266, local255);
							Static433.method6039(arg3, local82, local266, local246);
						}
						if (Static514.anInt8722 <= local153) {
							local266 = Static171.anIntArrayArray79[local153];
							Static433.method6039(arg3, local255, local266, local91);
							Static433.method6039(arg0, local246, local266, local255);
							Static433.method6039(arg3, local82, local266, local246);
						}
					}
				}
			}
			local153 = arg5 - local10;
			local65 = local10 + arg5;
			if (Static514.anInt8722 <= local65 && local153 <= Static451.anInt7775) {
				local73 = arg4 + local21;
				local82 = arg4 - local21;
				if (local73 >= Static270.anInt4759 && local82 <= Static162.anInt2935) {
					local73 = Static176.method2504(local73, Static162.anInt2935, Static270.anInt4759);
					local82 = Static176.method2504(local82, Static162.anInt2935, Static270.anInt4759);
					if (local15 > local10) {
						local91 = local26 < local10 ? Static38.anIntArray77[local10] : local26;
						local246 = Static176.method2504(local91 + arg4, Static162.anInt2935, Static270.anInt4759);
						local255 = Static176.method2504(arg4 - local91, Static162.anInt2935, Static270.anInt4759);
						if (local65 <= Static451.anInt7775) {
							local266 = Static171.anIntArrayArray79[local65];
							Static433.method6039(arg3, local255, local266, local82);
							Static433.method6039(arg0, local246, local266, local255);
							Static433.method6039(arg3, local73, local266, local246);
						}
						if (Static514.anInt8722 <= local153) {
							local266 = Static171.anIntArrayArray79[local153];
							Static433.method6039(arg3, local255, local266, local82);
							Static433.method6039(arg0, local246, local266, local255);
							Static433.method6039(arg3, local73, local266, local246);
						}
					} else {
						if (Static451.anInt7775 >= local65) {
							Static433.method6039(arg3, local73, Static171.anIntArrayArray79[local65], local82);
						}
						if (local153 >= Static514.anInt8722) {
							Static433.method6039(arg3, local73, Static171.anIntArrayArray79[local153], local82);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "(I)V")
	public static void method745() {
		Static345.aBoolean454 = true;
	}
}
