import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_90 = new Class129(82, 5);

	@OriginalMember(owner = "client!ko", name = "Y", descriptor = "Lclient!d;")
	public static final Class44 aClass44_33 = new Class44(50);

	@OriginalMember(owner = "client!ko", name = "Z", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!ko", name = "cb", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
	public static String method2921(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg3 == 0) {
			local14 = ',';
			local12 = '.';
		}
		if (arg3 == 2) {
			local14 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg2 < 0L) {
			local27 = true;
			arg2 = -arg2;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg0 > 0) {
			for (local48 = 0; local48 < arg0; local48++) {
				local53 = (int) arg2;
				arg2 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg2 * 10));
			}
			local41.append(local12);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg2;
			arg2 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local27) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg1) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lclient!sg;")
	public static Class88_Sub5 method2922() {
		@Pc(15) Class88_Sub5 local15 = (Class88_Sub5) Static45.aClass107_2.method2323();
		if (local15 == null) {
			return new Class88_Sub5();
		} else {
			Static231.anInt3827--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!fi;IBI)V")
	public static void method2928(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static423.aBoolean478) {
			@Pc(26) Class166 local26 = Static154.anInt6464 == -1 ? null : Static1.aClass33_3.method788(Static154.anInt6464);
			if (Static55.method885(arg0).method5386() && (Static277.anInt4336 & 0x20) != 0) {
				if (local26 == null || arg0.method1690(local26.anInt4273, Static154.anInt6464) != local26.anInt4273) {
					Static450.method5939(0L, arg0.anInt2057, arg0.anInt2115, true, 25, Static240.aString73, Static360.anInt5869, false, arg0.anInt2100, Static21.aString3 + " -> " + arg0.aString17);
				}
				return;
			}
			return;
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static335.method4339(local78, arg0);
			if (local85 != null) {
				Static450.method5939((long) (local78 + 1), arg0.anInt2057, arg0.anInt2115, true, 1008, local85, Static197.method2625(arg0, local78), false, arg0.anInt2100, arg0.aString17);
			}
		}
		local85 = Static184.method2504(arg0);
		if (local85 != null) {
			Static450.method5939(0L, arg0.anInt2057, arg0.anInt2115, true, 2, local85, arg0.anInt2121, false, arg0.anInt2100, arg0.aString17);
		}
		for (@Pc(148) int local148 = 4; local148 >= 0; local148--) {
			@Pc(155) String local155 = Static335.method4339(local148, arg0);
			if (local155 != null) {
				Static450.method5939((long) (local148 + 1), arg0.anInt2057, arg0.anInt2115, true, 23, local155, Static197.method2625(arg0, local148), false, arg0.anInt2100, arg0.aString17);
			}
		}
		if (!Static55.method885(arg0).method5382()) {
			return;
		}
		if (arg0.aString20 != null) {
			Static450.method5939(0L, arg0.anInt2057, arg0.anInt2115, true, 47, arg0.aString20, -1, false, arg0.anInt2100, "");
			return;
		}
		Static450.method5939(0L, arg0.anInt2057, arg0.anInt2115, true, 47, Static335.aClass198_99.method4012(Static38.anInt4834), -1, false, arg0.anInt2100, "");
	}
}
