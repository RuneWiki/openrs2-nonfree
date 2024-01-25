import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	private int anInt90 = 1024;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	private int anInt93 = 2048;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	private int anInt95 = 3072;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(23) int[] local23 = this.method5772(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static148.anInt2666; local25++) {
				local13[local25] = (this.anInt93 * local23[local25] >> 12) + this.anInt90;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt90 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt95 = arg1.method5598();
		} else if (arg0 == 2) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		this.anInt93 = this.anInt95 - this.anInt90;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(27) int[][] local27 = this.method5764(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static148.anInt2666; local53++) {
				local43[local53] = this.anInt90 + (this.anInt93 * local31[local53] >> 12);
				local47[local53] = this.anInt90 + (this.anInt93 * local35[local53] >> 12);
				local51[local53] = this.anInt90 + (local39[local53] * this.anInt93 >> 12);
			}
		}
		return local17;
	}
}
