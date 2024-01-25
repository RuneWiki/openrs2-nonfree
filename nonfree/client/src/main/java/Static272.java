import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
	public static int anInt4948 = 0;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(5, arg1);
		local8.method3608();
		local8.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
	public static int method4461(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
