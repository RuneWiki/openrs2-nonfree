import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class3_Sub9_Sub8 extends Class3_Sub9 {

	@OriginalMember(owner = "client!dt", name = "C", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
	private int anInt2423 = 10;

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
	private int anInt2427 = 2048;

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
	private int anInt2429 = 0;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2423 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt2427 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt2429 = arg0.method8632();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		this.method2220();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(24) int local24 = Static147.anIntArray259[arg0];
			@Pc(34) int local34;
			if (this.anInt2429 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt2423; local34++) {
					if (this.anIntArray196[local34] <= local24 && local24 < this.anIntArray196[local34 + 1]) {
						if (local24 < this.anIntArray197[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static684.method5330(local16, 0, Static62.anInt1251, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static62.anInt1251; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static239.anIntArray394[local78];
					@Pc(91) int local91 = this.anInt2429;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local88 + local24 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local24 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt2423; local91++) {
						if (local34 >= this.anIntArray196[local91] && local34 < this.anIntArray196[local91 + 1]) {
							if (this.anIntArray197[local91] > local34) {
								local84 = 4096;
							}
							break;
						}
					}
					local16[local78] = local84;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)V")
	private void method2220() {
		this.anIntArray197 = new int[this.anInt2423 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray196 = new int[this.anInt2423 + 1];
		@Pc(30) int local30 = 4096 / this.anInt2423;
		@Pc(37) int local37 = this.anInt2427 * local30 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt2423; local39++) {
			this.anIntArray196[local39] = local14;
			this.anIntArray197[local39] = local37 + local14;
			local14 += local30;
		}
		this.anIntArray196[this.anInt2423] = 4096;
		this.anIntArray197[this.anInt2423] = this.anIntArray197[0] + 4096;
	}
}
