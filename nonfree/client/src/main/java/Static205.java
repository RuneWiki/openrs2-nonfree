import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt4770;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
	public static final int[] anIntArray274 = new int[32];

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public static int anInt4767 = 0;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4053(@OriginalArg(0) String arg0) {
		if (Static646.aClass323Array1 != null) {
			@Pc(15) Class3_Sub26 local15 = Static640.method8636(Static512.aClass344_109, Static403.aClass294_3);
			local15.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0));
			local15.aClass3_Sub15_Sub1_3.method8417(arg0);
			Static472.method5189(local15);
		}
	}
}
