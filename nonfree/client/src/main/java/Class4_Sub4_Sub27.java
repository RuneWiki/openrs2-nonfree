import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class4_Sub4_Sub27 extends Class4_Sub4 {

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
	private int anInt6033 = 0;

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
	private int anInt6032 = 2048;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
	private int anInt6035 = 10;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
	private void method4848() {
		this.anIntArray473 = new int[this.anInt6035 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray472 = new int[this.anInt6035 + 1];
		@Pc(34) int local34 = 4096 / this.anInt6035;
		@Pc(41) int local41 = this.anInt6032 * local34 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt6035; local43++) {
			this.anIntArray473[local43] = local14;
			this.anIntArray472[local43] = local41 + local14;
			local14 += local34;
		}
		this.anIntArray473[this.anInt6035] = 4096;
		this.anIntArray472[this.anInt6035] = this.anIntArray472[0] + 4096;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt6035 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt6032 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt6033 = arg1.method5007();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(27) int local27 = Static334.anIntArray437[arg0];
			@Pc(37) int local37;
			if (this.anInt6033 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt6035; local37++) {
					if (this.anIntArray473[local37] <= local27 && local27 < this.anIntArray473[local37 + 1]) {
						if (this.anIntArray472[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static461.method1986(local19, 0, Static419.anInt6404, local35);
			} else {
				for (@Pc(93) int local93 = 0; local93 < Static419.anInt6404; local93++) {
					local37 = 0;
					@Pc(99) short local99 = 0;
					@Pc(103) int local103 = Static226.anIntArray284[local93];
					@Pc(106) int local106 = this.anInt6033;
					if (local106 == 1) {
						local37 = local103;
					} else if (local106 == 2) {
						local37 = (local103 + local27 - 4096 >> 1) + 2048;
					} else if (local106 == 3) {
						local37 = (local103 - local27 >> 1) + 2048;
					}
					for (local106 = 0; local106 < this.anInt6035; local106++) {
						if (local37 >= this.anIntArray473[local106] && local37 < this.anIntArray473[local106 + 1]) {
							if (this.anIntArray472[local106] > local37) {
								local99 = 4096;
							}
							break;
						}
					}
					local19[local93] = local99;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		this.method4848();
	}
}
