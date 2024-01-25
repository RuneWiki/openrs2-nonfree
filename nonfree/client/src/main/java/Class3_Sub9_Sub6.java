import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class3_Sub9_Sub6 extends Class3_Sub9 {

	@OriginalMember(owner = "client!df", name = "F", descriptor = "I")
	private int anInt1839 = 4096;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(30) int[] local30 = this.method9162(arg0 - 1 & Static636.anInt10126, 0);
			@Pc(36) int[] local36 = this.method9162(arg0, 0);
			@Pc(46) int[] local46 = this.method9162(Static636.anInt10126 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static62.anInt1251; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt1839;
				@Pc(94) int local94 = this.anInt1839 * (local36[local60 + 1 & Static302.anInt5067] - local36[local60 - 1 & Static302.anInt5067]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(142) int local142;
				@Pc(138) int local138;
				@Pc(146) int local146;
				if (local129 == 0) {
					local142 = 0;
					local146 = 0;
					local138 = 0;
				} else {
					local138 = local74 / local129;
					local142 = local94 / local129;
					local146 = 16777216 / local129;
				}
				if (this.aBoolean143) {
					local146 = (local146 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
				}
				local50[local60] = local142;
				local54[local60] = local138;
				local58[local60] = local146;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1839 = arg0.method8593();
		} else if (arg1 == 1) {
			this.aBoolean143 = arg0.method8632() == 1;
		}
	}
}
