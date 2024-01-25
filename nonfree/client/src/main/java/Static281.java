import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "Lclient!w;")
	public static Class3_Sub7_Sub16 aClass3_Sub7_Sub16_3;

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
	public static int anInt4933 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)I")
	public static int method4457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static50.method932(arg1 - 1, arg0 + -1) + Static50.method932(arg1 - 1, arg0 - -1) + Static50.method932(arg1 + 1, arg0 + -1) + Static50.method932(arg1 + 1, arg0 + 1);
		@Pc(74) int local74 = Static50.method932(arg1, arg0 - 1) + Static50.method932(arg1, arg0 + 1) + Static50.method932(arg1 - 1, arg0) + Static50.method932(arg1 + 1, arg0);
		@Pc(85) int local85 = Static50.method932(arg1, arg0);
		return local40 / 16 + local74 / 8 + local85 / 4;
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "(I)I")
	public static int method4460() {
		@Pc(12) Class155 local12 = Static347.aClass155_9;
		@Pc(14) boolean local14 = false;
		if (Static2.anInt68 != 0) {
			@Pc(20) Canvas local20 = new Canvas();
			local20.setSize(100, 100);
			local14 = true;
			local12 = Static240.method4934(0, local20, null, null, 0);
		}
		@Pc(39) long local39 = Static288.method4512();
		for (@Pc(41) int local41 = 0; local41 < 10000; local41++) {
			local12.method4900();
		}
		@Pc(66) int local66 = (int) (Static288.method4512() - local39);
		local12.method4954(100, 0, 100, 0, -16777216);
		if (local14) {
			local12.method4929();
		}
		return local66;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(CB)B")
	public static byte method4462(@OriginalArg(0) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method4463(@OriginalArg(0) Class28_Sub1_Sub1_Sub2 arg0) {
		@Pc(11) Class3_Sub10 local11 = (Class3_Sub10) Static332.aClass44_32.method942((long) arg0.anInt4373);
		if (local11 == null) {
			return;
		}
		if (local11.aClass3_Sub8_Sub1_2 != null) {
			Static137.aClass3_Sub8_Sub2_2.method1712(local11.aClass3_Sub8_Sub1_2);
			local11.aClass3_Sub8_Sub1_2 = null;
		}
		local11.method5700();
	}
}
