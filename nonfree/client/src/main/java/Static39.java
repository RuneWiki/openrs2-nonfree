import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
	public static int anInt1157;

	@OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
	public static int anInt1153 = 0;

	@OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
	public static int anInt1160 = -2;

	@OriginalMember(owner = "client!bda", name = "P", descriptor = "Lclient!fja;")
	public static Class126 aClass126_16 = null;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!kh;B)Lclient!kh;")
	public static Class208 method1159(@OriginalArg(0) Class208 arg0) {
		if (arg0.anInt5634 != -1) {
			return Static676.method8728(arg0.anInt5634);
		}
		@Pc(27) int local27 = arg0.anInt5653 >>> 16;
		@Pc(32) Class68 local32 = new Class68(Static222.aClass62_21);
		for (@Pc(37) Class3_Sub28 local37 = (Class3_Sub28) local32.method1844(); local37 != null; local37 = (Class3_Sub28) local32.method1845()) {
			if (local27 == local37.anInt5252) {
				return Static676.method8728((int) local37.aLong309);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIB)V")
	public static void method1162(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub20 local16 = arg0 ? Static430.aClass3_Sub20_3 : Static656.aClass3_Sub20_2;
		if (local16 == null || arg1 < 0 || arg1 >= local16.anInt3447) {
			return;
		}
		@Pc(37) Class170 local37 = local16.aClass170Array1[arg1];
		if (local37.aByte66 != -1) {
			return;
		}
		@Pc(46) String local46 = local37.aString55;
		@Pc(51) Class3_Sub44 local51 = Static275.method5689(Static591.aClass376_135, Static540.aClass282_4);
		local51.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(local46) + 3);
		local51.aClass3_Sub17_Sub2_3.method4849(arg0 ? 1 : 0);
		local51.aClass3_Sub17_Sub2_3.method4876(arg1);
		local51.aClass3_Sub17_Sub2_3.method4878(local46);
		Static616.method8089(local51);
	}
}
