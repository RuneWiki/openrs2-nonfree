import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
	private int anInt4225 = 4096;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "Z")
	private boolean aBoolean321 = true;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(35) int[] local35 = this.method4450(0, arg0 - 1 & Static9.anInt244);
			@Pc(41) int[] local41 = this.method4450(0, arg0);
			@Pc(51) int[] local51 = this.method4450(0, Static9.anInt244 & arg0 + 1);
			@Pc(55) int[] local55 = local20[0];
			@Pc(59) int[] local59 = local20[1];
			@Pc(63) int[] local63 = local20[2];
			for (@Pc(65) int local65 = 0; local65 < Static131.anInt2513; local65++) {
				@Pc(88) int local88 = (local41[local65 + 1 & Static11.anInt321] - local41[Static11.anInt321 & local65 - 1]) * this.anInt4225;
				@Pc(100) int local100 = (local51[local65] - local35[local65]) * this.anInt4225;
				@Pc(104) int local104 = local88 >> 12;
				@Pc(108) int local108 = local100 >> 12;
				@Pc(114) int local114 = local104 * local104 >> 12;
				@Pc(120) int local120 = local108 * local108 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((float) (local114 + local120 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(147) int local147;
				@Pc(143) int local143;
				@Pc(151) int local151;
				if (local134 == 0) {
					local143 = 0;
					local147 = 0;
					local151 = 0;
				} else {
					local143 = local100 / local134;
					local147 = local88 / local134;
					local151 = 16777216 / local134;
				}
				if (this.aBoolean321) {
					local143 = (local143 >> 1) + 2048;
					local151 = (local151 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
				}
				local55[local65] = local147;
				local59[local65] = local143;
				local63[local65] = local151;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4225 = arg0.method3107();
		} else if (arg1 == 1) {
			this.aBoolean321 = arg0.method3122() == 1;
		}
	}
}
