import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class8_Sub3_Sub16 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	private int anInt1988 = 585;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1988 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(26) int local26 = Static33.anIntArray50[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static239.anInt4789; local28++) {
				@Pc(39) int local39 = Static171.anIntArray258[local28];
				@Pc(77) int local77;
				if (local39 > this.anInt1988 && local39 < 4096 - this.anInt1988 && 2048 - this.anInt1988 < local26 && this.anInt1988 + 2048 > local26) {
					local77 = 2048 - local39;
					local77 = local77 < 0 ? -local77 : local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt1988;
					local7[local28] = 4096 - local77;
				} else if (2048 - this.anInt1988 < local39 && local39 < this.anInt1988 + 2048) {
					local77 = local26 - 2048;
					local77 = local77 < 0 ? -local77 : local77;
					local77 -= this.anInt1988;
					local77 <<= 0xC;
					local7[local28] = local77 / (2048 - this.anInt1988);
				} else if (this.anInt1988 > local26 || local26 > 4096 - this.anInt1988) {
					local77 = local39 - 2048;
					@Pc(189) int local189 = local77 >= 0 ? local77 : -local77;
					@Pc(194) int local194 = local189 - this.anInt1988;
					@Pc(198) int local198 = local194 << 12;
					local7[local28] = local198 / (2048 - this.anInt1988);
				} else if (this.anInt1988 <= local39 && 4096 - this.anInt1988 >= local39) {
					local7[local28] = 0;
				} else {
					local77 = 2048 - local26;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt1988;
					local7[local28] = 4096 - local77;
				}
			}
		}
		return local7;
	}
}
