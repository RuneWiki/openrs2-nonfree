import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class6_Sub4_Sub11 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	private int anInt2043 = 10;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	private int anInt2047 = 0;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt2049 = 2048;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	private void method1905() {
		@Pc(7) int local7 = 0;
		this.anIntArray160 = new int[this.anInt2043 + 1];
		this.anIntArray161 = new int[this.anInt2043 + 1];
		@Pc(26) int local26 = 4096 / this.anInt2043;
		@Pc(33) int local33 = this.anInt2049 * local26 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt2043; local41++) {
			this.anIntArray161[local41] = local7;
			this.anIntArray160[local41] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray161[this.anInt2043] = 4096;
		this.anIntArray160[this.anInt2043] = this.anIntArray160[0] + 4096;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		this.method1905();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt2043 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt2049 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt2047 = arg1.method6069();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(19) int local19 = Static501.anIntArray637[arg0];
			@Pc(26) int local26;
			if (this.anInt2047 == 0) {
				@Pc(24) short local24 = 0;
				for (local26 = 0; local26 < this.anInt2043; local26++) {
					if (this.anIntArray161[local26] <= local19 && this.anIntArray161[local26 + 1] > local19) {
						if (local19 < this.anIntArray160[local26]) {
							local24 = 4096;
						}
						break;
					}
				}
				Static601.method2939(local11, 0, Static408.anInt7209, local24);
			} else {
				for (@Pc(66) int local66 = 0; local66 < Static408.anInt7209; local66++) {
					local26 = 0;
					@Pc(72) short local72 = 0;
					@Pc(76) int local76 = Static398.anIntArray514[local66];
					@Pc(79) int local79 = this.anInt2047;
					if (local79 == 1) {
						local26 = local76;
					} else if (local79 == 2) {
						local26 = (local19 + local76 - 4096 >> 1) + 2048;
					} else if (local79 == 3) {
						local26 = (local76 - local19 >> 1) + 2048;
					}
					for (local79 = 0; local79 < this.anInt2043; local79++) {
						if (this.anIntArray161[local79] <= local26 && local26 < this.anIntArray161[local79 + 1]) {
							if (local26 < this.anIntArray160[local79]) {
								local72 = 4096;
							}
							break;
						}
					}
					local11[local66] = local72;
				}
			}
		}
		return local11;
	}
}
