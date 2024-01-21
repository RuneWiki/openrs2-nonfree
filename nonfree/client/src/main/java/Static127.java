import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array43 = new Class65[100];

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
	public static int anInt3142 = 0;

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1780 = Static118.method2249("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
	public static int anInt3145 = 0;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1 method2412() {
		@Pc(15) Class1_Sub2_Sub5_Sub1 local15 = new Class1_Sub2_Sub5_Sub1();
		local15.anInt847 = Static111.anIntArray308[0];
		local15.anIntArray82 = Static61.anIntArray154;
		local15.anInt846 = anIntArray364[0];
		local15.aByteArray11 = Static153.aByteArrayArray33[0];
		local15.anInt848 = Static138.anIntArray384[0];
		local15.anInt845 = Static108.anInt2647;
		local15.anInt849 = Static160.anIntArray328[0];
		local15.anInt850 = Static148.anInt3487;
		Static84.method1458();
		return local15;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)I")
	public static int method2414(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
