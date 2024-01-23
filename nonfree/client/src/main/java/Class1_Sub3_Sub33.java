import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
	private int anInt3479 = 10;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
	private int anInt3485 = 2048;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	private int anInt3482 = 0;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		this.method2811();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3479 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt3485 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt3482 = arg1.method2142();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(25) int local25 = Static23.anIntArray47[arg0];
			@Pc(34) int local34;
			if (this.anInt3482 == 0) {
				@Pc(128) short local128 = 0;
				for (local34 = 0; local34 < this.anInt3479; local34++) {
					if (local25 >= this.anIntArray373[local34] && this.anIntArray373[local34 + 1] > local25) {
						if (this.anIntArray374[local34] > local25) {
							local128 = 4096;
						}
						break;
					}
				}
				Static235.method864(local7, 0, Static76.anInt1531, local128);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static76.anInt1531; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static106.anIntArray202[local30];
					@Pc(43) int local43 = this.anInt3482;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local25 + local40 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt3479; local43++) {
						if (local34 >= this.anIntArray373[local43] && this.anIntArray373[local43 + 1] > local34) {
							if (this.anIntArray374[local43] > local34) {
								local36 = 4096;
							}
							break;
						}
					}
					local7[local30] = local36;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	private void method2811() {
		this.anIntArray374 = new int[this.anInt3479 + 1];
		this.anIntArray373 = new int[this.anInt3479 + 1];
		@Pc(24) int local24 = 4096 / this.anInt3479;
		@Pc(26) int local26 = 0;
		@Pc(33) int local33 = this.anInt3485 * local24 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3479; local35++) {
			this.anIntArray373[local35] = local26;
			this.anIntArray374[local35] = local33 + local26;
			local26 += local24;
		}
		this.anIntArray373[this.anInt3479] = 4096;
		this.anIntArray374[this.anInt3479] = this.anIntArray374[0] + 4096;
	}
}
