import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class42_Sub1_Sub2 extends Class42_Sub1 {

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[[I")
	private static final int[][] anIntArrayArray20 = new int[6][];

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[I")
	private static final int[] anIntArray160 = new int[6];

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!qd;")
	private Class8_Sub3 aClass8_Sub3_2;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private final int anInt2438;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	private final int anInt2439;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	private final int anInt2437;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	private final int anInt2435;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_12;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	private final int anInt2436;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	private final int anInt2440;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!bf;IIIIII)V", line = 79)
	public Class42_Sub1_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2438 = arg4;
		this.anInt2439 = arg6;
		this.anInt2437 = arg5;
		this.anInt2435 = arg2;
		this.aClass19_Sub1_12 = arg0;
		this.anInt2436 = arg1;
		this.anInt2440 = arg3;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Lclient!qd;", line = 11)
	@Override
	public Class8_Sub3 method2430() {
		if (this.aClass8_Sub3_2 == null) {
			anIntArray160[0] = this.anInt2436;
			anIntArray160[4] = this.anInt2437;
			anIntArray160[2] = this.anInt2440;
			anIntArray160[1] = this.anInt2435;
			@Pc(27) Interface2 local27 = this.aClass19_Sub1_12.anInterface2_5;
			anIntArray160[3] = this.anInt2438;
			anIntArray160[5] = this.anInt2439;
			@Pc(39) boolean local39 = false;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43;
			for (local43 = 0; local43 < 6; local43++) {
				if (!local27.method2659(anIntArray160[local43])) {
					return null;
				}
				@Pc(65) Class229 local65 = local27.method2660(anIntArray160[local43]);
				@Pc(72) int local72 = local65.aBoolean441 ? 64 : 128;
				if (local41 < local72) {
					local41 = local72;
				}
				if (local65.aByte66 > 0) {
					local39 = true;
				}
			}
			for (local43 = 0; local43 < 6; local43++) {
				anIntArrayArray20[local43] = local27.method2661(anIntArray160[local43], false, local41, 1.0F, local41);
			}
			this.aClass8_Sub3_2 = new Class8_Sub3(this.aClass19_Sub1_12, 6407, local41, local39, anIntArrayArray20);
		}
		return this.aClass8_Sub3_2;
	}
}
