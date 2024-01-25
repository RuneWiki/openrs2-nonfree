import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class5_Sub1_Sub35 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "[I")
	private int[] anIntArray574;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "[I")
	private int[] anIntArray575;

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
	private int anInt10248 = 0;

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
	private int anInt10246 = 10;

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
	private int anInt10253 = 2048;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
	private void method8819() {
		this.anIntArray574 = new int[this.anInt10246 + 1];
		this.anIntArray575 = new int[this.anInt10246 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt10246;
		@Pc(33) int local33 = this.anInt10253 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt10246; local35++) {
			this.anIntArray574[local35] = local21;
			this.anIntArray575[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray574[this.anInt10246] = 4096;
		this.anIntArray575[this.anInt10246] = this.anIntArray575[0] + 4096;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt10246 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt10253 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt10248 = arg1.method8529();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		this.method8819();
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(19) int local19 = Static23.anIntArray27[arg0];
			@Pc(28) int local28;
			if (this.anInt10248 == 0) {
				@Pc(162) short local162 = 0;
				for (local28 = 0; local28 < this.anInt10246; local28++) {
					if (this.anIntArray574[local28] <= local19 && local19 < this.anIntArray574[local28 + 1]) {
						if (local19 < this.anIntArray575[local28]) {
							local162 = 4096;
						}
						break;
					}
				}
				Static682.method794(local11, 0, Static648.anInt9588, local162);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static648.anInt9588; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static293.anIntArray288[local24];
					@Pc(37) int local37 = this.anInt10248;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local34 + local19 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt10246; local37++) {
						if (local28 >= this.anIntArray574[local37] && this.anIntArray574[local37 + 1] > local28) {
							if (this.anIntArray575[local37] > local28) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}
}
