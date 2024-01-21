import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
	private int anInt1639 = -32768;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
	private final int anInt1634;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
	private final int anInt1629;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	private final int anInt1630;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
	private final int anInt1635;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
	private final int anInt1641;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	private final int anInt1632;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "Lclient!ta;")
	private Class5_Sub2_Sub22 aClass5_Sub2_Sub22_1;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
	private int anInt1637;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
	private int anInt1638;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIIIZLclient!ia;)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1 arg8) {
		this.anInt1634 = arg0;
		this.anInt1629 = arg3;
		this.anInt1630 = arg4;
		this.anInt1635 = arg1;
		this.anInt1641 = arg5;
		this.anInt1632 = arg2;
		if (arg6 != -1) {
			this.aClass5_Sub2_Sub22_1 = Static14.method253(arg6);
			this.anInt1637 = 0;
			this.anInt1638 = Static177.anInt3533 - 1;
			if (this.aClass5_Sub2_Sub22_1.anInt3662 == 0 && arg8 != null && arg8 instanceof Class1_Sub4) {
				@Pc(50) Class1_Sub4 local50 = (Class1_Sub4) arg8;
				if (this.aClass5_Sub2_Sub22_1 == local50.aClass5_Sub2_Sub22_1) {
					this.anInt1637 = local50.anInt1637;
					this.anInt1638 = local50.anInt1638;
					return;
				}
			}
			if (arg7 && this.aClass5_Sub2_Sub22_1.anInt3657 != -1) {
				this.anInt1637 = (int) (Math.random() * (double) this.aClass5_Sub2_Sub22_1.anIntArray374.length);
				this.anInt1638 -= (int) (Math.random() * (double) this.aClass5_Sub2_Sub22_1.anIntArray375[this.anInt1637]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		return this.anInt1639;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lclient!ia;")
	private Class1 method1232() {
		@Pc(12) boolean local12 = Static37.anIntArrayArrayArray5 != Static68.anIntArrayArrayArray6;
		@Pc(17) Class5_Sub2_Sub7 local17 = Static63.method1046(this.anInt1634);
		if (local17.anIntArray35 != null) {
			local17 = local17.method431();
		}
		if (local17 == null) {
			return null;
		}
		@Pc(39) int local39;
		@Pc(58) int local58;
		@Pc(97) int local97;
		@Pc(99) int local99;
		if (this.aClass5_Sub2_Sub22_1 != null) {
			local39 = Static177.anInt3533 - this.anInt1638;
			if (local39 > 100 && this.aClass5_Sub2_Sub22_1.anInt3657 > 0) {
				local58 = this.aClass5_Sub2_Sub22_1.anIntArray374.length - this.aClass5_Sub2_Sub22_1.anInt3657;
				while (local58 > this.anInt1637 && local39 > this.aClass5_Sub2_Sub22_1.anIntArray375[this.anInt1637]) {
					local39 -= this.aClass5_Sub2_Sub22_1.anIntArray375[this.anInt1637];
					this.anInt1637++;
				}
				if (local58 <= this.anInt1637) {
					local97 = 0;
					for (local99 = local58; local99 < this.aClass5_Sub2_Sub22_1.anIntArray374.length; local99++) {
						local97 += this.aClass5_Sub2_Sub22_1.anIntArray375[local99];
					}
					local39 %= local97;
				}
			}
			label90: {
				do {
					do {
						if (this.aClass5_Sub2_Sub22_1.anIntArray375[this.anInt1637] >= local39) {
							break label90;
						}
						local39 -= this.aClass5_Sub2_Sub22_1.anIntArray375[this.anInt1637];
						this.anInt1637++;
					} while (this.anInt1637 < this.aClass5_Sub2_Sub22_1.anIntArray374.length);
					this.anInt1637 -= this.aClass5_Sub2_Sub22_1.anInt3657;
				} while (this.anInt1637 >= 0 && this.aClass5_Sub2_Sub22_1.anIntArray374.length > this.anInt1637);
				this.aClass5_Sub2_Sub22_1 = null;
			}
			this.anInt1638 = Static177.anInt3533 - local39;
		}
		if (this.anInt1632 == 1 || this.anInt1632 == 3) {
			local58 = local17.anInt517;
			local39 = local17.anInt519;
		} else {
			local39 = local17.anInt517;
			local58 = local17.anInt519;
		}
		local97 = this.anInt1630 + (local39 >> 1);
		local99 = (local39 + 1 >> 1) + this.anInt1630;
		@Pc(236) int local236 = (local39 << 6) + (this.anInt1630 << 7);
		@Pc(243) int local243 = (local58 >> 1) + this.anInt1641;
		@Pc(252) int local252 = this.anInt1641 + (local58 + 1 >> 1);
		@Pc(261) int local261 = (local58 << 6) + (this.anInt1641 << 7);
		@Pc(266) int[][] local266 = Static37.anIntArrayArrayArray5[this.anInt1629];
		@Pc(268) int[][] local268 = null;
		if (local12) {
			local268 = Static68.anIntArrayArrayArray6[0];
		} else if (this.anInt1629 < 3) {
			local268 = Static37.anIntArrayArrayArray5[this.anInt1629 + 1];
		}
		@Pc(313) int local313 = local266[local99][local243] + local266[local97][local243] + local266[local97][local252] + local266[local99][local252] >> 2;
		@Pc(330) Class5_Sub2_Sub5 local330;
		if (this.aClass5_Sub2_Sub22_1 == null) {
			local330 = local17.method421(this.anInt1635, false, local268, local266, local261, local236, this.anInt1632, local313);
		} else {
			local330 = local17.method429(local266, local236, this.anInt1632, this.anInt1637, local268, local313, this.anInt1635, local261, this.aClass5_Sub2_Sub22_1);
		}
		return local330 == null ? null : local330.aClass1_1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class1 local7 = this.method1232();
		if (local7 != null) {
			local7.method2445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1639 = local7.method2449();
		}
	}
}
