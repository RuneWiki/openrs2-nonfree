import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!em", name = "Y", descriptor = "[I")
	protected int[] anIntArray335;

	@OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
	protected int anInt3698;

	@OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
	protected int anInt3700;

	@OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
	private int anInt3697 = -1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V")
	@Override
	public final void method4762() {
		super.method4762();
		this.anIntArray335 = null;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I")
	@Override
	public final int method4751() {
		return this.anInt3697;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118 && this.method2994()) {
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(57) int local57 = this.anInt3700 * (Static6.anInt2264 == this.anInt3698 ? arg0 : this.anInt3698 * arg0 / Static6.anInt2264);
			@Pc(61) int[] local61 = local19[2];
			@Pc(71) int local71;
			@Pc(85) int local85;
			if (this.anInt3700 == Static75.anInt1848) {
				for (local71 = 0; local71 < Static75.anInt1848; local71++) {
					local85 = this.anIntArray335[local57++];
					local61[local71] = (local85 & 0xFF) << 4;
					local37[local71] = local85 >> 4 & 0xFF0;
					local33[local71] = local85 >> 12 & 0xFF0;
				}
			} else {
				for (local71 = 0; local71 < Static75.anInt1848; local71++) {
					local85 = local71 * this.anInt3700 / Static75.anInt1848;
					@Pc(92) int local92 = this.anIntArray335[local57 + local85];
					local61[local71] = (local92 & 0xFF) << 4;
					local37[local71] = local92 >> 4 & 0xFF0;
					local33[local71] = local92 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public final void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3697 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(B)Z")
	protected final boolean method2994() {
		if (this.anIntArray335 != null) {
			return true;
		} else if (this.anInt3697 < 0) {
			return false;
		} else {
			@Pc(34) Class1_Sub2_Sub14_Sub1 local34 = Static12.anInt293 < 0 ? Static186.method3355(Static92.aClass83_60, this.anInt3697) : Static135.method2305(Static92.aClass83_60, this.anInt3697, Static12.anInt293);
			local34.method2485();
			this.anInt3700 = local34.anInt3438;
			this.anInt3698 = local34.anInt3430;
			this.anIntArray335 = local34.anIntArray294;
			return true;
		}
	}
}
