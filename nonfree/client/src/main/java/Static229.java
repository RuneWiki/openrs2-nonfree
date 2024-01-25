import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!iba", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_3 = new Class188("", 15);

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
	public static int anInt4654 = 0;

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_48 = new Class269(14, -1);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BLclient!vk;)[Lclient!bk;")
	public static Class38[] method3859(@OriginalArg(1) Class359 arg0) {
		if (!arg0.method8272()) {
			return new Class38[0];
		}
		@Pc(14) Class26 local14 = arg0.method8265();
		while (local14.anInt762 == 0) {
			Static57.method1062(10L);
		}
		if (local14.anInt762 == 2) {
			return new Class38[0];
		}
		@Pc(37) int[] local37 = (int[]) local14.anObject3;
		@Pc(43) Class38[] local43 = new Class38[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(50) Class38 local50 = new Class38();
			local43[local45] = local50;
			local50.anInt978 = local37[local45 << 2];
			local50.anInt972 = local37[(local45 << 2) + 1];
			local50.anInt973 = local37[(local45 << 2) + 2];
			local50.anInt974 = local37[(local45 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)I")
	public static int method3861(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static244.anInt4841;
		if (local10 == 0) {
			return arg0 ? 0 : Static183.anInt4032;
		} else if (local10 == 1) {
			return Static183.anInt4032;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3862(@OriginalArg(1) String arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(17) char local17 = arg0.charAt(local12);
			if (local17 == '%' && local12 + 2 < local10) {
				local17 = arg0.charAt(local12 + 1);
				@Pc(64) int local64;
				if (local17 >= '0' && local17 <= '9') {
					local64 = local17 - 48;
				} else if (local17 >= 'a' && local17 <= 'f') {
					local64 = local17 + 10 - 97;
				} else {
					if (local17 < 'A' || local17 > 'F') {
						local7.append('%');
						continue;
					}
					local64 = local17 + '\n' - 65;
				}
				local17 = arg0.charAt(local12 + 2);
				local64 *= 16;
				if (local17 >= '0' && local17 <= '9') {
					local64 += local17 - 48;
				} else if (local17 >= 'a' && local17 <= 'f') {
					local64 += local17 + '\n' - 97;
				} else {
					if (local17 < 'A' || local17 > 'F') {
						local7.append('%');
						continue;
					}
					local64 += local17 + '\n' - 65;
				}
				local12 += 2;
				if (local64 != 0 && Static184.method3329((byte) local64)) {
					local7.append(Static448.method6635((byte) local64));
				}
			} else if (local17 == '+') {
				local7.append(' ');
			} else {
				local7.append(local17);
			}
		}
		return local7.toString();
	}
}
