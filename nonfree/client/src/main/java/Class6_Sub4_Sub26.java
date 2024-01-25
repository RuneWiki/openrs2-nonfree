import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class6_Sub4_Sub26 extends Class6_Sub4 {

	@OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
	private int anInt6826 = 4096;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt6826 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(30) int[] local30 = this.method8313(Static2.anInt12 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method8313(arg0, 0);
			@Pc(46) int[] local46 = this.method8313(arg0 + 1 & Static2.anInt12, 0);
			for (@Pc(48) int local48 = 0; local48 < Static6.anInt111; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt6826;
				@Pc(81) int local81 = (local36[Static325.anInt6209 & local48 + 1] - local36[local48 - 1 & Static325.anInt6209]) * this.anInt6826;
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local62 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local95 + local101 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local123;
			}
		}
		return local16;
	}
}
