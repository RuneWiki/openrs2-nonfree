import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class2_Sub6_Sub10 extends Class2_Sub6 {

	@OriginalMember(owner = "client!fga", name = "P", descriptor = "I")
	private int anInt2796 = 1;

	@OriginalMember(owner = "client!fga", name = "N", descriptor = "I")
	private int anInt2794 = 0;

	@OriginalMember(owner = "client!fga", name = "U", descriptor = "I")
	private int anInt2798 = 0;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(26) int local26 = Static564.anIntArray630[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static51.anInt1085; local34++) {
				@Pc(40) int local40 = Static586.anIntArray653[local34];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt2794 == 0) {
					local57 = this.anInt2796 * (local40 - local26);
				} else {
					@Pc(69) int local69 = local32 * local32 + local46 * local46 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local69 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt2796 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt2798 == 0) {
					local57 = Static123.anIntArray155[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2798 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local18[local34] = local57;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		Static212.method2948();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt2794 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt2798 = arg1.method8547();
		} else if (arg0 == 3) {
			this.anInt2796 = arg1.method8547();
		}
	}
}
