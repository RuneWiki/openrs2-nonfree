import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt9993;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt9994;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "[I")
	public static final int[] anIntArray707 = new int[6];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIZIZ)V")
	public static void method8494(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static475.method6724(arg2, arg3, arg0, 0, Static537.aClass362_Sub1Array1.length - 1, arg1);
		Static385.anInt6641 = 0;
		Static531.aClass2_Sub47_2 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method8495(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static188.method3210(2, arg1);
		local13.method925();
		local13.aString7 = arg0;
	}
}
