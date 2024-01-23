import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public class Class8_Sub3_Sub2 extends Class8_Sub3 {

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
	protected int anInt348;

	@OriginalMember(owner = "client!wl", name = "N", descriptor = "[I")
	protected int[] anIntArray13;

	@OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
	protected int anInt353;

	@OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
	private int anInt349 = -1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public final void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt349 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	@Override
	public final void method4219() {
		super.method4219();
		this.anIntArray13 = null;
	}

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)Z")
	protected final boolean method257() {
		if (this.anIntArray13 != null) {
			return true;
		} else if (this.anInt349 >= 0) {
			@Pc(33) Class8_Sub1_Sub7_Sub1 local33 = Static107.anInt2226 >= 0 ? Static137.method1326(this.anInt349, Static107.anInt2226, Static20.aClass132_6) : Static72.method1148(Static20.aClass132_6, this.anInt349);
			local33.method1643();
			this.anInt353 = local33.anInt3602;
			this.anInt348 = local33.anInt3603;
			this.anIntArray13 = local33.anIntArray150;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451 && this.method257()) {
			@Pc(34) int[] local34 = local19[0];
			@Pc(38) int[] local38 = local19[2];
			@Pc(42) int[] local42 = local19[1];
			@Pc(62) int local62 = this.anInt353 * (Static86.anInt1852 == this.anInt348 ? arg0 : this.anInt348 * arg0 / Static86.anInt1852);
			@Pc(68) int local68;
			@Pc(82) int local82;
			if (this.anInt353 == Static239.anInt4789) {
				for (local68 = 0; local68 < Static239.anInt4789; local68++) {
					local82 = this.anIntArray13[local62++];
					local38[local68] = (local82 & 0xFF) << 4;
					local42[local68] = local82 >> 4 & 0xFF0;
					local34[local68] = local82 >> 12 & 0xFF0;
				}
			} else {
				for (local68 = 0; local68 < Static239.anInt4789; local68++) {
					local82 = local68 * this.anInt353 / Static239.anInt4789;
					@Pc(90) int local90 = this.anIntArray13[local62 + local82];
					local38[local68] = (local90 & 0xFF) << 4;
					local42[local68] = local90 >> 4 & 0xFF0;
					local34[local68] = local90 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I")
	@Override
	public final int method4222() {
		return this.anInt349;
	}
}
