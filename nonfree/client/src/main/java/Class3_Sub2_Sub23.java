import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "[I")
	public static final int[] anIntArray363 = new int[4096];

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
	private int anInt5385 = 585;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray363[local4] = Static101.method5335(local4);
		}
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5385 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(23) int local23 = Static441.anIntArray522[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static406.anInt6694; local25++) {
				@Pc(31) int local31 = Static86.anIntArray125[local25];
				@Pc(63) int local63;
				if (this.anInt5385 < local31 && local31 < 4096 - this.anInt5385 && local23 > 2048 - this.anInt5385 && local23 < this.anInt5385 + 2048) {
					local63 = 2048 - local31;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt5385;
					local15[local25] = 4096 - local63;
				} else if (local31 > 2048 - this.anInt5385 && local31 < this.anInt5385 + 2048) {
					local63 = local23 - 2048;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 -= this.anInt5385;
					local63 <<= 0xC;
					local15[local25] = local63 / (2048 - this.anInt5385);
				} else if (this.anInt5385 > local23 || 4096 - this.anInt5385 < local23) {
					local63 = local31 - 2048;
					@Pc(167) int local167 = local63 >= 0 ? local63 : -local63;
					@Pc(172) int local172 = local167 - this.anInt5385;
					@Pc(176) int local176 = local172 << 12;
					local15[local25] = local176 / (2048 - this.anInt5385);
				} else if (local31 >= this.anInt5385 && 4096 - this.anInt5385 >= local31) {
					local15[local25] = 0;
				} else {
					local63 = 2048 - local23;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt5385;
					local15[local25] = 4096 - local63;
				}
			}
		}
		return local15;
	}
}
