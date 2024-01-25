import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public static int anInt2701;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[Lclient!ms;")
	public static final Class136[] aClass136Array1 = new Class136[8];

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	public static final int[] anIntArray314 = new int[1000];

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_73 = new Class140(32);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public static void method2609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(7, arg1);
		local8.method168();
		local8.anInt85 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method2610(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(82) int local82;
			if (local41 >= '0' && local41 <= '9') {
				local82 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local82 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local82 = local41 - 'W';
			} else {
				return false;
			}
			if (local82 >= 10) {
				return false;
			}
			if (local26) {
				local82 = -local82;
			}
			@Pc(109) int local109 = local30 * 10 + local82;
			if (local30 != local109 / 10) {
				return false;
			}
			local28 = true;
			local30 = local109;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method2611() {
		@Pc(5) Class140 local5 = Static99.aClass140_56;
		synchronized (Static99.aClass140_56) {
			Static99.aClass140_56.method3813();
		}
		local5 = Static259.aClass140_131;
		synchronized (Static259.aClass140_131) {
			Static259.aClass140_131.method3813();
		}
		@Pc(35) Class33 local35 = Static234.aClass33_1;
		synchronized (Static234.aClass33_1) {
			Static234.aClass33_1.method1152();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method2613(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static199.anInt4059 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	public static void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(4, arg2);
		local8.method168();
		local8.anInt81 = arg1;
		local8.anInt75 = arg0;
		local8.anInt85 = arg3;
	}
}
