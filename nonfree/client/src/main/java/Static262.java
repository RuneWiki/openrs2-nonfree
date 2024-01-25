import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kca", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!kca", name = "N", descriptor = "I")
	public static int anInt5047;

	@OriginalMember(owner = "client!kca", name = "C", descriptor = "Lclient!qf;")
	public static final Class271 aClass271_5 = new Class271();

	@OriginalMember(owner = "client!kca", name = "G", descriptor = "[I")
	public static final int[] anIntArray250 = new int[13];

	@OriginalMember(owner = "client!kca", name = "L", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_107 = new Class362(27, 12);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIII)V")
	public static void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class4_Sub5_Sub16 local18 = Static219.method3587(arg1, 11);
		local18.method7133();
		local18.anInt8738 = arg2;
		local18.anInt8736 = arg0;
	}
}
