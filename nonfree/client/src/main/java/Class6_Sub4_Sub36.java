import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class6_Sub4_Sub36 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sfa", name = "E", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!sfa", name = "N", descriptor = "[I")
	private int[] anIntArray555;

	@OriginalMember(owner = "client!sfa", name = "M", descriptor = "I")
	private int anInt9044 = 0;

	@OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
	private int anInt9043 = 10;

	@OriginalMember(owner = "client!sfa", name = "Q", descriptor = "I")
	private int anInt9047 = 2048;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(25) int local25 = Static629.anIntArray635[arg0];
			@Pc(37) int local37;
			if (this.anInt9044 == 0) {
				@Pc(135) short local135 = 0;
				for (local37 = 0; local37 < this.anInt9043; local37++) {
					if (local25 >= this.anIntArray555[local37] && local25 < this.anIntArray555[local37 + 1]) {
						if (this.anIntArray554[local37] > local25) {
							local135 = 4096;
						}
						break;
					}
				}
				Static655.method5835(local17, 0, Static6.anInt111, local135);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static6.anInt111; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static284.anIntArray482[local33];
					@Pc(46) int local46 = this.anInt9044;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local25 + local43 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt9043; local46++) {
						if (local37 >= this.anIntArray555[local46] && this.anIntArray555[local46 + 1] > local37) {
							if (this.anIntArray554[local46] > local37) {
								local39 = 4096;
							}
							break;
						}
					}
					local17[local33] = local39;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		this.method7731();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt9043 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt9047 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt9044 = arg1.method8604();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V")
	private void method7731() {
		this.anIntArray554 = new int[this.anInt9043 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray555 = new int[this.anInt9043 + 1];
		@Pc(26) int local26 = 4096 / this.anInt9043;
		@Pc(39) int local39 = this.anInt9047 * local26 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt9043; local41++) {
			this.anIntArray555[local41] = local14;
			this.anIntArray554[local41] = local39 + local14;
			local14 += local26;
		}
		this.anIntArray555[this.anInt9043] = 4096;
		this.anIntArray554[this.anInt9043] = this.anIntArray554[0] + 4096;
	}
}
