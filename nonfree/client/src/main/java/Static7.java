import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_1 = new Class187(7, 7);

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZ)V")
	public static void method105(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class3_Sub17 local8 = (Class3_Sub17) Static200.aClass130_19.method3543(); local8 != null; local8 = (Class3_Sub17) Static200.aClass130_19.method3551()) {
			if (local8.aClass3_Sub6_Sub2_2 != null) {
				Static164.aClass3_Sub6_Sub1_1.method291(local8.aClass3_Sub6_Sub2_2);
				local8.aClass3_Sub6_Sub2_2 = null;
			}
			if (local8.aClass3_Sub6_Sub2_3 != null) {
				Static164.aClass3_Sub6_Sub1_1.method291(local8.aClass3_Sub6_Sub2_3);
				local8.aClass3_Sub6_Sub2_3 = null;
			}
			local8.method7812();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class3_Sub17 local55 = (Class3_Sub17) Static312.aClass130_37.method3543(); local55 != null; local55 = (Class3_Sub17) Static312.aClass130_37.method3551()) {
			if (local55.aClass3_Sub6_Sub2_2 != null) {
				Static164.aClass3_Sub6_Sub1_1.method291(local55.aClass3_Sub6_Sub2_2);
				local55.aClass3_Sub6_Sub2_2 = null;
			}
			local55.method7812();
		}
		for (@Pc(84) Class3_Sub17 local84 = (Class3_Sub17) Static145.aClass310_11.method6602(); local84 != null; local84 = (Class3_Sub17) Static145.aClass310_11.method6599()) {
			if (local84.aClass3_Sub6_Sub2_2 != null) {
				Static164.aClass3_Sub6_Sub1_1.method291(local84.aClass3_Sub6_Sub2_2);
				local84.aClass3_Sub6_Sub2_2 = null;
			}
			local84.method7812();
		}
	}
}
