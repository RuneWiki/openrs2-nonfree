import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub5_Sub1_Sub2 extends Class1_Sub5_Sub1 {

	@OriginalMember(owner = "client!wg", name = "fc", descriptor = "Lclient!kc;")
	public Class133 aClass133_1;

	@OriginalMember(owner = "client!wg", name = "hc", descriptor = "I")
	public int anInt6459 = -1;

	@OriginalMember(owner = "client!wg", name = "zc", descriptor = "I")
	public int anInt6475 = -1;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
	public void method5558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray1324[0];
		@Pc(15) int local15 = super.anIntArray1323[0];
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
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt6405 != -1 && Static36.aClass236_1.method5396(super.anInt6405).anInt4934 == 1) {
			super.anInt6405 = -1;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt6420 != -1) {
			@Pc(91) Class34 local91 = Static149.aClass173_5.method3800(super.anInt6420);
			if (local91.aBoolean65 && local91.anInt863 != -1 && Static36.aClass236_1.method5396(local91.anInt863).anInt4934 == 1) {
				super.anInt6420 = -1;
			}
		}
		if (super.anInt6456 < 9) {
			super.anInt6456++;
		}
		for (@Pc(124) int local124 = super.anInt6456; local124 > 0; local124--) {
			super.anIntArray1324[local124] = super.anIntArray1324[local124 - 1];
			super.anIntArray1323[local124] = super.anIntArray1323[local124 - 1];
			super.aByteArray115[local124] = super.aByteArray115[local124 - 1];
		}
		super.anIntArray1324[0] = local10;
		super.anIntArray1323[0] = local15;
		super.aByteArray115[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)I")
	@Override
	public int method5540() {
		return super.anInt6399;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIZ)V")
	public void method5559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte69 = (byte) arg3;
		if (super.anInt6405 != -1 && Static36.aClass236_1.method5396(super.anInt6405).anInt4934 == 1) {
			super.anInt6405 = -1;
		}
		if (super.anInt6420 != -1) {
			@Pc(33) Class34 local33 = Static149.aClass173_5.method3800(super.anInt6420);
			if (local33.aBoolean65 && local33.anInt863 != -1 && Static36.aClass236_1.method5396(local33.anInt863).anInt4934 == 1) {
				super.anInt6420 = -1;
			}
		}
		if (!arg4) {
			@Pc(64) int local64 = arg2 - super.anIntArray1324[0];
			@Pc(72) int local72 = arg1 - super.anIntArray1323[0];
			if (local64 >= -8 && local64 <= 8 && local72 >= -8 && local72 <= 8) {
				if (super.anInt6456 < 9) {
					super.anInt6456++;
				}
				for (@Pc(103) int local103 = super.anInt6456; local103 > 0; local103--) {
					super.anIntArray1324[local103] = super.anIntArray1324[local103 - 1];
					super.anIntArray1323[local103] = super.anIntArray1323[local103 - 1];
					super.aByteArray115[local103] = super.aByteArray115[local103 - 1];
				}
				super.anIntArray1324[0] = arg2;
				super.aByteArray115[0] = 1;
				super.anIntArray1323[0] = arg1;
				return;
			}
		}
		super.anInt6456 = 0;
		super.anIntArray1324[0] = arg2;
		super.anInt6454 = 0;
		super.anInt6455 = 0;
		super.anIntArray1323[0] = arg1;
		super.anInt6390 = super.anIntArray1324[0] * 128 + arg0 * 64;
		super.anInt6386 = arg0 * 64 + super.anIntArray1323[0] * 128;
		if (super.aClass10_Sub1_7 != null) {
			super.aClass10_Sub1_7.method232();
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		if (this.aClass133_1 != null && (super.aBoolean462 || this.method5565(0, arg0))) {
			this.method5545(arg0, super.aClass66Array3, super.aBoolean462);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		if (this.aClass133_1 == null || !this.method5565(1024, arg0)) {
			return null;
		}
		@Pc(19) Class44 local19 = arg0.method2024();
		@Pc(24) int local24 = super.aClass247_7.method5629();
		local19.method3536(local24);
		local19.method3527(super.anInt6390, super.anInt6387, super.anInt6386);
		@Pc(41) Class103 local41 = this.method5552();
		@Pc(54) Class133 local54 = this.aClass133_1.anIntArray653 == null ? this.aClass133_1 : this.aClass133_1.method3094(Static321.aClass211_1);
		if (Static178.aBoolean265 && local54.aBoolean258 && local41.aBoolean212) {
			@Pc(78) Class202 local78 = super.anInt6405 != -1 && super.anInt6429 == 0 ? Static36.aClass236_1.method5396(super.anInt6405) : null;
			@Pc(96) Class202 local96 = super.anInt6423 == -1 || super.aBoolean460 && local78 != null ? null : Static36.aClass236_1.method5396(super.anInt6423);
			@Pc(150) Class66 local150 = Static249.method5588(local96 == null ? super.anInt6443 : super.anInt6414, this.aClass133_1.anInt3332, super.anInt6409, super.anInt6426, local24, this.aClass133_1.aByte39 & 0xFF, super.aClass66Array3[0], this.aClass133_1.aByte37 & 0xFF, this.aClass133_1.aShort54 & 0xFFFF, super.anInt6445, local96 == null ? local78 : local96, arg0, this.aClass133_1.aShort53 & 0xFFFF, super.aBoolean461);
			if (local150 != null) {
				@Pc(155) float local155 = arg0.method2002();
				@Pc(158) float local158 = arg0.method2056();
				arg0.method2053(false);
				arg0.method2030(local155, local158 - 150.0F);
				local150.method5126(local19, null, 0);
				arg0.method2030(local155, local158);
				arg0.method2053(true);
			}
		}
		@Pc(181) Class10_Sub3 local181 = null;
		if (this.method5561()) {
			local181 = Static299.method4461(super.aClass66Array3.length);
		}
		if (super.aClass10_Sub1_7 == null) {
			arg0.method2007(super.aClass66Array3, local19, local181 == null ? null : local181.aClass10_Sub7Array1, 0);
		} else {
			@Pc(205) Class186 local205 = super.aClass10_Sub1_7.method229();
			arg0.method1969(super.aClass66Array3, local205, local19, local181 == null ? null : local181.aClass10_Sub7Array1, 0);
		}
		this.method5545(arg0, super.aClass66Array3, false);
		if (super.aClass66Array3[2] != null) {
			if (local24 != 0) {
				super.aClass66Array3[2].method5157(local24);
			}
			super.aClass66Array3[2].method5132(-super.aClass2_Sub42_3.anInt6007 + super.anInt6390, super.anInt6387 + -super.aClass2_Sub42_3.anInt6023, super.anInt6386 - super.aClass2_Sub42_3.anInt6021);
		}
		return local181;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)I")
	@Override
	protected int method5548() {
		if (this.aClass133_1.anIntArray653 != null) {
			@Pc(18) Class133 local18 = this.aClass133_1.method3094(Static321.aClass211_1);
			if (local18 != null && local18.anInt3338 != -1) {
				return local18.anInt3338;
			}
		}
		return this.aClass133_1.anInt3338;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)Z")
	private boolean method5561() {
		return this.aClass133_1.aBoolean262;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass133_1 == null || !this.method5565(65536, arg0)) {
			return false;
		}
		@Pc(19) Class44 local19 = arg0.method2024();
		@Pc(24) int local24 = super.aClass247_7.method5629();
		local19.method3536(local24);
		local19.method3527(super.anInt6390, super.anInt6387, super.anInt6386);
		for (@Pc(37) int local37 = 0; super.aClass66Array3.length > local37; local37++) {
			if (super.aClass66Array3[local37] != null && super.aClass66Array3[local37].method5131(arg1, arg2, local19, this.aClass133_1.anInt3332 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)I")
	@Override
	public int method5553() {
		if (this.aClass133_1.anIntArray653 != null) {
			@Pc(13) Class133 local13 = this.aClass133_1.method3094(Static321.aClass211_1);
			if (local13 != null && local13.anInt3335 != -1) {
				return local13.anInt3335;
			}
		}
		return this.aClass133_1.anInt3335 == -1 ? super.method5553() : this.aClass133_1.anInt3335;
	}

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "(I)Z")
	public boolean method5563() {
		return this.aClass133_1 != null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!vc;I)Z")
	private boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class103 local11 = this.method5552();
		@Pc(27) Class202 local27 = super.anInt6405 != -1 && super.anInt6429 == 0 ? Static36.aClass236_1.method5396(super.anInt6405) : null;
		@Pc(45) Class202 local45 = super.anInt6423 == -1 || super.aBoolean460 && local27 != null ? null : Static36.aClass236_1.method5396(super.anInt6423);
		@Pc(48) int local48 = local11.anInt2846;
		@Pc(51) int local51 = local11.anInt2810;
		if (local48 != 0 || local51 != 0 || local11.anInt2837 != 0 || local11.anInt2823 != 0) {
			arg0 |= 0x7;
		}
		@Pc(108) Class66 local108 = super.aClass66Array3[0] = this.aClass133_1.method3083(Static321.aClass211_1, arg0, Static46.aClass139_1, super.aClass12Array3, super.anInt6427, local45, arg1, super.anInt6425, super.anInt6450, super.anInt6436, Static36.aClass236_1, local27, super.anInt6443, super.anInt6414);
		if (local108 == null) {
			return false;
		}
		super.anInt6399 = local108.method5140();
		this.method5550(local108);
		@Pc(125) int local125 = super.aClass247_7.method5629();
		super.anInt6426 = 0;
		super.anInt6409 = 0;
		super.anInt6445 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method5541(this.method5547() << 7, this.method5547() << 7, local125);
		} else {
			this.method5541(local51, local48, local125);
			if (super.anInt6445 != 0) {
				super.aClass66Array3[0].method5153(super.anInt6445);
			}
			if (super.anInt6426 != 0) {
				super.aClass66Array3[0].method5145(super.anInt6426);
			}
			if (super.anInt6409 != 0) {
				super.aClass66Array3[0].method5132(0, super.anInt6409, 0);
			}
		}
		super.aClass66Array3[1] = null;
		if (super.anInt6420 != -1 && super.anInt6404 != -1) {
			@Pc(220) Class34 local220 = Static149.aClass173_5.method3800(super.anInt6420);
			@Pc(240) Class66 local240 = local220.method735(super.anInt6404, (local220.aBoolean64 ? 7 : 2) | local7, super.anInt6442, Static36.aClass236_1, arg1, super.anInt6400);
			if (local240 != null) {
				local240.method5132(0, -super.anInt6411, 0);
				if (local220.aBoolean64 && (local48 != 0 || local51 != 0)) {
					if (super.anInt6445 != 0) {
						local240.method5153(super.anInt6445);
					}
					if (super.anInt6426 != 0) {
						local240.method5145(super.anInt6426);
					}
					if (super.anInt6409 != 0) {
						local240.method5132(0, super.anInt6409, 0);
					}
				}
				super.aClass66Array3[1] = local240;
			}
		}
		super.aClass66Array3[2] = null;
		if (super.aClass2_Sub42_3 != null) {
			if (Static253.anInt4469 >= super.aClass2_Sub42_3.anInt6016) {
				super.aClass2_Sub42_3 = null;
			} else if (Static253.anInt4469 >= super.aClass2_Sub42_3.anInt6014) {
				@Pc(323) Class66 local323 = super.aClass2_Sub42_3.method5243(arg1, local7 | 0x7);
				if (local323 != null) {
					local323.method5132(super.aClass2_Sub42_3.anInt6007 - super.anInt6390, -super.anInt6387 + super.aClass2_Sub42_3.anInt6023, -super.anInt6386 + super.aClass2_Sub42_3.anInt6021);
					if (local125 != 0) {
						local323.method5157(local125);
					}
					super.aClass66Array3[2] = local323;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!kc;)V")
	public void method5566(@OriginalArg(1) Class133 arg0) {
		this.aClass133_1 = arg0;
		if (super.aClass10_Sub1_7 != null) {
			super.aClass10_Sub1_7.method232();
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
	@Override
	public int method5551() {
		if (this.aClass133_1.anIntArray653 != null) {
			@Pc(15) Class133 local15 = this.aClass133_1.method3094(Static321.aClass211_1);
			if (local15 != null && local15.anInt3360 != -1) {
				return local15.anInt3360;
			}
		}
		return this.aClass133_1.anInt3360;
	}
}
