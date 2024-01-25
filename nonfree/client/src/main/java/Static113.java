import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public static int anInt5757;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	public static int anInt5756 = 1;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!ub;")
	public static final Class234 aClass234_4 = new Class234("WIP", 2);

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public static int anInt5764 = 64;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
	public static final int[] anIntArray456 = new int[2];

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
	public static int anInt5770 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZJII)Ljava/lang/String;")
	public static String method4625(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg2 == 0) {
			local14 = ',';
			local12 = '.';
		}
		if (arg2 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local29 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg3 > 0) {
			for (local50 = 0; local50 < arg3; local50++) {
				local55 = (int) arg1;
				arg1 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg1 * 10));
			}
			local43.append(local12);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg1;
			arg1 /= 10L;
			local43.append((char) (local55 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local29) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg0) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
	public static void method4626() {
		for (@Pc(6) Class39_Sub5 local6 = (Class39_Sub5) Static47.aClass188_1.method4536(); local6 != null; local6 = (Class39_Sub5) Static47.aClass188_1.method4536()) {
			Static415.method5604(local6);
		}
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (Static389.aClass128_Sub1_1.method2984(Static285.anInt7839)) {
			local33 = 3;
			local35 = 0;
		} else {
			local33 = Static424.anInt7348;
			local35 = Static424.anInt7348;
		}
		Static53.method928();
		for (@Pc(44) int local44 = local35; local44 <= local33; local44++) {
			Static53.method917();
			Static53.method921(local44);
			Static53.method927(local44);
		}
		Static53.method920();
		Static53.method929();
	}
}
