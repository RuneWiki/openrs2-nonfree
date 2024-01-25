import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!m", name = "F", descriptor = "[I")
	protected int[] anIntArray165;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	protected int anInt2810;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	protected int anInt2812;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "I")
	private int anInt2809 = -1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub13() {
		super(0, false);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310 && this.method2413()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = (this.anInt2812 == Static591.anInt9907 ? arg0 : arg0 * this.anInt2812 / Static591.anInt9907) * this.anInt2810;
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (Static597.anInt10025 == this.anInt2810) {
				for (local53 = 0; local53 < Static597.anInt10025; local53++) {
					local61 = this.anIntArray165[local47++];
					local31[local53] = (local61 & 0xFF) << 4;
					local27[local53] = local61 >> 4 & 0xFF0;
					local23[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static597.anInt10025; local53++) {
					local61 = local53 * this.anInt2810 / Static597.anInt10025;
					@Pc(109) int local109 = this.anIntArray165[local47 + local61];
					local31[local53] = (local109 & 0xFF) << 4;
					local27[local53] = local109 >> 4 & 0xFF0;
					local23[local53] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	@Override
	public final int method9039() {
		return this.anInt2809;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public final void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2809 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(B)Z")
	protected final boolean method2413() {
		if (this.anIntArray165 != null) {
			return true;
		} else if (this.anInt2809 >= 0) {
			@Pc(24) Class131 local24 = Static243.anInt4465 < 0 ? Static649.method2900(Static431.aClass207_75, this.anInt2809) : Static649.method2888(Static431.aClass207_75, Static243.anInt4465, this.anInt2809);
			local24.method2893();
			this.anIntArray165 = local24.method2889();
			this.anInt2810 = local24.anInt3344;
			this.anInt2812 = local24.anInt3345;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	@Override
	public final void method9038() {
		super.method9038();
		this.anIntArray165 = null;
	}
}
