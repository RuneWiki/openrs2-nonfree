import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
	private int anInt7942 = 0;

	@OriginalMember(owner = "client!pia", name = "t", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
	private int anInt7943 = 0;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
	private int anInt7939 = 0;

	@OriginalMember(owner = "client!pia", name = "x", descriptor = "I")
	private int anInt7949 = 0;

	@OriginalMember(owner = "client!pia", name = "m", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_17;

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
	private final int anInt7938;

	@OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
	private final int anInt7944;

	@OriginalMember(owner = "client!pia", name = "D", descriptor = "Lclient!js;")
	private final Interface15 anInterface15_6;

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "Z")
	private final boolean aBoolean628;

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "Z")
	private final boolean aBoolean629;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "Z")
	private final boolean aBoolean630;

	@OriginalMember(owner = "client!pia", name = "p", descriptor = "Z")
	private final boolean aBoolean631;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!uv;IIZ)V")
	public Class4_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass5_Sub2_17 = arg0;
		this.anInt7938 = arg1;
		this.anInt7944 = arg2;
		this.anInterface15_6 = arg0.method4009(arg2, arg1, arg3 ? Static120.aClass178_4 : Static457.aClass178_11, Static302.aClass176_8);
		this.anInterface15_6.method8452(true, true);
		this.aBoolean628 = this.anInterface15_6.method8453() != arg1;
		this.aBoolean629 = this.anInterface15_6.method8449() != arg2;
		this.aBoolean630 = !this.aBoolean628 && this.anInterface15_6.method8454();
		this.aBoolean631 = !this.aBoolean629 && this.anInterface15_6.method8454();
	}

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!uv;II[III)V")
	public Class4_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7944 = arg2;
		this.anInt7938 = arg1;
		this.aClass5_Sub2_17 = arg0;
		this.anInterface15_6 = arg0.method4066(arg4, arg3, false, arg1, arg2, arg5);
		this.anInterface15_6.method8452(true, true);
		this.aBoolean628 = arg1 != this.anInterface15_6.method8453();
		this.aBoolean629 = this.anInterface15_6.method8449() != arg2;
		this.aBoolean630 = !this.aBoolean628 && this.anInterface15_6.method8454();
		this.aBoolean631 = !this.aBoolean629 && this.anInterface15_6.method8454();
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass5_Sub2_17.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6708(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "()I")
	@Override
	public int method7712() {
		return this.anInt7943 + this.anInt7944 + this.anInt7942;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIII[III)V")
	private void method6708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface15_6.method8455(arg1, arg3, arg4, arg0, arg5, arg2);
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "()I")
	@Override
	public int method7700() {
		return this.anInt7939 + this.anInt7938 + this.anInt7949;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "([I)V")
	@Override
	public void method7704(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7943;
		arg0[2] = this.anInt7949;
		arg0[1] = this.anInt7942;
		arg0[0] = this.anInt7939;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7696(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class115_Sub3 local8 = this.aClass5_Sub2_17.method3981();
		@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_17.method3960();
		this.anInterface15_6.method8610(this.aBoolean628 || this.aBoolean629 ? Static581.aClass216_8 : Static121.aClass216_4);
		this.aClass5_Sub2_17.method4055();
		this.aClass5_Sub2_17.method4008(this.anInterface15_6);
		this.aClass5_Sub2_17.method4004(1);
		this.aClass5_Sub2_17.method4018(arg6);
		this.aClass5_Sub2_17.method4054(1, Static347.aClass80_2);
		this.aClass5_Sub2_17.method3956(Static347.aClass80_2, 1);
		this.aClass5_Sub2_17.method3987(arg7);
		if (this.aBoolean632) {
			@Pc(74) float local74 = (float) this.method7700();
			@Pc(78) float local78 = (float) this.method7712();
			@Pc(85) float local85 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(98) float local98 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = local98 * (float) this.anInt7942;
			@Pc(116) float local116 = local104 * (float) this.anInt7942;
			@Pc(122) float local122 = local85 * (float) this.anInt7939;
			@Pc(128) float local128 = local91 * (float) this.anInt7939;
			@Pc(135) float local135 = (float) this.anInt7949 * -local85;
			@Pc(142) float local142 = -local91 * (float) this.anInt7949;
			@Pc(149) float local149 = -local98 * (float) this.anInt7943;
			arg0 = arg0 + local122 + local110;
			arg1 = arg1 + local128 + local116;
			arg4 = arg4 + local122 + local149;
			arg3 = local142 + arg3 + local116;
			arg2 = local110 + local135 + arg2;
			@Pc(186) float local186 = (float) this.anInt7943 * -local104;
			arg5 = local186 + local128 + arg5;
		}
		local8.method6304(1.0F, arg4 - arg0, -arg1 + arg3, 0.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg2, 0.0F);
		local8.method6322(arg1, 0.0F, arg0);
		local13.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method3938();
		this.aClass5_Sub2_17.method4005();
		this.aClass5_Sub2_17.method3988();
		this.aClass5_Sub2_17.method4054(1, Static115.aClass80_1);
		this.aClass5_Sub2_17.method3956(Static115.aClass80_1, 1);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)V")
	@Override
	public void method7705(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass5_Sub2_17.na(0, 0, this.anInt7938, this.anInt7944);
		@Pc(22) int[] local22 = new int[this.anInt7944 * this.anInt7938];
		this.anInterface15_6.method8450(this.anInt7938, this.anInt7944, local22);
		@Pc(107) int local107;
		@Pc(114) int local114;
		@Pc(116) int local116;
		if (arg0 == 0) {
			for (local107 = 0; local107 < this.anInt7944; local107++) {
				local114 = local107 * this.anInt7938;
				for (local116 = 0; local116 < this.anInt7938; local116++) {
					local22[local116 + local114] = local15[local114 + local116] << 8 & 0xFF0000E8 | local22[local116 + local114] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local107 = 0; local107 < this.anInt7944; local107++) {
				local114 = local107 * this.anInt7938;
				for (local116 = 0; local116 < this.anInt7938; local116++) {
					local22[local114 + local116] = (local15[local116 + local114] == 0 ? 0 : -16777216) | local22[local114 + local116] & 0xFFFFFF;
				}
			}
		}
		this.method6708(0, 0, this.anInt7938, this.anInt7944, local22, this.anInt7938);
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "(IIII)V")
	@Override
	public void method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7943 = arg3;
		this.anInt7939 = arg0;
		this.anInt7949 = arg2;
		this.anInt7942 = arg1;
		this.aBoolean632 = this.anInt7939 != 0 || this.anInt7942 != 0 || this.anInt7949 != 0 || this.anInt7943 != 0;
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class115_Sub3 local10 = this.aClass5_Sub2_17.method3981();
		@Pc(15) Class115_Sub3 local15 = this.aClass5_Sub2_17.method3960();
		this.anInterface15_6.method8610(Static581.aClass216_8);
		this.aClass5_Sub2_17.method4055();
		this.aClass5_Sub2_17.method4008(this.anInterface15_6);
		this.aClass5_Sub2_17.method4004(arg6);
		this.aClass5_Sub2_17.method4018(arg4);
		this.aClass5_Sub2_17.method4054(1, Static347.aClass80_2);
		this.aClass5_Sub2_17.method3956(Static347.aClass80_2, 1);
		this.aClass5_Sub2_17.method3987(arg5);
		@Pc(76) boolean local76 = this.aBoolean631 && this.anInt7942 == 0 && this.anInt7943 == 0;
		@Pc(89) boolean local89 = this.aBoolean630 && this.anInt7939 == 0 && this.anInt7949 == 0;
		if (local89 & local76) {
			local15.method6318(this.anInterface15_6.method8451((float) arg3), this.anInterface15_6.method8448((float) arg2), 1.0F);
			local10.method6318((float) arg3, (float) arg2, 0.0F);
			local10.method6296(arg0, arg1, 0);
			this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
			this.aClass5_Sub2_17.method3938();
			this.aClass5_Sub2_17.method4005();
		} else {
			@Pc(101) int local101;
			@Pc(104) int local104;
			@Pc(131) int local131;
			@Pc(136) int local136;
			@Pc(182) int local182;
			if (local89) {
				local101 = arg3 + arg1;
				local104 = this.method7712();
				local15.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) arg2), 1.0F);
				this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
				local131 = this.anInt7942 + arg1;
				local136 = local131 + this.anInt7944;
				while (local136 <= local101) {
					local10.method6318((float) this.anInt7944, (float) arg2, 0.0F);
					local10.method6296(arg0, local131, 0);
					this.aClass5_Sub2_17.method3938();
					local136 += local104;
					this.aClass5_Sub2_17.method4005();
					local131 += local104;
				}
				if (local131 < local101) {
					local182 = local101 - local131;
					local15.method6318(this.anInterface15_6.method8451((float) local182), this.anInterface15_6.method8448((float) arg2), 1.0F);
					this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
					local10.method6318((float) local182, (float) arg2, 0.0F);
					local10.method6296(arg0, local131, 0);
					this.aClass5_Sub2_17.method3938();
					this.aClass5_Sub2_17.method4005();
				}
			} else if (local76) {
				local101 = arg2 + arg0;
				local104 = this.method7700();
				local15.method6318(this.anInterface15_6.method8451((float) arg3), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
				this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
				local131 = arg0 + this.anInt7939;
				local136 = this.anInt7938 + local131;
				while (local101 >= local136) {
					local10.method6318((float) arg3, (float) this.anInt7938, 0.0F);
					local10.method6296(local131, arg1, 0);
					this.aClass5_Sub2_17.method3938();
					local131 += local104;
					local136 += local104;
					this.aClass5_Sub2_17.method4005();
				}
				if (local131 < local101) {
					local182 = local101 - local131;
					local15.method6318(this.anInterface15_6.method8451((float) arg3), this.anInterface15_6.method8448((float) local182), 1.0F);
					this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
					local10.method6318((float) arg3, (float) local182, 0.0F);
					local10.method6296(local131, arg1, 0);
					this.aClass5_Sub2_17.method3938();
					this.aClass5_Sub2_17.method4005();
				}
			} else {
				local101 = arg1 + arg3;
				local104 = arg2 + arg0;
				local131 = this.method7700();
				local136 = this.method7712();
				local182 = this.anInt7942 + arg1;
				@Pc(251) int local251 = this.anInt7944 + local182;
				@Pc(281) int local281;
				@Pc(287) int local287;
				@Pc(339) int local339;
				while (local101 >= local251) {
					local15.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
					this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
					local281 = this.anInt7939 + arg0;
					local287 = local281 + this.anInt7938;
					while (local104 >= local287) {
						local10.method6318((float) this.anInt7944, (float) this.anInt7938, 0.0F);
						local10.method6296(local281, local182, 0);
						this.aClass5_Sub2_17.method3938();
						local287 += local131;
						this.aClass5_Sub2_17.method4005();
						local281 += local131;
					}
					if (local281 < local104) {
						local339 = local104 - local281;
						local15.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) local339), 1.0F);
						this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
						local10.method6318((float) this.anInt7944, (float) local339, 0.0F);
						local10.method6296(local281, local182, 0);
						this.aClass5_Sub2_17.method3938();
						this.aClass5_Sub2_17.method4005();
					}
					local251 += local136;
					local182 += local136;
				}
				if (local182 < local101) {
					local281 = local101 - local182;
					local15.method6318(this.anInterface15_6.method8451((float) local281), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
					this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
					local287 = arg0 + this.anInt7939;
					for (local339 = local287 + this.anInt7938; local339 <= local104; local339 += local131) {
						local10.method6318((float) local281, (float) this.anInt7938, 0.0F);
						local10.method6296(local287, local182, 0);
						this.aClass5_Sub2_17.method3938();
						this.aClass5_Sub2_17.method4005();
						local287 += local131;
					}
					if (local287 < local104) {
						@Pc(482) int local482 = local104 - local287;
						local15.method6318(this.anInterface15_6.method8451((float) local281), this.anInterface15_6.method8448((float) local482), 1.0F);
						this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
						local10.method6318((float) local281, (float) local482, 0.0F);
						local10.method6296(local287, local182, 0);
						this.aClass5_Sub2_17.method3938();
						this.aClass5_Sub2_17.method4005();
					}
				}
			}
		}
		this.aClass5_Sub2_17.method3988();
		this.aClass5_Sub2_17.method4054(1, Static115.aClass80_1);
		this.aClass5_Sub2_17.method3956(Static115.aClass80_1, 1);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg1 + this.anInt7942;
		@Pc(16) int local16 = arg0 + this.anInt7939;
		@Pc(19) Interface15 local19 = local6.anInterface15_2;
		this.anInterface15_6.method8610(Static581.aClass216_8);
		this.aClass5_Sub2_17.method4055();
		this.aClass5_Sub2_17.method4008(this.anInterface15_6);
		this.aClass5_Sub2_17.method4004(1);
		this.aClass5_Sub2_17.method4018(1);
		@Pc(49) Class115_Sub3 local49 = this.aClass5_Sub2_17.method3981();
		local49.method6318((float) this.anInt7944, (float) this.anInt7938, 0.0F);
		local49.method6296(local16, local11, 0);
		this.aClass5_Sub2_17.method3938();
		@Pc(73) Class115_Sub3 local73 = this.aClass5_Sub2_17.method3960();
		local73.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method3954(1);
		this.aClass5_Sub2_17.method4008(local19);
		this.aClass5_Sub2_17.method4022(Static438.aClass144_3, Static503.aClass144_4);
		this.aClass5_Sub2_17.method4054(0, Static115.aClass80_1);
		@Pc(123) Class115_Sub3 local123 = this.aClass5_Sub2_17.method3960();
		local123.method6318(local19.method8451((float) this.anInt7944), local19.method8448((float) this.anInt7938), 1.0F);
		local123.method6322(local19.method8451((float) (local11 - arg4)), 0.0F, local19.method8448((float) (local16 - arg3)));
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method4005();
		this.aClass5_Sub2_17.method3988();
		this.aClass5_Sub2_17.method4054(0, Static522.aClass80_4);
		this.aClass5_Sub2_17.method4022(Static438.aClass144_3, Static438.aClass144_3);
		this.aClass5_Sub2_17.method4008((Interface4) null);
		this.aClass5_Sub2_17.method3954(0);
		this.aClass5_Sub2_17.method3988();
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class115_Sub3 local8 = this.aClass5_Sub2_17.method3981();
		@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_17.method3960();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface15 local19 = local16.anInterface15_2;
		this.anInterface15_6.method8610(this.aBoolean628 || this.aBoolean629 ? Static581.aClass216_8 : Static121.aClass216_4);
		this.aClass5_Sub2_17.method4055();
		this.aClass5_Sub2_17.method4008(this.anInterface15_6);
		this.aClass5_Sub2_17.method4004(1);
		this.aClass5_Sub2_17.method4018(1);
		if (this.aBoolean632) {
			@Pc(97) float local97 = (float) this.anInt7938 / (float) this.method7700();
			@Pc(105) float local105 = (float) this.anInt7944 / (float) this.method7712();
			local8.method6304(1.0F, local105 * (arg4 - arg0), (arg3 - arg1) * local97, 0.0F, 0.0F, 0.0F, local105 * (arg5 - arg1), (arg2 - arg0) * local97, 0.0F);
			local8.method6322(((float) this.anInt7942 + arg1) * local105, 0.0F, (arg0 + (float) this.anInt7939) * local97);
		} else {
			local8.method6304(1.0F, arg4 - arg0, -arg1 + arg3, 0.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg2, 0.0F);
			local8.method6322(arg1, 0.0F, arg0);
		}
		local13.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method3954(1);
		this.aClass5_Sub2_17.method4008(local19);
		this.aClass5_Sub2_17.method4022(Static438.aClass144_3, Static503.aClass144_4);
		this.aClass5_Sub2_17.method4054(0, Static115.aClass80_1);
		@Pc(202) Class115_Sub3 local202 = this.aClass5_Sub2_17.method3960();
		local202.method6282(local8);
		local202.method6296(-arg7, -arg8, 0);
		local202.method6319(1.0F, local19.method8451(1.0F), local19.method8448(1.0F));
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method3938();
		this.aClass5_Sub2_17.method4005();
		this.aClass5_Sub2_17.method3988();
		this.aClass5_Sub2_17.method4054(0, Static522.aClass80_4);
		this.aClass5_Sub2_17.method4022(Static438.aClass144_3, Static438.aClass144_3);
		this.aClass5_Sub2_17.method4008((Interface4) null);
		this.aClass5_Sub2_17.method3954(0);
		this.aClass5_Sub2_17.method3988();
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "()I")
	@Override
	public int method7697() {
		return this.anInt7938;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class115_Sub3 local8 = this.aClass5_Sub2_17.method3981();
		@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_17.method3960();
		this.anInterface15_6.method8610(this.aBoolean628 || this.aBoolean629 ? Static581.aClass216_8 : Static121.aClass216_4);
		this.aClass5_Sub2_17.method4055();
		this.aClass5_Sub2_17.method4008(this.anInterface15_6);
		this.aClass5_Sub2_17.method4004(arg6);
		this.aClass5_Sub2_17.method4018(arg4);
		this.aClass5_Sub2_17.method4054(1, Static347.aClass80_2);
		this.aClass5_Sub2_17.method3956(Static347.aClass80_2, 1);
		this.aClass5_Sub2_17.method3987(arg5);
		local13.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
		if (this.aBoolean632) {
			arg2 = this.anInt7938 * arg2 / this.method7700();
			arg3 = this.anInt7944 * arg3 / this.method7712();
			arg0 += this.anInt7939 * arg2 / this.anInt7938;
			arg1 += arg3 * this.anInt7942 / this.anInt7944;
		}
		local8.method6318((float) arg3, (float) arg2, 0.0F);
		local8.method6296(arg0, arg1, 0);
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method3938();
		this.aClass5_Sub2_17.method4005();
		this.aClass5_Sub2_17.method3988();
		this.aClass5_Sub2_17.method4054(1, Static115.aClass80_1);
		this.aClass5_Sub2_17.method3956(Static115.aClass80_1, 1);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "()I")
	@Override
	public int method7694() {
		return this.anInt7944;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class115_Sub3 local8 = this.aClass5_Sub2_17.method3981();
		@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_17.method3960();
		@Pc(18) int local18 = arg1 + this.anInt7942;
		@Pc(23) int local23 = arg0 + this.anInt7939;
		this.anInterface15_6.method8610(Static581.aClass216_8);
		this.aClass5_Sub2_17.method4055();
		this.aClass5_Sub2_17.method4008(this.anInterface15_6);
		this.aClass5_Sub2_17.method4004(arg4);
		this.aClass5_Sub2_17.method4018(arg2);
		this.aClass5_Sub2_17.method4054(1, Static347.aClass80_2);
		this.aClass5_Sub2_17.method3956(Static347.aClass80_2, 1);
		this.aClass5_Sub2_17.method3987(arg3);
		local8.method6318((float) this.anInt7944, (float) this.anInt7938, 0.0F);
		local8.method6296(local23, local18, 0);
		local13.method6318(this.anInterface15_6.method8451((float) this.anInt7944), this.anInterface15_6.method8448((float) this.anInt7938), 1.0F);
		this.aClass5_Sub2_17.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_17.method3938();
		this.aClass5_Sub2_17.method4005();
		this.aClass5_Sub2_17.method3988();
		this.aClass5_Sub2_17.method4054(1, Static115.aClass80_1);
		this.aClass5_Sub2_17.method3956(Static115.aClass80_1, 1);
	}
}
