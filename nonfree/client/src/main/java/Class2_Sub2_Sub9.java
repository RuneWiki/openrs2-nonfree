import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
	private int anInt3518 = 3072;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
	private int anInt3522 = 1024;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
	private int anInt3523 = 2048;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(27) int[][] local27 = this.method7947(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static153.anInt3070; local53++) {
				local43[local53] = (this.anInt3523 * local31[local53] >> 12) + this.anInt3522;
				local47[local53] = this.anInt3522 + (this.anInt3523 * local35[local53] >> 12);
				local51[local53] = (this.anInt3523 * local39[local53] >> 12) + this.anInt3522;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3522 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt3518 = arg0.method4294();
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		this.anInt3523 = this.anInt3518 - this.anInt3522;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(21) int[] local21 = this.method7951(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static153.anInt3070; local23++) {
				local11[local23] = this.anInt3522 + (local21[local23] * this.anInt3523 >> 12);
			}
		}
		return local11;
	}
}
