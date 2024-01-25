import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class4_Sub2_Sub27 extends Class4_Sub2 {

	@OriginalMember(owner = "client!se", name = "F", descriptor = "I")
	private int anInt8395 = 4096;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "Z")
	private boolean aBoolean647 = true;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt8395 = arg1.method8859();
		} else if (arg0 == 1) {
			this.aBoolean647 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(30) int[] local30 = this.method8768(0, Static489.anInt7677 & arg0 - 1);
			@Pc(36) int[] local36 = this.method8768(0, arg0);
			@Pc(46) int[] local46 = this.method8768(0, arg0 + 1 & Static489.anInt7677);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static269.anInt4330; local60++) {
				@Pc(74) int local74 = this.anInt8395 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = this.anInt8395 * (local36[local60 + 1 & Static215.anInt3481] - local36[local60 - 1 & Static215.anInt3481]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(135) int local135;
				@Pc(139) int local139;
				if (local128 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local139 = 16777216 / local128;
					local135 = local74 / local128;
					local137 = local94 / local128;
				}
				if (this.aBoolean647) {
					local135 = (local135 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local50[local60] = local137;
				local54[local60] = local135;
				local58[local60] = local139;
			}
		}
		return local16;
	}
}
