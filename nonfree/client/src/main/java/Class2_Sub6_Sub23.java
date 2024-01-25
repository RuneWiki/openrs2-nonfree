import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub6_Sub23 extends Class2_Sub6 {

	@OriginalMember(owner = "client!na", name = "O", descriptor = "I")
	private int anInt4248 = 1;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
	private int anInt4249 = 0;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "I")
	private int anInt4250 = 0;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(24) int local24 = Static138.anIntArray291[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static151.anInt2711; local32++) {
				@Pc(38) int local38 = Static160.anIntArray329[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt4249 == 0) {
					local70 = (local38 - local24) * this.anInt4248;
				} else {
					@Pc(60) int local60 = local30 * local30 + local44 * local44 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt4248) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt4250 == 0) {
					local70 = Static353.anIntArray753[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4250 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local16[local32] = local70;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4249 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt4250 = arg0.method4240();
		} else if (arg1 == 3) {
			this.anInt4248 = arg0.method4240();
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		Static155.method2588();
	}
}
