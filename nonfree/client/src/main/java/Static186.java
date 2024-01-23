import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public static int anInt3936;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString197;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_7;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!ii;")
	public static Class79 aClass79_16 = new Class79(16);

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public static int anInt3934 = -1;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!ec;")
	public static Class46 aClass46_31 = new Class46(16);

	@OriginalMember(owner = "client!od", name = "p", descriptor = "I")
	public static int anInt3937 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public static int method3169(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(23) int local23 = local9 | local9 >>> 2;
		@Pc(33) int local33 = local23 | local23 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)[Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1[] method3171() {
		@Pc(13) Class2_Sub3_Sub1_Sub1[] local13 = new Class2_Sub3_Sub1_Sub1[Static27.anInt576];
		for (@Pc(15) int local15 = 0; local15 < Static27.anInt576; local15++) {
			@Pc(26) byte[] local26 = Static273.aByteArrayArray115[local15];
			@Pc(34) int local34 = Static30.anIntArray46[local15] * Static19.anIntArray30[local15];
			@Pc(37) int[] local37 = new int[local34];
			for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
				local37[local39] = Static187.anIntArray314[local26[local39] & 0xFF];
			}
			local13[local15] = new Class2_Sub3_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local15], Static40.anIntArray59[local15], Static30.anIntArray46[local15], Static19.anIntArray30[local15], local37);
		}
		Static171.method2953();
		return local13;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public static void method3172() {
		Static266.aClass46_36.method1068(5);
		Static266.aClass46_37.method1068(5);
		Static106.aClass46_15.method1068(5);
		Static73.aClass46_9.method1068(5);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
	public static void method3173(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub16 local6 = Static119.method2204(arg0, 11);
		local6.method2719();
	}
}
