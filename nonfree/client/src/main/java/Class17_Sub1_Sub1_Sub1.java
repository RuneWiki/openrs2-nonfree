import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class17_Sub1_Sub1_Sub1 extends Class17_Sub1_Sub1 {

	@OriginalMember(owner = "client!be", name = "Rc", descriptor = "Lclient!eq;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!be", name = "ed", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!be", name = "fd", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!be", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!be", name = "Oc", descriptor = "I")
	public int anInt803 = 0;

	@OriginalMember(owner = "client!be", name = "Nc", descriptor = "B")
	private byte aByte13 = 0;

	@OriginalMember(owner = "client!be", name = "Sc", descriptor = "I")
	public int anInt806 = 255;

	@OriginalMember(owner = "client!be", name = "ad", descriptor = "B")
	private byte aByte14 = 0;

	@OriginalMember(owner = "client!be", name = "Vc", descriptor = "I")
	public int anInt809 = -1;

	@OriginalMember(owner = "client!be", name = "Uc", descriptor = "I")
	public int anInt808 = -1;

	@OriginalMember(owner = "client!be", name = "Wc", descriptor = "I")
	public int anInt810 = 0;

	@OriginalMember(owner = "client!be", name = "Pc", descriptor = "I")
	public int anInt804 = 0;

	@OriginalMember(owner = "client!be", name = "Gc", descriptor = "I")
	public int anInt796 = -1;

	@OriginalMember(owner = "client!be", name = "jd", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!be", name = "pd", descriptor = "I")
	public int anInt822 = -1;

	@OriginalMember(owner = "client!be", name = "Xc", descriptor = "I")
	public int anInt811 = 0;

	@OriginalMember(owner = "client!be", name = "rd", descriptor = "I")
	public int anInt824 = -1;

	@OriginalMember(owner = "client!be", name = "Yc", descriptor = "I")
	public int anInt812 = -1;

	@OriginalMember(owner = "client!be", name = "Fc", descriptor = "I")
	public int anInt795 = 0;

	@OriginalMember(owner = "client!be", name = "ud", descriptor = "I")
	public int anInt826 = -1;

	@OriginalMember(owner = "client!be", name = "Zc", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
	@Override
	protected int method4317() {
		return this.anInt815;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		if (this.aClass60_1 != null && (super.aBoolean474 || this.method556(0, arg0))) {
			this.method4329(super.aBoolean474, super.aClass73Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZILclient!uo;)Z")
	private boolean method556(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class123 local11 = this.method4319();
		@Pc(28) Class24 local28 = super.anInt4830 != -1 && super.anInt4856 == 0 ? Static110.method5411(super.anInt4830) : null;
		@Pc(48) Class24 local48 = super.anInt4824 == -1 || this.aBoolean81 || super.aBoolean471 && local28 != null ? null : Static110.method5411(super.anInt4824);
		@Pc(51) int local51 = local11.anInt3697;
		@Pc(54) int local54 = local11.anInt3660;
		if (local51 != 0 || local54 != 0 || local11.anInt3673 != 0 || local11.anInt3696 != 0) {
			arg0 |= 0x7;
		}
		super.aClass73Array3[0] = this.aClass60_1.method1713(super.anInt4840, super.anInt4847, arg0, arg1, local28, local48, super.anInt4876, super.anInt4874, super.aClass184Array3, super.anInt4863, super.anInt4854);
		@Pc(104) int local104 = Static36.method877();
		if (Static257.anInt5344 < 96 && local104 > 50) {
			Static192.method3721();
		}
		@Pc(130) int local130;
		if (Static120.anInt2757 != 0 && local104 < 50) {
			local130 = 50 - local104;
			while (local130 > Static311.anInt6070) {
				Static264.aByteArrayArray24[Static311.anInt6070] = new byte[102400];
				Static311.anInt6070++;
			}
			while (local130 < Static311.anInt6070) {
				Static311.anInt6070--;
				Static264.aByteArrayArray24[Static311.anInt6070] = null;
			}
		} else if (Static120.anInt2757 != 0) {
			Static264.aByteArrayArray24 = new byte[50][];
			Static311.anInt6070 = 0;
		}
		if (super.aClass73Array3[0] == null) {
			return false;
		}
		super.anInt4834 = super.aClass73Array3[0].method3327();
		this.method4313(super.aClass73Array3[0]);
		local130 = super.aClass135_7.method3693();
		super.anInt4822 = 0;
		super.anInt4870 = 0;
		super.anInt4875 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4314(this.method4318() << 7, this.method4318() << 7, local130);
		} else {
			this.method4314(local54, local51, local130);
			if (super.anInt4875 != 0) {
				super.aClass73Array3[0].method3284(super.anInt4875);
			}
			if (super.anInt4822 != 0) {
				super.aClass73Array3[0].method3324(super.anInt4822);
			}
			if (super.anInt4870 != 0) {
				super.aClass73Array3[0].method3293(0, super.anInt4870, 0);
			}
		}
		super.aClass73Array3[1] = null;
		if (!this.aBoolean81 && super.anInt4884 != -1 && super.anInt4881 != -1) {
			@Pc(299) Class67 local299 = Static265.method5633(super.anInt4884);
			@Pc(318) Class73 local318 = local299.method1823(super.anInt4855, local7 | (local299.aBoolean194 ? 7 : 2), super.anInt4833, super.anInt4881, arg1);
			if (local318 != null) {
				local318.method3293(0, -super.anInt4844, 0);
				if (local299.aBoolean194 && (local51 != 0 || local54 != 0)) {
					if (super.anInt4875 != 0) {
						local318.method3284(super.anInt4875);
					}
					if (super.anInt4822 != 0) {
						local318.method3324(super.anInt4822);
					}
					if (super.anInt4870 != 0) {
						local318.method3293(0, super.anInt4870, 0);
					}
				}
				super.aClass73Array3[1] = local318;
			}
		}
		super.aClass73Array3[2] = null;
		if (!this.aBoolean81 && super.anInterface5_3 != null) {
			if (Static5.anInt208 >= super.anInt4898) {
				super.anInterface5_3 = null;
			}
			if (Static5.anInt208 >= super.anInt4894 && Static5.anInt208 < super.anInt4898) {
				@Pc(408) Class73 local408 = super.anInterface5_3.method4798(arg1, local7 | 0x7);
				if (local408 != null) {
					local408.method3293(-super.anInt5109 + super.anInt4886, super.anInt4889 + -super.anInt5112, -super.anInt5108 + super.anInt4896);
					if (local130 != 0) {
						local408.method3319(-local130 & 0x3FFF);
					}
					super.aClass73Array3[2] = local408;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
	@Override
	public int method4490() {
		return super.anInt4834;
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(B)Z")
	public boolean method558() {
		return this.aClass60_1 != null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)V")
	public void method559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray438[0];
		@Pc(15) int local15 = super.anIntArray439[0];
		if (arg0 == 0) {
			local10--;
			local15++;
		}
		if (arg0 == 1) {
			local15++;
		}
		if (arg0 == 2) {
			local10++;
			local15++;
		}
		if (arg0 == 3) {
			local10--;
		}
		if (arg0 == 4) {
			local10++;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local15--;
		}
		if (super.anInt4830 != -1 && Static110.method5411(super.anInt4830).anInt1035 == 1) {
			super.anInt4830 = -1;
		}
		if (arg0 == 7) {
			local10++;
			local15--;
		}
		if (super.anInt4884 != -1) {
			@Pc(85) Class67 local85 = Static265.method5633(super.anInt4884);
			if (local85.aBoolean193 && local85.anInt2088 != -1 && Static110.method5411(local85.anInt2088).anInt1035 == 1) {
				super.anInt4884 = -1;
			}
		}
		if (super.anInt4893 < 9) {
			super.anInt4893++;
		}
		for (@Pc(119) int local119 = super.anInt4893; local119 > 0; local119--) {
			super.anIntArray438[local119] = super.anIntArray438[local119 - 1];
			super.anIntArray439[local119] = super.anIntArray439[local119 - 1];
			super.aByteArray78[local119] = super.aByteArray78[local119 - 1];
		}
		super.anIntArray438[0] = local10;
		super.aByteArray78[0] = (byte) arg1;
		super.anIntArray439[0] = local15;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)I")
	@Override
	public int method4318() {
		return this.aClass60_1 == null || this.aClass60_1.anInt1966 == -1 ? super.method4318() : Static133.method2749(this.aClass60_1.anInt1966).anInt6509;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIBII)V")
	public void method560(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.method4327(arg0, this.method4318(), arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass60_1 == null || !this.method556(65536, arg0)) {
			return true;
		}
		@Pc(19) Class109 local19 = arg0.method2194();
		@Pc(24) int local24 = super.aClass135_7.method3693();
		local19.method3871(local24);
		local19.method3874(super.anInt5109, super.anInt5112, super.anInt5108);
		for (@Pc(37) int local37 = 0; super.aClass73Array3.length > local37; local37++) {
			if (super.aClass73Array3[local37] != null && super.aClass73Array3[local37].method3326(arg1, arg2, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method562() {
		@Pc(12) String local12 = "";
		if (Static172.aStringArray35 != null) {
			local12 = local12 + Static172.aStringArray35[this.aByte15];
		}
		@Pc(36) int[] local36;
		if (this.aByte14 == 1 && Static172.anIntArray345 != null) {
			local36 = Static172.anIntArray345;
		} else {
			local36 = Static325.anIntArray508;
		}
		if (local36 != null && local36[this.aByte15] != -1) {
			@Pc(56) Class1_Sub4_Sub8 local56 = Static5.method190(local36[this.aByte15]);
			if (local56.aChar2 == 's') {
				local12 = local12 + local56.method1440(this.aByte13 & 0xFF);
			} else {
				Static109.method2355("gdn1", new Throwable());
				local36[this.aByte15] = -1;
			}
		}
		local12 = local12 + this.aString14;
		if (Static42.aStringArray13 != null) {
			local12 = local12 + Static42.aStringArray13[this.aByte15];
		}
		return local12;
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I")
	@Override
	public int method4328() {
		return -1;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method563() {
		return this.aString13;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!bg;I)V")
	public void method564(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.anInt5182 = 0;
		@Pc(12) int local12 = arg0.method4532();
		this.aByte14 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method4318();
		this.method4321((local12 >> 3 & 0x7) + 1);
		this.aByte15 = (byte) (local12 >> 6 & 0x3);
		super.anInt5109 += (this.method4318() - local38) * 64;
		super.anInt5108 += (this.method4318() - local38) * 64;
		this.aByte13 = arg0.method4558();
		this.anInt808 = arg0.method4558();
		this.anInt812 = arg0.method4558();
		@Pc(99) int local99 = -1;
		this.anInt811 = 0;
		@Pc(105) int[] local105 = new int[12];
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(170) int local170;
		for (@Pc(107) int local107 = 0; local107 < 12; local107++) {
			@Pc(113) int local113 = arg0.method4532();
			if (local113 == 0) {
				local105[local107] = 0;
			} else {
				local125 = arg0.method4532();
				local131 = local125 + (local113 << 8);
				if (local107 == 0 && local131 == 65535) {
					local99 = arg0.method4556();
					this.anInt811 = arg0.method4532();
					break;
				}
				if (local131 >= 32768) {
					local131 = Static36.anIntArray101[local131 - 32768];
					local105[local107] = local131 | 0x40000000;
					local170 = Static20.method561(local131).anInt3332;
					if (local170 != 0) {
						this.anInt811 = local170;
					}
				} else {
					local105[local107] = Integer.MIN_VALUE | local131 - 256;
				}
			}
		}
		@Pc(194) int[] local194 = new int[5];
		for (local125 = 0; local125 < 5; local125++) {
			local131 = arg0.method4532();
			if (local131 < 0 || Static331.aShortArrayArray7[local125].length <= local131) {
				local131 = 0;
			}
			local194[local125] = local131;
		}
		this.anInt815 = arg0.method4556();
		this.aString14 = arg0.method4534();
		if (local26) {
			this.aString13 = arg0.method4534();
		} else {
			this.aString13 = this.aString14;
		}
		this.anInt803 = arg0.method4532();
		if (local34) {
			this.anInt795 = arg0.method4556();
			this.anInt810 = this.anInt803;
			this.anInt796 = -1;
		} else {
			this.anInt795 = 0;
			this.anInt810 = arg0.method4532();
			this.anInt796 = arg0.method4532();
			if (this.anInt796 == 255) {
				this.anInt796 = -1;
			}
		}
		local131 = this.anInt804;
		this.anInt804 = arg0.method4532();
		@Pc(309) int local309;
		if (this.anInt804 == 0) {
			Static34.method848(this);
		} else {
			local170 = this.anInt809;
			@Pc(303) int local303 = this.anInt824;
			@Pc(306) int local306 = this.anInt822;
			local309 = this.anInt826;
			@Pc(312) int local312 = this.anInt806;
			this.anInt809 = arg0.method4556();
			this.anInt824 = arg0.method4556();
			this.anInt822 = arg0.method4556();
			this.anInt826 = arg0.method4556();
			this.anInt806 = arg0.method4532();
			if (this.anInt804 != local131 || local170 != this.anInt809 || local303 != this.anInt824 || this.anInt822 != local306 || this.anInt826 != local309 || this.anInt806 != local312) {
				Static41.method966(this);
			}
		}
		if (this.aClass60_1 == null) {
			this.aClass60_1 = new Class60();
		}
		local170 = this.aClass60_1.anInt1966;
		@Pc(397) int[] local397 = this.aClass60_1.anIntArray196;
		this.aClass60_1.method1717(this.aByte14 == 1, local194, local105, local99, this.method4317());
		if (local170 != local99) {
			super.anInt5109 = super.anIntArray438[0] * 128 + this.method4318() * 64;
			super.anInt5108 = super.anIntArray439[0] * 128 + this.method4318() * 64;
		}
		if (super.anInt4867 == 2047 && local397 != null) {
			for (local309 = 0; local309 < local194.length; local309++) {
				if (local194[local309] != local397[local309]) {
					Static255.method4603();
					break;
				}
			}
		}
		if (super.aClass8_Sub6_6 != null) {
			super.aClass8_Sub6_6.method3273();
		}
		if (super.anInt4824 == -1 || !super.aBoolean471) {
			return;
		}
		@Pc(508) Class123 local508 = this.method4319();
		if (!local508.method3393(super.anInt4824)) {
			super.anInt4824 = -1;
			super.aBoolean471 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!wr;IIIILclient!ge;Lclient!uo;I)V")
	private void method565(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class73 arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 < 16 || arg1 < local11) {
			return;
		}
		@Pc(36) int local36 = (int) (Math.atan2((double) arg3, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(55) Class73 local55 = Static131.method2783(super.anInt5112, arg4, local36, super.anInt4822, super.anInt4875, arg6, super.anInt5108, super.anInt5109, super.anInt4870, arg5);
		if (local55 != null) {
			arg5.method2142(false);
			local55.method3322(arg0, null, 0);
			arg5.method2142(true);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		if (this.aClass60_1 == null || !this.method556(1024, arg0)) {
			return null;
		}
		@Pc(19) Class109 local19 = arg0.method2194();
		@Pc(32) int local32 = super.aClass135_7.method3693();
		local19.method3871(local32);
		local19.method3874(super.anInt5109, super.anInt5112, super.anInt5108);
		@Pc(46) float local46 = arg0.method2212();
		@Pc(49) float local49 = arg0.method2216();
		if (Static282.aBoolean648) {
			@Pc(55) Class123 local55 = this.method4319();
			if (local55.aBoolean343 && (this.aClass60_1.anInt1966 == -1 || Static133.method2749(this.aClass60_1.anInt1966).aBoolean642)) {
				@Pc(87) Class24 local87 = super.anInt4830 != -1 && super.anInt4856 == 0 ? Static110.method5411(super.anInt4830) : null;
				@Pc(107) Class24 local107 = super.anInt4824 == -1 || this.aBoolean81 || super.aBoolean471 && local87 != null ? null : Static110.method5411(super.anInt4824);
				@Pc(141) Class73 local141 = Static145.method2882(local107 == null ? local87 : local107, 1, 0, 160, super.anInt4822, super.aBoolean472, arg0, local32, 0, local107 == null ? super.anInt4863 : super.anInt4847, super.anInt4870, super.anInt4875, super.aClass73Array3[0], 240);
				if (local141 != null) {
					arg0.method2225(local46, local49 - 128.0F);
					arg0.method2142(false);
					local141.method3322(local19, null, 0);
					arg0.method2142(true);
				}
			}
		}
		if (Static198.aClass17_Sub1_Sub1_Sub1_3 == this) {
			arg0.method2225(local46, local49 - 144.0F);
			local19.method3873(super.anInt5109, super.anInt5112, super.anInt5108);
			for (@Pc(182) int local182 = Static340.aClass105Array1.length - 1; local182 >= 0; local182--) {
				@Pc(188) Class105 local188 = Static340.aClass105Array1[local182];
				if (local188 != null && local188.anInt3087 != -1) {
					@Pc(243) int local243;
					@Pc(232) int local232;
					if (local188.anInt3081 == 1 && local188.anInt3076 >= 0 && local188.anInt3076 < Static140.aClass17_Sub1_Sub1_Sub2Array1.length) {
						@Pc(220) Class17_Sub1_Sub1_Sub2 local220 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local188.anInt3076];
						if (local220 != null) {
							local232 = local220.anInt5109 / 32 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 / 32;
							local243 = local220.anInt5108 / 32 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 / 32;
							this.method565(local19, 360000, local243, local232, super.aClass73Array3[0], arg0, local188.anInt3087);
						}
					}
					if (local188.anInt3081 == 2) {
						@Pc(278) int local278 = (local188.anInt3086 - Static234.anInt4783) * 4 + 2 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 / 32;
						local232 = (local188.anInt3083 - Static32.anInt2224) * 4 + 2 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 / 32;
						local243 = local188.anInt3084 * 4;
						local243 *= local243;
						this.method565(local19, local243, local232, local278, super.aClass73Array3[0], arg0, local188.anInt3087);
					}
					if (local188.anInt3081 == 10 && local188.anInt3076 >= 0 && local188.anInt3076 < Static102.aClass17_Sub1_Sub1_Sub1Array1.length) {
						@Pc(340) Class17_Sub1_Sub1_Sub1 local340 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local188.anInt3076];
						if (local340 != null) {
							local232 = local340.anInt5109 / 32 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 / 32;
							local243 = local340.anInt5108 / 32 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 / 32;
							this.method565(local19, 360000, local243, local232, super.aClass73Array3[0], arg0, local188.anInt3087);
						}
					}
				}
			}
			local19.method3871(local32);
			local19.method3874(super.anInt5109, super.anInt5112, super.anInt5108);
		}
		arg0.method2225(local46, local49);
		@Pc(405) Class8_Sub5 local405 = Static239.method4367(super.aClass73Array3.length);
		if (super.aClass8_Sub6_6 == null) {
			arg0.method2198(super.aClass73Array3, local19, local405.aClass8_Sub3Array1, Static198.aClass17_Sub1_Sub1_Sub1_3 == this ? 1 : 0);
		} else {
			@Pc(427) Class191 local427 = super.aClass8_Sub6_6.method3279();
			arg0.method2172(super.aClass73Array3, local427, local19, local405.aClass8_Sub3Array1, Static198.aClass17_Sub1_Sub1_Sub1_3 == this ? 1 : 0);
		}
		this.method4329(false, super.aClass73Array3, arg0);
		if (super.aClass73Array3[2] != null) {
			if (local32 != 0) {
				super.aClass73Array3[2].method3319(local32);
			}
			super.aClass73Array3[2].method3293(super.anInt5109 - super.anInt4886, -super.anInt4889 + super.anInt5112, -super.anInt4896 + super.anInt5108);
		}
		return local405;
	}
}
