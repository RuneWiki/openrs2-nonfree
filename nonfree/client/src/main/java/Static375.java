import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5567(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static566.method8154(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static641.anInt10703; local29++) {
			@Pc(35) String local35 = Static304.aStringArray17[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static566.method8154(local35);
			if (local35 != null && local35.equals(local20)) {
				Static641.anInt10703--;
				for (@Pc(59) int local59 = local29; local59 < Static641.anInt10703; local59++) {
					Static304.aStringArray17[local59] = Static304.aStringArray17[local59 + 1];
					Static411.aStringArray27[local59] = Static411.aStringArray27[local59 + 1];
					Static543.aStringArray34[local59] = Static543.aStringArray34[local59 + 1];
					Static228.aStringArray11[local59] = Static228.aStringArray11[local59 + 1];
					Static535.aBooleanArray21[local59] = Static535.aBooleanArray21[local59 + 1];
				}
				Static619.anInt10403 = Static441.anInt7833;
				@Pc(120) Class14_Sub19 local120 = Static286.method4081(Static205.aClass394_1, Static591.aClass100_126);
				local120.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg0));
				local120.aClass14_Sub29_Sub1_1.method5855(arg0);
				Static576.method8234(local120);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public static void method5569() {
		if (Static461.aClass150_6 == null) {
			return;
		}
		if (Static461.aClass150_6.anInt4247 == 1) {
			Static461.aClass150_6 = null;
			return;
		}
		if (Static461.aClass150_6.anInt4247 == 2) {
			Static330.method5177(Static522.aString87, 2, Static657.aClass333_8);
			Static461.aClass150_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BILclient!mea;I)V")
	public static void method5570(@OriginalArg(1) int arg0, @OriginalArg(2) Class230 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1 local16 = arg1.method5457(Static677.aClass137_47);
		if (local16 == null) {
			return;
		}
		Static677.aClass137_47.KA(arg2, arg0, arg1.anInt6703 + arg2, arg1.anInt6701 + arg0);
		if (Static51.anInt1226 < 3) {
			Static40.aClass20_4.method7407((float) arg2 + (float) arg1.anInt6703 / 2.0F, (float) arg1.anInt6701 / 2.0F + (float) arg0, ((int) -Static543.aFloat228 & 0x3FFF) << 2, local16, arg2, arg0);
		} else {
			Static677.aClass137_47.A(-16777216, local16, arg2, arg0);
		}
	}
}
