import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt84;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_1 = new Class173(37, 8);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Lclient!io;")
	public static Class158_Sub1 method62(@OriginalArg(0) int arg0) {
		return Static325.aBoolean717 && arg0 >= Static364.anInt7050 && Static505.anInt9067 >= arg0 ? Static539.aClass158_Sub1Array2[arg0 - Static364.anInt7050] : null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B[I[I)V")
	public static void method66(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static147.anIntArray145 = null;
			Static397.anIntArray386 = null;
			Static451.aByteArrayArrayArray17 = null;
			return;
		}
		Static397.anIntArray386 = arg0;
		Static147.anIntArray145 = new int[arg0.length];
		Static451.aByteArrayArrayArray17 = new byte[arg0.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static397.anIntArray386.length; local32++) {
			Static451.aByteArrayArrayArray17[local32] = new byte[arg1[local32]][];
		}
	}
}
