import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray32 = new byte[250][];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIZ)V")
	public static void method8121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static420.method6283(arg2)) {
			Static199.method3261(-1, arg0, arg1, arg3, Static535.aClass155ArrayArray2[arg2]);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)I")
	public static int method8122() {
		if (Static514.aFrame2 == null) {
			return Static325.aBoolean437 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V")
	public static void method8123(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub6_Sub5 local15 = Static396.method6079(arg0, 13);
		local15.method2303();
		local15.anInt2865 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)Z")
	public static boolean method8124() {
		return Static491.anInt9287 == 0 ? Static365.aClass4_Sub21_Sub4_6.method6166() : true;
	}
}
