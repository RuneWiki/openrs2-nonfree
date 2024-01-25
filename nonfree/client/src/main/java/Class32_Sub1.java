import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
	private int anInt791 = 0;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
	private int anInt793 = 0;

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
	private int anInt800 = 0;

	@OriginalMember(owner = "client!bea", name = "F", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
	private int anInt802 = 0;

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "I")
	private final int anInt804;

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_4;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
	private final int anInt784;

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "Lclient!ch;")
	private final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!bea", name = "r", descriptor = "Z")
	private final boolean aBoolean36;

	@OriginalMember(owner = "client!bea", name = "D", descriptor = "Z")
	private final boolean aBoolean38;

	@OriginalMember(owner = "client!bea", name = "C", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "Z")
	private final boolean aBoolean35;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!wu;IIZ)V")
	public Class32_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt804 = arg1;
		this.aClass100_Sub1_4 = arg0;
		this.anInt784 = arg2;
		this.anInterface3_1 = arg0.method6082(Static409.aClass242_13, arg1, arg3 ? Static203.aClass250_7 : Static600.aClass250_16, arg2);
		this.anInterface3_1.method7839(true, true);
		this.aBoolean36 = arg1 != this.anInterface3_1.method7841();
		this.aBoolean38 = this.anInterface3_1.method7840() != arg2;
		this.aBoolean37 = !this.aBoolean36 && this.anInterface3_1.method7847();
		this.aBoolean35 = !this.aBoolean38 && this.anInterface3_1.method7847();
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!wu;II[III)V")
	public Class32_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass100_Sub1_4 = arg0;
		this.anInt784 = arg2;
		this.anInt804 = arg1;
		this.anInterface3_1 = arg0.method6156(arg5, false, arg2, arg1, arg3, arg4);
		this.anInterface3_1.method7839(true, true);
		this.aBoolean36 = this.anInterface3_1.method7841() != arg1;
		this.aBoolean38 = arg2 != this.anInterface3_1.method7840();
		this.aBoolean37 = !this.aBoolean36 && this.anInterface3_1.method7847();
		this.aBoolean35 = !this.aBoolean38 && this.anInterface3_1.method7847();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass100_Sub1_4.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method754(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "()I")
	@Override
	public int method5080() {
		return this.anInt804 + this.anInt791 + this.anInt800;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt791 = arg0;
		this.anInt800 = arg2;
		this.anInt793 = arg3;
		this.anInt802 = arg1;
		this.aBoolean39 = this.anInt791 != 0 || this.anInt802 != 0 || this.anInt800 != 0 || this.anInt793 != 0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class154_Sub2 local8 = this.aClass100_Sub1_4.method6073();
		@Pc(13) Class154_Sub2 local13 = this.aClass100_Sub1_4.method6038();
		@Pc(18) int local18 = arg1 + this.anInt802;
		@Pc(23) int local23 = arg0 + this.anInt791;
		this.anInterface3_1.method7827(Static514.aClass82_10);
		this.aClass100_Sub1_4.method6045();
		this.aClass100_Sub1_4.method6033(this.anInterface3_1);
		this.aClass100_Sub1_4.method6144(arg4);
		this.aClass100_Sub1_4.method6092(arg2);
		this.aClass100_Sub1_4.method6068(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6146(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6154(arg3);
		local8.method4517((float) this.anInt804, 0.0F, (float) this.anInt784);
		local8.method6570(local23, local18, 0);
		local13.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6145();
		this.aClass100_Sub1_4.method6161();
		this.aClass100_Sub1_4.method6149();
		this.aClass100_Sub1_4.method6068(1, Static506.aClass187_3);
		this.aClass100_Sub1_4.method6146(1, Static506.aClass187_3);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
	@Override
	public void method5086(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass100_Sub1_4.na(0, 0, this.anInt804, this.anInt784);
		@Pc(22) int[] local22 = new int[this.anInt804 * this.anInt784];
		this.anInterface3_1.method7843(local22, this.anInt784, this.anInt804);
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (arg0 == 0) {
			for (local38 = 0; local38 < this.anInt784; local38++) {
				local45 = local38 * this.anInt804;
				for (local47 = 0; local47 < this.anInt804; local47++) {
					local22[local47 + local45] = local22[local45 + local47] & 0xFFFFFF | (local15[local45 + local47] & 0x1CFF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local38 = 0; local38 < this.anInt784; local38++) {
				local45 = local38 * this.anInt804;
				for (local47 = 0; local47 < this.anInt804; local47++) {
					local22[local47 + local45] = (local15[local45 + local47] == 0 ? 0 : -16777216) | local22[local45 + local47] & 0xFFFFFF;
				}
			}
		}
		this.method754(0, 0, this.anInt804, this.anInt784, local22, this.anInt804);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg1 + this.anInt802;
		@Pc(16) int local16 = arg0 + this.anInt791;
		@Pc(19) Interface3 local19 = local6.anInterface3_6;
		this.anInterface3_1.method7827(Static514.aClass82_10);
		this.aClass100_Sub1_4.method6045();
		this.aClass100_Sub1_4.method6033(this.anInterface3_1);
		this.aClass100_Sub1_4.method6144(1);
		this.aClass100_Sub1_4.method6092(1);
		@Pc(49) Class154_Sub2 local49 = this.aClass100_Sub1_4.method6073();
		local49.method4517((float) this.anInt804, 0.0F, (float) this.anInt784);
		local49.method6570(local16, local11, 0);
		this.aClass100_Sub1_4.method6145();
		@Pc(73) Class154_Sub2 local73 = this.aClass100_Sub1_4.method6038();
		local73.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6114(1);
		this.aClass100_Sub1_4.method6033(local19);
		this.aClass100_Sub1_4.method6039(Static266.aClass256_3, Static436.aClass256_4);
		this.aClass100_Sub1_4.method6068(0, Static506.aClass187_3);
		@Pc(123) Class154_Sub2 local123 = this.aClass100_Sub1_4.method6038();
		local123.method4517(local19.method7846((float) this.anInt804), 1.0F, local19.method7845((float) this.anInt784));
		local123.method4522(local19.method7846((float) (local16 - arg3)), local19.method7845((float) (local11 - arg4)), 0.0F);
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6161();
		this.aClass100_Sub1_4.method6149();
		this.aClass100_Sub1_4.method6068(0, Static622.aClass187_4);
		this.aClass100_Sub1_4.method6039(Static266.aClass256_3, Static266.aClass256_3);
		this.aClass100_Sub1_4.method6033((Interface1) null);
		this.aClass100_Sub1_4.method6114(0);
		this.aClass100_Sub1_4.method6149();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([I)V")
	@Override
	public void method5082(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt791;
		arg0[2] = this.anInt800;
		arg0[1] = this.anInt802;
		arg0[3] = this.anInt793;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5078(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class154_Sub2 local8 = this.aClass100_Sub1_4.method6073();
		@Pc(13) Class154_Sub2 local13 = this.aClass100_Sub1_4.method6038();
		this.anInterface3_1.method7827(this.aBoolean36 || this.aBoolean38 ? Static514.aClass82_10 : Static55.aClass82_1);
		this.aClass100_Sub1_4.method6045();
		this.aClass100_Sub1_4.method6033(this.anInterface3_1);
		this.aClass100_Sub1_4.method6144(1);
		this.aClass100_Sub1_4.method6092(arg6);
		this.aClass100_Sub1_4.method6068(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6146(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6154(arg7);
		if (this.aBoolean39) {
			@Pc(77) float local77 = (float) this.method5080();
			@Pc(81) float local81 = (float) this.method5079();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt802 * local101;
			@Pc(119) float local119 = (float) this.anInt802 * local107;
			@Pc(125) float local125 = (float) this.anInt791 * local88;
			@Pc(131) float local131 = (float) this.anInt791 * local94;
			@Pc(138) float local138 = -local88 * (float) this.anInt800;
			@Pc(145) float local145 = -local94 * (float) this.anInt800;
			@Pc(152) float local152 = -local101 * (float) this.anInt793;
			arg0 = local125 + arg0 + local113;
			arg1 = local119 + local131 + arg1;
			@Pc(171) float local171 = (float) this.anInt793 * -local107;
			arg4 = local152 + arg4 + local125;
			arg2 = local113 + arg2 + local138;
			arg3 = local119 + local145 + arg3;
			arg5 = arg5 + local131 + local171;
		}
		local8.method4513(0.0F, arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, arg2 - arg0, 1.0F, 0.0F, arg5 - arg1);
		local8.method4522(arg0, arg1, 0.0F);
		local13.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6145();
		this.aClass100_Sub1_4.method6161();
		this.aClass100_Sub1_4.method6149();
		this.aClass100_Sub1_4.method6068(1, Static506.aClass187_3);
		this.aClass100_Sub1_4.method6146(1, Static506.aClass187_3);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "()I")
	@Override
	public int method5077() {
		return this.anInt784;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII[III)V")
	private void method754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface3_1.method7842(arg2, arg0, arg3, arg5, arg1, arg4);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class154_Sub2 local10 = this.aClass100_Sub1_4.method6073();
		@Pc(15) Class154_Sub2 local15 = this.aClass100_Sub1_4.method6038();
		this.anInterface3_1.method7827(Static514.aClass82_10);
		this.aClass100_Sub1_4.method6045();
		this.aClass100_Sub1_4.method6033(this.anInterface3_1);
		this.aClass100_Sub1_4.method6144(arg6);
		this.aClass100_Sub1_4.method6092(arg4);
		this.aClass100_Sub1_4.method6068(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6146(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6154(arg5);
		@Pc(73) boolean local73 = this.aBoolean35 && this.anInt802 == 0 && this.anInt793 == 0;
		@Pc(86) boolean local86 = this.aBoolean37 && this.anInt791 == 0 && this.anInt800 == 0;
		if (local73 & local86) {
			local15.method4517(this.anInterface3_1.method7846((float) arg2), 1.0F, this.anInterface3_1.method7845((float) arg3));
			local10.method4517((float) arg2, 0.0F, (float) arg3);
			local10.method6570(arg0, arg1, 0);
			this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
			this.aClass100_Sub1_4.method6145();
			this.aClass100_Sub1_4.method6161();
		} else {
			@Pc(142) int local142;
			@Pc(145) int local145;
			@Pc(172) int local172;
			@Pc(177) int local177;
			@Pc(220) int local220;
			if (local86) {
				local142 = arg1 + arg3;
				local145 = this.method5079();
				local15.method4517(this.anInterface3_1.method7846((float) arg2), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
				this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
				local172 = this.anInt802 + arg1;
				local177 = this.anInt784 + local172;
				while (local142 >= local177) {
					local10.method4517((float) arg2, 0.0F, (float) this.anInt784);
					local10.method6570(arg0, local172, 0);
					this.aClass100_Sub1_4.method6145();
					local177 += local145;
					this.aClass100_Sub1_4.method6161();
					local172 += local145;
				}
				if (local172 < local142) {
					local220 = local142 - local172;
					local15.method4517(this.anInterface3_1.method7846((float) arg2), 1.0F, this.anInterface3_1.method7845((float) local220));
					this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
					local10.method4517((float) arg2, 0.0F, (float) local220);
					local10.method6570(arg0, local172, 0);
					this.aClass100_Sub1_4.method6145();
					this.aClass100_Sub1_4.method6161();
				}
			} else if (local73) {
				local142 = arg2 + arg0;
				local145 = this.method5080();
				local15.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) arg3));
				this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
				local172 = this.anInt791 + arg0;
				local177 = local172 + this.anInt804;
				while (local177 <= local142) {
					local10.method4517((float) this.anInt804, 0.0F, (float) arg3);
					local10.method6570(local172, arg1, 0);
					this.aClass100_Sub1_4.method6145();
					local172 += local145;
					local177 += local145;
					this.aClass100_Sub1_4.method6161();
				}
				if (local142 > local172) {
					local220 = local142 - local172;
					local15.method4517(this.anInterface3_1.method7846((float) local220), 1.0F, this.anInterface3_1.method7845((float) arg3));
					this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
					local10.method4517((float) local220, 0.0F, (float) arg3);
					local10.method6570(local172, arg1, 0);
					this.aClass100_Sub1_4.method6145();
					this.aClass100_Sub1_4.method6161();
				}
			} else {
				local142 = arg1 + arg3;
				local145 = arg2 + arg0;
				local172 = this.method5080();
				local177 = this.method5079();
				local220 = this.anInt802 + arg1;
				@Pc(289) int local289 = this.anInt784 + local220;
				@Pc(319) int local319;
				@Pc(325) int local325;
				@Pc(369) int local369;
				while (local142 >= local289) {
					local15.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
					this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
					local319 = arg0 + this.anInt791;
					for (local325 = local319 + this.anInt804; local325 <= local145; local325 += local172) {
						local10.method4517((float) this.anInt804, 0.0F, (float) this.anInt784);
						local10.method6570(local319, local220, 0);
						this.aClass100_Sub1_4.method6145();
						this.aClass100_Sub1_4.method6161();
						local319 += local172;
					}
					if (local319 < local145) {
						local369 = local145 - local319;
						local15.method4517(this.anInterface3_1.method7846((float) local369), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
						this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
						local10.method4517((float) local369, 0.0F, (float) this.anInt784);
						local10.method6570(local319, local220, 0);
						this.aClass100_Sub1_4.method6145();
						this.aClass100_Sub1_4.method6161();
					}
					local289 += local177;
					local220 += local177;
				}
				if (local142 > local220) {
					local319 = local142 - local220;
					local15.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) local319));
					this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
					local325 = this.anInt791 + arg0;
					local369 = local325 + this.anInt804;
					while (local145 >= local369) {
						local10.method4517((float) this.anInt804, 0.0F, (float) local319);
						local10.method6570(local325, local220, 0);
						this.aClass100_Sub1_4.method6145();
						local369 += local172;
						this.aClass100_Sub1_4.method6161();
						local325 += local172;
					}
					if (local325 < local145) {
						@Pc(515) int local515 = local145 - local325;
						local15.method4517(this.anInterface3_1.method7846((float) local515), 1.0F, this.anInterface3_1.method7845((float) local319));
						this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
						local10.method4517((float) local515, 0.0F, (float) local319);
						local10.method6570(local325, local220, 0);
						this.aClass100_Sub1_4.method6145();
						this.aClass100_Sub1_4.method6161();
					}
				}
			}
		}
		this.aClass100_Sub1_4.method6149();
		this.aClass100_Sub1_4.method6068(1, Static506.aClass187_3);
		this.aClass100_Sub1_4.method6146(1, Static506.aClass187_3);
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "()I")
	@Override
	public int method5079() {
		return this.anInt802 + this.anInt784 + this.anInt793;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class154_Sub2 local8 = this.aClass100_Sub1_4.method6073();
		@Pc(13) Class154_Sub2 local13 = this.aClass100_Sub1_4.method6038();
		this.anInterface3_1.method7827(this.aBoolean36 || this.aBoolean38 ? Static514.aClass82_10 : Static55.aClass82_1);
		this.aClass100_Sub1_4.method6045();
		this.aClass100_Sub1_4.method6033(this.anInterface3_1);
		this.aClass100_Sub1_4.method6144(arg6);
		this.aClass100_Sub1_4.method6092(arg4);
		this.aClass100_Sub1_4.method6068(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6146(1, Static456.aClass187_2);
		this.aClass100_Sub1_4.method6154(arg5);
		local13.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
		if (this.aBoolean39) {
			arg2 = arg2 * this.anInt804 / this.method5080();
			arg3 = arg3 * this.anInt784 / this.method5079();
			arg0 += this.anInt791 * arg2 / this.anInt804;
			arg1 += this.anInt802 * arg3 / this.anInt784;
		}
		local8.method4517((float) arg2, 0.0F, (float) arg3);
		local8.method6570(arg0, arg1, 0);
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6145();
		this.aClass100_Sub1_4.method6161();
		this.aClass100_Sub1_4.method6149();
		this.aClass100_Sub1_4.method6068(1, Static506.aClass187_3);
		this.aClass100_Sub1_4.method6146(1, Static506.aClass187_3);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "()I")
	@Override
	public int method5072() {
		return this.anInt804;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class154_Sub2 local8 = this.aClass100_Sub1_4.method6073();
		@Pc(13) Class154_Sub2 local13 = this.aClass100_Sub1_4.method6038();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface3 local19 = local16.anInterface3_6;
		this.anInterface3_1.method7827(this.aBoolean36 || this.aBoolean38 ? Static514.aClass82_10 : Static55.aClass82_1);
		this.aClass100_Sub1_4.method6045();
		this.aClass100_Sub1_4.method6033(this.anInterface3_1);
		this.aClass100_Sub1_4.method6144(1);
		this.aClass100_Sub1_4.method6092(1);
		if (this.aBoolean39) {
			@Pc(100) float local100 = (float) this.anInt804 / (float) this.method5080();
			@Pc(108) float local108 = (float) this.anInt784 / (float) this.method5079();
			local8.method4513(0.0F, local108 * (arg4 - arg0), 0.0F, 0.0F, local100 * (arg3 - arg1), (arg2 - arg0) * local100, 1.0F, 0.0F, (arg5 - arg1) * local108);
			local8.method4522(local100 * ((float) this.anInt791 + arg0), local108 * ((float) this.anInt802 + arg1), 0.0F);
		} else {
			local8.method4513(0.0F, arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, -arg0 + arg2, 1.0F, 0.0F, arg5 - arg1);
			local8.method4522(arg0, arg1, 0.0F);
		}
		local13.method4517(this.anInterface3_1.method7846((float) this.anInt804), 1.0F, this.anInterface3_1.method7845((float) this.anInt784));
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6114(1);
		this.aClass100_Sub1_4.method6033(local19);
		this.aClass100_Sub1_4.method6039(Static266.aClass256_3, Static436.aClass256_4);
		this.aClass100_Sub1_4.method6068(0, Static506.aClass187_3);
		@Pc(206) Class154_Sub2 local206 = this.aClass100_Sub1_4.method6038();
		local206.method6563(local8);
		local206.method6570(-arg7, -arg8, 0);
		local206.method4525(local19.method7845(1.0F), 1.0F, local19.method7846(1.0F));
		this.aClass100_Sub1_4.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_4.method6145();
		this.aClass100_Sub1_4.method6161();
		this.aClass100_Sub1_4.method6149();
		this.aClass100_Sub1_4.method6068(0, Static622.aClass187_4);
		this.aClass100_Sub1_4.method6039(Static266.aClass256_3, Static266.aClass256_3);
		this.aClass100_Sub1_4.method6033((Interface1) null);
		this.aClass100_Sub1_4.method6114(0);
		this.aClass100_Sub1_4.method6149();
	}
}
