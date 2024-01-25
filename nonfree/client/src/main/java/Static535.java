import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
	public static int anInt9237;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
	public static int anInt9239;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
	public static int anInt9235 = 0;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
	public static int anInt9236 = 1;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method7639(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static641.anInt10703 >= 100) {
			Static271.method3957(Static514.aClass303_41.method7473(Static232.anInt4258));
			return;
		}
		@Pc(33) String local33 = Static566.method8154(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(77) String local77;
		for (@Pc(38) int local38 = 0; local38 < Static641.anInt10703; local38++) {
			@Pc(46) String local46 = Static566.method8154(Static304.aStringArray17[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static271.method3957(arg0 + Static514.aClass303_42.method7473(Static232.anInt4258));
				return;
			}
			if (Static543.aStringArray34[local38] != null) {
				local77 = Static566.method8154(Static543.aStringArray34[local38]);
				if (local77 != null && local77.equals(local33)) {
					Static271.method3957(arg0 + Static514.aClass303_42.method7473(Static232.anInt4258));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static592.anInt1870; local108++) {
			local77 = Static566.method8154(Static369.aStringArray24[local108]);
			if (local77 != null && local77.equals(local33)) {
				Static271.method3957(Static514.aClass303_47.method7473(Static232.anInt4258) + arg0 + Static514.aClass303_48.method7473(Static232.anInt4258));
				return;
			}
			if (Static570.aStringArray37[local108] != null) {
				@Pc(152) String local152 = Static566.method8154(Static570.aStringArray37[local108]);
				if (local152 != null && local152.equals(local33)) {
					Static271.method3957(Static514.aClass303_47.method7473(Static232.anInt4258) + arg0 + Static514.aClass303_48.method7473(Static232.anInt4258));
					return;
				}
			}
		}
		if (Static566.method8154(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35).equals(local33)) {
			Static271.method3957(Static514.aClass303_44.method7473(Static232.anInt4258));
			return;
		}
		@Pc(210) Class14_Sub19 local210 = Static286.method4081(Static205.aClass394_1, Static44.aClass100_18);
		local210.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg0) + 1);
		local210.aClass14_Sub29_Sub1_1.method5855(arg0);
		local210.aClass14_Sub29_Sub1_1.method5854(arg1 ? 1 : 0);
		Static576.method8234(local210);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "([IBLclient!qfa;II[I)Lclient!un;")
	public static Class1_Sub3 method7640(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class137_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg2 * arg3];
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg4[local17] + arg3 * local17;
			for (@Pc(29) int local29 = 0; local29 < arg0[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class1_Sub3(arg1, arg3, arg2, local15);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z")
	public static boolean method7641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
