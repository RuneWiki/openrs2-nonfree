import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub10_Sub26 extends Class2_Sub10 {

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	private int anInt8157 = 4096;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(33) int[] local33 = this.method8402(arg0 - 1 & Static93.anInt1860, 0);
			@Pc(39) int[] local39 = this.method8402(arg0, 0);
			@Pc(49) int[] local49 = this.method8402(Static93.anInt1860 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static93.anInt1862; local51++) {
				@Pc(65) int local65 = this.anInt8157 * (local49[local51] - local33[local51]);
				@Pc(84) int local84 = this.anInt8157 * (local39[Static603.anInt9994 & local51 + 1] - local39[local51 - 1 & Static603.anInt9994]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local65 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local98 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local130;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8157 = arg0.method6884();
		}
	}
}
