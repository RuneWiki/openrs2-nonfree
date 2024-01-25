import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class10_Sub1_Sub2_Sub1 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!cd", name = "Rc", descriptor = "Lclient!en;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!en;)V")
	public void method677(@OriginalArg(1) Class60 arg0) {
		this.aClass60_1 = arg0;
		if (super.aClass7_Sub7_6 != null) {
			super.aClass7_Sub7_6.method2819();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I")
	@Override
	public int method3400() {
		if (this.aClass60_1.anIntArray109 != null) {
			@Pc(12) Class60 local12 = this.aClass60_1.method1274();
			if (local12 != null && local12.anInt1509 != -1) {
				return local12.anInt1509;
			}
		}
		return this.aClass60_1.anInt1509 == -1 ? super.method3400() : this.aClass60_1.anInt1509;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Z")
	private boolean method679() {
		return this.aClass60_1.aBoolean103;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z")
	public boolean method680() {
		return this.aClass60_1 != null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		if (this.aClass60_1 == null || !this.method682(arg2, 65536)) {
			return false;
		}
		@Pc(19) Class31 local19 = arg2.method4304();
		@Pc(24) int local24 = super.aClass212_7.method5609();
		local19.method3179(local24);
		local19.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
		for (@Pc(42) int local42 = 0; local42 < super.aClass40Array3.length; local42++) {
			if (super.aClass40Array3[local42] != null) {
				return super.aClass40Array3[local42].method4614(arg0, arg1, local19, this.aClass60_1.anInt1504 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		if (this.aClass60_1 == null || !this.method682(arg0, 1024)) {
			return null;
		}
		@Pc(22) Class31 local22 = arg0.method4304();
		@Pc(27) int local27 = super.aClass212_7.method5609();
		local22.method3179(local27);
		local22.method3184(super.anInt6728, super.anInt6722, super.anInt6726);
		@Pc(42) Class118 local42 = this.method3408();
		@Pc(54) Class60 local54 = this.aClass60_1.anIntArray109 == null ? this.aClass60_1 : this.aClass60_1.method1274();
		if (Static221.aBoolean375 && local54.aBoolean107 && local42.aBoolean229) {
			@Pc(77) Class177 local77 = super.anInt4026 != -1 && super.anInt4062 == 0 ? Static354.method5863(super.anInt4026) : null;
			@Pc(94) Class177 local94 = super.anInt4034 == -1 || super.aBoolean307 && local77 != null ? null : Static354.method5863(super.anInt4034);
			@Pc(148) Class40 local148 = Static188.method3337(local27, super.aClass40Array3[0], super.anInt4033, this.aClass60_1.aShort28 & 0xFFFF, super.aBoolean306, super.anInt4064, local94 == null ? local77 : local94, this.aClass60_1.aByte17 & 0xFF, local94 == null ? super.lb : super.anInt4074, this.aClass60_1.anInt1504, this.aClass60_1.aByte14 & 0xFF, super.anInt4072, arg0, this.aClass60_1.aShort27 & 0xFFFF);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.method4294();
				@Pc(156) float local156 = arg0.method4222();
				arg0.method4269(false);
				arg0.method4207(local153, local156 - 150.0F);
				local148.method4587(local22, null, 0);
				arg0.method4207(local153, local156);
				arg0.method4269(true);
			}
		}
		@Pc(179) Class7_Sub3 local179 = null;
		if (this.method679()) {
			local179 = Static44.method908(super.aClass40Array3.length);
		}
		if (super.aClass7_Sub7_6 == null) {
			arg0.method4289(super.aClass40Array3, local22, local179 == null ? null : local179.aClass7_Sub6Array1, 0);
		} else {
			@Pc(210) Class153 local210 = super.aClass7_Sub7_6.method2817();
			arg0.method4220(super.aClass40Array3, local210, local22, local179 == null ? null : local179.aClass7_Sub6Array1, 0);
		}
		this.method3416(super.aClass40Array3, arg0, false);
		if (super.aClass40Array3[2] != null) {
			if (local27 != 0) {
				super.aClass40Array3[2].method4620(local27);
			}
			super.aClass40Array3[2].method4612(-super.anInt4080 + super.anInt6728, -super.anInt4086 + super.anInt6722, -super.anInt4083 + super.anInt6726);
		}
		return local179;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	@Override
	protected int method3398() {
		if (this.aClass60_1.anIntArray109 != null) {
			@Pc(21) Class60 local21 = this.aClass60_1.method1274();
			if (local21 != null && local21.anInt1536 != -1) {
				return local21.anInt1536;
			}
		}
		return this.aClass60_1.anInt1536;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ii;II)Z")
	private boolean method682(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(16) Class118 local16 = this.method3408();
		@Pc(34) Class177 local34 = super.anInt4026 != -1 && super.anInt4062 == 0 ? Static354.method5863(super.anInt4026) : null;
		@Pc(51) Class177 local51 = super.anInt4034 == -1 || super.aBoolean307 && local34 != null ? null : Static354.method5863(super.anInt4034);
		@Pc(54) int local54 = local16.anInt2986;
		@Pc(57) int local57 = local16.anInt2958;
		if (local54 != 0 || local57 != 0 || local16.anInt2959 != 0 || local16.anInt2975 != 0) {
			arg1 |= 0x7;
		}
		@Pc(99) Class40 local99 = super.aClass40Array3[0] = this.aClass60_1.method1271(local51, super.anInt4030, arg0, super.lb, super.anInt4020, super.aClass138Array3, super.anInt4027, super.anInt4074, arg1, super.anInt4039, local34);
		if (local99 == null) {
			return false;
		}
		super.anInt4059 = local99.method4572();
		this.method3397(local99);
		@Pc(118) int local118 = super.aClass212_7.method5609();
		super.anInt4072 = 0;
		super.anInt4064 = 0;
		super.anInt4033 = 0;
		if (local54 == 0 && local57 == 0) {
			this.method3403(local118, this.method3402() << 7, this.method3402() << 7);
		} else {
			this.method3403(local118, local57, local54);
			if (super.anInt4064 != 0) {
				super.aClass40Array3[0].method4591(super.anInt4064);
			}
			if (super.anInt4033 != 0) {
				super.aClass40Array3[0].method4583(super.anInt4033);
			}
			if (super.anInt4072 != 0) {
				super.aClass40Array3[0].method4612(0, super.anInt4072, 0);
			}
		}
		super.aClass40Array3[1] = null;
		if (super.anInt4058 != -1 && super.anInt4038 != -1) {
			@Pc(211) Class162 local211 = Static264.method4763(super.anInt4058);
			@Pc(230) Class40 local230 = local211.method4328(local5 | (local211.aBoolean395 ? 7 : 2), arg0, super.anInt4018, super.anInt4013, super.anInt4038);
			if (local230 != null) {
				local230.method4612(0, -super.anInt4070, 0);
				if (local211.aBoolean395 && (local54 != 0 || local57 != 0)) {
					if (super.anInt4064 != 0) {
						local230.method4591(super.anInt4064);
					}
					if (super.anInt4033 != 0) {
						local230.method4583(super.anInt4033);
					}
					if (super.anInt4072 != 0) {
						local230.method4612(0, super.anInt4072, 0);
					}
				}
				super.aClass40Array3[1] = local230;
			}
		}
		super.aClass40Array3[2] = null;
		if (super.anInterface4_3 != null) {
			if (super.anInt4079 <= Static282.anInt3516) {
				super.anInterface4_3 = null;
			}
			if (Static282.anInt3516 >= super.anInt4077 && super.anInt4079 > Static282.anInt3516) {
				@Pc(319) Class40 local319 = super.anInterface4_3.method5448(local5 | 0x7, arg0);
				if (local319 != null) {
					local319.method4612(-super.anInt6728 + super.anInt4080, super.anInt4086 - super.anInt6722, -super.anInt6726 + super.anInt4083);
					if (local118 != 0) {
						local319.method4620(local118);
					}
					super.aClass40Array3[2] = local319;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)I")
	@Override
	public int method3406() {
		if (this.aClass60_1.anIntArray109 != null) {
			@Pc(18) Class60 local18 = this.aClass60_1.method1274();
			if (local18 != null && local18.anInt1529 != -1) {
				return local18.anInt1529;
			}
		}
		return this.aClass60_1.anInt1529;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)I")
	@Override
	public int method5829() {
		return super.anInt4059;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
		if (this.aClass60_1 != null && (super.aBoolean310 || this.method682(arg0, 0))) {
			this.method3416(super.aClass40Array3, arg0, super.aBoolean310);
		}
	}
}
