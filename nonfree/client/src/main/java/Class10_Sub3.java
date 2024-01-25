import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	private int anInt3137 = 0;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
	private int anInt3148 = 0;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	private int anInt3138 = 0;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	private int anInt3139 = 0;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	private final int anInt3142;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	private final int anInt3156;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_9;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "Lclient!gn;")
	private final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "Z")
	private final boolean aBoolean244;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "Z")
	private final boolean aBoolean246;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!qq;IIZ)V")
	public Class10_Sub3(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3142 = arg1;
		this.anInt3156 = arg2;
		this.aClass12_Sub2_9 = arg0;
		this.anInterface8_3 = arg0.method6187(arg3 ? Static253.aClass297_5 : Static514.aClass297_13, Static554.aClass340_14, arg2, arg1);
		this.anInterface8_3.method7331(true, true);
		this.aBoolean244 = arg1 != this.anInterface8_3.method7328();
		this.aBoolean242 = arg2 != this.anInterface8_3.method7327();
		this.aBoolean243 = !this.aBoolean244 && this.anInterface8_3.method7332();
		this.aBoolean246 = !this.aBoolean242 && this.anInterface8_3.method7332();
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!qq;II[III)V")
	public Class10_Sub3(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3142 = arg1;
		this.anInt3156 = arg2;
		this.aClass12_Sub2_9 = arg0;
		this.anInterface8_3 = arg0.method6257(arg3, arg5, arg4, arg2, false, arg1);
		this.anInterface8_3.method7331(true, true);
		this.aBoolean244 = this.anInterface8_3.method7328() != arg1;
		this.aBoolean242 = arg2 != this.anInterface8_3.method7327();
		this.aBoolean243 = !this.aBoolean244 && this.anInterface8_3.method7332();
		this.aBoolean246 = !this.aBoolean242 && this.anInterface8_3.method7332();
	}

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3138 = arg0;
		this.anInt3148 = arg2;
		this.anInt3137 = arg3;
		this.anInt3139 = arg1;
		this.aBoolean245 = this.anInt3138 != 0 || this.anInt3139 != 0 || this.anInt3148 != 0 || this.anInt3137 != 0;
	}

	@OriginalMember(owner = "client!gm", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class209_Sub2 local8 = this.aClass12_Sub2_9.method6245();
		@Pc(13) Class209_Sub2 local13 = this.aClass12_Sub2_9.method6270();
		this.anInterface8_3.method7669(this.aBoolean244 || this.aBoolean242 ? Static324.aClass225_6 : Static195.aClass225_3);
		this.aClass12_Sub2_9.method6201();
		this.aClass12_Sub2_9.method6159(this.anInterface8_3);
		this.aClass12_Sub2_9.method6183(arg8);
		this.aClass12_Sub2_9.method6249(arg6);
		this.aClass12_Sub2_9.method6179(Static135.aClass84_1, 1);
		this.aClass12_Sub2_9.method6234(1, Static135.aClass84_1);
		this.aClass12_Sub2_9.method6259(arg7);
		if (this.aBoolean245) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(93) float local93 = (arg3 - arg1) / local77;
			@Pc(99) float local99 = (arg4 - arg0) / local81;
			@Pc(105) float local105 = (arg5 - arg1) / local81;
			@Pc(111) float local111 = (float) this.anInt3139 * local99;
			@Pc(117) float local117 = local105 * (float) this.anInt3139;
			@Pc(123) float local123 = local87 * (float) this.anInt3138;
			@Pc(129) float local129 = (float) this.anInt3138 * local93;
			@Pc(136) float local136 = -local87 * (float) this.anInt3148;
			@Pc(143) float local143 = (float) this.anInt3148 * -local93;
			@Pc(150) float local150 = (float) this.anInt3137 * -local99;
			@Pc(157) float local157 = (float) this.anInt3137 * -local105;
			arg4 = arg4 + local123 + local150;
			arg1 = local117 + arg1 + local129;
			arg3 = local117 + local143 + arg3;
			arg0 = local111 + arg0 + local123;
			arg2 = local111 + local136 + arg2;
			arg5 = arg5 + local129 + local157;
		}
		local8.method4933(arg2 - arg0, arg4 - arg0, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg3 - arg1);
		local8.method4932(0.0F, arg1, arg0);
		local13.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6275();
		this.aClass12_Sub2_9.method6213();
		this.aClass12_Sub2_9.method6237();
		this.aClass12_Sub2_9.method6179(Static266.aClass84_5, 1);
		this.aClass12_Sub2_9.method6234(1, Static266.aClass84_5);
	}

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt3156;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7675(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class200 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class209_Sub2 local8 = this.aClass12_Sub2_9.method6245();
		@Pc(13) Class209_Sub2 local13 = this.aClass12_Sub2_9.method6270();
		@Pc(16) Class200_Sub1 local16 = (Class200_Sub1) arg6;
		@Pc(19) Interface8 local19 = local16.anInterface8_5;
		this.anInterface8_3.method7669(this.aBoolean244 || this.aBoolean242 ? Static324.aClass225_6 : Static195.aClass225_3);
		this.aClass12_Sub2_9.method6201();
		this.aClass12_Sub2_9.method6159(this.anInterface8_3);
		this.aClass12_Sub2_9.method6183(1);
		this.aClass12_Sub2_9.method6249(1);
		if (this.aBoolean245) {
			@Pc(98) float local98 = (float) this.anInt3142 / (float) this.A();
			@Pc(106) float local106 = (float) this.anInt3156 / (float) this.ca();
			local8.method4933((arg2 - arg0) * local98, local106 * (arg4 - arg0), 0.0F, 0.0F, 1.0F, 0.0F, local106 * (arg5 - arg1), 0.0F, (arg3 - arg1) * local98);
			local8.method4932(0.0F, (arg1 + (float) this.anInt3139) * local106, ((float) this.anInt3138 + arg0) * local98);
		} else {
			local8.method4933(arg2 - arg0, -arg0 + arg4, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg3 - arg1);
			local8.method4932(0.0F, arg1, arg0);
		}
		local13.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6196(1);
		this.aClass12_Sub2_9.method6159(local19);
		this.aClass12_Sub2_9.method6241(Static9.aClass108_2, Static240.aClass108_5);
		this.aClass12_Sub2_9.method6179(Static266.aClass84_5, 0);
		@Pc(204) Class209_Sub2 local204 = this.aClass12_Sub2_9.method6270();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method4928(local19.method7326(1.0F), 1.0F, local19.method7325(1.0F));
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6275();
		this.aClass12_Sub2_9.method6213();
		this.aClass12_Sub2_9.method6237();
		this.aClass12_Sub2_9.method6179(Static587.aClass84_6, 0);
		this.aClass12_Sub2_9.method6241(Static9.aClass108_2, Static9.aClass108_2);
		this.aClass12_Sub2_9.method6159(null);
		this.aClass12_Sub2_9.method6196(0);
		this.aClass12_Sub2_9.method6237();
	}

	@OriginalMember(owner = "client!gm", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class209_Sub2 local10 = this.aClass12_Sub2_9.method6245();
		@Pc(15) Class209_Sub2 local15 = this.aClass12_Sub2_9.method6270();
		this.anInterface8_3.method7669(Static324.aClass225_6);
		this.aClass12_Sub2_9.method6201();
		this.aClass12_Sub2_9.method6159(this.anInterface8_3);
		this.aClass12_Sub2_9.method6183(arg6);
		this.aClass12_Sub2_9.method6249(arg4);
		this.aClass12_Sub2_9.method6179(Static135.aClass84_1, 1);
		this.aClass12_Sub2_9.method6234(1, Static135.aClass84_1);
		this.aClass12_Sub2_9.method6259(arg5);
		@Pc(70) boolean local70 = this.aBoolean246 && this.anInt3139 == 0 && this.anInt3137 == 0;
		@Pc(89) boolean local89 = this.aBoolean243 && this.anInt3138 == 0 && this.anInt3148 == 0;
		if (local70 & local89) {
			local15.method4925(this.anInterface8_3.method7326((float) arg2), this.anInterface8_3.method7325((float) arg3), 1.0F);
			local10.method4925((float) arg2, (float) arg3, 0.0F);
			local10.U(arg0, arg1, 0);
			this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
			this.aClass12_Sub2_9.method6275();
			this.aClass12_Sub2_9.method6213();
		} else {
			@Pc(143) int local143;
			@Pc(146) int local146;
			@Pc(173) int local173;
			@Pc(178) int local178;
			@Pc(221) int local221;
			if (local89) {
				local143 = arg1 + arg3;
				local146 = this.ca();
				local15.method4925(this.anInterface8_3.method7326((float) arg2), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
				this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
				local173 = this.anInt3139 + arg1;
				for (local178 = this.anInt3156 + local173; local178 <= local143; local178 += local146) {
					local10.method4925((float) arg2, (float) this.anInt3156, 0.0F);
					local10.U(arg0, local173, 0);
					this.aClass12_Sub2_9.method6275();
					local173 += local146;
					this.aClass12_Sub2_9.method6213();
				}
				if (local143 > local173) {
					local221 = local143 - local173;
					local15.method4925(this.anInterface8_3.method7326((float) arg2), this.anInterface8_3.method7325((float) local221), 1.0F);
					this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
					local10.method4925((float) arg2, (float) local221, 0.0F);
					local10.U(arg0, local173, 0);
					this.aClass12_Sub2_9.method6275();
					this.aClass12_Sub2_9.method6213();
				}
			} else if (local70) {
				local143 = arg2 + arg0;
				local146 = this.A();
				local15.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) arg3), 1.0F);
				this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
				local173 = arg0 + this.anInt3138;
				local178 = this.anInt3142 + local173;
				while (local178 <= local143) {
					local10.method4925((float) this.anInt3142, (float) arg3, 0.0F);
					local10.U(local173, arg1, 0);
					this.aClass12_Sub2_9.method6275();
					local173 += local146;
					local178 += local146;
					this.aClass12_Sub2_9.method6213();
				}
				if (local143 > local173) {
					local221 = local143 - local173;
					local15.method4925(this.anInterface8_3.method7326((float) local221), this.anInterface8_3.method7325((float) arg3), 1.0F);
					this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
					local10.method4925((float) local221, (float) arg3, 0.0F);
					local10.U(local173, arg1, 0);
					this.aClass12_Sub2_9.method6275();
					this.aClass12_Sub2_9.method6213();
				}
			} else {
				local143 = arg1 + arg3;
				local146 = arg0 + arg2;
				local173 = this.A();
				local178 = this.ca();
				local221 = arg1 + this.anInt3139;
				@Pc(322) int local322;
				@Pc(327) int local327;
				@Pc(371) int local371;
				for (@Pc(292) int local292 = this.anInt3156 + local221; local292 <= local143; local292 += local178) {
					local15.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
					this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
					local322 = this.anInt3138 + arg0;
					local327 = local322 + this.anInt3142;
					while (local327 <= local146) {
						local10.method4925((float) this.anInt3142, (float) this.anInt3156, 0.0F);
						local10.U(local322, local221, 0);
						this.aClass12_Sub2_9.method6275();
						this.aClass12_Sub2_9.method6213();
						local327 += local173;
						local322 += local173;
					}
					if (local322 < local146) {
						local371 = local146 - local322;
						local15.method4925(this.anInterface8_3.method7326((float) local371), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
						this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
						local10.method4925((float) local371, (float) this.anInt3156, 0.0F);
						local10.U(local322, local221, 0);
						this.aClass12_Sub2_9.method6275();
						this.aClass12_Sub2_9.method6213();
					}
					local221 += local178;
				}
				if (local221 < local143) {
					local322 = local143 - local221;
					local15.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) local322), 1.0F);
					this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
					local327 = arg0 + this.anInt3138;
					for (local371 = this.anInt3142 + local327; local371 <= local146; local371 += local173) {
						local10.method4925((float) this.anInt3142, (float) local322, 0.0F);
						local10.U(local327, local221, 0);
						this.aClass12_Sub2_9.method6275();
						local327 += local173;
						this.aClass12_Sub2_9.method6213();
					}
					if (local327 < local146) {
						@Pc(522) int local522 = local146 - local327;
						local15.method4925(this.anInterface8_3.method7326((float) local522), this.anInterface8_3.method7325((float) local322), 1.0F);
						this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
						local10.method4925((float) local522, (float) local322, 0.0F);
						local10.U(local327, local221, 0);
						this.aClass12_Sub2_9.method6275();
						this.aClass12_Sub2_9.method6213();
					}
				}
			}
		}
		this.aClass12_Sub2_9.method6237();
		this.aClass12_Sub2_9.method6179(Static266.aClass84_5, 1);
		this.aClass12_Sub2_9.method6234(1, Static266.aClass84_5);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class200_Sub1 local6 = (Class200_Sub1) arg2;
		@Pc(11) int local11 = arg0 + this.anInt3138;
		@Pc(14) Interface8 local14 = local6.anInterface8_5;
		@Pc(19) int local19 = arg1 + this.anInt3139;
		this.anInterface8_3.method7669(Static324.aClass225_6);
		this.aClass12_Sub2_9.method6201();
		this.aClass12_Sub2_9.method6159(this.anInterface8_3);
		this.aClass12_Sub2_9.method6183(1);
		this.aClass12_Sub2_9.method6249(1);
		@Pc(49) Class209_Sub2 local49 = this.aClass12_Sub2_9.method6245();
		local49.method4925((float) this.anInt3142, (float) this.anInt3156, 0.0F);
		local49.U(local11, local19, 0);
		this.aClass12_Sub2_9.method6275();
		@Pc(73) Class209_Sub2 local73 = this.aClass12_Sub2_9.method6270();
		local73.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6196(1);
		this.aClass12_Sub2_9.method6159(local14);
		this.aClass12_Sub2_9.method6241(Static9.aClass108_2, Static240.aClass108_5);
		this.aClass12_Sub2_9.method6179(Static266.aClass84_5, 0);
		@Pc(123) Class209_Sub2 local123 = this.aClass12_Sub2_9.method6270();
		local123.method4925(local14.method7326((float) this.anInt3142), local14.method7325((float) this.anInt3156), 1.0F);
		local123.method4932(0.0F, local14.method7325((float) (local19 - arg4)), local14.method7326((float) (local11 - arg3)));
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6213();
		this.aClass12_Sub2_9.method6237();
		this.aClass12_Sub2_9.method6179(Static587.aClass84_6, 0);
		this.aClass12_Sub2_9.method6241(Static9.aClass108_2, Static9.aClass108_2);
		this.aClass12_Sub2_9.method6159(null);
		this.aClass12_Sub2_9.method6196(0);
		this.aClass12_Sub2_9.method6237();
	}

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt3142 + this.anInt3138 + this.anInt3148;
	}

	@OriginalMember(owner = "client!gm", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class209_Sub2 local8 = this.aClass12_Sub2_9.method6245();
		@Pc(13) Class209_Sub2 local13 = this.aClass12_Sub2_9.method6270();
		@Pc(18) int local18 = arg0 + this.anInt3138;
		@Pc(23) int local23 = arg1 + this.anInt3139;
		this.anInterface8_3.method7669(Static324.aClass225_6);
		this.aClass12_Sub2_9.method6201();
		this.aClass12_Sub2_9.method6159(this.anInterface8_3);
		this.aClass12_Sub2_9.method6183(arg4);
		this.aClass12_Sub2_9.method6249(arg2);
		this.aClass12_Sub2_9.method6179(Static135.aClass84_1, 1);
		this.aClass12_Sub2_9.method6234(1, Static135.aClass84_1);
		this.aClass12_Sub2_9.method6259(arg3);
		local8.method4925((float) this.anInt3142, (float) this.anInt3156, 0.0F);
		local8.U(local18, local23, 0);
		local13.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6275();
		this.aClass12_Sub2_9.method6213();
		this.aClass12_Sub2_9.method6237();
		this.aClass12_Sub2_9.method6179(Static266.aClass84_5, 1);
		this.aClass12_Sub2_9.method6234(1, Static266.aClass84_5);
	}

	@OriginalMember(owner = "client!gm", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt3137 + this.anInt3139 + this.anInt3156;
	}

	@OriginalMember(owner = "client!gm", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass12_Sub2_9.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2657(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt3142;
	}

	@OriginalMember(owner = "client!gm", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII[III)V")
	private void method2657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface8_3.method7330(arg5, arg2, arg1, arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!gm", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class209_Sub2 local8 = this.aClass12_Sub2_9.method6245();
		@Pc(13) Class209_Sub2 local13 = this.aClass12_Sub2_9.method6270();
		this.anInterface8_3.method7669(this.aBoolean244 || this.aBoolean242 ? Static324.aClass225_6 : Static195.aClass225_3);
		this.aClass12_Sub2_9.method6201();
		this.aClass12_Sub2_9.method6159(this.anInterface8_3);
		this.aClass12_Sub2_9.method6183(arg6);
		this.aClass12_Sub2_9.method6249(arg4);
		this.aClass12_Sub2_9.method6179(Static135.aClass84_1, 1);
		this.aClass12_Sub2_9.method6234(1, Static135.aClass84_1);
		this.aClass12_Sub2_9.method6259(arg5);
		local13.method4925(this.anInterface8_3.method7326((float) this.anInt3142), this.anInterface8_3.method7325((float) this.anInt3156), 1.0F);
		if (this.aBoolean245) {
			arg2 = this.anInt3142 * arg2 / this.A();
			arg3 = this.anInt3156 * arg3 / this.ca();
			arg1 += this.anInt3139 * arg3 / this.anInt3156;
			arg0 += this.anInt3138 * arg2 / this.anInt3142;
		}
		local8.method4925((float) arg2, (float) arg3, 0.0F);
		local8.U(arg0, arg1, 0);
		this.aClass12_Sub2_9.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_9.method6275();
		this.aClass12_Sub2_9.method6213();
		this.aClass12_Sub2_9.method6237();
		this.aClass12_Sub2_9.method6179(Static266.aClass84_5, 1);
		this.aClass12_Sub2_9.method6234(1, Static266.aClass84_5);
	}
}
