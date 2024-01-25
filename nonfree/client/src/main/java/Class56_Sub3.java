import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!su", name = "z", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_14;

	@OriginalMember(owner = "client!su", name = "B", descriptor = "Lclient!sd;")
	private final Interface20 anInterface20_4;

	@OriginalMember(owner = "client!su", name = "y", descriptor = "Z")
	private final boolean aBoolean551;

	@OriginalMember(owner = "client!su", name = "A", descriptor = "Lclient!vp;")
	private final Interface23 anInterface23_11;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!sv;Lclient!il;[Lclient!me;Z)V")
	public Class56_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class196[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass121_Sub2_14 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class196 local15 = arg2[local10];
			if (local15.anInt5517 > local8) {
				local8 = local15.anInt5517;
			}
			if (local15.anInt5516 > local8) {
				local8 = local15.anInt5516;
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
			@Pc(51) Class196 local51 = arg2[local46];
			local54 = local51.anInt5517;
			@Pc(57) int local57 = local51.anInt5516;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray67 == null) {
				local83 = local51.aByteArray68;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray67;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7169(Static490.aClass214_14, Static108.aClass82_8)) {
			this.anInterface20_4 = arg0.method7251(local37, local44, local37, false, Static490.aClass214_14);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface20_4 = arg0.method7248(local37, local37, local162, false);
		}
		this.aBoolean551 = true;
		this.anInterface20_4.method7527(Static188.aClass301_6);
		this.anInterface23_11 = arg0.method7201(false);
		this.anInterface23_11.method7571(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface23_11.method7569();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass121_Sub2_14.method7200(local373);
				@Pc(391) float local391 = this.anInterface20_4.method7534((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface20_4.method7533((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class196 local408 = arg2[local63];
					local75 = local408.anInt5517;
					local77 = local408.anInt5516;
					@Pc(417) int local417 = local408.anInt5515;
					local85 = local408.anInt5514;
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
				local381.c();
				if (this.anInterface23_11.method7563()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7882(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class16 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!su", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass121_Sub2_14.method7217();
		this.aClass121_Sub2_14.method7167(this.anInterface20_4);
		if (this.aBoolean551 || arg4) {
			this.aClass121_Sub2_14.method7198(Static241.aClass59_1, Static526.aClass59_4);
			this.aClass121_Sub2_14.method7270(Static257.aClass305_4, 0);
			this.aClass121_Sub2_14.method7166(arg3);
		} else {
			this.aClass121_Sub2_14.method7198(Static526.aClass59_4, Static526.aClass59_4);
		}
		@Pc(43) Class34_Sub3 local43 = this.aClass121_Sub2_14.method7275();
		local43.GA(arg1, arg2, 0);
		this.aClass121_Sub2_14.method7233();
		this.aClass121_Sub2_14.method7297(0, this.anInterface23_11);
		this.aClass121_Sub2_14.method7263(this.aClass121_Sub2_14.aClass258_16);
		this.aClass121_Sub2_14.method7298(arg0 * 4, Static221.aClass107_6, 2);
		if (this.aBoolean551 || arg4) {
			this.aClass121_Sub2_14.method7270(Static67.aClass305_1, 0);
		}
	}
}
