import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
	protected int anInt1862;

	@OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
	protected int anInt1867;

	@OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
	protected int[] anIntArray172;

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
	private int anInt1868 = -1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	@Override
	public final void method4456() {
		super.method4456();
		this.anIntArray172 = null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144 && this.method1449()) {
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(53) int local53 = (this.anInt1862 == Static26.anInt632 ? arg0 : this.anInt1862 * arg0 / Static26.anInt632) * this.anInt1867;
			@Pc(57) int[] local57 = local19[2];
			@Pc(63) int local63;
			@Pc(77) int local77;
			if (this.anInt1867 == Static227.anInt4511) {
				for (local63 = 0; local63 < Static227.anInt4511; local63++) {
					local77 = this.anIntArray172[local53++];
					local57[local63] = (local77 & 0xFF) << 4;
					local37[local63] = local77 >> 4 & 0xFF0;
					local33[local63] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static227.anInt4511; local63++) {
					local77 = local63 * this.anInt1867 / Static227.anInt4511;
					@Pc(85) int local85 = this.anIntArray172[local53 + local77];
					local57[local63] = (local85 & 0xFF) << 4;
					local37[local63] = local85 >> 4 & 0xFF0;
					local33[local63] = local85 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)Z")
	protected final boolean method1449() {
		if (this.anIntArray172 != null) {
			return true;
		} else if (this.anInt1868 < 0) {
			return false;
		} else {
			@Pc(39) Class1_Sub2_Sub11_Sub2 local39 = Static100.anInt2368 < 0 ? Static193.method3187(this.anInt1868, Static254.aClass91_181) : Static109.method2013(Static254.aClass91_181, Static100.anInt2368, this.anInt1868);
			local39.method3783();
			this.anIntArray172 = local39.anIntArray426;
			this.anInt1862 = local39.anInt4869;
			this.anInt1867 = local39.anInt4874;
			return true;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I")
	@Override
	public final int method4446() {
		return this.anInt1868;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public final void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1868 = arg0.method2691();
		}
	}
}
