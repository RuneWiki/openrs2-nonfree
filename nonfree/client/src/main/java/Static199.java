import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_5 = new Class269("", 15);

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
	public static int anInt3950 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3278(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static281.method4201(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static451.anInt487; local30++) {
			@Pc(36) String local36 = Static306.aStringArray92[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static281.method4201(local36);
			if (local36 != null && local36.equals(local25)) {
				Static451.anInt487--;
				for (@Pc(60) int local60 = local30; local60 < Static451.anInt487; local60++) {
					Static306.aStringArray92[local60] = Static306.aStringArray92[local60 + 1];
					Static362.aStringArray106[local60] = Static362.aStringArray106[local60 + 1];
					Static103.anIntArray134[local60] = Static103.anIntArray134[local60 + 1];
					Static93.aStringArray31[local60] = Static93.aStringArray31[local60 + 1];
					Static31.anIntArray49[local60] = Static31.anIntArray49[local60 + 1];
					Static88.aBooleanArray9[local60] = Static88.aBooleanArray9[local60 + 1];
				}
				Static455.anInt7881 = Static500.anInt8403;
				@Pc(125) Class2_Sub42 local125 = Static249.method3910(Static396.aClass286_83, Static400.aClass145_2);
				local125.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(arg0));
				local125.aClass2_Sub15_Sub2_2.method4313(arg0);
				Static531.method7296(local125);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method3279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static521.aByteArrayArrayArray45[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static521.aByteArrayArrayArray45[arg0][arg2][arg3] & 0x10) == 0) {
			return arg1 == Static158.method2593(arg0, arg3, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
	public static void method3280() {
		for (@Pc(12) Class2_Sub3_Sub17 local12 = (Class2_Sub3_Sub17) Static472.aClass8_55.method210(); local12 != null; local12 = (Class2_Sub3_Sub17) Static472.aClass8_55.method218()) {
			@Pc(19) Class6_Sub1_Sub1_Sub5 local19 = local12.aClass6_Sub1_Sub1_Sub5_1;
			if (local19.aBoolean522) {
				local12.method7966();
				local19.method5597();
			} else if (Static412.anInt575 >= local19.anInt6687) {
				local19.method5596(Static367.anInt6534);
				if (local19.aBoolean522) {
					local12.method7966();
				} else {
					Static516.method7139(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "(I)Z")
	public static boolean method3281() {
		@Pc(10) Class2_Sub48 local10 = (Class2_Sub48) Static96.aClass8_12.method210();
		if (local10 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local10.anInt9286; local21++) {
			if (local10.aClass347Array1[local21] != null && local10.aClass347Array1[local21].anInt9172 == 0) {
				return false;
			}
			if (local10.aClass347Array2[local21] != null && local10.aClass347Array2[local21].anInt9172 == 0) {
				return false;
			}
		}
		return true;
	}
}
