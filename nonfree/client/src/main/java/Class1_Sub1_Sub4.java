import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
	protected int anInt4319;

	@OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
	protected int[] anIntArray327;

	@OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
	protected int anInt4325;

	@OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
	private int anInt4320 = -1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public final void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4320 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134 && this.method3358()) {
			@Pc(30) int[] local30 = local11[1];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local11[2];
			@Pc(54) int local54 = (Static187.anInt4033 == this.anInt4325 ? arg0 : this.anInt4325 * arg0 / Static187.anInt4033) * this.anInt4319;
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (Static157.anInt3431 == this.anInt4319) {
				for (local64 = 0; local64 < Static157.anInt3431; local64++) {
					local73 = this.anIntArray327[local54++];
					local38[local64] = (local73 & 0xFF) << 4;
					local30[local64] = local73 >> 4 & 0xFF0;
					local34[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static157.anInt3431; local64++) {
					local73 = local64 * this.anInt4319 / Static157.anInt3431;
					@Pc(81) int local81 = this.anIntArray327[local54 + local73];
					local38[local64] = (local81 & 0xFF) << 4;
					local30[local64] = local81 >> 4 & 0xFF0;
					local34[local64] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)I")
	@Override
	public final int method3734() {
		return this.anInt4320;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	@Override
	public final void method3727() {
		super.method3727();
		this.anIntArray327 = null;
	}

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)Z")
	protected final boolean method3358() {
		if (this.anIntArray327 != null) {
			return true;
		} else if (this.anInt4320 >= 0) {
			@Pc(22) Class1_Sub2_Sub1_Sub1 local22 = Static15.method291(Static227.aClass70_45, this.anInt4320);
			local22.method2075();
			this.anInt4325 = local22.anInt2641;
			this.anInt4319 = local22.anInt2634;
			this.anIntArray327 = local22.anIntArray157;
			return true;
		} else {
			return false;
		}
	}
}
