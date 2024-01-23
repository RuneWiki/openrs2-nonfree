import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class4_Sub1_Sub37 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	private int anInt5053 = 10;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private int anInt5056 = 2048;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	private int anInt5063 = 0;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt5053 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt5056 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt5063 = arg1.method3110();
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		this.method4006();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(24) int local24 = Static10.anIntArray7[arg0];
			@Pc(31) int local31;
			if (this.anInt5063 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt5053; local31++) {
					if (local24 >= this.anIntArray397[local31] && local24 < this.anIntArray397[local31 + 1]) {
						if (local24 < this.anIntArray396[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static317.method3204(local16, 0, Static68.anInt1753, local29);
			} else {
				for (@Pc(89) int local89 = 0; local89 < Static68.anInt1753; local89++) {
					local31 = 0;
					@Pc(102) int local102 = Static94.anIntArray163[local89];
					@Pc(105) int local105 = this.anInt5063;
					if (local105 == 1) {
						local31 = local102;
					} else if (local105 == 2) {
						local31 = (local102 + local24 - 4096 >> 1) + 2048;
					} else if (local105 == 3) {
						local31 = (local102 - local24 >> 1) + 2048;
					}
					@Pc(145) short local145 = 0;
					for (local105 = 0; local105 < this.anInt5053; local105++) {
						if (this.anIntArray397[local105] <= local31 && this.anIntArray397[local105 + 1] > local31) {
							if (this.anIntArray396[local105] > local31) {
								local145 = 4096;
							}
							break;
						}
					}
					local16[local89] = local145;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	private void method4006() {
		this.anIntArray397 = new int[this.anInt5053 + 1];
		this.anIntArray396 = new int[this.anInt5053 + 1];
		@Pc(25) int local25 = 0;
		@Pc(30) int local30 = 4096 / this.anInt5053;
		@Pc(37) int local37 = local30 * this.anInt5056 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt5053; local39++) {
			this.anIntArray397[local39] = local25;
			this.anIntArray396[local39] = local25 + local37;
			local25 += local30;
		}
		this.anIntArray397[this.anInt5053] = 4096;
		this.anIntArray396[this.anInt5053] = this.anIntArray396[0] + 4096;
	}
}
