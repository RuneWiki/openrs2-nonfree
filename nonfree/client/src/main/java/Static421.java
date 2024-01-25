import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_32 = new Class62(64);

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "[I")
	public static final int[] anIntArray447 = new int[5];

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[2];

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method6010() {
		for (@Pc(10) Class3_Sub32 local10 = (Class3_Sub32) Static497.aClass193_54.method4457(); local10 != null; local10 = (Class3_Sub32) Static497.aClass193_54.method4459()) {
			if (local10.aBoolean472) {
				local10.method5085();
			}
		}
		for (@Pc(35) Class3_Sub32 local35 = (Class3_Sub32) Static378.aClass193_33.method4457(); local35 != null; local35 = (Class3_Sub32) Static378.aClass193_33.method4459()) {
			if (local35.aBoolean472) {
				local35.method5085();
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZZI)V")
	public static void method6011(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class3_Sub44 local6 = Static17.method714();
		local6.aClass3_Sub17_Sub2_3.method4849(Static97.aClass326_7.anInt8904);
		local6.aClass3_Sub17_Sub2_3.method4876(0);
		@Pc(21) int local21 = local6.aClass3_Sub17_Sub2_3.lb;
		local6.aClass3_Sub17_Sub2_3.method4876(642);
		@Pc(30) int[] local30 = Static419.method5981(local6);
		@Pc(34) int local34 = local6.aClass3_Sub17_Sub2_3.lb;
		local6.aClass3_Sub17_Sub2_3.method4878(arg0);
		local6.aClass3_Sub17_Sub2_3.method4876(Static88.anInt1933);
		local6.aClass3_Sub17_Sub2_3.method4878(arg1);
		local6.aClass3_Sub17_Sub2_3.method4889(Static450.aLong222);
		local6.aClass3_Sub17_Sub2_3.method4849(Static319.anInt5939);
		local6.aClass3_Sub17_Sub2_3.method4849(Static102.aClass181_38.anInt4848);
		Static476.method6822(local6.aClass3_Sub17_Sub2_3);
		@Pc(71) String local71 = Static637.aString125;
		local6.aClass3_Sub17_Sub2_3.method4849(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass3_Sub17_Sub2_3.method4878(local71);
		}
		local6.aClass3_Sub17_Sub2_3.method4849(arg3);
		local6.aClass3_Sub17_Sub2_3.method4849(arg2 ? 1 : 0);
		local6.aClass3_Sub17_Sub2_3.lb += 7;
		local6.aClass3_Sub17_Sub2_3.method4863(local34, local6.aClass3_Sub17_Sub2_3.lb, local30);
		local6.aClass3_Sub17_Sub2_3.method4855(local6.aClass3_Sub17_Sub2_3.lb - local21);
		Static616.method8089(local6);
		Static99.anInt2127 = 0;
		Static111.anInt10350 = 1;
		Static30.anInt915 = 0;
		Static312.anInt5782 = -3;
		if (arg3 < 13) {
			Static515.aBoolean648 = true;
			Static679.method8756();
		}
	}
}
