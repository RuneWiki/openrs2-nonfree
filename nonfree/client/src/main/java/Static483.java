import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean653 = false;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)V")
	public static void method7527(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 14);
		local8.method3093();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)Lclient!wm;")
	public static Class2_Sub52 method7528() {
		@Pc(6) Class2_Sub52 local6 = Static630.method9132();
		local6.anInt11008 = 0;
		local6.aClass94_107 = null;
		local6.aClass2_Sub11_Sub2_7 = new Class2_Sub11_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBII)V")
	public static void method7529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 + Static84.anInt2565;
		@Pc(14) int local14 = Static32.anInt723 + arg0;
		if (Static395.aClass100ArrayArrayArray3 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static47.anInt1794 || Static209.anInt4742 <= arg0 || Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 0 && arg2 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132) {
			return;
		}
		@Pc(52) long local52 = (long) (local14 << 14 | arg2 << 28 | local10);
		@Pc(58) Class2_Sub45 local58 = (Class2_Sub45) Static378.aClass99_26.method3056(local52);
		if (local58 == null) {
			Static600.method8798(arg2, arg1, arg0);
			return;
		}
		@Pc(72) Class2_Sub7 local72 = (Class2_Sub7) local58.aClass341_60.method8524();
		if (local72 == null) {
			Static600.method8798(arg2, arg1, arg0);
			return;
		}
		@Pc(86) Class3_Sub1_Sub4_Sub1 local86 = (Class3_Sub1_Sub4_Sub1) Static600.method8798(arg2, arg1, arg0);
		if (local86 == null) {
			local86 = new Class3_Sub1_Sub4_Sub1(arg1 << 9, Static9.aClass65Array1[arg2].method7995(arg0, arg1), arg0 << 9, arg2, arg2);
		} else {
			local86.anInt7090 = local86.anInt7081 = -1;
		}
		local86.anInt7082 = local72.anInt790;
		local86.anInt7086 = local72.anInt789;
		label56: while (true) {
			@Pc(134) Class2_Sub7 local134 = (Class2_Sub7) local58.aClass341_60.method8519();
			if (local134 == null) {
				break;
			}
			if (local86.anInt7082 != local134.anInt790) {
				local86.anInt7090 = local134.anInt790;
				local86.anInt7091 = local134.anInt789;
				while (true) {
					@Pc(159) Class2_Sub7 local159 = (Class2_Sub7) local58.aClass341_60.method8519();
					if (local159 == null) {
						break label56;
					}
					if (local159.anInt790 != local86.anInt7082 && local159.anInt790 != local86.anInt7090) {
						local86.anInt7081 = local159.anInt790;
						local86.anInt7087 = local159.anInt789;
					}
				}
			}
		}
		@Pc(207) int local207 = Static590.method8716((arg1 << 9) + 256, arg2, (arg0 << 9) + 256);
		local86.anInt10310 = arg0 << 9;
		local86.aByte132 = (byte) arg2;
		local86.anInt7094 = 0;
		local86.anInt10303 = arg1 << 9;
		local86.anInt10306 = local207;
		local86.aByte131 = (byte) arg2;
		if (Static30.method735(arg0, arg1)) {
			local86.aByte131++;
		}
		Static411.method6650(arg2, arg1, arg0, local207, local86);
	}
}
