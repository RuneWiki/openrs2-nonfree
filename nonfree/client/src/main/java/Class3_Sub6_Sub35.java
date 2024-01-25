import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class3_Sub6_Sub35 extends Class3_Sub6 {

	@OriginalMember(owner = "client!un", name = "G", descriptor = "I")
	private int anInt8594 = 4096;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8594 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(27) int[] local27 = this.method7769(Static68.anInt1579 & arg0 - 1, 0);
			@Pc(35) int[] local35 = this.method7769(arg0, 0);
			@Pc(45) int[] local45 = this.method7769(arg0 + 1 & Static68.anInt1579, 0);
			for (@Pc(47) int local47 = 0; local47 < Static521.anInt8383; local47++) {
				@Pc(61) int local61 = this.anInt8594 * (local45[local47] - local27[local47]);
				@Pc(81) int local81 = this.anInt8594 * (local35[local47 + 1 & Static296.anInt5049] - local35[local47 - 1 & Static296.anInt5049]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local95 + local101 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local47] = 4096 - local127;
			}
		}
		return local11;
	}
}
