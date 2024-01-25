import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public class Class4_Sub2_Sub29 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "[I")
	protected int[] anIntArray631;

	@OriginalMember(owner = "client!uw", name = "T", descriptor = "I")
	protected int anInt8874;

	@OriginalMember(owner = "client!uw", name = "U", descriptor = "I")
	protected int anInt8875;

	@OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
	private int anInt8865 = -1;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(Z)V")
	@Override
	public final void method8763() {
		super.method8763();
		this.anIntArray631 = null;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	@Override
	public final int method8770() {
		return this.anInt8865;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public final void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt8865 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604 && this.method7584()) {
			@Pc(30) int[] local30 = local18[0];
			@Pc(34) int[] local34 = local18[1];
			@Pc(38) int[] local38 = local18[2];
			@Pc(54) int local54 = (this.anInt8875 == Static355.anInt5410 ? arg0 : arg0 * this.anInt8875 / Static355.anInt5410) * this.anInt8874;
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (this.anInt8874 == Static269.anInt4330) {
				for (local64 = 0; local64 < Static269.anInt4330; local64++) {
					local73 = this.anIntArray631[local54++];
					local38[local64] = (local73 & 0xFF) << 4;
					local34[local64] = local73 >> 4 & 0xFF0;
					local30[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static269.anInt4330; local64++) {
					local73 = local64 * this.anInt8874 / Static269.anInt4330;
					@Pc(80) int local80 = this.anIntArray631[local73 + local54];
					local38[local64] = (local80 & 0xFF) << 4;
					local34[local64] = local80 >> 4 & 0xFF0;
					local30[local64] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "(Z)Z")
	protected final boolean method7584() {
		if (this.anIntArray631 != null) {
			return true;
		} else if (this.anInt8865 >= 0) {
			@Pc(29) Class51 local29 = Static104.anInt2127 >= 0 ? Static682.method1662(Static142.aClass34_69, Static104.anInt2127, this.anInt8865) : Static682.method1664(Static142.aClass34_69, this.anInt8865);
			local29.method1654();
			this.anIntArray631 = local29.method1658();
			this.anInt8874 = local29.anInt1661;
			this.anInt8875 = local29.anInt1657;
			return true;
		} else {
			return false;
		}
	}
}
