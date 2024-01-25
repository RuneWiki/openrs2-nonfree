import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class5_Sub3_Sub30 extends Class5_Sub3 {

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
	private int anInt8786 = 2048;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
	private int anInt8791 = 3072;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	private int anInt8787 = 1024;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		this.anInt8786 = this.anInt8791 - this.anInt8787;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(27) int[] local27 = this.method9205(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static7.anInt102; local29++) {
				local17[local29] = (this.anInt8786 * local27[local29] >> 12) + this.anInt8787;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8787 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt8791 = arg0.method7333();
		} else if (arg1 == 2) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(27) int[][] local27 = this.method9207(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static7.anInt102; local53++) {
				local43[local53] = (this.anInt8786 * local31[local53] >> 12) + this.anInt8787;
				local47[local53] = (local35[local53] * this.anInt8786 >> 12) + this.anInt8787;
				local51[local53] = (local39[local53] * this.anInt8786 >> 12) + this.anInt8787;
			}
		}
		return local17;
	}
}
