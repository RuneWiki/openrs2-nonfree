import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_13 = new Class220(10, 2, 2, 0);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!ap;B)V")
	public static void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub1 arg1) {
		Static450.anInt7890 = 0;
		Static42.aBoolean69 = false;
		Static9.method2260(arg1);
		Static72.method1376(arg1);
		if (Static42.aBoolean69) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt1710) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt1710 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BII)Z")
	public static boolean method6172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static110.aByteArrayArrayArray20[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!ol;)V")
	public static void method6174(@OriginalArg(0) Class30_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort104; local2 <= arg0.aShort105; local2++) {
			for (@Pc(6) int local6 = arg0.aShort103; local6 <= arg0.aShort102; local6++) {
				@Pc(16) Class252 local16 = Static67.aClass252ArrayArrayArray2[arg0.aByte102][local2][local6];
				if (local16 != null) {
					@Pc(21) Class208 local21 = local16.aClass208_3;
					@Pc(23) Class208 local23 = null;
					while (local21 != null) {
						if (local21.aClass30_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass208_3 = local21.aClass208_2;
							} else {
								local23.aClass208_2 = local21.aClass208_2;
							}
							local21.method4675();
							break;
						}
						local23 = local21;
						local21 = local21.aClass208_2;
					}
					local16.aByte98 = 0;
					for (@Pc(56) Class208 local56 = local16.aClass208_3; local56 != null; local56 = local56.aClass208_2) {
						local16.aByte98 = (byte) (local16.aByte98 | local56.anInt6086);
					}
				}
			}
		}
	}
}
