import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "Lclient!lu;")
	public static Class219 aClass219_3;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "Lclient!lu;")
	public static final Class219 aClass219_2 = new Class219(1);

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
	public static final int anInt9566 = 50;

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "[I")
	public static final int[] anIntArray757 = new int[anInt9566];

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "[I")
	public static final int[] anIntArray758 = new int[anInt9566];

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "Z")
	public static boolean aBoolean771 = false;

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "[I")
	public static final int[] anIntArray759 = new int[anInt9566];

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "[I")
	public static final int[] anIntArray760 = new int[anInt9566];

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[anInt9566];

	@OriginalMember(owner = "client!uq", name = "I", descriptor = "[I")
	public static final int[] anIntArray761 = new int[anInt9566];

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "[I")
	public static final int[] anIntArray762 = new int[anInt9566];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
	public static int method8196() {
		@Pc(12) Class293 local12 = Static15.aClass293_5;
		synchronized (Static15.aClass293_5) {
			return Static15.aClass293_5.method6933();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!ee;)Lclient!gga;")
	public static Class129_Sub1 method8204(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(7) Class129 local7 = Static549.method7770(arg0);
		@Pc(16) int local16 = arg0.method8626();
		return new Class129_Sub1(local7.anInt3276, local7.aClass204_6, local7.aClass288_7, local7.anInt3269, local7.anInt3271, local16);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
	public static int method8205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static423.aByteArrayArray17 == null ? 0 : Static423.aByteArrayArray17[arg0][arg1] & 0xFF;
	}
}
