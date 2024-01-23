import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!dh;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt1150;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Lclient!rn;")
	public static Class155 aClass155_30;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "[[Lclient!mi;")
	public static Class3_Sub21[][] aClass3_Sub21ArrayArray2;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString50 = null;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method976(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static146.aClass3_Sub25ArrayArrayArray7 = Static291.aClass3_Sub25ArrayArrayArray6;
			Static256.anIntArrayArrayArray14 = Static22.anIntArrayArrayArray1;
			Static44.aClass3_Sub21ArrayArray1 = Static282.aClass3_Sub21ArrayArray3;
		} else {
			Static146.aClass3_Sub25ArrayArrayArray7 = Static92.aClass3_Sub25ArrayArrayArray3;
			Static256.anIntArrayArrayArray14 = Static258.anIntArrayArrayArray15;
			Static44.aClass3_Sub21ArrayArray1 = aClass3_Sub21ArrayArray2;
		}
		Static158.anInt2948 = Static146.aClass3_Sub25ArrayArrayArray7.length;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)V")
	public static void method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class3_Sub4_Sub7 local16 = Static34.method528(arg1, 4);
		local16.method971();
		local16.anInt1132 = arg0;
		local16.anInt1136 = arg3;
		local16.anInt1140 = arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Lclient!bl;")
	public static Class19 method984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class19 local14 = local7.aClass19_1;
			local7.aClass19_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z[Ljava/lang/Object;[J)V")
	public static void method985(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static36.method541(arg0, 0, arg1, arg1.length - 1);
	}
}
