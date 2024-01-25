import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	private int anInt4790 = 0;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	private int anInt4796 = 0;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	private int anInt4787 = 0;

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
	private int anInt4806 = 0;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	private final int anInt4797;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
	private final int anInt4804;

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_10;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!w;")
	private final Interface27 anInterface27_2;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Z")
	private final boolean aBoolean402;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "Z")
	private final boolean aBoolean403;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!gd;IIZ)V")
	public Class50_Sub3(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt4797 = arg1;
		this.anInt4804 = arg2;
		this.aClass65_Sub2_10 = arg0;
		this.anInterface27_2 = arg0.method4348(arg1, Static120.aClass89_7, arg2, arg3 ? Static435.aClass339_15 : Static626.aClass339_16);
		this.anInterface27_2.method5618(true, true);
		this.aBoolean402 = arg1 != this.anInterface27_2.method5619();
		this.aBoolean406 = arg2 != this.anInterface27_2.method5625();
		this.aBoolean403 = !this.aBoolean402 && this.anInterface27_2.method5624();
		this.aBoolean405 = !this.aBoolean406 && this.anInterface27_2.method5624();
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!gd;II[III)V")
	public Class50_Sub3(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub2_10 = arg0;
		this.anInt4797 = arg1;
		this.anInt4804 = arg2;
		this.anInterface27_2 = arg0.method4464(false, arg4, arg1, arg3, arg2, arg5);
		this.anInterface27_2.method5618(true, true);
		this.aBoolean402 = this.anInterface27_2.method5619() != arg1;
		this.aBoolean406 = arg2 != this.anInterface27_2.method5625();
		this.aBoolean403 = !this.aBoolean402 && this.anInterface27_2.method5624();
		this.aBoolean405 = !this.aBoolean406 && this.anInterface27_2.method5624();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
	@Override
	public int method5992() {
		return this.anInt4804;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII[III)V")
	private void method4057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface27_2.method5620(arg4, arg0, arg3, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5997(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class254_Sub2 local8 = this.aClass65_Sub2_10.method4471();
		@Pc(13) Class254_Sub2 local13 = this.aClass65_Sub2_10.method4439();
		this.anInterface27_2.method7704(this.aBoolean402 || this.aBoolean406 ? Static393.aClass294_6 : Static516.aClass294_10);
		this.aClass65_Sub2_10.method4413();
		this.aClass65_Sub2_10.method4426(this.anInterface27_2);
		this.aClass65_Sub2_10.method4419(1);
		this.aClass65_Sub2_10.method4405(arg6);
		this.aClass65_Sub2_10.method4400(Static413.aClass64_3, 1);
		this.aClass65_Sub2_10.method4369(1, Static413.aClass64_3);
		this.aClass65_Sub2_10.method4455(arg7);
		if (this.aBoolean404) {
			@Pc(77) float local77 = (float) this.method6003();
			@Pc(81) float local81 = (float) this.method6010();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(102) float local102 = (arg4 - arg0) / local81;
			@Pc(109) float local109 = (arg5 - arg1) / local81;
			@Pc(115) float local115 = (float) this.anInt4787 * local102;
			@Pc(121) float local121 = local109 * (float) this.anInt4787;
			@Pc(127) float local127 = (float) this.anInt4796 * local88;
			@Pc(133) float local133 = local95 * (float) this.anInt4796;
			@Pc(140) float local140 = -local88 * (float) this.anInt4790;
			@Pc(147) float local147 = -local95 * (float) this.anInt4790;
			@Pc(154) float local154 = (float) this.anInt4806 * -local102;
			arg3 = local121 + arg3 + local147;
			arg4 = arg4 + local127 + local154;
			arg2 = local115 + local140 + arg2;
			arg1 = local121 + local133 + arg1;
			arg0 = local127 + arg0 + local115;
			@Pc(191) float local191 = -local109 * (float) this.anInt4806;
			arg5 = arg5 + local133 + local191;
		}
		local8.method6236(arg4 - arg0, -arg1 + arg5, arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F);
		local8.method6243(0.0F, arg0, arg1);
		local13.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4434();
		this.aClass65_Sub2_10.method4394();
		this.aClass65_Sub2_10.method4423();
		this.aClass65_Sub2_10.method4400(Static169.aClass64_1, 1);
		this.aClass65_Sub2_10.method4369(1, Static169.aClass64_1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([I)V")
	@Override
	public void method5999(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt4806;
		arg0[2] = this.anInt4790;
		arg0[1] = this.anInt4787;
		arg0[0] = this.anInt4796;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class254_Sub2 local8 = this.aClass65_Sub2_10.method4471();
		@Pc(13) Class254_Sub2 local13 = this.aClass65_Sub2_10.method4439();
		@Pc(18) int local18 = arg1 + this.anInt4787;
		@Pc(23) int local23 = arg0 + this.anInt4796;
		this.anInterface27_2.method7704(Static393.aClass294_6);
		this.aClass65_Sub2_10.method4413();
		this.aClass65_Sub2_10.method4426(this.anInterface27_2);
		this.aClass65_Sub2_10.method4419(arg4);
		this.aClass65_Sub2_10.method4405(arg2);
		this.aClass65_Sub2_10.method4400(Static413.aClass64_3, 1);
		this.aClass65_Sub2_10.method4369(1, Static413.aClass64_3);
		this.aClass65_Sub2_10.method4455(arg3);
		local8.method6237((float) this.anInt4804, 0.0F, (float) this.anInt4797);
		local8.method7358(local23, local18, 0);
		local13.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4434();
		this.aClass65_Sub2_10.method4394();
		this.aClass65_Sub2_10.method4423();
		this.aClass65_Sub2_10.method4400(Static169.aClass64_1, 1);
		this.aClass65_Sub2_10.method4369(1, Static169.aClass64_1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6001(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class254_Sub2 local8 = this.aClass65_Sub2_10.method4471();
		@Pc(13) Class254_Sub2 local13 = this.aClass65_Sub2_10.method4439();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface27 local19 = local16.anInterface27_3;
		this.anInterface27_2.method7704(this.aBoolean402 || this.aBoolean406 ? Static393.aClass294_6 : Static516.aClass294_10);
		this.aClass65_Sub2_10.method4413();
		this.aClass65_Sub2_10.method4426(this.anInterface27_2);
		this.aClass65_Sub2_10.method4419(1);
		this.aClass65_Sub2_10.method4405(1);
		if (this.aBoolean404) {
			@Pc(98) float local98 = (float) this.anInt4797 / (float) this.method6003();
			@Pc(106) float local106 = (float) this.anInt4804 / (float) this.method6010();
			local8.method6236((arg4 - arg0) * local106, (arg5 - arg1) * local106, local98 * (arg3 - arg1), 0.0F, (arg2 - arg0) * local98, 0.0F, 0.0F, 0.0F, 1.0F);
			local8.method6243(0.0F, (arg0 + (float) this.anInt4796) * local98, local106 * (arg1 + (float) this.anInt4787));
		} else {
			local8.method6236(arg4 - arg0, arg5 - arg1, arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F);
			local8.method6243(0.0F, arg0, arg1);
		}
		local13.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4358(1);
		this.aClass65_Sub2_10.method4426(local19);
		this.aClass65_Sub2_10.method4432(Static138.aClass178_2, Static606.aClass178_4);
		this.aClass65_Sub2_10.method4400(Static169.aClass64_1, 0);
		@Pc(204) Class254_Sub2 local204 = this.aClass65_Sub2_10.method4439();
		local204.method7356(local8);
		local204.method7358(-arg7, -arg8, 0);
		local204.method6240(local19.method5622(1.0F), 1.0F, local19.method5617(1.0F));
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4434();
		this.aClass65_Sub2_10.method4394();
		this.aClass65_Sub2_10.method4423();
		this.aClass65_Sub2_10.method4400(Static536.aClass64_4, 0);
		this.aClass65_Sub2_10.method4432(Static606.aClass178_4, Static606.aClass178_4);
		this.aClass65_Sub2_10.method4426((Interface25) null);
		this.aClass65_Sub2_10.method4358(0);
		this.aClass65_Sub2_10.method4423();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class254_Sub2 local8 = this.aClass65_Sub2_10.method4471();
		@Pc(13) Class254_Sub2 local13 = this.aClass65_Sub2_10.method4439();
		this.anInterface27_2.method7704(this.aBoolean402 || this.aBoolean406 ? Static393.aClass294_6 : Static516.aClass294_10);
		this.aClass65_Sub2_10.method4413();
		this.aClass65_Sub2_10.method4426(this.anInterface27_2);
		this.aClass65_Sub2_10.method4419(arg6);
		this.aClass65_Sub2_10.method4405(arg4);
		this.aClass65_Sub2_10.method4400(Static413.aClass64_3, 1);
		this.aClass65_Sub2_10.method4369(1, Static413.aClass64_3);
		this.aClass65_Sub2_10.method4455(arg5);
		local13.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
		if (this.aBoolean404) {
			arg2 = this.anInt4797 * arg2 / this.method6003();
			arg3 = this.anInt4804 * arg3 / this.method6010();
			arg1 += arg3 * this.anInt4787 / this.anInt4804;
			arg0 += arg2 * this.anInt4796 / this.anInt4797;
		}
		local8.method6237((float) arg3, 0.0F, (float) arg2);
		local8.method7358(arg0, arg1, 0);
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4434();
		this.aClass65_Sub2_10.method4394();
		this.aClass65_Sub2_10.method4423();
		this.aClass65_Sub2_10.method4400(Static169.aClass64_1, 1);
		this.aClass65_Sub2_10.method4369(1, Static169.aClass64_1);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()I")
	@Override
	public int method6002() {
		return this.anInt4797;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg1 + this.anInt4787;
		@Pc(16) int local16 = arg0 + this.anInt4796;
		@Pc(19) Interface27 local19 = local6.anInterface27_3;
		this.anInterface27_2.method7704(Static393.aClass294_6);
		this.aClass65_Sub2_10.method4413();
		this.aClass65_Sub2_10.method4426(this.anInterface27_2);
		this.aClass65_Sub2_10.method4419(1);
		this.aClass65_Sub2_10.method4405(1);
		@Pc(49) Class254_Sub2 local49 = this.aClass65_Sub2_10.method4471();
		local49.method6237((float) this.anInt4804, 0.0F, (float) this.anInt4797);
		local49.method7358(local16, local11, 0);
		this.aClass65_Sub2_10.method4434();
		@Pc(73) Class254_Sub2 local73 = this.aClass65_Sub2_10.method4439();
		local73.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4358(1);
		this.aClass65_Sub2_10.method4426(local19);
		this.aClass65_Sub2_10.method4432(Static138.aClass178_2, Static606.aClass178_4);
		this.aClass65_Sub2_10.method4400(Static169.aClass64_1, 0);
		@Pc(123) Class254_Sub2 local123 = this.aClass65_Sub2_10.method4439();
		local123.method6237(local19.method5617((float) this.anInt4804), 1.0F, local19.method5622((float) this.anInt4797));
		local123.method6243(0.0F, local19.method5622((float) (local16 - arg3)), local19.method5617((float) (local11 - arg4)));
		this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_10.method4394();
		this.aClass65_Sub2_10.method4423();
		this.aClass65_Sub2_10.method4400(Static536.aClass64_4, 0);
		this.aClass65_Sub2_10.method4432(Static606.aClass178_4, Static606.aClass178_4);
		this.aClass65_Sub2_10.method4426((Interface25) null);
		this.aClass65_Sub2_10.method4358(0);
		this.aClass65_Sub2_10.method4423();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass65_Sub2_10.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4057(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
	@Override
	public int method6003() {
		return this.anInt4790 + this.anInt4797 + this.anInt4796;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method6005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class254_Sub2 local10 = this.aClass65_Sub2_10.method4471();
		@Pc(15) Class254_Sub2 local15 = this.aClass65_Sub2_10.method4439();
		this.anInterface27_2.method7704(Static393.aClass294_6);
		this.aClass65_Sub2_10.method4413();
		this.aClass65_Sub2_10.method4426(this.anInterface27_2);
		this.aClass65_Sub2_10.method4419(arg6);
		this.aClass65_Sub2_10.method4405(arg4);
		this.aClass65_Sub2_10.method4400(Static413.aClass64_3, 1);
		this.aClass65_Sub2_10.method4369(1, Static413.aClass64_3);
		this.aClass65_Sub2_10.method4455(arg5);
		@Pc(73) boolean local73 = this.aBoolean405 && this.anInt4787 == 0 && this.anInt4806 == 0;
		@Pc(89) boolean local89 = this.aBoolean403 && this.anInt4796 == 0 && this.anInt4790 == 0;
		if (local89 & local73) {
			local15.method6237(this.anInterface27_2.method5617((float) arg3), 1.0F, this.anInterface27_2.method5622((float) arg2));
			local10.method6237((float) arg3, 0.0F, (float) arg2);
			local10.method7358(arg0, arg1, 0);
			this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
			this.aClass65_Sub2_10.method4434();
			this.aClass65_Sub2_10.method4394();
		} else {
			@Pc(99) int local99;
			@Pc(102) int local102;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(182) int local182;
			if (local89) {
				local99 = arg3 + arg1;
				local102 = this.method6010();
				local15.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) arg2));
				this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
				local130 = arg1 + this.anInt4787;
				local135 = this.anInt4804 + local130;
				while (local99 >= local135) {
					local10.method6237((float) this.anInt4804, 0.0F, (float) arg2);
					local10.method7358(arg0, local130, 0);
					this.aClass65_Sub2_10.method4434();
					local135 += local102;
					this.aClass65_Sub2_10.method4394();
					local130 += local102;
				}
				if (local99 > local130) {
					local182 = local99 - local130;
					local15.method6237(this.anInterface27_2.method5617((float) local182), 1.0F, this.anInterface27_2.method5622((float) arg2));
					this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
					local10.method6237((float) local182, 0.0F, (float) arg2);
					local10.method7358(arg0, local130, 0);
					this.aClass65_Sub2_10.method4434();
					this.aClass65_Sub2_10.method4394();
				}
			} else if (local73) {
				local99 = arg2 + arg0;
				local102 = this.method6003();
				local15.method6237(this.anInterface27_2.method5617((float) arg3), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
				this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
				local130 = this.anInt4796 + arg0;
				local135 = this.anInt4797 + local130;
				while (local99 >= local135) {
					local10.method6237((float) arg3, 0.0F, (float) this.anInt4797);
					local10.method7358(local130, arg1, 0);
					this.aClass65_Sub2_10.method4434();
					local135 += local102;
					local130 += local102;
					this.aClass65_Sub2_10.method4394();
				}
				if (local99 > local130) {
					local182 = local99 - local130;
					local15.method6237(this.anInterface27_2.method5617((float) arg3), 1.0F, this.anInterface27_2.method5622((float) local182));
					this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
					local10.method6237((float) arg3, 0.0F, (float) local182);
					local10.method7358(local130, arg1, 0);
					this.aClass65_Sub2_10.method4434();
					this.aClass65_Sub2_10.method4394();
				}
			} else {
				local99 = arg1 + arg3;
				local102 = arg2 + arg0;
				local130 = this.method6003();
				local135 = this.method6010();
				local182 = this.anInt4787 + arg1;
				@Pc(415) int local415;
				@Pc(420) int local420;
				@Pc(464) int local464;
				for (@Pc(385) int local385 = this.anInt4804 + local182; local385 <= local99; local385 += local135) {
					local15.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
					this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
					local415 = this.anInt4796 + arg0;
					local420 = this.anInt4797 + local415;
					while (local420 <= local102) {
						local10.method6237((float) this.anInt4804, 0.0F, (float) this.anInt4797);
						local10.method7358(local415, local182, 0);
						this.aClass65_Sub2_10.method4434();
						this.aClass65_Sub2_10.method4394();
						local420 += local130;
						local415 += local130;
					}
					if (local102 > local415) {
						local464 = local102 - local415;
						local15.method6237(this.anInterface27_2.method5617((float) this.anInt4804), 1.0F, this.anInterface27_2.method5622((float) local464));
						this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
						local10.method6237((float) this.anInt4804, 0.0F, (float) local464);
						local10.method7358(local415, local182, 0);
						this.aClass65_Sub2_10.method4434();
						this.aClass65_Sub2_10.method4394();
					}
					local182 += local135;
				}
				if (local182 < local99) {
					local415 = local99 - local182;
					local15.method6237(this.anInterface27_2.method5617((float) local415), 1.0F, this.anInterface27_2.method5622((float) this.anInt4797));
					this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
					local420 = this.anInt4796 + arg0;
					local464 = this.anInt4797 + local420;
					while (local464 <= local102) {
						local10.method6237((float) local415, 0.0F, (float) this.anInt4797);
						local10.method7358(local420, local182, 0);
						this.aClass65_Sub2_10.method4434();
						this.aClass65_Sub2_10.method4394();
						local464 += local130;
						local420 += local130;
					}
					if (local102 > local420) {
						@Pc(606) int local606 = local102 - local420;
						local15.method6237(this.anInterface27_2.method5617((float) local415), 1.0F, this.anInterface27_2.method5622((float) local606));
						this.aClass65_Sub2_10.method4411(Static102.aClass198_1);
						local10.method6237((float) local415, 0.0F, (float) local606);
						local10.method7358(local420, local182, 0);
						this.aClass65_Sub2_10.method4434();
						this.aClass65_Sub2_10.method4394();
					}
				}
			}
		}
		this.aClass65_Sub2_10.method4423();
		this.aClass65_Sub2_10.method4400(Static169.aClass64_1, 1);
		this.aClass65_Sub2_10.method4369(1, Static169.aClass64_1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4796 = arg0;
		this.anInt4787 = arg1;
		this.anInt4790 = arg2;
		this.anInt4806 = arg3;
		this.aBoolean404 = this.anInt4796 != 0 || this.anInt4787 != 0 || this.anInt4790 != 0 || this.anInt4806 != 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	@Override
	public void method6000(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass65_Sub2_10.na(0, 0, this.anInt4797, this.anInt4804);
		@Pc(22) int[] local22 = new int[this.anInt4797 * this.anInt4804];
		this.anInterface27_2.method5623(local22, this.anInt4804, this.anInt4797);
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			for (local41 = 0; local41 < this.anInt4804; local41++) {
				local48 = local41 * this.anInt4797;
				for (local50 = 0; local50 < this.anInt4797; local50++) {
					local22[local48 + local50] = (local15[local48 + local50] & 0x55FF0000) << 8 | local22[local48 + local50] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local41 = 0; local41 < this.anInt4804; local41++) {
				local48 = local41 * this.anInt4797;
				for (local50 = 0; local50 < this.anInt4797; local50++) {
					local22[local48 + local50] = local22[local48 + local50] & 0xFFFFFF | (local15[local50 + local48] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method4057(0, 0, this.anInt4797, this.anInt4804, local22, this.anInt4797);
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
	@Override
	public int method6010() {
		return this.anInt4787 + this.anInt4804 + this.anInt4806;
	}
}
