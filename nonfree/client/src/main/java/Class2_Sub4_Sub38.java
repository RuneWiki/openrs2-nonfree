import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub4_Sub38 extends Class2_Sub4 {

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "[I")
	private int[] anIntArray388;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	private int anInt4342;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	private int anInt4334 = -1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub38() {
		super(0, false);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176 && this.method3034()) {
			@Pc(42) int local42 = this.anInt4342 * (this.anInt4333 == Static38.anInt3056 ? arg0 : this.anInt4333 * arg0 / Static38.anInt3056);
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local18[2];
			@Pc(54) int[] local54 = local18[1];
			@Pc(60) int local60;
			@Pc(69) int local69;
			if (this.anInt4342 == Static118.anInt2608) {
				for (local60 = 0; local60 < Static118.anInt2608; local60++) {
					local69 = this.anIntArray388[local42++];
					local50[local60] = (local69 & 0xFF) << 4;
					local54[local60] = local69 >> 4 & 0xFF0;
					local46[local60] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static118.anInt2608; local60++) {
					local69 = local60 * this.anInt4342 / Static118.anInt2608;
					@Pc(76) int local76 = this.anIntArray388[local42 + local69];
					local50[local60] = (local76 & 0xFF) << 4;
					local54[local60] = local76 >> 4 & 0xFF0;
					local46[local60] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)Z")
	private boolean method3034() {
		if (this.anIntArray388 != null) {
			return true;
		} else if (this.anInt4334 >= 0) {
			@Pc(16) int local16 = Static118.anInt2608;
			@Pc(18) int local18 = Static38.anInt3056;
			@Pc(28) int local28 = Static88.anInterface3_2.method2294(this.anInt4334) ? 64 : 128;
			this.anIntArray388 = Static88.anInterface3_2.method2299(this.anInt4334);
			this.anInt4342 = local28;
			this.anInt4333 = local28;
			Static10.method175(local16, local18);
			return this.anIntArray388 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	@Override
	public void method3123() {
		super.method3123();
		this.anIntArray388 = null;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
	@Override
	public int method3125() {
		return this.anInt4334;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4334 = arg1.method1557();
		}
	}
}
