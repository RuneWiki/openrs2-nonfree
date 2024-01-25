import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!he", name = "C", descriptor = "I")
	public static int anInt6722;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public static boolean method5785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!rg;ILclient!rg;)V")
	public static void method5786(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0.aClass2_Sub7_67 != null) {
			arg0.method8504();
		}
		arg0.aClass2_Sub7_66 = arg1;
		arg0.aClass2_Sub7_67 = arg1.aClass2_Sub7_67;
		arg0.aClass2_Sub7_67.aClass2_Sub7_66 = arg0;
		arg0.aClass2_Sub7_66.aClass2_Sub7_67 = arg0;
	}
}
