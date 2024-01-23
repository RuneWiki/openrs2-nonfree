import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!on", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public static int anInt3981;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Lclient!fk;")
	public static Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!on", name = "t", descriptor = "I")
	public static int anInt3980 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!km;I)Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 method3187(@OriginalArg(0) int arg0, @OriginalArg(1) Class91 arg1) {
		return Static163.method2824(arg1, arg0) ? Static204.method3285() : null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!in;IIIIII)V")
	public static void method3188(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = arg6 * arg6 + arg5 * arg5;
		if (arg2 < local13) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg0.anInt2722 / 2, arg0.anInt2698 / 2);
		if (local35 * local35 >= local13) {
			Static32.method3625(Static111.aClass1_Sub2_Sub11Array2[arg1], arg3, arg4, arg0, arg5, arg6);
			return;
		}
		@Pc(60) int local60 = (int) Static298.aFloat58 + Static245.anInt4881 & 0x7FF;
		local35 -= 10;
		@Pc(65) int local65 = Class68.anIntArray226[local60];
		@Pc(69) int local69 = Class68.anIntArray229[local60];
		@Pc(77) int local77 = local65 * 256 / (Static1.anInt4245 + 256);
		@Pc(85) int local85 = local69 * 256 / (Static1.anInt4245 + 256);
		@Pc(95) int local95 = arg5 * local77 - local85 * arg6 >> 16;
		@Pc(105) int local105 = local77 * arg6 + arg5 * local85 >> 16;
		@Pc(111) double local111 = Math.atan2((double) local105, (double) local95);
		@Pc(118) int local118 = (int) ((double) local35 * Math.sin(local111));
		@Pc(125) int local125 = (int) ((double) local35 * Math.cos(local111));
		if (Static277.aBoolean412) {
			((Class1_Sub2_Sub11_Sub1) Static183.aClass1_Sub2_Sub11Array8[arg1]).method3124((arg0.anInt2722 / 2 + arg3 + local118) * 16, (arg4 + arg0.anInt2698 / 2 - local125) * 16, (int) (local111 * 10430.378D));
		} else {
			((Class1_Sub2_Sub11_Sub2) Static183.aClass1_Sub2_Sub11Array8[arg1]).method3794(local118 + arg3 + arg0.anInt2722 / 2 - 10, -local125 + arg0.anInt2698 / 2 + arg4 + -10, local111);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
	public static String method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) char local15 = ',';
		@Pc(17) char local17 = '.';
		if (arg1 == 0) {
			local17 = ',';
			local15 = '.';
		}
		if (arg1 == 2) {
			local17 = ' ';
		}
		@Pc(31) boolean local31 = false;
		@Pc(36) StringBuffer local36 = new StringBuffer(26);
		if (arg2 < 0L) {
			arg2 = -arg2;
			local31 = true;
		}
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (arg0 > 0) {
			for (local53 = 0; local53 < arg0; local53++) {
				local59 = (int) arg2;
				arg2 /= 10L;
				local36.append((char) (local59 + 48 - (int) arg2 * 10));
			}
			local36.append(local15);
		}
		local53 = 0;
		while (true) {
			local59 = (int) arg2;
			arg2 /= 10L;
			local36.append((char) (local59 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local31) {
					local36.append('-');
				}
				return local36.reverse().toString();
			}
			if (arg3) {
				local53++;
				if (local53 % 3 == 0) {
					local36.append(local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V")
	public static void method3190(@OriginalArg(0) int arg0) {
		if (Static299.anInt5641 == 0) {
			Static221.aClass1_Sub5_Sub2_2.method1672(arg0);
		} else {
			Static244.anInt4854 = arg0;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(IB)V")
	public static void method3191(@OriginalArg(1) byte arg0) {
		if (Static35.aByteArrayArrayArray12 == null) {
			Static35.aByteArrayArrayArray12 = new byte[4][104][104];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(19) int local19 = 0; local19 < 104; local19++) {
				for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
					Static35.aByteArrayArrayArray12[local14][local19][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public static void method3192() {
		if (Static30.anInt3296 == 2) {
			if (Static298.anInt5621 == Static137.anInt3016 && Static29.anInt661 == Static58.anInt992) {
				Static30.anInt3296 = 0;
				if (Static45.aBoolean79 && Static175.aBooleanArray34[81] && Static134.anInt2945 > 2) {
					Static225.method3547(Static134.anInt2945 - 2);
				} else {
					Static225.method3547(Static134.anInt2945 - 1);
				}
			}
		} else if (Static249.anInt4936 == Static137.anInt3016 && Static40.anInt1015 == Static29.anInt661) {
			Static30.anInt3296 = 0;
			if (Static45.aBoolean79 && Static175.aBooleanArray34[81] && Static134.anInt2945 > 2) {
				Static225.method3547(Static134.anInt2945 - 2);
			} else {
				Static225.method3547(Static134.anInt2945 - 1);
			}
		} else {
			Static298.anInt5621 = Static249.anInt4936;
			Static30.anInt3296 = 2;
			Static58.anInt992 = Static40.anInt1015;
		}
	}
}
