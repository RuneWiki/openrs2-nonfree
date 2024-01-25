import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	private int anInt287 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	private int anInt286 = 0;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	private int anInt302 = 0;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
	private int anInt305 = 0;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	private final int anInt289;

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_1;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	private final int anInt295;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "Lclient!pm;")
	private final Interface17 anInterface17_1;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "Z")
	private final boolean aBoolean33;

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "Z")
	private final boolean aBoolean34;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!mj;IIZ)V")
	public Class14_Sub1(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt289 = arg2;
		this.aClass45_Sub2_1 = arg0;
		this.anInt295 = arg1;
		this.anInterface17_1 = arg0.method4931(arg1, arg2, Static471.aClass298_15, arg3 ? Static469.aClass314_11 : Static485.aClass314_20);
		this.anInterface17_1.method6973(true, true);
		this.aBoolean33 = arg1 != this.anInterface17_1.method6966();
		this.aBoolean34 = arg2 != this.anInterface17_1.method6968();
		this.aBoolean30 = !this.aBoolean33 && this.anInterface17_1.method6969();
		this.aBoolean31 = !this.aBoolean34 && this.anInterface17_1.method6969();
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!mj;II[III)V")
	public Class14_Sub1(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass45_Sub2_1 = arg0;
		this.anInt289 = arg2;
		this.anInt295 = arg1;
		this.anInterface17_1 = arg0.method4965(false, arg5, arg2, arg1, arg3, arg4);
		this.anInterface17_1.method6973(true, true);
		this.aBoolean33 = arg1 != this.anInterface17_1.method6966();
		this.aBoolean34 = this.anInterface17_1.method6968() != arg2;
		this.aBoolean30 = !this.aBoolean33 && this.anInterface17_1.method6969();
		this.aBoolean31 = !this.aBoolean34 && this.anInterface17_1.method6969();
	}

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt295;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII[III)V")
	private void method239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface17_1.method6967(arg5, arg2, arg1, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class81 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class11_Sub1 local8 = this.aClass45_Sub2_1.method4960();
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_1.method5007();
		@Pc(16) Class81_Sub2 local16 = (Class81_Sub2) arg6;
		@Pc(19) Interface17 local19 = local16.anInterface17_3;
		this.anInterface17_1.method6963(this.aBoolean33 || this.aBoolean34 ? Static347.aClass71_8 : Static567.aClass71_11);
		this.aClass45_Sub2_1.method5015();
		this.aClass45_Sub2_1.method4926(this.anInterface17_1);
		this.aClass45_Sub2_1.method5019(1);
		this.aClass45_Sub2_1.method4939(1);
		if (this.aBoolean32) {
			@Pc(67) float local67 = (float) this.anInt295 / (float) this.A();
			@Pc(75) float local75 = (float) this.anInt289 / (float) this.ca();
			local8.method176(0.0F, local75 * (arg4 - arg0), local67 * (arg3 - arg1), 0.0F, 0.0F, (arg2 - arg0) * local67, 0.0F, local75 * (arg5 - arg1), 1.0F);
			local8.method171(local67 * ((float) this.anInt287 + arg0), 0.0F, (arg1 + (float) this.anInt302) * local75);
		} else {
			local8.method176(0.0F, arg4 - arg0, arg3 - arg1, 0.0F, 0.0F, arg2 - arg0, 0.0F, arg5 - arg1, 1.0F);
			local8.method171(arg0, 0.0F, arg1);
		}
		local13.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4961(1);
		this.aClass45_Sub2_1.method4926(local19);
		this.aClass45_Sub2_1.method4921(Static19.aClass307_1, Static534.aClass307_7);
		this.aClass45_Sub2_1.method4953(0, Static160.aClass108_2);
		@Pc(204) Class11_Sub1 local204 = this.aClass45_Sub2_1.method5007();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method166(local19.method6970(1.0F), 1.0F, local19.method6972(1.0F));
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4992();
		this.aClass45_Sub2_1.method4902();
		this.aClass45_Sub2_1.method4950();
		this.aClass45_Sub2_1.method4953(0, Static164.aClass108_3);
		this.aClass45_Sub2_1.method4921(Static19.aClass307_1, Static19.aClass307_1);
		this.aClass45_Sub2_1.method4926(null);
		this.aClass45_Sub2_1.method4961(0);
		this.aClass45_Sub2_1.method4950();
	}

	@OriginalMember(owner = "client!ai", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt302 + this.anInt289 + this.anInt286;
	}

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt305 + this.anInt287 + this.anInt295;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class81_Sub2 local6 = (Class81_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt287;
		@Pc(14) Interface17 local14 = local6.anInterface17_3;
		@Pc(19) int local19 = arg1 + this.anInt302;
		this.anInterface17_1.method6963(Static347.aClass71_8);
		this.aClass45_Sub2_1.method5015();
		this.aClass45_Sub2_1.method4926(this.anInterface17_1);
		this.aClass45_Sub2_1.method5019(1);
		this.aClass45_Sub2_1.method4939(1);
		@Pc(49) Class11_Sub1 local49 = this.aClass45_Sub2_1.method4960();
		local49.method184((float) this.anInt295, (float) this.anInt289, 0.0F);
		local49.U(local11, local19, 0);
		this.aClass45_Sub2_1.method4992();
		@Pc(73) Class11_Sub1 local73 = this.aClass45_Sub2_1.method5007();
		local73.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4961(1);
		this.aClass45_Sub2_1.method4926(local14);
		this.aClass45_Sub2_1.method4921(Static19.aClass307_1, Static534.aClass307_7);
		this.aClass45_Sub2_1.method4953(0, Static160.aClass108_2);
		@Pc(123) Class11_Sub1 local123 = this.aClass45_Sub2_1.method5007();
		local123.method184(local14.method6970((float) this.anInt295), local14.method6972((float) this.anInt289), 1.0F);
		local123.method171(local14.method6970((float) (local11 - arg3)), 0.0F, local14.method6972((float) (local19 - arg4)));
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4902();
		this.aClass45_Sub2_1.method4950();
		this.aClass45_Sub2_1.method4953(0, Static164.aClass108_3);
		this.aClass45_Sub2_1.method4921(Static19.aClass307_1, Static19.aClass307_1);
		this.aClass45_Sub2_1.method4926(null);
		this.aClass45_Sub2_1.method4961(0);
		this.aClass45_Sub2_1.method4950();
	}

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class11_Sub1 local8 = this.aClass45_Sub2_1.method4960();
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_1.method5007();
		@Pc(18) int local18 = arg0 + this.anInt287;
		@Pc(23) int local23 = arg1 + this.anInt302;
		this.anInterface17_1.method6963(Static347.aClass71_8);
		this.aClass45_Sub2_1.method5015();
		this.aClass45_Sub2_1.method4926(this.anInterface17_1);
		this.aClass45_Sub2_1.method5019(arg4);
		this.aClass45_Sub2_1.method4939(arg2);
		this.aClass45_Sub2_1.method4953(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4900(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4912(arg3);
		local8.method184((float) this.anInt295, (float) this.anInt289, 0.0F);
		local8.U(local18, local23, 0);
		local13.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4992();
		this.aClass45_Sub2_1.method4902();
		this.aClass45_Sub2_1.method4950();
		this.aClass45_Sub2_1.method4953(1, Static160.aClass108_2);
		this.aClass45_Sub2_1.method4900(1, Static160.aClass108_2);
	}

	@OriginalMember(owner = "client!ai", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class11_Sub1 local8 = this.aClass45_Sub2_1.method4960();
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_1.method5007();
		this.anInterface17_1.method6963(this.aBoolean33 || this.aBoolean34 ? Static347.aClass71_8 : Static567.aClass71_11);
		this.aClass45_Sub2_1.method5015();
		this.aClass45_Sub2_1.method4926(this.anInterface17_1);
		this.aClass45_Sub2_1.method5019(arg6);
		this.aClass45_Sub2_1.method4939(arg4);
		this.aClass45_Sub2_1.method4953(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4900(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4912(arg5);
		local13.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
		if (this.aBoolean32) {
			arg2 = this.anInt295 * arg2 / this.A();
			arg3 = arg3 * this.anInt289 / this.ca();
			arg1 += this.anInt302 * arg3 / this.anInt289;
			arg0 += this.anInt287 * arg2 / this.anInt295;
		}
		local8.method184((float) arg2, (float) arg3, 0.0F);
		local8.U(arg0, arg1, 0);
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4992();
		this.aClass45_Sub2_1.method4902();
		this.aClass45_Sub2_1.method4950();
		this.aClass45_Sub2_1.method4953(1, Static160.aClass108_2);
		this.aClass45_Sub2_1.method4900(1, Static160.aClass108_2);
	}

	@OriginalMember(owner = "client!ai", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class11_Sub1 local8 = this.aClass45_Sub2_1.method4960();
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_1.method5007();
		this.anInterface17_1.method6963(this.aBoolean33 || this.aBoolean34 ? Static347.aClass71_8 : Static567.aClass71_11);
		this.aClass45_Sub2_1.method5015();
		this.aClass45_Sub2_1.method4926(this.anInterface17_1);
		this.aClass45_Sub2_1.method5019(arg8);
		this.aClass45_Sub2_1.method4939(arg6);
		this.aClass45_Sub2_1.method4953(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4900(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4912(arg7);
		if (this.aBoolean32) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(100) float local100 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt302 * local100;
			@Pc(119) float local119 = local107 * (float) this.anInt302;
			@Pc(125) float local125 = local88 * (float) this.anInt287;
			@Pc(131) float local131 = (float) this.anInt287 * local94;
			@Pc(138) float local138 = -local88 * (float) this.anInt305;
			@Pc(145) float local145 = -local94 * (float) this.anInt305;
			@Pc(152) float local152 = (float) this.anInt286 * -local100;
			arg3 = local119 + local145 + arg3;
			arg1 = local131 + arg1 + local119;
			arg4 = local152 + local125 + arg4;
			@Pc(177) float local177 = (float) this.anInt286 * -local107;
			arg2 = local113 + arg2 + local138;
			arg0 = arg0 + local125 + local113;
			arg5 = local177 + local131 + arg5;
		}
		local8.method176(0.0F, arg4 - arg0, arg3 - arg1, 0.0F, 0.0F, arg2 - arg0, 0.0F, arg5 - arg1, 1.0F);
		local8.method171(arg0, 0.0F, arg1);
		local13.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
		this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_1.method4992();
		this.aClass45_Sub2_1.method4902();
		this.aClass45_Sub2_1.method4950();
		this.aClass45_Sub2_1.method4953(1, Static160.aClass108_2);
		this.aClass45_Sub2_1.method4900(1, Static160.aClass108_2);
	}

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt286 = arg3;
		this.anInt287 = arg0;
		this.anInt302 = arg1;
		this.anInt305 = arg2;
		this.aBoolean32 = this.anInt287 != 0 || this.anInt302 != 0 || this.anInt305 != 0 || this.anInt286 != 0;
	}

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt289;
	}

	@OriginalMember(owner = "client!ai", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ai", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class11_Sub1 local10 = this.aClass45_Sub2_1.method4960();
		@Pc(15) Class11_Sub1 local15 = this.aClass45_Sub2_1.method5007();
		this.anInterface17_1.method6963(Static347.aClass71_8);
		this.aClass45_Sub2_1.method5015();
		this.aClass45_Sub2_1.method4926(this.anInterface17_1);
		this.aClass45_Sub2_1.method5019(arg6);
		this.aClass45_Sub2_1.method4939(arg4);
		this.aClass45_Sub2_1.method4953(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4900(1, Static62.aClass108_1);
		this.aClass45_Sub2_1.method4912(arg5);
		@Pc(70) boolean local70 = this.aBoolean31 && this.anInt302 == 0 && this.anInt286 == 0;
		@Pc(86) boolean local86 = this.aBoolean30 && this.anInt287 == 0 && this.anInt305 == 0;
		if (local70 & local86) {
			local15.method184(this.anInterface17_1.method6970((float) arg2), this.anInterface17_1.method6972((float) arg3), 1.0F);
			local10.method184((float) arg2, (float) arg3, 0.0F);
			local10.U(arg0, arg1, 0);
			this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
			this.aClass45_Sub2_1.method4992();
			this.aClass45_Sub2_1.method4902();
		} else {
			@Pc(98) int local98;
			@Pc(101) int local101;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(179) int local179;
			if (local86) {
				local98 = arg3 + arg1;
				local101 = this.ca();
				local15.method184(this.anInterface17_1.method6970((float) arg2), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
				this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
				local128 = arg1 + this.anInt302;
				local133 = local128 + this.anInt289;
				while (local98 >= local133) {
					local10.method184((float) arg2, (float) this.anInt289, 0.0F);
					local10.U(arg0, local128, 0);
					this.aClass45_Sub2_1.method4992();
					this.aClass45_Sub2_1.method4902();
					local133 += local101;
					local128 += local101;
				}
				if (local128 < local98) {
					local179 = local98 - local128;
					local15.method184(this.anInterface17_1.method6970((float) arg2), this.anInterface17_1.method6972((float) local179), 1.0F);
					this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
					local10.method184((float) arg2, (float) local179, 0.0F);
					local10.U(arg0, local128, 0);
					this.aClass45_Sub2_1.method4992();
					this.aClass45_Sub2_1.method4902();
				}
			} else if (local70) {
				local98 = arg0 + arg2;
				local101 = this.A();
				local15.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) arg3), 1.0F);
				this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
				local128 = this.anInt287 + arg0;
				local133 = this.anInt295 + local128;
				while (local98 >= local133) {
					local10.method184((float) this.anInt295, (float) arg3, 0.0F);
					local10.U(local128, arg1, 0);
					this.aClass45_Sub2_1.method4992();
					local128 += local101;
					local133 += local101;
					this.aClass45_Sub2_1.method4902();
				}
				if (local98 > local128) {
					local179 = local98 - local128;
					local15.method184(this.anInterface17_1.method6970((float) local179), this.anInterface17_1.method6972((float) arg3), 1.0F);
					this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
					local10.method184((float) local179, (float) arg3, 0.0F);
					local10.U(local128, arg1, 0);
					this.aClass45_Sub2_1.method4992();
					this.aClass45_Sub2_1.method4902();
				}
			} else {
				local98 = arg3 + arg1;
				local101 = arg2 + arg0;
				local128 = this.A();
				local133 = this.ca();
				local179 = arg1 + this.anInt302;
				@Pc(247) int local247 = local179 + this.anInt289;
				@Pc(277) int local277;
				@Pc(282) int local282;
				@Pc(330) int local330;
				while (local247 <= local98) {
					local15.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
					this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
					local277 = arg0 + this.anInt287;
					local282 = this.anInt295 + local277;
					while (local282 <= local101) {
						local10.method184((float) this.anInt295, (float) this.anInt289, 0.0F);
						local10.U(local277, local179, 0);
						this.aClass45_Sub2_1.method4992();
						local277 += local128;
						local282 += local128;
						this.aClass45_Sub2_1.method4902();
					}
					if (local277 < local101) {
						local330 = local101 - local277;
						local15.method184(this.anInterface17_1.method6970((float) local330), this.anInterface17_1.method6972((float) this.anInt289), 1.0F);
						this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
						local10.method184((float) local330, (float) this.anInt289, 0.0F);
						local10.U(local277, local179, 0);
						this.aClass45_Sub2_1.method4992();
						this.aClass45_Sub2_1.method4902();
					}
					local247 += local133;
					local179 += local133;
				}
				if (local179 < local98) {
					local277 = local98 - local179;
					local15.method184(this.anInterface17_1.method6970((float) this.anInt295), this.anInterface17_1.method6972((float) local277), 1.0F);
					this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
					local282 = arg0 + this.anInt287;
					local330 = this.anInt295 + local282;
					while (local101 >= local330) {
						local10.method184((float) this.anInt295, (float) local277, 0.0F);
						local10.U(local282, local179, 0);
						this.aClass45_Sub2_1.method4992();
						local330 += local128;
						local282 += local128;
						this.aClass45_Sub2_1.method4902();
					}
					if (local282 < local101) {
						@Pc(480) int local480 = local101 - local282;
						local15.method184(this.anInterface17_1.method6970((float) local480), this.anInterface17_1.method6972((float) local277), 1.0F);
						this.aClass45_Sub2_1.method4932(Static3.aClass222_12);
						local10.method184((float) local480, (float) local277, 0.0F);
						local10.U(local282, local179, 0);
						this.aClass45_Sub2_1.method4992();
						this.aClass45_Sub2_1.method4902();
					}
				}
			}
		}
		this.aClass45_Sub2_1.method4950();
		this.aClass45_Sub2_1.method4953(1, Static160.aClass108_2);
		this.aClass45_Sub2_1.method4900(1, Static160.aClass108_2);
	}

	@OriginalMember(owner = "client!ai", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass45_Sub2_1.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method239(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}
}
