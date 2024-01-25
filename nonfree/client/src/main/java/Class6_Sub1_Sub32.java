import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class6_Sub1_Sub32 extends Class6_Sub1 {

	@OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
	private int anInt8929 = 0;

	@OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
	private int anInt8928 = 1;

	@OriginalMember(owner = "client!tw", name = "I", descriptor = "I")
	private int anInt8933 = 0;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		Static463.method7157();
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(24) int local24 = Static346.anIntArray472[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static289.anInt5549; local32++) {
				@Pc(38) int local38 = Static473.anIntArray730[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt8933 == 0) {
					local55 = (local38 - local24) * this.anInt8928;
				} else {
					@Pc(67) int local67 = local44 * local44 + local30 * local30 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (this.anInt8928 * local55) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt8929 == 0) {
					local55 = Static571.anIntArray829[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt8929 == 2) {
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

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt8933 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt8929 = arg1.method4966();
		} else if (arg0 == 3) {
			this.anInt8928 = arg1.method4966();
		}
	}
}
