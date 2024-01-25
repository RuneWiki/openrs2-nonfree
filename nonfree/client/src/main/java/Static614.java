import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static614 {

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
	public static int anInt6685;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "Lclient!g;")
	public static Class111 aClass111_3;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
	public static final int anInt6683 = 4;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)Z")
	public static boolean method5484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static569.method7901(arg1, arg0) | (arg1 & 0x800) != 0 || Static481.method7140(arg1, arg0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)I")
	public static int method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static117.aByteArrayArray48 == null ? 0 : Static117.aByteArrayArray48[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIILclient!kw;)V")
	public static void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub31 arg3) {
		arg3.aClass8_Sub8_Sub2_1.method8523(arg2);
		arg3.aClass8_Sub8_Sub2_1.method8572(arg1);
		arg3.aClass8_Sub8_Sub2_1.method8551(arg0);
	}
}
