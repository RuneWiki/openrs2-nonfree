import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class5_Sub6_Sub5 extends Class5_Sub6 {

	@OriginalMember(owner = "client!db", name = "D", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt1551 = 10;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	private int anInt1545 = 0;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	private int anInt1549 = 2048;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		this.method1444();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	private void method1444() {
		this.anIntArray89 = new int[this.anInt1551 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray88 = new int[this.anInt1551 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1551;
		@Pc(33) int local33 = local26 * this.anInt1549 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt1551; local43++) {
			this.anIntArray89[local43] = local14;
			this.anIntArray88[local43] = local14 + local33;
			local14 += local26;
		}
		this.anIntArray89[this.anInt1551] = 4096;
		this.anIntArray88[this.anInt1551] = this.anIntArray88[0] + 4096;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(23) int local23 = Static508.anIntArray471[arg0];
			@Pc(32) int local32;
			if (this.anInt1545 == 0) {
				@Pc(137) short local137 = 0;
				for (local32 = 0; local32 < this.anInt1551; local32++) {
					if (local23 >= this.anIntArray89[local32] && this.anIntArray89[local32 + 1] > local23) {
						if (this.anIntArray88[local32] > local23) {
							local137 = 4096;
						}
						break;
					}
				}
				Static685.method8333(local15, 0, Static421.anInt7443, local137);
			} else {
				for (@Pc(28) int local28 = 0; local28 < Static421.anInt7443; local28++) {
					local32 = 0;
					@Pc(34) short local34 = 0;
					@Pc(38) int local38 = Static207.anIntArray185[local28];
					@Pc(41) int local41 = this.anInt1545;
					if (local41 == 1) {
						local32 = local38;
					} else if (local41 == 2) {
						local32 = (local38 + local23 - 4096 >> 1) + 2048;
					} else if (local41 == 3) {
						local32 = (local38 - local23 >> 1) + 2048;
					}
					for (local41 = 0; local41 < this.anInt1551; local41++) {
						if (local32 >= this.anIntArray89[local41] && this.anIntArray89[local41 + 1] > local32) {
							if (local32 < this.anIntArray88[local41]) {
								local34 = 4096;
							}
							break;
						}
					}
					local15[local28] = local34;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1551 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt1549 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt1545 = arg0.method3642();
		}
	}
}
