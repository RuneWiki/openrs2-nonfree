import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!br", name = "x", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "Lclient!eea;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "Lclient!rq;")
	private final Interface16 anInterface16_3;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!bda;Lclient!fc;[Lclient!dp;Z)V")
	public Class36_Sub1(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class70[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass4_Sub2_1 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class70 local15 = arg2[local10];
			if (local15.anInt2012 > local8) {
				local8 = local15.anInt2012;
			}
			if (local15.anInt2013 > local8) {
				local8 = local15.anInt2013;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(54) int local54;
		@Pc(63) int local63;
		@Pc(75) int local75;
		@Pc(77) int local77;
		@Pc(85) int local85;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class70 local51 = arg2[local46];
			local54 = local51.anInt2012;
			@Pc(57) int local57 = local51.anInt2013;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray18 == null) {
				local83 = local51.aByteArray19;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray18;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7308(Static517.aClass308_15, Static504.aClass110_22)) {
			this.anInterface5_1 = arg0.method7347(local37, local44, false, Static504.aClass110_22, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface5_1 = arg0.method7271(local162, local37, local37, false);
		}
		this.aBoolean105 = true;
		this.anInterface5_1.method7757(Static519.aClass136_7);
		this.anInterface16_3 = arg0.method7250(false);
		this.anInterface16_3.method7616(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface16_3.method7613();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass4_Sub2_1.method7263(local373);
				@Pc(391) float local391 = this.anInterface5_1.method7774((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface5_1.method7768((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class70 local408 = arg2[local63];
					local75 = local408.anInt2012;
					local77 = local408.anInt2013;
					@Pc(417) int local417 = local408.anInt2010;
					local85 = local408.anInt2011;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.a()) {
						local381.b((float) local85);
						local381.b((float) local417);
						local381.b(0.0F);
						local381.b(local438);
						local381.b(local442);
						local381.b((float) local85);
						local381.b((float) (local417 + local75));
						local381.b(0.0F);
						local381.b(local438);
						local381.b(local456);
						local381.b((float) (local85 + local77));
						local381.b((float) (local417 + local75));
						local381.b(0.0F);
						local381.b(local449);
						local381.b(local456);
						local381.b((float) (local85 + local77));
						local381.b((float) local417);
						local381.b(0.0F);
						local381.b(local449);
						local381.b(local442);
					} else {
						local381.a((float) local85);
						local381.a((float) local417);
						local381.a(0.0F);
						local381.a(local438);
						local381.a(local442);
						local381.a((float) local85);
						local381.a((float) (local417 + local75));
						local381.a(0.0F);
						local381.a(local438);
						local381.a(local456);
						local381.a((float) (local85 + local77));
						local381.a((float) (local417 + local75));
						local381.a(0.0F);
						local381.a(local449);
						local381.a(local456);
						local381.a((float) (local85 + local77));
						local381.a((float) local417);
						local381.a(0.0F);
						local381.a(local449);
						local381.a(local442);
					}
				}
				local381.b();
				if (this.anInterface16_3.method7614()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7956(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!br", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass4_Sub2_1.method7286();
		this.aClass4_Sub2_1.method7316(this.anInterface5_1);
		if (this.aBoolean105 || arg4) {
			this.aClass4_Sub2_1.method7270(Static459.aClass246_5, Static428.aClass246_3);
			this.aClass4_Sub2_1.method7277(0, Static319.aClass27_4);
			this.aClass4_Sub2_1.method7275(arg3);
		} else {
			this.aClass4_Sub2_1.method7270(Static428.aClass246_3, Static428.aClass246_3);
		}
		@Pc(43) Class128_Sub3 local43 = this.aClass4_Sub2_1.method7338();
		local43.oa(arg1, arg2, 0);
		this.aClass4_Sub2_1.method7306();
		this.aClass4_Sub2_1.method7268(this.aClass4_Sub2_1.aClass310_17);
		this.aClass4_Sub2_1.method7251(this.anInterface16_3, 0);
		this.aClass4_Sub2_1.method7322(Static57.aClass263_3, 2, arg0 * 4);
		if (this.aBoolean105 || arg4) {
			this.aClass4_Sub2_1.method7277(0, Static360.aClass27_5);
		}
	}
}
