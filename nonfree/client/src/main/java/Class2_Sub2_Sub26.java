import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
	protected int anInt4173;

	@OriginalMember(owner = "client!pg", name = "ab", descriptor = "[I")
	protected int[] anIntArray681;

	@OriginalMember(owner = "client!pg", name = "kb", descriptor = "I")
	protected int anInt4183;

	@OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
	private int anInt4182 = -1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)I")
	@Override
	public final int method3962() {
		return this.anInt4182;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public final void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4182 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82 && this.method3301()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(57) int local57 = this.anInt4183 * (this.anInt4173 == Static11.anInt313 ? arg0 : this.anInt4173 * arg0 / Static11.anInt313);
			@Pc(67) int local67;
			@Pc(76) int local76;
			if (this.anInt4183 == Static54.anInt953) {
				for (local67 = 0; local67 < Static54.anInt953; local67++) {
					local76 = this.anIntArray681[local57++];
					local37[local67] = (local76 & 0xFF) << 4;
					local33[local67] = local76 >> 4 & 0xFF0;
					local29[local67] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static54.anInt953; local67++) {
					local76 = local67 * this.anInt4183 / Static54.anInt953;
					@Pc(83) int local83 = this.anIntArray681[local76 + local57];
					local37[local67] = (local83 & 0xFF) << 4;
					local33[local67] = local83 >> 4 & 0xFF0;
					local29[local67] = local83 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	@Override
	public final void method3964() {
		super.method3964();
		this.anIntArray681 = null;
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)Z")
	protected final boolean method3301() {
		if (this.anIntArray681 != null) {
			return true;
		} else if (this.anInt4182 >= 0) {
			@Pc(25) Class2_Sub3_Sub8_Sub1 local25 = Static143.method2555(this.anInt4182, Static227.aClass72_289);
			local25.method2274();
			this.anInt4183 = local25.anInt2847;
			this.anIntArray681 = local25.anIntArray470;
			this.anInt4173 = local25.anInt2845;
			return true;
		} else {
			return false;
		}
	}
}
