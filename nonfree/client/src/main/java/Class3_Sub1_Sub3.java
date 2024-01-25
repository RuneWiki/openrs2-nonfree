import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
	private int anInt1665 = 4096;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1665 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(33) int[] local33 = this.method9577(0, Static652.anInt2344 & arg0 - 1);
			@Pc(39) int[] local39 = this.method9577(0, arg0);
			@Pc(49) int[] local49 = this.method9577(0, arg0 + 1 & Static652.anInt2344);
			for (@Pc(51) int local51 = 0; local51 < Static379.anInt5859; local51++) {
				@Pc(65) int local65 = this.anInt1665 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = (local39[local51 + 1 & Static711.anInt10997] - local39[Static711.anInt10997 & local51 - 1]) * this.anInt1665;
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(120) int local120 = (int) (Math.sqrt((double) ((float) (local99 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132 = local120 == 0 ? 0 : 16777216 / local120;
				local17[local51] = 4096 - local132;
			}
		}
		return local17;
	}
}
