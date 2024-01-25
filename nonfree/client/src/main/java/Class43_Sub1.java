import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!bka", name = "e", descriptor = "I")
	private int anInt889 = 0;

	@OriginalMember(owner = "client!bka", name = "w", descriptor = "I")
	private int anInt891 = 0;

	@OriginalMember(owner = "client!bka", name = "B", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!bka", name = "F", descriptor = "I")
	private int anInt883 = 0;

	@OriginalMember(owner = "client!bka", name = "q", descriptor = "I")
	private int anInt894 = 0;

	@OriginalMember(owner = "client!bka", name = "j", descriptor = "I")
	private final int anInt888;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "I")
	private final int anInt890;

	@OriginalMember(owner = "client!bka", name = "z", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_4;

	@OriginalMember(owner = "client!bka", name = "v", descriptor = "Lclient!de;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!bka", name = "C", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!bka", name = "x", descriptor = "Z")
	private final boolean aBoolean111;

	@OriginalMember(owner = "client!bka", name = "i", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Z")
	private final boolean aBoolean110;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!lb;IIZ)V")
	public Class43_Sub1(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt888 = arg1;
		this.anInt890 = arg2;
		this.aClass145_Sub1_4 = arg0;
		this.anInterface4_1 = arg0.method9782(arg3 ? Static165.aClass295_6 : Static261.aClass295_16, arg1, Static243.aClass158_10, arg2);
		this.anInterface4_1.method6853(true, true);
		this.aBoolean108 = arg1 != this.anInterface4_1.method6858();
		this.aBoolean111 = this.anInterface4_1.method6852() != arg2;
		this.aBoolean112 = !this.aBoolean108 && this.anInterface4_1.method6860();
		this.aBoolean110 = !this.aBoolean111 && this.anInterface4_1.method6860();
	}

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!lb;II[III)V")
	public Class43_Sub1(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt890 = arg2;
		this.anInt888 = arg1;
		this.aClass145_Sub1_4 = arg0;
		this.anInterface4_1 = arg0.method9802(arg2, arg1, arg4, arg5, arg3, false);
		this.anInterface4_1.method6853(true, true);
		this.aBoolean108 = this.anInterface4_1.method6858() != arg1;
		this.aBoolean111 = arg2 != this.anInterface4_1.method6852();
		this.aBoolean112 = !this.aBoolean108 && this.anInterface4_1.method6860();
		this.aBoolean110 = !this.aBoolean111 && this.anInterface4_1.method6860();
	}

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "()I")
	@Override
	public int method9587() {
		return this.anInt889 + this.anInt888 + this.anInt891;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method9591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class86_Sub2 local8 = this.aClass145_Sub1_4.method9835();
		@Pc(13) Class86_Sub2 local13 = this.aClass145_Sub1_4.method9821();
		this.anInterface4_1.method8448(this.aBoolean108 || this.aBoolean111 || !(true & true) ? Static517.aClass400_29 : Static610.aClass400_36);
		this.aClass145_Sub1_4.method9816();
		this.aClass145_Sub1_4.method9754(this.anInterface4_1);
		this.aClass145_Sub1_4.method9832(arg6);
		this.aClass145_Sub1_4.method9797(arg4);
		this.aClass145_Sub1_4.method9813(Static45.aClass352_1, 1);
		this.aClass145_Sub1_4.method9795(1, Static45.aClass352_1);
		this.aClass145_Sub1_4.method9769(arg5);
		local13.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
		if (this.aBoolean109) {
			arg2 = this.anInt888 * arg2 / this.method9587();
			arg3 = arg3 * this.anInt890 / this.method9600();
			arg1 += this.anInt883 * arg3 / this.anInt890;
			arg0 += this.anInt889 * arg2 / this.anInt888;
		}
		local8.method2718((float) arg3, (float) arg2, 0.0F);
		local8.method7020(arg0, arg1, 0);
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9786();
		this.aClass145_Sub1_4.method9738();
		this.aClass145_Sub1_4.method9837();
		this.aClass145_Sub1_4.method9813(Static240.aClass352_6, 1);
		this.aClass145_Sub1_4.method9795(1, Static240.aClass352_6);
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "()I")
	@Override
	public int method9600() {
		return this.anInt883 + this.anInt890 + this.anInt894;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIII[III)V")
	private void method808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface4_1.method6855(arg0, arg1, arg5, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(IIII)V")
	@Override
	public void method9586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt883 = arg1;
		this.anInt891 = arg2;
		this.anInt894 = arg3;
		this.anInt889 = arg0;
		this.aBoolean109 = this.anInt889 != 0 || this.anInt883 != 0 || this.anInt891 != 0 || this.anInt894 != 0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(III)V")
	@Override
	public void method9598() {
		@Pc(15) int[] local15 = this.aClass145_Sub1_4.na(0, 0, this.anInt888, this.anInt890);
		@Pc(22) int[] local22 = new int[this.anInt888 * this.anInt890];
		this.anInterface4_1.method6859(this.anInt890, local22, this.anInt888);
		for (@Pc(120) int local120 = 0; local120 < this.anInt890; local120++) {
			@Pc(127) int local127 = this.anInt888 * local120;
			for (@Pc(129) int local129 = 0; local129 < this.anInt888; local129++) {
				local22[local127 + local129] = local22[local127 + local129] & 0xFFFFFF | (local15[local127 + local129] == 0 ? 0 : -16777216);
			}
		}
		this.method808(0, 0, this.anInt888, this.anInt890, local22, this.anInt888);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method9585(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class86_Sub2 local8 = this.aClass145_Sub1_4.method9835();
		@Pc(13) Class86_Sub2 local13 = this.aClass145_Sub1_4.method9821();
		this.anInterface4_1.method8448(this.aBoolean108 || this.aBoolean111 || (0x1 & 0x1) == 0 ? Static517.aClass400_29 : Static610.aClass400_36);
		this.aClass145_Sub1_4.method9816();
		this.aClass145_Sub1_4.method9754(this.anInterface4_1);
		this.aClass145_Sub1_4.method9832(1);
		this.aClass145_Sub1_4.method9797(arg6);
		this.aClass145_Sub1_4.method9813(Static45.aClass352_1, 1);
		this.aClass145_Sub1_4.method9795(1, Static45.aClass352_1);
		this.aClass145_Sub1_4.method9769(arg7);
		if (this.aBoolean109) {
			@Pc(82) float local82 = (float) this.method9587();
			@Pc(86) float local86 = (float) this.method9600();
			@Pc(93) float local93 = (arg2 - arg0) / local82;
			@Pc(99) float local99 = (arg3 - arg1) / local82;
			@Pc(106) float local106 = (arg4 - arg0) / local86;
			@Pc(113) float local113 = (arg5 - arg1) / local86;
			@Pc(119) float local119 = local106 * (float) this.anInt883;
			@Pc(125) float local125 = local113 * (float) this.anInt883;
			@Pc(131) float local131 = local93 * (float) this.anInt889;
			@Pc(137) float local137 = (float) this.anInt889 * local99;
			@Pc(144) float local144 = -local93 * (float) this.anInt891;
			@Pc(151) float local151 = (float) this.anInt891 * -local99;
			@Pc(158) float local158 = (float) this.anInt894 * -local106;
			arg3 = local125 + arg3 + local151;
			@Pc(171) float local171 = -local113 * (float) this.anInt894;
			arg2 = local119 + arg2 + local144;
			arg4 = local131 + arg4 + local158;
			arg1 = local125 + local137 + arg1;
			arg0 = local119 + local131 + arg0;
			arg5 = arg5 + local137 + local171;
		}
		local8.method2735(0.0F, arg4 - arg0, 1.0F, arg3 - arg1, 0.0F, 0.0F, 0.0F, arg2 - arg0, -arg1 + arg5);
		local8.method2720(0.0F, arg1, arg0);
		local13.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9786();
		this.aClass145_Sub1_4.method9738();
		this.aClass145_Sub1_4.method9837();
		this.aClass145_Sub1_4.method9813(Static240.aClass352_6, 1);
		this.aClass145_Sub1_4.method9795(1, Static240.aClass352_6);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method9606(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class86_Sub2 local8 = this.aClass145_Sub1_4.method9835();
		@Pc(13) Class86_Sub2 local13 = this.aClass145_Sub1_4.method9821();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface4 local19 = local16.anInterface4_4;
		this.anInterface4_1.method8448(this.aBoolean108 || this.aBoolean111 || (0x1 & 0x1) == 0 ? Static517.aClass400_29 : Static610.aClass400_36);
		this.aClass145_Sub1_4.method9816();
		this.aClass145_Sub1_4.method9754(this.anInterface4_1);
		this.aClass145_Sub1_4.method9832(1);
		this.aClass145_Sub1_4.method9797(1);
		if (this.aBoolean109) {
			@Pc(107) float local107 = (float) this.anInt888 / (float) this.method9587();
			@Pc(115) float local115 = (float) this.anInt890 / (float) this.method9600();
			local8.method2735(0.0F, (arg4 - arg0) * local115, 1.0F, local107 * (arg3 - arg1), 0.0F, 0.0F, 0.0F, (arg2 - arg0) * local107, (arg5 - arg1) * local115);
			local8.method2720(0.0F, local115 * (arg1 + (float) this.anInt883), ((float) this.anInt889 + arg0) * local107);
		} else {
			local8.method2735(0.0F, arg4 - arg0, 1.0F, arg3 - arg1, 0.0F, 0.0F, 0.0F, arg2 - arg0, -arg1 + arg5);
			local8.method2720(0.0F, arg1, arg0);
		}
		local13.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9745(1);
		this.aClass145_Sub1_4.method9754(local19);
		this.aClass145_Sub1_4.method9725(Static162.aClass293_4, Static105.aClass293_3);
		this.aClass145_Sub1_4.method9813(Static240.aClass352_6, 0);
		@Pc(214) Class86_Sub2 local214 = this.aClass145_Sub1_4.method9821();
		local214.method7032(local8);
		local214.method7020(-arg7, -arg8, 0);
		local214.method2717(1.0F, local19.method6857(1.0F), local19.method6856(1.0F));
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9786();
		this.aClass145_Sub1_4.method9738();
		this.aClass145_Sub1_4.method9837();
		this.aClass145_Sub1_4.method9813(Static231.aClass352_5, 0);
		this.aClass145_Sub1_4.method9725(Static105.aClass293_3, Static105.aClass293_3);
		this.aClass145_Sub1_4.method9754((Interface9) null);
		this.aClass145_Sub1_4.method9745(0);
		this.aClass145_Sub1_4.method9837();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass145_Sub1_4.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method808(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class86_Sub2 local10 = this.aClass145_Sub1_4.method9835();
		@Pc(15) Class86_Sub2 local15 = this.aClass145_Sub1_4.method9821();
		this.anInterface4_1.method8448(Static517.aClass400_29);
		this.aClass145_Sub1_4.method9816();
		this.aClass145_Sub1_4.method9754(this.anInterface4_1);
		this.aClass145_Sub1_4.method9832(arg6);
		this.aClass145_Sub1_4.method9797(arg4);
		this.aClass145_Sub1_4.method9813(Static45.aClass352_1, 1);
		this.aClass145_Sub1_4.method9795(1, Static45.aClass352_1);
		this.aClass145_Sub1_4.method9769(arg5);
		@Pc(75) boolean local75 = this.aBoolean110 && this.anInt883 == 0 && this.anInt894 == 0;
		@Pc(96) boolean local96 = this.aBoolean112 && this.anInt889 == 0 && this.anInt891 == 0;
		if (local96 & local75) {
			local15.method2718(this.anInterface4_1.method6857((float) arg3), this.anInterface4_1.method6856((float) arg2), 1.0F);
			local10.method2718((float) arg3, (float) arg2, 0.0F);
			local10.method7020(arg0, arg1, 0);
			this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
			this.aClass145_Sub1_4.method9786();
			this.aClass145_Sub1_4.method9738();
		} else {
			@Pc(112) int local112;
			@Pc(116) int local116;
			@Pc(119) int local119;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local96) {
				local112 = arg1 + arg3;
				local116 = this.method9600();
				local15.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) arg2), 1.0F);
				this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
				local119 = this.anInt883 + arg1;
				for (local122 = this.anInt890 + local119; local122 <= local112; local122 += local116) {
					local10.method2718((float) this.anInt890, (float) arg2, 0.0F);
					local10.method7020(arg0, local119, 0);
					this.aClass145_Sub1_4.method9786();
					this.aClass145_Sub1_4.method9738();
					local119 += local116;
				}
				if (local112 > local119) {
					local127 = local112 - local119;
					local15.method2718(this.anInterface4_1.method6857((float) local127), this.anInterface4_1.method6856((float) arg2), 1.0F);
					this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
					local10.method2718((float) local127, (float) arg2, 0.0F);
					local10.method7020(arg0, local119, 0);
					this.aClass145_Sub1_4.method9786();
					this.aClass145_Sub1_4.method9738();
				}
			} else if (local75) {
				local112 = arg0 + arg2;
				local116 = this.method9587();
				local15.method2718(this.anInterface4_1.method6857((float) arg3), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
				this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
				local119 = arg0 + this.anInt889;
				for (local122 = local119 + this.anInt888; local122 <= local112; local122 += local116) {
					local10.method2718((float) arg3, (float) this.anInt888, 0.0F);
					local10.method7020(local119, arg1, 0);
					this.aClass145_Sub1_4.method9786();
					local119 += local116;
					this.aClass145_Sub1_4.method9738();
				}
				if (local112 > local119) {
					local127 = local112 - local119;
					local15.method2718(this.anInterface4_1.method6857((float) arg3), this.anInterface4_1.method6856((float) local127), 1.0F);
					this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
					local10.method2718((float) arg3, (float) local127, 0.0F);
					local10.method7020(local119, arg1, 0);
					this.aClass145_Sub1_4.method9786();
					this.aClass145_Sub1_4.method9738();
				}
			} else {
				local112 = arg3 + arg1;
				local116 = arg2 + arg0;
				local119 = this.method9587();
				local122 = this.method9600();
				local127 = this.anInt883 + arg1;
				@Pc(164) int local164;
				@Pc(169) int local169;
				@Pc(225) int local225;
				for (@Pc(132) int local132 = local127 + this.anInt890; local132 <= local112; local132 += local122) {
					local15.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
					this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
					local164 = this.anInt889 + arg0;
					for (local169 = local164 + this.anInt888; local169 <= local116; local169 += local119) {
						local10.method2718((float) this.anInt890, (float) this.anInt888, 0.0F);
						local10.method7020(local164, local127, 0);
						this.aClass145_Sub1_4.method9786();
						this.aClass145_Sub1_4.method9738();
						local164 += local119;
					}
					if (local164 < local116) {
						local225 = local116 - local164;
						local15.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) local225), 1.0F);
						this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
						local10.method2718((float) this.anInt890, (float) local225, 0.0F);
						local10.method7020(local164, local127, 0);
						this.aClass145_Sub1_4.method9786();
						this.aClass145_Sub1_4.method9738();
					}
					local127 += local122;
				}
				if (local127 < local112) {
					local164 = local112 - local127;
					local15.method2718(this.anInterface4_1.method6857((float) local164), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
					this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
					local169 = arg0 + this.anInt889;
					for (local225 = this.anInt888 + local169; local225 <= local116; local225 += local119) {
						local10.method2718((float) local164, (float) this.anInt888, 0.0F);
						local10.method7020(local169, local127, 0);
						this.aClass145_Sub1_4.method9786();
						this.aClass145_Sub1_4.method9738();
						local169 += local119;
					}
					if (local169 < local116) {
						@Pc(377) int local377 = local116 - local169;
						local15.method2718(this.anInterface4_1.method6857((float) local164), this.anInterface4_1.method6856((float) local377), 1.0F);
						this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
						local10.method2718((float) local164, (float) local377, 0.0F);
						local10.method7020(local169, local127, 0);
						this.aClass145_Sub1_4.method9786();
						this.aClass145_Sub1_4.method9738();
					}
				}
			}
		}
		this.aClass145_Sub1_4.method9837();
		this.aClass145_Sub1_4.method9813(Static240.aClass352_6, 1);
		this.aClass145_Sub1_4.method9795(1, Static240.aClass352_6);
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "()I")
	@Override
	public int method9592() {
		return this.anInt890;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "([I)V")
	@Override
	public void method9599(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt894;
		arg0[0] = this.anInt889;
		arg0[2] = this.anInt891;
		arg0[1] = this.anInt883;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method9583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class86_Sub2 local8 = this.aClass145_Sub1_4.method9835();
		@Pc(13) Class86_Sub2 local13 = this.aClass145_Sub1_4.method9821();
		@Pc(18) int local18 = arg1 + this.anInt883;
		@Pc(23) int local23 = arg0 + this.anInt889;
		this.anInterface4_1.method8448(Static517.aClass400_29);
		this.aClass145_Sub1_4.method9816();
		this.aClass145_Sub1_4.method9754(this.anInterface4_1);
		this.aClass145_Sub1_4.method9832(arg4);
		this.aClass145_Sub1_4.method9797(arg2);
		this.aClass145_Sub1_4.method9813(Static45.aClass352_1, 1);
		this.aClass145_Sub1_4.method9795(1, Static45.aClass352_1);
		this.aClass145_Sub1_4.method9769(arg3);
		local8.method2718((float) this.anInt890, (float) this.anInt888, 0.0F);
		local8.method7020(local23, local18, 0);
		local13.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9786();
		this.aClass145_Sub1_4.method9738();
		this.aClass145_Sub1_4.method9837();
		this.aClass145_Sub1_4.method9813(Static240.aClass352_6, 1);
		this.aClass145_Sub1_4.method9795(1, Static240.aClass352_6);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method9593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Interface4 local9 = local6.anInterface4_4;
		@Pc(14) int local14 = arg1 + this.anInt883;
		@Pc(19) int local19 = arg0 + this.anInt889;
		this.anInterface4_1.method8448(Static517.aClass400_29);
		this.aClass145_Sub1_4.method9816();
		this.aClass145_Sub1_4.method9754(this.anInterface4_1);
		this.aClass145_Sub1_4.method9832(1);
		this.aClass145_Sub1_4.method9797(1);
		@Pc(49) Class86_Sub2 local49 = this.aClass145_Sub1_4.method9835();
		local49.method2718((float) this.anInt890, (float) this.anInt888, 0.0F);
		local49.method7020(local19, local14, 0);
		this.aClass145_Sub1_4.method9786();
		@Pc(73) Class86_Sub2 local73 = this.aClass145_Sub1_4.method9821();
		local73.method2718(this.anInterface4_1.method6857((float) this.anInt890), this.anInterface4_1.method6856((float) this.anInt888), 1.0F);
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9745(1);
		this.aClass145_Sub1_4.method9754(local9);
		this.aClass145_Sub1_4.method9725(Static162.aClass293_4, Static105.aClass293_3);
		this.aClass145_Sub1_4.method9813(Static240.aClass352_6, 0);
		@Pc(123) Class86_Sub2 local123 = this.aClass145_Sub1_4.method9821();
		local123.method2718(local9.method6857((float) this.anInt890), local9.method6856((float) this.anInt888), 1.0F);
		local123.method2720(0.0F, local9.method6857((float) (local14 - arg4)), local9.method6856((float) (local19 - arg3)));
		this.aClass145_Sub1_4.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_4.method9738();
		this.aClass145_Sub1_4.method9837();
		this.aClass145_Sub1_4.method9813(Static231.aClass352_5, 0);
		this.aClass145_Sub1_4.method9725(Static105.aClass293_3, Static105.aClass293_3);
		this.aClass145_Sub1_4.method9754((Interface9) null);
		this.aClass145_Sub1_4.method9745(0);
		this.aClass145_Sub1_4.method9837();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "()I")
	@Override
	public int method9601() {
		return this.anInt888;
	}
}
