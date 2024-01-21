import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!di", name = "T", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!di", name = "U", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			for (@Pc(17) int local17 = 0; local17 < Static53.anInt1184; local17++) {
				@Pc(31) int local31 = this.anInt928 + (Static43.anIntArray102[local17] << 12) / this.anInt921;
				@Pc(43) int local43 = this.anInt923 + (Static50.anIntArray106[arg0] << 12) / this.anInt921;
				@Pc(49) int local49 = local43;
				@Pc(55) int local55 = local31 * local31 >> 12;
				@Pc(57) int local57 = local31;
				@Pc(59) int local59 = 0;
				for (@Pc(65) int local65 = local43 * local43 >> 12; local55 + local65 < 16384 && this.anInt922 > local59; local65 = local49 * local49 >> 12) {
					local59++;
					local49 = (local57 * local49 >> 12) * 2 + local43;
					local57 = local55 + local31 - local65;
					local55 = local57 * local57 >> 12;
				}
				local11[local17] = local59 < this.anInt922 - 1 ? (local59 << 12) / this.anInt922 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt921 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt922 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt928 = arg1.method2933();
		} else if (arg0 == 3) {
			this.anInt923 = arg1.method2933();
		}
	}
}
