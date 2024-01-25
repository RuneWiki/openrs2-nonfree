import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class4_Sub2_Sub38 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	private int anInt10321 = 1;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
	private int anInt10318 = 1;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private int anInt10320 = 204;

	static {
		new Class268("", 73);
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			for (@Pc(21) int local21 = 0; local21 < Static269.anInt4330; local21++) {
				@Pc(27) int local27 = Static312.anIntArray370[local21];
				@Pc(31) int local31 = Static429.anIntArray465[arg0];
				@Pc(38) int local38 = this.anInt10321 * local27 >> 12;
				@Pc(45) int local45 = local31 * this.anInt10318 >> 12;
				@Pc(55) int local55 = local27 % (4096 / this.anInt10321) * this.anInt10321;
				@Pc(65) int local65 = this.anInt10318 * (local31 % (4096 / this.anInt10318));
				if (this.anInt10320 > local65) {
					for (local38 -= local45; local38 < 0; local38 += 4) {
					}
					while (local38 > 3) {
						local38 -= 4;
					}
					if (local38 != 1) {
						local11[local21] = 0;
						continue;
					}
					if (this.anInt10320 > local55) {
						local11[local21] = 0;
						continue;
					}
				}
				if (this.anInt10320 > local55) {
					for (local38 -= local45; local38 < 0; local38 += 4) {
					}
					while (local38 > 3) {
						local38 -= 4;
					}
					if (local38 > 0) {
						local11[local21] = 0;
						continue;
					}
				}
				local11[local21] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10321 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt10318 = arg1.method8865();
		} else if (arg0 == 2) {
			this.anInt10320 = arg1.method8859();
		}
	}
}
