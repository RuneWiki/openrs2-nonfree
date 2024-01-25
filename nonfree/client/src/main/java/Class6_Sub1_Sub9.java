import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class6_Sub1_Sub9 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
	private int anInt1765 = 0;

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
	private int anInt1774 = 1;

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
	private int anInt1770 = 0;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1765 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt1770 = arg0.method3972();
		} else if (arg1 == 3) {
			this.anInt1774 = arg0.method3972();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(25) int local25 = Static273.anIntArray703[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static299.anInt5659; local33++) {
				@Pc(39) int local39 = Static18.anIntArray32[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(56) int local56;
				if (this.anInt1765 == 0) {
					local56 = (local39 - local25) * this.anInt1774;
				} else {
					@Pc(68) int local68 = local45 * local45 + local31 * local31 >> 12;
					local56 = (int) (Math.sqrt((double) ((float) local68 / 4096.0F)) * 4096.0D);
					local56 = (int) ((double) (this.anInt1774 * local56) * 3.141592653589793D);
				}
				local56 -= local56 & 0xFFFFF000;
				if (this.anInt1770 == 0) {
					local56 = Static342.anIntArray707[local56 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1770 == 2) {
					local56 -= 2048;
					if (local56 < 0) {
						local56 = -local56;
					}
					local56 = 2048 - local56 << 1;
				}
				local11[local33] = local56;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		Static86.method1476();
	}
}
