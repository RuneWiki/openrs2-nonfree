import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_18;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "Lclient!oga;")
	private final Interface21 anInterface21_6;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "Z")
	private final boolean aBoolean708;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "Lclient!hl;")
	private final Interface10 anInterface10_16;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!pj;Lclient!ie;[Lclient!us;Z)V")
	public Class38_Sub4(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class356[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass137_Sub1_18 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class356 local15 = arg2[local10];
			if (local15.anInt10343 > local8) {
				local8 = local15.anInt10343;
			}
			if (local15.anInt10341 > local8) {
				local8 = local15.anInt10341;
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
			@Pc(51) Class356 local51 = arg2[local46];
			local54 = local51.anInt10343;
			@Pc(57) int local57 = local51.anInt10341;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray126 == null) {
				local83 = local51.aByteArray127;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray126;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method8087(Static202.aClass363_3, Static47.aClass36_5)) {
			this.anInterface21_6 = arg0.method8030(local37, local37, local44, false, Static202.aClass363_3);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface21_6 = arg0.method7982(false, local37, local162, local37);
		}
		this.aBoolean708 = true;
		this.anInterface21_6.method9087(Static361.aClass334_7);
		this.anInterface10_16 = arg0.method7963(false);
		this.anInterface10_16.method3994(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface10_16.method3996();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass137_Sub1_18.method8079(local373);
				@Pc(391) float local391 = this.anInterface21_6.method9037((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface21_6.method9032((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class356 local408 = arg2[local63];
					local75 = local408.anInt10343;
					local77 = local408.anInt10341;
					@Pc(417) int local417 = local408.anInt10342;
					local85 = local408.anInt10340;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.c()) {
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
				if (this.anInterface10_16.method3995()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8986(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!tt", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass137_Sub1_18.method8004();
		this.aClass137_Sub1_18.method8007(this.anInterface21_6);
		if (this.aBoolean708 || arg4) {
			this.aClass137_Sub1_18.method7969(Static461.aClass87_5, Static575.aClass87_7);
			this.aClass137_Sub1_18.method8069(0, Static490.aClass169_6);
			this.aClass137_Sub1_18.method8048(arg3);
		} else {
			this.aClass137_Sub1_18.method7969(Static461.aClass87_5, Static461.aClass87_5);
		}
		@Pc(43) Class26_Sub1 local43 = this.aClass137_Sub1_18.method8006();
		local43.method6457(arg1, arg2, 0);
		this.aClass137_Sub1_18.method8036();
		this.aClass137_Sub1_18.method8067(0, this.anInterface10_16);
		this.aClass137_Sub1_18.method8000(this.aClass137_Sub1_18.aClass201_23);
		this.aClass137_Sub1_18.method8072(arg0 * 4, Static337.aClass54_4, 2);
		if (this.aBoolean708 || arg4) {
			this.aClass137_Sub1_18.method8069(0, Static201.aClass169_3);
		}
	}
}
