import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
	private int anInt1552 = 0;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
	private int anInt1560 = 0;

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
	private int anInt1558 = 0;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
	private int anInt1548 = 0;

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
	private final int anInt1555;

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
	private final int anInt1567;

	@OriginalMember(owner = "client!dfa", name = "D", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_4;

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "Lclient!hr;")
	private final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!dfa", name = "y", descriptor = "Z")
	private final boolean aBoolean117;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "Z")
	private final boolean aBoolean118;

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!dfa", name = "H", descriptor = "Z")
	private final boolean aBoolean119;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!gj;IIZ)V")
	public Class71_Sub1(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1555 = arg1;
		this.anInt1567 = arg2;
		this.aClass90_Sub3_4 = arg0;
		this.anInterface7_1 = arg0.method7626(arg3 ? Static493.aClass171_15 : Static246.aClass171_17, arg2, Static407.aClass254_14, arg1);
		this.aBoolean117 = this.anInterface7_1.method7046() != arg1;
		this.aBoolean118 = this.anInterface7_1.method7049() != arg2;
		this.aBoolean115 = !this.aBoolean117 && this.anInterface7_1.method7051();
		this.aBoolean119 = !this.aBoolean118 && this.anInterface7_1.method7051();
	}

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!gj;II[III)V")
	public Class71_Sub1(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass90_Sub3_4 = arg0;
		this.anInt1555 = arg1;
		this.anInt1567 = arg2;
		this.anInterface7_1 = arg0.method7623(arg3, false, arg4, arg1, arg5, arg2);
		this.aBoolean117 = arg1 != this.anInterface7_1.method7046();
		this.aBoolean118 = arg2 != this.anInterface7_1.method7049();
		this.aBoolean115 = !this.aBoolean117 && this.anInterface7_1.method7051();
		this.aBoolean119 = !this.aBoolean118 && this.anInterface7_1.method7051();
	}

	@OriginalMember(owner = "client!dfa", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1560 = arg0;
		this.anInt1552 = arg1;
		this.anInt1548 = arg2;
		this.anInt1558 = arg3;
		this.aBoolean116 = this.anInt1560 != 0 || this.anInt1552 != 0 || this.anInt1548 != 0 || this.anInt1558 != 0;
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt1567;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method7769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class17_Sub3 local6 = (Class17_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt1560;
		@Pc(16) int local16 = arg1 + this.anInt1552;
		@Pc(19) Interface7 local19 = local6.anInterface7_2;
		this.anInterface7_1.method7034(Static553.aClass257_11);
		this.aClass90_Sub3_4.method7558();
		this.aClass90_Sub3_4.method7624(this.anInterface7_1);
		this.aClass90_Sub3_4.method7640(1);
		this.aClass90_Sub3_4.method7620(1);
		@Pc(49) Class93_Sub3 local49 = this.aClass90_Sub3_4.method7602();
		local49.method3768((float) this.anInt1555, 0.0F, (float) this.anInt1567);
		local49.G(local11, local16, 0);
		this.aClass90_Sub3_4.method7619();
		@Pc(73) Class93_Sub3 local73 = this.aClass90_Sub3_4.method7585();
		local73.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7609(1);
		this.aClass90_Sub3_4.method7624(local19);
		this.aClass90_Sub3_4.method7570(Static140.aClass214_2, Static547.aClass214_5);
		this.aClass90_Sub3_4.method7540(0, Static422.aClass150_7);
		@Pc(123) Class93_Sub3 local123 = this.aClass90_Sub3_4.method7585();
		local123.method3768(local19.method7052((float) this.anInt1555), 1.0F, local19.method7053((float) this.anInt1567));
		local123.method3762(0.0F, local19.method7053((float) (local16 - arg4)), local19.method7052((float) (local11 - arg3)));
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7559();
		this.aClass90_Sub3_4.method7576();
		this.aClass90_Sub3_4.method7540(0, Static393.aClass150_6);
		this.aClass90_Sub3_4.method7570(Static547.aClass214_5, Static547.aClass214_5);
		this.aClass90_Sub3_4.method7624(null);
		this.aClass90_Sub3_4.method7609(0);
		this.aClass90_Sub3_4.method7576();
	}

	@OriginalMember(owner = "client!dfa", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class93_Sub3 local8 = this.aClass90_Sub3_4.method7602();
		@Pc(13) Class93_Sub3 local13 = this.aClass90_Sub3_4.method7585();
		this.anInterface7_1.method7034(this.aBoolean117 || this.aBoolean118 ? Static553.aClass257_11 : Static467.aClass257_9);
		this.aClass90_Sub3_4.method7558();
		this.aClass90_Sub3_4.method7624(this.anInterface7_1);
		this.aClass90_Sub3_4.method7640(arg6);
		this.aClass90_Sub3_4.method7620(arg4);
		this.aClass90_Sub3_4.method7540(1, Static20.aClass150_1);
		this.aClass90_Sub3_4.method7630(Static20.aClass150_1, 1);
		this.aClass90_Sub3_4.method7650(arg5);
		local13.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
		if (this.aBoolean116) {
			arg2 = this.anInt1555 * arg2 / this.AA();
			arg3 = arg3 * this.anInt1567 / this.a();
			arg0 += arg2 * this.anInt1560 / this.anInt1555;
			arg1 += arg3 * this.anInt1552 / this.anInt1567;
		}
		local8.method3768((float) arg2, 0.0F, (float) arg3);
		local8.G(arg0, arg1, 0);
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7619();
		this.aClass90_Sub3_4.method7559();
		this.aClass90_Sub3_4.method7576();
		this.aClass90_Sub3_4.method7540(1, Static422.aClass150_7);
		this.aClass90_Sub3_4.method7630(Static422.aClass150_7, 1);
	}

	@OriginalMember(owner = "client!dfa", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt1560 + this.anInt1555 + this.anInt1548;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIII[III)V")
	private void method1426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface7_1.method7048(arg0, arg2, arg1, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method7771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class93_Sub3 local8 = this.aClass90_Sub3_4.method7602();
		@Pc(13) Class93_Sub3 local13 = this.aClass90_Sub3_4.method7585();
		@Pc(16) Class17_Sub3 local16 = (Class17_Sub3) arg6;
		@Pc(19) Interface7 local19 = local16.anInterface7_2;
		this.anInterface7_1.method7034(Static467.aClass257_9);
		this.aClass90_Sub3_4.method7558();
		this.aClass90_Sub3_4.method7624(this.anInterface7_1);
		this.aClass90_Sub3_4.method7640(1);
		this.aClass90_Sub3_4.method7620(1);
		if (this.aBoolean116) {
			@Pc(87) float local87 = (float) this.anInt1555 / (float) this.AA();
			@Pc(95) float local95 = (float) this.anInt1567 / (float) this.a();
			local8.method3757((arg5 - arg1) * local95, (arg2 - arg0) * local87, 0.0F, 0.0F, 0.0F, (arg3 - arg1) * local87, 1.0F, 0.0F, local95 * (arg4 - arg0));
			local8.method3762(0.0F, local95 * (arg1 + (float) this.anInt1552), local87 * (arg0 + (float) this.anInt1560));
		} else {
			local8.method3757(arg5 - arg1, -arg0 + arg2, 0.0F, 0.0F, 0.0F, arg3 - arg1, 1.0F, 0.0F, arg4 - arg0);
			local8.method3762(0.0F, arg1, arg0);
		}
		local13.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7609(1);
		this.aClass90_Sub3_4.method7624(local19);
		this.aClass90_Sub3_4.method7570(Static140.aClass214_2, Static547.aClass214_5);
		this.aClass90_Sub3_4.method7540(0, Static422.aClass150_7);
		@Pc(193) Class93_Sub3 local193 = this.aClass90_Sub3_4.method7585();
		local193.la(local8);
		local193.G(-arg7, -arg8, 0);
		local193.method3771(local19.method7052(1.0F), 1.0F, local19.method7053(1.0F));
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7619();
		this.aClass90_Sub3_4.method7559();
		this.aClass90_Sub3_4.method7576();
		this.aClass90_Sub3_4.method7540(0, Static393.aClass150_6);
		this.aClass90_Sub3_4.method7570(Static547.aClass214_5, Static547.aClass214_5);
		this.aClass90_Sub3_4.method7624(null);
		this.aClass90_Sub3_4.method7609(0);
		this.aClass90_Sub3_4.method7576();
	}

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dfa", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass90_Sub3_4.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1426(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class93_Sub3 local8 = this.aClass90_Sub3_4.method7602();
		@Pc(13) Class93_Sub3 local13 = this.aClass90_Sub3_4.method7585();
		this.anInterface7_1.method7034(this.aBoolean117 || this.aBoolean118 ? Static553.aClass257_11 : Static467.aClass257_9);
		this.aClass90_Sub3_4.method7558();
		this.aClass90_Sub3_4.method7624(this.anInterface7_1);
		this.aClass90_Sub3_4.method7640(arg8);
		this.aClass90_Sub3_4.method7620(arg6);
		this.aClass90_Sub3_4.method7540(1, Static20.aClass150_1);
		this.aClass90_Sub3_4.method7630(Static20.aClass150_1, 1);
		this.aClass90_Sub3_4.method7650(arg7);
		if (this.aBoolean116) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(93) float local93 = (arg4 - arg0) / local74;
			@Pc(100) float local100 = (arg5 - arg1) / local74;
			@Pc(106) float local106 = (float) this.anInt1552 * local93;
			@Pc(112) float local112 = local100 * (float) this.anInt1552;
			@Pc(118) float local118 = local80 * (float) this.anInt1560;
			@Pc(124) float local124 = (float) this.anInt1560 * local87;
			@Pc(131) float local131 = (float) this.anInt1548 * -local80;
			@Pc(138) float local138 = -local87 * (float) this.anInt1548;
			@Pc(145) float local145 = (float) this.anInt1558 * -local93;
			@Pc(152) float local152 = (float) this.anInt1558 * -local100;
			arg3 = local112 + arg3 + local138;
			arg2 = arg2 + local131 + local106;
			arg1 = local112 + arg1 + local124;
			arg0 = arg0 + local118 + local106;
			arg4 = arg4 + local118 + local145;
			arg5 = local152 + local124 + arg5;
		}
		local8.method3757(arg5 - arg1, -arg0 + arg2, 0.0F, 0.0F, 0.0F, arg3 - arg1, 1.0F, 0.0F, arg4 - arg0);
		local8.method3762(0.0F, arg1, arg0);
		local13.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7619();
		this.aClass90_Sub3_4.method7559();
		this.aClass90_Sub3_4.method7576();
		this.aClass90_Sub3_4.method7540(1, Static422.aClass150_7);
		this.aClass90_Sub3_4.method7630(Static422.aClass150_7, 1);
	}

	@OriginalMember(owner = "client!dfa", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class93_Sub3 local10 = this.aClass90_Sub3_4.method7602();
		@Pc(15) Class93_Sub3 local15 = this.aClass90_Sub3_4.method7585();
		this.anInterface7_1.method7034(Static553.aClass257_11);
		this.aClass90_Sub3_4.method7558();
		this.aClass90_Sub3_4.method7624(this.anInterface7_1);
		this.aClass90_Sub3_4.method7640(arg6);
		this.aClass90_Sub3_4.method7620(arg4);
		this.aClass90_Sub3_4.method7540(1, Static20.aClass150_1);
		this.aClass90_Sub3_4.method7630(Static20.aClass150_1, 1);
		this.aClass90_Sub3_4.method7650(arg5);
		@Pc(73) boolean local73 = this.aBoolean119 && this.anInt1552 == 0 && this.anInt1558 == 0;
		@Pc(89) boolean local89 = this.aBoolean115 && this.anInt1560 == 0 && this.anInt1548 == 0;
		if (local89 & local73) {
			local15.method3768(this.anInterface7_1.method7052((float) arg2), 1.0F, this.anInterface7_1.method7053((float) arg3));
			local10.method3768((float) arg2, 0.0F, (float) arg3);
			local10.G(arg0, arg1, 0);
			this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
			this.aClass90_Sub3_4.method7619();
			this.aClass90_Sub3_4.method7559();
		} else {
			@Pc(101) int local101;
			@Pc(104) int local104;
			@Pc(132) int local132;
			@Pc(138) int local138;
			@Pc(185) int local185;
			if (local89) {
				local101 = arg1 + arg3;
				local104 = this.a();
				local15.method3768(this.anInterface7_1.method7052((float) arg2), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
				this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
				local132 = arg1 + this.anInt1552;
				for (local138 = this.anInt1567 + local132; local138 <= local101; local138 += local104) {
					local10.method3768((float) arg2, 0.0F, (float) this.anInt1567);
					local10.G(arg0, local132, 0);
					this.aClass90_Sub3_4.method7619();
					this.aClass90_Sub3_4.method7559();
					local132 += local104;
				}
				if (local101 > local132) {
					local185 = local101 - local132;
					local15.method3768(this.anInterface7_1.method7052((float) arg2), 1.0F, this.anInterface7_1.method7053((float) local185));
					this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
					local10.method3768((float) arg2, 0.0F, (float) local185);
					local10.G(arg0, local132, 0);
					this.aClass90_Sub3_4.method7619();
					this.aClass90_Sub3_4.method7559();
				}
			} else if (local73) {
				local101 = arg0 + arg2;
				local104 = this.AA();
				local15.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) arg3));
				this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
				local132 = arg0 + this.anInt1560;
				local138 = local132 + this.anInt1555;
				while (local101 >= local138) {
					local10.method3768((float) this.anInt1555, 0.0F, (float) arg3);
					local10.G(local132, arg1, 0);
					this.aClass90_Sub3_4.method7619();
					local138 += local104;
					local132 += local104;
					this.aClass90_Sub3_4.method7559();
				}
				if (local101 > local132) {
					local185 = local101 - local132;
					local15.method3768(this.anInterface7_1.method7052((float) local185), 1.0F, this.anInterface7_1.method7053((float) arg3));
					this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
					local10.method3768((float) local185, 0.0F, (float) arg3);
					local10.G(local132, arg1, 0);
					this.aClass90_Sub3_4.method7619();
					this.aClass90_Sub3_4.method7559();
				}
			} else {
				local101 = arg3 + arg1;
				local104 = arg2 + arg0;
				local132 = this.AA();
				local138 = this.a();
				local185 = arg1 + this.anInt1552;
				@Pc(284) int local284;
				@Pc(290) int local290;
				@Pc(338) int local338;
				for (@Pc(254) int local254 = this.anInt1567 + local185; local254 <= local101; local254 += local138) {
					local15.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
					this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
					local284 = this.anInt1560 + arg0;
					local290 = local284 + this.anInt1555;
					while (local290 <= local104) {
						local10.method3768((float) this.anInt1555, 0.0F, (float) this.anInt1567);
						local10.G(local284, local185, 0);
						this.aClass90_Sub3_4.method7619();
						local290 += local132;
						this.aClass90_Sub3_4.method7559();
						local284 += local132;
					}
					if (local104 > local284) {
						local338 = local104 - local284;
						local15.method3768(this.anInterface7_1.method7052((float) local338), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
						this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
						local10.method3768((float) local338, 0.0F, (float) this.anInt1567);
						local10.G(local284, local185, 0);
						this.aClass90_Sub3_4.method7619();
						this.aClass90_Sub3_4.method7559();
					}
					local185 += local138;
				}
				if (local185 < local101) {
					local284 = local101 - local185;
					local15.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) local284));
					this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
					local290 = arg0 + this.anInt1560;
					for (local338 = local290 + this.anInt1555; local338 <= local104; local338 += local132) {
						local10.method3768((float) this.anInt1555, 0.0F, (float) local284);
						local10.G(local290, local185, 0);
						this.aClass90_Sub3_4.method7619();
						this.aClass90_Sub3_4.method7559();
						local290 += local132;
					}
					if (local290 < local104) {
						@Pc(485) int local485 = local104 - local290;
						local15.method3768(this.anInterface7_1.method7052((float) local485), 1.0F, this.anInterface7_1.method7053((float) local284));
						this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
						local10.method3768((float) local485, 0.0F, (float) local284);
						local10.G(local290, local185, 0);
						this.aClass90_Sub3_4.method7619();
						this.aClass90_Sub3_4.method7559();
					}
				}
			}
		}
		this.aClass90_Sub3_4.method7576();
		this.aClass90_Sub3_4.method7540(1, Static422.aClass150_7);
		this.aClass90_Sub3_4.method7630(Static422.aClass150_7, 1);
	}

	@OriginalMember(owner = "client!dfa", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt1555;
	}

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class93_Sub3 local8 = this.aClass90_Sub3_4.method7602();
		@Pc(13) Class93_Sub3 local13 = this.aClass90_Sub3_4.method7585();
		@Pc(18) int local18 = arg0 + this.anInt1560;
		@Pc(23) int local23 = arg1 + this.anInt1552;
		this.anInterface7_1.method7034(Static553.aClass257_11);
		this.aClass90_Sub3_4.method7558();
		this.aClass90_Sub3_4.method7624(this.anInterface7_1);
		this.aClass90_Sub3_4.method7640(arg4);
		this.aClass90_Sub3_4.method7620(arg2);
		this.aClass90_Sub3_4.method7540(1, Static20.aClass150_1);
		this.aClass90_Sub3_4.method7630(Static20.aClass150_1, 1);
		this.aClass90_Sub3_4.method7650(arg3);
		local8.method3768((float) this.anInt1555, 0.0F, (float) this.anInt1567);
		local8.G(local18, local23, 0);
		local13.method3768(this.anInterface7_1.method7052((float) this.anInt1555), 1.0F, this.anInterface7_1.method7053((float) this.anInt1567));
		this.aClass90_Sub3_4.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_4.method7619();
		this.aClass90_Sub3_4.method7559();
		this.aClass90_Sub3_4.method7576();
		this.aClass90_Sub3_4.method7540(1, Static422.aClass150_7);
		this.aClass90_Sub3_4.method7630(Static422.aClass150_7, 1);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt1558 + this.anInt1567 + this.anInt1552;
	}
}
