import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!ua;")
	public static Class3_Sub5_Sub4 aClass3_Sub5_Sub4_1;

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
	public static int anInt6485;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Z")
	public static boolean aBoolean561 = false;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "Z")
	public static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[200];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!bu;II)Lclient!eu;")
	public static Class70 method5044(@OriginalArg(1) Class32 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method785(0, arg1);
		return local14 == null ? null : new Class70(local14);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)I")
	public static int method5048(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
