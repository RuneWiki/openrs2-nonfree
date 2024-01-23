import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class8_Sub3_Sub17 extends Class8_Sub3 {

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
	private int anInt2038 = 2048;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
	private int anInt2039 = 0;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	private int anInt2031 = 10;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2031 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt2038 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt2039 = arg1.method2334();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(27) int local27 = Static33.anIntArray50[arg0];
			@Pc(34) int local34;
			if (this.anInt2039 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt2031; local34++) {
					if (local27 >= this.anIntArray141[local34] && this.anIntArray141[local34 + 1] > local27) {
						if (this.anIntArray140[local34] > local27) {
							local32 = 4096;
						}
						break;
					}
				}
				Static301.method500(local7, 0, Static239.anInt4789, local32);
			} else {
				for (@Pc(86) int local86 = 0; local86 < Static239.anInt4789; local86++) {
					local34 = 0;
					@Pc(99) int local99 = Static171.anIntArray258[local86];
					@Pc(101) short local101 = 0;
					@Pc(104) int local104 = this.anInt2039;
					if (local104 == 1) {
						local34 = local99;
					} else if (local104 == 2) {
						local34 = (local99 + local27 - 4096 >> 1) + 2048;
					} else if (local104 == 3) {
						local34 = (local99 - local27 >> 1) + 2048;
					}
					for (local104 = 0; local104 < this.anInt2031; local104++) {
						if (this.anIntArray141[local104] <= local34 && local34 < this.anIntArray141[local104 + 1]) {
							if (this.anIntArray140[local104] > local34) {
								local101 = 4096;
							}
							break;
						}
					}
					local7[local86] = local101;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		this.method1569();
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	private void method1569() {
		@Pc(14) int local14 = 4096 / this.anInt2031;
		this.anIntArray140 = new int[this.anInt2031 + 1];
		this.anIntArray141 = new int[this.anInt2031 + 1];
		@Pc(35) int local35 = local14 * this.anInt2038 >> 12;
		@Pc(37) int local37 = 0;
		for (@Pc(39) int local39 = 0; local39 < this.anInt2031; local39++) {
			this.anIntArray141[local39] = local37;
			this.anIntArray140[local39] = local35 + local37;
			local37 += local14;
		}
		this.anIntArray141[this.anInt2031] = 4096;
		this.anIntArray140[this.anInt2031] = this.anIntArray140[0] + 4096;
	}
}
