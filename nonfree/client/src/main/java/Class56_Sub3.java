import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_16;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!ada;")
	private final Interface1 anInterface1_6;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "Z")
	private final boolean aBoolean627;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Lclient!oda;")
	private final Interface19 anInterface19_13;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!wg;Lclient!bq;[Lclient!cr;Z)V")
	public Class56_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class51[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass33_Sub2_16 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class51 local15 = arg2[local10];
			if (local15.anInt1657 > local8) {
				local8 = local15.anInt1657;
			}
			if (local15.anInt1661 > local8) {
				local8 = local15.anInt1661;
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
			@Pc(51) Class51 local51 = arg2[local46];
			local54 = local51.anInt1657;
			@Pc(57) int local57 = local51.anInt1661;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray22 == null) {
				local83 = local51.aByteArray23;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray22;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method8165(Static111.aClass79_7, Static360.aClass276_15)) {
			this.anInterface1_6 = arg0.method8174(local37, false, local44, Static360.aClass276_15, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface1_6 = arg0.method8273(false, local37, local37, local162);
		}
		this.aBoolean627 = true;
		this.anInterface1_6.method8612(Static248.aClass198_7);
		this.anInterface19_13 = arg0.method8157(false);
		this.anInterface19_13.method6567(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface19_13.method6566();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass33_Sub2_16.method8168(local373);
				@Pc(391) float local391 = this.anInterface1_6.method8627((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface1_6.method8631((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class51 local408 = arg2[local63];
					local75 = local408.anInt1657;
					local77 = local408.anInt1661;
					@Pc(417) int local417 = local408.anInt1662;
					local85 = local408.anInt1659;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.b()) {
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
					} else {
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
					}
				}
				local381.c();
				if (this.anInterface19_13.method6568()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass33_Sub2_16.method8166();
		this.aClass33_Sub2_16.method8159(this.anInterface1_6);
		if (this.aBoolean627 || arg4) {
			this.aClass33_Sub2_16.method8280(Static435.aClass91_3, Static489.aClass91_4);
			this.aClass33_Sub2_16.method8239(0, Static228.aClass230_2);
			this.aClass33_Sub2_16.method8208(arg3);
		} else {
			this.aClass33_Sub2_16.method8280(Static489.aClass91_4, Static489.aClass91_4);
		}
		@Pc(43) Class92_Sub1 local43 = this.aClass33_Sub2_16.method8172();
		local43.method3854(arg1, arg2, 0);
		this.aClass33_Sub2_16.method8232();
		this.aClass33_Sub2_16.method8175(this.anInterface19_13, 0);
		this.aClass33_Sub2_16.method8179(this.aClass33_Sub2_16.aClass247_17);
		this.aClass33_Sub2_16.method8204(Static454.aClass194_9, arg0 * 4, 2);
		if (this.aBoolean627 || arg4) {
			this.aClass33_Sub2_16.method8239(0, Static41.aClass230_1);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
