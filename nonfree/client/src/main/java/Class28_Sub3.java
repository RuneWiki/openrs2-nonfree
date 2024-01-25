import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private int anInt2319 = 0;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	private int anInt2331 = 0;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "I")
	private int anInt2336 = 0;

	@OriginalMember(owner = "client!el", name = "H", descriptor = "I")
	private int anInt2342 = 0;

	@OriginalMember(owner = "client!el", name = "E", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_4;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	private final int anInt2324;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	private final int anInt2330;

	@OriginalMember(owner = "client!el", name = "C", descriptor = "Lclient!rm;")
	private final Interface20 anInterface20_1;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "Z")
	private final boolean aBoolean171;

	@OriginalMember(owner = "client!el", name = "F", descriptor = "Z")
	private final boolean aBoolean172;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
	private final boolean aBoolean168;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!pj;IIZ)V")
	public Class28_Sub3(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass133_Sub1_4 = arg0;
		this.anInt2324 = arg1;
		this.anInt2330 = arg2;
		this.anInterface20_1 = arg0.method6275(arg3 ? Static576.aClass223_16 : Static20.aClass223_3, arg1, Static20.aClass19_4, arg2);
		this.anInterface20_1.method4639(true, true);
		this.aBoolean171 = this.anInterface20_1.method4637() != arg1;
		this.aBoolean172 = arg2 != this.anInterface20_1.method4636();
		this.aBoolean168 = !this.aBoolean171 && this.anInterface20_1.method4642();
		this.aBoolean170 = !this.aBoolean172 && this.anInterface20_1.method4642();
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!pj;II[III)V")
	public Class28_Sub3(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2324 = arg1;
		this.aClass133_Sub1_4 = arg0;
		this.anInt2330 = arg2;
		this.anInterface20_1 = arg0.method6269(arg5, arg2, arg4, arg3, arg1, false);
		this.anInterface20_1.method4639(true, true);
		this.aBoolean171 = arg1 != this.anInterface20_1.method4637();
		this.aBoolean172 = arg2 != this.anInterface20_1.method4636();
		this.aBoolean168 = !this.aBoolean171 && this.anInterface20_1.method4642();
		this.aBoolean170 = !this.aBoolean172 && this.anInterface20_1.method4642();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([I)V")
	@Override
	public void method4044(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2342;
		arg0[3] = this.anInt2331;
		arg0[2] = this.anInt2336;
		arg0[1] = this.anInt2319;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	@Override
	public void method4050(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass133_Sub1_4.na(0, 0, this.anInt2324, this.anInt2330);
		@Pc(22) int[] local22 = new int[this.anInt2324 * this.anInt2330];
		this.anInterface20_1.method4643(this.anInt2324, local22, this.anInt2330);
		@Pc(158) int local158;
		@Pc(165) int local165;
		@Pc(167) int local167;
		if (arg0 == 0) {
			for (local158 = 0; local158 < this.anInt2330; local158++) {
				local165 = this.anInt2324 * local158;
				for (local167 = 0; local167 < this.anInt2324; local167++) {
					local22[local167 + local165] = (local15[local167 + local165] & 0xE6FF0000) << 8 | local22[local165 + local167] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local158 = 0; local158 < this.anInt2330; local158++) {
				local165 = this.anInt2324 * local158;
				for (local167 = 0; local167 < this.anInt2324; local167++) {
					local22[local167 + local165] = (local15[local165 + local167] == 0 ? 0 : -16777216) | local22[local165 + local167] & 0xFFFFFF;
				}
			}
		}
		this.method1946(0, 0, this.anInt2324, this.anInt2330, local22, this.anInt2324);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII[III)V")
	private void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface20_1.method4635(arg5, arg4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass133_Sub1_4.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1946(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method4038(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class113_Sub1 local8 = this.aClass133_Sub1_4.method6284();
		@Pc(13) Class113_Sub1 local13 = this.aClass133_Sub1_4.method6183();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface20 local19 = local16.anInterface20_6;
		this.anInterface20_1.method7905(this.aBoolean171 || this.aBoolean172 ? Static197.aClass116_15 : Static415.aClass116_12);
		this.aClass133_Sub1_4.method6176();
		this.aClass133_Sub1_4.method6153(this.anInterface20_1);
		this.aClass133_Sub1_4.method6208(1);
		this.aClass133_Sub1_4.method6268(1);
		if (this.aBoolean169) {
			@Pc(67) float local67 = (float) this.anInt2324 / (float) this.method4035();
			@Pc(75) float local75 = (float) this.anInt2330 / (float) this.method4042();
			local8.method2476(local67 * (arg3 - arg1), 0.0F, (arg2 - arg0) * local67, 0.0F, 0.0F, 1.0F, (arg4 - arg0) * local75, local75 * (arg5 - arg1), 0.0F);
			local8.method2467(local75 * (arg1 + (float) this.anInt2319), 0.0F, ((float) this.anInt2342 + arg0) * local67);
		} else {
			local8.method2476(arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 1.0F, arg4 - arg0, -arg1 + arg5, 0.0F);
			local8.method2467(arg1, 0.0F, arg0);
		}
		local13.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6271(1);
		this.aClass133_Sub1_4.method6153(local19);
		this.aClass133_Sub1_4.method6239(Static481.aClass151_8, Static524.aClass151_11);
		this.aClass133_Sub1_4.method6211(Static229.aClass236_2, 0);
		@Pc(201) Class113_Sub1 local201 = this.aClass133_Sub1_4.method6183();
		local201.method8456(local8);
		local201.method8454(-arg7, -arg8, 0);
		local201.method2474(local19.method4641(1.0F), local19.method4640(1.0F), 1.0F);
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6204();
		this.aClass133_Sub1_4.method6163();
		this.aClass133_Sub1_4.method6172();
		this.aClass133_Sub1_4.method6211(Static626.aClass236_6, 0);
		this.aClass133_Sub1_4.method6239(Static524.aClass151_11, Static524.aClass151_11);
		this.aClass133_Sub1_4.method6153(null);
		this.aClass133_Sub1_4.method6271(0);
		this.aClass133_Sub1_4.method6172();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class113_Sub1 local8 = this.aClass133_Sub1_4.method6284();
		@Pc(13) Class113_Sub1 local13 = this.aClass133_Sub1_4.method6183();
		this.anInterface20_1.method7905(this.aBoolean171 || this.aBoolean172 ? Static197.aClass116_15 : Static415.aClass116_12);
		this.aClass133_Sub1_4.method6176();
		this.aClass133_Sub1_4.method6153(this.anInterface20_1);
		this.aClass133_Sub1_4.method6208(arg6);
		this.aClass133_Sub1_4.method6268(arg4);
		this.aClass133_Sub1_4.method6211(Static105.aClass236_1, 1);
		this.aClass133_Sub1_4.method6159(1, Static105.aClass236_1);
		this.aClass133_Sub1_4.method6160(arg5);
		local13.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
		if (this.aBoolean169) {
			arg2 = this.anInt2324 * arg2 / this.method4035();
			arg3 = this.anInt2330 * arg3 / this.method4042();
			arg1 += this.anInt2319 * arg3 / this.anInt2330;
			arg0 += arg2 * this.anInt2342 / this.anInt2324;
		}
		local8.method2456((float) arg3, 0.0F, (float) arg2);
		local8.method8454(arg0, arg1, 0);
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6204();
		this.aClass133_Sub1_4.method6163();
		this.aClass133_Sub1_4.method6172();
		this.aClass133_Sub1_4.method6211(Static229.aClass236_2, 1);
		this.aClass133_Sub1_4.method6159(1, Static229.aClass236_2);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2336 = arg2;
		this.anInt2319 = arg1;
		this.anInt2331 = arg3;
		this.anInt2342 = arg0;
		this.aBoolean169 = this.anInt2342 != 0 || this.anInt2319 != 0 || this.anInt2336 != 0 || this.anInt2331 != 0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()I")
	@Override
	public int method4032() {
		return this.anInt2324;
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "()I")
	@Override
	public int method4042() {
		return this.anInt2330 + this.anInt2319 + this.anInt2331;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class113_Sub1 local10 = this.aClass133_Sub1_4.method6284();
		@Pc(15) Class113_Sub1 local15 = this.aClass133_Sub1_4.method6183();
		this.anInterface20_1.method7905(Static197.aClass116_15);
		this.aClass133_Sub1_4.method6176();
		this.aClass133_Sub1_4.method6153(this.anInterface20_1);
		this.aClass133_Sub1_4.method6208(arg6);
		this.aClass133_Sub1_4.method6268(arg4);
		this.aClass133_Sub1_4.method6211(Static105.aClass236_1, 1);
		this.aClass133_Sub1_4.method6159(1, Static105.aClass236_1);
		this.aClass133_Sub1_4.method6160(arg5);
		@Pc(70) boolean local70 = this.aBoolean170 && this.anInt2319 == 0 && this.anInt2331 == 0;
		@Pc(83) boolean local83 = this.aBoolean168 && this.anInt2342 == 0 && this.anInt2336 == 0;
		if (local70 & local83) {
			local15.method2456(this.anInterface20_1.method4641((float) arg3), 1.0F, this.anInterface20_1.method4640((float) arg2));
			local10.method2456((float) arg3, 0.0F, (float) arg2);
			local10.method8454(arg0, arg1, 0);
			this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
			this.aClass133_Sub1_4.method6204();
			this.aClass133_Sub1_4.method6163();
		} else {
			@Pc(139) int local139;
			@Pc(142) int local142;
			@Pc(169) int local169;
			@Pc(174) int local174;
			@Pc(225) int local225;
			if (local83) {
				local139 = arg1 + arg3;
				local142 = this.method4042();
				local15.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) arg2));
				this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
				local169 = arg1 + this.anInt2319;
				for (local174 = local169 + this.anInt2330; local174 <= local139; local174 += local142) {
					local10.method2456((float) this.anInt2330, 0.0F, (float) arg2);
					local10.method8454(arg0, local169, 0);
					this.aClass133_Sub1_4.method6204();
					this.aClass133_Sub1_4.method6163();
					local169 += local142;
				}
				if (local139 > local169) {
					local225 = local139 - local169;
					local15.method2456(this.anInterface20_1.method4641((float) local225), 1.0F, this.anInterface20_1.method4640((float) arg2));
					this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
					local10.method2456((float) local225, 0.0F, (float) arg2);
					local10.method8454(arg0, local169, 0);
					this.aClass133_Sub1_4.method6204();
					this.aClass133_Sub1_4.method6163();
				}
			} else if (local70) {
				local139 = arg0 + arg2;
				local142 = this.method4035();
				local15.method2456(this.anInterface20_1.method4641((float) arg3), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
				this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
				local169 = this.anInt2342 + arg0;
				local174 = local169 + this.anInt2324;
				while (local174 <= local139) {
					local10.method2456((float) arg3, 0.0F, (float) this.anInt2324);
					local10.method8454(local169, arg1, 0);
					this.aClass133_Sub1_4.method6204();
					this.aClass133_Sub1_4.method6163();
					local174 += local142;
					local169 += local142;
				}
				if (local169 < local139) {
					local225 = local139 - local169;
					local15.method2456(this.anInterface20_1.method4641((float) arg3), 1.0F, this.anInterface20_1.method4640((float) local225));
					this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
					local10.method2456((float) arg3, 0.0F, (float) local225);
					local10.method8454(local169, arg1, 0);
					this.aClass133_Sub1_4.method6204();
					this.aClass133_Sub1_4.method6163();
				}
			} else {
				local139 = arg3 + arg1;
				local142 = arg2 + arg0;
				local169 = this.method4035();
				local174 = this.method4042();
				local225 = arg1 + this.anInt2319;
				@Pc(293) int local293 = local225 + this.anInt2330;
				@Pc(323) int local323;
				@Pc(328) int local328;
				@Pc(380) int local380;
				while (local293 <= local139) {
					local15.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
					this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
					local323 = this.anInt2342 + arg0;
					for (local328 = this.anInt2324 + local323; local328 <= local142; local328 += local169) {
						local10.method2456((float) this.anInt2330, 0.0F, (float) this.anInt2324);
						local10.method8454(local323, local225, 0);
						this.aClass133_Sub1_4.method6204();
						local323 += local169;
						this.aClass133_Sub1_4.method6163();
					}
					if (local323 < local142) {
						local380 = local142 - local323;
						local15.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) local380));
						this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
						local10.method2456((float) this.anInt2330, 0.0F, (float) local380);
						local10.method8454(local323, local225, 0);
						this.aClass133_Sub1_4.method6204();
						this.aClass133_Sub1_4.method6163();
					}
					local293 += local174;
					local225 += local174;
				}
				if (local225 < local139) {
					local323 = local139 - local225;
					local15.method2456(this.anInterface20_1.method4641((float) local323), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
					this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
					local328 = this.anInt2342 + arg0;
					for (local380 = local328 + this.anInt2324; local380 <= local142; local380 += local169) {
						local10.method2456((float) local323, 0.0F, (float) this.anInt2324);
						local10.method8454(local328, local225, 0);
						this.aClass133_Sub1_4.method6204();
						this.aClass133_Sub1_4.method6163();
						local328 += local169;
					}
					if (local142 > local328) {
						@Pc(522) int local522 = local142 - local328;
						local15.method2456(this.anInterface20_1.method4641((float) local323), 1.0F, this.anInterface20_1.method4640((float) local522));
						this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
						local10.method2456((float) local323, 0.0F, (float) local522);
						local10.method8454(local328, local225, 0);
						this.aClass133_Sub1_4.method6204();
						this.aClass133_Sub1_4.method6163();
					}
				}
			}
		}
		this.aClass133_Sub1_4.method6172();
		this.aClass133_Sub1_4.method6211(Static229.aClass236_2, 1);
		this.aClass133_Sub1_4.method6159(1, Static229.aClass236_2);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method4053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt2342;
		@Pc(14) Interface20 local14 = local6.anInterface20_6;
		@Pc(19) int local19 = arg1 + this.anInt2319;
		this.anInterface20_1.method7905(Static197.aClass116_15);
		this.aClass133_Sub1_4.method6176();
		this.aClass133_Sub1_4.method6153(this.anInterface20_1);
		this.aClass133_Sub1_4.method6208(1);
		this.aClass133_Sub1_4.method6268(1);
		@Pc(49) Class113_Sub1 local49 = this.aClass133_Sub1_4.method6284();
		local49.method2456((float) this.anInt2330, 0.0F, (float) this.anInt2324);
		local49.method8454(local11, local19, 0);
		this.aClass133_Sub1_4.method6204();
		@Pc(73) Class113_Sub1 local73 = this.aClass133_Sub1_4.method6183();
		local73.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6271(1);
		this.aClass133_Sub1_4.method6153(local14);
		this.aClass133_Sub1_4.method6239(Static481.aClass151_8, Static524.aClass151_11);
		this.aClass133_Sub1_4.method6211(Static229.aClass236_2, 0);
		@Pc(123) Class113_Sub1 local123 = this.aClass133_Sub1_4.method6183();
		local123.method2456(local14.method4641((float) this.anInt2330), 1.0F, local14.method4640((float) this.anInt2324));
		local123.method2467(local14.method4641((float) (local19 - arg4)), 0.0F, local14.method4640((float) (local11 - arg3)));
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6163();
		this.aClass133_Sub1_4.method6172();
		this.aClass133_Sub1_4.method6211(Static626.aClass236_6, 0);
		this.aClass133_Sub1_4.method6239(Static524.aClass151_11, Static524.aClass151_11);
		this.aClass133_Sub1_4.method6153(null);
		this.aClass133_Sub1_4.method6271(0);
		this.aClass133_Sub1_4.method6172();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class113_Sub1 local8 = this.aClass133_Sub1_4.method6284();
		@Pc(13) Class113_Sub1 local13 = this.aClass133_Sub1_4.method6183();
		@Pc(18) int local18 = arg0 + this.anInt2342;
		@Pc(23) int local23 = arg1 + this.anInt2319;
		this.anInterface20_1.method7905(Static197.aClass116_15);
		this.aClass133_Sub1_4.method6176();
		this.aClass133_Sub1_4.method6153(this.anInterface20_1);
		this.aClass133_Sub1_4.method6208(arg4);
		this.aClass133_Sub1_4.method6268(arg2);
		this.aClass133_Sub1_4.method6211(Static105.aClass236_1, 1);
		this.aClass133_Sub1_4.method6159(1, Static105.aClass236_1);
		this.aClass133_Sub1_4.method6160(arg3);
		local8.method2456((float) this.anInt2330, 0.0F, (float) this.anInt2324);
		local8.method8454(local18, local23, 0);
		local13.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6204();
		this.aClass133_Sub1_4.method6163();
		this.aClass133_Sub1_4.method6172();
		this.aClass133_Sub1_4.method6211(Static229.aClass236_2, 1);
		this.aClass133_Sub1_4.method6159(1, Static229.aClass236_2);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method4030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class113_Sub1 local8 = this.aClass133_Sub1_4.method6284();
		@Pc(13) Class113_Sub1 local13 = this.aClass133_Sub1_4.method6183();
		this.anInterface20_1.method7905(this.aBoolean171 || this.aBoolean172 ? Static197.aClass116_15 : Static415.aClass116_12);
		this.aClass133_Sub1_4.method6176();
		this.aClass133_Sub1_4.method6153(this.anInterface20_1);
		this.aClass133_Sub1_4.method6208(1);
		this.aClass133_Sub1_4.method6268(arg6);
		this.aClass133_Sub1_4.method6211(Static105.aClass236_1, 1);
		this.aClass133_Sub1_4.method6159(1, Static105.aClass236_1);
		this.aClass133_Sub1_4.method6160(arg7);
		if (this.aBoolean169) {
			@Pc(77) float local77 = (float) this.method4035();
			@Pc(81) float local81 = (float) this.method4042();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(100) float local100 = (arg4 - arg0) / local81;
			@Pc(106) float local106 = (arg5 - arg1) / local81;
			@Pc(112) float local112 = local100 * (float) this.anInt2319;
			@Pc(118) float local118 = (float) this.anInt2319 * local106;
			@Pc(124) float local124 = local87 * (float) this.anInt2342;
			@Pc(130) float local130 = (float) this.anInt2342 * local94;
			@Pc(137) float local137 = (float) this.anInt2336 * -local87;
			@Pc(144) float local144 = (float) this.anInt2336 * -local94;
			@Pc(151) float local151 = (float) this.anInt2331 * -local100;
			arg0 = local112 + arg0 + local124;
			arg2 = local112 + arg2 + local137;
			arg1 = local118 + local130 + arg1;
			@Pc(176) float local176 = -local106 * (float) this.anInt2331;
			arg3 = local118 + local144 + arg3;
			arg4 = local151 + local124 + arg4;
			arg5 = arg5 + local130 + local176;
		}
		local8.method2476(arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 1.0F, arg4 - arg0, arg5 - arg1, 0.0F);
		local8.method2467(arg1, 0.0F, arg0);
		local13.method2456(this.anInterface20_1.method4641((float) this.anInt2330), 1.0F, this.anInterface20_1.method4640((float) this.anInt2324));
		this.aClass133_Sub1_4.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_4.method6204();
		this.aClass133_Sub1_4.method6163();
		this.aClass133_Sub1_4.method6172();
		this.aClass133_Sub1_4.method6211(Static229.aClass236_2, 1);
		this.aClass133_Sub1_4.method6159(1, Static229.aClass236_2);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()I")
	@Override
	public int method4037() {
		return this.anInt2330;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
	@Override
	public int method4035() {
		return this.anInt2336 + this.anInt2324 + this.anInt2342;
	}
}
