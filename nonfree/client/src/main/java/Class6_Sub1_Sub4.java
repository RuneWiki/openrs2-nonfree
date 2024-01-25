import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	private int anInt251 = 4096;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(29) int[] local29 = this.method5609(0, Static113.anInt2099 & arg0 - 1);
			@Pc(35) int[] local35 = this.method5609(0, arg0);
			@Pc(45) int[] local45 = this.method5609(0, Static113.anInt2099 & arg0 + 1);
			for (@Pc(47) int local47 = 0; local47 < Static299.anInt5659; local47++) {
				@Pc(61) int local61 = (local45[local47] - local29[local47]) * this.anInt251;
				@Pc(80) int local80 = (local35[Static76.anInt2850 & local47 + 1] - local35[Static76.anInt2850 & local47 - 1]) * this.anInt251;
				@Pc(84) int local84 = local80 >> 12;
				@Pc(88) int local88 = local61 >> 12;
				@Pc(94) int local94 = local84 * local84 >> 12;
				@Pc(100) int local100 = local88 * local88 >> 12;
				@Pc(114) int local114 = (int) (Math.sqrt((double) ((float) (local100 + local94 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local114 == 0 ? 0 : 16777216 / local114;
				local11[local47] = 4096 - local125;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt251 = arg0.method4021();
		}
	}
}
