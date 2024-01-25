import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array11;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "[I")
	public static final int[] anIntArray309 = new int[14];

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
	public static int anInt4672 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!kh;I)V")
	public static void method3961(@OriginalArg(0) int arg0, @OriginalArg(2) Class208 arg1, @OriginalArg(3) int arg2) {
		Static247.aClass208_3 = arg1;
		Static446.anInt7707 = arg2;
		Static422.anInt7120 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIB)V")
	public static void method3962(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub29 local15 = Static577.method7771(arg0, arg1);
		if (local15 != null) {
			local15.method8770();
		}
	}
}
