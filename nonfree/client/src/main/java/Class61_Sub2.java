import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	private int anInt1999 = 0;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
	private int anInt2002 = 0;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	private int anInt1998 = 0;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
	private int anInt2001 = 0;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	private final int anInt1993;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_6;

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
	private final int anInt2003;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!oia;")
	private final Interface19 anInterface19_3;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "Z")
	private final boolean aBoolean148;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "Z")
	private final boolean aBoolean147;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Z")
	private final boolean aBoolean146;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!pga;IIZ)V")
	public Class61_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1993 = arg2;
		this.aClass95_Sub3_6 = arg0;
		this.anInt2003 = arg1;
		this.anInterface19_3 = arg0.method7147(arg1, arg2, Static290.aClass189_11, arg3 ? Static393.aClass188_12 : Static566.aClass188_13);
		this.anInterface19_3.method3138(true, true);
		this.aBoolean148 = this.anInterface19_3.method3134() != arg1;
		this.aBoolean147 = arg2 != this.anInterface19_3.method3133();
		this.aBoolean145 = !this.aBoolean148 && this.anInterface19_3.method3131();
		this.aBoolean146 = !this.aBoolean147 && this.anInterface19_3.method3131();
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!pga;II[III)V")
	public Class61_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1993 = arg2;
		this.anInt2003 = arg1;
		this.aClass95_Sub3_6 = arg0;
		this.anInterface19_3 = arg0.method7089(arg4, arg1, arg5, arg2, false, arg3);
		this.anInterface19_3.method3138(true, true);
		this.aBoolean148 = this.anInterface19_3.method3134() != arg1;
		this.aBoolean147 = arg2 != this.anInterface19_3.method3133();
		this.aBoolean145 = !this.aBoolean148 && this.anInterface19_3.method3131();
		this.aBoolean146 = !this.aBoolean147 && this.anInterface19_3.method3131();
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "()I")
	@Override
	public int method6447() {
		return this.anInt1993;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass95_Sub3_6.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1646(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Interface19 local9 = local6.anInterface19_6;
		@Pc(14) int local14 = arg1 + this.anInt2001;
		@Pc(19) int local19 = arg0 + this.anInt1999;
		this.anInterface19_3.method7837(Static499.aClass328_9);
		this.aClass95_Sub3_6.method7064();
		this.aClass95_Sub3_6.method7112(this.anInterface19_3);
		this.aClass95_Sub3_6.method7137(1);
		this.aClass95_Sub3_6.method7026(1);
		@Pc(49) Class177_Sub1 local49 = this.aClass95_Sub3_6.method7041();
		local49.method3840((float) this.anInt1993, 0.0F, (float) this.anInt2003);
		local49.method7872(local19, local14, 0);
		this.aClass95_Sub3_6.method7062();
		@Pc(73) Class177_Sub1 local73 = this.aClass95_Sub3_6.method7017();
		local73.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7145(1);
		this.aClass95_Sub3_6.method7112(local9);
		this.aClass95_Sub3_6.method7023(Static483.aClass136_6, Static225.aClass136_3);
		this.aClass95_Sub3_6.method7139(0, Static10.aClass291_1);
		@Pc(123) Class177_Sub1 local123 = this.aClass95_Sub3_6.method7017();
		local123.method3840(local9.method3137((float) this.anInt1993), 1.0F, local9.method3136((float) this.anInt2003));
		local123.method3842(local9.method3137((float) (local14 - arg4)), 0.0F, local9.method3136((float) (local19 - arg3)));
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7024();
		this.aClass95_Sub3_6.method7105();
		this.aClass95_Sub3_6.method7139(0, Static634.aClass291_4);
		this.aClass95_Sub3_6.method7023(Static483.aClass136_6, Static483.aClass136_6);
		this.aClass95_Sub3_6.method7112(null);
		this.aClass95_Sub3_6.method7145(0);
		this.aClass95_Sub3_6.method7105();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class177_Sub1 local8 = this.aClass95_Sub3_6.method7041();
		@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_6.method7017();
		@Pc(18) int local18 = arg1 + this.anInt2001;
		@Pc(23) int local23 = arg0 + this.anInt1999;
		this.anInterface19_3.method7837(Static499.aClass328_9);
		this.aClass95_Sub3_6.method7064();
		this.aClass95_Sub3_6.method7112(this.anInterface19_3);
		this.aClass95_Sub3_6.method7137(arg4);
		this.aClass95_Sub3_6.method7026(arg2);
		this.aClass95_Sub3_6.method7139(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7095(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7079(arg3);
		local8.method3840((float) this.anInt1993, 0.0F, (float) this.anInt2003);
		local8.method7872(local23, local18, 0);
		local13.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7062();
		this.aClass95_Sub3_6.method7024();
		this.aClass95_Sub3_6.method7105();
		this.aClass95_Sub3_6.method7139(1, Static10.aClass291_1);
		this.aClass95_Sub3_6.method7095(1, Static10.aClass291_1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method6453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class177_Sub1 local8 = this.aClass95_Sub3_6.method7041();
		@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_6.method7017();
		this.anInterface19_3.method7837(this.aBoolean148 || this.aBoolean147 ? Static499.aClass328_9 : Static541.aClass328_10);
		this.aClass95_Sub3_6.method7064();
		this.aClass95_Sub3_6.method7112(this.anInterface19_3);
		this.aClass95_Sub3_6.method7137(1);
		this.aClass95_Sub3_6.method7026(arg6);
		this.aClass95_Sub3_6.method7139(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7095(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7079(arg7);
		if (this.aBoolean144) {
			@Pc(77) float local77 = (float) this.method6446();
			@Pc(81) float local81 = (float) this.method6438();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(93) float local93 = (arg3 - arg1) / local77;
			@Pc(99) float local99 = (arg4 - arg0) / local81;
			@Pc(105) float local105 = (arg5 - arg1) / local81;
			@Pc(111) float local111 = (float) this.anInt2001 * local99;
			@Pc(117) float local117 = local105 * (float) this.anInt2001;
			@Pc(123) float local123 = local87 * (float) this.anInt1999;
			@Pc(129) float local129 = local93 * (float) this.anInt1999;
			@Pc(136) float local136 = -local87 * (float) this.anInt2002;
			@Pc(143) float local143 = -local93 * (float) this.anInt2002;
			@Pc(150) float local150 = -local99 * (float) this.anInt1998;
			arg0 = local111 + arg0 + local123;
			@Pc(163) float local163 = (float) this.anInt1998 * -local105;
			arg2 = local111 + local136 + arg2;
			arg3 = local117 + local143 + arg3;
			arg1 = arg1 + local129 + local117;
			arg4 = arg4 + local123 + local150;
			arg5 = local163 + arg5 + local129;
		}
		local8.method3829(arg5 - arg1, -arg1 + arg3, 0.0F, 0.0F, 1.0F, arg2 - arg0, 0.0F, arg4 - arg0, 0.0F);
		local8.method3842(arg1, 0.0F, arg0);
		local13.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7062();
		this.aClass95_Sub3_6.method7024();
		this.aClass95_Sub3_6.method7105();
		this.aClass95_Sub3_6.method7139(1, Static10.aClass291_1);
		this.aClass95_Sub3_6.method7095(1, Static10.aClass291_1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()I")
	@Override
	public int method6438() {
		return this.anInt1993 + this.anInt2001 + this.anInt1998;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class177_Sub1 local10 = this.aClass95_Sub3_6.method7041();
		@Pc(15) Class177_Sub1 local15 = this.aClass95_Sub3_6.method7017();
		this.anInterface19_3.method7837(Static499.aClass328_9);
		this.aClass95_Sub3_6.method7064();
		this.aClass95_Sub3_6.method7112(this.anInterface19_3);
		this.aClass95_Sub3_6.method7137(arg6);
		this.aClass95_Sub3_6.method7026(arg4);
		this.aClass95_Sub3_6.method7139(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7095(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7079(arg5);
		@Pc(76) boolean local76 = this.aBoolean146 && this.anInt2001 == 0 && this.anInt1998 == 0;
		@Pc(89) boolean local89 = this.aBoolean145 && this.anInt1999 == 0 && this.anInt2002 == 0;
		if (local89 & local76) {
			local15.method3840(this.anInterface19_3.method3137((float) arg3), 1.0F, this.anInterface19_3.method3136((float) arg2));
			local10.method3840((float) arg3, 0.0F, (float) arg2);
			local10.method7872(arg0, arg1, 0);
			this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
			this.aClass95_Sub3_6.method7062();
			this.aClass95_Sub3_6.method7024();
		} else {
			@Pc(143) int local143;
			@Pc(146) int local146;
			@Pc(173) int local173;
			@Pc(178) int local178;
			@Pc(229) int local229;
			if (local89) {
				local143 = arg1 + arg3;
				local146 = this.method6438();
				local15.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) arg2));
				this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
				local173 = this.anInt2001 + arg1;
				local178 = this.anInt1993 + local173;
				while (local143 >= local178) {
					local10.method3840((float) this.anInt1993, 0.0F, (float) arg2);
					local10.method7872(arg0, local173, 0);
					this.aClass95_Sub3_6.method7062();
					local173 += local146;
					local178 += local146;
					this.aClass95_Sub3_6.method7024();
				}
				if (local143 > local173) {
					local229 = local143 - local173;
					local15.method3840(this.anInterface19_3.method3137((float) local229), 1.0F, this.anInterface19_3.method3136((float) arg2));
					this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
					local10.method3840((float) local229, 0.0F, (float) arg2);
					local10.method7872(arg0, local173, 0);
					this.aClass95_Sub3_6.method7062();
					this.aClass95_Sub3_6.method7024();
				}
			} else if (local76) {
				local143 = arg2 + arg0;
				local146 = this.method6446();
				local15.method3840(this.anInterface19_3.method3137((float) arg3), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
				this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
				local173 = this.anInt1999 + arg0;
				local178 = this.anInt2003 + local173;
				while (local143 >= local178) {
					local10.method3840((float) arg3, 0.0F, (float) this.anInt2003);
					local10.method7872(local173, arg1, 0);
					this.aClass95_Sub3_6.method7062();
					local173 += local146;
					local178 += local146;
					this.aClass95_Sub3_6.method7024();
				}
				if (local143 > local173) {
					local229 = local143 - local173;
					local15.method3840(this.anInterface19_3.method3137((float) arg3), 1.0F, this.anInterface19_3.method3136((float) local229));
					this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
					local10.method3840((float) arg3, 0.0F, (float) local229);
					local10.method7872(local173, arg1, 0);
					this.aClass95_Sub3_6.method7062();
					this.aClass95_Sub3_6.method7024();
				}
			} else {
				local143 = arg1 + arg3;
				local146 = arg2 + arg0;
				local173 = this.method6446();
				local178 = this.method6438();
				local229 = arg1 + this.anInt2001;
				@Pc(332) int local332;
				@Pc(337) int local337;
				@Pc(381) int local381;
				for (@Pc(301) int local301 = local229 + this.anInt1993; local301 <= local143; local301 += local178) {
					local15.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
					this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
					local332 = arg0 + this.anInt1999;
					for (local337 = this.anInt2003 + local332; local337 <= local146; local337 += local173) {
						local10.method3840((float) this.anInt1993, 0.0F, (float) this.anInt2003);
						local10.method7872(local332, local229, 0);
						this.aClass95_Sub3_6.method7062();
						this.aClass95_Sub3_6.method7024();
						local332 += local173;
					}
					if (local146 > local332) {
						local381 = local146 - local332;
						local15.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) local381));
						this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
						local10.method3840((float) this.anInt1993, 0.0F, (float) local381);
						local10.method7872(local332, local229, 0);
						this.aClass95_Sub3_6.method7062();
						this.aClass95_Sub3_6.method7024();
					}
					local229 += local178;
				}
				if (local143 > local229) {
					local332 = local143 - local229;
					local15.method3840(this.anInterface19_3.method3137((float) local332), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
					this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
					local337 = arg0 + this.anInt1999;
					local381 = local337 + this.anInt2003;
					while (local381 <= local146) {
						local10.method3840((float) local332, 0.0F, (float) this.anInt2003);
						local10.method7872(local337, local229, 0);
						this.aClass95_Sub3_6.method7062();
						local337 += local173;
						local381 += local173;
						this.aClass95_Sub3_6.method7024();
					}
					if (local146 > local337) {
						@Pc(524) int local524 = local146 - local337;
						local15.method3840(this.anInterface19_3.method3137((float) local332), 1.0F, this.anInterface19_3.method3136((float) local524));
						this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
						local10.method3840((float) local332, 0.0F, (float) local524);
						local10.method7872(local337, local229, 0);
						this.aClass95_Sub3_6.method7062();
						this.aClass95_Sub3_6.method7024();
					}
				}
			}
		}
		this.aClass95_Sub3_6.method7105();
		this.aClass95_Sub3_6.method7139(1, Static10.aClass291_1);
		this.aClass95_Sub3_6.method7095(1, Static10.aClass291_1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	@Override
	public void method6450(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass95_Sub3_6.na(0, 0, this.anInt2003, this.anInt1993);
		@Pc(22) int[] local22 = new int[this.anInt2003 * this.anInt1993];
		this.anInterface19_3.method3132(this.anInt1993, this.anInt2003, local22);
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (arg0 == 0) {
			for (local38 = 0; local38 < this.anInt1993; local38++) {
				local45 = local38 * this.anInt2003;
				for (local47 = 0; local47 < this.anInt2003; local47++) {
					local22[local45 + local47] = (local15[local45 + local47] & 0x2AFF0000) << 8 | local22[local45 + local47] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local38 = 0; local38 < this.anInt1993; local38++) {
				local45 = this.anInt2003 * local38;
				for (local47 = 0; local47 < this.anInt2003; local47++) {
					local22[local45 + local47] = local22[local47 + local45] & 0xFFFFFF | (local15[local47 + local45] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method1646(0, 0, this.anInt2003, this.anInt1993, local22, this.anInt2003);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "()I")
	@Override
	public int method6445() {
		return this.anInt2003;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(IIII)V")
	@Override
	public void method6436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2002 = arg2;
		this.anInt1998 = arg3;
		this.anInt1999 = arg0;
		this.anInt2001 = arg1;
		this.aBoolean144 = this.anInt1999 != 0 || this.anInt2001 != 0 || this.anInt2002 != 0 || this.anInt1998 != 0;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "()I")
	@Override
	public int method6446() {
		return this.anInt1999 + this.anInt2003 + this.anInt2002;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class177_Sub1 local8 = this.aClass95_Sub3_6.method7041();
		@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_6.method7017();
		this.anInterface19_3.method7837(this.aBoolean148 || this.aBoolean147 ? Static499.aClass328_9 : Static541.aClass328_10);
		this.aClass95_Sub3_6.method7064();
		this.aClass95_Sub3_6.method7112(this.anInterface19_3);
		this.aClass95_Sub3_6.method7137(arg6);
		this.aClass95_Sub3_6.method7026(arg4);
		this.aClass95_Sub3_6.method7139(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7095(1, Static185.aClass291_3);
		this.aClass95_Sub3_6.method7079(arg5);
		local13.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
		if (this.aBoolean144) {
			arg2 = arg2 * this.anInt2003 / this.method6446();
			arg3 = arg3 * this.anInt1993 / this.method6438();
			arg0 += this.anInt1999 * arg2 / this.anInt2003;
			arg1 += arg3 * this.anInt2001 / this.anInt1993;
		}
		local8.method3840((float) arg3, 0.0F, (float) arg2);
		local8.method7872(arg0, arg1, 0);
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7062();
		this.aClass95_Sub3_6.method7024();
		this.aClass95_Sub3_6.method7105();
		this.aClass95_Sub3_6.method7139(1, Static10.aClass291_1);
		this.aClass95_Sub3_6.method7095(1, Static10.aClass291_1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII[III)V")
	private void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface19_3.method3130(arg0, arg5, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6433(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class177_Sub1 local8 = this.aClass95_Sub3_6.method7041();
		@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_6.method7017();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface19 local19 = local16.anInterface19_6;
		this.anInterface19_3.method7837(this.aBoolean148 || this.aBoolean147 ? Static499.aClass328_9 : Static541.aClass328_10);
		this.aClass95_Sub3_6.method7064();
		this.aClass95_Sub3_6.method7112(this.anInterface19_3);
		this.aClass95_Sub3_6.method7137(1);
		this.aClass95_Sub3_6.method7026(1);
		if (this.aBoolean144) {
			@Pc(96) float local96 = (float) this.anInt2003 / (float) this.method6446();
			@Pc(104) float local104 = (float) this.anInt1993 / (float) this.method6438();
			local8.method3829((arg5 - arg1) * local104, (arg3 - arg1) * local96, 0.0F, 0.0F, 1.0F, (arg2 - arg0) * local96, 0.0F, local104 * (arg4 - arg0), 0.0F);
			local8.method3842((arg1 + (float) this.anInt2001) * local104, 0.0F, (arg0 + (float) this.anInt1999) * local96);
		} else {
			local8.method3829(arg5 - arg1, arg3 - arg1, 0.0F, 0.0F, 1.0F, arg2 - arg0, 0.0F, arg4 - arg0, 0.0F);
			local8.method3842(arg1, 0.0F, arg0);
		}
		local13.method3840(this.anInterface19_3.method3137((float) this.anInt1993), 1.0F, this.anInterface19_3.method3136((float) this.anInt2003));
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7145(1);
		this.aClass95_Sub3_6.method7112(local19);
		this.aClass95_Sub3_6.method7023(Static483.aClass136_6, Static225.aClass136_3);
		this.aClass95_Sub3_6.method7139(0, Static10.aClass291_1);
		@Pc(203) Class177_Sub1 local203 = this.aClass95_Sub3_6.method7017();
		local203.method7879(local8);
		local203.method7872(-arg7, -arg8, 0);
		local203.method3835(1.0F, local19.method3136(1.0F), local19.method3137(1.0F));
		this.aClass95_Sub3_6.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_6.method7062();
		this.aClass95_Sub3_6.method7024();
		this.aClass95_Sub3_6.method7105();
		this.aClass95_Sub3_6.method7139(0, Static634.aClass291_4);
		this.aClass95_Sub3_6.method7023(Static483.aClass136_6, Static483.aClass136_6);
		this.aClass95_Sub3_6.method7112(null);
		this.aClass95_Sub3_6.method7145(0);
		this.aClass95_Sub3_6.method7105();
	}
}
