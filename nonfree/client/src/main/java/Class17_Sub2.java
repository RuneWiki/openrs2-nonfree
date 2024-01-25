import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	private int anInt4011 = 0;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	private int anInt4024 = 0;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "I")
	private int anInt4026 = 0;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "I")
	private int anInt4019 = 0;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_9;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	private final int anInt4012;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	private final int anInt4004;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!ada;")
	private final Interface1 anInterface1_2;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "Z")
	private final boolean aBoolean301;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
	private final boolean aBoolean298;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "Z")
	private final boolean aBoolean300;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Z")
	private final boolean aBoolean299;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!wg;IIZ)V")
	public Class17_Sub2(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass33_Sub2_9 = arg0;
		this.anInt4012 = arg1;
		this.anInt4004 = arg2;
		this.anInterface1_2 = arg0.method8169(Static111.aClass79_7, arg1, arg3 ? Static220.aClass276_11 : Static133.aClass276_7, arg2);
		this.anInterface1_2.method8629(true, true);
		this.aBoolean301 = this.anInterface1_2.method8630() != arg1;
		this.aBoolean298 = this.anInterface1_2.method8628() != arg2;
		this.aBoolean300 = !this.aBoolean301 && this.anInterface1_2.method8623();
		this.aBoolean299 = !this.aBoolean298 && this.anInterface1_2.method8623();
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!wg;II[III)V")
	public Class17_Sub2(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4012 = arg1;
		this.aClass33_Sub2_9 = arg0;
		this.anInt4004 = arg2;
		this.anInterface1_2 = arg0.method8242(arg1, arg4, arg2, arg5, false, arg3);
		this.anInterface1_2.method8629(true, true);
		this.aBoolean301 = this.anInterface1_2.method8630() != arg1;
		this.aBoolean298 = this.anInterface1_2.method8628() != arg2;
		this.aBoolean300 = !this.aBoolean301 && this.anInterface1_2.method8623();
		this.aBoolean299 = !this.aBoolean298 && this.anInterface1_2.method8623();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Interface1 local9 = local6.anInterface1_4;
		@Pc(14) int local14 = arg1 + this.anInt4019;
		@Pc(19) int local19 = arg0 + this.anInt4011;
		this.anInterface1_2.method8612(Static248.aClass198_7);
		this.aClass33_Sub2_9.method8161();
		this.aClass33_Sub2_9.method8159(this.anInterface1_2);
		this.aClass33_Sub2_9.method8250(1);
		this.aClass33_Sub2_9.method8167(1);
		@Pc(49) Class92_Sub1 local49 = this.aClass33_Sub2_9.method8172();
		local49.method2302((float) this.anInt4004, 0.0F, (float) this.anInt4012);
		local49.method3851(local19, local14, 0);
		this.aClass33_Sub2_9.method8232();
		@Pc(73) Class92_Sub1 local73 = this.aClass33_Sub2_9.method8271();
		local73.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8235(1);
		this.aClass33_Sub2_9.method8159(local9);
		this.aClass33_Sub2_9.method8280(Static435.aClass91_3, Static489.aClass91_4);
		this.aClass33_Sub2_9.method8239(0, Static238.aClass230_3);
		@Pc(123) Class92_Sub1 local123 = this.aClass33_Sub2_9.method8271();
		local123.method2302(local9.method8631((float) this.anInt4004), 1.0F, local9.method8627((float) this.anInt4012));
		local123.method2311(local9.method8631((float) (local14 - arg4)), 0.0F, local9.method8627((float) (local19 - arg3)));
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8236();
		this.aClass33_Sub2_9.method8201();
		this.aClass33_Sub2_9.method8239(0, Static41.aClass230_1);
		this.aClass33_Sub2_9.method8280(Static435.aClass91_3, Static435.aClass91_3);
		this.aClass33_Sub2_9.method8159((Interface14) null);
		this.aClass33_Sub2_9.method8235(0);
		this.aClass33_Sub2_9.method8201();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	@Override
	public void method5254(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass33_Sub2_9.na(0, 0, this.anInt4012, this.anInt4004);
		@Pc(22) int[] local22 = new int[this.anInt4004 * this.anInt4012];
		this.anInterface1_2.method8624(this.anInt4012, local22, this.anInt4004);
		@Pc(102) int local102;
		@Pc(109) int local109;
		@Pc(111) int local111;
		if (arg0 == 0) {
			for (local102 = 0; local102 < this.anInt4004; local102++) {
				local109 = this.anInt4012 * local102;
				for (local111 = 0; local111 < this.anInt4012; local111++) {
					local22[local111 + local109] = local22[local109 + local111] & 0xFFFFFF | (local15[local109 + local111] & 0x7BFF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local102 = 0; local102 < this.anInt4004; local102++) {
				local109 = local102 * this.anInt4012;
				for (local111 = 0; local111 < this.anInt4012; local111++) {
					local22[local109 + local111] = (local15[local111 + local109] == 0 ? 0 : -16777216) | local22[local111 + local109] & 0xFFFFFF;
				}
			}
		}
		this.method3602(0, 0, this.anInt4012, this.anInt4004, local22, this.anInt4012);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII[III)V")
	private void method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface1_2.method8625(arg2, arg0, arg3, arg4, arg5, arg1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class92_Sub1 local8 = this.aClass33_Sub2_9.method8172();
		@Pc(13) Class92_Sub1 local13 = this.aClass33_Sub2_9.method8271();
		@Pc(18) int local18 = arg1 + this.anInt4019;
		@Pc(23) int local23 = arg0 + this.anInt4011;
		this.anInterface1_2.method8612(Static248.aClass198_7);
		this.aClass33_Sub2_9.method8161();
		this.aClass33_Sub2_9.method8159(this.anInterface1_2);
		this.aClass33_Sub2_9.method8250(arg4);
		this.aClass33_Sub2_9.method8167(arg2);
		this.aClass33_Sub2_9.method8239(1, Static228.aClass230_2);
		this.aClass33_Sub2_9.method8258(Static228.aClass230_2, 1);
		this.aClass33_Sub2_9.method8208(arg3);
		local8.method2302((float) this.anInt4004, 0.0F, (float) this.anInt4012);
		local8.method3851(local23, local18, 0);
		local13.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8232();
		this.aClass33_Sub2_9.method8236();
		this.aClass33_Sub2_9.method8201();
		this.aClass33_Sub2_9.method8239(1, Static238.aClass230_3);
		this.aClass33_Sub2_9.method8258(Static238.aClass230_3, 1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([I)V")
	@Override
	public void method5267(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4011;
		arg0[1] = this.anInt4019;
		arg0[2] = this.anInt4024;
		arg0[3] = this.anInt4026;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()I")
	@Override
	public int method5253() {
		return this.anInt4004;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class92_Sub1 local8 = this.aClass33_Sub2_9.method8172();
		@Pc(13) Class92_Sub1 local13 = this.aClass33_Sub2_9.method8271();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface1 local19 = local16.anInterface1_4;
		this.anInterface1_2.method8612(this.aBoolean301 || this.aBoolean298 ? Static248.aClass198_7 : Static156.aClass198_4);
		this.aClass33_Sub2_9.method8161();
		this.aClass33_Sub2_9.method8159(this.anInterface1_2);
		this.aClass33_Sub2_9.method8250(1);
		this.aClass33_Sub2_9.method8167(1);
		if (this.aBoolean297) {
			@Pc(99) float local99 = (float) this.anInt4012 / (float) this.method5256();
			@Pc(107) float local107 = (float) this.anInt4004 / (float) this.method5251();
			local8.method2306(0.0F, (arg5 - arg1) * local107, 0.0F, local99 * (arg3 - arg1), 0.0F, 1.0F, 0.0F, (arg4 - arg0) * local107, local99 * (arg2 - arg0));
			local8.method2311(((float) this.anInt4019 + arg1) * local107, 0.0F, ((float) this.anInt4011 + arg0) * local99);
		} else {
			local8.method2306(0.0F, arg5 - arg1, 0.0F, arg3 - arg1, 0.0F, 1.0F, 0.0F, arg4 - arg0, -arg0 + arg2);
			local8.method2311(arg1, 0.0F, arg0);
		}
		local13.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8235(1);
		this.aClass33_Sub2_9.method8159(local19);
		this.aClass33_Sub2_9.method8280(Static435.aClass91_3, Static489.aClass91_4);
		this.aClass33_Sub2_9.method8239(0, Static238.aClass230_3);
		@Pc(206) Class92_Sub1 local206 = this.aClass33_Sub2_9.method8271();
		local206.method3865(local8);
		local206.method3851(-arg7, -arg8, 0);
		local206.method2315(local19.method8631(1.0F), local19.method8627(1.0F), 1.0F);
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8232();
		this.aClass33_Sub2_9.method8236();
		this.aClass33_Sub2_9.method8201();
		this.aClass33_Sub2_9.method8239(0, Static41.aClass230_1);
		this.aClass33_Sub2_9.method8280(Static435.aClass91_3, Static435.aClass91_3);
		this.aClass33_Sub2_9.method8159((Interface14) null);
		this.aClass33_Sub2_9.method8235(0);
		this.aClass33_Sub2_9.method8201();
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
	@Override
	public int method5256() {
		return this.anInt4012 + this.anInt4011 + this.anInt4024;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()I")
	@Override
	public int method5268() {
		return this.anInt4012;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4024 = arg2;
		this.anInt4026 = arg3;
		this.anInt4011 = arg0;
		this.anInt4019 = arg1;
		this.aBoolean297 = this.anInt4011 != 0 || this.anInt4019 != 0 || this.anInt4024 != 0 || this.anInt4026 != 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5262(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class92_Sub1 local8 = this.aClass33_Sub2_9.method8172();
		@Pc(13) Class92_Sub1 local13 = this.aClass33_Sub2_9.method8271();
		this.anInterface1_2.method8612(this.aBoolean301 || this.aBoolean298 ? Static248.aClass198_7 : Static156.aClass198_4);
		this.aClass33_Sub2_9.method8161();
		this.aClass33_Sub2_9.method8159(this.anInterface1_2);
		this.aClass33_Sub2_9.method8250(1);
		this.aClass33_Sub2_9.method8167(arg6);
		this.aClass33_Sub2_9.method8239(1, Static228.aClass230_2);
		this.aClass33_Sub2_9.method8258(Static228.aClass230_2, 1);
		this.aClass33_Sub2_9.method8208(arg7);
		if (this.aBoolean297) {
			@Pc(77) float local77 = (float) this.method5256();
			@Pc(81) float local81 = (float) this.method5251();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(108) float local108 = (arg5 - arg1) / local81;
			@Pc(114) float local114 = (float) this.anInt4019 * local101;
			@Pc(120) float local120 = (float) this.anInt4019 * local108;
			@Pc(126) float local126 = local88 * (float) this.anInt4011;
			@Pc(132) float local132 = (float) this.anInt4011 * local94;
			@Pc(139) float local139 = (float) this.anInt4024 * -local88;
			@Pc(146) float local146 = (float) this.anInt4024 * -local94;
			@Pc(153) float local153 = (float) this.anInt4026 * -local101;
			arg4 = local126 + arg4 + local153;
			@Pc(166) float local166 = -local108 * (float) this.anInt4026;
			arg3 = local120 + arg3 + local146;
			arg1 = local132 + arg1 + local120;
			arg0 = local114 + local126 + arg0;
			arg2 = arg2 + local139 + local114;
			arg5 = local166 + local132 + arg5;
		}
		local8.method2306(0.0F, arg5 - arg1, 0.0F, arg3 - arg1, 0.0F, 1.0F, 0.0F, arg4 - arg0, -arg0 + arg2);
		local8.method2311(arg1, 0.0F, arg0);
		local13.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8232();
		this.aClass33_Sub2_9.method8236();
		this.aClass33_Sub2_9.method8201();
		this.aClass33_Sub2_9.method8239(1, Static238.aClass230_3);
		this.aClass33_Sub2_9.method8258(Static238.aClass230_3, 1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()I")
	@Override
	public int method5251() {
		return this.anInt4026 + this.anInt4019 + this.anInt4004;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class92_Sub1 local10 = this.aClass33_Sub2_9.method8172();
		@Pc(15) Class92_Sub1 local15 = this.aClass33_Sub2_9.method8271();
		this.anInterface1_2.method8612(Static248.aClass198_7);
		this.aClass33_Sub2_9.method8161();
		this.aClass33_Sub2_9.method8159(this.anInterface1_2);
		this.aClass33_Sub2_9.method8250(arg6);
		this.aClass33_Sub2_9.method8167(arg4);
		this.aClass33_Sub2_9.method8239(1, Static228.aClass230_2);
		this.aClass33_Sub2_9.method8258(Static228.aClass230_2, 1);
		this.aClass33_Sub2_9.method8208(arg5);
		@Pc(73) boolean local73 = this.aBoolean299 && this.anInt4019 == 0 && this.anInt4026 == 0;
		@Pc(86) boolean local86 = this.aBoolean300 && this.anInt4011 == 0 && this.anInt4024 == 0;
		if (local73 & local86) {
			local15.method2302(this.anInterface1_2.method8631((float) arg3), 1.0F, this.anInterface1_2.method8627((float) arg2));
			local10.method2302((float) arg3, 0.0F, (float) arg2);
			local10.method3851(arg0, arg1, 0);
			this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
			this.aClass33_Sub2_9.method8232();
			this.aClass33_Sub2_9.method8236();
		} else {
			@Pc(142) int local142;
			@Pc(145) int local145;
			@Pc(172) int local172;
			@Pc(178) int local178;
			@Pc(225) int local225;
			if (local86) {
				local142 = arg3 + arg1;
				local145 = this.method5251();
				local15.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) arg2));
				this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
				local172 = this.anInt4019 + arg1;
				local178 = local172 + this.anInt4004;
				while (local142 >= local178) {
					local10.method2302((float) this.anInt4004, 0.0F, (float) arg2);
					local10.method3851(arg0, local172, 0);
					this.aClass33_Sub2_9.method8232();
					local178 += local145;
					this.aClass33_Sub2_9.method8236();
					local172 += local145;
				}
				if (local172 < local142) {
					local225 = local142 - local172;
					local15.method2302(this.anInterface1_2.method8631((float) local225), 1.0F, this.anInterface1_2.method8627((float) arg2));
					this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
					local10.method2302((float) local225, 0.0F, (float) arg2);
					local10.method3851(arg0, local172, 0);
					this.aClass33_Sub2_9.method8232();
					this.aClass33_Sub2_9.method8236();
				}
			} else if (local73) {
				local142 = arg0 + arg2;
				local145 = this.method5256();
				local15.method2302(this.anInterface1_2.method8631((float) arg3), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
				this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
				local172 = this.anInt4011 + arg0;
				local178 = local172 + this.anInt4012;
				while (local142 >= local178) {
					local10.method2302((float) arg3, 0.0F, (float) this.anInt4012);
					local10.method3851(local172, arg1, 0);
					this.aClass33_Sub2_9.method8232();
					this.aClass33_Sub2_9.method8236();
					local178 += local145;
					local172 += local145;
				}
				if (local172 < local142) {
					local225 = local142 - local172;
					local15.method2302(this.anInterface1_2.method8631((float) arg3), 1.0F, this.anInterface1_2.method8627((float) local225));
					this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
					local10.method2302((float) arg3, 0.0F, (float) local225);
					local10.method3851(local172, arg1, 0);
					this.aClass33_Sub2_9.method8232();
					this.aClass33_Sub2_9.method8236();
				}
			} else {
				local142 = arg3 + arg1;
				local145 = arg0 + arg2;
				local172 = this.method5256();
				local178 = this.method5251();
				local225 = arg1 + this.anInt4019;
				@Pc(325) int local325;
				@Pc(330) int local330;
				@Pc(374) int local374;
				for (@Pc(295) int local295 = this.anInt4004 + local225; local295 <= local142; local295 += local178) {
					local15.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
					this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
					local325 = this.anInt4011 + arg0;
					for (local330 = this.anInt4012 + local325; local330 <= local145; local330 += local172) {
						local10.method2302((float) this.anInt4004, 0.0F, (float) this.anInt4012);
						local10.method3851(local325, local225, 0);
						this.aClass33_Sub2_9.method8232();
						local325 += local172;
						this.aClass33_Sub2_9.method8236();
					}
					if (local145 > local325) {
						local374 = local145 - local325;
						local15.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) local374));
						this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
						local10.method2302((float) this.anInt4004, 0.0F, (float) local374);
						local10.method3851(local325, local225, 0);
						this.aClass33_Sub2_9.method8232();
						this.aClass33_Sub2_9.method8236();
					}
					local225 += local178;
				}
				if (local225 < local142) {
					local325 = local142 - local225;
					local15.method2302(this.anInterface1_2.method8631((float) local325), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
					this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
					local330 = this.anInt4011 + arg0;
					local374 = local330 + this.anInt4012;
					while (local145 >= local374) {
						local10.method2302((float) local325, 0.0F, (float) this.anInt4012);
						local10.method3851(local330, local225, 0);
						this.aClass33_Sub2_9.method8232();
						local330 += local172;
						local374 += local172;
						this.aClass33_Sub2_9.method8236();
					}
					if (local330 < local145) {
						@Pc(512) int local512 = local145 - local330;
						local15.method2302(this.anInterface1_2.method8631((float) local325), 1.0F, this.anInterface1_2.method8627((float) local512));
						this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
						local10.method2302((float) local325, 0.0F, (float) local512);
						local10.method3851(local330, local225, 0);
						this.aClass33_Sub2_9.method8232();
						this.aClass33_Sub2_9.method8236();
					}
				}
			}
		}
		this.aClass33_Sub2_9.method8201();
		this.aClass33_Sub2_9.method8239(1, Static238.aClass230_3);
		this.aClass33_Sub2_9.method8258(Static238.aClass230_3, 1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class92_Sub1 local8 = this.aClass33_Sub2_9.method8172();
		@Pc(13) Class92_Sub1 local13 = this.aClass33_Sub2_9.method8271();
		this.anInterface1_2.method8612(this.aBoolean301 || this.aBoolean298 ? Static248.aClass198_7 : Static156.aClass198_4);
		this.aClass33_Sub2_9.method8161();
		this.aClass33_Sub2_9.method8159(this.anInterface1_2);
		this.aClass33_Sub2_9.method8250(arg6);
		this.aClass33_Sub2_9.method8167(arg4);
		this.aClass33_Sub2_9.method8239(1, Static228.aClass230_2);
		this.aClass33_Sub2_9.method8258(Static228.aClass230_2, 1);
		this.aClass33_Sub2_9.method8208(arg5);
		local13.method2302(this.anInterface1_2.method8631((float) this.anInt4004), 1.0F, this.anInterface1_2.method8627((float) this.anInt4012));
		if (this.aBoolean297) {
			arg2 = arg2 * this.anInt4012 / this.method5256();
			arg3 = this.anInt4004 * arg3 / this.method5251();
			arg0 += this.anInt4011 * arg2 / this.anInt4012;
			arg1 += arg3 * this.anInt4019 / this.anInt4004;
		}
		local8.method2302((float) arg3, 0.0F, (float) arg2);
		local8.method3851(arg0, arg1, 0);
		this.aClass33_Sub2_9.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_9.method8232();
		this.aClass33_Sub2_9.method8236();
		this.aClass33_Sub2_9.method8201();
		this.aClass33_Sub2_9.method8239(1, Static238.aClass230_3);
		this.aClass33_Sub2_9.method8258(Static238.aClass230_3, 1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass33_Sub2_9.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method3602(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}
}
