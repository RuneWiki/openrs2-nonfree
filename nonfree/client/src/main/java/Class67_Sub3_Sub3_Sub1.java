import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class67_Sub3_Sub3_Sub1 extends Class67_Sub3_Sub3 {

	@OriginalMember(owner = "client!km", name = "Fc", descriptor = "Lclient!gh;")
	public Class82 aClass82_1;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(B)Z")
	public boolean method2674() {
		return this.aClass82_1 != null;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		if (this.aClass82_1 != null && (super.aBoolean332 || this.method2680(arg0, 0))) {
			this.method4372(super.aBoolean332, arg0, super.aClass126Array3);
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		if (this.aClass82_1 == null || !this.method2680(arg0, 1024)) {
			return null;
		}
		@Pc(17) Class61 local17 = arg0.method4979();
		@Pc(22) int local22 = super.aClass17_7.method204();
		local17.method3667(local22);
		local17.method3665(super.anInt6308, super.anInt6313, super.anInt6310);
		@Pc(44) Class55 local44 = this.method4374();
		@Pc(56) Class82 local56 = this.aClass82_1.anIntArray134 == null ? this.aClass82_1 : this.aClass82_1.method1569();
		if (Static190.aBoolean248 && local56.aBoolean120 && local44.aBoolean69) {
			@Pc(79) Class111 local79 = super.anInt5013 != -1 && super.anInt5001 == 0 ? Static306.method5143(super.anInt5013) : null;
			@Pc(96) Class111 local96 = super.anInt5040 == -1 || super.aBoolean328 && local79 != null ? null : Static306.method5143(super.anInt5040);
			@Pc(148) Class126 local148 = Static258.method4485(super.anInt5052, super.aClass126Array3[0], this.aClass82_1.anInt1871, arg0, this.aClass82_1.aShort8 & 0xFFFF, this.aClass82_1.aByte10 & 0xFF, this.aClass82_1.aShort9 & 0xFFFF, super.aBoolean329, local96 == null ? super.anInt5060 : super.anInt5021, super.anInt5057, local96 == null ? local79 : local96, local22, this.aClass82_1.aByte11 & 0xFF, super.anInt5004);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.method4981();
				@Pc(156) float local156 = arg0.method4922();
				arg0.method4995(false);
				arg0.method4986(local153, local156 - 150.0F);
				local148.method3139(local17, null, 0);
				arg0.method4986(local153, local156);
				arg0.method4995(true);
			}
		}
		@Pc(179) Class10_Sub1 local179 = null;
		if (this.method2676()) {
			local179 = Static55.method830(super.aClass126Array3.length);
		}
		if (super.aClass10_Sub2_6 == null) {
			arg0.method4994(super.aClass126Array3, local17, local179 == null ? null : local179.aClass10_Sub8Array1, 0);
		} else {
			@Pc(196) Class136 local196 = super.aClass10_Sub2_6.method981();
			arg0.method5004(super.aClass126Array3, local196, local17, local179 == null ? null : local179.aClass10_Sub8Array1, 0);
		}
		this.method4372(false, arg0, super.aClass126Array3);
		if (super.aClass126Array3[2] != null) {
			if (local22 != 0) {
				super.aClass126Array3[2].method3125(local22);
			}
			super.aClass126Array3[2].method3128(super.anInt6308 - super.anInt5068, -super.anInt5073 + super.anInt6313, super.anInt6310 - super.anInt5064);
		}
		return local179;
	}

	@OriginalMember(owner = "client!km", name = "j", descriptor = "(I)Z")
	private boolean method2676() {
		return this.aClass82_1.aBoolean117;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!gh;)V")
	public void method2677(@OriginalArg(1) Class82 arg0) {
		this.aClass82_1 = arg0;
		if (super.aClass10_Sub2_6 != null) {
			super.aClass10_Sub2_6.method988();
		}
	}

	@OriginalMember(owner = "client!km", name = "h", descriptor = "(I)I")
	@Override
	public int method4380() {
		if (this.aClass82_1.anIntArray134 != null) {
			@Pc(19) Class82 local19 = this.aClass82_1.method1569();
			if (local19 != null && local19.anInt1876 != -1) {
				return local19.anInt1876;
			}
		}
		return this.aClass82_1.anInt1876 == -1 ? super.method4380() : this.aClass82_1.anInt1876;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!uo;II)Z")
	private boolean method2680(@OriginalArg(0) Class129 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class55 local9 = this.method4374();
		@Pc(26) Class111 local26 = super.anInt5013 != -1 && super.anInt5001 == 0 ? Static306.method5143(super.anInt5013) : null;
		@Pc(43) Class111 local43 = super.anInt5040 == -1 || super.aBoolean328 && local26 != null ? null : Static306.method5143(super.anInt5040);
		@Pc(46) int local46 = local9.anInt1183;
		@Pc(49) int local49 = local9.anInt1206;
		if (local46 != 0 || local49 != 0 || local9.anInt1209 != 0 || local9.anInt1175 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) Class126 local97 = super.aClass126Array3[0] = this.aClass82_1.method1572(super.anInt5018, super.aClass72Array3, arg1, local43, arg0, super.anInt5060, super.anInt5006, super.anInt5015, super.anInt5005, super.anInt5021, local26);
		if (local97 == null) {
			return false;
		}
		super.anInt5011 = local97.method3155();
		this.method4378(local97);
		@Pc(114) int local114 = super.aClass17_7.method204();
		super.anInt5052 = 0;
		super.anInt5057 = 0;
		super.anInt5004 = 0;
		if (local46 == 0 && local49 == 0) {
			this.method4366(local114, this.method4368() << 7, this.method4368() << 7);
		} else {
			this.method4366(local114, local49, local46);
			if (super.anInt5004 != 0) {
				super.aClass126Array3[0].method3145(super.anInt5004);
			}
			if (super.anInt5052 != 0) {
				super.aClass126Array3[0].method3156(super.anInt5052);
			}
			if (super.anInt5057 != 0) {
				super.aClass126Array3[0].method3128(0, super.anInt5057, 0);
			}
		}
		super.aClass126Array3[1] = null;
		if (super.anInt5043 != -1 && super.anInt5039 != -1) {
			@Pc(211) Class213 local211 = Static89.method1296(super.anInt5043);
			@Pc(230) Class126 local230 = local211.method5646(super.anInt5039, arg0, local5 | (local211.aBoolean423 ? 7 : 2), super.anInt5058, super.anInt5007);
			if (local230 != null) {
				local230.method3128(0, -super.anInt5033, 0);
				if (local211.aBoolean423 && (local46 != 0 || local49 != 0)) {
					if (super.anInt5004 != 0) {
						local230.method3145(super.anInt5004);
					}
					if (super.anInt5052 != 0) {
						local230.method3156(super.anInt5052);
					}
					if (super.anInt5057 != 0) {
						local230.method3128(0, super.anInt5057, 0);
					}
				}
				super.aClass126Array3[1] = local230;
			}
		}
		super.aClass126Array3[2] = null;
		if (super.anInterface7_3 != null) {
			if (super.anInt5067 <= Static293.anInt5807) {
				super.anInterface7_3 = null;
			}
			if (Static293.anInt5807 >= super.anInt5066 && Static293.anInt5807 < super.anInt5067) {
				@Pc(320) Class126 local320 = super.anInterface7_3.method5411(local5 | 0x7, arg0);
				if (local320 != null) {
					local320.method3128(super.anInt5068 - super.anInt6308, super.anInt5073 + -super.anInt6313, super.anInt5064 - super.anInt6310);
					if (local114 != 0) {
						local320.method3125(local114);
					}
					super.aClass126Array3[2] = local320;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(B)I")
	@Override
	public int method5408() {
		return super.anInt5011;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)I")
	@Override
	public int method4375() {
		if (this.aClass82_1.anIntArray134 != null) {
			@Pc(12) Class82 local12 = this.aClass82_1.method1569();
			if (local12 != null && local12.anInt1887 != -1) {
				return local12.anInt1887;
			}
		}
		return this.aClass82_1.anInt1887;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
	public void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray391[0];
		@Pc(19) int local19 = super.anIntArray392[0];
		if (arg1 == 0) {
			local19++;
		}
		if (arg1 == 1) {
			local19++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local19--;
			local10++;
		}
		if (arg1 == 4) {
			local19--;
		}
		if (arg1 == 5) {
			local10--;
			local19--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt5013 != -1 && Static306.method5143(super.anInt5013).anInt2711 == 1) {
			super.anInt5013 = -1;
		}
		if (arg1 == 7) {
			local19++;
			local10--;
		}
		if (super.anInt5043 != -1) {
			@Pc(89) Class213 local89 = Static89.method1296(super.anInt5043);
			if (local89.aBoolean424 && local89.anInt6649 != -1 && Static306.method5143(local89.anInt6649).anInt2711 == 1) {
				super.anInt5043 = -1;
			}
		}
		if (super.anInt5074 < 9) {
			super.anInt5074++;
		}
		for (@Pc(122) int local122 = super.anInt5074; local122 > 0; local122--) {
			super.anIntArray391[local122] = super.anIntArray391[local122 - 1];
			super.anIntArray392[local122] = super.anIntArray392[local122 - 1];
			super.aByteArray87[local122] = super.aByteArray87[local122 - 1];
		}
		super.anIntArray391[0] = local10;
		super.anIntArray392[0] = local19;
		super.aByteArray87[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	@Override
	protected int method4373() {
		if (this.aClass82_1.anIntArray134 != null) {
			@Pc(17) Class82 local17 = this.aClass82_1.method1569();
			if (local17 != null && local17.anInt1860 != -1) {
				return local17.anInt1860;
			}
		}
		return this.aClass82_1.anInt1860;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass82_1 == null || !this.method2680(arg1, 65536)) {
			return false;
		}
		@Pc(19) Class61 local19 = arg1.method4979();
		@Pc(24) int local24 = super.aClass17_7.method204();
		local19.method3667(local24);
		local19.method3665(super.anInt6308, super.anInt6313, super.anInt6310);
		for (@Pc(42) int local42 = 0; local42 < super.aClass126Array3.length; local42++) {
			if (super.aClass126Array3[local42] != null && super.aClass126Array3[local42].method3160(arg2, arg0, local19, this.aClass82_1.anInt1871 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
