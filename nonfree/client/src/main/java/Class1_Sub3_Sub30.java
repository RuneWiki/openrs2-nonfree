import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "[I")
	private int[] anIntArray692;

	@OriginalMember(owner = "client!qr", name = "T", descriptor = "[I")
	private int[] anIntArray693;

	@OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
	private int anInt7183 = 0;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	private int anInt7186 = 2048;

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "I")
	private int anInt7191 = 10;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	private void method6028() {
		this.anIntArray693 = new int[this.anInt7191 + 1];
		this.anIntArray692 = new int[this.anInt7191 + 1];
		@Pc(29) int local29 = 0;
		@Pc(34) int local34 = 4096 / this.anInt7191;
		@Pc(41) int local41 = this.anInt7186 * local34 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt7191; local43++) {
			this.anIntArray693[local43] = local29;
			this.anIntArray692[local43] = local29 + local41;
			local29 += local34;
		}
		this.anIntArray693[this.anInt7191] = 4096;
		this.anIntArray692[this.anInt7191] = this.anIntArray692[0] + 4096;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(26) int local26 = Static7.anIntArray20[arg0];
			@Pc(38) int local38;
			if (this.anInt7183 == 0) {
				@Pc(144) short local144 = 0;
				for (local38 = 0; local38 < this.anInt7191; local38++) {
					if (local26 >= this.anIntArray693[local38] && this.anIntArray693[local38 + 1] > local26) {
						if (this.anIntArray692[local38] > local26) {
							local144 = 4096;
						}
						break;
					}
				}
				Static551.method3492(local18, 0, Static452.anInt7734, local144);
			} else {
				for (@Pc(34) int local34 = 0; local34 < Static452.anInt7734; local34++) {
					local38 = 0;
					@Pc(40) short local40 = 0;
					@Pc(44) int local44 = Static228.anIntArray442[local34];
					@Pc(47) int local47 = this.anInt7183;
					if (local47 == 1) {
						local38 = local44;
					} else if (local47 == 2) {
						local38 = (local44 + local26 - 4096 >> 1) + 2048;
					} else if (local47 == 3) {
						local38 = (local44 - local26 >> 1) + 2048;
					}
					for (local47 = 0; local47 < this.anInt7191; local47++) {
						if (local38 >= this.anIntArray693[local47] && local38 < this.anIntArray693[local47 + 1]) {
							if (this.anIntArray692[local47] > local38) {
								local40 = 4096;
							}
							break;
						}
					}
					local18[local34] = local40;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		this.method6028();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7191 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt7186 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt7183 = arg0.method3922();
		}
	}
}
