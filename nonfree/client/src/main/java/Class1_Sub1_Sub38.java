import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "jb", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!vd", name = "nb", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!vd", name = "kb", descriptor = "I")
	private int anInt4212 = 0;

	@OriginalMember(owner = "client!vd", name = "ob", descriptor = "I")
	private int anInt4213 = 2048;

	@OriginalMember(owner = "client!vd", name = "pb", descriptor = "I")
	private int anInt4214 = 10;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	private void method3187() {
		this.anIntArray478 = new int[this.anInt4214 + 1];
		this.anIntArray479 = new int[this.anInt4214 + 1];
		@Pc(19) int local19 = 0;
		@Pc(24) int local24 = 4096 / this.anInt4214;
		@Pc(31) int local31 = this.anInt4213 * local24 >> 12;
		for (@Pc(33) int local33 = 0; local33 < this.anInt4214; local33++) {
			this.anIntArray478[local33] = local19;
			this.anIntArray479[local33] = local19 + local31;
			local19 += local24;
		}
		this.anIntArray478[this.anInt4214] = 4096;
		this.anIntArray479[this.anInt4214] = this.anIntArray479[0] + 4096;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(25) int local25 = Static22.anIntArray68[arg0];
			@Pc(34) int local34;
			if (this.anInt4212 == 0) {
				@Pc(134) short local134 = 0;
				for (local34 = 0; local34 < this.anInt4214; local34++) {
					if (this.anIntArray478[local34] <= local25 && local25 < this.anIntArray478[local34 + 1]) {
						if (local25 < this.anIntArray479[local34]) {
							local134 = 4096;
						}
						break;
					}
				}
				Static217.method2360(local7, 0, Static176.anInt3921, local134);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static176.anInt3921; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static171.anIntArray439[local30];
					@Pc(43) int local43 = this.anInt4212;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local40 + local25 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt4214; local43++) {
						if (local34 >= this.anIntArray478[local43] && this.anIntArray478[local43 + 1] > local34) {
							if (local34 < this.anIntArray479[local43]) {
								local36 = 4096;
							}
							break;
						}
					}
					local7[local30] = local36;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4214 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt4213 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt4212 = arg1.method1738();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.method3187();
	}
}
