import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class10_Sub2_Sub36 extends Class10_Sub2 {

	@OriginalMember(owner = "client!vu", name = "N", descriptor = "[I")
	private int[] anIntArray716;

	@OriginalMember(owner = "client!vu", name = "Q", descriptor = "[I")
	private int[] anIntArray717;

	@OriginalMember(owner = "client!vu", name = "L", descriptor = "I")
	private int anInt7355 = 10;

	@OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
	private int anInt7361 = 0;

	@OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
	private int anInt7360 = 2048;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)V")
	private void method5803() {
		@Pc(7) int local7 = 0;
		this.anIntArray716 = new int[this.anInt7355 + 1];
		this.anIntArray717 = new int[this.anInt7355 + 1];
		@Pc(26) int local26 = 4096 / this.anInt7355;
		@Pc(33) int local33 = this.anInt7360 * local26 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt7355; local40++) {
			this.anIntArray717[local40] = local7;
			this.anIntArray716[local40] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray717[this.anInt7355] = 4096;
		this.anIntArray716[this.anInt7355] = this.anIntArray716[0] + 4096;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(24) int local24 = Static67.anIntArray106[arg0];
			@Pc(31) int local31;
			if (this.anInt7361 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt7355; local31++) {
					if (this.anIntArray717[local31] <= local24 && local24 < this.anIntArray717[local31 + 1]) {
						if (local24 < this.anIntArray716[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static468.method4353(local11, 0, Static121.anInt2458, local29);
			} else {
				for (@Pc(79) int local79 = 0; local79 < Static121.anInt2458; local79++) {
					local31 = 0;
					@Pc(85) short local85 = 0;
					@Pc(89) int local89 = Static182.anIntArray374[local79];
					@Pc(92) int local92 = this.anInt7361;
					if (local92 == 1) {
						local31 = local89;
					} else if (local92 == 2) {
						local31 = (local89 + local24 - 4096 >> 1) + 2048;
					} else if (local92 == 3) {
						local31 = (local89 - local24 >> 1) + 2048;
					}
					for (local92 = 0; local92 < this.anInt7355; local92++) {
						if (local31 >= this.anIntArray717[local92] && local31 < this.anIntArray717[local92 + 1]) {
							if (local31 < this.anIntArray716[local92]) {
								local85 = 4096;
							}
							break;
						}
					}
					local11[local79] = local85;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7355 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt7360 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt7361 = arg1.method2502();
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		this.method5803();
	}
}
