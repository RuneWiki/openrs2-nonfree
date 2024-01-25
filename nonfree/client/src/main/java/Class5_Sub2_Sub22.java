import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class5_Sub2_Sub22 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
	private int anInt7250 = 0;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
	private int anInt7245 = 1;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
	private int anInt7246 = 0;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		Static606.method8449();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7250 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt7246 = arg0.method8645();
		} else if (arg1 == 3) {
			this.anInt7245 = arg0.method8645();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(25) int local25 = Static61.anIntArray80[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static314.anInt6320; local33++) {
				@Pc(39) int local39 = Static68.anIntArray94[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt7250 == 0) {
					local55 = this.anInt7245 * (local39 - local25);
				} else {
					@Pc(67) int local67 = local45 * local45 + local31 * local31 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (this.anInt7245 * local55) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt7246 == 0) {
					local55 = Static457.anIntArray613[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7246 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local17[local33] = local55;
			}
		}
		return local17;
	}
}
