import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class14_Sub7_Sub38 extends Class14_Sub7 {

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
	private int anInt10910 = 1365;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	private int anInt10914 = 0;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	private int anInt10911 = 0;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
	private int anInt10915 = 20;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt10910 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt10915 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt10914 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt10911 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			for (@Pc(24) int local24 = 0; local24 < Static613.anInt10114; local24++) {
				@Pc(38) int local38 = (Static588.anIntArray506[local24] << 12) / this.anInt10910 + this.anInt10914;
				@Pc(50) int local50 = this.anInt10911 + (Static655.anIntArray573[arg0] << 12) / this.anInt10910;
				@Pc(56) int local56 = local38;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local38 * local38 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local70 + local64 < 16384 && local72 < this.anInt10915) {
					local58 = local50 + (local56 * local58 >> 12) * 2;
					local56 = local38 + local64 - local70;
					local64 = local56 * local56 >> 12;
					local72++;
					local70 = local58 * local58 >> 12;
				}
				local11[local24] = local72 < this.anInt10915 - 1 ? (local72 << 12) / this.anInt10915 : 0;
			}
		}
		return local11;
	}
}
