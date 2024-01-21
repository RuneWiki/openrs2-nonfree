import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
	private int anInt2466 = 4096;

	@OriginalMember(owner = "client!kf", name = "hb", descriptor = "I")
	private int anInt2465 = 4096;

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "[I")
	private final int[] anIntArray276 = new int[3];

	@OriginalMember(owner = "client!kf", name = "sb", descriptor = "I")
	private int anInt2471 = 4096;

	@OriginalMember(owner = "client!kf", name = "ob", descriptor = "I")
	private int anInt2469 = 409;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(26) int[][] local26 = this.method3307(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static176.anInt3921; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(65) int local65 = local58 - this.anIntArray276[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (this.anInt2469 < local65) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(100) int local100 = local34[local52];
					local65 = local100 - this.anIntArray276[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (local65 > this.anInt2469) {
						local42[local52] = local58;
						local46[local52] = local100;
						local50[local52] = local38[local52];
					} else {
						@Pc(141) int local141 = local38[local52];
						local65 = local141 - this.anIntArray276[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (this.anInt2469 < local65) {
							local42[local52] = local58;
							local46[local52] = local100;
							local50[local52] = local141;
						} else {
							local42[local52] = local58 * this.anInt2466 >> 12;
							local46[local52] = this.anInt2471 * local100 >> 12;
							local50[local52] = local141 * this.anInt2465 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2469 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt2465 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt2471 = arg1.method1753();
		} else if (arg0 == 3) {
			this.anInt2466 = arg1.method1753();
		} else if (arg0 == 4) {
			@Pc(53) int local53 = arg1.method1713();
			this.anIntArray276[1] = local53 >> 4 & 0xFF0;
			this.anIntArray276[2] = local53 >> 12 & 0x0;
			this.anIntArray276[0] = (local53 & 0xFF0000) << 4;
		}
	}
}
