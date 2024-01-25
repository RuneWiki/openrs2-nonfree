import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
	private int anInt262 = 0;

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	private int anInt265 = 10;

	@OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
	private int anInt271 = 2048;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		this.method185();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt265 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt271 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt262 = arg1.method3737();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(25) int local25 = Static373.anIntArray55[arg0];
			@Pc(35) int local35;
			if (this.anInt262 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt265; local35++) {
					if (local25 >= this.anIntArray11[local35] && this.anIntArray11[local35 + 1] > local25) {
						if (local25 < this.anIntArray12[local35]) {
							local33 = 4096;
						}
						break;
					}
				}
				Static459.method3349(local11, 0, Static131.anInt2581, local33);
			} else {
				for (@Pc(83) int local83 = 0; local83 < Static131.anInt2581; local83++) {
					local35 = 0;
					@Pc(89) short local89 = 0;
					@Pc(93) int local93 = Static252.anIntArray323[local83];
					@Pc(96) int local96 = this.anInt262;
					if (local96 == 1) {
						local35 = local93;
					} else if (local96 == 2) {
						local35 = (local25 + local93 - 4096 >> 1) + 2048;
					} else if (local96 == 3) {
						local35 = (local93 - local25 >> 1) + 2048;
					}
					for (local96 = 0; local96 < this.anInt265; local96++) {
						if (local35 >= this.anIntArray11[local96] && local35 < this.anIntArray11[local96 + 1]) {
							if (local35 < this.anIntArray12[local96]) {
								local89 = 4096;
							}
							break;
						}
					}
					local11[local83] = local89;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
	private void method185() {
		this.anIntArray12 = new int[this.anInt265 + 1];
		this.anIntArray11 = new int[this.anInt265 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt265;
		@Pc(33) int local33 = this.anInt271 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt265; local35++) {
			this.anIntArray11[local35] = local21;
			this.anIntArray12[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray11[this.anInt265] = 4096;
		this.anIntArray12[this.anInt265] = this.anIntArray12[0] + 4096;
	}
}
