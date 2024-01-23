import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
	protected int anInt1727;

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
	protected int anInt1730;

	@OriginalMember(owner = "client!rk", name = "ab", descriptor = "[I")
	protected int[] anIntArray150;

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
	private int anInt1724 = -1;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I")
	@Override
	public final int method4596() {
		return this.anInt1724;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53 && this.method1330()) {
			@Pc(32) int[] local32 = local19[0];
			@Pc(36) int[] local36 = local19[2];
			@Pc(40) int[] local40 = local19[1];
			@Pc(56) int local56 = this.anInt1730 * (Static64.anInt1560 == this.anInt1727 ? arg0 : arg0 * this.anInt1727 / Static64.anInt1560);
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (Static281.anInt5558 == this.anInt1730) {
				for (local66 = 0; local66 < Static281.anInt5558; local66++) {
					local75 = this.anIntArray150[local56++];
					local36[local66] = (local75 & 0xFF) << 4;
					local40[local66] = local75 >> 4 & 0xFF0;
					local32[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static281.anInt5558; local66++) {
					local75 = local66 * this.anInt1730 / Static281.anInt5558;
					@Pc(127) int local127 = this.anIntArray150[local75 + local56];
					local36[local66] = (local127 & 0xFF) << 4;
					local40[local66] = local127 >> 4 & 0xFF0;
					local32[local66] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public final void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1724 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	@Override
	public final void method4591() {
		super.method4591();
		this.anIntArray150 = null;
	}

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "(I)Z")
	protected final boolean method1330() {
		if (this.anIntArray150 != null) {
			return true;
		} else if (this.anInt1724 >= 0) {
			@Pc(30) Class2_Sub8_Sub1_Sub1 local30 = Static89.anInt2131 < 0 ? Static72.method1393(this.anInt1724, Static263.aClass42_88) : Static128.method2315(Static89.anInt2131, Static263.aClass42_88, this.anInt1724);
			local30.method2784();
			this.anInt1727 = local30.anInt5517;
			this.anInt1730 = local30.anInt5514;
			this.anIntArray150 = local30.anIntArray340;
			return true;
		} else {
			return false;
		}
	}
}
