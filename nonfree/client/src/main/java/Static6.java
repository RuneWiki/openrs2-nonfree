import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt275;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!tc;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
	public static final int[] anIntArray4 = new int[1000];

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
	public static final int[] anIntArray5 = new int[64];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method277(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(52) char[] local52 = new char[local34];
		local52[0] = '+';
		for (@Pc(60) int local60 = local34 - 1; local60 > 0; local60--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local68 - arg0 * 10;
			if (local79 < 10) {
				local52[local60] = (char) (local79 + 48);
			} else {
				local52[local60] = (char) (local79 + 87);
			}
		}
		return new String(local52);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!wk;B)I")
	public static int method279(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		if (arg0.anInt7591 == 0) {
			return 0;
		}
		@Pc(64) int local64;
		@Pc(57) int local57;
		if (arg0.anInt7634 != -1) {
			@Pc(15) Class2_Sub2_Sub1 local15 = null;
			if (arg0.anInt7634 < 32768) {
				@Pc(29) Class3_Sub46 local29 = (Class3_Sub46) Static331.aClass25_25.method946((long) arg0.anInt7634);
				if (local29 != null) {
					local15 = local29.aClass2_Sub2_Sub1_Sub2_2;
				}
			} else if (arg0.anInt7634 >= 32768) {
				local15 = Static378.aClass2_Sub2_Sub1_Sub1Array10[arg0.anInt7634 - 32768];
			}
			if (local15 != null) {
				local57 = arg0.anInt9398 - local15.anInt9398;
				local64 = arg0.anInt9396 - local15.anInt9396;
				if (local57 != 0 || local64 != 0) {
					arg0.method6309((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class2_Sub2_Sub1_Sub1) {
			@Pc(90) Class2_Sub2_Sub1_Sub1 local90 = (Class2_Sub2_Sub1_Sub1) arg0;
			if (local90.anInt2218 != -1 && (local90.anInt7660 == 0 || local90.anInt7658 > 0)) {
				local90.method6309(local90.anInt2218);
				local90.anInt2218 = -1;
			}
		} else if (arg0 instanceof Class2_Sub2_Sub1_Sub2) {
			@Pc(119) Class2_Sub2_Sub1_Sub2 local119 = (Class2_Sub2_Sub1_Sub2) arg0;
			if (local119.anInt7680 != -1 && (local119.anInt7660 == 0 || local119.anInt7658 > 0)) {
				local57 = local119.anInt9398 - (local119.anInt7680 - Static230.anInt4667 - Static230.anInt4667) * 256;
				local64 = local119.anInt9396 - (local119.anInt7661 - Static563.anInt10006 - Static563.anInt10006) * 256;
				if (local57 != 0 || local64 != 0) {
					local119.method6309((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local119.anInt7680 = -1;
			}
		}
		return arg0.method6307();
	}
}
