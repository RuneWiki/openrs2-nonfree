import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class7_Sub3_Sub11 extends Class7_Sub3 {

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
	private int anInt2154 = 10;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	private int anInt2151 = 0;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
	private int anInt2158 = 2048;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(19) int local19 = Static203.anIntArray322[arg0];
			@Pc(28) int local28;
			if (this.anInt2151 == 0) {
				@Pc(140) short local140 = 0;
				for (local28 = 0; local28 < this.anInt2154; local28++) {
					if (local19 >= this.anIntArray144[local28] && this.anIntArray144[local28 + 1] > local19) {
						if (local19 < this.anIntArray143[local28]) {
							local140 = 4096;
						}
						break;
					}
				}
				Static464.method3634(local11, 0, Static58.anInt1052, local140);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static58.anInt1052; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static185.anIntArray298[local24];
					@Pc(37) int local37 = this.anInt2151;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local19 + local34 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt2154; local37++) {
						if (this.anIntArray144[local37] <= local28 && local28 < this.anIntArray144[local37 + 1]) {
							if (local28 < this.anIntArray143[local37]) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		this.method1838();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2154 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt2158 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt2151 = arg1.method3981();
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	private void method1838() {
		this.anIntArray143 = new int[this.anInt2154 + 1];
		this.anIntArray144 = new int[this.anInt2154 + 1];
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = 4096 / this.anInt2154;
		@Pc(39) int local39 = local32 * this.anInt2158 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt2154; local41++) {
			this.anIntArray144[local41] = local27;
			this.anIntArray143[local41] = local39 + local27;
			local27 += local32;
		}
		this.anIntArray144[this.anInt2154] = 4096;
		this.anIntArray143[this.anInt2154] = this.anIntArray143[0] + 4096;
	}
}
