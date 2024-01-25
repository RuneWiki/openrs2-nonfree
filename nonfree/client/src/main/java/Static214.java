import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ib;I)Lclient!gca;")
	public static Class139 method3079(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(15) Class139 local15 = new Class139();
		local15.anInt3083 = arg0.method8519();
		local15.aClass5_Sub5_Sub1_1 = Static502.aClass259_2.method6241(local15.anInt3083);
		return local15;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!cn;B)V")
	public static void method3080(@OriginalArg(0) Class73 arg0) {
		if (Static57.anInt867 != arg0.anInt1367) {
			return;
		}
		if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62 == null) {
			arg0.anInt1353 = 0;
			arg0.anInt1352 = 0;
			return;
		}
		arg0.anInt1408 = 150;
		arg0.anInt1392 = (int) (Math.sin((double) Static44.anInt740 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt1374 = 5;
		arg0.anInt1352 = Static279.anInt4838;
		arg0.anInt1353 = Static364.method5392(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62);
		arg0.anInt1373 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt7044;
		arg0.anInt1401 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt7008;
		arg0.anInt1335 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt6978;
		arg0.anInt1338 = 0;
		@Pc(85) Class165 local85 = arg0.anInt1401 == -1 ? null : Static158.aClass317_1.method7882(arg0.anInt1401, 100);
		if (local85 != null) {
			Static388.method5661(arg0.anInt1335, local85);
		}
	}
}
