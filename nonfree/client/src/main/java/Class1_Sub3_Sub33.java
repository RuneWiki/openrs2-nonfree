import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	private int anInt4986 = 4096;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4986 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(33) int[] local33 = this.method4117(0, arg0 - 1 & Static42.anInt1193);
			@Pc(39) int[] local39 = this.method4117(0, arg0);
			@Pc(49) int[] local49 = this.method4117(0, Static42.anInt1193 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static110.anInt2934; local51++) {
				@Pc(72) int local72 = this.anInt4986 * (local39[Static2.anInt38 & local51 + 1] - local39[Static2.anInt38 & local51 - 1]);
				@Pc(84) int local84 = (local49[local51] - local33[local51]) * this.anInt4986;
				@Pc(88) int local88 = local72 >> 12;
				@Pc(92) int local92 = local84 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local7[local51] = 4096 - local126;
			}
		}
		return local7;
	}
}
