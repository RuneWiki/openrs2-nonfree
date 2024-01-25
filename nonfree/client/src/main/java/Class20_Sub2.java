import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
	private int anInt1830 = 0;

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
	private int anInt1839 = 0;

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
	private int anInt1837 = 0;

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
	private int anInt1847 = 0;

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_2;

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
	private final int anInt1845;

	@OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
	private final int anInt1835;

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "Lclient!wda;")
	private final Interface26 anInterface26_1;

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "Z")
	private final boolean aBoolean155;

	@OriginalMember(owner = "client!dga", name = "r", descriptor = "Z")
	private final boolean aBoolean156;

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "Z")
	private final boolean aBoolean153;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!gt;IIZ)V")
	public Class20_Sub2(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass87_Sub1_2 = arg0;
		this.anInt1845 = arg2;
		this.anInt1835 = arg1;
		this.anInterface26_1 = arg0.method5149(arg1, arg3 ? Static524.aClass187_15 : Static419.aClass187_11, Static545.aClass324_12, arg2);
		this.anInterface26_1.method8053(true, true);
		this.aBoolean157 = arg1 != this.anInterface26_1.method8055();
		this.aBoolean155 = this.anInterface26_1.method8054() != arg2;
		this.aBoolean156 = !this.aBoolean157 && this.anInterface26_1.method8050();
		this.aBoolean153 = !this.aBoolean155 && this.anInterface26_1.method8050();
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!gt;II[III)V")
	public Class20_Sub2(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1845 = arg2;
		this.aClass87_Sub1_2 = arg0;
		this.anInt1835 = arg1;
		this.anInterface26_1 = arg0.method5060(arg5, arg4, arg1, arg3, false, arg2);
		this.anInterface26_1.method8053(true, true);
		this.aBoolean157 = arg1 != this.anInterface26_1.method8055();
		this.aBoolean155 = arg2 != this.anInterface26_1.method8054();
		this.aBoolean156 = !this.aBoolean157 && this.anInterface26_1.method8050();
		this.aBoolean153 = !this.aBoolean155 && this.anInterface26_1.method8050();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
	@Override
	public void method4585(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass87_Sub1_2.na(0, 0, this.anInt1835, this.anInt1845);
		@Pc(22) int[] local22 = new int[this.anInt1845 * this.anInt1835];
		this.anInterface26_1.method8052(local22, this.anInt1835, this.anInt1845);
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			for (local41 = 0; local41 < this.anInt1845; local41++) {
				local48 = this.anInt1835 * local41;
				for (local50 = 0; local50 < this.anInt1835; local50++) {
					local22[local50 + local48] = local22[local50 + local48] & 0xFFFFFF | (local15[local48 + local50] & 0x5EFF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local41 = 0; local41 < this.anInt1845; local41++) {
				local48 = this.anInt1835 * local41;
				for (local50 = 0; local50 < this.anInt1835; local50++) {
					local22[local48 + local50] = local22[local48 + local50] & 0xFFFFFF | (local15[local50 + local48] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method1613(0, 0, this.anInt1835, this.anInt1845, local22, this.anInt1835);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIII[III)V")
	private void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface26_1.method8057(arg3, arg0, arg1, arg5, arg2, arg4);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass87_Sub1_2.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1613(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class6_Sub2 local8 = this.aClass87_Sub1_2.method5129();
		@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_2.method5141();
		this.anInterface26_1.method8046(this.aBoolean157 || this.aBoolean155 ? Static159.aClass283_2 : Static494.aClass283_8);
		this.aClass87_Sub1_2.method5152();
		this.aClass87_Sub1_2.method5079(this.anInterface26_1);
		this.aClass87_Sub1_2.method5093(arg6);
		this.aClass87_Sub1_2.method5062(arg4);
		this.aClass87_Sub1_2.method5131(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5118(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5075(arg5);
		local13.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) this.anInt1845));
		if (this.aBoolean154) {
			arg2 = arg2 * this.anInt1835 / this.method4588();
			arg3 = this.anInt1845 * arg3 / this.method4576();
			arg1 += arg3 * this.anInt1837 / this.anInt1845;
			arg0 += this.anInt1839 * arg2 / this.anInt1835;
		}
		local8.method2717(0.0F, (float) arg2, (float) arg3);
		local8.method6694(arg0, arg1, 0);
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5022();
		this.aClass87_Sub1_2.method5120();
		this.aClass87_Sub1_2.method5127();
		this.aClass87_Sub1_2.method5131(1, Static508.aClass315_2);
		this.aClass87_Sub1_2.method5118(1, Static508.aClass315_2);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method4589(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class6_Sub2 local8 = this.aClass87_Sub1_2.method5129();
		@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_2.method5141();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface26 local19 = local16.anInterface26_5;
		this.anInterface26_1.method8046(this.aBoolean157 || this.aBoolean155 ? Static159.aClass283_2 : Static494.aClass283_8);
		this.aClass87_Sub1_2.method5152();
		this.aClass87_Sub1_2.method5079(this.anInterface26_1);
		this.aClass87_Sub1_2.method5093(1);
		this.aClass87_Sub1_2.method5062(1);
		if (this.aBoolean154) {
			@Pc(70) float local70 = (float) this.anInt1835 / (float) this.method4588();
			@Pc(78) float local78 = (float) this.anInt1845 / (float) this.method4576();
			local8.method2708(0.0F, (arg5 - arg1) * local78, (arg4 - arg0) * local78, (arg2 - arg0) * local70, 0.0F, 1.0F, 0.0F, local70 * (arg3 - arg1), 0.0F);
			local8.method2710(local78 * (arg1 + (float) this.anInt1837), ((float) this.anInt1839 + arg0) * local70, 0.0F);
		} else {
			local8.method2708(0.0F, arg5 - arg1, -arg0 + arg4, arg2 - arg0, 0.0F, 1.0F, 0.0F, arg3 - arg1, 0.0F);
			local8.method2710(arg1, arg0, 0.0F);
		}
		local13.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) this.anInt1845));
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5116(1);
		this.aClass87_Sub1_2.method5079(local19);
		this.aClass87_Sub1_2.method5133(Static40.aClass300_1, Static148.aClass300_3);
		this.aClass87_Sub1_2.method5131(0, Static508.aClass315_2);
		@Pc(207) Class6_Sub2 local207 = this.aClass87_Sub1_2.method5141();
		local207.method6695(local8);
		local207.method6694(-arg7, -arg8, 0);
		local207.method2716(local19.method8056(1.0F), local19.method8049(1.0F), 1.0F);
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5022();
		this.aClass87_Sub1_2.method5120();
		this.aClass87_Sub1_2.method5127();
		this.aClass87_Sub1_2.method5131(0, Static516.aClass315_3);
		this.aClass87_Sub1_2.method5133(Static40.aClass300_1, Static40.aClass300_1);
		this.aClass87_Sub1_2.method5079(null);
		this.aClass87_Sub1_2.method5116(0);
		this.aClass87_Sub1_2.method5127();
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "()I")
	@Override
	public int method4595() {
		return this.anInt1845;
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "()I")
	@Override
	public int method4588() {
		return this.anInt1835 + this.anInt1839 + this.anInt1847;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class6_Sub2 local10 = this.aClass87_Sub1_2.method5129();
		@Pc(15) Class6_Sub2 local15 = this.aClass87_Sub1_2.method5141();
		this.anInterface26_1.method8046(Static159.aClass283_2);
		this.aClass87_Sub1_2.method5152();
		this.aClass87_Sub1_2.method5079(this.anInterface26_1);
		this.aClass87_Sub1_2.method5093(arg6);
		this.aClass87_Sub1_2.method5062(arg4);
		this.aClass87_Sub1_2.method5131(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5118(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5075(arg5);
		@Pc(70) boolean local70 = this.aBoolean153 && this.anInt1837 == 0 && this.anInt1830 == 0;
		@Pc(86) boolean local86 = this.aBoolean156 && this.anInt1839 == 0 && this.anInt1847 == 0;
		if (local86 & local70) {
			local15.method2717(1.0F, this.anInterface26_1.method8056((float) arg2), this.anInterface26_1.method8049((float) arg3));
			local10.method2717(0.0F, (float) arg2, (float) arg3);
			local10.method6694(arg0, arg1, 0);
			this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
			this.aClass87_Sub1_2.method5022();
			this.aClass87_Sub1_2.method5120();
		} else {
			@Pc(96) int local96;
			@Pc(99) int local99;
			@Pc(127) int local127;
			@Pc(132) int local132;
			@Pc(179) int local179;
			if (local86) {
				local96 = arg3 + arg1;
				local99 = this.method4576();
				local15.method2717(1.0F, this.anInterface26_1.method8056((float) arg2), this.anInterface26_1.method8049((float) this.anInt1845));
				this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
				local127 = arg1 + this.anInt1837;
				local132 = this.anInt1845 + local127;
				while (local132 <= local96) {
					local10.method2717(0.0F, (float) arg2, (float) this.anInt1845);
					local10.method6694(arg0, local127, 0);
					this.aClass87_Sub1_2.method5022();
					this.aClass87_Sub1_2.method5120();
					local132 += local99;
					local127 += local99;
				}
				if (local96 > local127) {
					local179 = local96 - local127;
					local15.method2717(1.0F, this.anInterface26_1.method8056((float) arg2), this.anInterface26_1.method8049((float) local179));
					this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
					local10.method2717(0.0F, (float) arg2, (float) local179);
					local10.method6694(arg0, local127, 0);
					this.aClass87_Sub1_2.method5022();
					this.aClass87_Sub1_2.method5120();
				}
			} else if (local70) {
				local96 = arg2 + arg0;
				local99 = this.method4588();
				local15.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) arg3));
				this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
				local127 = this.anInt1839 + arg0;
				for (local132 = this.anInt1835 + local127; local132 <= local96; local132 += local99) {
					local10.method2717(0.0F, (float) this.anInt1835, (float) arg3);
					local10.method6694(local127, arg1, 0);
					this.aClass87_Sub1_2.method5022();
					this.aClass87_Sub1_2.method5120();
					local127 += local99;
				}
				if (local96 > local127) {
					local179 = local96 - local127;
					local15.method2717(1.0F, this.anInterface26_1.method8056((float) local179), this.anInterface26_1.method8049((float) arg3));
					this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
					local10.method2717(0.0F, (float) local179, (float) arg3);
					local10.method6694(local127, arg1, 0);
					this.aClass87_Sub1_2.method5022();
					this.aClass87_Sub1_2.method5120();
				}
			} else {
				local96 = arg1 + arg3;
				local99 = arg2 + arg0;
				local127 = this.method4588();
				local132 = this.method4576();
				local179 = arg1 + this.anInt1837;
				@Pc(250) int local250 = local179 + this.anInt1845;
				@Pc(280) int local280;
				@Pc(285) int local285;
				@Pc(332) int local332;
				while (local96 >= local250) {
					local15.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) this.anInt1845));
					this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
					local280 = arg0 + this.anInt1839;
					local285 = local280 + this.anInt1835;
					while (local99 >= local285) {
						local10.method2717(0.0F, (float) this.anInt1835, (float) this.anInt1845);
						local10.method6694(local280, local179, 0);
						this.aClass87_Sub1_2.method5022();
						local285 += local127;
						local280 += local127;
						this.aClass87_Sub1_2.method5120();
					}
					if (local280 < local99) {
						local332 = local99 - local280;
						local15.method2717(1.0F, this.anInterface26_1.method8056((float) local332), this.anInterface26_1.method8049((float) this.anInt1845));
						this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
						local10.method2717(0.0F, (float) local332, (float) this.anInt1845);
						local10.method6694(local280, local179, 0);
						this.aClass87_Sub1_2.method5022();
						this.aClass87_Sub1_2.method5120();
					}
					local250 += local132;
					local179 += local132;
				}
				if (local179 < local96) {
					local280 = local96 - local179;
					local15.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) local280));
					this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
					local285 = arg0 + this.anInt1839;
					local332 = local285 + this.anInt1835;
					while (local99 >= local332) {
						local10.method2717(0.0F, (float) this.anInt1835, (float) local280);
						local10.method6694(local285, local179, 0);
						this.aClass87_Sub1_2.method5022();
						local332 += local127;
						this.aClass87_Sub1_2.method5120();
						local285 += local127;
					}
					if (local99 > local285) {
						@Pc(486) int local486 = local99 - local285;
						local15.method2717(1.0F, this.anInterface26_1.method8056((float) local486), this.anInterface26_1.method8049((float) local280));
						this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
						local10.method2717(0.0F, (float) local486, (float) local280);
						local10.method6694(local285, local179, 0);
						this.aClass87_Sub1_2.method5022();
						this.aClass87_Sub1_2.method5120();
					}
				}
			}
		}
		this.aClass87_Sub1_2.method5127();
		this.aClass87_Sub1_2.method5131(1, Static508.aClass315_2);
		this.aClass87_Sub1_2.method5118(1, Static508.aClass315_2);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "()I")
	@Override
	public int method4576() {
		return this.anInt1830 + this.anInt1837 + this.anInt1845;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method4590(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class6_Sub2 local8 = this.aClass87_Sub1_2.method5129();
		@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_2.method5141();
		this.anInterface26_1.method8046(this.aBoolean157 || this.aBoolean155 ? Static159.aClass283_2 : Static494.aClass283_8);
		this.aClass87_Sub1_2.method5152();
		this.aClass87_Sub1_2.method5079(this.anInterface26_1);
		this.aClass87_Sub1_2.method5093(1);
		this.aClass87_Sub1_2.method5062(arg6);
		this.aClass87_Sub1_2.method5131(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5118(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5075(arg7);
		if (this.aBoolean154) {
			@Pc(74) float local74 = (float) this.method4588();
			@Pc(78) float local78 = (float) this.method4576();
			@Pc(84) float local84 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(98) float local98 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = local98 * (float) this.anInt1837;
			@Pc(116) float local116 = (float) this.anInt1837 * local104;
			@Pc(122) float local122 = local84 * (float) this.anInt1839;
			@Pc(128) float local128 = local91 * (float) this.anInt1839;
			@Pc(135) float local135 = (float) this.anInt1847 * -local84;
			@Pc(142) float local142 = -local91 * (float) this.anInt1847;
			@Pc(149) float local149 = (float) this.anInt1830 * -local98;
			arg2 = local110 + local135 + arg2;
			@Pc(162) float local162 = -local104 * (float) this.anInt1830;
			arg3 = local142 + arg3 + local116;
			arg4 = arg4 + local122 + local149;
			arg1 = local116 + arg1 + local128;
			arg0 = local122 + arg0 + local110;
			arg5 = local128 + arg5 + local162;
		}
		local8.method2708(0.0F, arg5 - arg1, arg4 - arg0, arg2 - arg0, 0.0F, 1.0F, 0.0F, arg3 - arg1, 0.0F);
		local8.method2710(arg1, arg0, 0.0F);
		local13.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) this.anInt1845));
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5022();
		this.aClass87_Sub1_2.method5120();
		this.aClass87_Sub1_2.method5127();
		this.aClass87_Sub1_2.method5131(1, Static508.aClass315_2);
		this.aClass87_Sub1_2.method5118(1, Static508.aClass315_2);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1837 = arg1;
		this.anInt1830 = arg3;
		this.anInt1847 = arg2;
		this.anInt1839 = arg0;
		this.aBoolean154 = this.anInt1839 != 0 || this.anInt1837 != 0 || this.anInt1847 != 0 || this.anInt1830 != 0;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "()I")
	@Override
	public int method4579() {
		return this.anInt1835;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Interface26 local9 = local6.anInterface26_5;
		@Pc(14) int local14 = arg0 + this.anInt1839;
		@Pc(19) int local19 = arg1 + this.anInt1837;
		this.anInterface26_1.method8046(Static159.aClass283_2);
		this.aClass87_Sub1_2.method5152();
		this.aClass87_Sub1_2.method5079(this.anInterface26_1);
		this.aClass87_Sub1_2.method5093(1);
		this.aClass87_Sub1_2.method5062(1);
		@Pc(49) Class6_Sub2 local49 = this.aClass87_Sub1_2.method5129();
		local49.method2717(0.0F, (float) this.anInt1835, (float) this.anInt1845);
		local49.method6694(local14, local19, 0);
		this.aClass87_Sub1_2.method5022();
		@Pc(73) Class6_Sub2 local73 = this.aClass87_Sub1_2.method5141();
		local73.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) this.anInt1845));
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5116(1);
		this.aClass87_Sub1_2.method5079(local9);
		this.aClass87_Sub1_2.method5133(Static40.aClass300_1, Static148.aClass300_3);
		this.aClass87_Sub1_2.method5131(0, Static508.aClass315_2);
		@Pc(123) Class6_Sub2 local123 = this.aClass87_Sub1_2.method5141();
		local123.method2717(1.0F, local9.method8056((float) this.anInt1835), local9.method8049((float) this.anInt1845));
		local123.method2710(local9.method8049((float) (local19 - arg4)), local9.method8056((float) (local14 - arg3)), 0.0F);
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5120();
		this.aClass87_Sub1_2.method5127();
		this.aClass87_Sub1_2.method5131(0, Static516.aClass315_3);
		this.aClass87_Sub1_2.method5133(Static40.aClass300_1, Static40.aClass300_1);
		this.aClass87_Sub1_2.method5079(null);
		this.aClass87_Sub1_2.method5116(0);
		this.aClass87_Sub1_2.method5127();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class6_Sub2 local8 = this.aClass87_Sub1_2.method5129();
		@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_2.method5141();
		@Pc(18) int local18 = arg0 + this.anInt1839;
		@Pc(23) int local23 = arg1 + this.anInt1837;
		this.anInterface26_1.method8046(Static159.aClass283_2);
		this.aClass87_Sub1_2.method5152();
		this.aClass87_Sub1_2.method5079(this.anInterface26_1);
		this.aClass87_Sub1_2.method5093(arg4);
		this.aClass87_Sub1_2.method5062(arg2);
		this.aClass87_Sub1_2.method5131(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5118(1, Static358.aClass315_1);
		this.aClass87_Sub1_2.method5075(arg3);
		local8.method2717(0.0F, (float) this.anInt1835, (float) this.anInt1845);
		local8.method6694(local18, local23, 0);
		local13.method2717(1.0F, this.anInterface26_1.method8056((float) this.anInt1835), this.anInterface26_1.method8049((float) this.anInt1845));
		this.aClass87_Sub1_2.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_2.method5022();
		this.aClass87_Sub1_2.method5120();
		this.aClass87_Sub1_2.method5127();
		this.aClass87_Sub1_2.method5131(1, Static508.aClass315_2);
		this.aClass87_Sub1_2.method5118(1, Static508.aClass315_2);
	}
}
