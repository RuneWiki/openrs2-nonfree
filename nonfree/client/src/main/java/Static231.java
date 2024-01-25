import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!dk;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Lclient!vv;")
	public static final Class306 aClass306_2 = new Class306("RC", 1);

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public static final int anInt4165 = 1403;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method3628() {
		Static93.method1721(Static10.aClass243_5);
		Static381.aClass2_Sub29_Sub2_2.method5172(0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I")
	public static int method3629(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(29) int local29 = (local14 & 0x33333333) + ((local14 & 0xCCCCCCCF) >>> 2);
		@Pc(38) int local38 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
