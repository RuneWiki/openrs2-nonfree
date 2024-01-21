import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class2_Sub4_Sub3 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
	private int anInt635 = 0;

	@OriginalMember(owner = "client!cj", name = "mb", descriptor = "I")
	private int anInt639 = 0;

	@OriginalMember(owner = "client!cj", name = "qb", descriptor = "I")
	private int anInt642 = 1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		Static172.method516();
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(19) int local19 = Static2.anIntArray5[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static118.anInt2608; local27++) {
				@Pc(33) int local33 = Static141.anIntArray130[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(63) int local63;
				if (this.anInt639 == 0) {
					local63 = this.anInt642 * (local33 - local19);
				} else {
					@Pc(53) int local53 = local39 * local39 + local25 * local25 >> 12;
					local63 = (int) (Math.sqrt((double) ((float) local53 / 4096.0F)) * 4096.0D);
					local63 = (int) ((double) (this.anInt642 * local63) * 3.141592653589793D);
				}
				local63 -= local63 & 0xFFFFF000;
				if (this.anInt635 == 0) {
					local63 = Static159.anIntArray290[local63 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt635 == 2) {
					local63 -= 2048;
					if (local63 < 0) {
						local63 = -local63;
					}
					local63 = 2048 - local63 << 1;
				}
				local11[local27] = local63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt639 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt635 = arg1.method1534();
		} else if (arg0 == 3) {
			this.anInt642 = arg1.method1534();
		}
	}
}
