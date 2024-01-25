import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!un", name = "H", descriptor = "I")
	private int anInt5970 = 32768;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		Static204.method4476();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(27) int[] local27 = this.method5547(arg0, 1);
			@Pc(33) int[] local33 = this.method5547(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static238.anInt4221; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt5970 * local33[local35] >> 12;
				@Pc(62) int local62 = Static81.anIntArray164[local45] * local54 >> 12;
				@Pc(70) int local70 = Static167.anIntArray309[local45] * local54 >> 12;
				@Pc(78) int local78 = (local62 >> 12) + local35 & Static171.anInt3000;
				@Pc(87) int local87 = Static300.anInt5187 & arg0 + (local70 >> 12);
				@Pc(93) int[] local93 = this.method5547(local87, 0);
				local11[local35] = local93[local78];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5970 = arg0.method2767() << 4;
		} else if (arg1 == 1) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(30) int[] local30 = this.method5547(arg0, 1);
			@Pc(36) int[] local36 = this.method5547(arg0, 2);
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			for (@Pc(50) int local50 = 0; local50 < Static238.anInt4221; local50++) {
				@Pc(62) int local62 = local30[local50] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local36[local50] * this.anInt5970 >> 12;
				@Pc(79) int local79 = local71 * Static81.anIntArray164[local62] >> 12;
				@Pc(87) int local87 = Static167.anIntArray309[local62] * local71 >> 12;
				@Pc(95) int local95 = (local79 >> 12) + local50 & Static171.anInt3000;
				@Pc(103) int local103 = (local87 >> 12) + arg0 & Static300.anInt5187;
				@Pc(109) int[][] local109 = this.method5551(0, local103);
				local40[local50] = local109[0][local95];
				local44[local50] = local109[1][local95];
				local48[local50] = local109[2][local95];
			}
		}
		return local11;
	}
}
