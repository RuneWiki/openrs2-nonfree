import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
	private int anInt10288 = 0;

	@OriginalMember(owner = "client!uba", name = "y", descriptor = "Z")
	private boolean aBoolean741 = false;

	@OriginalMember(owner = "client!uba", name = "C", descriptor = "I")
	private int anInt10281 = 0;

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "I")
	private int anInt10292 = 0;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	private int anInt10293 = 0;

	@OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
	private final int anInt10278;

	@OriginalMember(owner = "client!uba", name = "G", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_22;

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
	private final int anInt10296;

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "Lclient!gp;")
	private final Interface6 anInterface6_6;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "Z")
	private final boolean aBoolean742;

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "Z")
	private final boolean aBoolean740;

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Z")
	private final boolean aBoolean744;

	@OriginalMember(owner = "client!uba", name = "F", descriptor = "Z")
	private final boolean aBoolean743;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!nb;IIZ)V")
	public Class9_Sub3(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10278 = arg2;
		this.aClass67_Sub1_22 = arg0;
		this.anInt10296 = arg1;
		this.anInterface6_6 = arg0.method5682(arg2, arg1, Static438.aClass261_14, arg3 ? Static557.aClass145_14 : Static702.aClass145_15);
		this.anInterface6_6.method9275(true, true);
		this.aBoolean742 = this.anInterface6_6.method9271() != arg1;
		this.aBoolean740 = arg2 != this.anInterface6_6.method9277();
		this.aBoolean744 = !this.aBoolean742 && this.anInterface6_6.method9272();
		this.aBoolean743 = !this.aBoolean740 && this.anInterface6_6.method9272();
	}

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!nb;II[III)V")
	public Class9_Sub3(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10278 = arg2;
		this.anInt10296 = arg1;
		this.aClass67_Sub1_22 = arg0;
		this.anInterface6_6 = arg0.method5644(arg2, arg3, false, arg1, arg4, arg5);
		this.anInterface6_6.method9275(true, true);
		this.aBoolean742 = this.anInterface6_6.method9271() != arg1;
		this.aBoolean740 = this.anInterface6_6.method9277() != arg2;
		this.aBoolean744 = !this.aBoolean742 && this.anInterface6_6.method9272();
		this.aBoolean743 = !this.aBoolean740 && this.anInterface6_6.method9272();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8618(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class181_Sub1 local8 = this.aClass67_Sub1_22.method5586();
		@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_22.method5601();
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) arg6;
		@Pc(19) Interface6 local19 = local16.anInterface6_2;
		this.anInterface6_6.method9258(this.aBoolean742 || this.aBoolean740 || (0x1 & 0x1) == 0 ? Static278.aClass384_8 : Static108.aClass384_7);
		this.aClass67_Sub1_22.method5642();
		this.aClass67_Sub1_22.method5612(this.anInterface6_6);
		this.aClass67_Sub1_22.method5617(1);
		this.aClass67_Sub1_22.method5655(1);
		if (this.aBoolean741) {
			@Pc(75) float local75 = (float) this.anInt10296 / (float) this.method8619();
			@Pc(83) float local83 = (float) this.anInt10278 / (float) this.method8613();
			local8.method4914((arg3 - arg1) * local75, (arg4 - arg0) * local83, local83 * (arg5 - arg1), 1.0F, 0.0F, (arg2 - arg0) * local75, 0.0F, 0.0F, 0.0F);
			local8.method4915(((float) this.anInt10281 + arg1) * local83, 0.0F, local75 * (arg0 + (float) this.anInt10292));
		} else {
			local8.method4914(arg3 - arg1, -arg0 + arg4, arg5 - arg1, 1.0F, 0.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F);
			local8.method4915(arg1, 0.0F, arg0);
		}
		local13.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5687(1);
		this.aClass67_Sub1_22.method5612(local19);
		this.aClass67_Sub1_22.method5686(Static573.aClass37_3, Static496.aClass37_2);
		this.aClass67_Sub1_22.method5590(0, Static273.aClass58_2);
		@Pc(215) Class181_Sub1 local215 = this.aClass67_Sub1_22.method5601();
		local215.method6355(local8);
		local215.method6354(-arg7, -arg8, 0);
		local215.method4932(local19.method9269(1.0F), 1.0F, local19.method9276(1.0F));
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5639();
		this.aClass67_Sub1_22.method5635();
		this.aClass67_Sub1_22.method5614();
		this.aClass67_Sub1_22.method5590(0, Static143.aClass58_1);
		this.aClass67_Sub1_22.method5686(Static496.aClass37_2, Static496.aClass37_2);
		this.aClass67_Sub1_22.method5612((Interface12) null);
		this.aClass67_Sub1_22.method5687(0);
		this.aClass67_Sub1_22.method5614();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII[III)V")
	private void method8627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface6_6.method9273(arg4, arg1, arg3, arg0, arg2, arg5);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "()I")
	@Override
	public int method8613() {
		return this.anInt10288 + this.anInt10281 + this.anInt10278;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
	@Override
	public void method8605() {
		@Pc(15) int[] local15 = this.aClass67_Sub1_22.na(0, 0, this.anInt10296, this.anInt10278);
		@Pc(22) int[] local22 = new int[this.anInt10278 * this.anInt10296];
		this.anInterface6_6.method9274(this.anInt10278, this.anInt10296, local22);
		for (@Pc(58) int local58 = 0; local58 < this.anInt10278; local58++) {
			@Pc(65) int local65 = local58 * this.anInt10296;
			for (@Pc(67) int local67 = 0; local67 < this.anInt10296; local67++) {
				local22[local67 + local65] = local22[local67 + local65] & 0xFFFFFF | (local15[local65 + local67] == 0 ? 0 : -16777216);
			}
		}
		this.method8627(0, 0, this.anInt10296, this.anInt10278, local22, this.anInt10296);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "()I")
	@Override
	public int method8619() {
		return this.anInt10293 + this.anInt10296 + this.anInt10292;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(11) int local11 = arg0 + this.anInt10292;
		@Pc(14) Interface6 local14 = local6.anInterface6_2;
		@Pc(19) int local19 = arg1 + this.anInt10281;
		this.anInterface6_6.method9258(Static278.aClass384_8);
		this.aClass67_Sub1_22.method5642();
		this.aClass67_Sub1_22.method5612(this.anInterface6_6);
		this.aClass67_Sub1_22.method5617(1);
		this.aClass67_Sub1_22.method5655(1);
		@Pc(49) Class181_Sub1 local49 = this.aClass67_Sub1_22.method5586();
		local49.method4918((float) this.anInt10278, 0.0F, (float) this.anInt10296);
		local49.method6354(local11, local19, 0);
		this.aClass67_Sub1_22.method5639();
		@Pc(73) Class181_Sub1 local73 = this.aClass67_Sub1_22.method5601();
		local73.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5687(1);
		this.aClass67_Sub1_22.method5612(local14);
		this.aClass67_Sub1_22.method5686(Static573.aClass37_3, Static496.aClass37_2);
		this.aClass67_Sub1_22.method5590(0, Static273.aClass58_2);
		@Pc(123) Class181_Sub1 local123 = this.aClass67_Sub1_22.method5601();
		local123.method4918(local14.method9269((float) this.anInt10278), 1.0F, local14.method9276((float) this.anInt10296));
		local123.method4915(local14.method9269((float) (local19 - arg4)), 0.0F, local14.method9276((float) (local11 - arg3)));
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5635();
		this.aClass67_Sub1_22.method5614();
		this.aClass67_Sub1_22.method5590(0, Static143.aClass58_1);
		this.aClass67_Sub1_22.method5686(Static496.aClass37_2, Static496.aClass37_2);
		this.aClass67_Sub1_22.method5612((Interface12) null);
		this.aClass67_Sub1_22.method5687(0);
		this.aClass67_Sub1_22.method5614();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([I)V")
	@Override
	public void method8616(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10292;
		arg0[3] = this.anInt10288;
		arg0[1] = this.anInt10281;
		arg0[2] = this.anInt10293;
	}

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "()I")
	@Override
	public int method8602() {
		return this.anInt10296;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass67_Sub1_22.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method8627(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "()I")
	@Override
	public int method8611() {
		return this.anInt10278;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10293 = arg2;
		this.anInt10288 = arg3;
		this.anInt10292 = arg0;
		this.anInt10281 = arg1;
		this.aBoolean741 = this.anInt10292 != 0 || this.anInt10281 != 0 || this.anInt10293 != 0 || this.anInt10288 != 0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class181_Sub1 local8 = this.aClass67_Sub1_22.method5586();
		@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_22.method5601();
		this.anInterface6_6.method9258(this.aBoolean742 || this.aBoolean740 || !(true & true) ? Static278.aClass384_8 : Static108.aClass384_7);
		this.aClass67_Sub1_22.method5642();
		this.aClass67_Sub1_22.method5612(this.anInterface6_6);
		this.aClass67_Sub1_22.method5617(1);
		this.aClass67_Sub1_22.method5655(arg6);
		this.aClass67_Sub1_22.method5590(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5674(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5588(arg7);
		if (this.aBoolean741) {
			@Pc(79) float local79 = (float) this.method8619();
			@Pc(83) float local83 = (float) this.method8613();
			@Pc(89) float local89 = (arg2 - arg0) / local79;
			@Pc(95) float local95 = (arg3 - arg1) / local79;
			@Pc(101) float local101 = (arg4 - arg0) / local83;
			@Pc(108) float local108 = (arg5 - arg1) / local83;
			@Pc(114) float local114 = local101 * (float) this.anInt10281;
			@Pc(120) float local120 = (float) this.anInt10281 * local108;
			@Pc(126) float local126 = local89 * (float) this.anInt10292;
			@Pc(132) float local132 = (float) this.anInt10292 * local95;
			@Pc(139) float local139 = -local89 * (float) this.anInt10293;
			@Pc(146) float local146 = (float) this.anInt10293 * -local95;
			@Pc(153) float local153 = (float) this.anInt10288 * -local101;
			arg3 = local120 + local146 + arg3;
			arg4 = local153 + arg4 + local126;
			arg2 = local139 + arg2 + local114;
			arg1 = local120 + local132 + arg1;
			@Pc(184) float local184 = -local108 * (float) this.anInt10288;
			arg0 = local114 + local126 + arg0;
			arg5 = local132 + arg5 + local184;
		}
		local8.method4914(arg3 - arg1, arg4 - arg0, arg5 - arg1, 1.0F, 0.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F);
		local8.method4915(arg1, 0.0F, arg0);
		local13.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5639();
		this.aClass67_Sub1_22.method5635();
		this.aClass67_Sub1_22.method5614();
		this.aClass67_Sub1_22.method5590(1, Static273.aClass58_2);
		this.aClass67_Sub1_22.method5674(1, Static273.aClass58_2);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class181_Sub1 local10 = this.aClass67_Sub1_22.method5586();
		@Pc(15) Class181_Sub1 local15 = this.aClass67_Sub1_22.method5601();
		this.anInterface6_6.method9258(Static278.aClass384_8);
		this.aClass67_Sub1_22.method5642();
		this.aClass67_Sub1_22.method5612(this.anInterface6_6);
		this.aClass67_Sub1_22.method5617(arg6);
		this.aClass67_Sub1_22.method5655(arg4);
		this.aClass67_Sub1_22.method5590(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5674(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5588(arg5);
		@Pc(81) boolean local81 = this.aBoolean743 && this.anInt10281 == 0 && this.anInt10288 == 0;
		@Pc(102) boolean local102 = this.aBoolean744 && this.anInt10292 == 0 && this.anInt10293 == 0;
		if (local102 & local81) {
			local15.method4918(this.anInterface6_6.method9269((float) arg3), 1.0F, this.anInterface6_6.method9276((float) arg2));
			local10.method4918((float) arg3, 0.0F, (float) arg2);
			local10.method6354(arg0, arg1, 0);
			this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
			this.aClass67_Sub1_22.method5639();
			this.aClass67_Sub1_22.method5635();
		} else {
			@Pc(160) int local160;
			@Pc(163) int local163;
			@Pc(190) int local190;
			@Pc(196) int local196;
			@Pc(243) int local243;
			if (local102) {
				local160 = arg3 + arg1;
				local163 = this.method8613();
				local15.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) arg2));
				this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
				local190 = this.anInt10281 + arg1;
				for (local196 = local190 + this.anInt10278; local196 <= local160; local196 += local163) {
					local10.method4918((float) this.anInt10278, 0.0F, (float) arg2);
					local10.method6354(arg0, local190, 0);
					this.aClass67_Sub1_22.method5639();
					local190 += local163;
					this.aClass67_Sub1_22.method5635();
				}
				if (local160 > local190) {
					local243 = local160 - local190;
					local15.method4918(this.anInterface6_6.method9269((float) local243), 1.0F, this.anInterface6_6.method9276((float) arg2));
					this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
					local10.method4918((float) local243, 0.0F, (float) arg2);
					local10.method6354(arg0, local190, 0);
					this.aClass67_Sub1_22.method5639();
					this.aClass67_Sub1_22.method5635();
				}
			} else if (local81) {
				local160 = arg2 + arg0;
				local163 = this.method8619();
				local15.method4918(this.anInterface6_6.method9269((float) arg3), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
				this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
				local190 = arg0 + this.anInt10292;
				local196 = local190 + this.anInt10296;
				while (local160 >= local196) {
					local10.method4918((float) arg3, 0.0F, (float) this.anInt10296);
					local10.method6354(local190, arg1, 0);
					this.aClass67_Sub1_22.method5639();
					local196 += local163;
					local190 += local163;
					this.aClass67_Sub1_22.method5635();
				}
				if (local160 > local190) {
					local243 = local160 - local190;
					local15.method4918(this.anInterface6_6.method9269((float) arg3), 1.0F, this.anInterface6_6.method9276((float) local243));
					this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
					local10.method4918((float) arg3, 0.0F, (float) local243);
					local10.method6354(local190, arg1, 0);
					this.aClass67_Sub1_22.method5639();
					this.aClass67_Sub1_22.method5635();
				}
			} else {
				local160 = arg3 + arg1;
				local163 = arg2 + arg0;
				local190 = this.method8619();
				local196 = this.method8613();
				local243 = this.anInt10281 + arg1;
				@Pc(315) int local315 = this.anInt10278 + local243;
				@Pc(348) int local348;
				@Pc(354) int local354;
				@Pc(406) int local406;
				while (local160 >= local315) {
					local15.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
					this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
					local348 = arg0 + this.anInt10292;
					local354 = local348 + this.anInt10296;
					while (local354 <= local163) {
						local10.method4918((float) this.anInt10278, 0.0F, (float) this.anInt10296);
						local10.method6354(local348, local243, 0);
						this.aClass67_Sub1_22.method5639();
						local354 += local190;
						local348 += local190;
						this.aClass67_Sub1_22.method5635();
					}
					if (local163 > local348) {
						local406 = local163 - local348;
						local15.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) local406));
						this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
						local10.method4918((float) this.anInt10278, 0.0F, (float) local406);
						local10.method6354(local348, local243, 0);
						this.aClass67_Sub1_22.method5639();
						this.aClass67_Sub1_22.method5635();
					}
					local315 += local196;
					local243 += local196;
				}
				if (local160 > local243) {
					local348 = local160 - local243;
					local15.method4918(this.anInterface6_6.method9269((float) local348), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
					this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
					local354 = arg0 + this.anInt10292;
					local406 = this.anInt10296 + local354;
					while (local163 >= local406) {
						local10.method4918((float) local348, 0.0F, (float) this.anInt10296);
						local10.method6354(local354, local243, 0);
						this.aClass67_Sub1_22.method5639();
						local354 += local190;
						local406 += local190;
						this.aClass67_Sub1_22.method5635();
					}
					if (local354 < local163) {
						@Pc(561) int local561 = local163 - local354;
						local15.method4918(this.anInterface6_6.method9269((float) local348), 1.0F, this.anInterface6_6.method9276((float) local561));
						this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
						local10.method4918((float) local348, 0.0F, (float) local561);
						local10.method6354(local354, local243, 0);
						this.aClass67_Sub1_22.method5639();
						this.aClass67_Sub1_22.method5635();
					}
				}
			}
		}
		this.aClass67_Sub1_22.method5614();
		this.aClass67_Sub1_22.method5590(1, Static273.aClass58_2);
		this.aClass67_Sub1_22.method5674(1, Static273.aClass58_2);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class181_Sub1 local8 = this.aClass67_Sub1_22.method5586();
		@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_22.method5601();
		this.anInterface6_6.method9258(this.aBoolean742 || this.aBoolean740 || (0x1 & 0x1) == 0 ? Static278.aClass384_8 : Static108.aClass384_7);
		this.aClass67_Sub1_22.method5642();
		this.aClass67_Sub1_22.method5612(this.anInterface6_6);
		this.aClass67_Sub1_22.method5617(arg6);
		this.aClass67_Sub1_22.method5655(arg4);
		this.aClass67_Sub1_22.method5590(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5674(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5588(arg5);
		local13.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
		if (this.aBoolean741) {
			arg2 = arg2 * this.anInt10296 / this.method8619();
			arg3 = arg3 * this.anInt10278 / this.method8613();
			arg0 += arg2 * this.anInt10292 / this.anInt10296;
			arg1 += this.anInt10281 * arg3 / this.anInt10278;
		}
		local8.method4918((float) arg3, 0.0F, (float) arg2);
		local8.method6354(arg0, arg1, 0);
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5639();
		this.aClass67_Sub1_22.method5635();
		this.aClass67_Sub1_22.method5614();
		this.aClass67_Sub1_22.method5590(1, Static273.aClass58_2);
		this.aClass67_Sub1_22.method5674(1, Static273.aClass58_2);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class181_Sub1 local8 = this.aClass67_Sub1_22.method5586();
		@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_22.method5601();
		@Pc(18) int local18 = arg1 + this.anInt10281;
		@Pc(23) int local23 = arg0 + this.anInt10292;
		this.anInterface6_6.method9258(Static278.aClass384_8);
		this.aClass67_Sub1_22.method5642();
		this.aClass67_Sub1_22.method5612(this.anInterface6_6);
		this.aClass67_Sub1_22.method5617(arg4);
		this.aClass67_Sub1_22.method5655(arg2);
		this.aClass67_Sub1_22.method5590(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5674(1, Static472.aClass58_3);
		this.aClass67_Sub1_22.method5588(arg3);
		local8.method4918((float) this.anInt10278, 0.0F, (float) this.anInt10296);
		local8.method6354(local23, local18, 0);
		local13.method4918(this.anInterface6_6.method9269((float) this.anInt10278), 1.0F, this.anInterface6_6.method9276((float) this.anInt10296));
		this.aClass67_Sub1_22.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_22.method5639();
		this.aClass67_Sub1_22.method5635();
		this.aClass67_Sub1_22.method5614();
		this.aClass67_Sub1_22.method5590(1, Static273.aClass58_2);
		this.aClass67_Sub1_22.method5674(1, Static273.aClass58_2);
	}
}
