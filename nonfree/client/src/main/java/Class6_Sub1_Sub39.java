import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class6_Sub1_Sub39 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
	private int anInt10570 = 0;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	private int anInt10575 = 0;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	private int anInt10576 = 1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10575 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt10570 = arg0.method8374();
		} else if (arg1 == 3) {
			this.anInt10576 = arg0.method8374();
		}
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		Static364.method5249();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(24) int local24 = Static230.anIntArray222[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static479.anInt8231; local32++) {
				@Pc(38) int local38 = Static205.anIntArray199[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt10575 == 0) {
					local55 = (local38 - local24) * this.anInt10576;
				} else {
					@Pc(67) int local67 = local44 * local44 + local30 * local30 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (local55 * this.anInt10576) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt10570 == 0) {
					local55 = Static164.anIntArray710[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt10570 == 2) {
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
