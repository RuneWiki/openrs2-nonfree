import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class8_Sub1_Sub2_Sub2 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!pn", name = "Tc", descriptor = "Lclient!nf;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	public void method4353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray415[0];
		@Pc(15) int local15 = super.anIntArray416[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt4954 != -1 && Static225.method4042(super.anInt4954).anInt352 == 1) {
			super.anInt4954 = -1;
		}
		if (super.anInt4972 != -1) {
			@Pc(94) Class5 local94 = Static116.method2427(super.anInt4972);
			if (local94.aBoolean11 && local94.anInt101 != -1 && Static225.method4042(local94.anInt101).anInt352 == 1) {
				super.anInt4972 = -1;
			}
		}
		if (super.anInt4987 < 9) {
			super.anInt4987++;
		}
		for (@Pc(127) int local127 = super.anInt4987; local127 > 0; local127--) {
			super.anIntArray415[local127] = super.anIntArray415[local127 - 1];
			super.anIntArray416[local127] = super.anIntArray416[local127 - 1];
			super.aByteArray67[local127] = super.aByteArray67[local127 - 1];
		}
		super.anIntArray415[0] = local10;
		super.anIntArray416[0] = local15;
		super.aByteArray67[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)I")
	@Override
	public int method4339() {
		if (this.aClass141_1.anIntArray380 != null) {
			@Pc(20) Class141 local20 = this.aClass141_1.method3908();
			if (local20 != null && local20.anInt4393 != -1) {
				return local20.anInt4393;
			}
		}
		return this.aClass141_1.anInt4393;
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)I")
	@Override
	public int method4344() {
		if (this.aClass141_1.anIntArray380 != null) {
			@Pc(18) Class141 local18 = this.aClass141_1.method3908();
			if (local18 != null && local18.anInt4365 != -1) {
				return local18.anInt4365;
			}
		}
		return this.aClass141_1.anInt4365 == -1 ? super.method4344() : this.aClass141_1.anInt4365;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
	@Override
	protected int method4336() {
		if (this.aClass141_1.anIntArray380 != null) {
			@Pc(17) Class141 local17 = this.aClass141_1.method3908();
			if (local17 != null && local17.anInt4377 != -1) {
				return local17.anInt4377;
			}
		}
		return this.aClass141_1.anInt4377;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!nf;B)V")
	public void method4356(@OriginalArg(0) Class141 arg0) {
		this.aClass141_1 = arg0;
		if (super.aClass2_Sub4_5 != null) {
			super.aClass2_Sub4_5.method3928();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		if (this.aClass141_1 != null && (super.aBoolean375 || this.method4361(0, arg0))) {
			this.method4338(super.aClass38Array3, super.aBoolean375, arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "(I)Z")
	public boolean method4357() {
		return this.aClass141_1 != null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		if (this.aClass141_1 == null || !this.method4361(1024, arg0)) {
			return null;
		}
		@Pc(17) Class57 local17 = arg0.method2706();
		@Pc(22) int local22 = super.aClass106_7.method3018();
		local17.method4192(local22);
		local17.method4190(super.anInt6701, super.anInt6697, super.anInt6702);
		@Pc(37) Class40 local37 = this.method4347();
		@Pc(49) Class141 local49 = this.aClass141_1.anIntArray380 == null ? this.aClass141_1 : this.aClass141_1.method3908();
		if (Static241.aBoolean366 && local49.aBoolean336 && local37.aBoolean106) {
			@Pc(71) Class14 local71 = super.anInt4954 != -1 && super.anInt4935 == 0 ? Static225.method4042(super.anInt4954) : null;
			@Pc(88) Class14 local88 = super.anInt4937 == -1 || super.aBoolean371 && local71 != null ? null : Static225.method4042(super.anInt4937);
			@Pc(140) Class38 local140 = Static3.method119(arg0, this.aClass141_1.aByte56 & 0xFF, this.aClass141_1.anInt4382, local88 == null ? super.anInt4961 : super.anInt4921, super.aClass38Array3[0], this.aClass141_1.aByte55 & 0xFF, super.aBoolean374, this.aClass141_1.aShort66 & 0xFFFF, local22, local88 == null ? local71 : local88, super.anInt4946, this.aClass141_1.aShort65 & 0xFFFF, super.anInt4948, super.anInt4951);
			if (local140 != null) {
				@Pc(145) float local145 = arg0.method2702();
				@Pc(148) float local148 = arg0.method2734();
				arg0.method2758(false);
				arg0.method2701(local145, local148 - 150.0F);
				local140.method1925(local17, null, 0);
				arg0.method2701(local145, local148);
				arg0.method2758(true);
			}
		}
		@Pc(179) Class2_Sub2 local179 = null;
		if (this.method4359()) {
			local179 = Static248.method4393(super.aClass38Array3.length);
		}
		if (super.aClass2_Sub4_5 == null) {
			arg0.method2711(super.aClass38Array3, local17, local179 == null ? null : local179.aClass2_Sub5Array1, 0);
		} else {
			@Pc(210) Class176 local210 = super.aClass2_Sub4_5.method3927();
			arg0.method2714(super.aClass38Array3, local210, local17, local179 == null ? null : local179.aClass2_Sub5Array1, 0);
		}
		this.method4338(super.aClass38Array3, false, arg0);
		if (super.aClass38Array3[2] != null) {
			if (local22 != 0) {
				super.aClass38Array3[2].method1899(local22);
			}
			super.aClass38Array3[2].method1883(-super.anInt4991 + super.anInt6701, super.anInt6697 + -super.anInt4983, super.anInt6702 - super.anInt4984);
		}
		return local179;
	}

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "(I)Z")
	private boolean method4359() {
		return this.aClass141_1.aBoolean340;
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)I")
	@Override
	public int method5629() {
		return super.anInt4941;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!vq;)Z")
	private boolean method4361(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class40 local9 = this.method4347();
		@Pc(23) Class14 local23 = super.anInt4954 != -1 && super.anInt4935 == 0 ? Static225.method4042(super.anInt4954) : null;
		@Pc(39) Class14 local39 = super.anInt4937 == -1 || super.aBoolean371 && local23 != null ? null : Static225.method4042(super.anInt4937);
		@Pc(42) int local42 = local9.anInt1454;
		@Pc(45) int local45 = local9.anInt1460;
		if (local42 != 0 || local45 != 0 || local9.anInt1463 != 0 || local9.anInt1436 != 0) {
			arg0 |= 0x7;
		}
		@Pc(93) Class38 local93 = super.aClass38Array3[0] = this.aClass141_1.method3901(super.anInt4921, super.anInt4961, super.anInt4969, super.anInt4920, arg0, super.anInt4913, arg1, super.aClass202Array3, super.anInt4945, local23, local39);
		if (local93 == null) {
			return false;
		}
		super.anInt4941 = local93.method1921();
		this.method4341(local93);
		@Pc(110) int local110 = super.aClass106_7.method3018();
		super.anInt4946 = 0;
		super.anInt4948 = 0;
		super.anInt4951 = 0;
		if (local42 == 0 && local45 == 0) {
			this.method4334(local110, this.method4349() << 7, this.method4349() << 7);
		} else {
			this.method4334(local110, local45, local42);
			if (super.anInt4951 != 0) {
				super.aClass38Array3[0].method1913(super.anInt4951);
			}
			if (super.anInt4946 != 0) {
				super.aClass38Array3[0].method1897(super.anInt4946);
			}
			if (super.anInt4948 != 0) {
				super.aClass38Array3[0].method1883(0, super.anInt4948, 0);
			}
		}
		super.aClass38Array3[1] = null;
		if (super.anInt4972 != -1 && super.anInt4971 != -1) {
			@Pc(208) Class5 local208 = Static116.method2427(super.anInt4972);
			@Pc(227) Class38 local227 = local208.method121((local208.aBoolean12 ? 7 : 2) | local5, super.anInt4971, arg1, super.anInt4949, super.anInt4980);
			if (local227 != null) {
				local227.method1883(0, -super.anInt4943, 0);
				if (local208.aBoolean12 && (local42 != 0 || local45 != 0)) {
					if (super.anInt4951 != 0) {
						local227.method1913(super.anInt4951);
					}
					if (super.anInt4946 != 0) {
						local227.method1897(super.anInt4946);
					}
					if (super.anInt4948 != 0) {
						local227.method1883(0, super.anInt4948, 0);
					}
				}
				super.aClass38Array3[1] = local227;
			}
		}
		super.aClass38Array3[2] = null;
		if (super.anInterface7_3 != null) {
			if (Static199.anInt4137 >= super.anInt4986) {
				super.anInterface7_3 = null;
			}
			if (Static199.anInt4137 >= super.anInt4988 && Static199.anInt4137 < super.anInt4986) {
				@Pc(317) Class38 local317 = super.anInterface7_3.method5588(local5 | 0x7, arg1);
				if (local317 != null) {
					local317.method1883(super.anInt4991 - super.anInt6701, super.anInt4983 + -super.anInt6697, super.anInt4984 - super.anInt6702);
					if (local110 != 0) {
						local317.method1899(local110);
					}
					super.aClass38Array3[2] = local317;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass141_1 == null || !this.method4361(65536, arg0)) {
			return false;
		}
		@Pc(27) Class57 local27 = arg0.method2706();
		@Pc(32) int local32 = super.aClass106_7.method3018();
		local27.method4192(local32);
		local27.method4190(super.anInt6701, super.anInt6697, super.anInt6702);
		for (@Pc(45) int local45 = 0; super.aClass38Array3.length > local45; local45++) {
			if (super.aClass38Array3[local45] != null && super.aClass38Array3[local45].method1905(arg1, arg2, local27, this.aClass141_1.anInt4382 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}
}
