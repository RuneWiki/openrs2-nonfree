import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
	private int anInt1103;

	@OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
	private int anInt1108;

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
	private int anInt1106;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(15) int local15 = Static166.anIntArray619[arg0];
			@Pc(21) int local21 = local15 - 2048 >> 1;
			for (@Pc(23) int local23 = 0; local23 < Static129.anInt3118; local23++) {
				@Pc(29) int local29 = Static163.anIntArray577[local23];
				@Pc(35) int local35 = local29 - 2048 >> 1;
				@Pc(60) int local60;
				if (this.anInt1106 == 0) {
					local60 = (local29 - local15) * this.anInt1103;
				} else {
					@Pc(51) int local51 = local21 * local21 + local35 * local35 >> 12;
					local60 = (int) (Math.sqrt((double) (local51 / 4096)) * 4096.0D);
					local60 = (int) ((double) (local60 * this.anInt1103) * 3.141592653589793D);
				}
				local60 -= local60 & 0xFFFFF000;
				if (this.anInt1108 == 0) {
					local60 = Static130.anIntArray465[local60 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1108 == 2) {
					local60 -= 2048;
					if (local60 < 0) {
						local60 = -local60;
					}
					local60 = 2048 - local60 << 1;
				}
				local7[local23] = local60;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1106 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt1108 = arg0.method2387();
		} else if (arg1 == 3) {
			this.anInt1103 = arg0.method2387();
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		Static128.method2196();
	}
}
