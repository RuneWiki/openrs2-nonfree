import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Z")
	public static boolean aBoolean750 = false;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "[I")
	public static final int[] anIntArray733 = new int[3];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!d;III)V")
	public static void method7813(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.aClass1_Sub35_Sub2_1.method5792(arg2);
		arg1.aClass1_Sub35_Sub2_1.method5764(arg0);
		arg1.aClass1_Sub35_Sub2_1.method5740(arg3);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)[Lclient!sn;")
	public static Class308[] method7815() {
		return new Class308[] { Static199.aClass308_3, Static466.aClass308_7, Static302.aClass308_4, Static354.aClass308_5, Static77.aClass308_2, Static1.aClass308_1 };
	}
}
