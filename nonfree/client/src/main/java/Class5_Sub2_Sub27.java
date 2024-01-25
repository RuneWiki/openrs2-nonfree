import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class5_Sub2_Sub27 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	private int anInt7910 = 32768;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub27() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(21) int[] local21 = this.method8821(arg0, 1);
			@Pc(27) int[] local27 = this.method8821(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static314.anInt6320; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt7910 >> 12;
				@Pc(70) int local70 = Static46.anIntArray61[local53] * local62 >> 12;
				@Pc(78) int local78 = Static457.anIntArray613[local53] * local62 >> 12;
				@Pc(86) int local86 = Static550.anInt6610 & local41 + (local70 >> 12);
				@Pc(95) int local95 = Static271.anInt4487 & arg0 + (local78 >> 12);
				@Pc(101) int[][] local101 = this.method8823(local95, 0);
				local31[local41] = local101[0][local86];
				local35[local41] = local101[1][local86];
				local39[local41] = local101[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(27) int[] local27 = this.method8821(arg0, 1);
			@Pc(33) int[] local33 = this.method8821(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static314.anInt6320; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt7910 * local33[local35] >> 12;
				@Pc(62) int local62 = local54 * Static46.anIntArray61[local45] >> 12;
				@Pc(70) int local70 = local54 * Static457.anIntArray613[local45] >> 12;
				@Pc(78) int local78 = local35 + (local62 >> 12) & Static550.anInt6610;
				@Pc(86) int local86 = Static271.anInt4487 & (local70 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method8821(local86, 0);
				local17[local35] = local92[local78];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7910 = arg0.method8631() << 4;
		} else if (arg1 == 1) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		Static606.method8449();
	}
}
