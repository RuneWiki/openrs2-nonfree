import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	private int anInt7030 = 0;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	private int anInt7035 = 0;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	private int anInt7039 = 0;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	private int anInt7033 = 0;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_20;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	private final int anInt7029;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	private final int anInt7036;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "Lclient!ug;")
	private final Interface24 anInterface24_5;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
	private final boolean aBoolean504;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Z")
	private final boolean aBoolean509;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Z")
	private final boolean aBoolean505;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Z")
	private final boolean aBoolean506;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ch;IIZ)V")
	public Class24_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass5_Sub1_20 = arg0;
		this.anInt7029 = arg1;
		this.anInt7036 = arg2;
		this.anInterface24_5 = arg0.method5650(arg1, arg2, Static637.aClass376_16, arg3 ? Static502.aClass182_14 : Static160.aClass182_5);
		this.anInterface24_5.method7475(true, true);
		this.aBoolean504 = this.anInterface24_5.method7483() != arg1;
		this.aBoolean509 = this.anInterface24_5.method7478() != arg2;
		this.aBoolean505 = !this.aBoolean504 && this.anInterface24_5.method7481();
		this.aBoolean506 = !this.aBoolean509 && this.anInterface24_5.method7481();
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ch;II[III)V")
	public Class24_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7036 = arg2;
		this.anInt7029 = arg1;
		this.aClass5_Sub1_20 = arg0;
		this.anInterface24_5 = arg0.method5626(arg4, arg5, false, arg1, arg3, arg2);
		this.anInterface24_5.method7475(true, true);
		this.aBoolean504 = this.anInterface24_5.method7483() != arg1;
		this.aBoolean509 = this.anInterface24_5.method7478() != arg2;
		this.aBoolean505 = !this.aBoolean504 && this.anInterface24_5.method7481();
		this.aBoolean506 = !this.aBoolean509 && this.anInterface24_5.method7481();
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "()I")
	@Override
	public int method8573() {
		return this.anInt7030 + this.anInt7036 + this.anInt7033;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class39_Sub1 local8 = this.aClass5_Sub1_20.method5658();
		@Pc(13) Class39_Sub1 local13 = this.aClass5_Sub1_20.method5678();
		@Pc(18) int local18 = arg1 + this.anInt7030;
		@Pc(23) int local23 = arg0 + this.anInt7035;
		this.anInterface24_5.method7472(Static313.aClass339_9);
		this.aClass5_Sub1_20.method5605();
		this.aClass5_Sub1_20.method5609(this.anInterface24_5);
		this.aClass5_Sub1_20.method5666(arg4);
		this.aClass5_Sub1_20.method5697(arg2);
		this.aClass5_Sub1_20.method5583(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5592(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5574(arg3);
		local8.method1551((float) this.anInt7036, 0.0F, (float) this.anInt7029);
		local8.method7244(local23, local18, 0);
		local13.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5680();
		this.aClass5_Sub1_20.method5654();
		this.aClass5_Sub1_20.method5683();
		this.aClass5_Sub1_20.method5583(Static482.aClass9_4, 1);
		this.aClass5_Sub1_20.method5592(Static482.aClass9_4, 1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	@Override
	public void method8561(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass5_Sub1_20.na(0, 0, this.anInt7029, this.anInt7036);
		@Pc(22) int[] local22 = new int[this.anInt7036 * this.anInt7029];
		this.anInterface24_5.method7479(local22, this.anInt7029, this.anInt7036);
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg0 == 0) {
			for (local56 = 0; local56 < this.anInt7036; local56++) {
				local63 = this.anInt7029 * local56;
				for (local65 = 0; local65 < this.anInt7029; local65++) {
					local22[local65 + local63] = local15[local65 + local63] << 8 & 0xFF000036 | local22[local63 + local65] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local56 = 0; local56 < this.anInt7036; local56++) {
				local63 = local56 * this.anInt7029;
				for (local65 = 0; local65 < this.anInt7029; local65++) {
					local22[local63 + local65] = (local15[local65 + local63] == 0 ? 0 : -16777216) | local22[local65 + local63] & 0xFFFFFF;
				}
			}
		}
		this.method6066(0, 0, this.anInt7029, this.anInt7036, local22, this.anInt7029);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8557(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class39_Sub1 local8 = this.aClass5_Sub1_20.method5658();
		@Pc(13) Class39_Sub1 local13 = this.aClass5_Sub1_20.method5678();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface24 local19 = local16.anInterface24_6;
		this.anInterface24_5.method7472(this.aBoolean504 || this.aBoolean509 ? Static313.aClass339_9 : Static108.aClass339_3);
		this.aClass5_Sub1_20.method5605();
		this.aClass5_Sub1_20.method5609(this.anInterface24_5);
		this.aClass5_Sub1_20.method5666(1);
		this.aClass5_Sub1_20.method5697(1);
		if (this.aBoolean507) {
			@Pc(67) float local67 = (float) this.anInt7029 / (float) this.method8576();
			@Pc(75) float local75 = (float) this.anInt7036 / (float) this.method8573();
			local8.method1547(1.0F, (arg4 - arg0) * local75, (arg5 - arg1) * local75, local67 * (arg3 - arg1), 0.0F, 0.0F, 0.0F, local67 * (arg2 - arg0), 0.0F);
			local8.method1567(((float) this.anInt7035 + arg0) * local67, local75 * (arg1 + (float) this.anInt7030), 0.0F);
		} else {
			local8.method1547(1.0F, arg4 - arg0, -arg1 + arg5, arg3 - arg1, 0.0F, 0.0F, 0.0F, arg2 - arg0, 0.0F);
			local8.method1567(arg0, arg1, 0.0F);
		}
		local13.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5571(1);
		this.aClass5_Sub1_20.method5609(local19);
		this.aClass5_Sub1_20.method5682(Static514.aClass374_5, Static314.aClass374_2);
		this.aClass5_Sub1_20.method5583(Static482.aClass9_4, 0);
		@Pc(203) Class39_Sub1 local203 = this.aClass5_Sub1_20.method5678();
		local203.method7236(local8);
		local203.method7244(-arg7, -arg8, 0);
		local203.method1566(local19.method7476(1.0F), 1.0F, local19.method7482(1.0F));
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5680();
		this.aClass5_Sub1_20.method5654();
		this.aClass5_Sub1_20.method5683();
		this.aClass5_Sub1_20.method5583(Static333.aClass9_2, 0);
		this.aClass5_Sub1_20.method5682(Static514.aClass374_5, Static514.aClass374_5);
		this.aClass5_Sub1_20.method5609(null);
		this.aClass5_Sub1_20.method5571(0);
		this.aClass5_Sub1_20.method5683();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()I")
	@Override
	public int method8558() {
		return this.anInt7029;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII[III)V")
	private void method6066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface24_5.method7477(arg4, arg2, arg5, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "()I")
	@Override
	public int method8578() {
		return this.anInt7036;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "()I")
	@Override
	public int method8576() {
		return this.anInt7035 + this.anInt7029 + this.anInt7039;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass5_Sub1_20.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6066(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8567(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class39_Sub1 local8 = this.aClass5_Sub1_20.method5658();
		@Pc(13) Class39_Sub1 local13 = this.aClass5_Sub1_20.method5678();
		this.anInterface24_5.method7472(this.aBoolean504 || this.aBoolean509 ? Static313.aClass339_9 : Static108.aClass339_3);
		this.aClass5_Sub1_20.method5605();
		this.aClass5_Sub1_20.method5609(this.anInterface24_5);
		this.aClass5_Sub1_20.method5666(1);
		this.aClass5_Sub1_20.method5697(arg6);
		this.aClass5_Sub1_20.method5583(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5592(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5574(arg7);
		if (this.aBoolean507) {
			@Pc(77) float local77 = (float) this.method8576();
			@Pc(81) float local81 = (float) this.method8573();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(100) float local100 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt7030 * local100;
			@Pc(119) float local119 = local107 * (float) this.anInt7030;
			@Pc(125) float local125 = (float) this.anInt7035 * local88;
			@Pc(131) float local131 = local94 * (float) this.anInt7035;
			@Pc(138) float local138 = (float) this.anInt7039 * -local88;
			@Pc(145) float local145 = (float) this.anInt7039 * -local94;
			@Pc(152) float local152 = -local100 * (float) this.anInt7033;
			arg1 = local131 + arg1 + local119;
			arg3 = local119 + local145 + arg3;
			arg2 = local113 + arg2 + local138;
			@Pc(177) float local177 = (float) this.anInt7033 * -local107;
			arg0 = local113 + arg0 + local125;
			arg4 = local125 + arg4 + local152;
			arg5 = local131 + arg5 + local177;
		}
		local8.method1547(1.0F, arg4 - arg0, arg5 - arg1, arg3 - arg1, 0.0F, 0.0F, 0.0F, arg2 - arg0, 0.0F);
		local8.method1567(arg0, arg1, 0.0F);
		local13.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5680();
		this.aClass5_Sub1_20.method5654();
		this.aClass5_Sub1_20.method5683();
		this.aClass5_Sub1_20.method5583(Static482.aClass9_4, 1);
		this.aClass5_Sub1_20.method5592(Static482.aClass9_4, 1);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class39_Sub1 local10 = this.aClass5_Sub1_20.method5658();
		@Pc(15) Class39_Sub1 local15 = this.aClass5_Sub1_20.method5678();
		this.anInterface24_5.method7472(Static313.aClass339_9);
		this.aClass5_Sub1_20.method5605();
		this.aClass5_Sub1_20.method5609(this.anInterface24_5);
		this.aClass5_Sub1_20.method5666(arg6);
		this.aClass5_Sub1_20.method5697(arg4);
		this.aClass5_Sub1_20.method5583(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5592(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5574(arg5);
		@Pc(70) boolean local70 = this.aBoolean506 && this.anInt7030 == 0 && this.anInt7033 == 0;
		@Pc(83) boolean local83 = this.aBoolean505 && this.anInt7035 == 0 && this.anInt7039 == 0;
		if (local83 & local70) {
			local15.method1551(this.anInterface24_5.method7482((float) arg3), 1.0F, this.anInterface24_5.method7476((float) arg2));
			local10.method1551((float) arg3, 0.0F, (float) arg2);
			local10.method7244(arg0, arg1, 0);
			this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
			this.aClass5_Sub1_20.method5680();
			this.aClass5_Sub1_20.method5654();
		} else {
			@Pc(137) int local137;
			@Pc(140) int local140;
			@Pc(168) int local168;
			@Pc(173) int local173;
			@Pc(224) int local224;
			if (local83) {
				local137 = arg1 + arg3;
				local140 = this.method8573();
				local15.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) arg2));
				this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
				local168 = arg1 + this.anInt7030;
				for (local173 = local168 + this.anInt7036; local173 <= local137; local173 += local140) {
					local10.method1551((float) this.anInt7036, 0.0F, (float) arg2);
					local10.method7244(arg0, local168, 0);
					this.aClass5_Sub1_20.method5680();
					local168 += local140;
					this.aClass5_Sub1_20.method5654();
				}
				if (local168 < local137) {
					local224 = local137 - local168;
					local15.method1551(this.anInterface24_5.method7482((float) local224), 1.0F, this.anInterface24_5.method7476((float) arg2));
					this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
					local10.method1551((float) local224, 0.0F, (float) arg2);
					local10.method7244(arg0, local168, 0);
					this.aClass5_Sub1_20.method5680();
					this.aClass5_Sub1_20.method5654();
				}
			} else if (local70) {
				local137 = arg2 + arg0;
				local140 = this.method8576();
				local15.method1551(this.anInterface24_5.method7482((float) arg3), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
				this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
				local168 = arg0 + this.anInt7035;
				for (local173 = local168 + this.anInt7029; local173 <= local137; local173 += local140) {
					local10.method1551((float) arg3, 0.0F, (float) this.anInt7029);
					local10.method7244(local168, arg1, 0);
					this.aClass5_Sub1_20.method5680();
					this.aClass5_Sub1_20.method5654();
					local168 += local140;
				}
				if (local168 < local137) {
					local224 = local137 - local168;
					local15.method1551(this.anInterface24_5.method7482((float) arg3), 1.0F, this.anInterface24_5.method7476((float) local224));
					this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
					local10.method1551((float) arg3, 0.0F, (float) local224);
					local10.method7244(local168, arg1, 0);
					this.aClass5_Sub1_20.method5680();
					this.aClass5_Sub1_20.method5654();
				}
			} else {
				local137 = arg1 + arg3;
				local140 = arg0 + arg2;
				local168 = this.method8576();
				local173 = this.method8573();
				local224 = this.anInt7030 + arg1;
				@Pc(326) int local326;
				@Pc(332) int local332;
				@Pc(380) int local380;
				for (@Pc(295) int local295 = this.anInt7036 + local224; local295 <= local137; local295 += local173) {
					local15.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
					this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
					local326 = arg0 + this.anInt7035;
					for (local332 = local326 + this.anInt7029; local332 <= local140; local332 += local168) {
						local10.method1551((float) this.anInt7036, 0.0F, (float) this.anInt7029);
						local10.method7244(local326, local224, 0);
						this.aClass5_Sub1_20.method5680();
						local326 += local168;
						this.aClass5_Sub1_20.method5654();
					}
					if (local140 > local326) {
						local380 = local140 - local326;
						local15.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) local380));
						this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
						local10.method1551((float) this.anInt7036, 0.0F, (float) local380);
						local10.method7244(local326, local224, 0);
						this.aClass5_Sub1_20.method5680();
						this.aClass5_Sub1_20.method5654();
					}
					local224 += local173;
				}
				if (local224 < local137) {
					local326 = local137 - local224;
					local15.method1551(this.anInterface24_5.method7482((float) local326), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
					this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
					local332 = arg0 + this.anInt7035;
					for (local380 = this.anInt7029 + local332; local380 <= local140; local380 += local168) {
						local10.method1551((float) local326, 0.0F, (float) this.anInt7029);
						local10.method7244(local332, local224, 0);
						this.aClass5_Sub1_20.method5680();
						this.aClass5_Sub1_20.method5654();
						local332 += local168;
					}
					if (local332 < local140) {
						@Pc(527) int local527 = local140 - local332;
						local15.method1551(this.anInterface24_5.method7482((float) local326), 1.0F, this.anInterface24_5.method7476((float) local527));
						this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
						local10.method1551((float) local326, 0.0F, (float) local527);
						local10.method7244(local332, local224, 0);
						this.aClass5_Sub1_20.method5680();
						this.aClass5_Sub1_20.method5654();
					}
				}
			}
		}
		this.aClass5_Sub1_20.method5683();
		this.aClass5_Sub1_20.method5583(Static482.aClass9_4, 1);
		this.aClass5_Sub1_20.method5592(Static482.aClass9_4, 1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt7035;
		@Pc(16) int local16 = arg1 + this.anInt7030;
		@Pc(19) Interface24 local19 = local6.anInterface24_6;
		this.anInterface24_5.method7472(Static313.aClass339_9);
		this.aClass5_Sub1_20.method5605();
		this.aClass5_Sub1_20.method5609(this.anInterface24_5);
		this.aClass5_Sub1_20.method5666(1);
		this.aClass5_Sub1_20.method5697(1);
		@Pc(49) Class39_Sub1 local49 = this.aClass5_Sub1_20.method5658();
		local49.method1551((float) this.anInt7036, 0.0F, (float) this.anInt7029);
		local49.method7244(local11, local16, 0);
		this.aClass5_Sub1_20.method5680();
		@Pc(73) Class39_Sub1 local73 = this.aClass5_Sub1_20.method5678();
		local73.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5571(1);
		this.aClass5_Sub1_20.method5609(local19);
		this.aClass5_Sub1_20.method5682(Static514.aClass374_5, Static314.aClass374_2);
		this.aClass5_Sub1_20.method5583(Static482.aClass9_4, 0);
		@Pc(123) Class39_Sub1 local123 = this.aClass5_Sub1_20.method5678();
		local123.method1551(local19.method7482((float) this.anInt7036), 1.0F, local19.method7476((float) this.anInt7029));
		local123.method1567(local19.method7476((float) (local11 - arg3)), local19.method7482((float) (local16 - arg4)), 0.0F);
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5654();
		this.aClass5_Sub1_20.method5683();
		this.aClass5_Sub1_20.method5583(Static333.aClass9_2, 0);
		this.aClass5_Sub1_20.method5682(Static514.aClass374_5, Static514.aClass374_5);
		this.aClass5_Sub1_20.method5609(null);
		this.aClass5_Sub1_20.method5571(0);
		this.aClass5_Sub1_20.method5683();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class39_Sub1 local8 = this.aClass5_Sub1_20.method5658();
		@Pc(13) Class39_Sub1 local13 = this.aClass5_Sub1_20.method5678();
		this.anInterface24_5.method7472(this.aBoolean504 || this.aBoolean509 ? Static313.aClass339_9 : Static108.aClass339_3);
		this.aClass5_Sub1_20.method5605();
		this.aClass5_Sub1_20.method5609(this.anInterface24_5);
		this.aClass5_Sub1_20.method5666(arg6);
		this.aClass5_Sub1_20.method5697(arg4);
		this.aClass5_Sub1_20.method5583(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5592(Static161.aClass9_3, 1);
		this.aClass5_Sub1_20.method5574(arg5);
		local13.method1551(this.anInterface24_5.method7482((float) this.anInt7036), 1.0F, this.anInterface24_5.method7476((float) this.anInt7029));
		if (this.aBoolean507) {
			arg2 = this.anInt7029 * arg2 / this.method8576();
			arg3 = arg3 * this.anInt7036 / this.method8573();
			arg1 += arg3 * this.anInt7030 / this.anInt7036;
			arg0 += this.anInt7035 * arg2 / this.anInt7029;
		}
		local8.method1551((float) arg3, 0.0F, (float) arg2);
		local8.method7244(arg0, arg1, 0);
		this.aClass5_Sub1_20.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_20.method5680();
		this.aClass5_Sub1_20.method5654();
		this.aClass5_Sub1_20.method5683();
		this.aClass5_Sub1_20.method5583(Static482.aClass9_4, 1);
		this.aClass5_Sub1_20.method5592(Static482.aClass9_4, 1);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7035 = arg0;
		this.anInt7033 = arg3;
		this.anInt7030 = arg1;
		this.anInt7039 = arg2;
		this.aBoolean507 = this.anInt7035 != 0 || this.anInt7030 != 0 || this.anInt7039 != 0 || this.anInt7033 != 0;
	}
}
