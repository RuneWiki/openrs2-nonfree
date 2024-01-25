import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fda", name = "F", descriptor = "I")
	private int anInt3095 = 1024;

	@OriginalMember(owner = "client!fda", name = "I", descriptor = "I")
	private int anInt3098 = 3072;

	@OriginalMember(owner = "client!fda", name = "G", descriptor = "I")
	private int anInt3096 = 2048;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(27) int[][] local27 = this.method7910(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static236.anInt4609; local53++) {
				local43[local53] = (this.anInt3096 * local31[local53] >> 12) + this.anInt3095;
				local47[local53] = this.anInt3095 + (local35[local53] * this.anInt3096 >> 12);
				local51[local53] = this.anInt3095 + (local39[local53] * this.anInt3096 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		this.anInt3096 = this.anInt3098 - this.anInt3095;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3095 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt3098 = arg0.method3056();
		} else if (arg1 == 2) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(29) int[] local29 = this.method7911(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static236.anInt4609; local31++) {
				local19[local31] = this.anInt3095 + (this.anInt3096 * local29[local31] >> 12);
			}
		}
		return local19;
	}
}
