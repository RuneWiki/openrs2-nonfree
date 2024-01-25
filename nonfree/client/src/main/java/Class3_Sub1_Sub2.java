import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	private int anInt106 = 3072;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
	private int anInt105 = 2048;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
	private int anInt107 = 1024;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(29) int[] local29 = this.method5547(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static238.anInt4221; local31++) {
				local19[local31] = (local29[local31] * this.anInt105 >> 12) + this.anInt107;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(27) int[][] local27 = this.method5551(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static238.anInt4221; local53++) {
				local43[local53] = (local31[local53] * this.anInt105 >> 12) + this.anInt107;
				local47[local53] = (local35[local53] * this.anInt105 >> 12) + this.anInt107;
				local51[local53] = (local39[local53] * this.anInt105 >> 12) + this.anInt107;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		this.anInt105 = this.anInt106 - this.anInt107;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt107 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt106 = arg0.method2767();
		} else if (arg1 == 2) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}
}
