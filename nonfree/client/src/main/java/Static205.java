import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
	public static boolean aBoolean420;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public static void method5709() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static103.aBooleanArray18[local11] = true;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class6_Sub2_Sub10 method5713(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub10 local10 = (Class6_Sub2_Sub10) Static122.aClass31_7.method634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static83.aClass53_41.method1033(arg0, 19);
		local10 = new Class6_Sub2_Sub10();
		if (local20 != null) {
			local10.method3368(new Class6_Sub10(local20));
		}
		Static122.aClass31_7.method632((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lclient!rr;")
	public static Class6_Sub35 method5716() {
		if (Static307.aClass211_7 == null || Static92.aClass4_1 == null) {
			return null;
		}
		for (@Pc(16) Class6_Sub35 local16 = (Class6_Sub35) Static92.aClass4_1.method49(); local16 != null; local16 = (Class6_Sub35) Static92.aClass4_1.method49()) {
			@Pc(23) Class165 local23 = Static345.method5701(local16.anInt5312);
			if (local23 != null && local23.aBoolean332 && local23.method4325()) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5718(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static129.method2532(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static129.method2532(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(50) int local50 = local14 - local11;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local50);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static84.method1401(local75)) {
				@Pc(83) char local83 = Static119.method2415(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(II)V")
	public static void method5722(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(1, arg0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)I")
	public static int method5725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static286.anIntArray580[arg0 & 0x3] : 256;
	}
}
