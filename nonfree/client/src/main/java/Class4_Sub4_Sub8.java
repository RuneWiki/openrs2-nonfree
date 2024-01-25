import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class4_Sub4_Sub8 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
	private int anInt2008 = 0;

	@OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
	private int anInt2014 = 0;

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
	private int anInt2018 = 1;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		Static317.method5269();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2008 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt2014 = arg1.method2380();
		} else if (arg0 == 3) {
			this.anInt2018 = arg1.method2380();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(26) int local26 = Static64.anIntArray148[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static124.anInt3576; local34++) {
				@Pc(40) int local40 = Static149.anIntArray298[local34];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt2008 == 0) {
					local57 = this.anInt2018 * (local40 - local26);
				} else {
					@Pc(69) int local69 = local46 * local46 + local32 * local32 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local69 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt2018 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt2014 == 0) {
					local57 = Static258.anIntArray442[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2014 == 2) {
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
}
