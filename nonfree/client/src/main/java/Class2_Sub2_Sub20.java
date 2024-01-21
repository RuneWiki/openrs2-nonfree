import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	protected int anInt2797;

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "[I")
	protected int[] anIntArray321;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	protected int anInt2803;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	private int anInt2808 = -1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(0, false);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	@Override
	public final void method3567() {
		super.method3567();
		this.anIntArray321 = null;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
	@Override
	public final int method3560() {
		return this.anInt2808;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177 && this.method2237()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(51) int local51 = (this.anInt2803 == Static57.anInt1795 ? arg0 : arg0 * this.anInt2803 / Static57.anInt1795) * this.anInt2797;
			@Pc(55) int[] local55 = local19[2];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (Static106.anInt3045 == this.anInt2797) {
				for (local65 = 0; local65 < Static106.anInt3045; local65++) {
					local74 = this.anIntArray321[local51++];
					local55[local65] = (local74 & 0xFF) << 4;
					local35[local65] = local74 >> 4 & 0xFF0;
					local31[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static106.anInt3045; local65++) {
					local74 = this.anInt2797 * local65 / Static106.anInt3045;
					@Pc(82) int local82 = this.anIntArray321[local51 + local74];
					local55[local65] = (local82 & 0xFF) << 4;
					local35[local65] = local82 >> 4 & 0xFF0;
					local31[local65] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public final void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2808 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)Z")
	protected final boolean method2237() {
		if (this.anIntArray321 != null) {
			return true;
		} else if (this.anInt2808 >= 0) {
			@Pc(25) Class2_Sub1_Sub7_Sub4 local25 = Static152.method2234(this.anInt2808, Static98.aClass13_20);
			local25.method2147();
			this.anInt2803 = local25.anInt2691;
			this.anInt2797 = local25.anInt2694;
			this.anIntArray321 = local25.anIntArray310;
			return true;
		} else {
			return false;
		}
	}
}
