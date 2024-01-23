import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Lclient!ah;")
	public static Class6 aClass6_12;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!ai;")
	public static Class7 aClass7_26;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_993 = Static200.method3116("Die Verbindung konnte");

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
	public static int[] anIntArray373 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_994 = Static200.method3116(")3");

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
	public static int[] anIntArray374 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_995 = Static200.method3116("sl_flags");

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_996 = Static200.method3116("cross");

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
	public static void method2214(@OriginalArg(1) int arg0) {
		Static138.anInt3087 = arg0;
		Static32.anInt816 = -1;
		Static188.anInt4036 = -1;
		Static129.method898();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ai;I)V")
	public static void method2215(@OriginalArg(0) Class7 arg0) {
		Static196.aClass7_36 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z[Lclient!kh;)[Lclient!kh;")
	public static Class60[] method2216(@OriginalArg(1) Class60[] arg0) {
		@Pc(4) Class60[] local4 = new Class60[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local4[local10] = Static34.method611(new Class60[] { Static40.method681(local10), Static3.aClass60_34 });
			if (arg0 != null && arg0[local10] != null) {
				local4[local10] = Static34.method611(new Class60[] { local4[local10], arg0[local10] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method2218(@OriginalArg(0) int arg0) {
		Static164.anInt3599 = arg0;
		Static216.anInt4616 = 50;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)J")
	public static long method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass106_1 == null ? 0L : local7.aClass106_1.aLong141;
	}
}
