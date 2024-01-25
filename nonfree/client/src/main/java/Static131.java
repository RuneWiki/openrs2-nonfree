import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
	public static int anInt10156;

	@OriginalMember(owner = "client!eia", name = "F", descriptor = "I")
	public static int anInt10171;

	@OriginalMember(owner = "client!eia", name = "u", descriptor = "[J")
	public static final long[] aLongArray55 = new long[100];

	@OriginalMember(owner = "client!eia", name = "D", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_355 = new Class288(106, -1);

	@OriginalMember(owner = "client!eia", name = "E", descriptor = "I")
	public static int anInt10170 = 0;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public static void method8459() {
		for (@Pc(6) Class2_Sub2_Sub12 local6 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local6 != null; local6 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
			if (local6.anInt4924 > 1) {
				local6.anInt4924 = 0;
				Static446.aClass32_79.method629(local6, ((Class2_Sub2_Sub11) local6.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67).aLong123);
				local6.aClass75_9.method1567();
			}
		}
		Static121.anInt2166 = 0;
		Static474.anInt7600 = 0;
		Static115.aClass109_11.method2329();
		Static257.aClass118_25.method2599();
		Static453.aClass75_10.method1567();
		Static421.method5620(Static416.aClass2_Sub2_Sub11_1);
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(III)V")
	public static void method8466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 1);
		local8.method662();
		local8.anInt823 = arg1;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[BIZ)Ljava/lang/String;")
	public static String method8468(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg1[arg0 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(42) char local42 = Static158.aCharArray2[local28 - 128];
					if (local42 == '\u0000') {
						local42 = '?';
					}
					local28 = local42;
				}
				local8[local15++] = (char) local28;
			}
		}
		return new String(local8, 0, local15);
	}
}
