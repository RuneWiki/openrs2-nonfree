import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	private int anInt8667 = 0;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	private int anInt8671 = 0;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	private int anInt8676 = 0;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "I")
	private int anInt8673 = 0;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	private final int anInt8682;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_20;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	private final int anInt8679;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Lclient!eea;")
	private final Interface5 anInterface5_4;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
	private final boolean aBoolean654;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Z")
	private final boolean aBoolean650;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "Z")
	private final boolean aBoolean653;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!bda;IIZ)V")
	public Class104_Sub3(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8682 = arg2;
		this.aClass4_Sub2_20 = arg0;
		this.anInt8679 = arg1;
		this.anInterface5_4 = arg0.method7293(arg2, arg1, arg3 ? Static171.aClass110_13 : Static56.aClass110_3, Static517.aClass308_15);
		this.aBoolean654 = arg1 != this.anInterface5_4.method7771();
		this.aBoolean650 = arg2 != this.anInterface5_4.method7770();
		this.aBoolean653 = !this.aBoolean654 && this.anInterface5_4.method7775();
		this.aBoolean651 = !this.aBoolean650 && this.anInterface5_4.method7775();
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!bda;II[III)V")
	public Class104_Sub3(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8682 = arg2;
		this.aClass4_Sub2_20 = arg0;
		this.anInt8679 = arg1;
		this.anInterface5_4 = arg0.method7323(false, arg2, arg3, arg5, arg1, arg4);
		this.aBoolean654 = this.anInterface5_4.method7771() != arg1;
		this.aBoolean650 = arg2 != this.anInterface5_4.method7770();
		this.aBoolean653 = !this.aBoolean654 && this.anInterface5_4.method7775();
		this.aBoolean651 = !this.aBoolean650 && this.anInterface5_4.method7775();
	}

	@OriginalMember(owner = "client!un", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8667 = arg3;
		this.anInt8671 = arg2;
		this.anInt8673 = arg0;
		this.anInt8676 = arg1;
		this.aBoolean652 = this.anInt8673 != 0 || this.anInt8676 != 0 || this.anInt8671 != 0 || this.anInt8667 != 0;
	}

	@OriginalMember(owner = "client!un", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class128_Sub3 local8 = this.aClass4_Sub2_20.method7338();
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_20.method7349();
		@Pc(18) int local18 = arg0 + this.anInt8673;
		@Pc(23) int local23 = arg1 + this.anInt8676;
		this.anInterface5_4.method7757(Static519.aClass136_7);
		this.aClass4_Sub2_20.method7245();
		this.aClass4_Sub2_20.method7316(this.anInterface5_4);
		this.aClass4_Sub2_20.method7228(arg4);
		this.aClass4_Sub2_20.method7279(arg2);
		this.aClass4_Sub2_20.method7277(1, Static319.aClass27_4);
		this.aClass4_Sub2_20.method7330(Static319.aClass27_4, 1);
		this.aClass4_Sub2_20.method7275(arg3);
		local8.method6895((float) this.anInt8682, 0.0F, (float) this.anInt8679);
		local8.TA(local18, local23, 0);
		local13.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7306();
		this.aClass4_Sub2_20.method7264();
		this.aClass4_Sub2_20.method7290();
		this.aClass4_Sub2_20.method7277(1, Static226.aClass27_1);
		this.aClass4_Sub2_20.method7330(Static226.aClass27_1, 1);
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class128_Sub3 local10 = this.aClass4_Sub2_20.method7338();
		@Pc(15) Class128_Sub3 local15 = this.aClass4_Sub2_20.method7349();
		this.anInterface5_4.method7757(Static519.aClass136_7);
		this.aClass4_Sub2_20.method7245();
		this.aClass4_Sub2_20.method7316(this.anInterface5_4);
		this.aClass4_Sub2_20.method7228(arg6);
		this.aClass4_Sub2_20.method7279(arg4);
		this.aClass4_Sub2_20.method7277(1, Static319.aClass27_4);
		this.aClass4_Sub2_20.method7330(Static319.aClass27_4, 1);
		this.aClass4_Sub2_20.method7275(arg5);
		@Pc(73) boolean local73 = this.aBoolean651 && this.anInt8676 == 0 && this.anInt8667 == 0;
		@Pc(89) boolean local89 = this.aBoolean653 && this.anInt8673 == 0 && this.anInt8671 == 0;
		if (local73 & local89) {
			local15.method6895(this.anInterface5_4.method7768((float) arg3), 1.0F, this.anInterface5_4.method7774((float) arg2));
			local10.method6895((float) arg3, 0.0F, (float) arg2);
			local10.TA(arg0, arg1, 0);
			this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
			this.aClass4_Sub2_20.method7306();
			this.aClass4_Sub2_20.method7264();
		} else {
			@Pc(143) int local143;
			@Pc(146) int local146;
			@Pc(173) int local173;
			@Pc(179) int local179;
			@Pc(226) int local226;
			if (local89) {
				local143 = arg3 + arg1;
				local146 = this.ma();
				local15.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) arg2));
				this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
				local173 = arg1 + this.anInt8676;
				for (local179 = local173 + this.anInt8682; local179 <= local143; local179 += local146) {
					local10.method6895((float) this.anInt8682, 0.0F, (float) arg2);
					local10.TA(arg0, local173, 0);
					this.aClass4_Sub2_20.method7306();
					local173 += local146;
					this.aClass4_Sub2_20.method7264();
				}
				if (local173 < local143) {
					local226 = local143 - local173;
					local15.method6895(this.anInterface5_4.method7768((float) local226), 1.0F, this.anInterface5_4.method7774((float) arg2));
					this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
					local10.method6895((float) local226, 0.0F, (float) arg2);
					local10.TA(arg0, local173, 0);
					this.aClass4_Sub2_20.method7306();
					this.aClass4_Sub2_20.method7264();
				}
			} else if (local73) {
				local143 = arg0 + arg2;
				local146 = this.EA();
				local15.method6895(this.anInterface5_4.method7768((float) arg3), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
				this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
				local173 = arg0 + this.anInt8673;
				local179 = local173 + this.anInt8679;
				while (local143 >= local179) {
					local10.method6895((float) arg3, 0.0F, (float) this.anInt8679);
					local10.TA(local173, arg1, 0);
					this.aClass4_Sub2_20.method7306();
					this.aClass4_Sub2_20.method7264();
					local179 += local146;
					local173 += local146;
				}
				if (local173 < local143) {
					local226 = local143 - local173;
					local15.method6895(this.anInterface5_4.method7768((float) arg3), 1.0F, this.anInterface5_4.method7774((float) local226));
					this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
					local10.method6895((float) arg3, 0.0F, (float) local226);
					local10.TA(local173, arg1, 0);
					this.aClass4_Sub2_20.method7306();
					this.aClass4_Sub2_20.method7264();
				}
			} else {
				local143 = arg3 + arg1;
				local146 = arg0 + arg2;
				local173 = this.EA();
				local179 = this.ma();
				local226 = arg1 + this.anInt8676;
				@Pc(461) int local461;
				@Pc(467) int local467;
				@Pc(514) int local514;
				for (@Pc(431) int local431 = this.anInt8682 + local226; local431 <= local143; local431 += local179) {
					local15.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
					this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
					local461 = arg0 + this.anInt8673;
					local467 = local461 + this.anInt8679;
					while (local467 <= local146) {
						local10.method6895((float) this.anInt8682, 0.0F, (float) this.anInt8679);
						local10.TA(local461, local226, 0);
						this.aClass4_Sub2_20.method7306();
						local461 += local173;
						local467 += local173;
						this.aClass4_Sub2_20.method7264();
					}
					if (local146 > local461) {
						local514 = local146 - local461;
						local15.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) local514));
						this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
						local10.method6895((float) this.anInt8682, 0.0F, (float) local514);
						local10.TA(local461, local226, 0);
						this.aClass4_Sub2_20.method7306();
						this.aClass4_Sub2_20.method7264();
					}
					local226 += local179;
				}
				if (local226 < local143) {
					local461 = local143 - local226;
					local15.method6895(this.anInterface5_4.method7768((float) local461), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
					this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
					local467 = arg0 + this.anInt8673;
					for (local514 = this.anInt8679 + local467; local514 <= local146; local514 += local173) {
						local10.method6895((float) local461, 0.0F, (float) this.anInt8679);
						local10.TA(local467, local226, 0);
						this.aClass4_Sub2_20.method7306();
						this.aClass4_Sub2_20.method7264();
						local467 += local173;
					}
					if (local467 < local146) {
						@Pc(661) int local661 = local146 - local467;
						local15.method6895(this.anInterface5_4.method7768((float) local461), 1.0F, this.anInterface5_4.method7774((float) local661));
						this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
						local10.method6895((float) local461, 0.0F, (float) local661);
						local10.TA(local467, local226, 0);
						this.aClass4_Sub2_20.method7306();
						this.aClass4_Sub2_20.method7264();
					}
				}
			}
		}
		this.aClass4_Sub2_20.method7290();
		this.aClass4_Sub2_20.method7277(1, Static226.aClass27_1);
		this.aClass4_Sub2_20.method7330(Static226.aClass27_1, 1);
	}

	@OriginalMember(owner = "client!un", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt8667 + this.anInt8682 + this.anInt8676;
	}

	@OriginalMember(owner = "client!un", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass4_Sub2_20.v(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method7595(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!un", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!un", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt8679 + this.anInt8673 + this.anInt8671;
	}

	@OriginalMember(owner = "client!un", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class128_Sub3 local8 = this.aClass4_Sub2_20.method7338();
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_20.method7349();
		this.anInterface5_4.method7757(this.aBoolean654 || this.aBoolean650 ? Static519.aClass136_7 : Static114.aClass136_8);
		this.aClass4_Sub2_20.method7245();
		this.aClass4_Sub2_20.method7316(this.anInterface5_4);
		this.aClass4_Sub2_20.method7228(arg8);
		this.aClass4_Sub2_20.method7279(arg6);
		this.aClass4_Sub2_20.method7277(1, Static319.aClass27_4);
		this.aClass4_Sub2_20.method7330(Static319.aClass27_4, 1);
		this.aClass4_Sub2_20.method7275(arg7);
		if (this.aBoolean652) {
			@Pc(70) float local70 = (float) this.EA();
			@Pc(74) float local74 = (float) this.ma();
			@Pc(81) float local81 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(101) float local101 = (arg5 - arg1) / local74;
			@Pc(107) float local107 = local94 * (float) this.anInt8676;
			@Pc(113) float local113 = (float) this.anInt8676 * local101;
			@Pc(119) float local119 = (float) this.anInt8673 * local81;
			@Pc(125) float local125 = local87 * (float) this.anInt8673;
			@Pc(132) float local132 = (float) this.anInt8671 * -local81;
			@Pc(139) float local139 = -local87 * (float) this.anInt8671;
			@Pc(146) float local146 = -local94 * (float) this.anInt8667;
			arg4 = local119 + arg4 + local146;
			arg3 = local139 + arg3 + local113;
			arg2 = local132 + arg2 + local107;
			arg1 = local113 + arg1 + local125;
			arg0 = local107 + local119 + arg0;
			@Pc(183) float local183 = -local101 * (float) this.anInt8667;
			arg5 = local183 + arg5 + local125;
		}
		local8.method6904(0.0F, arg5 - arg1, -arg0 + arg2, 0.0F, arg4 - arg0, 1.0F, 0.0F, arg3 - arg1, 0.0F);
		local8.method6898(arg0, 0.0F, arg1);
		local13.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7306();
		this.aClass4_Sub2_20.method7264();
		this.aClass4_Sub2_20.method7290();
		this.aClass4_Sub2_20.method7277(1, Static226.aClass27_1);
		this.aClass4_Sub2_20.method7330(Static226.aClass27_1, 1);
	}

	@OriginalMember(owner = "client!un", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class128_Sub3 local8 = this.aClass4_Sub2_20.method7338();
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_20.method7349();
		this.anInterface5_4.method7757(this.aBoolean654 || this.aBoolean650 ? Static519.aClass136_7 : Static114.aClass136_8);
		this.aClass4_Sub2_20.method7245();
		this.aClass4_Sub2_20.method7316(this.anInterface5_4);
		this.aClass4_Sub2_20.method7228(arg6);
		this.aClass4_Sub2_20.method7279(arg4);
		this.aClass4_Sub2_20.method7277(1, Static319.aClass27_4);
		this.aClass4_Sub2_20.method7330(Static319.aClass27_4, 1);
		this.aClass4_Sub2_20.method7275(arg5);
		local13.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
		if (this.aBoolean652) {
			arg2 = this.anInt8679 * arg2 / this.EA();
			arg3 = this.anInt8682 * arg3 / this.ma();
			arg0 += this.anInt8673 * arg2 / this.anInt8679;
			arg1 += arg3 * this.anInt8676 / this.anInt8682;
		}
		local8.method6895((float) arg3, 0.0F, (float) arg2);
		local8.TA(arg0, arg1, 0);
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7306();
		this.aClass4_Sub2_20.method7264();
		this.aClass4_Sub2_20.method7290();
		this.aClass4_Sub2_20.method7277(1, Static226.aClass27_1);
		this.aClass4_Sub2_20.method7330(Static226.aClass27_1, 1);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt8679;
	}

	@OriginalMember(owner = "client!un", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.anInt8682;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII[III)V")
	private void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface5_4.method7773(arg4, arg2, arg0, arg5, arg3, arg1);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7715(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class128_Sub3 local8 = this.aClass4_Sub2_20.method7338();
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_20.method7349();
		@Pc(16) Class28_Sub2 local16 = (Class28_Sub2) arg6;
		@Pc(19) Interface5 local19 = local16.anInterface5_2;
		this.anInterface5_4.method7757(Static114.aClass136_8);
		this.aClass4_Sub2_20.method7245();
		this.aClass4_Sub2_20.method7316(this.anInterface5_4);
		this.aClass4_Sub2_20.method7228(1);
		this.aClass4_Sub2_20.method7279(1);
		if (this.aBoolean652) {
			@Pc(85) float local85 = (float) this.anInt8679 / (float) this.EA();
			@Pc(93) float local93 = (float) this.anInt8682 / (float) this.ma();
			local8.method6904(0.0F, (arg5 - arg1) * local93, local85 * (arg2 - arg0), 0.0F, (arg4 - arg0) * local93, 1.0F, 0.0F, (arg3 - arg1) * local85, 0.0F);
			local8.method6898(local85 * ((float) this.anInt8673 + arg0), 0.0F, local93 * (arg1 + (float) this.anInt8676));
		} else {
			local8.method6904(0.0F, arg5 - arg1, arg2 - arg0, 0.0F, arg4 - arg0, 1.0F, 0.0F, arg3 - arg1, 0.0F);
			local8.method6898(arg0, 0.0F, arg1);
		}
		local13.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7339(1);
		this.aClass4_Sub2_20.method7316(local19);
		this.aClass4_Sub2_20.method7270(Static459.aClass246_5, Static428.aClass246_3);
		this.aClass4_Sub2_20.method7277(0, Static226.aClass27_1);
		@Pc(192) Class128_Sub3 local192 = this.aClass4_Sub2_20.method7349();
		local192.EA(local8);
		local192.TA(-arg7, -arg8, 0);
		local192.method6906(1.0F, local19.method7768(1.0F), local19.method7774(1.0F));
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7306();
		this.aClass4_Sub2_20.method7264();
		this.aClass4_Sub2_20.method7290();
		this.aClass4_Sub2_20.method7277(0, Static360.aClass27_5);
		this.aClass4_Sub2_20.method7270(Static459.aClass246_5, Static459.aClass246_5);
		this.aClass4_Sub2_20.method7316(null);
		this.aClass4_Sub2_20.method7339(0);
		this.aClass4_Sub2_20.method7290();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class28_Sub2 local6 = (Class28_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt8673;
		@Pc(14) Interface5 local14 = local6.anInterface5_2;
		@Pc(19) int local19 = arg1 + this.anInt8676;
		this.anInterface5_4.method7757(Static519.aClass136_7);
		this.aClass4_Sub2_20.method7245();
		this.aClass4_Sub2_20.method7316(this.anInterface5_4);
		this.aClass4_Sub2_20.method7228(1);
		this.aClass4_Sub2_20.method7279(1);
		@Pc(49) Class128_Sub3 local49 = this.aClass4_Sub2_20.method7338();
		local49.method6895((float) this.anInt8682, 0.0F, (float) this.anInt8679);
		local49.TA(local11, local19, 0);
		this.aClass4_Sub2_20.method7306();
		@Pc(73) Class128_Sub3 local73 = this.aClass4_Sub2_20.method7349();
		local73.method6895(this.anInterface5_4.method7768((float) this.anInt8682), 1.0F, this.anInterface5_4.method7774((float) this.anInt8679));
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7339(1);
		this.aClass4_Sub2_20.method7316(local14);
		this.aClass4_Sub2_20.method7270(Static459.aClass246_5, Static428.aClass246_3);
		this.aClass4_Sub2_20.method7277(0, Static226.aClass27_1);
		@Pc(123) Class128_Sub3 local123 = this.aClass4_Sub2_20.method7349();
		local123.method6895(local14.method7768((float) this.anInt8682), 1.0F, local14.method7774((float) this.anInt8679));
		local123.method6898(local14.method7774((float) (local11 - arg3)), 0.0F, local14.method7768((float) (local19 - arg4)));
		this.aClass4_Sub2_20.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_20.method7264();
		this.aClass4_Sub2_20.method7290();
		this.aClass4_Sub2_20.method7277(0, Static360.aClass27_5);
		this.aClass4_Sub2_20.method7270(Static459.aClass246_5, Static459.aClass246_5);
		this.aClass4_Sub2_20.method7316(null);
		this.aClass4_Sub2_20.method7339(0);
		this.aClass4_Sub2_20.method7290();
	}
}
