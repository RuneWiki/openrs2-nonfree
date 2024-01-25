import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt1880 = 0;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int anInt1882 = 0;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt1884 = 0;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
	private int anInt1886 = 0;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_5;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	private final int anInt1867;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private final int anInt1875;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Lclient!fj;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Z")
	private final boolean aBoolean124;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!um;IIZ)V")
	public Class38_Sub2(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass162_Sub1_5 = arg0;
		this.anInt1867 = arg2;
		this.anInt1875 = arg1;
		this.anInterface11_1 = arg0.method3849(arg2, arg3 ? Static225.aClass366_3 : Static43.aClass366_2, Static42.aClass35_4, arg1);
		this.anInterface11_1.method7639(true, true);
		this.aBoolean124 = this.anInterface11_1.method7638() != arg1;
		this.aBoolean123 = arg2 != this.anInterface11_1.method7642();
		this.aBoolean126 = !this.aBoolean124 && this.anInterface11_1.method7643();
		this.aBoolean125 = !this.aBoolean123 && this.anInterface11_1.method7643();
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!um;II[III)V")
	public Class38_Sub2(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1875 = arg1;
		this.anInt1867 = arg2;
		this.aClass162_Sub1_5 = arg0;
		this.anInterface11_1 = arg0.method3875(arg3, arg4, arg1, arg5, false, arg2);
		this.anInterface11_1.method7639(true, true);
		this.aBoolean124 = this.anInterface11_1.method7638() != arg1;
		this.aBoolean123 = this.anInterface11_1.method7642() != arg2;
		this.aBoolean126 = !this.aBoolean124 && this.anInterface11_1.method7643();
		this.aBoolean125 = !this.aBoolean123 && this.anInterface11_1.method7643();
	}

	@OriginalMember(owner = "client!eb", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt1884 + this.anInt1867 + this.anInt1882;
	}

	@OriginalMember(owner = "client!eb", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass162_Sub1_5.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1587(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt1875;
	}

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class25_Sub2 local8 = this.aClass162_Sub1_5.method3868();
		@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_5.method3899();
		@Pc(18) int local18 = arg1 + this.anInt1882;
		@Pc(23) int local23 = arg0 + this.anInt1880;
		this.anInterface11_1.method7634(Static55.aClass195_1);
		this.aClass162_Sub1_5.method3881();
		this.aClass162_Sub1_5.method3865(this.anInterface11_1);
		this.aClass162_Sub1_5.method3957(arg4);
		this.aClass162_Sub1_5.method3906(arg2);
		this.aClass162_Sub1_5.method3885(Static504.aClass263_4, 1);
		this.aClass162_Sub1_5.method3877(1, Static504.aClass263_4);
		this.aClass162_Sub1_5.method3891(arg3);
		local8.method2696((float) this.anInt1875, 0.0F, (float) this.anInt1867);
		local8.U(local23, local18, 0);
		local13.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3825();
		this.aClass162_Sub1_5.method3838();
		this.aClass162_Sub1_5.method3855();
		this.aClass162_Sub1_5.method3885(Static64.aClass263_1, 1);
		this.aClass162_Sub1_5.method3877(1, Static64.aClass263_1);
	}

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt1875 + this.anInt1880 + this.anInt1886;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class84_Sub2 local6 = (Class84_Sub2) arg2;
		@Pc(11) int local11 = arg1 + this.anInt1882;
		@Pc(16) int local16 = arg0 + this.anInt1880;
		@Pc(19) Interface11 local19 = local6.anInterface11_2;
		this.anInterface11_1.method7634(Static55.aClass195_1);
		this.aClass162_Sub1_5.method3881();
		this.aClass162_Sub1_5.method3865(this.anInterface11_1);
		this.aClass162_Sub1_5.method3957(1);
		this.aClass162_Sub1_5.method3906(1);
		@Pc(49) Class25_Sub2 local49 = this.aClass162_Sub1_5.method3868();
		local49.method2696((float) this.anInt1875, 0.0F, (float) this.anInt1867);
		local49.U(local16, local11, 0);
		this.aClass162_Sub1_5.method3825();
		@Pc(73) Class25_Sub2 local73 = this.aClass162_Sub1_5.method3899();
		local73.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3926(1);
		this.aClass162_Sub1_5.method3865(local19);
		this.aClass162_Sub1_5.method3867(Static317.aClass247_2, Static460.aClass247_4);
		this.aClass162_Sub1_5.method3885(Static64.aClass263_1, 0);
		@Pc(123) Class25_Sub2 local123 = this.aClass162_Sub1_5.method3899();
		local123.method2696(local19.method7640((float) this.anInt1875), 1.0F, local19.method7636((float) this.anInt1867));
		local123.method2699(0.0F, local19.method7636((float) (local11 - arg4)), local19.method7640((float) (local16 - arg3)));
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3838();
		this.aClass162_Sub1_5.method3855();
		this.aClass162_Sub1_5.method3885(Static191.aClass263_2, 0);
		this.aClass162_Sub1_5.method3867(Static460.aClass247_4, Static460.aClass247_4);
		this.aClass162_Sub1_5.method3865(null);
		this.aClass162_Sub1_5.method3926(0);
		this.aClass162_Sub1_5.method3855();
	}

	@OriginalMember(owner = "client!eb", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class25_Sub2 local8 = this.aClass162_Sub1_5.method3868();
		@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_5.method3899();
		this.anInterface11_1.method7634(this.aBoolean124 || this.aBoolean123 ? Static55.aClass195_1 : Class12_Sub2_Sub5_Sub2.lb);
		this.aClass162_Sub1_5.method3881();
		this.aClass162_Sub1_5.method3865(this.anInterface11_1);
		this.aClass162_Sub1_5.method3957(arg6);
		this.aClass162_Sub1_5.method3906(arg4);
		this.aClass162_Sub1_5.method3885(Static504.aClass263_4, 1);
		this.aClass162_Sub1_5.method3877(1, Static504.aClass263_4);
		this.aClass162_Sub1_5.method3891(arg5);
		local13.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
		if (this.aBoolean122) {
			arg2 = arg2 * this.anInt1875 / this.A();
			arg3 = this.anInt1867 * arg3 / this.ca();
			arg0 += arg2 * this.anInt1880 / this.anInt1875;
			arg1 += this.anInt1882 * arg3 / this.anInt1867;
		}
		local8.method2696((float) arg2, 0.0F, (float) arg3);
		local8.U(arg0, arg1, 0);
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3825();
		this.aClass162_Sub1_5.method3838();
		this.aClass162_Sub1_5.method3855();
		this.aClass162_Sub1_5.method3885(Static64.aClass263_1, 1);
		this.aClass162_Sub1_5.method3877(1, Static64.aClass263_1);
	}

	@OriginalMember(owner = "client!eb", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class25_Sub2 local10 = this.aClass162_Sub1_5.method3868();
		@Pc(15) Class25_Sub2 local15 = this.aClass162_Sub1_5.method3899();
		this.anInterface11_1.method7634(Static55.aClass195_1);
		this.aClass162_Sub1_5.method3881();
		this.aClass162_Sub1_5.method3865(this.anInterface11_1);
		this.aClass162_Sub1_5.method3957(arg6);
		this.aClass162_Sub1_5.method3906(arg4);
		this.aClass162_Sub1_5.method3885(Static504.aClass263_4, 1);
		this.aClass162_Sub1_5.method3877(1, Static504.aClass263_4);
		this.aClass162_Sub1_5.method3891(arg5);
		@Pc(73) boolean local73 = this.aBoolean125 && this.anInt1882 == 0 && this.anInt1884 == 0;
		@Pc(92) boolean local92 = this.aBoolean126 && this.anInt1880 == 0 && this.anInt1886 == 0;
		if (local92 & local73) {
			local15.method2696(this.anInterface11_1.method7640((float) arg2), 1.0F, this.anInterface11_1.method7636((float) arg3));
			local10.method2696((float) arg2, 0.0F, (float) arg3);
			local10.U(arg0, arg1, 0);
			this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
			this.aClass162_Sub1_5.method3825();
			this.aClass162_Sub1_5.method3838();
		} else {
			@Pc(146) int local146;
			@Pc(149) int local149;
			@Pc(176) int local176;
			@Pc(181) int local181;
			@Pc(228) int local228;
			if (local92) {
				local146 = arg3 + arg1;
				local149 = this.ca();
				local15.method2696(this.anInterface11_1.method7640((float) arg2), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
				this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
				local176 = this.anInt1882 + arg1;
				local181 = local176 + this.anInt1867;
				while (local181 <= local146) {
					local10.method2696((float) arg2, 0.0F, (float) this.anInt1867);
					local10.U(arg0, local176, 0);
					this.aClass162_Sub1_5.method3825();
					local181 += local149;
					this.aClass162_Sub1_5.method3838();
					local176 += local149;
				}
				if (local146 > local176) {
					local228 = local146 - local176;
					local15.method2696(this.anInterface11_1.method7640((float) arg2), 1.0F, this.anInterface11_1.method7636((float) local228));
					this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
					local10.method2696((float) arg2, 0.0F, (float) local228);
					local10.U(arg0, local176, 0);
					this.aClass162_Sub1_5.method3825();
					this.aClass162_Sub1_5.method3838();
				}
			} else if (local73) {
				local146 = arg2 + arg0;
				local149 = this.A();
				local15.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) arg3));
				this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
				local176 = arg0 + this.anInt1880;
				local181 = local176 + this.anInt1875;
				while (local181 <= local146) {
					local10.method2696((float) this.anInt1875, 0.0F, (float) arg3);
					local10.U(local176, arg1, 0);
					this.aClass162_Sub1_5.method3825();
					local181 += local149;
					local176 += local149;
					this.aClass162_Sub1_5.method3838();
				}
				if (local146 > local176) {
					local228 = local146 - local176;
					local15.method2696(this.anInterface11_1.method7640((float) local228), 1.0F, this.anInterface11_1.method7636((float) arg3));
					this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
					local10.method2696((float) local228, 0.0F, (float) arg3);
					local10.U(local176, arg1, 0);
					this.aClass162_Sub1_5.method3825();
					this.aClass162_Sub1_5.method3838();
				}
			} else {
				local146 = arg1 + arg3;
				local149 = arg0 + arg2;
				local176 = this.A();
				local181 = this.ca();
				local228 = arg1 + this.anInt1882;
				@Pc(332) int local332;
				@Pc(337) int local337;
				@Pc(381) int local381;
				for (@Pc(301) int local301 = this.anInt1867 + local228; local301 <= local146; local301 += local181) {
					local15.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
					this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
					local332 = arg0 + this.anInt1880;
					local337 = this.anInt1875 + local332;
					while (local337 <= local149) {
						local10.method2696((float) this.anInt1875, 0.0F, (float) this.anInt1867);
						local10.U(local332, local228, 0);
						this.aClass162_Sub1_5.method3825();
						local337 += local176;
						local332 += local176;
						this.aClass162_Sub1_5.method3838();
					}
					if (local149 > local332) {
						local381 = local149 - local332;
						local15.method2696(this.anInterface11_1.method7640((float) local381), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
						this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
						local10.method2696((float) local381, 0.0F, (float) this.anInt1867);
						local10.U(local332, local228, 0);
						this.aClass162_Sub1_5.method3825();
						this.aClass162_Sub1_5.method3838();
					}
					local228 += local181;
				}
				if (local228 < local146) {
					local332 = local146 - local228;
					local15.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) local332));
					this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
					local337 = this.anInt1880 + arg0;
					for (local381 = local337 + this.anInt1875; local381 <= local149; local381 += local176) {
						local10.method2696((float) this.anInt1875, 0.0F, (float) local332);
						local10.U(local337, local228, 0);
						this.aClass162_Sub1_5.method3825();
						local337 += local176;
						this.aClass162_Sub1_5.method3838();
					}
					if (local149 > local337) {
						@Pc(528) int local528 = local149 - local337;
						local15.method2696(this.anInterface11_1.method7640((float) local528), 1.0F, this.anInterface11_1.method7636((float) local332));
						this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
						local10.method2696((float) local528, 0.0F, (float) local332);
						local10.U(local337, local228, 0);
						this.aClass162_Sub1_5.method3825();
						this.aClass162_Sub1_5.method3838();
					}
				}
			}
		}
		this.aClass162_Sub1_5.method3855();
		this.aClass162_Sub1_5.method3885(Static64.aClass263_1, 1);
		this.aClass162_Sub1_5.method3877(1, Static64.aClass263_1);
	}

	@OriginalMember(owner = "client!eb", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt1867;
	}

	@OriginalMember(owner = "client!eb", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class25_Sub2 local8 = this.aClass162_Sub1_5.method3868();
		@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_5.method3899();
		this.anInterface11_1.method7634(this.aBoolean124 || this.aBoolean123 ? Static55.aClass195_1 : Class12_Sub2_Sub5_Sub2.lb);
		this.aClass162_Sub1_5.method3881();
		this.aClass162_Sub1_5.method3865(this.anInterface11_1);
		this.aClass162_Sub1_5.method3957(arg8);
		this.aClass162_Sub1_5.method3906(arg6);
		this.aClass162_Sub1_5.method3885(Static504.aClass263_4, 1);
		this.aClass162_Sub1_5.method3877(1, Static504.aClass263_4);
		this.aClass162_Sub1_5.method3891(arg7);
		if (this.aBoolean122) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(93) float local93 = (arg3 - arg1) / local77;
			@Pc(99) float local99 = (arg4 - arg0) / local81;
			@Pc(105) float local105 = (arg5 - arg1) / local81;
			@Pc(111) float local111 = (float) this.anInt1882 * local99;
			@Pc(117) float local117 = (float) this.anInt1882 * local105;
			@Pc(123) float local123 = (float) this.anInt1880 * local87;
			@Pc(129) float local129 = (float) this.anInt1880 * local93;
			@Pc(136) float local136 = -local87 * (float) this.anInt1886;
			@Pc(143) float local143 = (float) this.anInt1886 * -local93;
			@Pc(150) float local150 = (float) this.anInt1884 * -local99;
			arg3 = local143 + arg3 + local117;
			arg1 = arg1 + local129 + local117;
			arg4 = local123 + arg4 + local150;
			arg0 = local123 + arg0 + local111;
			arg2 = local111 + arg2 + local136;
			@Pc(187) float local187 = (float) this.anInt1884 * -local105;
			arg5 = local187 + local129 + arg5;
		}
		local8.method2702(0.0F, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, -arg0 + arg2, 0.0F, arg3 - arg1, 0.0F);
		local8.method2699(0.0F, arg1, arg0);
		local13.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3825();
		this.aClass162_Sub1_5.method3838();
		this.aClass162_Sub1_5.method3855();
		this.aClass162_Sub1_5.method3885(Static64.aClass263_1, 1);
		this.aClass162_Sub1_5.method3877(1, Static64.aClass263_1);
	}

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1886 = arg2;
		this.anInt1880 = arg0;
		this.anInt1882 = arg1;
		this.anInt1884 = arg3;
		this.aBoolean122 = this.anInt1880 != 0 || this.anInt1882 != 0 || this.anInt1886 != 0 || this.anInt1884 != 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII[III)V")
	private void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface11_1.method7637(arg5, arg0, arg4, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class84 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class25_Sub2 local8 = this.aClass162_Sub1_5.method3868();
		@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_5.method3899();
		@Pc(16) Class84_Sub2 local16 = (Class84_Sub2) arg6;
		@Pc(19) Interface11 local19 = local16.anInterface11_2;
		this.anInterface11_1.method7634(this.aBoolean124 || this.aBoolean123 ? Static55.aClass195_1 : Class12_Sub2_Sub5_Sub2.lb);
		this.aClass162_Sub1_5.method3881();
		this.aClass162_Sub1_5.method3865(this.anInterface11_1);
		this.aClass162_Sub1_5.method3957(1);
		this.aClass162_Sub1_5.method3906(1);
		if (this.aBoolean122) {
			@Pc(98) float local98 = (float) this.anInt1875 / (float) this.A();
			@Pc(106) float local106 = (float) this.anInt1867 / (float) this.ca();
			local8.method2702(0.0F, 1.0F, local106 * (arg5 - arg1), 0.0F, local106 * (arg4 - arg0), (arg2 - arg0) * local98, 0.0F, (arg3 - arg1) * local98, 0.0F);
			local8.method2699(0.0F, ((float) this.anInt1882 + arg1) * local106, local98 * (arg0 + (float) this.anInt1880));
		} else {
			local8.method2702(0.0F, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, arg2 - arg0, 0.0F, arg3 - arg1, 0.0F);
			local8.method2699(0.0F, arg1, arg0);
		}
		local13.method2696(this.anInterface11_1.method7640((float) this.anInt1875), 1.0F, this.anInterface11_1.method7636((float) this.anInt1867));
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3926(1);
		this.aClass162_Sub1_5.method3865(local19);
		this.aClass162_Sub1_5.method3867(Static317.aClass247_2, Static460.aClass247_4);
		this.aClass162_Sub1_5.method3885(Static64.aClass263_1, 0);
		@Pc(204) Class25_Sub2 local204 = this.aClass162_Sub1_5.method3899();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method2714(local19.method7636(1.0F), local19.method7640(1.0F), 1.0F);
		this.aClass162_Sub1_5.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_5.method3825();
		this.aClass162_Sub1_5.method3838();
		this.aClass162_Sub1_5.method3855();
		this.aClass162_Sub1_5.method3885(Static191.aClass263_2, 0);
		this.aClass162_Sub1_5.method3867(Static460.aClass247_4, Static460.aClass247_4);
		this.aClass162_Sub1_5.method3865(null);
		this.aClass162_Sub1_5.method3926(0);
		this.aClass162_Sub1_5.method3855();
	}
}
