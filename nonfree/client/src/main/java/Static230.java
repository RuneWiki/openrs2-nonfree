import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array11;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!co;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	public static int anInt3922 = 0;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Z")
	public static boolean method3352() {
		try {
			return Static25.method468();
		} catch (@Pc(14) IOException local14) {
			Static234.method3419();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(79) String local79 = "T2 - " + (Static167.aClass136_81 == null ? -1 : Static167.aClass136_81.method3269()) + "," + (Static237.aClass136_117 == null ? -1 : Static237.aClass136_117.method3269()) + "," + (Static46.aClass136_17 == null ? -1 : Static46.aClass136_17.method3269()) + " - " + Static102.anInt1839 + "," + (Static59.anInt1127 + Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0]) + "," + (Static49.anInt873 + Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0]) + " - ";
			for (@Pc(81) int local81 = 0; Static102.anInt1839 > local81 && local81 < 50; local81++) {
				local79 = local79 + Static176.aClass3_Sub25_Sub1_1.aByteArray88[local81] + ",";
			}
			Static120.method1926(local79, local19);
			Static168.method2583(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IJIZI)Ljava/lang/String;")
	public static String method3353(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(13) char local13 = ',';
		@Pc(15) char local15 = '.';
		if (arg2 == 0) {
			local13 = '.';
			local15 = ',';
		}
		if (arg2 == 2) {
			local15 = ' ';
		}
		@Pc(31) boolean local31 = false;
		if (arg1 < 0L) {
			local31 = true;
			arg1 = -arg1;
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg0 > 0) {
			for (local52 = 0; local52 < arg0; local52++) {
				local57 = (int) arg1;
				arg1 /= 10L;
				local45.append((char) (local57 + 48 - (int) arg1 * 10));
			}
			local45.append(local13);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg1;
			arg1 /= 10L;
			local45.append((char) (local57 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local31) {
					local45.append('-');
				}
				return local45.reverse().toString();
			}
			if (arg3) {
				local52++;
				if (local52 % 3 == 0) {
					local45.append(local15);
				}
			}
		}
	}
}
