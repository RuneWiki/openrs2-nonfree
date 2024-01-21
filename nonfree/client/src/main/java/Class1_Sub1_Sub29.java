import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
	private int anInt3366 = 0;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
	private int anInt3365 = 1;

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
	private int anInt3369 = 0;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3369 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt3366 = arg0.method3010();
		} else if (arg1 == 3) {
			this.anInt3365 = arg0.method3010();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		Static110.method1653();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(24) int local24 = Static193.anIntArray277[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static107.anInt2321; local32++) {
				@Pc(38) int local38 = Static204.anIntArray179[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt3369 == 0) {
					local55 = this.anInt3365 * (local38 - local24);
				} else {
					@Pc(67) int local67 = local30 * local30 + local44 * local44 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (local55 * this.anInt3365) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt3366 == 0) {
					local55 = Static22.anIntArray48[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3366 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local16[local32] = local55;
			}
		}
		return local16;
	}
}
