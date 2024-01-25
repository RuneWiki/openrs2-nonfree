import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "Z")
	private boolean aBoolean671 = true;

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
	private int anInt8984 = 4096;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(30) int[] local30 = this.method8716(0, Static622.anInt9680 & arg0 - 1);
			@Pc(36) int[] local36 = this.method8716(0, arg0);
			@Pc(46) int[] local46 = this.method8716(0, Static622.anInt9680 & arg0 + 1);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static30.anInt908; local60++) {
				@Pc(74) int local74 = this.anInt8984 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = this.anInt8984 * (local36[local60 + 1 & Static241.anInt4556] - local36[Static241.anInt4556 & local60 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(134) int local134;
				@Pc(136) int local136;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local134 = local74 / local128;
					local136 = 16777216 / local128;
					local132 = local94 / local128;
				}
				if (this.aBoolean671) {
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local50[local60] = local132;
				local54[local60] = local134;
				local58[local60] = local136;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8984 = arg0.method4858();
		} else if (arg1 == 1) {
			this.aBoolean671 = arg0.method4888() == 1;
		}
	}
}
