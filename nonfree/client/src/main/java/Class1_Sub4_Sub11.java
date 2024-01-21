import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class1_Sub4_Sub11 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
	private int anInt2356;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
	private int anInt2351;

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(19) int local19 = Static150.anIntArray383[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static73.anInt1888; local27++) {
				@Pc(33) int local33 = Static171.anIntArray421[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt2351 == 0) {
					local62 = this.anInt2356 * (local33 - local19);
				} else {
					@Pc(53) int local53 = local39 * local39 + local25 * local25 >> 12;
					local62 = (int) (Math.sqrt((double) (local53 / 4096)) * 4096.0D);
					local62 = (int) ((double) (local62 * this.anInt2356) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt2361 == 0) {
					local62 = Static25.anIntArray50[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2361 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local11[local27] = local62;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2351 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt2361 = arg0.method544();
		} else if (arg1 == 3) {
			this.anInt2356 = arg0.method544();
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		Static145.method2764();
	}
}
