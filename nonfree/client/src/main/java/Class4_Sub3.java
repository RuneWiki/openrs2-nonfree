import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	private int anInt3058 = 0;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	private int anInt3078 = 0;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	private int anInt3079 = 0;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	private int anInt3074 = 0;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
	private final int anInt3061;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_7;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
	private final int anInt3076;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "Lclient!sd;")
	private final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "Z")
	private final boolean aBoolean206;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
	private final boolean aBoolean205;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "Z")
	private final boolean aBoolean207;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "Z")
	private final boolean aBoolean208;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!sv;IIZ)V")
	public Class4_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3061 = arg2;
		this.aClass121_Sub2_7 = arg0;
		this.anInt3076 = arg1;
		this.anInterface20_3 = arg0.method7185(arg1, Static108.aClass82_8, arg2, arg3 ? Static255.aClass214_8 : Static43.aClass214_3);
		this.aBoolean206 = arg1 != this.anInterface20_3.method7536();
		this.aBoolean205 = arg2 != this.anInterface20_3.method7530();
		this.aBoolean207 = !this.aBoolean206 && this.anInterface20_3.method7535();
		this.aBoolean208 = !this.aBoolean205 && this.anInterface20_3.method7535();
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!sv;II[III)V")
	public Class4_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass121_Sub2_7 = arg0;
		this.anInt3076 = arg1;
		this.anInt3061 = arg2;
		this.anInterface20_3 = arg0.method7219(arg3, arg2, arg5, arg1, false, arg4);
		this.aBoolean206 = arg1 != this.anInterface20_3.method7536();
		this.aBoolean205 = this.anInterface20_3.method7530() != arg2;
		this.aBoolean207 = !this.aBoolean206 && this.anInterface20_3.method7535();
		this.aBoolean208 = !this.aBoolean205 && this.anInterface20_3.method7535();
	}

	@OriginalMember(owner = "client!gr", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass121_Sub2_7.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2645(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method6510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class16_Sub1 local6 = (Class16_Sub1) arg2;
		@Pc(11) int local11 = arg1 + this.anInt3078;
		@Pc(16) int local16 = arg0 + this.anInt3074;
		@Pc(19) Interface20 local19 = local6.anInterface20_2;
		this.anInterface20_3.method7527(Static188.aClass301_6);
		this.aClass121_Sub2_7.method7206();
		this.aClass121_Sub2_7.method7167(this.anInterface20_3);
		this.aClass121_Sub2_7.method7164(1);
		this.aClass121_Sub2_7.method7266(1);
		@Pc(49) Class34_Sub3 local49 = this.aClass121_Sub2_7.method7275();
		local49.method3760((float) this.anInt3061, 0.0F, (float) this.anInt3076);
		local49.G(local16, local11, 0);
		this.aClass121_Sub2_7.method7233();
		@Pc(73) Class34_Sub3 local73 = this.aClass121_Sub2_7.method7261();
		local73.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7245(1);
		this.aClass121_Sub2_7.method7167(local19);
		this.aClass121_Sub2_7.method7198(Static241.aClass59_1, Static526.aClass59_4);
		this.aClass121_Sub2_7.method7270(Static197.aClass305_3, 0);
		@Pc(123) Class34_Sub3 local123 = this.aClass121_Sub2_7.method7261();
		local123.method3760(local19.method7533((float) this.anInt3061), 1.0F, local19.method7534((float) this.anInt3076));
		local123.method3764(local19.method7534((float) (local16 - arg3)), local19.method7533((float) (local11 - arg4)), 0.0F);
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7292();
		this.aClass121_Sub2_7.method7209();
		this.aClass121_Sub2_7.method7270(Static67.aClass305_1, 0);
		this.aClass121_Sub2_7.method7198(Static241.aClass59_1, Static241.aClass59_1);
		this.aClass121_Sub2_7.method7167(null);
		this.aClass121_Sub2_7.method7245(0);
		this.aClass121_Sub2_7.method7209();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt3078 + this.anInt3061 + this.anInt3079;
	}

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class34_Sub3 local8 = this.aClass121_Sub2_7.method7275();
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_7.method7261();
		@Pc(18) int local18 = arg0 + this.anInt3074;
		@Pc(23) int local23 = arg1 + this.anInt3078;
		this.anInterface20_3.method7527(Static188.aClass301_6);
		this.aClass121_Sub2_7.method7206();
		this.aClass121_Sub2_7.method7167(this.anInterface20_3);
		this.aClass121_Sub2_7.method7164(arg4);
		this.aClass121_Sub2_7.method7266(arg2);
		this.aClass121_Sub2_7.method7270(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7195(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7166(arg3);
		local8.method3760((float) this.anInt3061, 0.0F, (float) this.anInt3076);
		local8.G(local18, local23, 0);
		local13.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7233();
		this.aClass121_Sub2_7.method7292();
		this.aClass121_Sub2_7.method7209();
		this.aClass121_Sub2_7.method7270(Static197.aClass305_3, 1);
		this.aClass121_Sub2_7.method7195(Static197.aClass305_3, 1);
	}

	@OriginalMember(owner = "client!gr", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class34_Sub3 local8 = this.aClass121_Sub2_7.method7275();
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_7.method7261();
		this.anInterface20_3.method7527(this.aBoolean206 || this.aBoolean205 ? Static188.aClass301_6 : Static563.aClass301_11);
		this.aClass121_Sub2_7.method7206();
		this.aClass121_Sub2_7.method7167(this.anInterface20_3);
		this.aClass121_Sub2_7.method7164(arg6);
		this.aClass121_Sub2_7.method7266(arg4);
		this.aClass121_Sub2_7.method7270(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7195(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7166(arg5);
		local13.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
		if (this.aBoolean204) {
			arg2 = arg2 * this.anInt3076 / this.AA();
			arg3 = this.anInt3061 * arg3 / this.a();
			arg0 += this.anInt3074 * arg2 / this.anInt3076;
			arg1 += arg3 * this.anInt3078 / this.anInt3061;
		}
		local8.method3760((float) arg3, 0.0F, (float) arg2);
		local8.G(arg0, arg1, 0);
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7233();
		this.aClass121_Sub2_7.method7292();
		this.aClass121_Sub2_7.method7209();
		this.aClass121_Sub2_7.method7270(Static197.aClass305_3, 1);
		this.aClass121_Sub2_7.method7195(Static197.aClass305_3, 1);
	}

	@OriginalMember(owner = "client!gr", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt3058 + this.anInt3076 + this.anInt3074;
	}

	@OriginalMember(owner = "client!gr", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3058 = arg2;
		this.anInt3078 = arg1;
		this.anInt3079 = arg3;
		this.anInt3074 = arg0;
		this.aBoolean204 = this.anInt3074 != 0 || this.anInt3078 != 0 || this.anInt3058 != 0 || this.anInt3079 != 0;
	}

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII[III)V")
	private void method2645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface20_3.method7529(arg5, arg1, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method6508(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class34_Sub3 local8 = this.aClass121_Sub2_7.method7275();
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_7.method7261();
		@Pc(16) Class16_Sub1 local16 = (Class16_Sub1) arg6;
		@Pc(19) Interface20 local19 = local16.anInterface20_2;
		this.anInterface20_3.method7527(Static563.aClass301_11);
		this.aClass121_Sub2_7.method7206();
		this.aClass121_Sub2_7.method7167(this.anInterface20_3);
		this.aClass121_Sub2_7.method7164(1);
		this.aClass121_Sub2_7.method7266(1);
		if (this.aBoolean204) {
			@Pc(55) float local55 = (float) this.anInt3076 / (float) this.AA();
			@Pc(63) float local63 = (float) this.anInt3061 / (float) this.a();
			local8.method3759(local63 * (arg5 - arg1), local63 * (arg4 - arg0), local55 * (arg2 - arg0), 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, (arg3 - arg1) * local55);
			local8.method3764(local55 * ((float) this.anInt3074 + arg0), local63 * ((float) this.anInt3078 + arg1), 0.0F);
		} else {
			local8.method3759(arg5 - arg1, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, arg3 - arg1);
			local8.method3764(arg0, arg1, 0.0F);
		}
		local13.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7245(1);
		this.aClass121_Sub2_7.method7167(local19);
		this.aClass121_Sub2_7.method7198(Static241.aClass59_1, Static526.aClass59_4);
		this.aClass121_Sub2_7.method7270(Static197.aClass305_3, 0);
		@Pc(191) Class34_Sub3 local191 = this.aClass121_Sub2_7.method7261();
		local191.la(local8);
		local191.G(-arg7, -arg8, 0);
		local191.method3769(local19.method7533(1.0F), 1.0F, local19.method7534(1.0F));
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7233();
		this.aClass121_Sub2_7.method7292();
		this.aClass121_Sub2_7.method7209();
		this.aClass121_Sub2_7.method7270(Static67.aClass305_1, 0);
		this.aClass121_Sub2_7.method7198(Static241.aClass59_1, Static241.aClass59_1);
		this.aClass121_Sub2_7.method7167(null);
		this.aClass121_Sub2_7.method7245(0);
		this.aClass121_Sub2_7.method7209();
	}

	@OriginalMember(owner = "client!gr", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt3076;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt3061;
	}

	@OriginalMember(owner = "client!gr", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class34_Sub3 local8 = this.aClass121_Sub2_7.method7275();
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_7.method7261();
		this.anInterface20_3.method7527(this.aBoolean206 || this.aBoolean205 ? Static188.aClass301_6 : Static563.aClass301_11);
		this.aClass121_Sub2_7.method7206();
		this.aClass121_Sub2_7.method7167(this.anInterface20_3);
		this.aClass121_Sub2_7.method7164(arg8);
		this.aClass121_Sub2_7.method7266(arg6);
		this.aClass121_Sub2_7.method7270(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7195(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7166(arg7);
		if (this.aBoolean204) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(93) float local93 = (arg4 - arg0) / local74;
			@Pc(100) float local100 = (arg5 - arg1) / local74;
			@Pc(106) float local106 = local93 * (float) this.anInt3078;
			@Pc(112) float local112 = local100 * (float) this.anInt3078;
			@Pc(118) float local118 = local80 * (float) this.anInt3074;
			@Pc(124) float local124 = local87 * (float) this.anInt3074;
			@Pc(131) float local131 = -local80 * (float) this.anInt3058;
			@Pc(138) float local138 = -local87 * (float) this.anInt3058;
			@Pc(145) float local145 = (float) this.anInt3079 * -local93;
			arg4 = local145 + arg4 + local118;
			@Pc(158) float local158 = (float) this.anInt3079 * -local100;
			arg2 = arg2 + local131 + local106;
			arg3 = local112 + local138 + arg3;
			arg1 = local112 + local124 + arg1;
			arg0 = local118 + arg0 + local106;
			arg5 = local124 + arg5 + local158;
		}
		local8.method3759(arg5 - arg1, -arg0 + arg4, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, arg3 - arg1);
		local8.method3764(arg0, arg1, 0.0F);
		local13.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
		this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_7.method7233();
		this.aClass121_Sub2_7.method7292();
		this.aClass121_Sub2_7.method7209();
		this.aClass121_Sub2_7.method7270(Static197.aClass305_3, 1);
		this.aClass121_Sub2_7.method7195(Static197.aClass305_3, 1);
	}

	@OriginalMember(owner = "client!gr", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class34_Sub3 local10 = this.aClass121_Sub2_7.method7275();
		@Pc(15) Class34_Sub3 local15 = this.aClass121_Sub2_7.method7261();
		this.anInterface20_3.method7527(Static188.aClass301_6);
		this.aClass121_Sub2_7.method7206();
		this.aClass121_Sub2_7.method7167(this.anInterface20_3);
		this.aClass121_Sub2_7.method7164(arg6);
		this.aClass121_Sub2_7.method7266(arg4);
		this.aClass121_Sub2_7.method7270(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7195(Static257.aClass305_4, 1);
		this.aClass121_Sub2_7.method7166(arg5);
		@Pc(73) boolean local73 = this.aBoolean208 && this.anInt3078 == 0 && this.anInt3079 == 0;
		@Pc(89) boolean local89 = this.aBoolean207 && this.anInt3074 == 0 && this.anInt3058 == 0;
		if (local73 & local89) {
			local15.method3760(this.anInterface20_3.method7533((float) arg3), 1.0F, this.anInterface20_3.method7534((float) arg2));
			local10.method3760((float) arg3, 0.0F, (float) arg2);
			local10.G(arg0, arg1, 0);
			this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
			this.aClass121_Sub2_7.method7233();
			this.aClass121_Sub2_7.method7292();
		} else {
			@Pc(100) int local100;
			@Pc(103) int local103;
			@Pc(131) int local131;
			@Pc(136) int local136;
			@Pc(183) int local183;
			if (local89) {
				local100 = arg1 + arg3;
				local103 = this.a();
				local15.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) arg2));
				this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
				local131 = arg1 + this.anInt3078;
				local136 = this.anInt3061 + local131;
				while (local100 >= local136) {
					local10.method3760((float) this.anInt3061, 0.0F, (float) arg2);
					local10.G(arg0, local131, 0);
					this.aClass121_Sub2_7.method7233();
					local136 += local103;
					local131 += local103;
					this.aClass121_Sub2_7.method7292();
				}
				if (local131 < local100) {
					local183 = local100 - local131;
					local15.method3760(this.anInterface20_3.method7533((float) local183), 1.0F, this.anInterface20_3.method7534((float) arg2));
					this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
					local10.method3760((float) local183, 0.0F, (float) arg2);
					local10.G(arg0, local131, 0);
					this.aClass121_Sub2_7.method7233();
					this.aClass121_Sub2_7.method7292();
				}
			} else if (local73) {
				local100 = arg0 + arg2;
				local103 = this.AA();
				local15.method3760(this.anInterface20_3.method7533((float) arg3), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
				this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
				local131 = arg0 + this.anInt3074;
				for (local136 = this.anInt3076 + local131; local136 <= local100; local136 += local103) {
					local10.method3760((float) arg3, 0.0F, (float) this.anInt3076);
					local10.G(local131, arg1, 0);
					this.aClass121_Sub2_7.method7233();
					local131 += local103;
					this.aClass121_Sub2_7.method7292();
				}
				if (local100 > local131) {
					local183 = local100 - local131;
					local15.method3760(this.anInterface20_3.method7533((float) arg3), 1.0F, this.anInterface20_3.method7534((float) local183));
					this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
					local10.method3760((float) arg3, 0.0F, (float) local183);
					local10.G(local131, arg1, 0);
					this.aClass121_Sub2_7.method7233();
					this.aClass121_Sub2_7.method7292();
				}
			} else {
				local100 = arg3 + arg1;
				local103 = arg0 + arg2;
				local131 = this.AA();
				local136 = this.a();
				local183 = arg1 + this.anInt3078;
				@Pc(412) int local412;
				@Pc(417) int local417;
				@Pc(465) int local465;
				for (@Pc(382) int local382 = local183 + this.anInt3061; local382 <= local100; local382 += local136) {
					local15.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
					this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
					local412 = this.anInt3074 + arg0;
					local417 = this.anInt3076 + local412;
					while (local103 >= local417) {
						local10.method3760((float) this.anInt3061, 0.0F, (float) this.anInt3076);
						local10.G(local412, local183, 0);
						this.aClass121_Sub2_7.method7233();
						local417 += local131;
						local412 += local131;
						this.aClass121_Sub2_7.method7292();
					}
					if (local103 > local412) {
						local465 = local103 - local412;
						local15.method3760(this.anInterface20_3.method7533((float) this.anInt3061), 1.0F, this.anInterface20_3.method7534((float) local465));
						this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
						local10.method3760((float) this.anInt3061, 0.0F, (float) local465);
						local10.G(local412, local183, 0);
						this.aClass121_Sub2_7.method7233();
						this.aClass121_Sub2_7.method7292();
					}
					local183 += local136;
				}
				if (local183 < local100) {
					local412 = local100 - local183;
					local15.method3760(this.anInterface20_3.method7533((float) local412), 1.0F, this.anInterface20_3.method7534((float) this.anInt3076));
					this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
					local417 = this.anInt3074 + arg0;
					for (local465 = local417 + this.anInt3076; local465 <= local103; local465 += local131) {
						local10.method3760((float) local412, 0.0F, (float) this.anInt3076);
						local10.G(local417, local183, 0);
						this.aClass121_Sub2_7.method7233();
						local417 += local131;
						this.aClass121_Sub2_7.method7292();
					}
					if (local417 < local103) {
						@Pc(608) int local608 = local103 - local417;
						local15.method3760(this.anInterface20_3.method7533((float) local412), 1.0F, this.anInterface20_3.method7534((float) local608));
						this.aClass121_Sub2_7.method7181(Static478.aClass168_6);
						local10.method3760((float) local412, 0.0F, (float) local608);
						local10.G(local417, local183, 0);
						this.aClass121_Sub2_7.method7233();
						this.aClass121_Sub2_7.method7292();
					}
				}
			}
		}
		this.aClass121_Sub2_7.method7209();
		this.aClass121_Sub2_7.method7270(Static197.aClass305_3, 1);
		this.aClass121_Sub2_7.method7195(Static197.aClass305_3, 1);
	}
}
