import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class2_Sub4_Sub23 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nt", name = "S", descriptor = "[I")
	private int[] anIntArray832;

	@OriginalMember(owner = "client!nt", name = "U", descriptor = "[I")
	private int[] anIntArray833;

	@OriginalMember(owner = "client!nt", name = "Q", descriptor = "I")
	private int anInt4268 = 10;

	@OriginalMember(owner = "client!nt", name = "ab", descriptor = "I")
	private int anInt4275 = 2048;

	@OriginalMember(owner = "client!nt", name = "cb", descriptor = "I")
	private int anInt4277 = 0;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)V")
	private void method3867() {
		this.anIntArray833 = new int[this.anInt4268 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray832 = new int[this.anInt4268 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4268;
		@Pc(33) int local33 = local26 * this.anInt4275 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt4268; local41++) {
			this.anIntArray832[local41] = local14;
			this.anIntArray833[local41] = local14 + local33;
			local14 += local26;
		}
		this.anIntArray832[this.anInt4268] = 4096;
		this.anIntArray833[this.anInt4268] = this.anIntArray833[0] + 4096;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4268 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt4275 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt4277 = arg0.method5350();
		}
	}

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		this.method3867();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(25) int local25 = Static347.anIntArray1193[arg0];
			@Pc(35) int local35;
			if (this.anInt4277 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt4268; local35++) {
					if (local25 >= this.anIntArray832[local35] && this.anIntArray832[local35 + 1] > local25) {
						if (local25 < this.anIntArray833[local35]) {
							local33 = 4096;
						}
						break;
					}
				}
				Static399.method2490(local17, 0, Static76.anInt1458, local33);
			} else {
				for (@Pc(87) int local87 = 0; local87 < Static76.anInt1458; local87++) {
					local35 = 0;
					@Pc(93) short local93 = 0;
					@Pc(97) int local97 = Static40.anIntArray173[local87];
					@Pc(100) int local100 = this.anInt4277;
					if (local100 == 1) {
						local35 = local97;
					} else if (local100 == 2) {
						local35 = (local25 + local97 - 4096 >> 1) + 2048;
					} else if (local100 == 3) {
						local35 = (local97 - local25 >> 1) + 2048;
					}
					for (local100 = 0; local100 < this.anInt4268; local100++) {
						if (this.anIntArray832[local100] <= local35 && local35 < this.anIntArray832[local100 + 1]) {
							if (local35 < this.anIntArray833[local100]) {
								local93 = 4096;
							}
							break;
						}
					}
					local17[local87] = local93;
				}
			}
		}
		return local17;
	}
}
