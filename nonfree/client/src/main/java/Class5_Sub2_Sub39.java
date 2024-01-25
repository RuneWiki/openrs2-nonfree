import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class5_Sub2_Sub39 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ww", name = "D", descriptor = "I")
	private int anInt10649;

	@OriginalMember(owner = "client!ww", name = "H", descriptor = "[I")
	private int[] anIntArray605;

	@OriginalMember(owner = "client!ww", name = "I", descriptor = "I")
	private int anInt10653;

	@OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
	private int anInt10652 = -1;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub39() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10652 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(BII)V")
	@Override
	public void method9043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method9043(arg0, arg1);
		if (this.anInt10652 >= 0 && Static493.anInterface3_11 != null) {
			@Pc(29) int local29 = Static493.anInterface3_11.method4656(this.anInt10652).aBoolean293 ? 64 : 128;
			this.anIntArray605 = Static493.anInterface3_11.method4653(1.0F, local29, this.anInt10652, local29, false);
			this.anInt10649 = local29;
			this.anInt10653 = local29;
		}
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(36) int local36 = this.anInt10649 * (this.anInt10653 == Static591.anInt9907 ? arg0 : this.anInt10653 * arg0 / Static591.anInt9907);
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			@Pc(54) int local54;
			@Pc(63) int local63;
			if (this.anInt10649 == Static597.anInt10025) {
				for (local54 = 0; local54 < Static597.anInt10025; local54++) {
					local63 = this.anIntArray605[local36++];
					local48[local54] = (local63 & 0xFF) << 4;
					local44[local54] = local63 >> 4 & 0xFF0;
					local40[local54] = local63 >> 12 & 0xFF0;
				}
			} else {
				for (local54 = 0; local54 < Static597.anInt10025; local54++) {
					local63 = this.anInt10649 * local54 / Static597.anInt10025;
					@Pc(70) int local70 = this.anIntArray605[local63 + local36];
					local48[local54] = (local70 & 0xFF) << 4;
					local44[local54] = local70 >> 4 & 0xFF0;
					local40[local54] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)I")
	@Override
	public int method9032() {
		return this.anInt10652;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V")
	@Override
	public void method9038() {
		super.method9038();
		this.anIntArray605 = null;
	}
}
