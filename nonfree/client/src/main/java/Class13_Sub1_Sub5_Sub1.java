import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class13_Sub1_Sub5_Sub1 extends Class13_Sub1_Sub5 {

	@OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
	public int anInt7987;

	@OriginalMember(owner = "client!rda", name = "U", descriptor = "I")
	public int anInt7991;

	@OriginalMember(owner = "client!rda", name = "bb", descriptor = "I")
	public int anInt7998;

	@OriginalMember(owner = "client!rda", name = "cb", descriptor = "I")
	public int anInt7999;

	@OriginalMember(owner = "client!rda", name = "T", descriptor = "I")
	public int anInt7990 = -1;

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "Z")
	private boolean aBoolean599 = false;

	@OriginalMember(owner = "client!rda", name = "db", descriptor = "I")
	public int anInt8000 = -1;

	@OriginalMember(owner = "client!rda", name = "Z", descriptor = "I")
	private int anInt7996 = 0;

	@OriginalMember(owner = "client!rda", name = "ab", descriptor = "I")
	public int anInt7997 = 0;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(IIIII)V")
	public Class13_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class177 local6 = arg0.method6967();
		local6.method7869(super.anInt10090, super.anInt10097 - 10, super.anInt10089);
		@Pc(22) Class34 local22 = Static72.aClass225_2.method4789(this.anInt7999);
		@Pc(37) Class182 local37 = local22.method692(this.anInt7991, arg0, null, null, 131072, 0, -1, 0);
		if (local37 != null && (Static449.aBoolean538 ? local37.method6203(arg1, arg2, local6, true, local22.anInt887, Static638.anInt7982) : local37.method6205(arg1, arg2, local6, true, local22.anInt887))) {
			return true;
		}
		@Pc(73) Class34 local73;
		if (this.anInt8000 != -1) {
			local73 = Static72.aClass225_2.method4789(this.anInt8000);
			local37 = local73.method692(this.anInt7987, arg0, null, null, 131072, 0, -1, 0);
			if (local37 != null && (Static449.aBoolean538 ? local37.method6203(arg1, arg2, local6, true, local73.anInt887, Static638.anInt7982) : local37.method6205(arg1, arg2, local6, true, local73.anInt887))) {
				return true;
			}
		}
		if (this.anInt7990 != -1) {
			local73 = Static72.aClass225_2.method4789(this.anInt7990);
			local37 = local73.method692(this.anInt7998, arg0, null, null, 131072, 0, -1, 0);
			if (local37 != null && (Static449.aBoolean538 ? local37.method6203(arg1, arg2, local6, true, local73.anInt887, Static638.anInt7982) : local37.method6205(arg1, arg2, local6, true, local73.anInt887))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean599;
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(I)I")
	@Override
	public int method8405() {
		@Pc(14) Class34 local14 = Static72.aClass225_2.method4789(this.anInt7999);
		@Pc(17) int local17 = local14.anInt887;
		@Pc(27) Class34 local27;
		if (this.anInt8000 != -1) {
			local27 = Static72.aClass225_2.method4789(this.anInt8000);
			if (local17 < local27.anInt887) {
				local17 = local27.anInt887;
			}
		}
		if (this.anInt7990 != -1) {
			local27 = Static72.aClass225_2.method4789(this.anInt7990);
			if (local17 < local27.anInt887) {
				local17 = local27.anInt887;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(17) Class325 local17 = Static387.method5191(super.aByte127, super.anInt10090 >> Static609.anInt9827, super.anInt10089 >> Static609.anInt9827);
		if (local17 != null && local17.aClass13_Sub1_Sub1_1.aBoolean680) {
			@Pc(30) int local30 = local17.aClass13_Sub1_Sub1_1.method8397();
			if (local30 != this.anInt7997) {
				super.anInt10097 -= this.anInt7997;
				this.anInt7997 = local30;
				super.anInt10097 += local30;
			}
		}
		@Pc(53) Class177 local53 = arg0.method6967();
		local53.method7876();
		if (local17 == null || !local17.aClass13_Sub1_Sub1_1.aBoolean680) {
			@Pc(72) Class76 local72 = Static314.aClass76Array2[super.aByte126];
			@Pc(77) int local77 = this.anInt7996 << 1;
			@Pc(84) int local84 = -local77 / 2;
			@Pc(89) int local89 = -local77 / 2;
			@Pc(101) int local101 = local72.method7398(super.anInt10090 + local84, local89 + super.anInt10089);
			@Pc(105) int local105 = local77 / 2;
			@Pc(110) int local110 = -local77 / 2;
			@Pc(123) int local123 = local72.method7398(super.anInt10090 + local105, super.anInt10089 + local110);
			@Pc(128) int local128 = -local77 / 2;
			@Pc(132) int local132 = local77 / 2;
			@Pc(144) int local144 = local72.method7398(local128 + super.anInt10090, super.anInt10089 + local132);
			@Pc(148) int local148 = local77 / 2;
			@Pc(152) int local152 = local77 / 2;
			@Pc(166) int local166 = local72.method7398(local148 + super.anInt10090, local152 + super.anInt10089);
			@Pc(177) int local177 = local101 >= local123 ? local123 : local101;
			@Pc(188) int local188 = local144 >= local166 ? local166 : local144;
			@Pc(195) int local195 = local123 >= local166 ? local166 : local123;
			@Pc(206) int local206 = local101 >= local144 ? local144 : local101;
			if (local77 != 0) {
				@Pc(225) int local225 = (int) (Math.atan2((double) (local177 - local188), (double) local77) * 2607.5945876176133D) & 0x3FFF;
				if (local225 != 0) {
					local53.method7883(local225);
				}
			}
			@Pc(235) int local235 = local101 + local166;
			if (local77 != 0) {
				@Pc(251) int local251 = (int) (Math.atan2((double) (local206 - local195), (double) local77) * 2607.5945876176133D) & 0x3FFF;
				if (local251 != 0) {
					local53.method7873(-local251);
				}
			}
			if (local235 > local144 + local123) {
				local235 = local144 + local123;
			}
			local235 = (local235 >> 1) - super.anInt10097;
			if (local235 != 0) {
				local53.method7872(0, local235, 0);
			}
		}
		local53.method7872(super.anInt10090, super.anInt10097 - 10, super.anInt10089);
		@Pc(300) Class13_Sub6 local300 = Static491.method6848(3, true);
		this.aBoolean599 = false;
		this.anInt7996 = 0;
		@Pc(337) Class182 local337;
		if (this.anInt7990 != -1) {
			local337 = Static72.aClass225_2.method4789(this.anInt7990).method692(this.anInt7998, arg0, null, null, 2048, 0, -1, 0);
			if (local337 != null) {
				if (Static449.aBoolean538) {
					local337.method6194(local53, local300.aClass13_Sub2Array1[2], Static638.anInt7982, 0);
				} else {
					local337.method6206(local53, local300.aClass13_Sub2Array1[2], 0);
				}
				this.aBoolean599 |= local337.F();
				this.anInt7996 = local337.ma();
			}
		}
		if (this.anInt8000 != -1) {
			local337 = Static72.aClass225_2.method4789(this.anInt8000).method692(this.anInt7987, arg0, null, null, 2048, 0, -1, 0);
			if (local337 != null) {
				if (Static449.aBoolean538) {
					local337.method6194(local53, local300.aClass13_Sub2Array1[1], Static638.anInt7982, 0);
				} else {
					local337.method6206(local53, local300.aClass13_Sub2Array1[1], 0);
				}
				this.aBoolean599 |= local337.F();
				if (local337.ma() > this.anInt7996) {
					this.anInt7996 = local337.ma();
				}
			}
		}
		local337 = Static72.aClass225_2.method4789(this.anInt7999).method692(this.anInt7991, arg0, null, null, 2048, 0, -1, 0);
		if (local337 != null) {
			if (Static449.aBoolean538) {
				local337.method6194(local53, local300.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
			} else {
				local337.method6206(local53, local300.aClass13_Sub2Array1[0], 0);
			}
			this.aBoolean599 |= local337.F();
			if (local337.ma() > this.anInt7996) {
				this.anInt7996 = local337.ma();
			}
		}
		return local300;
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.anInt7996 : 72;
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return -10;
	}
}
