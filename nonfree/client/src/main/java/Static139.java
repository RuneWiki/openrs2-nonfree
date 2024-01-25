import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_63 = new Class40(31, 2);

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_64 = new Class40(112, -1);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
	public static void method2083(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static487.anInt8139 != -1) {
				Static26.method400(Static487.anInt8139);
			}
			for (@Pc(15) Class6_Sub31 local15 = (Class6_Sub31) Static564.aClass212_39.method5099(); local15 != null; local15 = (Class6_Sub31) Static564.aClass212_39.method5103()) {
				if (!local15.method7848()) {
					local15 = (Class6_Sub31) Static564.aClass212_39.method5099();
					if (local15 == null) {
						break;
					}
				}
				Static160.method2336(true, false, local15);
			}
			Static487.anInt8139 = -1;
			Static564.aClass212_39 = new Class212(8);
			Static505.method6943();
			Static487.anInt8139 = Static563.anInt9402;
			Static59.method46(false);
			Static260.method3643();
			Static100.method1629(Static487.anInt8139);
		}
		Static442.aString89 = "";
		Static87.aString23 = "";
		Static466.aBoolean539 = false;
		Static470.method6577();
		Static278.anInt6564 = -1;
		Static41.method572(Static48.anInt822);
		Static426.aClass29_Sub2_Sub1_Sub2_2 = new Class29_Sub2_Sub1_Sub2();
		Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] = Static301.anInt4912 / 2;
		Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 = Static301.anInt4912 * 512 / 2;
		Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 = Static473.anInt7969 * 512 / 2;
		Static220.anInt3753 = 0;
		Static388.anInt6921 = 0;
		Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] = Static473.anInt7969 / 2;
		if (Static354.anInt6233 == 2) {
			Static220.anInt3753 = Static190.anInt4029 << 9;
			Static388.anInt6921 = Static159.anInt2791 << 9;
		} else {
			Static251.method4150();
		}
		Static528.method7588();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII[B)[B")
	public static byte[] method2085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(21) byte[] local21;
		if (arg1 > 0) {
			local21 = new byte[arg0];
			for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
				local21[local23] = arg2[local23 + arg1];
			}
		} else {
			local21 = arg2;
		}
		@Pc(45) Class93 local45 = new Class93();
		local45.method1917();
		local45.method1918((long) (arg0 * 8), local21);
		@Pc(59) byte[] local59 = new byte[64];
		local45.method1920(local59);
		return local59;
	}
}
