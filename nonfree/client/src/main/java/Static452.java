import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_50 = new Class124();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Z")
	public static boolean method6398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static512.anInt8808; local1++) {
			@Pc(6) Class125 local6 = Static215.aClass125Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3705 == 1) {
				local15 = local6.anInt3696 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3693 + (local6.anInt3703 * local15 >> 8);
					local37 = local6.anInt3706 + (local6.anInt3699 * local15 >> 8);
					local47 = local6.anInt3707 + (local6.anInt3710 * local15 >> 8);
					local57 = local6.anInt3704 + (local6.anInt3697 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3705 == 2) {
				local15 = arg0 - local6.anInt3696;
				if (local15 > 0) {
					local27 = local6.anInt3693 + (local6.anInt3703 * local15 >> 8);
					local37 = local6.anInt3706 + (local6.anInt3699 * local15 >> 8);
					local47 = local6.anInt3707 + (local6.anInt3710 * local15 >> 8);
					local57 = local6.anInt3704 + (local6.anInt3697 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3705 == 3) {
				local15 = local6.anInt3693 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3696 + (local6.anInt3709 * local15 >> 8);
					local37 = local6.anInt3701 + (local6.anInt3700 * local15 >> 8);
					local47 = local6.anInt3707 + (local6.anInt3710 * local15 >> 8);
					local57 = local6.anInt3704 + (local6.anInt3697 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3705 == 4) {
				local15 = arg2 - local6.anInt3693;
				if (local15 > 0) {
					local27 = local6.anInt3696 + (local6.anInt3709 * local15 >> 8);
					local37 = local6.anInt3701 + (local6.anInt3700 * local15 >> 8);
					local47 = local6.anInt3707 + (local6.anInt3710 * local15 >> 8);
					local57 = local6.anInt3704 + (local6.anInt3697 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3705 == 5) {
				local15 = arg1 - local6.anInt3707;
				if (local15 > 0) {
					local27 = local6.anInt3696 + (local6.anInt3709 * local15 >> 8);
					local37 = local6.anInt3701 + (local6.anInt3700 * local15 >> 8);
					local47 = local6.anInt3693 + (local6.anInt3703 * local15 >> 8);
					local57 = local6.anInt3706 + (local6.anInt3699 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	public static void method6399() {
		Static423.aClass13_30 = null;
		Static331.aClass13_18 = null;
		Static551.aClass13_36 = null;
		Static545.aClass13_34 = null;
		Static487.aClass13_20 = null;
		Static367.aClass13Array24 = null;
		Static18.aClass13_6 = null;
		Static267.aClass13_17 = null;
		Static32.aClass13_3 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!eh;B)Lclient!lr;")
	public static Class214 method6400(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(15) int local15 = arg0.method5982();
		return new Class214(local15);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
	public static void method6401(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static249.anInt4945 != -1) {
				Static540.method7504(Static249.anInt4945);
			}
			for (@Pc(19) Class4_Sub49 local19 = (Class4_Sub49) Static543.aClass183_39.method4286(); local19 != null; local19 = (Class4_Sub49) Static543.aClass183_39.method4283()) {
				if (!local19.method8014()) {
					local19 = (Class4_Sub49) Static543.aClass183_39.method4286();
					if (local19 == null) {
						break;
					}
				}
				Static597.method8029(local19, false, true);
			}
			Static249.anInt4945 = -1;
			Static543.aClass183_39 = new Class183(8);
			Static426.method6089();
			Static249.anInt4945 = Static228.anInt4681;
			Static435.method6179(false);
			Static39.method670();
			Static205.method3638(Static249.anInt4945);
		}
		Static321.aString71 = "";
		Static39.aString11 = "";
		Static570.aBoolean672 = false;
		Static307.method4758();
		Static485.anInt8162 = -1;
		Static436.method6199(Static514.anInt8838);
		Static129.aClass10_Sub1_Sub2_Sub2_1 = new Class10_Sub1_Sub2_Sub2();
		Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 = Static38.anInt740 * 512 / 2;
		Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 = Static38.anInt741 * 512 / 2;
		Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] = Static38.anInt740 / 2;
		Static563.anInt9436 = 0;
		Static473.anInt7978 = 0;
		Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] = Static38.anInt741 / 2;
		if (Static555.anInt9335 == 2) {
			Static473.anInt7978 = Static209.anInt9659 << 9;
			Static563.anInt9436 = Static12.anInt226 << 9;
		} else {
			Static548.method7572();
		}
		Static114.method2345();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZB)V")
	public static void method6402(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static266.anInt5139++;
			Static306.method4732();
		}
		if (arg1) {
			Static486.anInt8197++;
			Static562.method7747();
		}
	}
}
