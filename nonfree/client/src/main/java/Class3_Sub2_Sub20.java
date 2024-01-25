import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!ls", name = "G", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
	private int anInt6565 = 0;

	@OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
	private int anInt6566 = 2048;

	@OriginalMember(owner = "client!ls", name = "M", descriptor = "I")
	private int anInt6568 = 10;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)V")
	private void method5499() {
		this.anIntArray385 = new int[this.anInt6568 + 1];
		this.anIntArray386 = new int[this.anInt6568 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt6568;
		@Pc(33) int local33 = local26 * this.anInt6566 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt6568; local35++) {
			this.anIntArray386[local35] = local21;
			this.anIntArray385[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray386[this.anInt6568] = 4096;
		this.anIntArray385[this.anInt6568] = this.anIntArray385[0] + 4096;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(27) int local27 = Static328.anIntArray387[arg0];
			@Pc(37) int local37;
			if (this.anInt6565 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt6568; local37++) {
					if (local27 >= this.anIntArray386[local37] && this.anIntArray386[local37 + 1] > local27) {
						if (this.anIntArray385[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static655.method6405(local19, 0, Static164.anInt8839, local35);
			} else {
				for (@Pc(89) int local89 = 0; local89 < Static164.anInt8839; local89++) {
					local37 = 0;
					@Pc(95) short local95 = 0;
					@Pc(99) int local99 = Static352.anIntArray400[local89];
					@Pc(102) int local102 = this.anInt6565;
					if (local102 == 1) {
						local37 = local99;
					} else if (local102 == 2) {
						local37 = (local99 + local27 - 4096 >> 1) + 2048;
					} else if (local102 == 3) {
						local37 = (local99 - local27 >> 1) + 2048;
					}
					for (local102 = 0; local102 < this.anInt6568; local102++) {
						if (this.anIntArray386[local102] <= local37 && local37 < this.anIntArray386[local102 + 1]) {
							if (local37 < this.anIntArray385[local102]) {
								local95 = 4096;
							}
							break;
						}
					}
					local19[local89] = local95;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt6568 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt6566 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt6565 = arg1.method8401();
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		this.method5499();
	}
}
