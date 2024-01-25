import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!us", name = "E", descriptor = "I")
	protected int anInt1462;

	@OriginalMember(owner = "client!us", name = "F", descriptor = "I")
	protected int anInt1463;

	@OriginalMember(owner = "client!us", name = "H", descriptor = "[I")
	protected int[] anIntArray72;

	@OriginalMember(owner = "client!us", name = "L", descriptor = "I")
	private int anInt1467 = -1;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254 && this.method1205()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(52) int local52 = this.anInt1463 * (this.anInt1462 == Static458.anInt7496 ? arg0 : arg0 * this.anInt1462 / Static458.anInt7496);
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static148.anInt2666 == this.anInt1463) {
				for (local58 = 0; local58 < Static148.anInt2666; local58++) {
					local67 = this.anIntArray72[local52++];
					local36[local58] = (local67 & 0xFF) << 4;
					local32[local58] = local67 >> 4 & 0xFF0;
					local28[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static148.anInt2666; local58++) {
					local67 = local58 * this.anInt1463 / Static148.anInt2666;
					@Pc(74) int local74 = this.anIntArray72[local67 + local52];
					local36[local58] = (local74 & 0xFF) << 4;
					local32[local58] = local74 >> 4 & 0xFF0;
					local28[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
	@Override
	public final void method5768() {
		super.method5768();
		this.anIntArray72 = null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public final void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt1467 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(I)Z")
	protected final boolean method1205() {
		if (this.anIntArray72 != null) {
			return true;
		} else if (this.anInt1467 >= 0) {
			@Pc(27) Class214 local27 = Static308.anInt4794 >= 0 ? Static470.method4672(Static165.aClass243_96, Static308.anInt4794, this.anInt1467) : Static470.method4665(Static165.aClass243_96, this.anInt1467);
			local27.method4675();
			this.anIntArray72 = local27.method4676();
			this.anInt1462 = local27.anInt5885;
			this.anInt1463 = local27.anInt5882;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I")
	@Override
	public final int method5766() {
		return this.anInt1467;
	}
}
