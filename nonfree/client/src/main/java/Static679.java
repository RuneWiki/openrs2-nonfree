import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!za", name = "l", descriptor = "I")
	public static int anInt10958;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_118 = new Class240(89, 15);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public static int method9038(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(31) int local31 = (local21 & 0x33333333) + ((local21 & 0xCCCCCCCC) >>> 2);
		@Pc(40) int local40 = local31 + (local31 >>> 4) & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZIILclient!uq;III)V")
	public static void method9039(@OriginalArg(3) Class362 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static523.anInt8276 = arg1;
		Static554.aClass362_126 = arg0;
		Static634.anInt6735 = 1;
		Static18.aBoolean20 = false;
		Static531.anInt8329 = arg2;
		Static27.anInt684 = 2;
		Static566.anInt9146 = 0;
		Static653.aClass3_Sub12_Sub3_4 = null;
	}
}
