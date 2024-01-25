import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_68 = new Class187(11, 3);

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "J")
	public static long aLong221 = 20000000L;

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
	public static final int anInt7183 = -1;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)Z")
	public static boolean method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
	public static void method6184() {
		@Pc(5) int local5 = 0;
		if (Static655.aClass5_Sub36_29 != null) {
			local5 = Static655.aClass5_Sub36_29.aClass2_Sub14_1.method6843();
		}
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (local5 == 2) {
			local34 = Static197.anInt3210 > 800 ? 800 : Static197.anInt3210;
			local45 = Static267.anInt4239 <= 600 ? Static267.anInt4239 : 600;
			Static563.anInt9176 = local34;
			Static10.anInt176 = (Static197.anInt3210 - local34) / 2;
			Static415.anInt7087 = 0;
			Static316.anInt8165 = local45;
		} else if (local5 == 1) {
			local34 = Static197.anInt3210 <= 1024 ? Static197.anInt3210 : 1024;
			Static563.anInt9176 = local34;
			local45 = Static267.anInt4239 <= 768 ? Static267.anInt4239 : 768;
			Static10.anInt176 = (Static197.anInt3210 - local34) / 2;
			Static415.anInt7087 = 0;
			Static316.anInt8165 = local45;
		} else {
			Static316.anInt8165 = Static267.anInt4239;
			Static10.anInt176 = 0;
			Static563.anInt9176 = Static197.anInt3210;
			Static415.anInt7087 = 0;
		}
	}
}
