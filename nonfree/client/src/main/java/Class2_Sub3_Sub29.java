import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub3_Sub29 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
	private int anInt3611;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
	private int anInt3607;

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "I")
	private int anInt3615;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		Static150.method2329();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3615 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt3611 = arg1.method1698();
		} else if (arg0 == 3) {
			this.anInt3607 = arg1.method1698();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(19) int local19 = Static21.anIntArray50[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static54.anInt1423; local27++) {
				@Pc(33) int local33 = Static36.anIntArray74[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt3615 == 0) {
					local61 = this.anInt3607 * (local33 - local19);
				} else {
					@Pc(52) int local52 = local39 * local39 + local25 * local25 >> 12;
					local61 = (int) (Math.sqrt((double) (local52 / 4096)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt3607) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt3611 == 0) {
					local61 = Static165.anIntArray339[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3611 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local11[local27] = local61;
			}
		}
		return local11;
	}
}
