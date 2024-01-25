import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!ep", name = "N", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!ep", name = "J", descriptor = "I")
	private int anInt2298 = 0;

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
	private int anInt2299 = 10;

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
	private int anInt2302 = 2048;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		this.method1792();
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(25) int local25 = Static318.anIntArray565[arg0];
			@Pc(37) int local37;
			if (this.anInt2298 == 0) {
				@Pc(149) short local149 = 0;
				for (local37 = 0; local37 < this.anInt2299; local37++) {
					if (this.anIntArray176[local37] <= local25 && local25 < this.anIntArray176[local37 + 1]) {
						if (this.anIntArray175[local37] > local25) {
							local149 = 4096;
						}
						break;
					}
				}
				Static457.method686(local11, 0, Static429.anInt6518, local149);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static429.anInt6518; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static365.anIntArray535[local33];
					@Pc(46) int local46 = this.anInt2298;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local43 + local25 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt2299; local46++) {
						if (this.anIntArray176[local46] <= local37 && this.anIntArray176[local46 + 1] > local37) {
							if (local37 < this.anIntArray175[local46]) {
								local39 = 4096;
							}
							break;
						}
					}
					local11[local33] = local39;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)V")
	private void method1792() {
		this.anIntArray175 = new int[this.anInt2299 + 1];
		this.anIntArray176 = new int[this.anInt2299 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2299;
		@Pc(39) int local39 = local26 * this.anInt2302 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt2299; local41++) {
			this.anIntArray176[local41] = local21;
			this.anIntArray175[local41] = local21 + local39;
			local21 += local26;
		}
		this.anIntArray176[this.anInt2299] = 4096;
		this.anIntArray175[this.anInt2299] = this.anIntArray175[0] + 4096;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2299 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt2302 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt2298 = arg0.method5495();
		}
	}
}
