import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	private int anInt77 = 4096;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(35) int[] local35 = this.method6037(arg0 - 1 & Static36.anInt893, 0);
			@Pc(41) int[] local41 = this.method6037(arg0, 0);
			@Pc(51) int[] local51 = this.method6037(arg0 + 1 & Static36.anInt893, 0);
			@Pc(55) int[] local55 = local11[0];
			@Pc(59) int[] local59 = local11[1];
			@Pc(63) int[] local63 = local11[2];
			for (@Pc(65) int local65 = 0; local65 < Static131.anInt2581; local65++) {
				@Pc(79) int local79 = (local51[local65] - local35[local65]) * this.anInt77;
				@Pc(99) int local99 = (local41[Static287.anInt5227 & local65 + 1] - local41[Static287.anInt5227 & local65 - 1]) * this.anInt77;
				@Pc(103) int local103 = local99 >> 12;
				@Pc(107) int local107 = local79 >> 12;
				@Pc(113) int local113 = local103 * local103 >> 12;
				@Pc(119) int local119 = local107 * local107 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((float) (local113 + local119 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(151) int local151;
				@Pc(143) int local143;
				@Pc(147) int local147;
				if (local134 == 0) {
					local147 = 0;
					local151 = 0;
					local143 = 0;
				} else {
					local143 = local79 / local134;
					local147 = 16777216 / local134;
					local151 = local99 / local134;
				}
				if (this.aBoolean6) {
					local147 = (local147 >> 1) + 2048;
					local151 = (local151 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local55[local65] = local151;
				local59[local65] = local143;
				local63[local65] = local147;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt77 = arg1.method3711();
		} else if (arg0 == 1) {
			this.aBoolean6 = arg1.method3737() == 1;
		}
	}
}
