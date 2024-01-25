import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	private int anInt9803 = 0;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
	private int anInt9805 = 0;

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "Z")
	private boolean aBoolean691 = false;

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
	private int anInt9818 = 0;

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
	private int anInt9817 = 0;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
	private final int anInt9809;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_20;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
	private final int anInt9802;

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "Lclient!ak;")
	private final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "Z")
	private final boolean aBoolean690;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "Z")
	private final boolean aBoolean694;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "Z")
	private final boolean aBoolean692;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "Z")
	private final boolean aBoolean693;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ej;IIZ)V")
	public Class13_Sub3(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt9809 = arg2;
		this.aClass66_Sub1_20 = arg0;
		this.anInt9802 = arg1;
		this.anInterface2_4 = arg0.method6995(Static349.aClass239_12, arg1, arg3 ? Static85.aClass141_2 : Static431.aClass141_11, arg2);
		this.aBoolean690 = arg1 != this.anInterface2_4.method6723();
		this.aBoolean694 = this.anInterface2_4.method6722() != arg2;
		this.aBoolean692 = !this.aBoolean690 && this.anInterface2_4.method6721();
		this.aBoolean693 = !this.aBoolean694 && this.anInterface2_4.method6721();
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ej;II[III)V")
	public Class13_Sub3(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9802 = arg1;
		this.anInt9809 = arg2;
		this.aClass66_Sub1_20 = arg0;
		this.anInterface2_4 = arg0.method6886(arg2, false, arg4, arg3, arg5, arg1);
		this.aBoolean690 = this.anInterface2_4.method6723() != arg1;
		this.aBoolean694 = this.anInterface2_4.method6722() != arg2;
		this.aBoolean692 = !this.aBoolean690 && this.anInterface2_4.method6721();
		this.aBoolean693 = !this.aBoolean694 && this.anInterface2_4.method6721();
	}

	@OriginalMember(owner = "client!wu", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass66_Sub1_20.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method8028(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class134_Sub1 local8 = this.aClass66_Sub1_20.method6919();
		@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_20.method6953();
		@Pc(16) Class98_Sub2 local16 = (Class98_Sub2) arg6;
		@Pc(19) Interface2 local19 = local16.anInterface2_2;
		this.anInterface2_4.method6762(Static472.aClass46_9);
		this.aClass66_Sub1_20.method6913();
		this.aClass66_Sub1_20.method6979(this.anInterface2_4);
		this.aClass66_Sub1_20.method6984(1);
		this.aClass66_Sub1_20.method6920(1);
		if (this.aBoolean691) {
			@Pc(55) float local55 = (float) this.anInt9802 / (float) this.AA();
			@Pc(63) float local63 = (float) this.anInt9809 / (float) this.a();
			local8.method3411((arg4 - arg0) * local63, 0.0F, 0.0F, local63 * (arg5 - arg1), 0.0F, 0.0F, 1.0F, local55 * (arg3 - arg1), local55 * (arg2 - arg0));
			local8.method3408(0.0F, local55 * (arg0 + (float) this.anInt9805), ((float) this.anInt9818 + arg1) * local63);
		} else {
			local8.method3411(arg4 - arg0, 0.0F, 0.0F, arg5 - arg1, 0.0F, 0.0F, 1.0F, arg3 - arg1, arg2 - arg0);
			local8.method3408(0.0F, arg0, arg1);
		}
		local13.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) this.anInt9802));
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6895(1);
		this.aClass66_Sub1_20.method6979(local19);
		this.aClass66_Sub1_20.method6997(Static174.aClass240_2, Static152.aClass240_1);
		this.aClass66_Sub1_20.method6923(Static232.aClass120_4, 0);
		@Pc(193) Class134_Sub1 local193 = this.aClass66_Sub1_20.method6953();
		local193.la(local8);
		local193.G(-arg7, -arg8, 0);
		local193.method3399(1.0F, local19.method6725(1.0F), local19.method6724(1.0F));
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6902();
		this.aClass66_Sub1_20.method6930();
		this.aClass66_Sub1_20.method6888();
		this.aClass66_Sub1_20.method6923(Static22.aClass120_2, 0);
		this.aClass66_Sub1_20.method6997(Static152.aClass240_1, Static152.aClass240_1);
		this.aClass66_Sub1_20.method6979(null);
		this.aClass66_Sub1_20.method6895(0);
		this.aClass66_Sub1_20.method6888();
	}

	@OriginalMember(owner = "client!wu", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9817 = arg3;
		this.anInt9818 = arg1;
		this.anInt9803 = arg2;
		this.anInt9805 = arg0;
		this.aBoolean691 = this.anInt9805 != 0 || this.anInt9818 != 0 || this.anInt9803 != 0 || this.anInt9817 != 0;
	}

	@OriginalMember(owner = "client!wu", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class134_Sub1 local10 = this.aClass66_Sub1_20.method6919();
		@Pc(15) Class134_Sub1 local15 = this.aClass66_Sub1_20.method6953();
		this.anInterface2_4.method6762(Static393.aClass46_12);
		this.aClass66_Sub1_20.method6913();
		this.aClass66_Sub1_20.method6979(this.anInterface2_4);
		this.aClass66_Sub1_20.method6984(arg6);
		this.aClass66_Sub1_20.method6920(arg4);
		this.aClass66_Sub1_20.method6923(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6866(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6932(arg5);
		@Pc(76) boolean local76 = this.aBoolean693 && this.anInt9818 == 0 && this.anInt9817 == 0;
		@Pc(92) boolean local92 = this.aBoolean692 && this.anInt9805 == 0 && this.anInt9803 == 0;
		if (local76 & local92) {
			local15.method3417(1.0F, this.anInterface2_4.method6724((float) arg3), this.anInterface2_4.method6725((float) arg2));
			local10.method3417(0.0F, (float) arg3, (float) arg2);
			local10.G(arg0, arg1, 0);
			this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
			this.aClass66_Sub1_20.method6902();
			this.aClass66_Sub1_20.method6930();
		} else {
			@Pc(102) int local102;
			@Pc(105) int local105;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(180) int local180;
			if (local92) {
				local102 = arg3 + arg1;
				local105 = this.a();
				local15.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) arg2));
				this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
				local132 = arg1 + this.anInt9818;
				local137 = this.anInt9809 + local132;
				while (local137 <= local102) {
					local10.method3417(0.0F, (float) this.anInt9809, (float) arg2);
					local10.G(arg0, local132, 0);
					this.aClass66_Sub1_20.method6902();
					local132 += local105;
					local137 += local105;
					this.aClass66_Sub1_20.method6930();
				}
				if (local132 < local102) {
					local180 = local102 - local132;
					local15.method3417(1.0F, this.anInterface2_4.method6724((float) local180), this.anInterface2_4.method6725((float) arg2));
					this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
					local10.method3417(0.0F, (float) local180, (float) arg2);
					local10.G(arg0, local132, 0);
					this.aClass66_Sub1_20.method6902();
					this.aClass66_Sub1_20.method6930();
				}
			} else if (local76) {
				local102 = arg0 + arg2;
				local105 = this.AA();
				local15.method3417(1.0F, this.anInterface2_4.method6724((float) arg3), this.anInterface2_4.method6725((float) this.anInt9802));
				this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
				local132 = this.anInt9805 + arg0;
				for (local137 = this.anInt9802 + local132; local137 <= local102; local137 += local105) {
					local10.method3417(0.0F, (float) arg3, (float) this.anInt9802);
					local10.G(local132, arg1, 0);
					this.aClass66_Sub1_20.method6902();
					this.aClass66_Sub1_20.method6930();
					local132 += local105;
				}
				if (local132 < local102) {
					local180 = local102 - local132;
					local15.method3417(1.0F, this.anInterface2_4.method6724((float) arg3), this.anInterface2_4.method6725((float) local180));
					this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
					local10.method3417(0.0F, (float) arg3, (float) local180);
					local10.G(local132, arg1, 0);
					this.aClass66_Sub1_20.method6902();
					this.aClass66_Sub1_20.method6930();
				}
			} else {
				local102 = arg3 + arg1;
				local105 = arg0 + arg2;
				local132 = this.AA();
				local137 = this.a();
				local180 = arg1 + this.anInt9818;
				@Pc(252) int local252 = local180 + this.anInt9809;
				@Pc(283) int local283;
				@Pc(288) int local288;
				@Pc(340) int local340;
				while (local102 >= local252) {
					local15.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) this.anInt9802));
					this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
					local283 = arg0 + this.anInt9805;
					for (local288 = this.anInt9802 + local283; local288 <= local105; local288 += local132) {
						local10.method3417(0.0F, (float) this.anInt9809, (float) this.anInt9802);
						local10.G(local283, local180, 0);
						this.aClass66_Sub1_20.method6902();
						local283 += local132;
						this.aClass66_Sub1_20.method6930();
					}
					if (local283 < local105) {
						local340 = local105 - local283;
						local15.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) local340));
						this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
						local10.method3417(0.0F, (float) this.anInt9809, (float) local340);
						local10.G(local283, local180, 0);
						this.aClass66_Sub1_20.method6902();
						this.aClass66_Sub1_20.method6930();
					}
					local252 += local137;
					local180 += local137;
				}
				if (local102 > local180) {
					local283 = local102 - local180;
					local15.method3417(1.0F, this.anInterface2_4.method6724((float) local283), this.anInterface2_4.method6725((float) this.anInt9802));
					this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
					local288 = arg0 + this.anInt9805;
					local340 = local288 + this.anInt9802;
					while (local105 >= local340) {
						local10.method3417(0.0F, (float) local283, (float) this.anInt9802);
						local10.G(local288, local180, 0);
						this.aClass66_Sub1_20.method6902();
						local288 += local132;
						local340 += local132;
						this.aClass66_Sub1_20.method6930();
					}
					if (local105 > local288) {
						@Pc(476) int local476 = local105 - local288;
						local15.method3417(1.0F, this.anInterface2_4.method6724((float) local283), this.anInterface2_4.method6725((float) local476));
						this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
						local10.method3417(0.0F, (float) local283, (float) local476);
						local10.G(local288, local180, 0);
						this.aClass66_Sub1_20.method6902();
						this.aClass66_Sub1_20.method6930();
					}
				}
			}
		}
		this.aClass66_Sub1_20.method6888();
		this.aClass66_Sub1_20.method6923(Static232.aClass120_4, 1);
		this.aClass66_Sub1_20.method6866(Static232.aClass120_4, 1);
	}

	@OriginalMember(owner = "client!wu", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class134_Sub1 local8 = this.aClass66_Sub1_20.method6919();
		@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_20.method6953();
		this.anInterface2_4.method6762(this.aBoolean690 || this.aBoolean694 ? Static393.aClass46_12 : Static472.aClass46_9);
		this.aClass66_Sub1_20.method6913();
		this.aClass66_Sub1_20.method6979(this.anInterface2_4);
		this.aClass66_Sub1_20.method6984(arg6);
		this.aClass66_Sub1_20.method6920(arg4);
		this.aClass66_Sub1_20.method6923(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6866(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6932(arg5);
		local13.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) this.anInt9802));
		if (this.aBoolean691) {
			arg2 = this.anInt9802 * arg2 / this.AA();
			arg3 = arg3 * this.anInt9809 / this.a();
			arg0 += this.anInt9805 * arg2 / this.anInt9802;
			arg1 += arg3 * this.anInt9818 / this.anInt9809;
		}
		local8.method3417(0.0F, (float) arg3, (float) arg2);
		local8.G(arg0, arg1, 0);
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6902();
		this.aClass66_Sub1_20.method6930();
		this.aClass66_Sub1_20.method6888();
		this.aClass66_Sub1_20.method6923(Static232.aClass120_4, 1);
		this.aClass66_Sub1_20.method6866(Static232.aClass120_4, 1);
	}

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class134_Sub1 local8 = this.aClass66_Sub1_20.method6919();
		@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_20.method6953();
		@Pc(18) int local18 = arg1 + this.anInt9818;
		@Pc(23) int local23 = arg0 + this.anInt9805;
		this.anInterface2_4.method6762(Static393.aClass46_12);
		this.aClass66_Sub1_20.method6913();
		this.aClass66_Sub1_20.method6979(this.anInterface2_4);
		this.aClass66_Sub1_20.method6984(arg4);
		this.aClass66_Sub1_20.method6920(arg2);
		this.aClass66_Sub1_20.method6923(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6866(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6932(arg3);
		local8.method3417(0.0F, (float) this.anInt9809, (float) this.anInt9802);
		local8.G(local23, local18, 0);
		local13.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) this.anInt9802));
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6902();
		this.aClass66_Sub1_20.method6930();
		this.aClass66_Sub1_20.method6888();
		this.aClass66_Sub1_20.method6923(Static232.aClass120_4, 1);
		this.aClass66_Sub1_20.method6866(Static232.aClass120_4, 1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIII[III)V")
	private void method8028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface2_4.method6720(arg0, arg3, arg2, arg5, arg1, arg4);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt9818 + this.anInt9809 + this.anInt9817;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt9809;
	}

	@OriginalMember(owner = "client!wu", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class134_Sub1 local8 = this.aClass66_Sub1_20.method6919();
		@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_20.method6953();
		this.anInterface2_4.method6762(this.aBoolean690 || this.aBoolean694 ? Static393.aClass46_12 : Static472.aClass46_9);
		this.aClass66_Sub1_20.method6913();
		this.aClass66_Sub1_20.method6979(this.anInterface2_4);
		this.aClass66_Sub1_20.method6984(arg8);
		this.aClass66_Sub1_20.method6920(arg6);
		this.aClass66_Sub1_20.method6923(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6866(Static19.aClass120_1, 1);
		this.aClass66_Sub1_20.method6932(arg7);
		if (this.aBoolean691) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(86) float local86 = (arg3 - arg1) / local70;
			@Pc(93) float local93 = (arg4 - arg0) / local74;
			@Pc(99) float local99 = (arg5 - arg1) / local74;
			@Pc(105) float local105 = (float) this.anInt9818 * local93;
			@Pc(111) float local111 = local99 * (float) this.anInt9818;
			@Pc(117) float local117 = (float) this.anInt9805 * local80;
			@Pc(123) float local123 = local86 * (float) this.anInt9805;
			@Pc(130) float local130 = -local80 * (float) this.anInt9803;
			@Pc(137) float local137 = -local86 * (float) this.anInt9803;
			@Pc(144) float local144 = (float) this.anInt9817 * -local93;
			arg4 = arg4 + local117 + local144;
			arg3 = local111 + local137 + arg3;
			arg0 = local105 + arg0 + local117;
			@Pc(169) float local169 = -local99 * (float) this.anInt9817;
			arg2 = arg2 + local130 + local105;
			arg1 = local123 + arg1 + local111;
			arg5 = arg5 + local123 + local169;
		}
		local8.method3411(arg4 - arg0, 0.0F, 0.0F, arg5 - arg1, 0.0F, 0.0F, 1.0F, arg3 - arg1, arg2 - arg0);
		local8.method3408(0.0F, arg0, arg1);
		local13.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) this.anInt9802));
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6902();
		this.aClass66_Sub1_20.method6930();
		this.aClass66_Sub1_20.method6888();
		this.aClass66_Sub1_20.method6923(Static232.aClass120_4, 1);
		this.aClass66_Sub1_20.method6866(Static232.aClass120_4, 1);
	}

	@OriginalMember(owner = "client!wu", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt9802 + this.anInt9805 + this.anInt9803;
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class98_Sub2 local6 = (Class98_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt9805;
		@Pc(14) Interface2 local14 = local6.anInterface2_2;
		@Pc(19) int local19 = arg1 + this.anInt9818;
		this.anInterface2_4.method6762(Static393.aClass46_12);
		this.aClass66_Sub1_20.method6913();
		this.aClass66_Sub1_20.method6979(this.anInterface2_4);
		this.aClass66_Sub1_20.method6984(1);
		this.aClass66_Sub1_20.method6920(1);
		@Pc(49) Class134_Sub1 local49 = this.aClass66_Sub1_20.method6919();
		local49.method3417(0.0F, (float) this.anInt9809, (float) this.anInt9802);
		local49.G(local11, local19, 0);
		this.aClass66_Sub1_20.method6902();
		@Pc(73) Class134_Sub1 local73 = this.aClass66_Sub1_20.method6953();
		local73.method3417(1.0F, this.anInterface2_4.method6724((float) this.anInt9809), this.anInterface2_4.method6725((float) this.anInt9802));
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6895(1);
		this.aClass66_Sub1_20.method6979(local14);
		this.aClass66_Sub1_20.method6997(Static174.aClass240_2, Static152.aClass240_1);
		this.aClass66_Sub1_20.method6923(Static232.aClass120_4, 0);
		@Pc(123) Class134_Sub1 local123 = this.aClass66_Sub1_20.method6953();
		local123.method3417(1.0F, local14.method6724((float) this.anInt9809), local14.method6725((float) this.anInt9802));
		local123.method3408(0.0F, local14.method6725((float) (local11 - arg3)), local14.method6724((float) (local19 - arg4)));
		this.aClass66_Sub1_20.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_20.method6930();
		this.aClass66_Sub1_20.method6888();
		this.aClass66_Sub1_20.method6923(Static22.aClass120_2, 0);
		this.aClass66_Sub1_20.method6997(Static152.aClass240_1, Static152.aClass240_1);
		this.aClass66_Sub1_20.method6979(null);
		this.aClass66_Sub1_20.method6895(0);
		this.aClass66_Sub1_20.method6888();
	}

	@OriginalMember(owner = "client!wu", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt9802;
	}
}
