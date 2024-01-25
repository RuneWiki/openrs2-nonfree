import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class2_Sub6_Sub12 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
	private int anInt3223 = 4096;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt3223 = arg1.method8546();
		} else if (arg0 == 1) {
			this.aBoolean236 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(30) int[] local30 = this.method8461(0, Static53.anInt1098 & arg0 - 1);
			@Pc(36) int[] local36 = this.method8461(0, arg0);
			@Pc(46) int[] local46 = this.method8461(0, arg0 + 1 & Static53.anInt1098);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static51.anInt1085; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt3223;
				@Pc(94) int local94 = this.anInt3223 * (local36[Static332.anInt5256 & local60 + 1] - local36[Static332.anInt5256 & local60 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(137) int local137;
				@Pc(135) int local135;
				if (local128 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local137 = local74 / local128;
					local135 = 16777216 / local128;
					local139 = local94 / local128;
				}
				if (this.aBoolean236) {
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local50[local60] = local139;
				local54[local60] = local137;
				local58[local60] = local135;
			}
		}
		return local16;
	}
}
