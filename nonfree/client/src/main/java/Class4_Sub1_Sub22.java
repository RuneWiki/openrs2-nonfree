import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class4_Sub1_Sub22 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	private int anInt6617 = 2048;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	private int anInt6615 = 10;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	private int anInt6619 = 0;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	private void method5548() {
		this.anIntArray336 = new int[this.anInt6615 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray337 = new int[this.anInt6615 + 1];
		@Pc(26) int local26 = 4096 / this.anInt6615;
		@Pc(33) int local33 = local26 * this.anInt6617 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt6615; local35++) {
			this.anIntArray337[local35] = local14;
			this.anIntArray336[local35] = local14 + local33;
			local14 += local26;
		}
		this.anIntArray337[this.anInt6615] = 4096;
		this.anIntArray336[this.anInt6615] = this.anIntArray336[0] + 4096;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6615 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt6617 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt6619 = arg1.method4905();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		this.method5548();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(19) int local19 = Static442.anIntArray449[arg0];
			@Pc(28) int local28;
			if (this.anInt6619 == 0) {
				@Pc(130) short local130 = 0;
				for (local28 = 0; local28 < this.anInt6615; local28++) {
					if (this.anIntArray337[local28] <= local19 && this.anIntArray337[local28 + 1] > local19) {
						if (this.anIntArray336[local28] > local19) {
							local130 = 4096;
						}
						break;
					}
				}
				Static597.method3724(local11, 0, Static376.anInt7260, local130);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static376.anInt7260; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static292.anIntArray394[local24];
					@Pc(37) int local37 = this.anInt6619;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local19 + local34 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt6615; local37++) {
						if (this.anIntArray337[local37] <= local28 && local28 < this.anIntArray337[local37 + 1]) {
							if (local28 < this.anIntArray336[local37]) {
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
