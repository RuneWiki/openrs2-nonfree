import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
	private int anInt4603 = 1;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	private int anInt4605 = 1;

	static {
		new Class189(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
		new Class189("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4603 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt4605 = arg0.method2582();
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(23) int local23 = this.anInt4605 + this.anInt4605 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt4603 + this.anInt4603 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(65) int local65;
			@Pc(67) int local67;
			for (@Pc(47) int local47 = arg0 - this.anInt4605; local47 <= arg0 + this.anInt4605; local47++) {
				@Pc(57) int[][] local57 = this.method5899(0, local47 & Static350.anInt3654);
				@Pc(61) int[][] local61 = new int[3][Static406.anInt6694];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt4603; local83 <= this.anInt4603; local83++) {
					@Pc(89) int local89 = local83 & Static5.anInt72;
					local63 += local71[local89];
					local67 += local79[local89];
					local65 += local75[local89];
				}
				@Pc(120) int[] local120 = local61[0];
				@Pc(124) int[] local124 = local61[1];
				@Pc(128) int[] local128 = local61[2];
				@Pc(130) int local130 = 0;
				while (Static406.anInt6694 > local130) {
					local120[local130] = local39 * local63 >> 16;
					local124[local130] = local39 * local65 >> 16;
					local128[local130] = local67 * local39 >> 16;
					@Pc(164) int local164 = local130 - this.anInt4603 & Static5.anInt72;
					local130++;
					local67 -= local79[local164];
					local65 -= local75[local164];
					local63 -= local71[local164];
					@Pc(191) int local191 = local130 + this.anInt4603 & Static5.anInt72;
					local67 += local79[local191];
					local63 += local71[local191];
					local65 += local75[local191];
				}
				local42[this.anInt4605 + local47 - arg0] = local61;
			}
			@Pc(233) int[] local233 = local11[0];
			@Pc(237) int[] local237 = local11[1];
			@Pc(241) int[] local241 = local11[2];
			for (local65 = 0; local65 < Static406.anInt6694; local65++) {
				local67 = 0;
				@Pc(249) int local249 = 0;
				@Pc(251) int local251 = 0;
				for (@Pc(253) int local253 = 0; local253 < local23; local253++) {
					@Pc(259) int[][] local259 = local42[local253];
					local67 += local259[0][local65];
					local251 += local259[2][local65];
					local249 += local259[1][local65];
				}
				local233[local65] = local67 * local27 >> 16;
				local237[local65] = local249 * local27 >> 16;
				local241[local65] = local251 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(27) int local27 = this.anInt4605 + this.anInt4605 + 1;
			@Pc(31) int local31 = 65536 / local27;
			@Pc(39) int local39 = this.anInt4603 + this.anInt4603 + 1;
			@Pc(43) int local43 = 65536 / local39;
			@Pc(46) int[][] local46 = new int[local27][];
			@Pc(69) int local69;
			for (@Pc(52) int local52 = arg0 - this.anInt4605; local52 <= arg0 + this.anInt4605; local52++) {
				@Pc(64) int[] local64 = this.method5894(0, Static350.anInt3654 & local52);
				@Pc(67) int[] local67 = new int[Static406.anInt6694];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt4603; local73 <= this.anInt4603; local73++) {
					local69 += local64[local73 & Static5.anInt72];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static406.anInt6694) {
					local67[local94] = local43 * local69 >> 16;
					local69 -= local64[local94 - this.anInt4603 & Static5.anInt72];
					local94++;
					local69 += local64[Static5.anInt72 & this.anInt4603 + local94];
				}
				local46[local52 + this.anInt4605 - arg0] = local67;
			}
			for (@Pc(150) int local150 = 0; local150 < Static406.anInt6694; local150++) {
				@Pc(154) int local154 = 0;
				for (local69 = 0; local69 < local27; local69++) {
					local154 += local46[local69][local150];
				}
				local15[local150] = local154 * local31 >> 16;
			}
		}
		return local15;
	}
}
