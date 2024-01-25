import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
	private int anInt7097 = 4096;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7097 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(33) int[] local33 = this.method8340(Static46.anInt1029 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method8340(arg0, 0);
			@Pc(49) int[] local49 = this.method8340(Static46.anInt1029 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static164.anInt8839; local51++) {
				@Pc(65) int local65 = this.anInt7097 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = (local39[local51 + 1 & Static52.anInt1120] - local39[Static52.anInt1120 & local51 - 1]) * this.anInt7097;
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local105 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local119 == 0 ? 0 : 16777216 / local119;
				local11[local51] = 4096 - local127;
			}
		}
		return local11;
	}
}
