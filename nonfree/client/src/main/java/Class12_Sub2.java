import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
	private int anInt1087 = 0;

	@OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
	private int anInt1092 = 0;

	@OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
	private int anInt1101 = 0;

	@OriginalMember(owner = "client!baa", name = "y", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
	private int anInt1097 = 0;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
	private final int anInt1082;

	@OriginalMember(owner = "client!baa", name = "m", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_4;

	@OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
	private final int anInt1091;

	@OriginalMember(owner = "client!baa", name = "w", descriptor = "Lclient!jb;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "Z")
	private final boolean aBoolean93;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Z")
	private final boolean aBoolean91;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "Z")
	private final boolean aBoolean92;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!cb;IIZ)V")
	public Class12_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1082 = arg1;
		this.aClass9_Sub1_4 = arg0;
		this.anInt1091 = arg2;
		this.anInterface5_1 = arg0.method7775(arg2, arg1, Static489.aClass289_13, arg3 ? Static72.aClass16_3 : Static470.aClass16_16);
		this.aBoolean93 = arg1 != this.anInterface5_1.method7971();
		this.aBoolean91 = this.anInterface5_1.method7974() != arg2;
		this.aBoolean90 = !this.aBoolean93 && this.anInterface5_1.method7969();
		this.aBoolean92 = !this.aBoolean91 && this.anInterface5_1.method7969();
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!cb;II[III)V")
	public Class12_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1091 = arg2;
		this.aClass9_Sub1_4 = arg0;
		this.anInt1082 = arg1;
		this.anInterface5_1 = arg0.method7771(arg2, arg4, arg1, arg5, arg3, false);
		this.aBoolean93 = this.anInterface5_1.method7971() != arg1;
		this.aBoolean91 = arg2 != this.anInterface5_1.method7974();
		this.aBoolean90 = !this.aBoolean93 && this.anInterface5_1.method7969();
		this.aBoolean92 = !this.aBoolean91 && this.anInterface5_1.method7969();
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt1082;
	}

	@OriginalMember(owner = "client!baa", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt1087 + this.anInt1101 + this.anInt1091;
	}

	@OriginalMember(owner = "client!baa", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt1092 + this.anInt1082 + this.anInt1097;
	}

	@OriginalMember(owner = "client!baa", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1087 = arg3;
		this.anInt1097 = arg2;
		this.anInt1092 = arg0;
		this.anInt1101 = arg1;
		this.aBoolean95 = this.anInt1092 != 0 || this.anInt1101 != 0 || this.anInt1097 != 0 || this.anInt1087 != 0;
	}

	@OriginalMember(owner = "client!baa", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass9_Sub1_4.v(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1153(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class22_Sub3 local10 = this.aClass9_Sub1_4.method7760();
		@Pc(15) Class22_Sub3 local15 = this.aClass9_Sub1_4.method7733();
		this.anInterface5_1.method7955(Static111.aClass234_4);
		this.aClass9_Sub1_4.method7762();
		this.aClass9_Sub1_4.method7712(this.anInterface5_1);
		this.aClass9_Sub1_4.method7730(arg6);
		this.aClass9_Sub1_4.method7778(arg4);
		this.aClass9_Sub1_4.method7678(Static349.aClass122_3, 1);
		this.aClass9_Sub1_4.method7735(1, Static349.aClass122_3);
		this.aClass9_Sub1_4.method7768(arg5);
		@Pc(73) boolean local73 = this.aBoolean92 && this.anInt1101 == 0 && this.anInt1087 == 0;
		@Pc(89) boolean local89 = this.aBoolean90 && this.anInt1092 == 0 && this.anInt1097 == 0;
		if (local89 & local73) {
			local15.method5966(1.0F, this.anInterface5_1.method7970((float) arg2), this.anInterface5_1.method7972((float) arg3));
			local10.method5966(0.0F, (float) arg2, (float) arg3);
			local10.TA(arg0, arg1, 0);
			this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
			this.aClass9_Sub1_4.method7656();
			this.aClass9_Sub1_4.method7758();
		} else {
			@Pc(101) int local101;
			@Pc(105) int local105;
			@Pc(108) int local108;
			@Pc(111) int local111;
			@Pc(116) int local116;
			if (local89) {
				local101 = arg1 + arg3;
				local105 = this.ma();
				local15.method5966(1.0F, this.anInterface5_1.method7970((float) arg2), this.anInterface5_1.method7972((float) this.anInt1091));
				this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
				local108 = arg1 + this.anInt1101;
				local111 = local108 + this.anInt1091;
				while (local101 >= local111) {
					local10.method5966(0.0F, (float) arg2, (float) this.anInt1091);
					local10.TA(arg0, local108, 0);
					this.aClass9_Sub1_4.method7656();
					local108 += local105;
					local111 += local105;
					this.aClass9_Sub1_4.method7758();
				}
				if (local101 > local108) {
					local116 = local101 - local108;
					local15.method5966(1.0F, this.anInterface5_1.method7970((float) arg2), this.anInterface5_1.method7972((float) local116));
					this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
					local10.method5966(0.0F, (float) arg2, (float) local116);
					local10.TA(arg0, local108, 0);
					this.aClass9_Sub1_4.method7656();
					this.aClass9_Sub1_4.method7758();
				}
			} else if (local73) {
				local101 = arg2 + arg0;
				local105 = this.EA();
				local15.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) arg3));
				this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
				local108 = this.anInt1092 + arg0;
				for (local111 = this.anInt1082 + local108; local111 <= local101; local111 += local105) {
					local10.method5966(0.0F, (float) this.anInt1082, (float) arg3);
					local10.TA(local108, arg1, 0);
					this.aClass9_Sub1_4.method7656();
					this.aClass9_Sub1_4.method7758();
					local108 += local105;
				}
				if (local101 > local108) {
					local116 = local101 - local108;
					local15.method5966(1.0F, this.anInterface5_1.method7970((float) local116), this.anInterface5_1.method7972((float) arg3));
					this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
					local10.method5966(0.0F, (float) local116, (float) arg3);
					local10.TA(local108, arg1, 0);
					this.aClass9_Sub1_4.method7656();
					this.aClass9_Sub1_4.method7758();
				}
			} else {
				local101 = arg3 + arg1;
				local105 = arg2 + arg0;
				local108 = this.EA();
				local111 = this.ma();
				local116 = this.anInt1101 + arg1;
				@Pc(122) int local122 = local116 + this.anInt1091;
				@Pc(153) int local153;
				@Pc(158) int local158;
				@Pc(202) int local202;
				while (local101 >= local122) {
					local15.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) this.anInt1091));
					this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
					local153 = arg0 + this.anInt1092;
					local158 = this.anInt1082 + local153;
					while (local105 >= local158) {
						local10.method5966(0.0F, (float) this.anInt1082, (float) this.anInt1091);
						local10.TA(local153, local116, 0);
						this.aClass9_Sub1_4.method7656();
						this.aClass9_Sub1_4.method7758();
						local158 += local108;
						local153 += local108;
					}
					if (local153 < local105) {
						local202 = local105 - local153;
						local15.method5966(1.0F, this.anInterface5_1.method7970((float) local202), this.anInterface5_1.method7972((float) this.anInt1091));
						this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
						local10.method5966(0.0F, (float) local202, (float) this.anInt1091);
						local10.TA(local153, local116, 0);
						this.aClass9_Sub1_4.method7656();
						this.aClass9_Sub1_4.method7758();
					}
					local122 += local111;
					local116 += local111;
				}
				if (local101 > local116) {
					local153 = local101 - local116;
					local15.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) local153));
					this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
					local158 = this.anInt1092 + arg0;
					for (local202 = this.anInt1082 + local158; local202 <= local105; local202 += local108) {
						local10.method5966(0.0F, (float) this.anInt1082, (float) local153);
						local10.TA(local158, local116, 0);
						this.aClass9_Sub1_4.method7656();
						this.aClass9_Sub1_4.method7758();
						local158 += local108;
					}
					if (local105 > local158) {
						@Pc(350) int local350 = local105 - local158;
						local15.method5966(1.0F, this.anInterface5_1.method7970((float) local350), this.anInterface5_1.method7972((float) local153));
						this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
						local10.method5966(0.0F, (float) local350, (float) local153);
						local10.TA(local158, local116, 0);
						this.aClass9_Sub1_4.method7656();
						this.aClass9_Sub1_4.method7758();
					}
				}
			}
		}
		this.aClass9_Sub1_4.method7744();
		this.aClass9_Sub1_4.method7678(Static426.aClass122_4, 1);
		this.aClass9_Sub1_4.method7735(1, Static426.aClass122_4);
	}

	@OriginalMember(owner = "client!baa", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class22_Sub3 local8 = this.aClass9_Sub1_4.method7760();
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_4.method7733();
		@Pc(18) int local18 = arg1 + this.anInt1101;
		@Pc(23) int local23 = arg0 + this.anInt1092;
		this.anInterface5_1.method7955(Static111.aClass234_4);
		this.aClass9_Sub1_4.method7762();
		this.aClass9_Sub1_4.method7712(this.anInterface5_1);
		this.aClass9_Sub1_4.method7730(arg4);
		this.aClass9_Sub1_4.method7778(arg2);
		this.aClass9_Sub1_4.method7678(Static349.aClass122_3, 1);
		this.aClass9_Sub1_4.method7735(1, Static349.aClass122_3);
		this.aClass9_Sub1_4.method7768(arg3);
		local8.method5966(0.0F, (float) this.anInt1082, (float) this.anInt1091);
		local8.TA(local23, local18, 0);
		local13.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) this.anInt1091));
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7656();
		this.aClass9_Sub1_4.method7758();
		this.aClass9_Sub1_4.method7744();
		this.aClass9_Sub1_4.method7678(Static426.aClass122_4, 1);
		this.aClass9_Sub1_4.method7735(1, Static426.aClass122_4);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7190(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class23 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class22_Sub3 local8 = this.aClass9_Sub1_4.method7760();
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_4.method7733();
		@Pc(16) Class23_Sub3 local16 = (Class23_Sub3) arg6;
		@Pc(19) Interface5 local19 = local16.anInterface5_4;
		this.anInterface5_1.method7955(Static66.aClass234_3);
		this.aClass9_Sub1_4.method7762();
		this.aClass9_Sub1_4.method7712(this.anInterface5_1);
		this.aClass9_Sub1_4.method7730(1);
		this.aClass9_Sub1_4.method7778(1);
		if (this.aBoolean95) {
			@Pc(85) float local85 = (float) this.anInt1082 / (float) this.EA();
			@Pc(93) float local93 = (float) this.anInt1091 / (float) this.ma();
			local8.method5967(0.0F, local85 * (arg3 - arg1), local85 * (arg2 - arg0), 0.0F, 0.0F, (arg4 - arg0) * local93, (arg5 - arg1) * local93, 0.0F, 1.0F);
			local8.method5951(((float) this.anInt1101 + arg1) * local93, 0.0F, local85 * (arg0 + (float) this.anInt1092));
		} else {
			local8.method5967(0.0F, arg3 - arg1, arg2 - arg0, 0.0F, 0.0F, arg4 - arg0, -arg1 + arg5, 0.0F, 1.0F);
			local8.method5951(arg1, 0.0F, arg0);
		}
		local13.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) this.anInt1091));
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7726(1);
		this.aClass9_Sub1_4.method7712(local19);
		this.aClass9_Sub1_4.method7723(Static74.aClass295_2, Static453.aClass295_5);
		this.aClass9_Sub1_4.method7678(Static426.aClass122_4, 0);
		@Pc(191) Class22_Sub3 local191 = this.aClass9_Sub1_4.method7733();
		local191.EA(local8);
		local191.TA(-arg7, -arg8, 0);
		local191.method5958(local19.method7970(1.0F), local19.method7972(1.0F), 1.0F);
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7656();
		this.aClass9_Sub1_4.method7758();
		this.aClass9_Sub1_4.method7744();
		this.aClass9_Sub1_4.method7678(Static197.aClass122_2, 0);
		this.aClass9_Sub1_4.method7723(Static74.aClass295_2, Static74.aClass295_2);
		this.aClass9_Sub1_4.method7712(null);
		this.aClass9_Sub1_4.method7726(0);
		this.aClass9_Sub1_4.method7744();
	}

	@OriginalMember(owner = "client!baa", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class22_Sub3 local8 = this.aClass9_Sub1_4.method7760();
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_4.method7733();
		this.anInterface5_1.method7955(this.aBoolean93 || this.aBoolean91 ? Static111.aClass234_4 : Static66.aClass234_3);
		this.aClass9_Sub1_4.method7762();
		this.aClass9_Sub1_4.method7712(this.anInterface5_1);
		this.aClass9_Sub1_4.method7730(arg8);
		this.aClass9_Sub1_4.method7778(arg6);
		this.aClass9_Sub1_4.method7678(Static349.aClass122_3, 1);
		this.aClass9_Sub1_4.method7735(1, Static349.aClass122_3);
		this.aClass9_Sub1_4.method7768(arg7);
		if (this.aBoolean95) {
			@Pc(70) float local70 = (float) this.EA();
			@Pc(74) float local74 = (float) this.ma();
			@Pc(81) float local81 = (arg2 - arg0) / local70;
			@Pc(88) float local88 = (arg3 - arg1) / local70;
			@Pc(95) float local95 = (arg4 - arg0) / local74;
			@Pc(102) float local102 = (arg5 - arg1) / local74;
			@Pc(108) float local108 = (float) this.anInt1101 * local95;
			@Pc(114) float local114 = local102 * (float) this.anInt1101;
			@Pc(120) float local120 = local81 * (float) this.anInt1092;
			@Pc(126) float local126 = (float) this.anInt1092 * local88;
			@Pc(133) float local133 = (float) this.anInt1097 * -local81;
			@Pc(140) float local140 = -local88 * (float) this.anInt1097;
			@Pc(147) float local147 = (float) this.anInt1087 * -local95;
			arg3 = local114 + arg3 + local140;
			arg0 = local108 + arg0 + local120;
			arg2 = local133 + arg2 + local108;
			arg1 = local114 + arg1 + local126;
			@Pc(178) float local178 = (float) this.anInt1087 * -local102;
			arg4 = arg4 + local120 + local147;
			arg5 = local178 + local126 + arg5;
		}
		local8.method5967(0.0F, arg3 - arg1, arg2 - arg0, 0.0F, 0.0F, arg4 - arg0, arg5 - arg1, 0.0F, 1.0F);
		local8.method5951(arg1, 0.0F, arg0);
		local13.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) this.anInt1091));
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7656();
		this.aClass9_Sub1_4.method7758();
		this.aClass9_Sub1_4.method7744();
		this.aClass9_Sub1_4.method7678(Static426.aClass122_4, 1);
		this.aClass9_Sub1_4.method7735(1, Static426.aClass122_4);
	}

	@OriginalMember(owner = "client!baa", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!baa", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class22_Sub3 local8 = this.aClass9_Sub1_4.method7760();
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_4.method7733();
		this.anInterface5_1.method7955(this.aBoolean93 || this.aBoolean91 ? Static111.aClass234_4 : Static66.aClass234_3);
		this.aClass9_Sub1_4.method7762();
		this.aClass9_Sub1_4.method7712(this.anInterface5_1);
		this.aClass9_Sub1_4.method7730(arg6);
		this.aClass9_Sub1_4.method7778(arg4);
		this.aClass9_Sub1_4.method7678(Static349.aClass122_3, 1);
		this.aClass9_Sub1_4.method7735(1, Static349.aClass122_3);
		this.aClass9_Sub1_4.method7768(arg5);
		local13.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) this.anInt1091));
		if (this.aBoolean95) {
			arg2 = this.anInt1082 * arg2 / this.EA();
			arg3 = this.anInt1091 * arg3 / this.ma();
			arg0 += arg2 * this.anInt1092 / this.anInt1082;
			arg1 += this.anInt1101 * arg3 / this.anInt1091;
		}
		local8.method5966(0.0F, (float) arg2, (float) arg3);
		local8.TA(arg0, arg1, 0);
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7656();
		this.aClass9_Sub1_4.method7758();
		this.aClass9_Sub1_4.method7744();
		this.aClass9_Sub1_4.method7678(Static426.aClass122_4, 1);
		this.aClass9_Sub1_4.method7735(1, Static426.aClass122_4);
	}

	@OriginalMember(owner = "client!baa", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.anInt1091;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class23_Sub3 local6 = (Class23_Sub3) arg2;
		@Pc(9) Interface5 local9 = local6.anInterface5_4;
		@Pc(14) int local14 = arg0 + this.anInt1092;
		@Pc(19) int local19 = arg1 + this.anInt1101;
		this.anInterface5_1.method7955(Static111.aClass234_4);
		this.aClass9_Sub1_4.method7762();
		this.aClass9_Sub1_4.method7712(this.anInterface5_1);
		this.aClass9_Sub1_4.method7730(1);
		this.aClass9_Sub1_4.method7778(1);
		@Pc(49) Class22_Sub3 local49 = this.aClass9_Sub1_4.method7760();
		local49.method5966(0.0F, (float) this.anInt1082, (float) this.anInt1091);
		local49.TA(local14, local19, 0);
		this.aClass9_Sub1_4.method7656();
		@Pc(73) Class22_Sub3 local73 = this.aClass9_Sub1_4.method7733();
		local73.method5966(1.0F, this.anInterface5_1.method7970((float) this.anInt1082), this.anInterface5_1.method7972((float) this.anInt1091));
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7726(1);
		this.aClass9_Sub1_4.method7712(local9);
		this.aClass9_Sub1_4.method7723(Static74.aClass295_2, Static453.aClass295_5);
		this.aClass9_Sub1_4.method7678(Static426.aClass122_4, 0);
		@Pc(123) Class22_Sub3 local123 = this.aClass9_Sub1_4.method7733();
		local123.method5966(1.0F, local9.method7970((float) this.anInt1082), local9.method7972((float) this.anInt1091));
		local123.method5951(local9.method7972((float) (local19 - arg4)), 0.0F, local9.method7970((float) (local14 - arg3)));
		this.aClass9_Sub1_4.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_4.method7758();
		this.aClass9_Sub1_4.method7744();
		this.aClass9_Sub1_4.method7678(Static197.aClass122_2, 0);
		this.aClass9_Sub1_4.method7723(Static74.aClass295_2, Static74.aClass295_2);
		this.aClass9_Sub1_4.method7712(null);
		this.aClass9_Sub1_4.method7726(0);
		this.aClass9_Sub1_4.method7744();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIII[III)V")
	private void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface5_1.method7968(arg3, arg1, arg5, arg4, arg0, arg2);
	}
}
