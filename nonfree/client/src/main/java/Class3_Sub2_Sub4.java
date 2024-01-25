import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	private int anInt1210 = 0;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	private int anInt1212 = 1;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	private int anInt1211 = 0;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1211 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt1210 = arg0.method4225();
		} else if (arg1 == 3) {
			this.anInt1212 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		Static511.method7631();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(25) int local25 = Static372.anIntArray207[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static491.anInt8519; local33++) {
				@Pc(39) int local39 = Static546.anIntArray582[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(56) int local56;
				if (this.anInt1211 == 0) {
					local56 = this.anInt1212 * (local39 - local25);
				} else {
					@Pc(69) int local69 = local45 * local45 + local31 * local31 >> 12;
					local56 = (int) (Math.sqrt((double) ((float) local69 / 4096.0F)) * 4096.0D);
					local56 = (int) ((double) (this.anInt1212 * local56) * 3.141592653589793D);
				}
				local56 -= local56 & 0xFFFFF000;
				if (this.anInt1210 == 0) {
					local56 = Static246.anIntArray241[local56 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1210 == 2) {
					local56 -= 2048;
					if (local56 < 0) {
						local56 = -local56;
					}
					local56 = 2048 - local56 << 1;
				}
				local17[local33] = local56;
			}
		}
		return local17;
	}
}
