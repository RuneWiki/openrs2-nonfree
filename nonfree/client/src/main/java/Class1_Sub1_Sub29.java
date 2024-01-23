import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
	private int anInt4518 = 585;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4518 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(24) int local24 = Static187.anIntArray345[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static11.anInt294; local26++) {
				@Pc(32) int local32 = Static36.anIntArray81[local26];
				@Pc(69) int local69;
				if (local32 > this.anInt4518 && 4096 - this.anInt4518 > local32 && local24 > 2048 - this.anInt4518 && this.anInt4518 + 2048 > local24) {
					local69 = 2048 - local32;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt4518;
					local16[local26] = 4096 - local69;
				} else if (local32 > 2048 - this.anInt4518 && this.anInt4518 + 2048 > local32) {
					local69 = local24 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt4518;
					local69 <<= 0xC;
					local16[local26] = local69 / (2048 - this.anInt4518);
				} else if (this.anInt4518 > local24 || 4096 - this.anInt4518 < local24) {
					local69 = local32 - 2048;
					@Pc(180) int local180 = local69 >= 0 ? local69 : -local69;
					@Pc(185) int local185 = local180 - this.anInt4518;
					@Pc(189) int local189 = local185 << 12;
					local16[local26] = local189 / (2048 - this.anInt4518);
				} else if (local32 >= this.anInt4518 && local32 <= 4096 - this.anInt4518) {
					local16[local26] = 0;
				} else {
					local69 = 2048 - local24;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt4518;
					local16[local26] = 4096 - local69;
				}
			}
		}
		return local16;
	}
}
