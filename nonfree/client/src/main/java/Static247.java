import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_146 = new Class272(57, -1);

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
	public static int anInt4548 = 0;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Lclient!pc;")
	public static Class9_Sub1_Sub4 method4031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)I")
	public static int method4032(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
