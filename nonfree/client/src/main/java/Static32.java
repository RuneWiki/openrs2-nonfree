import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	public static int anInt565 = 0;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
	public static int anInt567 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method509(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		@Pc(41) int local41 = arg0 / 10;
		while (local41 != 0) {
			local41 /= 10;
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(65) int local65 = local37 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 < 10) {
				local56[local65] = (char) (local80 + 48);
			} else {
				local56[local65] = (char) (local80 + 87);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method510() {
		@Pc(1) Class37 local1 = Static50.aClass37_24;
		synchronized (Static50.aClass37_24) {
			Static50.aClass37_24.method914();
		}
		local1 = Static203.aClass37_65;
		synchronized (Static203.aClass37_65) {
			Static203.aClass37_65.method914();
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!eb;I)V")
	public static void method511(@OriginalArg(0) Class7_Sub3 arg0) {
		arg0.aClass10_1 = null;
		@Pc(12) int local12 = arg0.aClass7_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass7_Sub6Array1[local14].aBoolean237 = false;
		}
		@Pc(32) Class122[] local32 = Class1_Sub2_Sub7.aClass122Array3;
		synchronized (Class1_Sub2_Sub7.aClass122Array3) {
			if (Class1_Sub2_Sub7.aClass122Array3.length > local12 && Static321.anIntArray644[local12] < 200) {
				Class1_Sub2_Sub7.aClass122Array3[local12].method2624(arg0);
				@Pc(55) int local55 = Static321.anIntArray644[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method512(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local47.append(Static251.aCharArray7[(int) (local54 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}
}
