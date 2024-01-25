import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class66_Sub3 extends Class66 {

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	private int anInt7793 = 0;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	private int anInt7790 = 0;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	private int anInt7799 = 0;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "Z")
	private boolean aBoolean575 = false;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	private int anInt7787 = 0;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	private final int anInt7808;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
	private final int anInt7805;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_16;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Lclient!ae;")
	private final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
	private final boolean aBoolean576;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Z")
	private final boolean aBoolean572;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "Z")
	private final boolean aBoolean573;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "Z")
	private final boolean aBoolean574;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!fo;IIZ)V")
	public Class66_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7808 = arg2;
		this.anInt7805 = arg1;
		this.aClass9_Sub3_16 = arg0;
		this.anInterface1_3 = arg0.method5530(arg1, arg2, arg3 ? Static487.aClass333_15 : Static396.aClass333_12, Static336.aClass220_12);
		this.aBoolean576 = arg1 != this.anInterface1_3.method7752();
		this.aBoolean572 = arg2 != this.anInterface1_3.method7750();
		this.aBoolean573 = !this.aBoolean576 && this.anInterface1_3.method7749();
		this.aBoolean574 = !this.aBoolean572 && this.anInterface1_3.method7749();
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!fo;II[III)V")
	public Class66_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7805 = arg1;
		this.anInt7808 = arg2;
		this.aClass9_Sub3_16 = arg0;
		this.anInterface1_3 = arg0.method5564(arg4, arg2, arg3, false, arg5, arg1);
		this.aBoolean576 = this.anInterface1_3.method7752() != arg1;
		this.aBoolean572 = this.anInterface1_3.method7750() != arg2;
		this.aBoolean573 = !this.aBoolean576 && this.anInterface1_3.method7749();
		this.aBoolean574 = !this.aBoolean572 && this.anInterface1_3.method7749();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt7793 + this.anInt7808 + this.anInt7790;
	}

	@OriginalMember(owner = "client!qh", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7793 = arg1;
		this.anInt7799 = arg2;
		this.anInt7790 = arg3;
		this.anInt7787 = arg0;
		this.aBoolean575 = this.anInt7787 != 0 || this.anInt7793 != 0 || this.anInt7799 != 0 || this.anInt7790 != 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class19_Sub3 local6 = (Class19_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt7787;
		@Pc(14) Interface1 local14 = local6.anInterface1_4;
		@Pc(19) int local19 = arg1 + this.anInt7793;
		this.anInterface1_3.method7737(Static53.aClass321_1);
		this.aClass9_Sub3_16.method5560();
		this.aClass9_Sub3_16.method5494(this.anInterface1_3);
		this.aClass9_Sub3_16.method5587(1);
		this.aClass9_Sub3_16.method5545(1);
		@Pc(49) Class8_Sub3 local49 = this.aClass9_Sub3_16.method5590();
		local49.method8198((float) this.anInt7808, (float) this.anInt7805, 0.0F);
		local49.G(local11, local19, 0);
		this.aClass9_Sub3_16.method5487();
		@Pc(73) Class8_Sub3 local73 = this.aClass9_Sub3_16.method5553();
		local73.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5482(1);
		this.aClass9_Sub3_16.method5494(local14);
		this.aClass9_Sub3_16.method5598(Static477.aClass238_4, Static410.aClass238_3);
		this.aClass9_Sub3_16.method5596(Static49.aClass50_1, 0);
		@Pc(123) Class8_Sub3 local123 = this.aClass9_Sub3_16.method5553();
		local123.method8198(local14.method7748((float) this.anInt7808), local14.method7754((float) this.anInt7805), 1.0F);
		local123.method8195(0.0F, local14.method7748((float) (local19 - arg4)), local14.method7754((float) (local11 - arg3)));
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5552();
		this.aClass9_Sub3_16.method5498();
		this.aClass9_Sub3_16.method5596(Static503.aClass50_4, 0);
		this.aClass9_Sub3_16.method5598(Static477.aClass238_4, Static477.aClass238_4);
		this.aClass9_Sub3_16.method5494(null);
		this.aClass9_Sub3_16.method5482(0);
		this.aClass9_Sub3_16.method5498();
	}

	@OriginalMember(owner = "client!qh", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass9_Sub3_16.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6510(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII[III)V")
	private void method6510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface1_3.method7751(arg1, arg5, arg3, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!qh", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class8_Sub3 local8 = this.aClass9_Sub3_16.method5590();
		@Pc(13) Class8_Sub3 local13 = this.aClass9_Sub3_16.method5553();
		this.anInterface1_3.method7737(this.aBoolean576 || this.aBoolean572 ? Static53.aClass321_1 : Static333.aClass321_7);
		this.aClass9_Sub3_16.method5560();
		this.aClass9_Sub3_16.method5494(this.anInterface1_3);
		this.aClass9_Sub3_16.method5587(arg6);
		this.aClass9_Sub3_16.method5545(arg4);
		this.aClass9_Sub3_16.method5596(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5543(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5536(arg5);
		local13.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
		if (this.aBoolean575) {
			arg2 = arg2 * this.anInt7805 / this.AA();
			arg3 = this.anInt7808 * arg3 / this.a();
			arg1 += arg3 * this.anInt7793 / this.anInt7808;
			arg0 += arg2 * this.anInt7787 / this.anInt7805;
		}
		local8.method8198((float) arg3, (float) arg2, 0.0F);
		local8.G(arg0, arg1, 0);
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5487();
		this.aClass9_Sub3_16.method5552();
		this.aClass9_Sub3_16.method5498();
		this.aClass9_Sub3_16.method5596(Static49.aClass50_1, 1);
		this.aClass9_Sub3_16.method5543(Static49.aClass50_1, 1);
	}

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qh", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt7805;
	}

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class8_Sub3 local8 = this.aClass9_Sub3_16.method5590();
		@Pc(13) Class8_Sub3 local13 = this.aClass9_Sub3_16.method5553();
		@Pc(18) int local18 = arg0 + this.anInt7787;
		@Pc(23) int local23 = arg1 + this.anInt7793;
		this.anInterface1_3.method7737(Static53.aClass321_1);
		this.aClass9_Sub3_16.method5560();
		this.aClass9_Sub3_16.method5494(this.anInterface1_3);
		this.aClass9_Sub3_16.method5587(arg4);
		this.aClass9_Sub3_16.method5545(arg2);
		this.aClass9_Sub3_16.method5596(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5543(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5536(arg3);
		local8.method8198((float) this.anInt7808, (float) this.anInt7805, 0.0F);
		local8.G(local18, local23, 0);
		local13.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5487();
		this.aClass9_Sub3_16.method5552();
		this.aClass9_Sub3_16.method5498();
		this.aClass9_Sub3_16.method5596(Static49.aClass50_1, 1);
		this.aClass9_Sub3_16.method5543(Static49.aClass50_1, 1);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt7808;
	}

	@OriginalMember(owner = "client!qh", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt7787 + this.anInt7805 + this.anInt7799;
	}

	@OriginalMember(owner = "client!qh", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class8_Sub3 local8 = this.aClass9_Sub3_16.method5590();
		@Pc(13) Class8_Sub3 local13 = this.aClass9_Sub3_16.method5553();
		this.anInterface1_3.method7737(this.aBoolean576 || this.aBoolean572 ? Static53.aClass321_1 : Static333.aClass321_7);
		this.aClass9_Sub3_16.method5560();
		this.aClass9_Sub3_16.method5494(this.anInterface1_3);
		this.aClass9_Sub3_16.method5587(arg8);
		this.aClass9_Sub3_16.method5545(arg6);
		this.aClass9_Sub3_16.method5596(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5543(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5536(arg7);
		if (this.aBoolean575) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(81) float local81 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(101) float local101 = (arg5 - arg1) / local74;
			@Pc(107) float local107 = local94 * (float) this.anInt7793;
			@Pc(113) float local113 = (float) this.anInt7793 * local101;
			@Pc(119) float local119 = (float) this.anInt7787 * local81;
			@Pc(125) float local125 = local87 * (float) this.anInt7787;
			@Pc(132) float local132 = -local81 * (float) this.anInt7799;
			@Pc(139) float local139 = -local87 * (float) this.anInt7799;
			@Pc(146) float local146 = -local94 * (float) this.anInt7790;
			@Pc(153) float local153 = (float) this.anInt7790 * -local101;
			arg0 = arg0 + local119 + local107;
			arg1 = local125 + arg1 + local113;
			arg2 = arg2 + local132 + local107;
			arg4 = local119 + arg4 + local146;
			arg3 = local113 + arg3 + local139;
			arg5 = local153 + local125 + arg5;
		}
		local8.method8181(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, -arg0 + arg4, arg2 - arg0, arg3 - arg1);
		local8.method8195(0.0F, arg1, arg0);
		local13.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5487();
		this.aClass9_Sub3_16.method5552();
		this.aClass9_Sub3_16.method5498();
		this.aClass9_Sub3_16.method5596(Static49.aClass50_1, 1);
		this.aClass9_Sub3_16.method5543(Static49.aClass50_1, 1);
	}

	@OriginalMember(owner = "client!qh", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class8_Sub3 local10 = this.aClass9_Sub3_16.method5590();
		@Pc(15) Class8_Sub3 local15 = this.aClass9_Sub3_16.method5553();
		this.anInterface1_3.method7737(Static53.aClass321_1);
		this.aClass9_Sub3_16.method5560();
		this.aClass9_Sub3_16.method5494(this.anInterface1_3);
		this.aClass9_Sub3_16.method5587(arg6);
		this.aClass9_Sub3_16.method5545(arg4);
		this.aClass9_Sub3_16.method5596(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5543(Static140.aClass50_2, 1);
		this.aClass9_Sub3_16.method5536(arg5);
		@Pc(76) boolean local76 = this.aBoolean574 && this.anInt7793 == 0 && this.anInt7790 == 0;
		@Pc(92) boolean local92 = this.aBoolean573 && this.anInt7787 == 0 && this.anInt7799 == 0;
		if (local76 & local92) {
			local15.method8198(this.anInterface1_3.method7748((float) arg3), this.anInterface1_3.method7754((float) arg2), 1.0F);
			local10.method8198((float) arg3, (float) arg2, 0.0F);
			local10.G(arg0, arg1, 0);
			this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
			this.aClass9_Sub3_16.method5487();
			this.aClass9_Sub3_16.method5552();
		} else {
			@Pc(102) int local102;
			@Pc(105) int local105;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(184) int local184;
			if (local92) {
				local102 = arg3 + arg1;
				local105 = this.a();
				local15.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) arg2), 1.0F);
				this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
				local132 = this.anInt7793 + arg1;
				for (local137 = this.anInt7808 + local132; local137 <= local102; local137 += local105) {
					local10.method8198((float) this.anInt7808, (float) arg2, 0.0F);
					local10.G(arg0, local132, 0);
					this.aClass9_Sub3_16.method5487();
					this.aClass9_Sub3_16.method5552();
					local132 += local105;
				}
				if (local132 < local102) {
					local184 = local102 - local132;
					local15.method8198(this.anInterface1_3.method7748((float) local184), this.anInterface1_3.method7754((float) arg2), 1.0F);
					this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
					local10.method8198((float) local184, (float) arg2, 0.0F);
					local10.G(arg0, local132, 0);
					this.aClass9_Sub3_16.method5487();
					this.aClass9_Sub3_16.method5552();
				}
			} else if (local76) {
				local102 = arg2 + arg0;
				local105 = this.AA();
				local15.method8198(this.anInterface1_3.method7748((float) arg3), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
				this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
				local132 = this.anInt7787 + arg0;
				local137 = local132 + this.anInt7805;
				while (local102 >= local137) {
					local10.method8198((float) arg3, (float) this.anInt7805, 0.0F);
					local10.G(local132, arg1, 0);
					this.aClass9_Sub3_16.method5487();
					local137 += local105;
					this.aClass9_Sub3_16.method5552();
					local132 += local105;
				}
				if (local102 > local132) {
					local184 = local102 - local132;
					local15.method8198(this.anInterface1_3.method7748((float) arg3), this.anInterface1_3.method7754((float) local184), 1.0F);
					this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
					local10.method8198((float) arg3, (float) local184, 0.0F);
					local10.G(local132, arg1, 0);
					this.aClass9_Sub3_16.method5487();
					this.aClass9_Sub3_16.method5552();
				}
			} else {
				local102 = arg3 + arg1;
				local105 = arg0 + arg2;
				local132 = this.AA();
				local137 = this.a();
				local184 = arg1 + this.anInt7793;
				@Pc(381) int local381 = this.anInt7808 + local184;
				@Pc(411) int local411;
				@Pc(416) int local416;
				@Pc(464) int local464;
				while (local381 <= local102) {
					local15.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
					this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
					local411 = this.anInt7787 + arg0;
					local416 = this.anInt7805 + local411;
					while (local105 >= local416) {
						local10.method8198((float) this.anInt7808, (float) this.anInt7805, 0.0F);
						local10.G(local411, local184, 0);
						this.aClass9_Sub3_16.method5487();
						local411 += local132;
						local416 += local132;
						this.aClass9_Sub3_16.method5552();
					}
					if (local105 > local411) {
						local464 = local105 - local411;
						local15.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) local464), 1.0F);
						this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
						local10.method8198((float) this.anInt7808, (float) local464, 0.0F);
						local10.G(local411, local184, 0);
						this.aClass9_Sub3_16.method5487();
						this.aClass9_Sub3_16.method5552();
					}
					local381 += local137;
					local184 += local137;
				}
				if (local184 < local102) {
					local411 = local102 - local184;
					local15.method8198(this.anInterface1_3.method7748((float) local411), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
					this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
					local416 = this.anInt7787 + arg0;
					local464 = local416 + this.anInt7805;
					while (local464 <= local105) {
						local10.method8198((float) local411, (float) this.anInt7805, 0.0F);
						local10.G(local416, local184, 0);
						this.aClass9_Sub3_16.method5487();
						local416 += local132;
						local464 += local132;
						this.aClass9_Sub3_16.method5552();
					}
					if (local105 > local416) {
						@Pc(606) int local606 = local105 - local416;
						local15.method8198(this.anInterface1_3.method7748((float) local411), this.anInterface1_3.method7754((float) local606), 1.0F);
						this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
						local10.method8198((float) local411, (float) local606, 0.0F);
						local10.G(local416, local184, 0);
						this.aClass9_Sub3_16.method5487();
						this.aClass9_Sub3_16.method5552();
					}
				}
			}
		}
		this.aClass9_Sub3_16.method5498();
		this.aClass9_Sub3_16.method5596(Static49.aClass50_1, 1);
		this.aClass9_Sub3_16.method5543(Static49.aClass50_1, 1);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method8064(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class8_Sub3 local8 = this.aClass9_Sub3_16.method5590();
		@Pc(13) Class8_Sub3 local13 = this.aClass9_Sub3_16.method5553();
		@Pc(16) Class19_Sub3 local16 = (Class19_Sub3) arg6;
		@Pc(19) Interface1 local19 = local16.anInterface1_4;
		this.anInterface1_3.method7737(Static333.aClass321_7);
		this.aClass9_Sub3_16.method5560();
		this.aClass9_Sub3_16.method5494(this.anInterface1_3);
		this.aClass9_Sub3_16.method5587(1);
		this.aClass9_Sub3_16.method5545(1);
		if (this.aBoolean575) {
			@Pc(84) float local84 = (float) this.anInt7805 / (float) this.AA();
			@Pc(92) float local92 = (float) this.anInt7808 / (float) this.a();
			local8.method8181(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, (arg5 - arg1) * local92, local92 * (arg4 - arg0), local84 * (arg2 - arg0), local84 * (arg3 - arg1));
			local8.method8195(0.0F, ((float) this.anInt7793 + arg1) * local92, local84 * ((float) this.anInt7787 + arg0));
		} else {
			local8.method8181(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, arg4 - arg0, arg2 - arg0, arg3 - arg1);
			local8.method8195(0.0F, arg1, arg0);
		}
		local13.method8198(this.anInterface1_3.method7748((float) this.anInt7808), this.anInterface1_3.method7754((float) this.anInt7805), 1.0F);
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5482(1);
		this.aClass9_Sub3_16.method5494(local19);
		this.aClass9_Sub3_16.method5598(Static477.aClass238_4, Static410.aClass238_3);
		this.aClass9_Sub3_16.method5596(Static49.aClass50_1, 0);
		@Pc(189) Class8_Sub3 local189 = this.aClass9_Sub3_16.method5553();
		local189.la(local8);
		local189.G(-arg7, -arg8, 0);
		local189.method8192(local19.method7754(1.0F), local19.method7748(1.0F), 1.0F);
		this.aClass9_Sub3_16.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_16.method5487();
		this.aClass9_Sub3_16.method5552();
		this.aClass9_Sub3_16.method5498();
		this.aClass9_Sub3_16.method5596(Static503.aClass50_4, 0);
		this.aClass9_Sub3_16.method5598(Static477.aClass238_4, Static477.aClass238_4);
		this.aClass9_Sub3_16.method5494(null);
		this.aClass9_Sub3_16.method5482(0);
		this.aClass9_Sub3_16.method5498();
	}
}
