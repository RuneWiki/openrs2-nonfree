import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
	public static int anInt2215;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public static int anInt2217 = 16777215;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIB)V")
	public static void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class5_Sub4_Sub13 local14 = Static506.method2916(arg0, 11);
		local14.method4140();
		local14.anInt4504 = arg1;
		local14.anInt4508 = arg2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
	public static int method2001() {
		return Static244.anInt4096;
	}
}
