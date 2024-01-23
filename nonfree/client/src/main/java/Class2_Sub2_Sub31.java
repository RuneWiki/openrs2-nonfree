import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!rg", name = "U", descriptor = "[I")
	private int[] anIntArray676;

	@OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
	private int anInt4145;

	@OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
	private int anInt4143 = -1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4143 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82 && this.method3275()) {
			@Pc(46) int local46 = (this.anInt4134 == Static11.anInt313 ? arg0 : arg0 * this.anInt4134 / Static11.anInt313) * this.anInt4145;
			@Pc(50) int[] local50 = local18[0];
			@Pc(54) int[] local54 = local18[1];
			@Pc(58) int[] local58 = local18[2];
			@Pc(68) int local68;
			@Pc(77) int local77;
			if (this.anInt4145 == Static54.anInt953) {
				for (local68 = 0; local68 < Static54.anInt953; local68++) {
					local77 = this.anIntArray676[local46++];
					local58[local68] = (local77 & 0xFF) << 4;
					local54[local68] = local77 >> 4 & 0xFF0;
					local50[local68] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local68 = 0; local68 < Static54.anInt953; local68++) {
					local77 = this.anInt4145 * local68 / Static54.anInt953;
					@Pc(84) int local84 = this.anIntArray676[local77 + local46];
					local58[local68] = (local84 & 0xFF) << 4;
					local54[local68] = local84 >> 4 & 0xFF0;
					local50[local68] = local84 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
	@Override
	public void method3964() {
		super.method3964();
		this.anIntArray676 = null;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)I")
	@Override
	public int method3965() {
		return this.anInt4143;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)Z")
	private boolean method3275() {
		if (this.anIntArray676 != null) {
			return true;
		} else if (this.anInt4143 >= 0) {
			@Pc(19) int local19 = Static54.anInt953;
			@Pc(21) int local21 = Static11.anInt313;
			@Pc(31) int local31 = Static209.anInterface4_3.method760(this.anInt4143) ? 64 : 128;
			this.anIntArray676 = Static209.anInterface4_3.method756(this.anInt4143);
			this.anInt4145 = local31;
			this.anInt4134 = local31;
			Static62.method1005(local19, local21);
			return this.anIntArray676 != null;
		} else {
			return false;
		}
	}
}
