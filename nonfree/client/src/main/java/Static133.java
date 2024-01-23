import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Lclient!pk;")
	public static Class132 aClass132_46;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!pk;")
	public static Class132 aClass132_47;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
	public static int anInt2697 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(CI)Z")
	public static boolean method2169(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) int local29 = 0;
			@Pc(31) char[] local31 = Static200.aCharArray4;
			while (local31.length > local29) {
				@Pc(43) char local43 = local31[local29];
				if (local43 == arg0) {
					return true;
				}
				local29++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method2170() {
		Static190.aClass61_33.method1381(5);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIJ)Ljava/lang/String;")
	public static String method2172(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		@Pc(11) boolean local11 = false;
		if (arg3 < 0L) {
			local11 = true;
			arg3 = -arg3;
		}
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (arg1 > 0) {
			for (local48 = 0; local48 < arg1; local48++) {
				local58 = (int) arg3;
				arg3 /= 10L;
				local40.append((char) (local58 + 48 - (int) arg3 * 10));
			}
			local40.append(local7);
		}
		local48 = 0;
		while (true) {
			local58 = (int) arg3;
			arg3 /= 10L;
			local40.append((char) (local58 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local11) {
					local40.append('-');
				}
				return local40.reverse().toString();
			}
			if (arg0) {
				local48++;
				if (local48 % 3 == 0) {
					local40.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V")
	public static void method2173() {
		Static129.method2080();
		Static246.anInterface5Array1 = new Interface5[9];
		Static246.anInterface5Array1[1] = new Class162();
		Static246.anInterface5Array1[2] = new Class150();
		Static246.anInterface5Array1[3] = new Class85();
		Static246.anInterface5Array1[4] = new Class169();
		Static246.anInterface5Array1[5] = new Class64();
		Static246.anInterface5Array1[6] = new Class181();
		Static246.anInterface5Array1[7] = new Class115();
	}
}
