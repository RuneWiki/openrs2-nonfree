import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
	public static int anInt7422;

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "Lclient!saa;")
	public static final Class327 aClass327_3 = new Class327();

	@OriginalMember(owner = "client!nha", name = "o", descriptor = "[I")
	public static final int[] anIntArray356 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nha", name = "u", descriptor = "Lclient!in;")
	public static final Class169 aClass169_184 = new Class169(22, -2);

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method6607(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub1 arg0) {
		@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) Static555.aClass335_42.method8357((long) arg0.anInt3977);
		if (local11 == null) {
			Static225.method4155((Class15_Sub3_Sub3_Sub1_Sub2) null, arg0, 0, arg0.anIntArray188[0], (Class331) null, arg0.aByte142, arg0.anIntArray189[0]);
		} else {
			local11.method1170();
		}
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V")
	public static void method6609() {
		if (Static316.anInt5770 == 5) {
			Static316.anInt5770 = 6;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)I")
	public static int method6612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg1 < arg0) {
			local10 = arg1;
			arg1 = arg0;
			arg0 = local10;
		}
		while (arg0 != 0) {
			local10 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local10;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(III)Z")
	public static boolean method6613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IZI)Lclient!uh;")
	public static Class15_Sub9 method6614(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class60[] local7 = Class2_Sub15_Sub7_Sub1.aClass60Array1;
		synchronized (Class2_Sub15_Sub7_Sub1.aClass60Array1) {
			@Pc(34) Class15_Sub9 local34;
			if (arg0 >= Class2_Sub15_Sub7_Sub1.aClass60Array1.length || Class2_Sub15_Sub7_Sub1.aClass60Array1[arg0].method1550()) {
				local34 = new Class15_Sub9();
				local34.aClass15_Sub6Array1 = new Class15_Sub6[arg0];
				for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
					local34.aClass15_Sub6Array1[local56] = new Class15_Sub6();
				}
			} else {
				local34 = (Class15_Sub9) Class2_Sub15_Sub7_Sub1.aClass60Array1[arg0].method1545();
				local34.method9741();
				@Pc(41) int local41 = Static490.anIntArray442[arg0]--;
			}
			local34.aBoolean770 = arg1;
			return local34;
		}
	}
}
