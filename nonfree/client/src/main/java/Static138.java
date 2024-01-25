import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	public static int anInt2969 = 0;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Lclient!il;")
	public static final Class93 aClass93_12 = new Class93(2, 4);

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	public static int anInt2972 = 0;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	public static int anInt2974 = 0;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_11 = new Class38(8);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BZ)V")
	public static void method2789(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static269.aClass1_Sub4_Sub15_2 != null) {
			Static175.anInt3664 = Static269.aClass1_Sub4_Sub15_2.anInt3236;
		} else {
			Static175.anInt3664 = -1;
		}
		Static135.aClass112_10 = null;
		Static269.aClass1_Sub4_Sub15_2 = null;
		Static164.aClass42_22 = null;
		Static141.anInt3042 = 0;
		Static269.method3060();
		Static269.aClass42_21.method1542();
		Static21.aClass174_3 = null;
		Static69.aClass174_6 = null;
		Static230.aClass174_8 = null;
		Static269.aClass86_3 = null;
		Static286.anInt5852 = -1;
		Static164.aClass174_9 = null;
		Static53.aClass4_5 = null;
		Static286.aClass174_11 = null;
		Static253.anInt5163 = -1;
		Static175.aClass174_10 = null;
		Static331.aClass174_12 = null;
		Static21.aClass174_4 = null;
		Static330.method5568();
		Static312.method5405(64, 128);
		Static152.method2914(64, 64);
		Static245.method4673(64);
		Static134.method2731(64);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method2790() {
		@Pc(13) String local13 = "www";
		if (Static195.anInt3950 != 0) {
			local13 = "www-wtqa";
		}
		@Pc(19) String local19 = "";
		if (Static220.aString43 != null) {
			local19 = "/p=" + Static220.aString43;
		}
		return "http://" + local13 + "." + Static285.aClass81_4.aString20 + ".com/l=" + Static254.anInt5172 + "/a=" + Static180.anInt3698 + local19 + "/";
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!bf;")
	public static Class11_Sub2 method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class187 local14 = local7.aClass187_2; local14 != null; local14 = local14.aClass187_3) {
			@Pc(18) Class11_Sub2 local18 = local14.aClass11_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort94 == arg1 && local18.aShort93 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Z")
	public static boolean method2792() {
		try {
			return Static313.method5418();
		} catch (@Pc(14) IOException local14) {
			Static228.method4268();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static293.aClass217_165 == null ? -1 : Static293.aClass217_165.method5768()) + "," + (Static341.aClass217_202 == null ? -1 : Static341.aClass217_202.method5768()) + "," + (Static197.aClass217_134 == null ? -1 : Static197.aClass217_134.method5768()) + " - " + Static366.anInt7026 + "," + (Static50.anInt1271 + Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0]) + "," + (Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0] + Static299.anInt4036) + " - ";
			for (@Pc(80) int local80 = 0; local80 < Static366.anInt7026 && local80 < 50; local80++) {
				local78 = local78 + Static180.aClass1_Sub7_Sub2_2.aByteArray41[local80] + ",";
			}
			Static119.method2541(local78, local19);
			Static294.method5141();
			return true;
		}
	}
}
