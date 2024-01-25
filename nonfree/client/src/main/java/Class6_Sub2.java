import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	private int anInt3039 = 0;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	private int anInt3050 = 0;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	private int anInt3044 = 0;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	private int anInt3058 = 0;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	private final int anInt3053;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	private final int anInt3051;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_7;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Lclient!fk;")
	private final Interface8 anInterface8_4;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
	private final boolean aBoolean227;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ee;IIZ)V")
	public Class6_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3053 = arg1;
		this.anInt3051 = arg2;
		this.aClass95_Sub1_7 = arg0;
		this.anInterface8_4 = arg0.method8084(Static666.aClass389_16, arg2, arg1, arg3 ? Static21.aClass122_14 : Static147.aClass122_6);
		this.anInterface8_4.method7068(true, true);
		this.aBoolean224 = arg1 != this.anInterface8_4.method7071();
		this.aBoolean225 = this.anInterface8_4.method7073() != arg2;
		this.aBoolean226 = !this.aBoolean224 && this.anInterface8_4.method7072();
		this.aBoolean227 = !this.aBoolean225 && this.anInterface8_4.method7072();
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ee;II[III)V")
	public Class6_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3053 = arg1;
		this.aClass95_Sub1_7 = arg0;
		this.anInt3051 = arg2;
		this.anInterface8_4 = arg0.method8167(false, arg4, arg2, arg1, arg3, arg5);
		this.anInterface8_4.method7068(true, true);
		this.aBoolean224 = arg1 != this.anInterface8_4.method7071();
		this.aBoolean225 = arg2 != this.anInterface8_4.method7073();
		this.aBoolean226 = !this.aBoolean224 && this.anInterface8_4.method7072();
		this.aBoolean227 = !this.aBoolean225 && this.anInterface8_4.method7072();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class17_Sub2 local8 = this.aClass95_Sub1_7.method8119();
		@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_7.method8141();
		this.anInterface8_4.method7462(this.aBoolean224 || this.aBoolean225 ? Static241.aClass8_5 : Static608.aClass8_11);
		this.aClass95_Sub1_7.method8174();
		this.aClass95_Sub1_7.method8147(this.anInterface8_4);
		this.aClass95_Sub1_7.method8162(arg6);
		this.aClass95_Sub1_7.method8129(arg4);
		this.aClass95_Sub1_7.method8108(1, Static576.aClass235_3);
		this.aClass95_Sub1_7.method8122(Static576.aClass235_3, 1);
		this.aClass95_Sub1_7.method8078(arg5);
		local13.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
		if (this.aBoolean223) {
			arg2 = this.anInt3053 * arg2 / this.method5130();
			arg3 = this.anInt3051 * arg3 / this.method5134();
			arg1 += this.anInt3050 * arg3 / this.anInt3051;
			arg0 += arg2 * this.anInt3039 / this.anInt3053;
		}
		local8.method5843((float) arg3, (float) arg2, 0.0F);
		local8.method6235(arg0, arg1, 0);
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8098();
		this.aClass95_Sub1_7.method8176();
		this.aClass95_Sub1_7.method8142();
		this.aClass95_Sub1_7.method8108(1, Static383.aClass235_2);
		this.aClass95_Sub1_7.method8122(Static383.aClass235_2, 1);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII[III)V")
	private void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface8_4.method7066(arg1, arg2, arg0, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class17_Sub2 local10 = this.aClass95_Sub1_7.method8119();
		@Pc(15) Class17_Sub2 local15 = this.aClass95_Sub1_7.method8141();
		this.anInterface8_4.method7462(Static241.aClass8_5);
		this.aClass95_Sub1_7.method8174();
		this.aClass95_Sub1_7.method8147(this.anInterface8_4);
		this.aClass95_Sub1_7.method8162(arg6);
		this.aClass95_Sub1_7.method8129(arg4);
		this.aClass95_Sub1_7.method8108(1, Static576.aClass235_3);
		this.aClass95_Sub1_7.method8122(Static576.aClass235_3, 1);
		this.aClass95_Sub1_7.method8078(arg5);
		@Pc(70) boolean local70 = this.aBoolean227 && this.anInt3050 == 0 && this.anInt3058 == 0;
		@Pc(83) boolean local83 = this.aBoolean226 && this.anInt3039 == 0 && this.anInt3044 == 0;
		if (local70 & local83) {
			local15.method5843(this.anInterface8_4.method7065((float) arg3), this.anInterface8_4.method7067((float) arg2), 1.0F);
			local10.method5843((float) arg3, (float) arg2, 0.0F);
			local10.method6235(arg0, arg1, 0);
			this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
			this.aClass95_Sub1_7.method8098();
			this.aClass95_Sub1_7.method8176();
		} else {
			@Pc(93) int local93;
			@Pc(96) int local96;
			@Pc(123) int local123;
			@Pc(129) int local129;
			@Pc(171) int local171;
			if (local83) {
				local93 = arg1 + arg3;
				local96 = this.method5134();
				local15.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) arg2), 1.0F);
				this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
				local123 = this.anInt3050 + arg1;
				local129 = local123 + this.anInt3051;
				while (local129 <= local93) {
					local10.method5843((float) this.anInt3051, (float) arg2, 0.0F);
					local10.method6235(arg0, local123, 0);
					this.aClass95_Sub1_7.method8098();
					local123 += local96;
					local129 += local96;
					this.aClass95_Sub1_7.method8176();
				}
				if (local123 < local93) {
					local171 = local93 - local123;
					local15.method5843(this.anInterface8_4.method7065((float) local171), this.anInterface8_4.method7067((float) arg2), 1.0F);
					this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
					local10.method5843((float) local171, (float) arg2, 0.0F);
					local10.method6235(arg0, local123, 0);
					this.aClass95_Sub1_7.method8098();
					this.aClass95_Sub1_7.method8176();
				}
			} else if (local70) {
				local93 = arg0 + arg2;
				local96 = this.method5130();
				local15.method5843(this.anInterface8_4.method7065((float) arg3), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
				this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
				local123 = this.anInt3039 + arg0;
				for (local129 = local123 + this.anInt3053; local129 <= local93; local129 += local96) {
					local10.method5843((float) arg3, (float) this.anInt3053, 0.0F);
					local10.method6235(local123, arg1, 0);
					this.aClass95_Sub1_7.method8098();
					local123 += local96;
					this.aClass95_Sub1_7.method8176();
				}
				if (local123 < local93) {
					local171 = local93 - local123;
					local15.method5843(this.anInterface8_4.method7065((float) arg3), this.anInterface8_4.method7067((float) local171), 1.0F);
					this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
					local10.method5843((float) arg3, (float) local171, 0.0F);
					local10.method6235(local123, arg1, 0);
					this.aClass95_Sub1_7.method8098();
					this.aClass95_Sub1_7.method8176();
				}
			} else {
				local93 = arg3 + arg1;
				local96 = arg2 + arg0;
				local123 = this.method5130();
				local129 = this.method5134();
				local171 = arg1 + this.anInt3050;
				@Pc(399) int local399;
				@Pc(405) int local405;
				@Pc(453) int local453;
				for (@Pc(368) int local368 = this.anInt3051 + local171; local368 <= local93; local368 += local129) {
					local15.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
					this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
					local399 = arg0 + this.anInt3039;
					for (local405 = local399 + this.anInt3053; local405 <= local96; local405 += local123) {
						local10.method5843((float) this.anInt3051, (float) this.anInt3053, 0.0F);
						local10.method6235(local399, local171, 0);
						this.aClass95_Sub1_7.method8098();
						local399 += local123;
						this.aClass95_Sub1_7.method8176();
					}
					if (local96 > local399) {
						local453 = local96 - local399;
						local15.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) local453), 1.0F);
						this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
						local10.method5843((float) this.anInt3051, (float) local453, 0.0F);
						local10.method6235(local399, local171, 0);
						this.aClass95_Sub1_7.method8098();
						this.aClass95_Sub1_7.method8176();
					}
					local171 += local129;
				}
				if (local171 < local93) {
					local399 = local93 - local171;
					local15.method5843(this.anInterface8_4.method7065((float) local399), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
					this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
					local405 = arg0 + this.anInt3039;
					for (local453 = this.anInt3053 + local405; local453 <= local96; local453 += local123) {
						local10.method5843((float) local399, (float) this.anInt3053, 0.0F);
						local10.method6235(local405, local171, 0);
						this.aClass95_Sub1_7.method8098();
						local405 += local123;
						this.aClass95_Sub1_7.method8176();
					}
					if (local405 < local96) {
						@Pc(604) int local604 = local96 - local405;
						local15.method5843(this.anInterface8_4.method7065((float) local399), this.anInterface8_4.method7067((float) local604), 1.0F);
						this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
						local10.method5843((float) local399, (float) local604, 0.0F);
						local10.method6235(local405, local171, 0);
						this.aClass95_Sub1_7.method8098();
						this.aClass95_Sub1_7.method8176();
					}
				}
			}
		}
		this.aClass95_Sub1_7.method8142();
		this.aClass95_Sub1_7.method8108(1, Static383.aClass235_2);
		this.aClass95_Sub1_7.method8122(Static383.aClass235_2, 1);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "()I")
	@Override
	public int method5136() {
		return this.anInt3051;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5127(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class17_Sub2 local8 = this.aClass95_Sub1_7.method8119();
		@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_7.method8141();
		this.anInterface8_4.method7462(this.aBoolean224 || this.aBoolean225 ? Static241.aClass8_5 : Static608.aClass8_11);
		this.aClass95_Sub1_7.method8174();
		this.aClass95_Sub1_7.method8147(this.anInterface8_4);
		this.aClass95_Sub1_7.method8162(1);
		this.aClass95_Sub1_7.method8129(arg6);
		this.aClass95_Sub1_7.method8108(1, Static576.aClass235_3);
		this.aClass95_Sub1_7.method8122(Static576.aClass235_3, 1);
		this.aClass95_Sub1_7.method8078(arg7);
		if (this.aBoolean223) {
			@Pc(74) float local74 = (float) this.method5130();
			@Pc(78) float local78 = (float) this.method5134();
			@Pc(85) float local85 = (arg2 - arg0) / local74;
			@Pc(92) float local92 = (arg3 - arg1) / local74;
			@Pc(98) float local98 = (arg4 - arg0) / local78;
			@Pc(105) float local105 = (arg5 - arg1) / local78;
			@Pc(111) float local111 = local98 * (float) this.anInt3050;
			@Pc(117) float local117 = (float) this.anInt3050 * local105;
			@Pc(123) float local123 = local85 * (float) this.anInt3039;
			@Pc(129) float local129 = (float) this.anInt3039 * local92;
			@Pc(136) float local136 = (float) this.anInt3044 * -local85;
			@Pc(143) float local143 = (float) this.anInt3044 * -local92;
			@Pc(150) float local150 = -local98 * (float) this.anInt3058;
			arg2 = local111 + arg2 + local136;
			arg0 = local111 + arg0 + local123;
			arg4 = local150 + arg4 + local123;
			@Pc(175) float local175 = -local105 * (float) this.anInt3058;
			arg1 = local117 + arg1 + local129;
			arg3 = local117 + arg3 + local143;
			arg5 = local175 + local129 + arg5;
		}
		local8.method5853(0.0F, arg2 - arg0, -arg0 + arg4, 1.0F, 0.0F, arg3 - arg1, 0.0F, 0.0F, arg5 - arg1);
		local8.method5856(arg0, 0.0F, arg1);
		local13.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8098();
		this.aClass95_Sub1_7.method8176();
		this.aClass95_Sub1_7.method8142();
		this.aClass95_Sub1_7.method8108(1, Static383.aClass235_2);
		this.aClass95_Sub1_7.method8122(Static383.aClass235_2, 1);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	@Override
	public void method5120(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass95_Sub1_7.na(0, 0, this.anInt3053, this.anInt3051);
		@Pc(22) int[] local22 = new int[this.anInt3051 * this.anInt3053];
		this.anInterface8_4.method7070(local22, this.anInt3051, this.anInt3053);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(58) int local58;
		if (arg0 == 0) {
			for (local49 = 0; local49 < this.anInt3051; local49++) {
				local56 = local49 * this.anInt3053;
				for (local58 = 0; local58 < this.anInt3053; local58++) {
					local22[local58 + local56] = local22[local56 + local58] & 0xFFFFFF | local15[local56 + local58] << 8 & 0xFF000014;
				}
			}
		} else if (arg0 == 3) {
			for (local49 = 0; local49 < this.anInt3051; local49++) {
				local56 = local49 * this.anInt3053;
				for (local58 = 0; local58 < this.anInt3053; local58++) {
					local22[local56 + local58] = (local15[local56 + local58] == 0 ? 0 : -16777216) | local22[local56 + local58] & 0xFFFFFF;
				}
			}
		}
		this.method2649(0, 0, this.anInt3053, this.anInt3051, local22, this.anInt3053);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass95_Sub1_7.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2649(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class17_Sub2 local8 = this.aClass95_Sub1_7.method8119();
		@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_7.method8141();
		@Pc(18) int local18 = arg1 + this.anInt3050;
		@Pc(23) int local23 = arg0 + this.anInt3039;
		this.anInterface8_4.method7462(Static241.aClass8_5);
		this.aClass95_Sub1_7.method8174();
		this.aClass95_Sub1_7.method8147(this.anInterface8_4);
		this.aClass95_Sub1_7.method8162(arg4);
		this.aClass95_Sub1_7.method8129(arg2);
		this.aClass95_Sub1_7.method8108(1, Static576.aClass235_3);
		this.aClass95_Sub1_7.method8122(Static576.aClass235_3, 1);
		this.aClass95_Sub1_7.method8078(arg3);
		local8.method5843((float) this.anInt3051, (float) this.anInt3053, 0.0F);
		local8.method6235(local23, local18, 0);
		local13.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8098();
		this.aClass95_Sub1_7.method8176();
		this.aClass95_Sub1_7.method8142();
		this.aClass95_Sub1_7.method8108(1, Static383.aClass235_2);
		this.aClass95_Sub1_7.method8122(Static383.aClass235_2, 1);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "()I")
	@Override
	public int method5134() {
		return this.anInt3051 + this.anInt3050 + this.anInt3058;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5128(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class17_Sub2 local8 = this.aClass95_Sub1_7.method8119();
		@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_7.method8141();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface8 local19 = local16.anInterface8_6;
		this.anInterface8_4.method7462(this.aBoolean224 || this.aBoolean225 ? Static241.aClass8_5 : Static608.aClass8_11);
		this.aClass95_Sub1_7.method8174();
		this.aClass95_Sub1_7.method8147(this.anInterface8_4);
		this.aClass95_Sub1_7.method8162(1);
		this.aClass95_Sub1_7.method8129(1);
		if (this.aBoolean223) {
			@Pc(70) float local70 = (float) this.anInt3053 / (float) this.method5130();
			@Pc(78) float local78 = (float) this.anInt3051 / (float) this.method5134();
			local8.method5853(0.0F, (arg2 - arg0) * local70, (arg4 - arg0) * local78, 1.0F, 0.0F, local70 * (arg3 - arg1), 0.0F, 0.0F, (arg5 - arg1) * local78);
			local8.method5856((arg0 + (float) this.anInt3039) * local70, 0.0F, local78 * ((float) this.anInt3050 + arg1));
		} else {
			local8.method5853(0.0F, arg2 - arg0, -arg0 + arg4, 1.0F, 0.0F, arg3 - arg1, 0.0F, 0.0F, arg5 - arg1);
			local8.method5856(arg0, 0.0F, arg1);
		}
		local13.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8153(1);
		this.aClass95_Sub1_7.method8147(local19);
		this.aClass95_Sub1_7.method8195(Static617.aClass112_28, Static134.aClass112_9);
		this.aClass95_Sub1_7.method8108(0, Static383.aClass235_2);
		@Pc(209) Class17_Sub2 local209 = this.aClass95_Sub1_7.method8141();
		local209.method6233(local8);
		local209.method6235(-arg7, -arg8, 0);
		local209.method5842(local19.method7067(1.0F), local19.method7065(1.0F), 1.0F);
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8098();
		this.aClass95_Sub1_7.method8176();
		this.aClass95_Sub1_7.method8142();
		this.aClass95_Sub1_7.method8108(0, Static665.aClass235_4);
		this.aClass95_Sub1_7.method8195(Static617.aClass112_28, Static617.aClass112_28);
		this.aClass95_Sub1_7.method8147((Interface1) null);
		this.aClass95_Sub1_7.method8153(0);
		this.aClass95_Sub1_7.method8142();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
	@Override
	public int method5130() {
		return this.anInt3044 + this.anInt3039 + this.anInt3053;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()I")
	@Override
	public int method5119() {
		return this.anInt3053;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3050 = arg1;
		this.anInt3044 = arg2;
		this.anInt3058 = arg3;
		this.anInt3039 = arg0;
		this.aBoolean223 = this.anInt3039 != 0 || this.anInt3050 != 0 || this.anInt3044 != 0 || this.anInt3058 != 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt3039;
		@Pc(14) Interface8 local14 = local6.anInterface8_6;
		@Pc(19) int local19 = arg1 + this.anInt3050;
		this.anInterface8_4.method7462(Static241.aClass8_5);
		this.aClass95_Sub1_7.method8174();
		this.aClass95_Sub1_7.method8147(this.anInterface8_4);
		this.aClass95_Sub1_7.method8162(1);
		this.aClass95_Sub1_7.method8129(1);
		@Pc(49) Class17_Sub2 local49 = this.aClass95_Sub1_7.method8119();
		local49.method5843((float) this.anInt3051, (float) this.anInt3053, 0.0F);
		local49.method6235(local11, local19, 0);
		this.aClass95_Sub1_7.method8098();
		@Pc(73) Class17_Sub2 local73 = this.aClass95_Sub1_7.method8141();
		local73.method5843(this.anInterface8_4.method7065((float) this.anInt3051), this.anInterface8_4.method7067((float) this.anInt3053), 1.0F);
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8153(1);
		this.aClass95_Sub1_7.method8147(local14);
		this.aClass95_Sub1_7.method8195(Static617.aClass112_28, Static134.aClass112_9);
		this.aClass95_Sub1_7.method8108(0, Static383.aClass235_2);
		@Pc(123) Class17_Sub2 local123 = this.aClass95_Sub1_7.method8141();
		local123.method5843(local14.method7065((float) this.anInt3051), local14.method7067((float) this.anInt3053), 1.0F);
		local123.method5856(local14.method7067((float) (local11 - arg3)), 0.0F, local14.method7065((float) (local19 - arg4)));
		this.aClass95_Sub1_7.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_7.method8176();
		this.aClass95_Sub1_7.method8142();
		this.aClass95_Sub1_7.method8108(0, Static665.aClass235_4);
		this.aClass95_Sub1_7.method8195(Static617.aClass112_28, Static617.aClass112_28);
		this.aClass95_Sub1_7.method8147((Interface1) null);
		this.aClass95_Sub1_7.method8153(0);
		this.aClass95_Sub1_7.method8142();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([I)V")
	@Override
	public void method5118(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt3050;
		arg0[3] = this.anInt3058;
		arg0[0] = this.anInt3039;
		arg0[2] = this.anInt3044;
	}
}
