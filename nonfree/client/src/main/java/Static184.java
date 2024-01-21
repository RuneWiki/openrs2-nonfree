import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_37;

	@OriginalMember(owner = "client!th", name = "db", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_139;

	@OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
	public static int anInt4126;

	@OriginalMember(owner = "client!th", name = "W", descriptor = "Lclient!vh;")
	public static final Class1_Sub26 aClass1_Sub26_1 = new Class1_Sub26(0, 0);

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "[Lclient!og;")
	public static final Class75[] aClass75Array1 = new Class75[50];

	@OriginalMember(owner = "client!th", name = "cb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1187 = Static81.method1507("Sprites geladen)3");

	@OriginalMember(owner = "client!th", name = "gb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!th", name = "hb", descriptor = "I")
	public static int anInt4128 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([Lclient!dj;[SB)V")
	public static void method3194(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) short[] arg1) {
		Static163.method2734(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)I")
	public static int method3195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local12;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILclient!wd;JZ)V")
	public static void method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class96 local6 = new Class96();
		local6.aClass5_11 = arg4;
		local6.anInt4314 = arg1 * 128 + 64;
		local6.anInt4320 = arg2 * 128 + 64;
		local6.anInt4313 = arg3;
		local6.aLong137 = arg5;
		if (Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub8(arg0, arg1, arg2);
		}
		Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass96_1 = local6;
	}
}
