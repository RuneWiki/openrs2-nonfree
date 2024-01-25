import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
	private int anInt131 = 1024;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
	private int anInt134 = 3072;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	private int anInt136 = 2048;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(26) int[] local26 = this.method8165(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static289.anInt5549; local28++) {
				local16[local28] = this.anInt131 + (this.anInt136 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(31) int[][] local31 = this.method8162(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static289.anInt5549; local57++) {
				local47[local57] = this.anInt131 + (this.anInt136 * local35[local57] >> 12);
				local51[local57] = (local39[local57] * this.anInt136 >> 12) + this.anInt131;
				local55[local57] = this.anInt131 + (this.anInt136 * local43[local57] >> 12);
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt131 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt134 = arg1.method4999();
		} else if (arg0 == 2) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		this.anInt136 = this.anInt134 - this.anInt131;
	}
}
