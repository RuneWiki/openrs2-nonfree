import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
	private int anInt2291;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	private void method1557() {
		this.anIntArray230 = new int[this.anInt2287 + 1];
		this.anIntArray231 = new int[this.anInt2287 + 1];
		@Pc(23) int local23 = 0;
		@Pc(32) int local32 = 4096 / this.anInt2287;
		@Pc(39) int local39 = local32 * this.anInt2286 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt2287; local41++) {
			this.anIntArray231[local41] = local23;
			this.anIntArray230[local41] = local23 + local39;
			local23 += local32;
		}
		this.anIntArray231[this.anInt2287] = 4096;
		this.anIntArray230[this.anInt2287] = this.anIntArray230[0] + 4096;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		this.method1557();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2287 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt2286 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt2291 = arg1.method191();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(19) int local19 = Static125.anIntArray336[arg0];
			@Pc(26) int local26;
			if (this.anInt2291 == 0) {
				@Pc(24) short local24 = 0;
				for (local26 = 0; local26 < this.anInt2287; local26++) {
					if (this.anIntArray231[local26] <= local19 && this.anIntArray231[local26 + 1] > local19) {
						if (this.anIntArray230[local26] > local19) {
							local24 = 4096;
						}
						break;
					}
				}
				Static184.method1308(local11, 0, Static141.anInt3261, local24);
			} else {
				for (@Pc(74) int local74 = 0; local74 < Static141.anInt3261; local74++) {
					local26 = 0;
					@Pc(82) int local82 = Static85.anIntArray47[local74];
					@Pc(84) short local84 = 0;
					@Pc(87) int local87 = this.anInt2291;
					if (local87 == 1) {
						local26 = local82;
					} else if (local87 == 2) {
						local26 = (local19 + local82 - 4096 >> 1) + 2048;
					} else if (local87 == 3) {
						local26 = (local82 - local19 >> 1) + 2048;
					}
					for (local87 = 0; local87 < this.anInt2287; local87++) {
						if (this.anIntArray231[local87] <= local26 && this.anIntArray231[local87 + 1] > local26) {
							if (local26 < this.anIntArray230[local87]) {
								local84 = 4096;
							}
							break;
						}
					}
					local11[local74] = local84;
				}
			}
		}
		return local11;
	}
}
