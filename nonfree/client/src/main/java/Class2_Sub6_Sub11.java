import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class2_Sub6_Sub11 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
	private int anInt3191;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private int anInt3195;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
	private int anInt3192 = -1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(40) int local40 = this.anInt3191 * (Static262.anInt5589 == this.anInt3195 ? arg0 : arg0 * this.anInt3195 / Static262.anInt5589);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (Static51.anInt1085 == this.anInt3191) {
				for (local62 = 0; local62 < Static51.anInt1085; local62++) {
					local70 = this.anIntArray213[local40++];
					local52[local62] = (local70 & 0xFF) << 4;
					local48[local62] = local70 >> 4 & 0xFF0;
					local44[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static51.anInt1085; local62++) {
					local70 = local62 * this.anInt3191 / Static51.anInt1085;
					@Pc(118) int local118 = this.anIntArray213[local70 + local40];
					local52[local62] = (local118 & 0xFF) << 4;
					local48[local62] = local118 >> 4 & 0xFF0;
					local44[local62] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	@Override
	public void method8471() {
		super.method8471();
		this.anIntArray213 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	@Override
	public void method8460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8460(arg0, arg1);
		if (this.anInt3192 >= 0 && Static171.anInterface6_11 != null) {
			@Pc(29) int local29 = Static171.anInterface6_11.method1492(this.anInt3192).aBoolean309 ? 64 : 128;
			this.anIntArray213 = Static171.anInterface6_11.method1489(false, local29, 1.0F, local29, this.anInt3192);
			this.anInt3195 = local29;
			this.anInt3191 = local29;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt3192 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)I")
	@Override
	public int method8472() {
		return this.anInt3192;
	}
}
