import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
	private int anInt2770 = 4096;

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2770 = arg0.method2767();
		} else if (arg1 == 1) {
			this.aBoolean210 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(30) int[] local30 = this.method5547(Static300.anInt5187 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method5547(arg0, 0);
			@Pc(46) int[] local46 = this.method5547(arg0 + 1 & Static300.anInt5187, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static238.anInt4221; local60++) {
				@Pc(74) int local74 = this.anInt2770 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = (local36[Static171.anInt3000 & local60 + 1] - local36[local60 - 1 & Static171.anInt3000]) * this.anInt2770;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(145) int local145;
				@Pc(141) int local141;
				@Pc(137) int local137;
				if (local128 == 0) {
					local137 = 0;
					local145 = 0;
					local141 = 0;
				} else {
					local137 = 16777216 / local128;
					local141 = local74 / local128;
					local145 = local94 / local128;
				}
				if (this.aBoolean210) {
					local137 = (local137 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local50[local60] = local145;
				local54[local60] = local141;
				local58[local60] = local137;
			}
		}
		return local16;
	}
}
