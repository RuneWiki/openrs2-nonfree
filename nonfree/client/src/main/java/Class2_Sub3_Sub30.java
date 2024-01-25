import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class2_Sub3_Sub30 extends Class2_Sub3 {

	@OriginalMember(owner = "client!st", name = "R", descriptor = "[I")
	private int[] anIntArray627;

	@OriginalMember(owner = "client!st", name = "S", descriptor = "[I")
	private int[] anIntArray628;

	@OriginalMember(owner = "client!st", name = "K", descriptor = "I")
	private int anInt9572 = 0;

	@OriginalMember(owner = "client!st", name = "O", descriptor = "I")
	private int anInt9576 = 10;

	@OriginalMember(owner = "client!st", name = "T", descriptor = "I")
	private int anInt9579 = 2048;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(25) int local25 = Static547.anIntArray641[arg0];
			@Pc(34) int local34;
			if (this.anInt9572 == 0) {
				@Pc(134) short local134 = 0;
				for (local34 = 0; local34 < this.anInt9576; local34++) {
					if (this.anIntArray627[local34] <= local25 && this.anIntArray627[local34 + 1] > local25) {
						if (this.anIntArray628[local34] > local25) {
							local134 = 4096;
						}
						break;
					}
				}
				Static653.method7725(local17, 0, Static222.anInt4971, local134);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static222.anInt4971; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static464.anIntArray556[local30];
					@Pc(43) int local43 = this.anInt9572;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local40 + local25 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt9576; local43++) {
						if (local34 >= this.anIntArray627[local43] && local34 < this.anIntArray627[local43 + 1]) {
							if (this.anIntArray628[local43] > local34) {
								local36 = 4096;
							}
							break;
						}
					}
					local17[local30] = local36;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		this.method7969();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9576 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt9579 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt9572 = arg0.method8383();
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V")
	private void method7969() {
		@Pc(7) int local7 = 0;
		this.anIntArray628 = new int[this.anInt9576 + 1];
		this.anIntArray627 = new int[this.anInt9576 + 1];
		@Pc(26) int local26 = 4096 / this.anInt9576;
		@Pc(33) int local33 = local26 * this.anInt9579 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9576; local35++) {
			this.anIntArray627[local35] = local7;
			this.anIntArray628[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray627[this.anInt9576] = 4096;
		this.anIntArray628[this.anInt9576] = this.anIntArray628[0] + 4096;
	}
}
