import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!io", name = "A", descriptor = "I")
	private int anInt4244 = 1024;

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	private int anInt4248 = 2048;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "I")
	private int anInt4249 = 3072;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(26) int[][] local26 = this.method7833(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static501.anInt8748; local52++) {
				local42[local52] = (this.anInt4248 * local30[local52] >> 12) + this.anInt4244;
				local46[local52] = (this.anInt4248 * local34[local52] >> 12) + this.anInt4244;
				local50[local52] = (local38[local52] * this.anInt4248 >> 12) + this.anInt4244;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(21) int[] local21 = this.method7836(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static501.anInt8748; local23++) {
				local11[local23] = (this.anInt4248 * local21[local23] >> 12) + this.anInt4244;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		this.anInt4248 = this.anInt4249 - this.anInt4244;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4244 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt4249 = arg1.method7945();
		} else if (arg0 == 2) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}
}
