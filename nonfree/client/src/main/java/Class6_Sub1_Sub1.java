import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!lca", name = "K", descriptor = "I")
	protected int anInt154;

	@OriginalMember(owner = "client!lca", name = "M", descriptor = "[I")
	protected int[] anIntArray3;

	@OriginalMember(owner = "client!lca", name = "N", descriptor = "I")
	protected int anInt156;

	@OriginalMember(owner = "client!lca", name = "E", descriptor = "I")
	private int anInt150 = -1;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public final void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt150 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
	protected final boolean method170() {
		if (this.anIntArray3 != null) {
			return true;
		} else if (this.anInt150 >= 0) {
			@Pc(35) Class112 local35 = Static351.anInt5999 < 0 ? Static681.method2317(Static207.aClass8_57, this.anInt150) : Static681.method2327(Static207.aClass8_57, Static351.anInt5999, this.anInt150);
			local35.method2325();
			this.anIntArray3 = local35.method2324();
			this.anInt156 = local35.anInt2743;
			this.anInt154 = local35.anInt2740;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	@Override
	public final void method8952() {
		super.method8952();
		this.anIntArray3 = null;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81 && this.method170()) {
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			@Pc(54) int local54 = this.anInt156 * (Static434.anInt7425 == this.anInt154 ? arg0 : arg0 * this.anInt154 / Static434.anInt7425);
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (Static479.anInt8231 == this.anInt156) {
				for (local64 = 0; local64 < Static479.anInt8231; local64++) {
					local72 = this.anIntArray3[local54++];
					local38[local64] = (local72 & 0xFF) << 4;
					local34[local64] = local72 >> 4 & 0xFF0;
					local30[local64] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static479.anInt8231; local64++) {
					local72 = local64 * this.anInt156 / Static479.anInt8231;
					@Pc(124) int local124 = this.anIntArray3[local54 + local72];
					local38[local64] = (local124 & 0xFF) << 4;
					local34[local64] = local124 >> 4 & 0xFF0;
					local30[local64] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)I")
	@Override
	public final int method8961() {
		return this.anInt150;
	}
}
