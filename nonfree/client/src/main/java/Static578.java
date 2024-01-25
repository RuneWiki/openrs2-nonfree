import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!un", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "Lclient!via;")
	public static Class358 aClass358_5;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_108 = new Class185(72, 3);

	@OriginalMember(owner = "client!un", name = "O", descriptor = "I")
	public static int anInt9856 = 16777215;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "[I")
	public static final int[] anIntArray523 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(III)V")
	public static void method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static453.anInt8163 != 0) {
			if (arg1 < 0) {
				for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
					Static394.anIntArray369[local10] = arg0;
				}
			} else {
				Static394.anIntArray369[arg1] = arg0;
			}
		}
		Static623.aClass6_Sub4_Sub2_4.method4804(arg1, arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!lr;)Lclient!kfa;")
	public static Class168 method8031(@OriginalArg(1) Class9_Sub4_Sub2 arg0) {
		@Pc(14) Class168 local14;
		if (Static50.aClass168_1 == null) {
			local14 = new Class168();
		} else {
			local14 = Static50.aClass168_1;
			Static50.aClass168_1 = Static50.aClass168_1.aClass168_2;
			Static309.anInt6218--;
			local14.aClass168_2 = null;
		}
		local14.aClass9_Sub4_Sub2_1 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	public static boolean method8033(@OriginalArg(1) int arg0) {
		if (arg0 == 13 || arg0 == 23 || arg0 == 2 || arg0 == 30 || arg0 == 18) {
			return true;
		} else {
			return arg0 == 58 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)I")
	public static int method8034(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
