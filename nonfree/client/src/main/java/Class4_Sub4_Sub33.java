import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class4_Sub4_Sub33 extends Class4_Sub4 {

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	private int anInt7675 = 1;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	private int anInt7674 = 0;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
	private int anInt7678 = 0;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7674 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt7678 = arg1.method6015();
		} else if (arg0 == 3) {
			this.anInt7675 = arg1.method6015();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(19) int local19 = Static450.anIntArray619[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static560.anInt9394; local27++) {
				@Pc(33) int local33 = Static80.anIntArray212[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(53) int local53;
				if (this.anInt7674 == 0) {
					local53 = (local33 - local19) * this.anInt7675;
				} else {
					@Pc(65) int local65 = local39 * local39 + local25 * local25 >> 12;
					local53 = (int) (Math.sqrt((double) ((float) local65 / 4096.0F)) * 4096.0D);
					local53 = (int) ((double) (this.anInt7675 * local53) * 3.141592653589793D);
				}
				local53 -= local53 & 0xFFFFF000;
				if (this.anInt7678 == 0) {
					local53 = Static427.anIntArray604[local53 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7678 == 2) {
					local53 -= 2048;
					if (local53 < 0) {
						local53 = -local53;
					}
					local53 = 2048 - local53 << 1;
				}
				local11[local27] = local53;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		Static61.method1040();
	}
}
