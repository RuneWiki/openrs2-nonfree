import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class2_Sub1_Sub5_Sub1 extends Class2_Sub1_Sub5 {

	@OriginalMember(owner = "client!qv", name = "hb", descriptor = "I")
	public int anInt8392;

	@OriginalMember(owner = "client!qv", name = "ib", descriptor = "I")
	public int anInt8393;

	@OriginalMember(owner = "client!qv", name = "jb", descriptor = "I")
	public int anInt8394;

	@OriginalMember(owner = "client!qv", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!qv", name = "fb", descriptor = "I")
	public int anInt8390 = -1;

	@OriginalMember(owner = "client!qv", name = "cb", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!qv", name = "ob", descriptor = "I")
	public int anInt8397 = -1;

	@OriginalMember(owner = "client!qv", name = "mb", descriptor = "I")
	private int anInt8395 = 0;

	@OriginalMember(owner = "client!qv", name = "Y", descriptor = "I")
	public int anInt8384 = 0;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIII)V")
	public Class2_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.anInt8395;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class207 local6 = arg1.method7456();
		local6.method8212(super.anInt10006, super.anInt10004 - 10, super.anInt10001);
		@Pc(29) Class216 local29 = Static340.aClass121_1.method2647(this.anInt8394);
		@Pc(42) Class184 local42 = local29.method5156(0, this.lb, 0, arg1, 131072, -1, (Class119) null, (Class271) null);
		if (local42 != null && (Static487.aBoolean565 ? local42.method8653(arg0, arg2, local6, true, local29.anInt6101, Static472.anInt8136) : local42.method8656(arg0, arg2, local6, true, local29.anInt6101))) {
			return true;
		}
		@Pc(78) Class216 local78;
		if (this.anInt8397 != -1) {
			local78 = Static340.aClass121_1.method2647(this.anInt8397);
			local42 = local78.method5156(0, this.anInt8392, 0, arg1, 131072, -1, (Class119) null, (Class271) null);
			if (local42 != null && (Static487.aBoolean565 ? local42.method8653(arg0, arg2, local6, true, local78.anInt6101, Static472.anInt8136) : local42.method8656(arg0, arg2, local6, true, local78.anInt6101))) {
				return true;
			}
		}
		if (this.anInt8390 != -1) {
			local78 = Static340.aClass121_1.method2647(this.anInt8390);
			local42 = local78.method5156(0, this.anInt8393, 0, arg1, 131072, -1, (Class119) null, (Class271) null);
			if (local42 != null && (Static487.aBoolean565 ? local42.method8653(arg0, arg2, local6, true, local78.anInt6101, Static472.anInt8136) : local42.method8656(arg0, arg2, local6, true, local78.anInt6101))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(B)I")
	@Override
	public int method8443() {
		@Pc(15) Class216 local15 = Static340.aClass121_1.method2647(this.anInt8394);
		@Pc(18) int local18 = local15.anInt6101;
		@Pc(28) Class216 local28;
		if (this.anInt8397 != -1) {
			local28 = Static340.aClass121_1.method2647(this.anInt8397);
			if (local18 < local28.anInt6101) {
				local18 = local28.anInt6101;
			}
		}
		if (this.anInt8390 != -1) {
			local28 = Static340.aClass121_1.method2647(this.anInt8390);
			if (local18 < local28.anInt6101) {
				local18 = local28.anInt6101;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(17) Class67 local17 = Static349.method5053(super.aByte140, super.anInt10006 >> Static185.anInt3178, super.anInt10001 >> Static185.anInt3178);
		@Pc(29) Class2_Sub1_Sub3 local29 = Static82.method1398(super.aByte140, super.anInt10006 >> Static185.anInt3178, super.anInt10001 >> Static185.anInt3178);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass2_Sub1_Sub1_1.aBoolean703) {
			local31 = local17.aClass2_Sub1_Sub1_1.method8444();
		}
		if (local29 != null && local29.aShort61 > -local31) {
			local31 = -local29.aShort61;
		}
		if (this.anInt8384 != local31) {
			super.anInt10004 -= this.anInt8384;
			this.anInt8384 = local31;
			super.anInt10004 += local31;
		}
		@Pc(80) Class207 local80 = arg0.method7456();
		local80.method8204();
		if (this.anInt8384 == 0) {
			@Pc(96) Class12 local96 = Static289.aClass12Array3[super.aByte141];
			@Pc(101) int local101 = this.anInt8395 << 1;
			@Pc(108) int local108 = -local101 / 2;
			@Pc(113) int local113 = -local101 / 2;
			@Pc(125) int local125 = local96.method7854(super.anInt10001 + local113, local108 + super.anInt10006);
			@Pc(129) int local129 = local101 / 2;
			@Pc(134) int local134 = -local101 / 2;
			@Pc(146) int local146 = local96.method7854(local134 + super.anInt10001, local129 + super.anInt10006);
			@Pc(151) int local151 = -local101 / 2;
			@Pc(155) int local155 = local101 / 2;
			@Pc(167) int local167 = local96.method7854(super.anInt10001 + local155, super.anInt10006 + local151);
			@Pc(171) int local171 = local101 / 2;
			@Pc(175) int local175 = local101 / 2;
			@Pc(189) int local189 = local96.method7854(super.anInt10001 + local175, super.anInt10006 - -local171);
			@Pc(196) int local196 = local125 < local146 ? local125 : local146;
			@Pc(207) int local207 = local189 > local167 ? local167 : local189;
			@Pc(218) int local218 = local189 > local146 ? local146 : local189;
			@Pc(225) int local225 = local125 < local167 ? local125 : local167;
			if (local101 != 0) {
				@Pc(244) int local244 = (int) (Math.atan2((double) (local196 - local207), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local244 != 0) {
					local80.method8214(local244);
				}
			}
			@Pc(254) int local254 = local125 + local189;
			if (local101 != 0) {
				@Pc(270) int local270 = (int) (Math.atan2((double) (local225 - local218), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local270 != 0) {
					local80.method8207(-local270);
				}
			}
			if (local254 > local167 + local146) {
				local254 = local146 + local167;
			}
			local254 = (local254 >> 1) - super.anInt10004;
			if (local254 != 0) {
				local80.method8209(0, local254, 0);
			}
		}
		local80.method8209(super.anInt10006, super.anInt10004 - 10, super.anInt10001);
		@Pc(322) Class2_Sub9 local322 = Static49.method971(3, true);
		this.anInt8395 = 0;
		this.aBoolean580 = false;
		@Pc(350) Class184 local350;
		if (this.anInt8390 != -1) {
			local350 = Static340.aClass121_1.method2647(this.anInt8390).method5156(0, this.anInt8393, 0, arg0, 2048, -1, (Class119) null, (Class271) null);
			if (local350 != null) {
				if (Static487.aBoolean565) {
					local350.method8658(local80, local322.aClass2_Sub5Array1[2], Static472.anInt8136, 0);
				} else {
					local350.method8662(local80, local322.aClass2_Sub5Array1[2], 0);
				}
				this.aBoolean580 |= local350.F();
				this.anInt8395 = local350.ma();
			}
		}
		if (this.anInt8397 != -1) {
			local350 = Static340.aClass121_1.method2647(this.anInt8397).method5156(0, this.anInt8392, 0, arg0, 2048, -1, (Class119) null, (Class271) null);
			if (local350 != null) {
				if (Static487.aBoolean565) {
					local350.method8658(local80, local322.aClass2_Sub5Array1[1], Static472.anInt8136, 0);
				} else {
					local350.method8662(local80, local322.aClass2_Sub5Array1[1], 0);
				}
				this.aBoolean580 |= local350.F();
				if (local350.ma() > this.anInt8395) {
					this.anInt8395 = local350.ma();
				}
			}
		}
		local350 = Static340.aClass121_1.method2647(this.anInt8394).method5156(0, this.lb, 0, arg0, 2048, -1, (Class119) null, (Class271) null);
		if (local350 != null) {
			if (Static487.aBoolean565) {
				local350.method8658(local80, local322.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
			} else {
				local350.method8662(local80, local322.aClass2_Sub5Array1[0], 0);
			}
			this.aBoolean580 |= local350.F();
			if (local350.ma() > this.anInt8395) {
				this.anInt8395 = local350.ma();
			}
		}
		return local322;
	}

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return -10;
	}

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean580;
	}
}
