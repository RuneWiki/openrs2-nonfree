import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	public static int anInt4740;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_127 = new Class140(8);

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
	public static int anInt4737 = -1;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
	public static int anInt4739 = 0;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "[I")
	public static final int[] anIntArray606 = new int[5];

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(III)V")
	public static void method4311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub2 local15 = Static42.method1000(12, arg1);
		local15.method168();
		local15.anInt85 = arg0;
	}
}
