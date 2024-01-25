import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class14_Sub3_Sub29 extends Class14_Sub3 {

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
	private int anInt4783 = 0;

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
	private int anInt4782 = 1365;

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
	private int anInt4781 = 0;

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
	private int anInt4786 = 20;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			for (@Pc(17) int local17 = 0; local17 < Static294.anInt5657; local17++) {
				@Pc(31) int local31 = this.anInt4781 + (Static346.anIntArray638[local17] << 12) / this.anInt4782;
				@Pc(43) int local43 = (Static213.anIntArray381[arg0] << 12) / this.anInt4782 + this.anInt4783;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local63 + local57 < 16384 && this.anInt4786 > local65) {
					local51 = (local51 * local49 >> 12) * 2 + local43;
					local49 = local31 + local57 - local63;
					local57 = local49 * local49 >> 12;
					local65++;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = local65 < this.anInt4786 - 1 ? (local65 << 12) / this.anInt4786 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4782 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt4786 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt4781 = arg0.method2498();
		} else if (arg1 == 3) {
			this.anInt4783 = arg0.method2498();
		}
	}
}
