import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class2_Sub15_Sub34 extends Class2_Sub15 {

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
	private int anInt10236 = 409;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
	private int anInt10239 = 4096;

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
	private int anInt10237 = 4096;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
	private int anInt10234 = 4096;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "[I")
	private final int[] anIntArray520 = new int[3];

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(26) int[][] local26 = this.method9727(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static329.anInt6017; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(65) int local65 = local58 - this.anIntArray520[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (local65 > this.anInt10236) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(99) int local99 = local34[local52];
					local65 = local99 - this.anIntArray520[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (this.anInt10236 < local65) {
						local42[local52] = local58;
						local46[local52] = local99;
						local50[local52] = local38[local52];
					} else {
						@Pc(139) int local139 = local38[local52];
						local65 = local139 - this.anIntArray520[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (this.anInt10236 < local65) {
							local42[local52] = local58;
							local46[local52] = local99;
							local50[local52] = local139;
						} else {
							local42[local52] = this.anInt10237 * local58 >> 12;
							local46[local52] = local99 * this.anInt10234 >> 12;
							local50[local52] = this.anInt10239 * local139 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10236 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt10239 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt10234 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt10237 = arg1.method5211();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.method5161();
			this.anIntArray520[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray520[2] = local62 >> 12 & 0x0;
			this.anIntArray520[1] = local62 >> 4 & 0xFF0;
		}
	}
}
