import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class2_Sub4_Sub33 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ti", name = "Z", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!ti", name = "fb", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	private int anInt3921 = 0;

	@OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
	private int anInt3927 = 2048;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	private int anInt3924 = 10;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3924 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt3927 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt3921 = arg1.method1534();
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	private void method2719() {
		this.anIntArray361 = new int[this.anInt3924 + 1];
		@Pc(17) int local17 = 4096 / this.anInt3924;
		this.anIntArray362 = new int[this.anInt3924 + 1];
		@Pc(26) int local26 = 0;
		@Pc(33) int local33 = this.anInt3927 * local17 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt3924; local39++) {
			this.anIntArray361[local39] = local26;
			this.anIntArray362[local39] = local33 + local26;
			local26 += local17;
		}
		this.anIntArray361[this.anInt3924] = 4096;
		this.anIntArray362[this.anInt3924] = this.anIntArray362[0] + 4096;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		this.method2719();
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int local21 = Static2.anIntArray5[arg0];
			@Pc(30) int local30;
			if (this.anInt3921 == 0) {
				@Pc(138) short local138 = 0;
				for (local30 = 0; local30 < this.anInt3924; local30++) {
					if (this.anIntArray361[local30] <= local21 && this.anIntArray361[local30 + 1] > local21) {
						if (local21 < this.anIntArray362[local30]) {
							local138 = 4096;
						}
						break;
					}
				}
				Static220.method1004(local13, 0, Static118.anInt2608, local138);
			} else {
				for (@Pc(26) int local26 = 0; local26 < Static118.anInt2608; local26++) {
					local30 = 0;
					@Pc(32) short local32 = 0;
					@Pc(36) int local36 = Static141.anIntArray130[local26];
					@Pc(39) int local39 = this.anInt3921;
					if (local39 == 1) {
						local30 = local36;
					} else if (local39 == 2) {
						local30 = (local36 + local21 - 4096 >> 1) + 2048;
					} else if (local39 == 3) {
						local30 = (local36 - local21 >> 1) + 2048;
					}
					for (local39 = 0; local39 < this.anInt3924; local39++) {
						if (local30 >= this.anIntArray361[local39] && this.anIntArray361[local39 + 1] > local30) {
							if (local30 < this.anIntArray362[local39]) {
								local32 = 4096;
							}
							break;
						}
					}
					local13[local26] = local32;
				}
			}
		}
		return local13;
	}
}
