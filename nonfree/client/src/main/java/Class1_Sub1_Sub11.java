import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
	private int anInt3048 = 2048;

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
	private int anInt3050 = 0;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
	private int anInt3054 = 10;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		this.method2622();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3054 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt3048 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt3050 = arg1.method7974();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(25) int local25 = Static583.anIntArray614[arg0];
			@Pc(34) int local34;
			if (this.anInt3050 == 0) {
				@Pc(131) short local131 = 0;
				for (local34 = 0; local34 < this.anInt3054; local34++) {
					if (local25 >= this.anIntArray141[local34] && this.anIntArray141[local34 + 1] > local25) {
						if (this.anIntArray142[local34] > local25) {
							local131 = 4096;
						}
						break;
					}
				}
				Static598.method772(local11, 0, Static501.anInt8748, local131);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static501.anInt8748; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static95.anIntArray77[local30];
					@Pc(43) int local43 = this.anInt3050;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local25 + local40 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt3054; local43++) {
						if (local34 >= this.anIntArray141[local43] && local34 < this.anIntArray141[local43 + 1]) {
							if (this.anIntArray142[local43] > local34) {
								local36 = 4096;
							}
							break;
						}
					}
					local11[local30] = local36;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
	private void method2622() {
		@Pc(7) int local7 = 0;
		this.anIntArray142 = new int[this.anInt3054 + 1];
		this.anIntArray141 = new int[this.anInt3054 + 1];
		@Pc(26) int local26 = 4096 / this.anInt3054;
		@Pc(33) int local33 = local26 * this.anInt3048 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt3054; local39++) {
			this.anIntArray141[local39] = local7;
			this.anIntArray142[local39] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray141[this.anInt3054] = 4096;
		this.anIntArray142[this.anInt3054] = this.anIntArray142[0] + 4096;
	}
}
