import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	private int anInt3203 = 0;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	private int anInt3212 = 0;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	private int anInt3224 = 0;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	private int anInt3216 = 0;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
	private final int anInt3221;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_9;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	private final int anInt3220;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!hi;")
	private final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Z")
	private final boolean aBoolean262;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Z")
	private final boolean aBoolean261;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Z")
	private final boolean aBoolean263;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!cf;IIZ)V")
	public Class46_Sub2(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3221 = arg2;
		this.aClass43_Sub1_9 = arg0;
		this.anInt3220 = arg1;
		this.anInterface10_1 = arg0.method4214(arg3 ? Static581.aClass93_14 : Static146.aClass93_6, Static461.aClass292_14, arg1, arg2);
		this.anInterface10_1.method6171(true, true);
		this.aBoolean262 = this.anInterface10_1.method6174() != arg1;
		this.aBoolean261 = this.anInterface10_1.method6176() != arg2;
		this.aBoolean263 = !this.aBoolean262 && this.anInterface10_1.method6172();
		this.aBoolean264 = !this.aBoolean261 && this.anInterface10_1.method6172();
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!cf;II[III)V")
	public Class46_Sub2(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3221 = arg2;
		this.aClass43_Sub1_9 = arg0;
		this.anInt3220 = arg1;
		this.anInterface10_1 = arg0.method4239(arg5, arg2, arg1, false, arg3, arg4);
		this.anInterface10_1.method6171(true, true);
		this.aBoolean262 = this.anInterface10_1.method6174() != arg1;
		this.aBoolean261 = this.anInterface10_1.method6176() != arg2;
		this.aBoolean263 = !this.aBoolean262 && this.anInterface10_1.method6172();
		this.aBoolean264 = !this.aBoolean261 && this.anInterface10_1.method6172();
	}

	@OriginalMember(owner = "client!ga", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass43_Sub1_9.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2873(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!ga", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt3212 + this.anInt3221 + this.anInt3224;
	}

	@OriginalMember(owner = "client!ga", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class109_Sub3 local8 = this.aClass43_Sub1_9.method4172();
		@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_9.method4264();
		this.anInterface10_1.method7422(this.aBoolean262 || this.aBoolean261 ? Static206.aClass123_7 : Static40.aClass123_9);
		this.aClass43_Sub1_9.method4276();
		this.aClass43_Sub1_9.method4298(this.anInterface10_1);
		this.aClass43_Sub1_9.method4273(arg8);
		this.aClass43_Sub1_9.method4183(arg6);
		this.aClass43_Sub1_9.method4251(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4241(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4266(arg7);
		if (this.aBoolean260) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(108) float local108 = (arg5 - arg1) / local81;
			@Pc(114) float local114 = (float) this.anInt3224 * local101;
			@Pc(120) float local120 = local108 * (float) this.anInt3224;
			@Pc(126) float local126 = local88 * (float) this.anInt3216;
			@Pc(132) float local132 = (float) this.anInt3216 * local94;
			@Pc(139) float local139 = -local88 * (float) this.anInt3203;
			@Pc(146) float local146 = (float) this.anInt3203 * -local94;
			@Pc(153) float local153 = (float) this.anInt3212 * -local101;
			@Pc(160) float local160 = -local108 * (float) this.anInt3212;
			arg0 = arg0 + local126 + local114;
			arg2 = local114 + local139 + arg2;
			arg1 = local120 + local132 + arg1;
			arg4 = arg4 + local126 + local153;
			arg3 = local120 + arg3 + local146;
			arg5 = local132 + arg5 + local160;
		}
		local8.method7105(1.0F, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1, 0.0F, arg5 - arg1);
		local8.method7113(arg1, 0.0F, arg0);
		local13.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) this.anInt3221));
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4287();
		this.aClass43_Sub1_9.method4231();
		this.aClass43_Sub1_9.method4235();
		this.aClass43_Sub1_9.method4251(1, Static165.aClass252_3);
		this.aClass43_Sub1_9.method4241(1, Static165.aClass252_3);
	}

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt3220;
	}

	@OriginalMember(owner = "client!ga", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class109_Sub3 local8 = this.aClass43_Sub1_9.method4172();
		@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_9.method4264();
		this.anInterface10_1.method7422(this.aBoolean262 || this.aBoolean261 ? Static206.aClass123_7 : Static40.aClass123_9);
		this.aClass43_Sub1_9.method4276();
		this.aClass43_Sub1_9.method4298(this.anInterface10_1);
		this.aClass43_Sub1_9.method4273(arg6);
		this.aClass43_Sub1_9.method4183(arg4);
		this.aClass43_Sub1_9.method4251(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4241(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4266(arg5);
		local13.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) this.anInt3221));
		if (this.aBoolean260) {
			arg2 = this.anInt3220 * arg2 / this.A();
			arg3 = arg3 * this.anInt3221 / this.ca();
			arg0 += arg2 * this.anInt3216 / this.anInt3220;
			arg1 += this.anInt3224 * arg3 / this.anInt3221;
		}
		local8.method7121(0.0F, (float) arg2, (float) arg3);
		local8.U(arg0, arg1, 0);
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4287();
		this.aClass43_Sub1_9.method4231();
		this.aClass43_Sub1_9.method4235();
		this.aClass43_Sub1_9.method4251(1, Static165.aClass252_3);
		this.aClass43_Sub1_9.method4241(1, Static165.aClass252_3);
	}

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3212 = arg3;
		this.anInt3224 = arg1;
		this.anInt3203 = arg2;
		this.anInt3216 = arg0;
		this.aBoolean260 = this.anInt3216 != 0 || this.anInt3224 != 0 || this.anInt3203 != 0 || this.anInt3212 != 0;
	}

	@OriginalMember(owner = "client!ga", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class109_Sub3 local10 = this.aClass43_Sub1_9.method4172();
		@Pc(15) Class109_Sub3 local15 = this.aClass43_Sub1_9.method4264();
		this.anInterface10_1.method7422(Static206.aClass123_7);
		this.aClass43_Sub1_9.method4276();
		this.aClass43_Sub1_9.method4298(this.anInterface10_1);
		this.aClass43_Sub1_9.method4273(arg6);
		this.aClass43_Sub1_9.method4183(arg4);
		this.aClass43_Sub1_9.method4251(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4241(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4266(arg5);
		@Pc(73) boolean local73 = this.aBoolean264 && this.anInt3224 == 0 && this.anInt3212 == 0;
		@Pc(92) boolean local92 = this.aBoolean263 && this.anInt3216 == 0 && this.anInt3203 == 0;
		if (local92 & local73) {
			local15.method7121(1.0F, this.anInterface10_1.method6175((float) arg2), this.anInterface10_1.method6170((float) arg3));
			local10.method7121(0.0F, (float) arg2, (float) arg3);
			local10.U(arg0, arg1, 0);
			this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
			this.aClass43_Sub1_9.method4287();
			this.aClass43_Sub1_9.method4231();
		} else {
			@Pc(104) int local104;
			@Pc(107) int local107;
			@Pc(135) int local135;
			@Pc(140) int local140;
			@Pc(187) int local187;
			if (local92) {
				local104 = arg3 + arg1;
				local107 = this.ca();
				local15.method7121(1.0F, this.anInterface10_1.method6175((float) arg2), this.anInterface10_1.method6170((float) this.anInt3221));
				this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
				local135 = arg1 + this.anInt3224;
				local140 = local135 + this.anInt3221;
				while (local140 <= local104) {
					local10.method7121(0.0F, (float) arg2, (float) this.anInt3221);
					local10.U(arg0, local135, 0);
					this.aClass43_Sub1_9.method4287();
					local140 += local107;
					local135 += local107;
					this.aClass43_Sub1_9.method4231();
				}
				if (local135 < local104) {
					local187 = local104 - local135;
					local15.method7121(1.0F, this.anInterface10_1.method6175((float) arg2), this.anInterface10_1.method6170((float) local187));
					this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
					local10.method7121(0.0F, (float) arg2, (float) local187);
					local10.U(arg0, local135, 0);
					this.aClass43_Sub1_9.method4287();
					this.aClass43_Sub1_9.method4231();
				}
			} else if (local73) {
				local104 = arg0 + arg2;
				local107 = this.A();
				local15.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) arg3));
				this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
				local135 = arg0 + this.anInt3216;
				for (local140 = local135 + this.anInt3220; local140 <= local104; local140 += local107) {
					local10.method7121(0.0F, (float) this.anInt3220, (float) arg3);
					local10.U(local135, arg1, 0);
					this.aClass43_Sub1_9.method4287();
					this.aClass43_Sub1_9.method4231();
					local135 += local107;
				}
				if (local104 > local135) {
					local187 = local104 - local135;
					local15.method7121(1.0F, this.anInterface10_1.method6175((float) local187), this.anInterface10_1.method6170((float) arg3));
					this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
					local10.method7121(0.0F, (float) local187, (float) arg3);
					local10.U(local135, arg1, 0);
					this.aClass43_Sub1_9.method4287();
					this.aClass43_Sub1_9.method4231();
				}
			} else {
				local104 = arg3 + arg1;
				local107 = arg0 + arg2;
				local135 = this.A();
				local140 = this.ca();
				local187 = arg1 + this.anInt3224;
				@Pc(256) int local256 = local187 + this.anInt3221;
				@Pc(287) int local287;
				@Pc(292) int local292;
				@Pc(339) int local339;
				while (local104 >= local256) {
					local15.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) this.anInt3221));
					this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
					local287 = arg0 + this.anInt3216;
					local292 = this.anInt3220 + local287;
					while (local107 >= local292) {
						local10.method7121(0.0F, (float) this.anInt3220, (float) this.anInt3221);
						local10.U(local287, local187, 0);
						this.aClass43_Sub1_9.method4287();
						local292 += local135;
						this.aClass43_Sub1_9.method4231();
						local287 += local135;
					}
					if (local287 < local107) {
						local339 = local107 - local287;
						local15.method7121(1.0F, this.anInterface10_1.method6175((float) local339), this.anInterface10_1.method6170((float) this.anInt3221));
						this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
						local10.method7121(0.0F, (float) local339, (float) this.anInt3221);
						local10.U(local287, local187, 0);
						this.aClass43_Sub1_9.method4287();
						this.aClass43_Sub1_9.method4231();
					}
					local256 += local140;
					local187 += local140;
				}
				if (local187 < local104) {
					local287 = local104 - local187;
					local15.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) local287));
					this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
					local292 = arg0 + this.anInt3216;
					for (local339 = this.anInt3220 + local292; local339 <= local107; local339 += local135) {
						local10.method7121(0.0F, (float) this.anInt3220, (float) local287);
						local10.U(local292, local187, 0);
						this.aClass43_Sub1_9.method4287();
						this.aClass43_Sub1_9.method4231();
						local292 += local135;
					}
					if (local292 < local107) {
						@Pc(488) int local488 = local107 - local292;
						local15.method7121(1.0F, this.anInterface10_1.method6175((float) local488), this.anInterface10_1.method6170((float) local287));
						this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
						local10.method7121(0.0F, (float) local488, (float) local287);
						local10.U(local292, local187, 0);
						this.aClass43_Sub1_9.method4287();
						this.aClass43_Sub1_9.method4231();
					}
				}
			}
		}
		this.aClass43_Sub1_9.method4235();
		this.aClass43_Sub1_9.method4251(1, Static165.aClass252_3);
		this.aClass43_Sub1_9.method4241(1, Static165.aClass252_3);
	}

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class109_Sub3 local8 = this.aClass43_Sub1_9.method4172();
		@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_9.method4264();
		@Pc(18) int local18 = arg0 + this.anInt3216;
		@Pc(23) int local23 = arg1 + this.anInt3224;
		this.anInterface10_1.method7422(Static206.aClass123_7);
		this.aClass43_Sub1_9.method4276();
		this.aClass43_Sub1_9.method4298(this.anInterface10_1);
		this.aClass43_Sub1_9.method4273(arg4);
		this.aClass43_Sub1_9.method4183(arg2);
		this.aClass43_Sub1_9.method4251(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4241(1, Static88.aClass252_2);
		this.aClass43_Sub1_9.method4266(arg3);
		local8.method7121(0.0F, (float) this.anInt3220, (float) this.anInt3221);
		local8.U(local18, local23, 0);
		local13.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) this.anInt3221));
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4287();
		this.aClass43_Sub1_9.method4231();
		this.aClass43_Sub1_9.method4235();
		this.aClass43_Sub1_9.method4251(1, Static165.aClass252_3);
		this.aClass43_Sub1_9.method4241(1, Static165.aClass252_3);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class146_Sub2 local6 = (Class146_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt3216;
		@Pc(16) int local16 = arg1 + this.anInt3224;
		@Pc(19) Interface10 local19 = local6.anInterface10_4;
		this.anInterface10_1.method7422(Static206.aClass123_7);
		this.aClass43_Sub1_9.method4276();
		this.aClass43_Sub1_9.method4298(this.anInterface10_1);
		this.aClass43_Sub1_9.method4273(1);
		this.aClass43_Sub1_9.method4183(1);
		@Pc(49) Class109_Sub3 local49 = this.aClass43_Sub1_9.method4172();
		local49.method7121(0.0F, (float) this.anInt3220, (float) this.anInt3221);
		local49.U(local11, local16, 0);
		this.aClass43_Sub1_9.method4287();
		@Pc(73) Class109_Sub3 local73 = this.aClass43_Sub1_9.method4264();
		local73.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) this.anInt3221));
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4238(1);
		this.aClass43_Sub1_9.method4298(local19);
		this.aClass43_Sub1_9.method4253(Static587.aClass37_5, Static106.aClass37_2);
		this.aClass43_Sub1_9.method4251(0, Static165.aClass252_3);
		@Pc(123) Class109_Sub3 local123 = this.aClass43_Sub1_9.method4264();
		local123.method7121(1.0F, local19.method6175((float) this.anInt3220), local19.method6170((float) this.anInt3221));
		local123.method7113(local19.method6170((float) (local16 - arg4)), 0.0F, local19.method6175((float) (local11 - arg3)));
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4231();
		this.aClass43_Sub1_9.method4235();
		this.aClass43_Sub1_9.method4251(0, Static74.aClass252_1);
		this.aClass43_Sub1_9.method4253(Static106.aClass37_2, Static106.aClass37_2);
		this.aClass43_Sub1_9.method4298(null);
		this.aClass43_Sub1_9.method4238(0);
		this.aClass43_Sub1_9.method4235();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[III)V")
	private void method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface10_1.method6169(arg0, arg4, arg5, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7608(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class146 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class109_Sub3 local8 = this.aClass43_Sub1_9.method4172();
		@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_9.method4264();
		@Pc(16) Class146_Sub2 local16 = (Class146_Sub2) arg6;
		@Pc(19) Interface10 local19 = local16.anInterface10_4;
		this.anInterface10_1.method7422(this.aBoolean262 || this.aBoolean261 ? Static206.aClass123_7 : Static40.aClass123_9);
		this.aClass43_Sub1_9.method4276();
		this.aClass43_Sub1_9.method4298(this.anInterface10_1);
		this.aClass43_Sub1_9.method4273(1);
		this.aClass43_Sub1_9.method4183(1);
		if (this.aBoolean260) {
			@Pc(70) float local70 = (float) this.anInt3220 / (float) this.A();
			@Pc(78) float local78 = (float) this.anInt3221 / (float) this.ca();
			local8.method7105(1.0F, local78 * (arg4 - arg0), local70 * (arg2 - arg0), 0.0F, 0.0F, 0.0F, (arg3 - arg1) * local70, 0.0F, (arg5 - arg1) * local78);
			local8.method7113(local78 * ((float) this.anInt3224 + arg1), 0.0F, ((float) this.anInt3216 + arg0) * local70);
		} else {
			local8.method7105(1.0F, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1, 0.0F, arg5 - arg1);
			local8.method7113(arg1, 0.0F, arg0);
		}
		local13.method7121(1.0F, this.anInterface10_1.method6175((float) this.anInt3220), this.anInterface10_1.method6170((float) this.anInt3221));
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4238(1);
		this.aClass43_Sub1_9.method4298(local19);
		this.aClass43_Sub1_9.method4253(Static587.aClass37_5, Static106.aClass37_2);
		this.aClass43_Sub1_9.method4251(0, Static165.aClass252_3);
		@Pc(206) Class109_Sub3 local206 = this.aClass43_Sub1_9.method4264();
		local206.M(local8);
		local206.U(-arg7, -arg8, 0);
		local206.method7106(local19.method6170(1.0F), 1.0F, local19.method6175(1.0F));
		this.aClass43_Sub1_9.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_9.method4287();
		this.aClass43_Sub1_9.method4231();
		this.aClass43_Sub1_9.method4235();
		this.aClass43_Sub1_9.method4251(0, Static74.aClass252_1);
		this.aClass43_Sub1_9.method4253(Static106.aClass37_2, Static106.aClass37_2);
		this.aClass43_Sub1_9.method4298(null);
		this.aClass43_Sub1_9.method4238(0);
		this.aClass43_Sub1_9.method4235();
	}

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt3220 + this.anInt3216 + this.anInt3203;
	}

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt3221;
	}

	@OriginalMember(owner = "client!ga", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}
}
