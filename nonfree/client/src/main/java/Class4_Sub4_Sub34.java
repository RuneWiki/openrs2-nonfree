import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class4_Sub4_Sub34 extends Class4_Sub4 {

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Z")
	private boolean aBoolean503 = true;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	private int anInt7100 = 4096;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7100 = arg1.method5028();
		} else if (arg0 == 1) {
			this.aBoolean503 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(30) int[] local30 = this.method6040(Static204.anInt3610 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method6040(arg0, 0);
			@Pc(46) int[] local46 = this.method6040(arg0 + 1 & Static204.anInt3610, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static419.anInt6404; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt7100;
				@Pc(93) int local93 = (local36[Static211.anInt3669 & local60 + 1] - local36[local60 - 1 & Static211.anInt3669]) * this.anInt7100;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(144) int local144;
				@Pc(136) int local136;
				if (local127 == 0) {
					local136 = 0;
					local140 = 0;
					local144 = 0;
				} else {
					local136 = 16777216 / local127;
					local140 = local93 / local127;
					local144 = local73 / local127;
				}
				if (this.aBoolean503) {
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local50[local60] = local140;
				local54[local60] = local144;
				local58[local60] = local136;
			}
		}
		return local16;
	}
}
