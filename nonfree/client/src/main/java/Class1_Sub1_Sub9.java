import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
	private int anInt2446 = 0;

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
	private int anInt2451 = 10;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
	private int anInt2454 = 2048;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		this.method2076();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2451 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt2454 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt2446 = arg1.method4393();
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
	private void method2076() {
		this.anIntArray147 = new int[this.anInt2451 + 1];
		this.anIntArray146 = new int[this.anInt2451 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2451;
		@Pc(33) int local33 = this.anInt2454 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2451; local35++) {
			this.anIntArray146[local35] = local21;
			this.anIntArray147[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray146[this.anInt2451] = 4096;
		this.anIntArray147[this.anInt2451] = this.anIntArray147[0] + 4096;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(19) int local19 = Static337.anIntArray406[arg0];
			@Pc(29) int local29;
			if (this.anInt2446 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt2451; local29++) {
					if (this.anIntArray146[local29] <= local19 && this.anIntArray146[local29 + 1] > local19) {
						if (local19 < this.anIntArray147[local29]) {
							local27 = 4096;
						}
						break;
					}
				}
				Static600.method3767(local11, 0, Static87.anInt1964, local27);
			} else {
				for (@Pc(81) int local81 = 0; local81 < Static87.anInt1964; local81++) {
					local29 = 0;
					@Pc(87) short local87 = 0;
					@Pc(91) int local91 = Static436.anIntArray506[local81];
					@Pc(94) int local94 = this.anInt2446;
					if (local94 == 1) {
						local29 = local91;
					} else if (local94 == 2) {
						local29 = (local91 + local19 - 4096 >> 1) + 2048;
					} else if (local94 == 3) {
						local29 = (local91 - local19 >> 1) + 2048;
					}
					for (local94 = 0; local94 < this.anInt2451; local94++) {
						if (this.anIntArray146[local94] <= local29 && this.anIntArray146[local94 + 1] > local29) {
							if (this.anIntArray147[local94] > local29) {
								local87 = 4096;
							}
							break;
						}
					}
					local11[local81] = local87;
				}
			}
		}
		return local11;
	}
}
