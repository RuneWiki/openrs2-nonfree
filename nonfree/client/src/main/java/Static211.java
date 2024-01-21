import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt4194;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!jd;")
	public static Class2_Sub9_Sub3 aClass2_Sub9_Sub3_2;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_27;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1202 = Static181.method2795("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1199 = aClass83_1202;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1200 = Static181.method2795("document)3cookie=(R");

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1201 = Static181.method2795("::gc");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1203 = Static181.method2795("Welt");

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array58 = new Class83[200];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method3196() {
		Static195.aClass86_51.method2641();
		Static155.aClass86_43.method2641();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBII)V")
	public static void method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg3 < arg1) {
			for (local19 = arg3; local19 < arg1; local19++) {
				Static14.anIntArrayArray18[local19][arg0] = arg2;
			}
		} else {
			for (local19 = arg1; local19 < arg3; local19++) {
				Static14.anIntArrayArray18[local19][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BJ)V")
	public static void method3198(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static177.anInt3618; local17++) {
			if (Static139.aLongArray3[local17] == arg0) {
				Static177.anInt3618--;
				for (@Pc(35) int local35 = local17; local35 < Static177.anInt3618; local35++) {
					Static133.aClass83Array49[local35] = Static133.aClass83Array49[local35 + 1];
					Static10.anIntArray19[local35] = Static10.anIntArray19[local35 + 1];
					aClass83Array58[local35] = aClass83Array58[local35 + 1];
					Static139.aLongArray3[local35] = Static139.aLongArray3[local35 + 1];
					Static121.anIntArray274[local35] = Static121.anIntArray274[local35 + 1];
				}
				Static38.anInt976 = Static29.anInt739;
				Static69.aClass2_Sub3_Sub1_2.method284(71);
				Static69.aClass2_Sub3_Sub1_2.method249(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Lclient!nb;")
	public static Class2_Sub2_Sub17 method3199() {
		@Pc(13) int local13 = Static131.anIntArray284[0] * Static163.anIntArray314[0];
		@Pc(17) byte[] local17 = Static151.aByteArrayArray14[0];
		@Pc(25) int[] local25 = new int[local13];
		for (@Pc(27) int local27 = 0; local27 < local13; local27++) {
			local25[local27] = Static153.anIntArray317[local17[local27] & 0xFF];
		}
		@Pc(62) Class2_Sub2_Sub17_Sub1 local62 = new Class2_Sub2_Sub17_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[0], Static124.anIntArray251[0], Static163.anIntArray314[0], Static131.anIntArray284[0], local25);
		Static17.method372();
		return local62;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method3200(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static133.method2211(arg0)) {
			return;
		}
		@Pc(16) Class5[] local16 = Static175.aClass5ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(26) Class5 local26 = local16[local18];
			if (local26.anObjectArray16 != null) {
				@Pc(33) Class2_Sub4 local33 = new Class2_Sub4();
				local33.aClass5_3 = local26;
				local33.anObjectArray27 = local26.anObjectArray16;
				Static11.method290(local33, 2000000);
			}
		}
	}
}
