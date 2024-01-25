import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class8_Sub2_Sub23 extends Class8_Sub2 {

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	private int anInt5825 = 0;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
	private int anInt5826 = 20;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	private int anInt5827 = 0;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	private int anInt5830 = 1365;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5830 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt5826 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt5825 = arg1.method8578();
		} else if (arg0 == 3) {
			this.anInt5827 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			for (@Pc(25) int local25 = 0; local25 < Static538.anInt9297; local25++) {
				@Pc(39) int local39 = this.anInt5825 + (Static93.anIntArray111[local25] << 12) / this.anInt5830;
				@Pc(51) int local51 = (Static426.anIntArray424[arg0] << 12) / this.anInt5830 + this.anInt5827;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73;
				for (local73 = 0; local65 + local71 < 16384 && this.anInt5826 > local73; local73++) {
					local59 = (local57 * local59 >> 12) * 2 + local51;
					local57 = local39 + local65 - local71;
					local65 = local57 * local57 >> 12;
					local71 = local59 * local59 >> 12;
				}
				local11[local25] = local73 >= this.anInt5826 - 1 ? 0 : (local73 << 12) / this.anInt5826;
			}
		}
		return local11;
	}
}
