import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class1_Sub4_Sub29 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
	private int anInt5556 = 585;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt5556 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int local26 = Static266.anIntArray628[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static66.anInt1511; local28++) {
				@Pc(34) int local34 = Static121.anIntArray197[local28];
				@Pc(67) int local67;
				if (this.anInt5556 < local34 && local34 < 4096 - this.anInt5556 && local26 > 2048 - this.anInt5556 && this.anInt5556 + 2048 > local26) {
					local67 = 2048 - local34;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt5556;
					local13[local28] = 4096 - local67;
				} else if (2048 - this.anInt5556 < local34 && local34 < this.anInt5556 + 2048) {
					local67 = local26 - 2048;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 -= this.anInt5556;
					local67 <<= 0xC;
					local13[local28] = local67 / (2048 - this.anInt5556);
				} else if (this.anInt5556 > local26 || local26 > 4096 - this.anInt5556) {
					local67 = local34 - 2048;
					@Pc(176) int local176 = local67 >= 0 ? local67 : -local67;
					@Pc(181) int local181 = local176 - this.anInt5556;
					@Pc(185) int local185 = local181 << 12;
					local13[local28] = local185 / (2048 - this.anInt5556);
				} else if (local34 >= this.anInt5556 && local34 <= 4096 - this.anInt5556) {
					local13[local28] = 0;
				} else {
					local67 = 2048 - local26;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt5556;
					local13[local28] = 4096 - local67;
				}
			}
		}
		return local13;
	}
}
