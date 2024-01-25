import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!qo", name = "wc", descriptor = "Lclient!qs;")
	public Class197 aClass197_1;

	@OriginalMember(owner = "client!qo", name = "Ec", descriptor = "I")
	public int anInt5442 = -1;

	@OriginalMember(owner = "client!qo", name = "Dc", descriptor = "I")
	public int anInt5441 = -1;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I")
	@Override
	protected int method4786() {
		if (this.aClass197_1.anIntArray468 != null) {
			@Pc(13) Class197 local13 = this.aClass197_1.method4832(Static179.aClass115_1);
			if (local13 != null && local13.anInt5498 != -1) {
				return local13.anInt5498;
			}
		}
		return this.aClass197_1.anInt5498;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)Z")
	private boolean method4802() {
		return this.aClass197_1.aBoolean407;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
	public void method4803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = super.anIntArray466[0];
		@Pc(13) int local13 = super.anIntArray465[0];
		if (arg0 == 0) {
			local13++;
		}
		if (arg0 == 1) {
			local13++;
			local8++;
		}
		if (arg0 == 2) {
			local8++;
		}
		if (arg0 == 3) {
			local8++;
			local13--;
		}
		if (arg0 == 4) {
			local13--;
		}
		if (arg0 == 5) {
			local8--;
			local13--;
		}
		if (arg0 == 6) {
			local8--;
		}
		if (super.anInt5366 != -1 && Static333.aClass50_2.method1175(super.anInt5366).anInt2988 == 1) {
			super.anInt5366 = -1;
		}
		if (arg0 == 7) {
			local8--;
			local13++;
		}
		if (super.anInt5396 != -1) {
			@Pc(86) Class182 local86 = Static153.aClass116_1.method2791(super.anInt5396);
			if (local86.aBoolean374 && local86.anInt5101 != -1 && Static333.aClass50_2.method1175(local86.anInt5101).anInt2988 == 1) {
				super.anInt5396 = -1;
			}
		}
		if (super.anInt5432 < 9) {
			super.anInt5432++;
		}
		for (@Pc(120) int local120 = super.anInt5432; local120 > 0; local120--) {
			super.anIntArray466[local120] = super.anIntArray466[local120 - 1];
			super.anIntArray465[local120] = super.anIntArray465[local120 - 1];
			super.aByteArray78[local120] = super.aByteArray78[local120 - 1];
		}
		super.anIntArray466[0] = local8;
		super.anIntArray465[0] = local13;
		super.aByteArray78[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass197_1 == null || !this.method4808(65536, arg1)) {
			return false;
		}
		@Pc(19) Class21 local19 = arg1.method2445();
		@Pc(24) int local24 = super.aClass217_7.method5455();
		local19.method3708(local24);
		local19.method3701(super.anInt6800, super.anInt6797, super.anInt6798);
		for (@Pc(45) int local45 = 0; super.aClass159Array3.length > local45; local45++) {
			if (super.aClass159Array3[local45] != null && super.aClass159Array3[local45].method4931(arg0, arg2, local19, this.aClass197_1.anInt5486 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIBIII)V")
	public void method4806(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte73 = (byte) arg2;
		if (super.anInt5366 != -1 && Static333.aClass50_2.method1175(super.anInt5366).anInt2988 == 1) {
			super.anInt5366 = -1;
		}
		if (super.anInt5396 != -1) {
			@Pc(37) Class182 local37 = Static153.aClass116_1.method2791(super.anInt5396);
			if (local37.aBoolean374 && local37.anInt5101 != -1 && Static333.aClass50_2.method1175(local37.anInt5101).anInt2988 == 1) {
				super.anInt5396 = -1;
			}
		}
		if (!arg0) {
			@Pc(67) int local67 = arg1 - super.anIntArray466[0];
			@Pc(75) int local75 = arg4 - super.anIntArray465[0];
			if (local67 >= -8 && local67 <= 8 && local75 >= -8 && local75 <= 8) {
				if (super.anInt5432 < 9) {
					super.anInt5432++;
				}
				for (@Pc(104) int local104 = super.anInt5432; local104 > 0; local104--) {
					super.anIntArray466[local104] = super.anIntArray466[local104 - 1];
					super.anIntArray465[local104] = super.anIntArray465[local104 - 1];
					super.aByteArray78[local104] = super.aByteArray78[local104 - 1];
				}
				super.anIntArray466[0] = arg1;
				super.aByteArray78[0] = 1;
				super.anIntArray465[0] = arg4;
				return;
			}
		}
		super.anIntArray466[0] = arg1;
		super.anInt5429 = 0;
		super.anInt5432 = 0;
		super.anInt5431 = 0;
		super.anIntArray465[0] = arg4;
		super.anInt6798 = arg3 * 64 + super.anIntArray465[0] * 128;
		super.anInt6800 = arg3 * 64 + super.anIntArray466[0] * 128;
		if (super.aClass7_Sub3_4 != null) {
			super.aClass7_Sub3_4.method523();
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		if (this.aClass197_1 != null && (super.aBoolean398 || this.method4808(0, arg0))) {
			this.method4787(super.aBoolean398, arg0, super.aClass159Array3);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		if (this.aClass197_1 == null || !this.method4808(1024, arg0)) {
			return null;
		}
		@Pc(17) Class21 local17 = arg0.method2445();
		@Pc(22) int local22 = super.aClass217_7.method5455();
		local17.method3708(local22);
		local17.method3701(super.anInt6800, super.anInt6797, super.anInt6798);
		@Pc(37) Class227 local37 = this.method4799();
		@Pc(50) Class197 local50 = this.aClass197_1.anIntArray468 == null ? this.aClass197_1 : this.aClass197_1.method4832(Static179.aClass115_1);
		if (Static183.aBoolean279 && local50.aBoolean408 && local37.aBoolean464) {
			@Pc(74) Class102 local74 = super.anInt5366 != -1 && super.anInt5405 == 0 ? Static333.aClass50_2.method1175(super.anInt5366) : null;
			@Pc(92) Class102 local92 = super.anInt5421 == -1 || super.aBoolean394 && local74 != null ? null : Static333.aClass50_2.method1175(super.anInt5421);
			@Pc(144) Class159 local144 = Static273.method4590(super.aClass159Array3[0], super.anInt5365, super.anInt5420, arg0, this.aClass197_1.aByte56 & 0xFF, local92 == null ? local74 : local92, this.aClass197_1.aByte53 & 0xFF, this.aClass197_1.aShort75 & 0xFFFF, super.anInt5373, this.aClass197_1.anInt5486, local22, super.aBoolean393, this.aClass197_1.aShort74 & 0xFFFF, local92 == null ? super.anInt5407 : super.anInt5375);
			if (local144 != null) {
				@Pc(149) float local149 = arg0.method2462();
				@Pc(152) float local152 = arg0.method2517();
				arg0.method2487(false);
				arg0.method2460(local149, local152 - 150.0F);
				local144.method4952(local17, null, 0);
				arg0.method2460(local149, local152);
				arg0.method2487(true);
			}
		}
		@Pc(175) Class7_Sub5 local175 = null;
		if (this.method4802()) {
			local175 = Static234.method4211(super.aClass159Array3.length);
		}
		if (super.aClass7_Sub3_4 == null) {
			arg0.method2477(super.aClass159Array3, local17, local175 == null ? null : local175.aClass7_Sub6Array1, 0);
		} else {
			@Pc(206) Class34 local206 = super.aClass7_Sub3_4.method519();
			arg0.method2541(super.aClass159Array3, local206, local17, local175 == null ? null : local175.aClass7_Sub6Array1, 0);
		}
		this.method4787(false, arg0, super.aClass159Array3);
		if (super.aClass159Array3[2] != null) {
			if (local22 != 0) {
				super.aClass159Array3[2].method4969(local22);
			}
			super.aClass159Array3[2].method4945(super.anInt6800 - super.aClass2_Sub25_3.anInt3747, super.anInt6797 - super.aClass2_Sub25_3.anInt3728, super.anInt6798 - super.aClass2_Sub25_3.anInt3740);
		}
		return local175;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!qs;)V")
	public void method4807(@OriginalArg(1) Class197 arg0) {
		this.aClass197_1 = arg0;
		if (super.aClass7_Sub3_4 != null) {
			super.aClass7_Sub3_4.method523();
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)I")
	@Override
	public int method4789() {
		if (this.aClass197_1.anIntArray468 != null) {
			@Pc(21) Class197 local21 = this.aClass197_1.method4832(Static179.aClass115_1);
			if (local21 != null && local21.anInt5492 != -1) {
				return local21.anInt5492;
			}
		}
		return this.aClass197_1.anInt5492;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!oj;)Z")
	private boolean method4808(@OriginalArg(0) int arg0, @OriginalArg(2) Class48 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(19) Class227 local19 = this.method4799();
		@Pc(35) Class102 local35 = super.anInt5366 != -1 && super.anInt5405 == 0 ? Static333.aClass50_2.method1175(super.anInt5366) : null;
		@Pc(53) Class102 local53 = super.anInt5421 == -1 || super.aBoolean394 && local35 != null ? null : Static333.aClass50_2.method1175(super.anInt5421);
		@Pc(56) int local56 = local19.anInt6427;
		@Pc(59) int local59 = local19.anInt6454;
		if (local56 != 0 || local59 != 0 || local19.anInt6448 != 0 || local19.anInt6458 != 0) {
			arg0 |= 0x7;
		}
		@Pc(113) Class159 local113 = super.aClass159Array3[0] = this.aClass197_1.method4836(Static333.aClass50_2, super.anInt5407, Static179.aClass115_1, super.anInt5413, super.anInt5377, arg1, arg0, super.aClass51Array3, local35, super.anInt5425, local53, super.anInt5367, super.anInt5375, Static59.aClass194_1);
		if (local113 == null) {
			return false;
		}
		super.anInt5389 = local113.method4941();
		this.method4798(local113);
		@Pc(130) int local130 = super.aClass217_7.method5455();
		super.anInt5373 = 0;
		super.anInt5365 = 0;
		super.anInt5420 = 0;
		if (local56 == 0 && local59 == 0) {
			this.method4791(this.method4792() << 7, this.method4792() << 7, local130);
		} else {
			this.method4791(local56, local59, local130);
			if (super.anInt5420 != 0) {
				super.aClass159Array3[0].method4954(super.anInt5420);
			}
			if (super.anInt5365 != 0) {
				super.aClass159Array3[0].method4968(super.anInt5365);
			}
			if (super.anInt5373 != 0) {
				super.aClass159Array3[0].method4945(0, super.anInt5373, 0);
			}
		}
		super.aClass159Array3[1] = null;
		if (super.anInt5396 != -1 && super.anInt5404 != -1) {
			@Pc(225) Class182 local225 = Static153.aClass116_1.method2791(super.anInt5396);
			@Pc(245) Class159 local245 = local225.method4568(super.anInt5391, super.anInt5404, Static333.aClass50_2, super.anInt5364, (local225.aBoolean373 ? 7 : 2) | local7, arg1);
			if (local245 != null) {
				local245.method4945(0, -super.anInt5423, 0);
				if (local225.aBoolean373 && (local56 != 0 || local59 != 0)) {
					if (super.anInt5420 != 0) {
						local245.method4954(super.anInt5420);
					}
					if (super.anInt5365 != 0) {
						local245.method4968(super.anInt5365);
					}
					if (super.anInt5373 != 0) {
						local245.method4945(0, super.anInt5373, 0);
					}
				}
				super.aClass159Array3[1] = local245;
			}
		}
		super.aClass159Array3[2] = null;
		if (super.aClass2_Sub25_3 != null) {
			if (super.aClass2_Sub25_3.anInt3746 <= Static339.anInt6265) {
				super.aClass2_Sub25_3 = null;
			} else if (super.aClass2_Sub25_3.anInt3734 <= Static339.anInt6265) {
				@Pc(327) Class159 local327 = super.aClass2_Sub25_3.method3280(arg1, local7 | 0x7);
				if (local327 != null) {
					local327.method4945(super.aClass2_Sub25_3.anInt3747 - super.anInt6800, super.aClass2_Sub25_3.anInt3728 - super.anInt6797, -super.anInt6798 + super.aClass2_Sub25_3.anInt3740);
					if (local130 != 0) {
						local327.method4969(local130);
					}
					super.aClass159Array3[2] = local327;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)I")
	@Override
	public int method5894() {
		return super.anInt5389;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(Z)I")
	@Override
	public int method4795() {
		if (this.aClass197_1.anIntArray468 != null) {
			@Pc(20) Class197 local20 = this.aClass197_1.method4832(Static179.aClass115_1);
			if (local20 != null && local20.anInt5476 != -1) {
				return local20.anInt5476;
			}
		}
		return this.aClass197_1.anInt5476 == -1 ? super.method4795() : this.aClass197_1.anInt5476;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(B)Z")
	public boolean method4809() {
		return this.aClass197_1 != null;
	}
}
