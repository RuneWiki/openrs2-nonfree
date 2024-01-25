import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!vaa", name = "N", descriptor = "I")
	public static int anInt10333;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!oh;B)V")
	public static void method9062(@OriginalArg(0) Class273 arg0) {
		if (!Static581.aBoolean787) {
			return;
		}
		if (arg0.anObjectArray34 != null) {
			@Pc(15) Class273 local15 = Static147.method2144(Static203.anInt3318, Static166.anInt2883);
			if (local15 != null) {
				@Pc(21) Class2_Sub36 local21 = new Class2_Sub36();
				local21.anObjectArray2 = arg0.anObjectArray34;
				local21.aClass273_7 = local15;
				local21.aClass273_6 = arg0;
				Static484.method6919(local21);
			}
		}
		@Pc(43) Class2_Sub33 local43 = Static592.method8154(Static132.aClass349_38, Static487.aClass221_2.aClass48_1);
		local43.aClass2_Sub20_Sub2_1.method8572(arg0.anInt7415);
		local43.aClass2_Sub20_Sub2_1.method8551(arg0.anInt7410);
		local43.aClass2_Sub20_Sub2_1.method8567(Static203.anInt3318);
		local43.aClass2_Sub20_Sub2_1.method8582(Static359.anInt5735);
		local43.aClass2_Sub20_Sub2_1.method8567(arg0.anInt7350);
		local43.aClass2_Sub20_Sub2_1.method8533(3774, Static166.anInt2883);
		Static487.aClass221_2.method5173(local43);
	}
}
