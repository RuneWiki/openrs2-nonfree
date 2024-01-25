import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	private int anInt5472 = 0;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	private int anInt5487 = 0;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
	private int anInt5489 = 0;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	private int anInt5475 = 0;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	private final int anInt5488;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	private final int anInt5482;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_10;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!wfa;")
	private final Interface27 anInterface27_2;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Z")
	private final boolean aBoolean417;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Z")
	private final boolean aBoolean416;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Z")
	private final boolean aBoolean415;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Z")
	private final boolean aBoolean414;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!wga;IIZ)V")
	public Class46_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5488 = arg2;
		this.anInt5482 = arg1;
		this.aClass20_Sub2_10 = arg0;
		this.anInterface27_2 = arg0.method1495(arg2, arg1, Static29.aClass26_4, arg3 ? Static354.aClass375_31 : Static55.aClass375_38);
		this.anInterface27_2.method8300(true, true);
		this.aBoolean417 = this.anInterface27_2.method8303() != arg1;
		this.aBoolean416 = this.anInterface27_2.method8306() != arg2;
		this.aBoolean415 = !this.aBoolean417 && this.anInterface27_2.method8307();
		this.aBoolean414 = !this.aBoolean416 && this.anInterface27_2.method8307();
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!wga;II[III)V")
	public Class46_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass20_Sub2_10 = arg0;
		this.anInt5482 = arg1;
		this.anInt5488 = arg2;
		this.anInterface27_2 = arg0.method1464(arg1, arg3, false, arg4, arg5, arg2);
		this.anInterface27_2.method8300(true, true);
		this.aBoolean417 = this.anInterface27_2.method8303() != arg1;
		this.aBoolean416 = this.anInterface27_2.method8306() != arg2;
		this.aBoolean415 = !this.aBoolean417 && this.anInterface27_2.method8307();
		this.aBoolean414 = !this.aBoolean416 && this.anInterface27_2.method8307();
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
	@Override
	public int method6219() {
		return this.anInt5488 + this.anInt5489 + this.anInt5472;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(IIII)V")
	@Override
	public void method6224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5489 = arg1;
		this.anInt5472 = arg3;
		this.anInt5475 = arg0;
		this.anInt5487 = arg2;
		this.aBoolean418 = this.anInt5475 != 0 || this.anInt5489 != 0 || this.anInt5487 != 0 || this.anInt5472 != 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII[III)V")
	private void method4722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface27_2.method8302(arg5, arg4, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
	@Override
	public int method6205() {
		return this.anInt5487 + this.anInt5475 + this.anInt5482;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
	@Override
	public int method6208() {
		return this.anInt5488;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method6201(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class30_Sub2 local8 = this.aClass20_Sub2_10.method1568();
		@Pc(13) Class30_Sub2 local13 = this.aClass20_Sub2_10.method1454();
		this.anInterface27_2.method8287(this.aBoolean417 || this.aBoolean416 ? Static486.aClass298_10 : Static292.aClass298_5);
		this.aClass20_Sub2_10.method1498();
		this.aClass20_Sub2_10.method1484(this.anInterface27_2);
		this.aClass20_Sub2_10.method1451(1);
		this.aClass20_Sub2_10.method1557(arg6);
		this.aClass20_Sub2_10.method1483(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1519(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1528(arg7);
		if (this.aBoolean418) {
			@Pc(77) float local77 = (float) this.method6205();
			@Pc(81) float local81 = (float) this.method6219();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt5489 * local101;
			@Pc(119) float local119 = (float) this.anInt5489 * local107;
			@Pc(125) float local125 = local88 * (float) this.anInt5475;
			@Pc(131) float local131 = local95 * (float) this.anInt5475;
			@Pc(138) float local138 = -local88 * (float) this.anInt5487;
			@Pc(145) float local145 = -local95 * (float) this.anInt5487;
			@Pc(152) float local152 = -local101 * (float) this.anInt5472;
			@Pc(159) float local159 = (float) this.anInt5472 * -local107;
			arg0 = local113 + arg0 + local125;
			arg4 = local125 + arg4 + local152;
			arg3 = arg3 + local145 + local119;
			arg2 = local113 + arg2 + local138;
			arg1 = local119 + arg1 + local131;
			arg5 = arg5 + local131 + local159;
		}
		local8.method4055(1.0F, arg3 - arg1, -arg0 + arg4, 0.0F, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0);
		local8.method4040(arg1, 0.0F, arg0);
		local13.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) this.anInt5482));
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1549();
		this.aClass20_Sub2_10.method1567();
		this.aClass20_Sub2_10.method1513();
		this.aClass20_Sub2_10.method1483(1, Static154.aClass177_4);
		this.aClass20_Sub2_10.method1519(1, Static154.aClass177_4);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class30_Sub2 local10 = this.aClass20_Sub2_10.method1568();
		@Pc(15) Class30_Sub2 local15 = this.aClass20_Sub2_10.method1454();
		this.anInterface27_2.method8287(Static486.aClass298_10);
		this.aClass20_Sub2_10.method1498();
		this.aClass20_Sub2_10.method1484(this.anInterface27_2);
		this.aClass20_Sub2_10.method1451(arg6);
		this.aClass20_Sub2_10.method1557(arg4);
		this.aClass20_Sub2_10.method1483(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1519(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1528(arg5);
		@Pc(73) boolean local73 = this.aBoolean414 && this.anInt5489 == 0 && this.anInt5472 == 0;
		@Pc(92) boolean local92 = this.aBoolean415 && this.anInt5475 == 0 && this.anInt5487 == 0;
		if (local92 & local73) {
			local15.method4052(1.0F, this.anInterface27_2.method8305((float) arg3), this.anInterface27_2.method8301((float) arg2));
			local10.method4052(0.0F, (float) arg3, (float) arg2);
			local10.method4646(arg0, arg1, 0);
			this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
			this.aClass20_Sub2_10.method1549();
			this.aClass20_Sub2_10.method1567();
		} else {
			@Pc(102) int local102;
			@Pc(105) int local105;
			@Pc(132) int local132;
			@Pc(138) int local138;
			@Pc(184) int local184;
			if (local92) {
				local102 = arg3 + arg1;
				local105 = this.method6219();
				local15.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) arg2));
				this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
				local132 = this.anInt5489 + arg1;
				local138 = local132 + this.anInt5488;
				while (local138 <= local102) {
					local10.method4052(0.0F, (float) this.anInt5488, (float) arg2);
					local10.method4646(arg0, local132, 0);
					this.aClass20_Sub2_10.method1549();
					local138 += local105;
					local132 += local105;
					this.aClass20_Sub2_10.method1567();
				}
				if (local132 < local102) {
					local184 = local102 - local132;
					local15.method4052(1.0F, this.anInterface27_2.method8305((float) local184), this.anInterface27_2.method8301((float) arg2));
					this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
					local10.method4052(0.0F, (float) local184, (float) arg2);
					local10.method4646(arg0, local132, 0);
					this.aClass20_Sub2_10.method1549();
					this.aClass20_Sub2_10.method1567();
				}
			} else if (local73) {
				local102 = arg0 + arg2;
				local105 = this.method6205();
				local15.method4052(1.0F, this.anInterface27_2.method8305((float) arg3), this.anInterface27_2.method8301((float) this.anInt5482));
				this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
				local132 = arg0 + this.anInt5475;
				for (local138 = this.anInt5482 + local132; local138 <= local102; local138 += local105) {
					local10.method4052(0.0F, (float) arg3, (float) this.anInt5482);
					local10.method4646(local132, arg1, 0);
					this.aClass20_Sub2_10.method1549();
					local132 += local105;
					this.aClass20_Sub2_10.method1567();
				}
				if (local132 < local102) {
					local184 = local102 - local132;
					local15.method4052(1.0F, this.anInterface27_2.method8305((float) arg3), this.anInterface27_2.method8301((float) local184));
					this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
					local10.method4052(0.0F, (float) arg3, (float) local184);
					local10.method4646(local132, arg1, 0);
					this.aClass20_Sub2_10.method1549();
					this.aClass20_Sub2_10.method1567();
				}
			} else {
				local102 = arg3 + arg1;
				local105 = arg0 + arg2;
				local132 = this.method6205();
				local138 = this.method6219();
				local184 = this.anInt5489 + arg1;
				@Pc(254) int local254 = local184 + this.anInt5488;
				@Pc(284) int local284;
				@Pc(290) int local290;
				@Pc(338) int local338;
				while (local102 >= local254) {
					local15.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) this.anInt5482));
					this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
					local284 = this.anInt5475 + arg0;
					for (local290 = local284 + this.anInt5482; local290 <= local105; local290 += local132) {
						local10.method4052(0.0F, (float) this.anInt5488, (float) this.anInt5482);
						local10.method4646(local284, local184, 0);
						this.aClass20_Sub2_10.method1549();
						local284 += local132;
						this.aClass20_Sub2_10.method1567();
					}
					if (local105 > local284) {
						local338 = local105 - local284;
						local15.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) local338));
						this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
						local10.method4052(0.0F, (float) this.anInt5488, (float) local338);
						local10.method4646(local284, local184, 0);
						this.aClass20_Sub2_10.method1549();
						this.aClass20_Sub2_10.method1567();
					}
					local254 += local138;
					local184 += local138;
				}
				if (local102 > local184) {
					local284 = local102 - local184;
					local15.method4052(1.0F, this.anInterface27_2.method8305((float) local284), this.anInterface27_2.method8301((float) this.anInt5482));
					this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
					local290 = this.anInt5475 + arg0;
					local338 = this.anInt5482 + local290;
					while (local105 >= local338) {
						local10.method4052(0.0F, (float) local284, (float) this.anInt5482);
						local10.method4646(local290, local184, 0);
						this.aClass20_Sub2_10.method1549();
						local290 += local132;
						local338 += local132;
						this.aClass20_Sub2_10.method1567();
					}
					if (local290 < local105) {
						@Pc(483) int local483 = local105 - local290;
						local15.method4052(1.0F, this.anInterface27_2.method8305((float) local284), this.anInterface27_2.method8301((float) local483));
						this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
						local10.method4052(0.0F, (float) local284, (float) local483);
						local10.method4646(local290, local184, 0);
						this.aClass20_Sub2_10.method1549();
						this.aClass20_Sub2_10.method1567();
					}
				}
			}
		}
		this.aClass20_Sub2_10.method1513();
		this.aClass20_Sub2_10.method1483(1, Static154.aClass177_4);
		this.aClass20_Sub2_10.method1519(1, Static154.aClass177_4);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class30_Sub2 local8 = this.aClass20_Sub2_10.method1568();
		@Pc(13) Class30_Sub2 local13 = this.aClass20_Sub2_10.method1454();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface27 local19 = local16.anInterface27_4;
		this.anInterface27_2.method8287(this.aBoolean417 || this.aBoolean416 ? Static486.aClass298_10 : Static292.aClass298_5);
		this.aClass20_Sub2_10.method1498();
		this.aClass20_Sub2_10.method1484(this.anInterface27_2);
		this.aClass20_Sub2_10.method1451(1);
		this.aClass20_Sub2_10.method1557(1);
		if (this.aBoolean418) {
			@Pc(67) float local67 = (float) this.anInt5482 / (float) this.method6205();
			@Pc(75) float local75 = (float) this.anInt5488 / (float) this.method6219();
			local8.method4055(1.0F, local67 * (arg3 - arg1), local75 * (arg4 - arg0), 0.0F, 0.0F, local75 * (arg5 - arg1), 0.0F, 0.0F, (arg2 - arg0) * local67);
			local8.method4040(((float) this.anInt5489 + arg1) * local75, 0.0F, ((float) this.anInt5475 + arg0) * local67);
		} else {
			local8.method4055(1.0F, arg3 - arg1, arg4 - arg0, 0.0F, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0);
			local8.method4040(arg1, 0.0F, arg0);
		}
		local13.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) this.anInt5482));
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1531(1);
		this.aClass20_Sub2_10.method1484(local19);
		this.aClass20_Sub2_10.method1508(Static425.aClass315_3, Static492.aClass315_4);
		this.aClass20_Sub2_10.method1483(0, Static154.aClass177_4);
		@Pc(203) Class30_Sub2 local203 = this.aClass20_Sub2_10.method1454();
		local203.method4653(local8);
		local203.method4646(-arg7, -arg8, 0);
		local203.method4034(local19.method8305(1.0F), 1.0F, local19.method8301(1.0F));
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1549();
		this.aClass20_Sub2_10.method1567();
		this.aClass20_Sub2_10.method1513();
		this.aClass20_Sub2_10.method1483(0, Static118.aClass177_1);
		this.aClass20_Sub2_10.method1508(Static425.aClass315_3, Static425.aClass315_3);
		this.aClass20_Sub2_10.method1484(null);
		this.aClass20_Sub2_10.method1531(0);
		this.aClass20_Sub2_10.method1513();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	@Override
	public void method6207(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass20_Sub2_10.na(0, 0, this.anInt5482, this.anInt5488);
		@Pc(22) int[] local22 = new int[this.anInt5488 * this.anInt5482];
		this.anInterface27_2.method8299(local22, this.anInt5482, this.anInt5488);
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			for (local41 = 0; local41 < this.anInt5488; local41++) {
				local48 = local41 * this.anInt5482;
				for (local50 = 0; local50 < this.anInt5482; local50++) {
					local22[local48 + local50] = (local15[local48 + local50] & 0x6CFF0000) << 8 | local22[local48 + local50] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local41 = 0; local41 < this.anInt5488; local41++) {
				local48 = local41 * this.anInt5482;
				for (local50 = 0; local50 < this.anInt5482; local50++) {
					local22[local50 + local48] = (local15[local50 + local48] == 0 ? 0 : -16777216) | local22[local50 + local48] & 0xFFFFFF;
				}
			}
		}
		this.method4722(0, 0, this.anInt5482, this.anInt5488, local22, this.anInt5482);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class30_Sub2 local8 = this.aClass20_Sub2_10.method1568();
		@Pc(13) Class30_Sub2 local13 = this.aClass20_Sub2_10.method1454();
		this.anInterface27_2.method8287(this.aBoolean417 || this.aBoolean416 ? Static486.aClass298_10 : Static292.aClass298_5);
		this.aClass20_Sub2_10.method1498();
		this.aClass20_Sub2_10.method1484(this.anInterface27_2);
		this.aClass20_Sub2_10.method1451(arg6);
		this.aClass20_Sub2_10.method1557(arg4);
		this.aClass20_Sub2_10.method1483(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1519(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1528(arg5);
		local13.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) this.anInt5482));
		if (this.aBoolean418) {
			arg2 = arg2 * this.anInt5482 / this.method6205();
			arg3 = this.anInt5488 * arg3 / this.method6219();
			arg0 += this.anInt5475 * arg2 / this.anInt5482;
			arg1 += this.anInt5489 * arg3 / this.anInt5488;
		}
		local8.method4052(0.0F, (float) arg3, (float) arg2);
		local8.method4646(arg0, arg1, 0);
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1549();
		this.aClass20_Sub2_10.method1567();
		this.aClass20_Sub2_10.method1513();
		this.aClass20_Sub2_10.method1483(1, Static154.aClass177_4);
		this.aClass20_Sub2_10.method1519(1, Static154.aClass177_4);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([I)V")
	@Override
	public void method6223(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5475;
		arg0[1] = this.anInt5489;
		arg0[3] = this.anInt5472;
		arg0[2] = this.anInt5487;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class30_Sub2 local8 = this.aClass20_Sub2_10.method1568();
		@Pc(13) Class30_Sub2 local13 = this.aClass20_Sub2_10.method1454();
		@Pc(18) int local18 = arg0 + this.anInt5475;
		@Pc(23) int local23 = arg1 + this.anInt5489;
		this.anInterface27_2.method8287(Static486.aClass298_10);
		this.aClass20_Sub2_10.method1498();
		this.aClass20_Sub2_10.method1484(this.anInterface27_2);
		this.aClass20_Sub2_10.method1451(arg4);
		this.aClass20_Sub2_10.method1557(arg2);
		this.aClass20_Sub2_10.method1483(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1519(1, Static165.aClass177_3);
		this.aClass20_Sub2_10.method1528(arg3);
		local8.method4052(0.0F, (float) this.anInt5488, (float) this.anInt5482);
		local8.method4646(local18, local23, 0);
		local13.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) this.anInt5482));
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1549();
		this.aClass20_Sub2_10.method1567();
		this.aClass20_Sub2_10.method1513();
		this.aClass20_Sub2_10.method1483(1, Static154.aClass177_4);
		this.aClass20_Sub2_10.method1519(1, Static154.aClass177_4);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
	@Override
	public int method6210() {
		return this.anInt5482;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass20_Sub2_10.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4722(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method6202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg1 + this.anInt5489;
		@Pc(16) int local16 = arg0 + this.anInt5475;
		@Pc(19) Interface27 local19 = local6.anInterface27_4;
		this.anInterface27_2.method8287(Static486.aClass298_10);
		this.aClass20_Sub2_10.method1498();
		this.aClass20_Sub2_10.method1484(this.anInterface27_2);
		this.aClass20_Sub2_10.method1451(1);
		this.aClass20_Sub2_10.method1557(1);
		@Pc(49) Class30_Sub2 local49 = this.aClass20_Sub2_10.method1568();
		local49.method4052(0.0F, (float) this.anInt5488, (float) this.anInt5482);
		local49.method4646(local16, local11, 0);
		this.aClass20_Sub2_10.method1549();
		@Pc(73) Class30_Sub2 local73 = this.aClass20_Sub2_10.method1454();
		local73.method4052(1.0F, this.anInterface27_2.method8305((float) this.anInt5488), this.anInterface27_2.method8301((float) this.anInt5482));
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1531(1);
		this.aClass20_Sub2_10.method1484(local19);
		this.aClass20_Sub2_10.method1508(Static425.aClass315_3, Static492.aClass315_4);
		this.aClass20_Sub2_10.method1483(0, Static154.aClass177_4);
		@Pc(123) Class30_Sub2 local123 = this.aClass20_Sub2_10.method1454();
		local123.method4052(1.0F, local19.method8305((float) this.anInt5488), local19.method8301((float) this.anInt5482));
		local123.method4040(local19.method8305((float) (local11 - arg4)), 0.0F, local19.method8301((float) (local16 - arg3)));
		this.aClass20_Sub2_10.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_10.method1567();
		this.aClass20_Sub2_10.method1513();
		this.aClass20_Sub2_10.method1483(0, Static118.aClass177_1);
		this.aClass20_Sub2_10.method1508(Static425.aClass315_3, Static425.aClass315_3);
		this.aClass20_Sub2_10.method1484(null);
		this.aClass20_Sub2_10.method1531(0);
		this.aClass20_Sub2_10.method1513();
	}
}
