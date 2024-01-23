import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!wn", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString376 = "Loading sprites - ";

	@OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
	public static int anInt6098 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public static void method4861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class4_Sub3_Sub9 local4 = Static43.method2329(5, arg0);
		local4.method1520();
		local4.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V")
	public static void method4862() {
		@Pc(7) int local7;
		@Pc(19) int local19;
		for (local7 = -1; local7 < Static129.anInt2510; local7++) {
			if (local7 == -1) {
				local19 = 2047;
			} else {
				local19 = Static172.anIntArray317[local7];
			}
			@Pc(29) Class53_Sub1_Sub1 local29 = Static182.aClass53_Sub1_Sub1Array1[local19];
			if (local29 != null && local29.anInt4023 > 0) {
				local29.anInt4023--;
				if (local29.anInt4023 == 0) {
					local29.aString234 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static236.anInt4452; local7++) {
			local19 = Static278.anIntArray595[local7];
			@Pc(68) Class53_Sub1_Sub2 local68 = Static110.aClass53_Sub1_Sub2Array1[local19];
			if (local68 != null && local68.anInt4023 > 0) {
				local68.anInt4023--;
				if (local68.anInt4023 == 0) {
					local68.aString234 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILclient!vc;JZ)V")
	public static void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class42 local6 = new Class42();
		local6.aClass53_2 = arg4;
		local6.anInt1129 = arg1 * 128 + 64;
		local6.anInt1128 = arg2 * 128 + 64;
		local6.anInt1130 = arg3;
		local6.aLong45 = arg5;
		local6.aBoolean63 = arg6;
		if (Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub19(arg0, arg1, arg2);
		}
		Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local6;
	}
}
