import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	private int anInt9602 = 3072;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
	private int anInt9604 = 1024;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	private int anInt9612 = 2048;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static164.anInt8839; local31++) {
				local19[local31] = this.anInt9604 + (this.anInt9612 * local29[local31] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(27) int[][] local27 = this.method8337(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static164.anInt8839; local53++) {
				local43[local53] = (local31[local53] * this.anInt9612 >> 12) + this.anInt9604;
				local47[local53] = (this.anInt9612 * local35[local53] >> 12) + this.anInt9604;
				local51[local53] = (local39[local53] * this.anInt9612 >> 12) + this.anInt9604;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		this.anInt9612 = this.anInt9602 - this.anInt9604;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9604 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt9602 = arg1.method8414();
		} else if (arg0 == 2) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}
}
