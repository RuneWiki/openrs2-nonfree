import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub1_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!ib", name = "ed", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!ib", name = "md", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!ib", name = "qd", descriptor = "I")
	public int anInt4179;

	@OriginalMember(owner = "client!ib", name = "rd", descriptor = "I")
	public int anInt4180;

	@OriginalMember(owner = "client!ib", name = "Gd", descriptor = "Lclient!pfa;")
	public Class271 aClass271_1;

	@OriginalMember(owner = "client!ib", name = "Kd", descriptor = "I")
	private int anInt4195;

	@OriginalMember(owner = "client!ib", name = "cd", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!ib", name = "jd", descriptor = "I")
	public int anInt4174 = 255;

	@OriginalMember(owner = "client!ib", name = "hd", descriptor = "B")
	private byte aByte73 = 0;

	@OriginalMember(owner = "client!ib", name = "ud", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!ib", name = "td", descriptor = "I")
	public int anInt4182 = 0;

	@OriginalMember(owner = "client!ib", name = "pd", descriptor = "I")
	public int anInt4178 = 0;

	@OriginalMember(owner = "client!ib", name = "xd", descriptor = "I")
	public int anInt4185 = -1;

	@OriginalMember(owner = "client!ib", name = "fd", descriptor = "B")
	private byte aByte72 = 0;

	@OriginalMember(owner = "client!ib", name = "Id", descriptor = "I")
	public int anInt4194 = -1;

	@OriginalMember(owner = "client!ib", name = "nd", descriptor = "I")
	public int anInt4177 = 0;

	@OriginalMember(owner = "client!ib", name = "Jd", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!ib", name = "Hd", descriptor = "I")
	public int anInt4193 = -1;

	@OriginalMember(owner = "client!ib", name = "Wd", descriptor = "I")
	public int anInt4203 = -1;

	@OriginalMember(owner = "client!ib", name = "Vd", descriptor = "Z")
	public boolean aBoolean260 = false;

	@OriginalMember(owner = "client!ib", name = "Pd", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!ib", name = "od", descriptor = "B")
	private byte aByte74 = 0;

	@OriginalMember(owner = "client!ib", name = "Zd", descriptor = "I")
	public int anInt4206 = -1;

	@OriginalMember(owner = "client!ib", name = "Cd", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!ib", name = "Dd", descriptor = "I")
	public int anInt4190 = -1;

	@OriginalMember(owner = "client!ib", name = "Sd", descriptor = "I")
	public int anInt4201 = 0;

	@OriginalMember(owner = "client!ib", name = "Xd", descriptor = "I")
	public int anInt4204 = -1;

	@OriginalMember(owner = "client!ib", name = "ae", descriptor = "I")
	public int anInt4207 = -1;

	@OriginalMember(owner = "client!ib", name = "Qd", descriptor = "I")
	public int anInt4199 = 0;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)I")
	@Override
	public int method4326() {
		return this.aClass271_1 == null || this.aClass271_1.anInt7496 == -1 ? super.method4326() : Static95.aClass188_1.method4262(this.aClass271_1.anInt7496).anInt2346;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V")
	public void method3508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt5120 = 0;
		super.anInt5122 = 0;
		super.anIntArray302[0] = arg0;
		super.anInt5119 = 0;
		super.anIntArray301[0] = arg1;
		@Pc(33) int local33 = this.method4326();
		super.anInt10006 = super.anIntArray302[0] * 512 + local33 * 256;
		super.anInt10001 = local33 * 256 + super.anIntArray301[0] * 512;
		if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == this) {
			Static139.method2087();
		}
		if (super.aClass2_Sub8_5 != null) {
			super.aClass2_Sub8_5.method4173();
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLclient!ha;)Z")
	private boolean method3509(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class389 local11 = this.method4317();
		@Pc(26) Class119 local26 = super.anInt5077 != -1 && super.anInt5065 == 0 ? Static334.aClass268_2.method6469(super.anInt5077) : null;
		@Pc(46) Class119 local46 = super.anInt5112 == -1 || this.aBoolean259 || super.aBoolean331 && local26 != null ? null : Static334.aClass268_2.method6469(super.anInt5112);
		@Pc(49) int local49 = local11.anInt10690;
		@Pc(52) int local52 = local11.anInt10703;
		if (local49 != 0 || local52 != 0 || local11.anInt10705 != 0 || local11.anInt10717 != 0) {
			arg0 |= 0x7;
		}
		@Pc(80) int local80 = super.lb.method8507();
		@Pc(98) boolean local98 = super.aByte92 != 0 && super.anInt5055 <= Static90.anInt1698 && super.anInt5116 > Static90.anInt1698;
		if (local98) {
			arg0 |= 0x80000;
		}
		@Pc(142) Class184 local142 = super.aClass184Array3[0] = this.aClass271_1.method6479(arg0, local80, super.anInt5115, Static659.aClass363_3, local26, local46, super.aClass245Array3, Static334.aClass268_2, Static340.aClass121_1, super.anInt5075, arg1, Static95.aClass188_1, super.anInt5049, Static12.aClass368_1, super.anInt5071, Static416.aClass107_1, super.anIntArray297, super.anInt5067, super.anInt5054);
		@Pc(145) int local145 = Static405.method5832();
		if (Static549.anInt9246 < 96 && local145 > 50) {
			Static129.method1975();
		}
		if (Static74.aClass104_2 != Static648.aClass104_9 && local145 < 50) {
			@Pc(174) int local174 = 50 - local145;
			while (Static100.anInt1870 < local174) {
				Static489.aByteArrayArray24[Static100.anInt1870] = new byte[102400];
				Static100.anInt1870++;
			}
			while (local174 < Static100.anInt1870) {
				Static100.anInt1870--;
				Static489.aByteArrayArray24[Static100.anInt1870] = null;
			}
		} else if (Static74.aClass104_2 != Static648.aClass104_9) {
			Static100.anInt1870 = 0;
			Static489.aByteArrayArray24 = new byte[50][];
		}
		if (local142 == null) {
			return false;
		}
		super.anInt5061 = local142.fa();
		super.anInt5070 = local142.ma();
		this.method4325(local142);
		if (local49 == 0 && local52 == 0) {
			this.method4319(this.method4326() << 9, 0, 0, this.method4326() << 9, local80);
		} else {
			this.method4319(local49, local11.anInt10724, local11.anInt10721, local52, local80);
			if (super.anInt5118 != 0) {
				local142.FA(super.anInt5118);
			}
			if (super.anInt5072 != 0) {
				local142.VA(super.anInt5072);
			}
			if (super.anInt5099 != 0) {
				local142.H(0, super.anInt5099, 0);
			}
		}
		if (local98) {
			local142.method8654(super.aByte90, super.aByte89, super.aByte93, super.aByte92 & 0xFF);
		}
		if (!this.aBoolean259) {
			this.method4318(arg1, local11, local52, local80, local7, local49);
		}
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ka;IILclient!ha;ILclient!oo;IIB)V")
	private void method3510(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class207 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(19) int local19 = arg6 * arg6 + arg2 * arg2;
		if (local19 < 262144 || arg7 < local19) {
			return;
		}
		@Pc(45) int local45 = (int) (Math.atan2((double) arg2, (double) arg6) * 2607.5945876176133D - (double) super.lb.method8507()) & 0x3FFF;
		@Pc(57) Class184 local57 = Static143.method2098(arg3, local45, arg1, super.anInt5072, super.anInt5118, super.anInt5099);
		if (local57 != null) {
			arg3.C(false);
			local57.method8658(arg5, (Class2_Sub5) null, arg4, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)V")
	public void method3513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5119 < 9) {
			super.anInt5119++;
		}
		for (@Pc(18) int local18 = super.anInt5119; local18 > 0; local18--) {
			super.anIntArray302[local18] = super.anIntArray302[local18 - 1];
			super.anIntArray301[local18] = super.anIntArray301[local18 - 1];
			super.aByteArray51[local18] = super.aByteArray51[local18 - 1];
		}
		super.anIntArray302[0] = arg0;
		super.aByteArray51[0] = arg2;
		super.anIntArray301[0] = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3514() {
		return this.aString45;
	}

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(I)I")
	@Override
	protected int method4334() {
		return this.anInt4195;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		if (this.aClass271_1 == null || !super.aBoolean333 && !this.method3509(0, arg0)) {
			return;
		}
		@Pc(30) Class207 local30 = arg0.method7456();
		local30.method8200(super.lb.method8507());
		local30.method8209(super.anInt10006, super.anInt10004 - 5, super.anInt10001);
		this.method4321(local30, super.aBoolean333, super.aClass184Array3, arg0);
		for (@Pc(57) int local57 = 0; local57 < super.aClass184Array3.length; local57++) {
			super.aClass184Array3[local57] = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!gga;)V")
	public void method3515(@OriginalArg(1) Class6_Sub23 arg0) {
		arg0.anInt9901 = 0;
		@Pc(12) int local12 = arg0.method8374();
		this.aByte73 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean256;
		this.aBoolean256 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method4326();
		this.method4323((local12 >> 3 & 0x7) + 1);
		this.aByte72 = (byte) (local12 >> 6 & 0x3);
		super.anInt10006 += this.method4326() - local48 << 8;
		super.anInt10001 += this.method4326() - local48 << 8;
		this.aByte74 = arg0.method8391();
		this.anInt4193 = arg0.method8391();
		this.anInt4194 = arg0.method8391();
		this.aBoolean257 = arg0.method8391() == 1;
		if (Static74.aClass104_2 == Static648.aClass104_9 && Static26.anInt609 >= 2) {
			this.aBoolean257 = false;
		}
		@Pc(129) int local129 = -1;
		this.anInt4178 = 0;
		@Pc(137) int[] local137 = new int[Static312.aClass212_2.anIntArray340.length];
		@Pc(142) Class317[] local142 = new Class317[Static312.aClass212_2.anIntArray340.length];
		@Pc(147) Class216[] local147 = new Class216[Static312.aClass212_2.anIntArray340.length];
		@Pc(173) int local173;
		@Pc(179) int local179;
		@Pc(225) int local225;
		for (@Pc(149) int local149 = 0; local149 < Static312.aClass212_2.anIntArray340.length; local149++) {
			if (Static312.aClass212_2.anIntArray340[local149] != 1) {
				@Pc(161) int local161 = arg0.method8374();
				if (local161 == 0) {
					local137[local149] = 0;
				} else {
					local173 = arg0.method8374();
					local179 = local173 + (local161 << 8);
					if (local149 == 0 && local179 == 65535) {
						local129 = arg0.method8363();
						this.anInt4178 = arg0.method8374();
						break;
					}
					if (local179 >= 32768) {
						local179 = Static619.anIntArray666[local179 - 32768];
						local137[local149] = local179 | 0x40000000;
						local147[local149] = Static340.aClass121_1.method2647(local179);
						local225 = local147[local149].anInt6066;
						if (local225 != 0) {
							this.anInt4178 = local225;
						}
					} else {
						local137[local149] = local179 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local129 == -1) {
			local173 = arg0.method8363();
			local179 = 0;
			for (local225 = 0; local225 < Static312.aClass212_2.anIntArray340.length; local225++) {
				if (Static312.aClass212_2.anIntArray340[local225] == 0) {
					if ((local173 & 0x1 << local179) != 0) {
						local142[local225] = Static676.method9113(arg0, local147[local225]);
					}
					local179++;
				}
			}
		}
		@Pc(304) int[] local304 = new int[5];
		for (local179 = 0; local179 < 5; local179++) {
			local225 = arg0.method8374();
			if (Static3.aShortArrayArrayArray2.length < 1 || local225 < 0 || local225 >= Static3.aShortArrayArrayArray2[0][local179].length) {
				local225 = 0;
			}
			local304[local179] = local225;
		}
		this.anInt4195 = arg0.method8363();
		this.aString46 = arg0.method8354();
		this.aString45 = this.aString46;
		if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == this) {
			Static294.aString139 = this.aString46;
		}
		this.anInt4182 = arg0.method8374();
		if (local44) {
			this.anInt4199 = arg0.method8363();
			if (this.anInt4199 == 65535) {
				this.anInt4199 = -1;
			}
			this.anInt4206 = -1;
			this.anInt4201 = this.anInt4182;
		} else {
			this.anInt4199 = 0;
			this.anInt4201 = arg0.method8374();
			this.anInt4206 = arg0.method8374();
			if (this.anInt4206 == 255) {
				this.anInt4206 = -1;
			}
		}
		local225 = this.anInt4177;
		this.anInt4177 = arg0.method8374();
		@Pc(431) int local431;
		@Pc(437) int local437;
		if (this.anInt4177 == 0) {
			Static368.method5311(this);
		} else {
			local431 = this.anInt4185;
			@Pc(434) int local434 = this.anInt4190;
			local437 = this.anInt4203;
			@Pc(440) int local440 = this.anInt4204;
			@Pc(443) int local443 = this.anInt4174;
			this.anInt4185 = arg0.method8363();
			this.anInt4190 = arg0.method8363();
			this.anInt4203 = arg0.method8363();
			this.anInt4204 = arg0.method8363();
			this.anInt4174 = arg0.method8374();
			if (this.aBoolean256 != local21 || this.anInt4177 != local225 || local431 != this.anInt4185 || this.anInt4190 != local434 || this.anInt4203 != local437 || this.anInt4204 != local440 || local443 != this.anInt4174) {
				Static92.method1533(this);
			}
		}
		if (this.aClass271_1 == null) {
			this.aClass271_1 = new Class271();
		}
		local431 = this.aClass271_1.anInt7496;
		@Pc(528) int[] local528 = this.aClass271_1.anIntArray501;
		this.aClass271_1.method6484(this.method4334(), local137, local129, this.aByte73 == 1, local304, local142);
		if (local129 != local431) {
			super.anInt10006 = (super.anIntArray302[0] << 9) + (this.method4326() << 8);
			super.anInt10001 = (super.anIntArray301[0] << 9) + (this.method4326() << 8);
		}
		if (super.anInt5103 == Static659.anInt7559 && local528 != null) {
			for (local437 = 0; local437 < local304.length; local437++) {
				if (local528[local437] != local304[local437]) {
					Static340.aClass121_1.method2641();
					break;
				}
			}
		}
		if (super.aClass2_Sub8_5 != null) {
			super.aClass2_Sub8_5.method4173();
		}
		if (super.anInt5112 == -1 || !super.aBoolean331) {
			return;
		}
		@Pc(625) Class389 local625 = this.method4317();
		if (!local625.method9073(super.anInt5112)) {
			super.aBoolean331 = false;
			super.anInt5112 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIB)V")
	public void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5077 != -1 && Static334.aClass268_2.method6469(super.anInt5077).anInt3016 == 1) {
			super.anInt5077 = -1;
			super.anIntArray296 = null;
		}
		for (@Pc(25) int local25 = 0; super.aClass118Array3.length > local25; local25++) {
			if (super.aClass118Array3[local25].anInt2965 != -1) {
				@Pc(43) Class213 local43 = Static111.aClass279_4.method6905(super.aClass118Array3[local25].anInt2965);
				if (local43.aBoolean398 && local43.anInt6006 != -1 && Static334.aClass268_2.method6469(local43.anInt6006).anInt3016 == 1) {
					super.aClass118Array3[local25].anInt2965 = -1;
				}
			}
		}
		this.anInt4207 = -1;
		if (arg1 < 0 || arg1 >= Static491.anInt9856 || arg0 < 0 || arg0 >= Static393.anInt6574) {
			this.method3508(arg1, arg0);
		} else if (super.anIntArray302[0] >= 0 && super.anIntArray302[0] < Static491.anInt9856 && super.anIntArray301[0] >= 0 && Static393.anInt6574 > super.anIntArray301[0]) {
			if (arg2 == 2) {
				Static591.method8149(arg0, this, arg1);
			}
			this.method3513(arg1, arg0, arg2);
		} else {
			this.method3508(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!oo;BLclient!ha;IIILclient!ka;)V")
	private void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(3) Class132 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class184 arg6) {
		@Pc(24) int local24 = arg3 * arg3 + arg0 * arg0;
		if (local24 < 262144 || arg5 < local24) {
			return;
		}
		@Pc(54) int local54 = (int) (Math.atan2((double) arg3, (double) arg0) * 2607.5945876176133D - (double) super.lb.method8507()) & 0x3FFF;
		@Pc(66) Class184 local66 = Static143.method2098(arg2, local54, arg4, super.anInt5072, super.anInt5118, super.anInt5099);
		if (local66 != null) {
			arg2.C(false);
			local66.method8662(arg1, (Class2_Sub5) null, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method3519() {
		@Pc(7) String local7 = "";
		if (Static462.aStringArray49 != null) {
			local7 = local7 + Static462.aStringArray49[this.aByte72];
		}
		@Pc(45) int[] local45;
		if (this.aByte73 == 1 && Static598.anIntArray650 != null) {
			local45 = Static598.anIntArray650;
		} else {
			local45 = Static507.anIntArray560;
		}
		if (local45 != null && local45[this.aByte72] != -1) {
			@Pc(65) Class255 local65 = Static28.aClass190_1.method4283(local45[this.aByte72]);
			if (local65.aChar4 == 's') {
				local7 = local7 + local65.method6280(this.aByte74 & 0xFF);
			} else {
				Static664.method9007(new Throwable(), "gdn1");
				local45[this.aByte72] = -1;
			}
		}
		local7 = local7 + this.aString46;
		if (Static568.aStringArray57 != null) {
			local7 = local7 + Static568.aStringArray57[this.aByte72];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass271_1 == null || !this.method3509(131072, arg1)) {
			return false;
		}
		@Pc(19) Class207 local19 = arg1.method7456();
		@Pc(26) int local26 = super.lb.method8507();
		local19.method8200(local26);
		local19.method8209(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(39) boolean local39 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass184Array3.length; local47++) {
			if (super.aClass184Array3[local47] != null && (Static487.aBoolean565 ? super.aClass184Array3[local47].method8653(arg0, arg2, local19, true, 0, Static472.anInt8136) : super.aClass184Array3[local47].method8656(arg0, arg2, local19, true, 0))) {
				local39 = true;
				break;
			}
		}
		super.aClass184Array3[0] = super.aClass184Array3[1] = super.aClass184Array3[2] = null;
		return local39;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "(I)Z")
	public boolean method3520() {
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		if (this.aClass271_1 == null || !this.method3509(2048, arg0)) {
			return null;
		}
		@Pc(19) Class207 local19 = arg0.method7456();
		@Pc(30) int local30 = super.lb.method8507();
		local19.method8200(local30);
		@Pc(48) Class351 local48 = Static441.aClass351ArrayArrayArray1[super.aByte140][super.anInt10006 >> Static185.anInt3178][super.anInt10001 >> Static185.anInt3178];
		if (local48 == null || local48.aClass2_Sub1_Sub3_1 == null) {
			super.anInt5058 = (int) ((float) super.anInt5058 - (float) super.anInt5058 / 10.0F);
		} else {
			@Pc(61) int local61 = super.anInt5058 - local48.aClass2_Sub1_Sub3_1.aShort61;
			super.anInt5058 = (int) ((float) super.anInt5058 - (float) local61 / 10.0F);
		}
		local19.method8209(super.anInt10006, -super.anInt5058 + super.anInt10004 - 20, super.anInt10001);
		@Pc(102) Class2_Sub9 local102 = null;
		super.aBoolean332 = false;
		if (Static96.aClass6_Sub22_7.aClass29_Sub28_1.method8981() == 1) {
			@Pc(115) Class389 local115 = this.method4317();
			if (local115.aBoolean738 && (this.aClass271_1.anInt7496 == -1 || Static95.aClass188_1.method4262(this.aClass271_1.anInt7496).aBoolean143)) {
				@Pc(150) Class119 local150 = super.anInt5077 != -1 && super.anInt5065 == 0 ? Static334.aClass268_2.method6469(super.anInt5077) : null;
				@Pc(171) Class119 local171 = super.anInt5112 == -1 || this.aBoolean259 || super.aBoolean331 && local150 != null ? null : Static334.aClass268_2.method6469(super.anInt5112);
				@Pc(203) Class184 local203 = Static388.method5541(0, super.anInt5099, local171 == null ? super.anInt5115 : super.anInt5067, arg0, 0, super.anInt5072, 1, 240, 160, super.anInt5118, super.aClass184Array3[0], local30, local171 == null ? local150 : local171);
				if (local203 != null) {
					local102 = Static49.method971(super.aClass184Array3.length + 1, true);
					super.aBoolean332 = true;
					arg0.C(false);
					if (Static487.aBoolean565) {
						local203.method8658(local19, local102.aClass2_Sub5Array1[super.aClass184Array3.length], Static472.anInt8136, 0);
					} else {
						local203.method8662(local19, local102.aClass2_Sub5Array1[super.aClass184Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(256) int local256;
		if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == this) {
			for (local256 = Static539.aClass167Array1.length - 1; local256 >= 0; local256--) {
				@Pc(262) Class167 local262 = Static539.aClass167Array1[local256];
				if (local262 != null && local262.anInt4339 != -1) {
					@Pc(292) int local292;
					if (local262.anInt4342 == 1) {
						@Pc(280) Class6_Sub44 local280 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local262.anInt4346);
						if (local280 != null) {
							@Pc(285) Class2_Sub1_Sub1_Sub3_Sub2 local285 = local280.aClass2_Sub1_Sub1_Sub3_Sub2_2;
							local292 = local285.anInt10006 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006;
							@Pc(299) int local299 = local285.anInt10001 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001;
							if (Static487.aBoolean565) {
								this.method3510(super.aClass184Array3[0], local262.anInt4339, local292, arg0, Static472.anInt8136, local19, local299, 92160000);
							} else {
								this.method3517(local299, local19, arg0, local292, local262.anInt4339, 92160000, super.aClass184Array3[0]);
							}
						}
					}
					@Pc(350) int local350;
					if (local262.anInt4342 == 2) {
						@Pc(343) int local343 = local262.anInt4348 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006;
						local350 = local262.anInt4344 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001;
						local292 = local262.anInt4336 << 9;
						local292 *= local292;
						if (Static487.aBoolean565) {
							this.method3510(super.aClass184Array3[0], local262.anInt4339, local343, arg0, Static472.anInt8136, local19, local350, local292);
						} else {
							this.method3517(local350, local19, arg0, local343, local262.anInt4339, local292, super.aClass184Array3[0]);
						}
					}
					if (local262.anInt4342 == 10 && local262.anInt4346 >= 0 && local262.anInt4346 < Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1.length) {
						@Pc(413) Class2_Sub1_Sub1_Sub3_Sub1 local413 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local262.anInt4346];
						if (local413 != null) {
							local350 = local413.anInt10006 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006;
							local292 = local413.anInt10001 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001;
							if (Static487.aBoolean565) {
								this.method3510(super.aClass184Array3[0], local262.anInt4339, local350, arg0, Static472.anInt8136, local19, local292, 92160000);
							} else {
								this.method3517(local292, local19, arg0, local350, local262.anInt4339, 92160000, super.aClass184Array3[0]);
							}
						}
					}
				}
			}
			local19.method8200(local30);
			local19.method8209(super.anInt10006, super.anInt10004, super.anInt10001);
		}
		local19.method8200(local30);
		local19.method8209(super.anInt10006, -super.anInt5058 + super.anInt10004 - 5, super.anInt10001);
		if (local102 == null) {
			local102 = Static49.method971(super.aClass184Array3.length, true);
		}
		this.method4321(local19, false, super.aClass184Array3, arg0);
		if (Static487.aBoolean565) {
			for (local256 = 0; local256 < super.aClass184Array3.length; local256++) {
				if (super.aClass184Array3[local256] != null) {
					super.aClass184Array3[local256].method8658(local19, local102.aClass2_Sub5Array1[local256], Static472.anInt8136, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local256 = 0; local256 < super.aClass184Array3.length; local256++) {
				if (super.aClass184Array3[local256] != null) {
					super.aClass184Array3[local256].method8662(local19, local102.aClass2_Sub5Array1[local256], Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass2_Sub8_5 != null) {
			@Pc(587) Class137 local587 = super.aClass2_Sub8_5.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local587, Static472.anInt8136);
			} else {
				arg0.method7455(local587);
			}
		}
		for (local256 = 0; local256 < super.aClass184Array3.length; local256++) {
			if (super.aClass184Array3[local256] != null) {
				super.aBoolean332 |= super.aClass184Array3[local256].F();
			}
			super.aClass184Array3[local256] = null;
		}
		super.anInt5088 = Static61.anInt1167;
		return local102;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)I")
	@Override
	public int method4330() {
		return -1;
	}
}
