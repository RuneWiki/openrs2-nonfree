import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private int anInt10154 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	private int anInt10151 = 0;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	private int anInt10162 = 0;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
	private boolean aBoolean709 = false;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
	private int anInt10172 = 0;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_22;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	private final int anInt10169;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	private final int anInt10155;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!bw;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
	private final boolean aBoolean710;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Z")
	private final boolean aBoolean713;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Z")
	private final boolean aBoolean714;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Z")
	private final boolean aBoolean711;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!lba;IIZ)V")
	public Class9_Sub3(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass132_Sub1_22 = arg0;
		this.anInt10169 = arg2;
		this.anInt10155 = arg1;
		this.anInterface2_6 = arg0.method7638(arg3 ? Static169.aClass265_9 : Static289.aClass265_13, arg1, Static417.aClass250_14, arg2);
		this.anInterface2_6.method8901(true, true);
		this.aBoolean710 = this.anInterface2_6.method8902() != arg1;
		this.aBoolean713 = arg2 != this.anInterface2_6.method8896();
		this.aBoolean714 = !this.aBoolean710 && this.anInterface2_6.method8904();
		this.aBoolean711 = !this.aBoolean713 && this.anInterface2_6.method8904();
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!lba;II[III)V")
	public Class9_Sub3(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10155 = arg1;
		this.aClass132_Sub1_22 = arg0;
		this.anInt10169 = arg2;
		this.anInterface2_6 = arg0.method7650(arg1, arg2, false, arg5, arg4, arg3);
		this.anInterface2_6.method8901(true, true);
		this.aBoolean710 = arg1 != this.anInterface2_6.method8902();
		this.aBoolean713 = arg2 != this.anInterface2_6.method8896();
		this.aBoolean714 = !this.aBoolean710 && this.anInterface2_6.method8904();
		this.aBoolean711 = !this.aBoolean713 && this.anInterface2_6.method8904();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass132_Sub1_22.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method8607(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10151 = arg2;
		this.anInt10162 = arg1;
		this.anInt10154 = arg3;
		this.anInt10172 = arg0;
		this.aBoolean709 = this.anInt10172 != 0 || this.anInt10162 != 0 || this.anInt10151 != 0 || this.anInt10154 != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([I)V")
	@Override
	public void method8923(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt10162;
		arg0[0] = this.anInt10172;
		arg0[3] = this.anInt10154;
		arg0[2] = this.anInt10151;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Interface2 local9 = local6.anInterface2_5;
		@Pc(14) int local14 = arg0 + this.anInt10172;
		@Pc(19) int local19 = arg1 + this.anInt10162;
		this.anInterface2_6.method8893(Static403.aClass59_9);
		this.aClass132_Sub1_22.method7541();
		this.aClass132_Sub1_22.method7635(this.anInterface2_6);
		this.aClass132_Sub1_22.method7547(1);
		this.aClass132_Sub1_22.method7652(1);
		@Pc(49) Class207_Sub3 local49 = this.aClass132_Sub1_22.method7609();
		local49.method8239((float) this.anInt10155, (float) this.anInt10169, 0.0F);
		local49.method8209(local14, local19, 0);
		this.aClass132_Sub1_22.method7571();
		@Pc(73) Class207_Sub3 local73 = this.aClass132_Sub1_22.method7613();
		local73.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7616(1);
		this.aClass132_Sub1_22.method7635(local9);
		this.aClass132_Sub1_22.method7637(Static320.aClass322_5, Static131.aClass322_3);
		this.aClass132_Sub1_22.method7552(Static648.aClass378_4, 0);
		@Pc(123) Class207_Sub3 local123 = this.aClass132_Sub1_22.method7613();
		local123.method8239(local9.method8898((float) this.anInt10155), local9.method8900((float) this.anInt10169), 1.0F);
		local123.method8215(0.0F, local9.method8898((float) (local14 - arg3)), local9.method8900((float) (local19 - arg4)));
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7543();
		this.aClass132_Sub1_22.method7520();
		this.aClass132_Sub1_22.method7552(Static368.aClass378_1, 0);
		this.aClass132_Sub1_22.method7637(Static131.aClass322_3, Static131.aClass322_3);
		this.aClass132_Sub1_22.method7635((Interface17) null);
		this.aClass132_Sub1_22.method7616(0);
		this.aClass132_Sub1_22.method7520();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class207_Sub3 local8 = this.aClass132_Sub1_22.method7609();
		@Pc(13) Class207_Sub3 local13 = this.aClass132_Sub1_22.method7613();
		this.anInterface2_6.method8893(this.aBoolean710 || this.aBoolean713 ? Static403.aClass59_9 : Static70.aClass59_5);
		this.aClass132_Sub1_22.method7541();
		this.aClass132_Sub1_22.method7635(this.anInterface2_6);
		this.aClass132_Sub1_22.method7547(arg6);
		this.aClass132_Sub1_22.method7652(arg4);
		this.aClass132_Sub1_22.method7552(Static583.aClass378_3, 1);
		this.aClass132_Sub1_22.method7598(1, Static583.aClass378_3);
		this.aClass132_Sub1_22.method7611(arg5);
		local13.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
		if (this.aBoolean709) {
			arg2 = this.anInt10155 * arg2 / this.method8937();
			arg3 = arg3 * this.anInt10169 / this.method8930();
			arg1 += this.anInt10162 * arg3 / this.anInt10169;
			arg0 += arg2 * this.anInt10172 / this.anInt10155;
		}
		local8.method8239((float) arg2, (float) arg3, 0.0F);
		local8.method8209(arg0, arg1, 0);
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7571();
		this.aClass132_Sub1_22.method7543();
		this.aClass132_Sub1_22.method7520();
		this.aClass132_Sub1_22.method7552(Static648.aClass378_4, 1);
		this.aClass132_Sub1_22.method7598(1, Static648.aClass378_4);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8916(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class207_Sub3 local8 = this.aClass132_Sub1_22.method7609();
		@Pc(13) Class207_Sub3 local13 = this.aClass132_Sub1_22.method7613();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface2 local19 = local16.anInterface2_5;
		this.anInterface2_6.method8893(this.aBoolean710 || this.aBoolean713 ? Static403.aClass59_9 : Static70.aClass59_5);
		this.aClass132_Sub1_22.method7541();
		this.aClass132_Sub1_22.method7635(this.anInterface2_6);
		this.aClass132_Sub1_22.method7547(1);
		this.aClass132_Sub1_22.method7652(1);
		if (this.aBoolean709) {
			@Pc(70) float local70 = (float) this.anInt10155 / (float) this.method8937();
			@Pc(78) float local78 = (float) this.anInt10169 / (float) this.method8930();
			local8.method8222(0.0F, 0.0F, (arg5 - arg1) * local78, 1.0F, 0.0F, local78 * (arg4 - arg0), (arg2 - arg0) * local70, (arg3 - arg1) * local70, 0.0F);
			local8.method8215(0.0F, (arg0 + (float) this.anInt10172) * local70, local78 * (arg1 + (float) this.anInt10162));
		} else {
			local8.method8222(0.0F, 0.0F, arg5 - arg1, 1.0F, 0.0F, arg4 - arg0, arg2 - arg0, arg3 - arg1, 0.0F);
			local8.method8215(0.0F, arg0, arg1);
		}
		local13.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7616(1);
		this.aClass132_Sub1_22.method7635(local19);
		this.aClass132_Sub1_22.method7637(Static320.aClass322_5, Static131.aClass322_3);
		this.aClass132_Sub1_22.method7552(Static648.aClass378_4, 0);
		@Pc(207) Class207_Sub3 local207 = this.aClass132_Sub1_22.method7613();
		local207.method8211(local8);
		local207.method8209(-arg7, -arg8, 0);
		local207.method8229(local19.method8900(1.0F), local19.method8898(1.0F), 1.0F);
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7571();
		this.aClass132_Sub1_22.method7543();
		this.aClass132_Sub1_22.method7520();
		this.aClass132_Sub1_22.method7552(Static368.aClass378_1, 0);
		this.aClass132_Sub1_22.method7637(Static131.aClass322_3, Static131.aClass322_3);
		this.aClass132_Sub1_22.method7635((Interface17) null);
		this.aClass132_Sub1_22.method7616(0);
		this.aClass132_Sub1_22.method7520();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class207_Sub3 local8 = this.aClass132_Sub1_22.method7609();
		@Pc(13) Class207_Sub3 local13 = this.aClass132_Sub1_22.method7613();
		@Pc(18) int local18 = arg0 + this.anInt10172;
		@Pc(23) int local23 = arg1 + this.anInt10162;
		this.anInterface2_6.method8893(Static403.aClass59_9);
		this.aClass132_Sub1_22.method7541();
		this.aClass132_Sub1_22.method7635(this.anInterface2_6);
		this.aClass132_Sub1_22.method7547(arg4);
		this.aClass132_Sub1_22.method7652(arg2);
		this.aClass132_Sub1_22.method7552(Static583.aClass378_3, 1);
		this.aClass132_Sub1_22.method7598(1, Static583.aClass378_3);
		this.aClass132_Sub1_22.method7611(arg3);
		local8.method8239((float) this.anInt10155, (float) this.anInt10169, 0.0F);
		local8.method8209(local18, local23, 0);
		local13.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7571();
		this.aClass132_Sub1_22.method7543();
		this.aClass132_Sub1_22.method7520();
		this.aClass132_Sub1_22.method7552(Static648.aClass378_4, 1);
		this.aClass132_Sub1_22.method7598(1, Static648.aClass378_4);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	@Override
	public int method8930() {
		return this.anInt10154 + this.anInt10169 + this.anInt10162;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()I")
	@Override
	public int method8937() {
		return this.anInt10172 + this.anInt10155 + this.anInt10151;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
	@Override
	public int method8918() {
		return this.anInt10169;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class207_Sub3 local10 = this.aClass132_Sub1_22.method7609();
		@Pc(15) Class207_Sub3 local15 = this.aClass132_Sub1_22.method7613();
		this.anInterface2_6.method8893(Static403.aClass59_9);
		this.aClass132_Sub1_22.method7541();
		this.aClass132_Sub1_22.method7635(this.anInterface2_6);
		this.aClass132_Sub1_22.method7547(arg6);
		this.aClass132_Sub1_22.method7652(arg4);
		this.aClass132_Sub1_22.method7552(Static583.aClass378_3, 1);
		this.aClass132_Sub1_22.method7598(1, Static583.aClass378_3);
		this.aClass132_Sub1_22.method7611(arg5);
		@Pc(70) boolean local70 = this.aBoolean711 && this.anInt10162 == 0 && this.anInt10154 == 0;
		@Pc(83) boolean local83 = this.aBoolean714 && this.anInt10172 == 0 && this.anInt10151 == 0;
		if (local83 & local70) {
			local15.method8239(this.anInterface2_6.method8898((float) arg2), this.anInterface2_6.method8900((float) arg3), 1.0F);
			local10.method8239((float) arg2, (float) arg3, 0.0F);
			local10.method8209(arg0, arg1, 0);
			this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
			this.aClass132_Sub1_22.method7571();
			this.aClass132_Sub1_22.method7543();
		} else {
			@Pc(94) int local94;
			@Pc(97) int local97;
			@Pc(124) int local124;
			@Pc(130) int local130;
			@Pc(177) int local177;
			if (local83) {
				local94 = arg1 + arg3;
				local97 = this.method8930();
				local15.method8239(this.anInterface2_6.method8898((float) arg2), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
				this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
				local124 = this.anInt10162 + arg1;
				for (local130 = local124 + this.anInt10169; local130 <= local94; local130 += local97) {
					local10.method8239((float) arg2, (float) this.anInt10169, 0.0F);
					local10.method8209(arg0, local124, 0);
					this.aClass132_Sub1_22.method7571();
					local124 += local97;
					this.aClass132_Sub1_22.method7543();
				}
				if (local124 < local94) {
					local177 = local94 - local124;
					local15.method8239(this.anInterface2_6.method8898((float) arg2), this.anInterface2_6.method8900((float) local177), 1.0F);
					this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
					local10.method8239((float) arg2, (float) local177, 0.0F);
					local10.method8209(arg0, local124, 0);
					this.aClass132_Sub1_22.method7571();
					this.aClass132_Sub1_22.method7543();
				}
			} else if (local70) {
				local94 = arg0 + arg2;
				local97 = this.method8937();
				local15.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) arg3), 1.0F);
				this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
				local124 = arg0 + this.anInt10172;
				local130 = this.anInt10155 + local124;
				while (local94 >= local130) {
					local10.method8239((float) this.anInt10155, (float) arg3, 0.0F);
					local10.method8209(local124, arg1, 0);
					this.aClass132_Sub1_22.method7571();
					local130 += local97;
					local124 += local97;
					this.aClass132_Sub1_22.method7543();
				}
				if (local94 > local124) {
					local177 = local94 - local124;
					local15.method8239(this.anInterface2_6.method8898((float) local177), this.anInterface2_6.method8900((float) arg3), 1.0F);
					this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
					local10.method8239((float) local177, (float) arg3, 0.0F);
					local10.method8209(local124, arg1, 0);
					this.aClass132_Sub1_22.method7571();
					this.aClass132_Sub1_22.method7543();
				}
			} else {
				local94 = arg3 + arg1;
				local97 = arg0 + arg2;
				local124 = this.method8937();
				local130 = this.method8930();
				local177 = arg1 + this.anInt10162;
				@Pc(408) int local408;
				@Pc(413) int local413;
				@Pc(457) int local457;
				for (@Pc(378) int local378 = this.anInt10169 + local177; local378 <= local94; local378 += local130) {
					local15.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
					this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
					local408 = this.anInt10172 + arg0;
					local413 = this.anInt10155 + local408;
					while (local97 >= local413) {
						local10.method8239((float) this.anInt10155, (float) this.anInt10169, 0.0F);
						local10.method8209(local408, local177, 0);
						this.aClass132_Sub1_22.method7571();
						local413 += local124;
						this.aClass132_Sub1_22.method7543();
						local408 += local124;
					}
					if (local97 > local408) {
						local457 = local97 - local408;
						local15.method8239(this.anInterface2_6.method8898((float) local457), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
						this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
						local10.method8239((float) local457, (float) this.anInt10169, 0.0F);
						local10.method8209(local408, local177, 0);
						this.aClass132_Sub1_22.method7571();
						this.aClass132_Sub1_22.method7543();
					}
					local177 += local130;
				}
				if (local177 < local94) {
					local408 = local94 - local177;
					local15.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) local408), 1.0F);
					this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
					local413 = this.anInt10172 + arg0;
					for (local457 = local413 + this.anInt10155; local457 <= local97; local457 += local124) {
						local10.method8239((float) this.anInt10155, (float) local408, 0.0F);
						local10.method8209(local413, local177, 0);
						this.aClass132_Sub1_22.method7571();
						this.aClass132_Sub1_22.method7543();
						local413 += local124;
					}
					if (local97 > local413) {
						@Pc(607) int local607 = local97 - local413;
						local15.method8239(this.anInterface2_6.method8898((float) local607), this.anInterface2_6.method8900((float) local408), 1.0F);
						this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
						local10.method8239((float) local607, (float) local408, 0.0F);
						local10.method8209(local413, local177, 0);
						this.aClass132_Sub1_22.method7571();
						this.aClass132_Sub1_22.method7543();
					}
				}
			}
		}
		this.aClass132_Sub1_22.method7520();
		this.aClass132_Sub1_22.method7552(Static648.aClass378_4, 1);
		this.aClass132_Sub1_22.method7598(1, Static648.aClass378_4);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8929(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class207_Sub3 local8 = this.aClass132_Sub1_22.method7609();
		@Pc(13) Class207_Sub3 local13 = this.aClass132_Sub1_22.method7613();
		this.anInterface2_6.method8893(this.aBoolean710 || this.aBoolean713 ? Static403.aClass59_9 : Static70.aClass59_5);
		this.aClass132_Sub1_22.method7541();
		this.aClass132_Sub1_22.method7635(this.anInterface2_6);
		this.aClass132_Sub1_22.method7547(1);
		this.aClass132_Sub1_22.method7652(arg6);
		this.aClass132_Sub1_22.method7552(Static583.aClass378_3, 1);
		this.aClass132_Sub1_22.method7598(1, Static583.aClass378_3);
		this.aClass132_Sub1_22.method7611(arg7);
		if (this.aBoolean709) {
			@Pc(77) float local77 = (float) this.method8937();
			@Pc(81) float local81 = (float) this.method8930();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(100) float local100 = (arg4 - arg0) / local81;
			@Pc(106) float local106 = (arg5 - arg1) / local81;
			@Pc(112) float local112 = local100 * (float) this.anInt10162;
			@Pc(118) float local118 = (float) this.anInt10162 * local106;
			@Pc(124) float local124 = (float) this.anInt10172 * local87;
			@Pc(130) float local130 = local94 * (float) this.anInt10172;
			@Pc(137) float local137 = -local87 * (float) this.anInt10151;
			@Pc(144) float local144 = -local94 * (float) this.anInt10151;
			@Pc(151) float local151 = -local100 * (float) this.anInt10154;
			arg1 = arg1 + local130 + local118;
			arg4 = local151 + local124 + arg4;
			@Pc(170) float local170 = (float) this.anInt10154 * -local106;
			arg0 = local112 + local124 + arg0;
			arg3 = local144 + arg3 + local118;
			arg2 = local112 + local137 + arg2;
			arg5 = local170 + arg5 + local130;
		}
		local8.method8222(0.0F, 0.0F, arg5 - arg1, 1.0F, 0.0F, arg4 - arg0, arg2 - arg0, arg3 - arg1, 0.0F);
		local8.method8215(0.0F, arg0, arg1);
		local13.method8239(this.anInterface2_6.method8898((float) this.anInt10155), this.anInterface2_6.method8900((float) this.anInt10169), 1.0F);
		this.aClass132_Sub1_22.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_22.method7571();
		this.aClass132_Sub1_22.method7543();
		this.aClass132_Sub1_22.method7520();
		this.aClass132_Sub1_22.method7552(Static648.aClass378_4, 1);
		this.aClass132_Sub1_22.method7598(1, Static648.aClass378_4);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
	@Override
	public int method8938() {
		return this.anInt10155;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII[III)V")
	private void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface2_6.method8903(arg4, arg5, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass132_Sub1_22.na(0, 0, this.anInt10155, this.anInt10169);
		@Pc(22) int[] local22 = new int[this.anInt10169 * this.anInt10155];
		this.anInterface2_6.method8897(this.anInt10169, local22, this.anInt10155);
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(157) int local157;
		if (arg0 == 0) {
			for (local148 = 0; local148 < this.anInt10169; local148++) {
				local155 = local148 * this.anInt10155;
				for (local157 = 0; local157 < this.anInt10155; local157++) {
					local22[local157 + local155] = local22[local157 + local155] & 0xFFFFFF | local15[local157 + local155] << 8 & 0xFF000016;
				}
			}
		} else if (arg0 == 3) {
			for (local148 = 0; local148 < this.anInt10169; local148++) {
				local155 = local148 * this.anInt10155;
				for (local157 = 0; local157 < this.anInt10155; local157++) {
					local22[local155 + local157] = local22[local155 + local157] & 0xFFFFFF | (local15[local157 + local155] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method8607(0, 0, this.anInt10155, this.anInt10169, local22, this.anInt10155);
	}
}
