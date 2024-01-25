import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!u", name = "q", descriptor = "[[[Lclient!sq;")
	public static Class194[][][] aClass194ArrayArrayArray3;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public static int anInt6076 = 0;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[Lclient!bg;")
	public static final Class1_Sub8[] aClass1_Sub8Array1 = new Class1_Sub8[2048];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method5179() {
		Static312.aClass87_39.method2477();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(CB)Z")
	public static boolean method5181(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static107.method2332(arg0)) {
			return true;
		} else {
			@Pc(25) char[] local25 = Static23.aCharArray1;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(33) char local33 = local25[local27];
				if (arg0 == local33) {
					return true;
				}
			}
			@Pc(49) char[] local49 = Static161.aCharArray5;
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				@Pc(57) char local57 = local49[local51];
				if (arg0 == local57) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ki;B)I")
	public static int method5182(@OriginalArg(0) Class17_Sub1_Sub1 arg0) {
		if (arg0.anInt4848 == 0) {
			return 0;
		}
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (arg0.anInt4829 != -1 && arg0.anInt4829 < 32768) {
			@Pc(21) Class17_Sub1_Sub1_Sub2 local21 = Static140.aClass17_Sub1_Sub1_Sub2Array1[arg0.anInt4829];
			if (local21 != null) {
				local30 = arg0.anInt5109 - local21.anInt5109;
				local37 = arg0.anInt5108 - local21.anInt5108;
				if (local30 != 0 || local37 != 0) {
					arg0.method4320((int) (Math.atan2((double) local30, (double) local37) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(68) int local68;
		if (arg0.anInt4829 >= 32768) {
			local68 = arg0.anInt4829 - 32768;
			if (Static16.anInt527 == local68) {
				local68 = 2047;
			}
			@Pc(77) Class17_Sub1_Sub1_Sub1 local77 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local68];
			if (local77 != null) {
				local37 = arg0.anInt5109 - local77.anInt5109;
				@Pc(93) int local93 = arg0.anInt5108 - local77.anInt5108;
				if (local37 != 0 || local93 != 0) {
					arg0.method4320((int) (Math.atan2((double) local37, (double) local93) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt4859 != 0 || arg0.anInt4820 != 0) && (arg0.anInt4893 == 0 || arg0.anInt4887 > 0)) {
			local68 = arg0.anInt5109 - (arg0.anInt4859 - Static234.anInt4783 - Static234.anInt4783) * 64;
			local30 = arg0.anInt5108 - (arg0.anInt4820 - Static32.anInt2224 - Static32.anInt2224) * 64;
			if (local68 != 0 || local30 != 0) {
				arg0.method4320((int) (Math.atan2((double) local68, (double) local30) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt4820 = 0;
			arg0.anInt4859 = 0;
		}
		return arg0.method4316();
	}
}
