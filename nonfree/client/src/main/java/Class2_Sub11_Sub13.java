import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class2_Sub11_Sub13 extends Class2_Sub11 {

	@OriginalMember(owner = "client!km", name = "F", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!km", name = "N", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "I")
	private int anInt5246 = 10;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "I")
	private int anInt5249 = 2048;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "I")
	private int anInt5251 = 0;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V")
	private void method4723() {
		this.anIntArray369 = new int[this.anInt5246 + 1];
		@Pc(19) int local19 = 0;
		this.anIntArray370 = new int[this.anInt5246 + 1];
		@Pc(31) int local31 = 4096 / this.anInt5246;
		@Pc(38) int local38 = this.anInt5249 * local31 >> 12;
		for (@Pc(40) int local40 = 0; local40 < this.anInt5246; local40++) {
			this.anIntArray370[local40] = local19;
			this.anIntArray369[local40] = local19 + local38;
			local19 += local31;
		}
		this.anIntArray370[this.anInt5246] = 4096;
		this.anIntArray369[this.anInt5246] = this.anIntArray369[0] + 4096;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5246 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt5249 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt5251 = arg1.method8581(-17416);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(26) int local26 = Static137.anIntArray170[arg0];
			@Pc(35) int local35;
			if (this.anInt5251 == 0) {
				@Pc(153) short local153 = 0;
				for (local35 = 0; local35 < this.anInt5246; local35++) {
					if (local26 >= this.anIntArray370[local35] && this.anIntArray370[local35 + 1] > local26) {
						if (local26 < this.anIntArray369[local35]) {
							local153 = 4096;
						}
						break;
					}
				}
				Static728.method275(local11, 0, Static301.anInt10214, local153);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static301.anInt10214; local31++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static523.anIntArray461[local31];
					@Pc(44) int local44 = this.anInt5251;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local26 + local41 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local26 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt5246; local44++) {
						if (local35 >= this.anIntArray370[local44] && local35 < this.anIntArray370[local44 + 1]) {
							if (local35 < this.anIntArray369[local44]) {
								local37 = 4096;
							}
							break;
						}
					}
					local11[local31] = local37;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		this.method4723();
	}
}
