import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
	private int anInt1580;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
	private int anInt1584;

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
	private int anInt1590;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		Static6.method99();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(19) int local19 = Static125.anIntArray336[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static141.anInt3261; local27++) {
				@Pc(33) int local33 = Static85.anIntArray47[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(65) int local65;
				if (this.anInt1580 == 0) {
					local65 = (local33 - local19) * this.anInt1584;
				} else {
					@Pc(56) int local56 = local39 * local39 + local25 * local25 >> 12;
					local65 = (int) (Math.sqrt((double) (local56 / 4096)) * 4096.0D);
					local65 = (int) ((double) (local65 * this.anInt1584) * 3.141592653589793D);
				}
				local65 -= local65 & 0xFFFFF000;
				if (this.anInt1590 == 0) {
					local65 = Static113.anIntArray218[local65 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1590 == 2) {
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

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1580 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt1590 = arg1.method191();
		} else if (arg0 == 3) {
			this.anInt1584 = arg1.method191();
		}
	}
}
