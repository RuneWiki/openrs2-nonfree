import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class2_Sub4_Sub16 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jn", name = "T", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!jn", name = "Z", descriptor = "I")
	private int anInt3169 = 4096;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3169 = arg0.method5312();
		} else if (arg1 == 1) {
			this.aBoolean241 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(30) int[] local30 = this.method5600(Static283.anInt4900 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method5600(arg0, 0);
			@Pc(46) int[] local46 = this.method5600(Static283.anInt4900 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static76.anInt1458; local60++) {
				@Pc(74) int local74 = this.anInt3169 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = (local36[local60 + 1 & Static269.anInt4657] - local36[Static269.anInt4657 & local60 - 1]) * this.anInt3169;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(140) int local140;
				@Pc(138) int local138;
				if (local129 == 0) {
					local136 = 0;
					local138 = 0;
					local140 = 0;
				} else {
					local136 = local94 / local129;
					local138 = 16777216 / local129;
					local140 = local74 / local129;
				}
				if (this.aBoolean241) {
					local136 = (local136 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local50[local60] = local136;
				local54[local60] = local140;
				local58[local60] = local138;
			}
		}
		return local16;
	}
}
