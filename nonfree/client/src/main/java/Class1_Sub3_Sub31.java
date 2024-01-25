import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	protected int anInt5946;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
	protected int[] anIntArray496;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
	protected int anInt5955;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
	private int anInt5945 = -1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	@Override
	public final void method5536() {
		super.method5536();
		this.anIntArray496 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415 && this.method5087()) {
			@Pc(34) int[] local34 = local22[0];
			@Pc(38) int[] local38 = local22[1];
			@Pc(42) int[] local42 = local22[2];
			@Pc(58) int local58 = (Static319.anInt6144 == this.anInt5955 ? arg0 : this.anInt5955 * arg0 / Static319.anInt6144) * this.anInt5946;
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (Static153.anInt3378 == this.anInt5946) {
				for (local68 = 0; local68 < Static153.anInt3378; local68++) {
					local76 = this.anIntArray496[local58++];
					local42[local68] = (local76 & 0xFF) << 4;
					local38[local68] = local76 >> 4 & 0xFF0;
					local34[local68] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local68 = 0; local68 < Static153.anInt3378; local68++) {
					local76 = this.anInt5946 * local68 / Static153.anInt3378;
					@Pc(124) int local124 = this.anIntArray496[local76 + local58];
					local42[local68] = (local124 & 0xFF) << 4;
					local38[local68] = local124 >> 4 & 0xFF0;
					local34[local68] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
	@Override
	public final int method5524() {
		return this.anInt5945;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public final void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5945 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)Z")
	protected final boolean method5087() {
		if (this.anIntArray496 != null) {
			return true;
		} else if (this.anInt5945 >= 0) {
			@Pc(32) Class99 local32 = Static127.anInt2832 < 0 ? Static366.method2661(Static80.aClass216_31, this.anInt5945) : Static366.method2655(Static80.aClass216_31, Static127.anInt2832, this.anInt5945);
			local32.method2668();
			this.anIntArray496 = local32.method2664();
			this.anInt5946 = local32.anInt2875;
			this.anInt5955 = local32.anInt2877;
			return true;
		} else {
			return false;
		}
	}
}
