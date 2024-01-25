import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
	private int anInt4546 = 0;

	@OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
	private int anInt4543 = 0;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
	private int anInt4545 = 1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		Static204.method4476();
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(24) int local24 = Static351.anIntArray371[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static238.anInt4221; local32++) {
				@Pc(38) int local38 = Static187.anIntArray379[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt4543 == 0) {
					local67 = (local38 - local24) * this.anInt4545;
				} else {
					@Pc(57) int local57 = local44 * local44 + local30 * local30 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (this.anInt4545 * local67) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt4546 == 0) {
					local67 = Static167.anIntArray309[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4546 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local16[local32] = local67;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4543 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt4546 = arg0.method2739();
		} else if (arg1 == 3) {
			this.anInt4545 = arg0.method2739();
		}
	}
}
