import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub9_Sub30 extends Class3_Sub9 {

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
	private int anInt7402 = 2048;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
	private int anInt7404 = 3072;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
	private int anInt7405 = 1024;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		this.anInt7402 = this.anInt7404 - this.anInt7405;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(28) int[][] local28 = this.method9167(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static62.anInt1251; local54++) {
				local44[local54] = this.anInt7405 + (local32[local54] * this.anInt7402 >> 12);
				local48[local54] = (this.anInt7402 * local36[local54] >> 12) + this.anInt7405;
				local52[local54] = this.anInt7405 + (this.anInt7402 * local40[local54] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7405 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt7404 = arg0.method8593();
		} else if (arg1 == 2) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int[] local26 = this.method9162(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1251; local28++) {
				local16[local28] = this.anInt7405 + (local26[local28] * this.anInt7402 >> 12);
			}
		}
		return local16;
	}
}
