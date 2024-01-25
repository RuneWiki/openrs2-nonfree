import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class1_Sub8_Sub38 extends Class1_Sub8 {

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
	private int anInt7733 = 4096;

	@OriginalMember(owner = "client!vu", name = "I", descriptor = "Z")
	private boolean aBoolean503 = true;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(25) int[] local25 = this.method6037(0, Static443.anInt7904 & arg0 - 1);
			@Pc(31) int[] local31 = this.method6037(0, arg0);
			@Pc(41) int[] local41 = this.method6037(0, Static443.anInt7904 & arg0 + 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static18.anInt439; local55++) {
				@Pc(69) int local69 = this.anInt7733 * (local41[local55] - local25[local55]);
				@Pc(88) int local88 = this.anInt7733 * (local31[Static283.anInt5397 & local55 + 1] - local31[local55 - 1 & Static283.anInt5397]);
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local69 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((float) (local102 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126;
				@Pc(130) int local130;
				@Pc(128) int local128;
				if (local122 == 0) {
					local126 = 0;
					local128 = 0;
					local130 = 0;
				} else {
					local128 = 16777216 / local122;
					local126 = local88 / local122;
					local130 = local69 / local122;
				}
				if (this.aBoolean503) {
					local130 = (local130 >> 1) + 2048;
					local128 = (local128 >> 1) + 2048;
					local126 = (local126 >> 1) + 2048;
				}
				local45[local55] = local126;
				local49[local55] = local130;
				local53[local55] = local128;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7733 = arg1.method1177();
		} else if (arg0 == 1) {
			this.aBoolean503 = arg1.method1171() == 1;
		}
	}
}
