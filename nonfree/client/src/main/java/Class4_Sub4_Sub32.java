import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class4_Sub4_Sub32 extends Class4_Sub4 {

	@OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
	private int anInt7652 = 4096;

	@OriginalMember(owner = "client!raa", name = "K", descriptor = "Z")
	private boolean aBoolean538 = true;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(30) int[] local30 = this.method7890(0, Static360.anInt6375 & arg0 - 1);
			@Pc(36) int[] local36 = this.method7890(0, arg0);
			@Pc(46) int[] local46 = this.method7890(0, arg0 + 1 & Static360.anInt6375);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static560.anInt9394; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt7652;
				@Pc(94) int local94 = (local36[Static571.anInt9405 & local60 + 1] - local36[local60 - 1 & Static571.anInt9405]) * this.anInt7652;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(136) int local136;
				@Pc(134) int local134;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local132 = local94 / local128;
					local136 = local74 / local128;
					local134 = 16777216 / local128;
				}
				if (this.aBoolean538) {
					local136 = (local136 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local50[local60] = local132;
				local54[local60] = local136;
				local58[local60] = local134;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7652 = arg1.method5982();
		} else if (arg0 == 1) {
			this.aBoolean538 = arg1.method6015() == 1;
		}
	}
}
