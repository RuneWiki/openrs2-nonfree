import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!t", name = "W", descriptor = "[I")
	protected int[] anIntArray386;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
	protected int anInt3956;

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
	protected int anInt3957;

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
	private int anInt3958;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123 && this.method2673()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (Static11.anInt283 == this.anInt3957 ? arg0 : arg0 * this.anInt3957 / Static11.anInt283) * this.anInt3956;
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt3956 == Static120.anInt2812) {
				for (local57 = 0; local57 < Static120.anInt2812; local57++) {
					local66 = this.anIntArray386[local51++];
					local31[local57] = (local66 & 0xFF) << 4;
					local27[local57] = local66 >> 4 & 0xFF0;
					local23[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static120.anInt2812; local57++) {
					local66 = local57 * this.anInt3956 / Static120.anInt2812;
					@Pc(74) int local74 = this.anIntArray386[local51 + local66];
					local31[local57] = (local74 & 0xFF) << 4;
					local27[local57] = local74 >> 4 & 0xFF0;
					local23[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Z")
	protected final boolean method2673() {
		if (this.anIntArray386 != null) {
			return true;
		} else if (this.anInt3958 >= 0) {
			@Pc(22) Class2_Sub3_Sub2_Sub1 local22 = Static57.method943(this.anInt3958, Static49.aClass10_51);
			local22.method288();
			this.anInt3956 = local22.anInt384;
			this.anIntArray386 = local22.anIntArray14;
			this.anInt3957 = local22.anInt387;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)I")
	@Override
	public final int method2800() {
		return this.anInt3958;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public final void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3958 = arg0.method1397();
		}
	}
}
