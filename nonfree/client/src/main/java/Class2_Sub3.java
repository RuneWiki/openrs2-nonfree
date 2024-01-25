import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	private int anInt8948 = 0;

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
	private int anInt8954 = 0;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
	private int anInt8951 = 0;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
	private int anInt8965 = 0;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	private final int anInt8950;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_20;

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
	private final int anInt8963;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "Lclient!gq;")
	private final Interface3 anInterface3_4;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "Z")
	private final boolean aBoolean624;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Z")
	private final boolean aBoolean625;

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "Z")
	private final boolean aBoolean627;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "Z")
	private final boolean aBoolean628;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!re;IIZ)V")
	public Class2_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8950 = arg1;
		this.aClass122_Sub2_20 = arg0;
		this.anInt8963 = arg2;
		this.anInterface3_4 = arg0.method5607(Static431.aClass264_15, arg3 ? Static542.aClass292_17 : Static252.aClass292_9, arg2, arg1);
		this.aBoolean624 = arg1 != this.anInterface3_4.method7315();
		this.aBoolean625 = arg2 != this.anInterface3_4.method7319();
		this.aBoolean627 = !this.aBoolean624 && this.anInterface3_4.method7316();
		this.aBoolean628 = !this.aBoolean625 && this.anInterface3_4.method7316();
	}

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!re;II[III)V")
	public Class2_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8963 = arg2;
		this.anInt8950 = arg1;
		this.aClass122_Sub2_20 = arg0;
		this.anInterface3_4 = arg0.method5630(false, arg2, arg4, arg5, arg1, arg3);
		this.aBoolean624 = this.anInterface3_4.method7315() != arg1;
		this.aBoolean625 = arg2 != this.anInterface3_4.method7319();
		this.aBoolean627 = !this.aBoolean624 && this.anInterface3_4.method7316();
		this.aBoolean628 = !this.aBoolean625 && this.anInterface3_4.method7316();
	}

	@OriginalMember(owner = "client!wda", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wda", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class118_Sub3 local8 = this.aClass122_Sub2_20.method5654();
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_20.method5574();
		@Pc(18) int local18 = arg1 + this.anInt8965;
		@Pc(23) int local23 = arg0 + this.anInt8954;
		this.anInterface3_4.method7302(Static119.aClass113_4);
		this.aClass122_Sub2_20.method5658();
		this.aClass122_Sub2_20.method5651(this.anInterface3_4);
		this.aClass122_Sub2_20.method5650(arg4);
		this.aClass122_Sub2_20.method5561(arg2);
		this.aClass122_Sub2_20.method5575(1, Static312.aClass181_4);
		this.aClass122_Sub2_20.method5585(Static312.aClass181_4, 1);
		this.aClass122_Sub2_20.method5634(arg3);
		local8.method6977((float) this.anInt8963, (float) this.anInt8950, 0.0F);
		local8.TA(local23, local18, 0);
		local13.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5638();
		this.aClass122_Sub2_20.method5606();
		this.aClass122_Sub2_20.method5614();
		this.aClass122_Sub2_20.method5575(1, Static295.aClass181_3);
		this.aClass122_Sub2_20.method5585(Static295.aClass181_3, 1);
	}

	@OriginalMember(owner = "client!wda", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class118_Sub3 local8 = this.aClass122_Sub2_20.method5654();
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_20.method5574();
		this.anInterface3_4.method7302(this.aBoolean624 || this.aBoolean625 ? Static119.aClass113_4 : Static402.aClass113_9);
		this.aClass122_Sub2_20.method5658();
		this.aClass122_Sub2_20.method5651(this.anInterface3_4);
		this.aClass122_Sub2_20.method5650(arg6);
		this.aClass122_Sub2_20.method5561(arg4);
		this.aClass122_Sub2_20.method5575(1, Static312.aClass181_4);
		this.aClass122_Sub2_20.method5585(Static312.aClass181_4, 1);
		this.aClass122_Sub2_20.method5634(arg5);
		local13.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
		if (this.aBoolean626) {
			arg2 = this.anInt8950 * arg2 / this.EA();
			arg3 = this.anInt8963 * arg3 / this.ma();
			arg0 += this.anInt8954 * arg2 / this.anInt8950;
			arg1 += this.anInt8965 * arg3 / this.anInt8963;
		}
		local8.method6977((float) arg3, (float) arg2, 0.0F);
		local8.TA(arg0, arg1, 0);
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5638();
		this.aClass122_Sub2_20.method5606();
		this.aClass122_Sub2_20.method5614();
		this.aClass122_Sub2_20.method5575(1, Static295.aClass181_3);
		this.aClass122_Sub2_20.method5585(Static295.aClass181_3, 1);
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt8950;
	}

	@OriginalMember(owner = "client!wda", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt8951 + this.anInt8963 + this.anInt8965;
	}

	@OriginalMember(owner = "client!wda", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8951 = arg3;
		this.anInt8954 = arg0;
		this.anInt8948 = arg2;
		this.anInt8965 = arg1;
		this.aBoolean626 = this.anInt8954 != 0 || this.anInt8965 != 0 || this.anInt8948 != 0 || this.anInt8951 != 0;
	}

	@OriginalMember(owner = "client!wda", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class118_Sub3 local8 = this.aClass122_Sub2_20.method5654();
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_20.method5574();
		this.anInterface3_4.method7302(this.aBoolean624 || this.aBoolean625 ? Static119.aClass113_4 : Static402.aClass113_9);
		this.aClass122_Sub2_20.method5658();
		this.aClass122_Sub2_20.method5651(this.anInterface3_4);
		this.aClass122_Sub2_20.method5650(arg8);
		this.aClass122_Sub2_20.method5561(arg6);
		this.aClass122_Sub2_20.method5575(1, Static312.aClass181_4);
		this.aClass122_Sub2_20.method5585(Static312.aClass181_4, 1);
		this.aClass122_Sub2_20.method5634(arg7);
		if (this.aBoolean626) {
			@Pc(70) float local70 = (float) this.EA();
			@Pc(74) float local74 = (float) this.ma();
			@Pc(81) float local81 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(100) float local100 = (arg5 - arg1) / local74;
			@Pc(106) float local106 = local94 * (float) this.anInt8965;
			@Pc(112) float local112 = (float) this.anInt8965 * local100;
			@Pc(118) float local118 = local81 * (float) this.anInt8954;
			@Pc(124) float local124 = (float) this.anInt8954 * local87;
			@Pc(131) float local131 = (float) this.anInt8948 * -local81;
			@Pc(138) float local138 = (float) this.anInt8948 * -local87;
			@Pc(145) float local145 = (float) this.anInt8951 * -local94;
			arg4 = local145 + arg4 + local118;
			arg0 = local106 + local118 + arg0;
			arg1 = arg1 + local124 + local112;
			arg2 = local131 + arg2 + local106;
			@Pc(176) float local176 = -local100 * (float) this.anInt8951;
			arg3 = arg3 + local138 + local112;
			arg5 = local124 + arg5 + local176;
		}
		local8.method6970(0.0F, arg2 - arg0, arg3 - arg1, 1.0F, arg4 - arg0, 0.0F, 0.0F, 0.0F, arg5 - arg1);
		local8.method6985(arg1, arg0, 0.0F);
		local13.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5638();
		this.aClass122_Sub2_20.method5606();
		this.aClass122_Sub2_20.method5614();
		this.aClass122_Sub2_20.method5575(1, Static295.aClass181_3);
		this.aClass122_Sub2_20.method5585(Static295.aClass181_3, 1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7362(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class40 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class118_Sub3 local8 = this.aClass122_Sub2_20.method5654();
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_20.method5574();
		@Pc(16) Class40_Sub1 local16 = (Class40_Sub1) arg6;
		@Pc(19) Interface3 local19 = local16.anInterface3_1;
		this.anInterface3_4.method7302(Static402.aClass113_9);
		this.aClass122_Sub2_20.method5658();
		this.aClass122_Sub2_20.method5651(this.anInterface3_4);
		this.aClass122_Sub2_20.method5650(1);
		this.aClass122_Sub2_20.method5561(1);
		if (this.aBoolean626) {
			@Pc(85) float local85 = (float) this.anInt8950 / (float) this.EA();
			@Pc(93) float local93 = (float) this.anInt8963 / (float) this.ma();
			local8.method6970(0.0F, local85 * (arg2 - arg0), local85 * (arg3 - arg1), 1.0F, local93 * (arg4 - arg0), 0.0F, 0.0F, 0.0F, local93 * (arg5 - arg1));
			local8.method6985(((float) this.anInt8965 + arg1) * local93, local85 * ((float) this.anInt8954 + arg0), 0.0F);
		} else {
			local8.method6970(0.0F, arg2 - arg0, -arg1 + arg3, 1.0F, arg4 - arg0, 0.0F, 0.0F, 0.0F, arg5 - arg1);
			local8.method6985(arg1, arg0, 0.0F);
		}
		local13.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5644(1);
		this.aClass122_Sub2_20.method5651(local19);
		this.aClass122_Sub2_20.method5605(Static486.aClass271_5, Static449.aClass271_4);
		this.aClass122_Sub2_20.method5575(0, Static295.aClass181_3);
		@Pc(192) Class118_Sub3 local192 = this.aClass122_Sub2_20.method5574();
		local192.EA(local8);
		local192.TA(-arg7, -arg8, 0);
		local192.method6972(local19.method7320(1.0F), 1.0F, local19.method7317(1.0F));
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5638();
		this.aClass122_Sub2_20.method5606();
		this.aClass122_Sub2_20.method5614();
		this.aClass122_Sub2_20.method5575(0, Static162.aClass181_2);
		this.aClass122_Sub2_20.method5605(Static449.aClass271_4, Static449.aClass271_4);
		this.aClass122_Sub2_20.method5651(null);
		this.aClass122_Sub2_20.method5644(0);
		this.aClass122_Sub2_20.method5614();
	}

	@OriginalMember(owner = "client!wda", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt8954 + this.anInt8950 + this.anInt8948;
	}

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class118_Sub3 local10 = this.aClass122_Sub2_20.method5654();
		@Pc(15) Class118_Sub3 local15 = this.aClass122_Sub2_20.method5574();
		this.anInterface3_4.method7302(Static119.aClass113_4);
		this.aClass122_Sub2_20.method5658();
		this.aClass122_Sub2_20.method5651(this.anInterface3_4);
		this.aClass122_Sub2_20.method5650(arg6);
		this.aClass122_Sub2_20.method5561(arg4);
		this.aClass122_Sub2_20.method5575(1, Static312.aClass181_4);
		this.aClass122_Sub2_20.method5585(Static312.aClass181_4, 1);
		this.aClass122_Sub2_20.method5634(arg5);
		@Pc(73) boolean local73 = this.aBoolean628 && this.anInt8965 == 0 && this.anInt8951 == 0;
		@Pc(86) boolean local86 = this.aBoolean627 && this.anInt8954 == 0 && this.anInt8948 == 0;
		if (local73 & local86) {
			local15.method6977(this.anInterface3_4.method7317((float) arg3), this.anInterface3_4.method7320((float) arg2), 1.0F);
			local10.method6977((float) arg3, (float) arg2, 0.0F);
			local10.TA(arg0, arg1, 0);
			this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
			this.aClass122_Sub2_20.method5638();
			this.aClass122_Sub2_20.method5606();
		} else {
			@Pc(96) int local96;
			@Pc(99) int local99;
			@Pc(126) int local126;
			@Pc(131) int local131;
			@Pc(178) int local178;
			if (local86) {
				local96 = arg1 + arg3;
				local99 = this.ma();
				local15.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) arg2), 1.0F);
				this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
				local126 = this.anInt8965 + arg1;
				for (local131 = this.anInt8963 + local126; local131 <= local96; local131 += local99) {
					local10.method6977((float) this.anInt8963, (float) arg2, 0.0F);
					local10.TA(arg0, local126, 0);
					this.aClass122_Sub2_20.method5638();
					local126 += local99;
					this.aClass122_Sub2_20.method5606();
				}
				if (local96 > local126) {
					local178 = local96 - local126;
					local15.method6977(this.anInterface3_4.method7317((float) local178), this.anInterface3_4.method7320((float) arg2), 1.0F);
					this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
					local10.method6977((float) local178, (float) arg2, 0.0F);
					local10.TA(arg0, local126, 0);
					this.aClass122_Sub2_20.method5638();
					this.aClass122_Sub2_20.method5606();
				}
			} else if (local73) {
				local96 = arg0 + arg2;
				local99 = this.EA();
				local15.method6977(this.anInterface3_4.method7317((float) arg3), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
				this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
				local126 = arg0 + this.anInt8954;
				for (local131 = this.anInt8950 + local126; local131 <= local96; local131 += local99) {
					local10.method6977((float) arg3, (float) this.anInt8950, 0.0F);
					local10.TA(local126, arg1, 0);
					this.aClass122_Sub2_20.method5638();
					local126 += local99;
					this.aClass122_Sub2_20.method5606();
				}
				if (local96 > local126) {
					local178 = local96 - local126;
					local15.method6977(this.anInterface3_4.method7317((float) arg3), this.anInterface3_4.method7320((float) local178), 1.0F);
					this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
					local10.method6977((float) arg3, (float) local178, 0.0F);
					local10.TA(local126, arg1, 0);
					this.aClass122_Sub2_20.method5638();
					this.aClass122_Sub2_20.method5606();
				}
			} else {
				local96 = arg1 + arg3;
				local99 = arg0 + arg2;
				local126 = this.EA();
				local131 = this.ma();
				local178 = arg1 + this.anInt8965;
				@Pc(282) int local282;
				@Pc(287) int local287;
				@Pc(335) int local335;
				for (@Pc(251) int local251 = local178 + this.anInt8963; local251 <= local96; local251 += local131) {
					local15.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
					this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
					local282 = arg0 + this.anInt8954;
					local287 = this.anInt8950 + local282;
					while (local99 >= local287) {
						local10.method6977((float) this.anInt8963, (float) this.anInt8950, 0.0F);
						local10.TA(local282, local178, 0);
						this.aClass122_Sub2_20.method5638();
						this.aClass122_Sub2_20.method5606();
						local287 += local126;
						local282 += local126;
					}
					if (local282 < local99) {
						local335 = local99 - local282;
						local15.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) local335), 1.0F);
						this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
						local10.method6977((float) this.anInt8963, (float) local335, 0.0F);
						local10.TA(local282, local178, 0);
						this.aClass122_Sub2_20.method5638();
						this.aClass122_Sub2_20.method5606();
					}
					local178 += local131;
				}
				if (local178 < local96) {
					local282 = local96 - local178;
					local15.method6977(this.anInterface3_4.method7317((float) local282), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
					this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
					local287 = this.anInt8954 + arg0;
					local335 = this.anInt8950 + local287;
					while (local335 <= local99) {
						local10.method6977((float) local282, (float) this.anInt8950, 0.0F);
						local10.TA(local287, local178, 0);
						this.aClass122_Sub2_20.method5638();
						this.aClass122_Sub2_20.method5606();
						local335 += local126;
						local287 += local126;
					}
					if (local287 < local99) {
						@Pc(483) int local483 = local99 - local287;
						local15.method6977(this.anInterface3_4.method7317((float) local282), this.anInterface3_4.method7320((float) local483), 1.0F);
						this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
						local10.method6977((float) local282, (float) local483, 0.0F);
						local10.TA(local287, local178, 0);
						this.aClass122_Sub2_20.method5638();
						this.aClass122_Sub2_20.method5606();
					}
				}
			}
		}
		this.aClass122_Sub2_20.method5614();
		this.aClass122_Sub2_20.method5575(1, Static295.aClass181_3);
		this.aClass122_Sub2_20.method5585(Static295.aClass181_3, 1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class40_Sub1 local6 = (Class40_Sub1) arg2;
		@Pc(9) Interface3 local9 = local6.anInterface3_1;
		@Pc(14) int local14 = arg0 + this.anInt8954;
		@Pc(19) int local19 = arg1 + this.anInt8965;
		this.anInterface3_4.method7302(Static119.aClass113_4);
		this.aClass122_Sub2_20.method5658();
		this.aClass122_Sub2_20.method5651(this.anInterface3_4);
		this.aClass122_Sub2_20.method5650(1);
		this.aClass122_Sub2_20.method5561(1);
		@Pc(49) Class118_Sub3 local49 = this.aClass122_Sub2_20.method5654();
		local49.method6977((float) this.anInt8963, (float) this.anInt8950, 0.0F);
		local49.TA(local14, local19, 0);
		this.aClass122_Sub2_20.method5638();
		@Pc(73) Class118_Sub3 local73 = this.aClass122_Sub2_20.method5574();
		local73.method6977(this.anInterface3_4.method7317((float) this.anInt8963), this.anInterface3_4.method7320((float) this.anInt8950), 1.0F);
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5644(1);
		this.aClass122_Sub2_20.method5651(local9);
		this.aClass122_Sub2_20.method5605(Static486.aClass271_5, Static449.aClass271_4);
		this.aClass122_Sub2_20.method5575(0, Static295.aClass181_3);
		@Pc(123) Class118_Sub3 local123 = this.aClass122_Sub2_20.method5574();
		local123.method6977(local9.method7317((float) this.anInt8963), local9.method7320((float) this.anInt8950), 1.0F);
		local123.method6985(local9.method7317((float) (local19 - arg4)), local9.method7320((float) (local14 - arg3)), 0.0F);
		this.aClass122_Sub2_20.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_20.method5606();
		this.aClass122_Sub2_20.method5614();
		this.aClass122_Sub2_20.method5575(0, Static162.aClass181_2);
		this.aClass122_Sub2_20.method5605(Static449.aClass271_4, Static449.aClass271_4);
		this.aClass122_Sub2_20.method5651(null);
		this.aClass122_Sub2_20.method5644(0);
		this.aClass122_Sub2_20.method5614();
	}

	@OriginalMember(owner = "client!wda", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass122_Sub2_20.v(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method7371(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII[III)V")
	private void method7371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface3_4.method7322(arg5, arg4, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.anInt8963;
	}
}
