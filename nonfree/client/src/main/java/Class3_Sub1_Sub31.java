import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
	private int anInt3706;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "[I")
	private int[] anIntArray624;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
	private int anInt3713;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
	private int anInt3710;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3710 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt3706 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt3713 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.method2828();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(31) int[] local31 = this.method3120(0, arg0 - 1 & Static106.anInt2755);
			@Pc(37) int[] local37 = this.method3120(0, arg0);
			@Pc(47) int[] local47 = this.method3120(0, Static106.anInt2755 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static129.anInt3285; local49++) {
				@Pc(63) int local63 = (local47[local49] - local31[local49]) * this.anInt3710;
				@Pc(83) int local83 = (local37[local49 + 1 & Static105.anInt2733] - local37[Static105.anInt2733 & local49 - 1]) * this.anInt3710;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((local103 + local97 + 4096) / 4096)) * 4096.0D);
				@Pc(124) int local124;
				@Pc(120) int local120;
				@Pc(122) int local122;
				if (local116 == 0) {
					local120 = 0;
					local122 = 0;
					local124 = 0;
				} else {
					local122 = 16777216 / local116;
					local120 = local63 / local116;
					local124 = local83 / local116;
				}
				local124 = local124 * this.anIntArray624[0] >> 12;
				local122 = this.anIntArray624[2] * local122 >> 12;
				local120 = this.anIntArray624[1] * local120 >> 12;
				local17[local49] = local122 + local120 + local124;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	private void method2828() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt3713 / 4096));
		this.anIntArray624[0] = (int) (local10 * Math.sin((double) (this.anInt3706 / 4096)) * 4096.0D);
		this.anIntArray624[1] = (int) (local10 * Math.cos((double) (this.anInt3706 / 4096)) * 4096.0D);
		this.anIntArray624[2] = (int) (Math.sin((double) (this.anInt3713 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray624[1] * this.anIntArray624[1] >> 12;
		@Pc(77) int local77 = this.anIntArray624[0] * this.anIntArray624[0] >> 12;
		@Pc(89) int local89 = this.anIntArray624[2] * this.anIntArray624[2] >> 12;
		@Pc(102) int local102 = (int) (Math.sqrt((double) (local77 + local65 + local89 >> 12)) * 4096.0D);
		if (local102 != 0) {
			this.anIntArray624[1] = (this.anIntArray624[1] << 12) / local102;
			this.anIntArray624[2] = (this.anIntArray624[2] << 12) / local102;
			this.anIntArray624[0] = (this.anIntArray624[0] << 12) / local102;
		}
	}
}
