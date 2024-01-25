import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "Lclient!bh;")
	public static Class29 aClass29_5;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
	public static int anInt5059 = -1;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)Z")
	public static boolean method4263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!oo;IIII)V")
	public static void method4266(@OriginalArg(0) Class3_Sub32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(25) long local25 = (long) (arg1 | arg2 << 28 | arg3 << 14);
		@Pc(31) Class3_Sub46 local31 = (Class3_Sub46) Static644.aClass307_55.method7424(local25);
		if (local31 == null) {
			local31 = new Class3_Sub46();
			Static644.aClass307_55.method7425(local25, local31);
			local31.aClass276_56.method6906(arg0);
			return;
		}
		@Pc(54) Class237 local54 = Static367.aClass281_1.method6975(arg0.anInt7689);
		@Pc(57) int local57 = local54.anInt7308;
		if (local54.anInt7293 == 1) {
			local57 *= arg0.anInt7685 + 1;
		}
		for (@Pc(74) Class3_Sub32 local74 = (Class3_Sub32) local31.aClass276_56.method6907(); local74 != null; local74 = (Class3_Sub32) local31.aClass276_56.method6912()) {
			local54 = Static367.aClass281_1.method6975(local74.anInt7689);
			@Pc(87) int local87 = local54.anInt7308;
			if (local54.anInt7293 == 1) {
				local87 *= local74.anInt7685 + 1;
			}
			if (local87 < local57) {
				Static351.method5754(arg0, local74);
				return;
			}
		}
		local31.aClass276_56.method6906(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)I")
	public static int method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static583.anIntArray593[arg0 & 0x3] : Static559.anIntArray582[arg0 & 0x3];
	}
}
