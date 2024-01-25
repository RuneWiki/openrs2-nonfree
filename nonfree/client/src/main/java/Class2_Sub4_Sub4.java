import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub4_Sub4 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	private int anInt754 = 1;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	private int anInt752 = 0;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	private int anInt750 = 0;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt750 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt752 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt754 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(25) int local25 = Static13.anIntArray418[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static143.anInt7434; local33++) {
				@Pc(39) int local39 = Static519.anIntArray155[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt750 == 0) {
					local71 = (local39 - local25) * this.anInt754;
				} else {
					@Pc(61) int local61 = local45 * local45 + local31 * local31 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (this.anInt754 * local71) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt752 == 0) {
					local71 = Static388.anIntArray410[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt752 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local17[local33] = local71;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		Static59.method1017();
	}
}
