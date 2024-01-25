import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
	private int anInt8271 = 4096;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
	private boolean aBoolean565 = true;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(32) int[] local32 = this.method7911(arg0 - 1 & Static226.anInt4534, 0);
			@Pc(38) int[] local38 = this.method7911(arg0, 0);
			@Pc(48) int[] local48 = this.method7911(Static226.anInt4534 & arg0 + 1, 0);
			@Pc(52) int[] local52 = local18[0];
			@Pc(56) int[] local56 = local18[1];
			@Pc(60) int[] local60 = local18[2];
			for (@Pc(62) int local62 = 0; local62 < Static236.anInt4609; local62++) {
				@Pc(76) int local76 = (local48[local62] - local32[local62]) * this.anInt8271;
				@Pc(96) int local96 = (local38[Static36.anInt1319 & local62 + 1] - local38[local62 - 1 & Static36.anInt1319]) * this.anInt8271;
				@Pc(100) int local100 = local96 >> 12;
				@Pc(104) int local104 = local76 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local116 + local110 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(134) int local134;
				@Pc(138) int local138;
				if (local130 == 0) {
					local134 = 0;
					local136 = 0;
					local138 = 0;
				} else {
					local138 = 16777216 / local130;
					local134 = local76 / local130;
					local136 = local96 / local130;
				}
				if (this.aBoolean565) {
					local138 = (local138 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local52[local62] = local136;
				local56[local62] = local134;
				local60[local62] = local138;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8271 = arg0.method3056();
		} else if (arg1 == 1) {
			this.aBoolean565 = arg0.method3043() == 1;
		}
	}
}
