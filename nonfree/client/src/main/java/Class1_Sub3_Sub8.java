import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "[I")
	public static final int[] anIntArray156 = new int[16384];

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "[I")
	public static final int[] anIntArray159 = new int[16384];

	@OriginalMember(owner = "client!dk", name = "L", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!dk", name = "M", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
	private int anInt1690 = 10;

	@OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
	private int anInt1696 = 0;

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
	private int anInt1691 = 2048;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray159[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray156[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(27) int local27 = Static266.anIntArray454[arg0];
			@Pc(34) int local34;
			if (this.anInt1696 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt1690; local34++) {
					if (local27 >= this.anIntArray158[local34] && this.anIntArray158[local34 + 1] > local27) {
						if (local27 < this.anIntArray157[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static361.method1333(local19, 0, Static153.anInt3378, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static153.anInt3378; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static107.anIntArray234[local78];
					@Pc(91) int local91 = this.anInt1696;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local27 + local88 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local27 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt1690; local91++) {
						if (local34 >= this.anIntArray158[local91] && this.anIntArray158[local91 + 1] > local34) {
							if (this.anIntArray157[local91] > local34) {
								local84 = 4096;
							}
							break;
						}
					}
					local19[local78] = local84;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		this.method1462();
	}

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V")
	private void method1462() {
		this.anIntArray157 = new int[this.anInt1690 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray158 = new int[this.anInt1690 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1690;
		@Pc(39) int local39 = this.anInt1691 * local26 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt1690; local41++) {
			this.anIntArray158[local41] = local14;
			this.anIntArray157[local41] = local39 + local14;
			local14 += local26;
		}
		this.anIntArray158[this.anInt1690] = 4096;
		this.anIntArray157[this.anInt1690] = this.anIntArray157[0] + 4096;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1690 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt1691 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt1696 = arg1.method4532();
		}
	}
}
