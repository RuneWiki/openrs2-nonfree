import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!h", name = "S", descriptor = "I")
	private int anInt1814 = 1;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
	private int anInt1812 = 0;

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
	private int anInt1820 = 0;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1812 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt1820 = arg0.method3122();
		} else if (arg1 == 3) {
			this.anInt1814 = arg0.method3122();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(16) int local16 = Static219.anIntArray515[arg0];
			@Pc(22) int local22 = local16 - 2048 >> 1;
			for (@Pc(24) int local24 = 0; local24 < Static131.anInt2513; local24++) {
				@Pc(31) int local31 = Static105.anIntArray261[local24];
				@Pc(37) int local37 = local31 - 2048 >> 1;
				@Pc(49) int local49;
				if (this.anInt1812 == 0) {
					local49 = (local31 - local16) * this.anInt1814;
				} else {
					@Pc(61) int local61 = local37 * local37 + local22 * local22 >> 12;
					local49 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local49 = (int) ((double) (local49 * this.anInt1814) * 3.141592653589793D);
				}
				local49 -= local49 & 0xFFFFF000;
				if (this.anInt1820 == 0) {
					local49 = Static187.anIntArray407[local49 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1820 == 2) {
					local49 -= 2048;
					if (local49 < 0) {
						local49 = -local49;
					}
					local49 = 2048 - local49 << 1;
				}
				local7[local24] = local49;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		Static173.method2622();
	}
}
