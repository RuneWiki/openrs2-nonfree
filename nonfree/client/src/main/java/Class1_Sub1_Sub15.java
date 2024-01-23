import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
	private int anInt2185 = 0;

	@OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
	private int anInt2182 = 0;

	@OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
	private int anInt2189 = 1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2185 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt2182 = arg0.method3793();
		} else if (arg1 == 3) {
			this.anInt2189 = arg0.method3793();
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(19) int local19 = Static211.anIntArray334[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static157.anInt3431; local27++) {
				@Pc(33) int local33 = Static73.anIntArray105[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(50) int local50;
				if (this.anInt2185 == 0) {
					local50 = this.anInt2189 * (local33 - local19);
				} else {
					@Pc(62) int local62 = local39 * local39 + local25 * local25 >> 12;
					local50 = (int) (Math.sqrt((double) ((float) local62 / 4096.0F)) * 4096.0D);
					local50 = (int) ((double) (local50 * this.anInt2189) * 3.141592653589793D);
				}
				local50 -= local50 & 0xFFFFF000;
				if (this.anInt2182 == 0) {
					local50 = Static167.anIntArray244[local50 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2182 == 2) {
					local50 -= 2048;
					if (local50 < 0) {
						local50 = -local50;
					}
					local50 = 2048 - local50 << 1;
				}
				local7[local27] = local50;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		Static67.method1167();
	}
}
