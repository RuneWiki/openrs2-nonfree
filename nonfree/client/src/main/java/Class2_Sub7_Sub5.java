import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class2_Sub7_Sub5 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bw", name = "O", descriptor = "I")
	private int anInt921 = 1;

	@OriginalMember(owner = "client!bw", name = "L", descriptor = "I")
	private int anInt918 = 204;

	@OriginalMember(owner = "client!bw", name = "N", descriptor = "I")
	private int anInt920 = 1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			for (@Pc(27) int local27 = 0; local27 < Static352.anInt6485; local27++) {
				@Pc(33) int local33 = Static427.anIntArray602[local27];
				@Pc(37) int local37 = Static313.anIntArray521[arg0];
				@Pc(44) int local44 = local33 * this.anInt920 >> 12;
				@Pc(51) int local51 = this.anInt921 * local37 >> 12;
				@Pc(61) int local61 = this.anInt920 * (local33 % (4096 / this.anInt920));
				@Pc(71) int local71 = this.anInt921 * (local37 % (4096 / this.anInt921));
				if (local71 < this.anInt918) {
					for (local44 -= local51; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 != 1) {
						local11[local27] = 0;
						continue;
					}
					if (this.anInt918 > local61) {
						local11[local27] = 0;
						continue;
					}
				}
				if (local61 < this.anInt918) {
					for (local44 -= local51; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 > 0) {
						local11[local27] = 0;
						continue;
					}
				}
				local11[local27] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt920 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt921 = arg1.method5170();
		} else if (arg0 == 2) {
			this.anInt918 = arg1.method5229();
		}
	}
}
