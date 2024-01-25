import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!us", name = "Pb", descriptor = "I")
	public static int anInt7193;

	@OriginalMember(owner = "client!us", name = "Qb", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!us", name = "Rb", descriptor = "F")
	public static float aFloat213;

	@OriginalMember(owner = "client!us", name = "Ib", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_180 = new Class81(91, 15);

	@OriginalMember(owner = "client!us", name = "Jb", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_147 = new Class256(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!us", name = "Mb", descriptor = "[I")
	public static final int[] anIntArray481 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!us", name = "Ob", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_181 = new Class81(69, 2);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)I")
	public static int method5576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 24;
		@Pc(33) int local33 = ((arg0 & 0xFF00) * local15 & 0xFF0000 | local15 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(37) int local37 = 255 - local15;
		return local33 + ((local37 * (arg1 & 0xFF00) & 0xFF0000 | local37 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
	public static void method5579() {
		for (@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) Static222.aClass265_32.method6005(); local10 != null; local10 = (Class2_Sub10) Static222.aClass265_32.method6001()) {
			if (local10.anInt1376 == -1) {
				local10.anInt1385 = 0;
				if (local10.anInt1383 >= 0 && local10.anInt1387 >= 0 && local10.anInt1383 < Static81.anInt1950 && local10.anInt1387 < Static171.anInt3288) {
					Static37.method712(local10);
				}
			} else {
				local10.method6072();
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method5585(@OriginalArg(1) Class26 arg0) {
		if (Static237.aBoolean384) {
			Static307.method4385(arg0);
		} else {
			Static237.method3736(arg0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	public static boolean method5589(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local46 >= '0' && local46 <= '9') {
				local86 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local86 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local86 = local46 - 'W';
			} else {
				return false;
			}
			if (local86 >= 10) {
				return false;
			}
			if (local26) {
				local86 = -local86;
			}
			@Pc(123) int local123 = local35 * 10 + local86;
			if (local123 / 10 != local35) {
				return false;
			}
			local33 = true;
			local35 = local123;
		}
		return local33;
	}
}
