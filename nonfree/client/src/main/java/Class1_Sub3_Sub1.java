import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!aca", name = "K", descriptor = "I")
	private int anInt158 = 1;

	@OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
	private int anInt157 = 0;

	@OriginalMember(owner = "client!aca", name = "N", descriptor = "I")
	private int anInt160 = 0;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(19) int local19 = Static7.anIntArray20[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static452.anInt7734; local27++) {
				@Pc(33) int local33 = Static228.anIntArray442[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(65) int local65;
				if (this.anInt160 == 0) {
					local65 = (local33 - local19) * this.anInt158;
				} else {
					@Pc(55) int local55 = local25 * local25 + local39 * local39 >> 12;
					local65 = (int) (Math.sqrt((double) ((float) local55 / 4096.0F)) * 4096.0D);
					local65 = (int) ((double) (local65 * this.anInt158) * 3.141592653589793D);
				}
				local65 -= local65 & 0xFFFFF000;
				if (this.anInt157 == 0) {
					local65 = Static90.anIntArray186[local65 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt157 == 2) {
					local65 -= 2048;
					if (local65 < 0) {
						local65 = -local65;
					}
					local65 = 2048 - local65 << 1;
				}
				local11[local27] = local65;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt160 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt157 = arg0.method3922();
		} else if (arg1 == 3) {
			this.anInt158 = arg0.method3922();
		}
	}

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		Static52.method1027();
	}
}
