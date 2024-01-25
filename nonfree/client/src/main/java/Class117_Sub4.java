import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class117_Sub4 extends Class117 {

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_18;

	@OriginalMember(owner = "client!rba", name = "w", descriptor = "Lclient!hi;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!rba", name = "x", descriptor = "Z")
	private final boolean aBoolean578;

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "Lclient!wl;")
	private final Interface24 anInterface24_12;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!cf;Lclient!daa;[Lclient!vw;Z)V")
	public Class117_Sub4(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class355[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass43_Sub1_18 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class355 local15 = arg2[local10];
			if (local15.anInt9162 > local8) {
				local8 = local15.anInt9162;
			}
			if (local15.anInt9165 > local8) {
				local8 = local15.anInt9165;
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
			@Pc(51) Class355 local51 = arg2[local46];
			local54 = local51.anInt9162;
			@Pc(57) int local57 = local51.anInt9165;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray105 == null) {
				local83 = local51.aByteArray104;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray105;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method4180(Static461.aClass292_14, Static563.aClass93_13)) {
			this.anInterface10_5 = arg0.method4285(local37, local44, local37, false, Static563.aClass93_13);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface10_5 = arg0.method4303(local37, local162, false, local37);
		}
		this.aBoolean578 = true;
		this.anInterface10_5.method7422(Static206.aClass123_7);
		this.anInterface24_12 = arg0.method4188(false);
		this.anInterface24_12.method4802(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface24_12.method4803();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass43_Sub1_18.method4233(local373);
				@Pc(391) float local391 = this.anInterface10_5.method6175((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface10_5.method6170((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class355 local408 = arg2[local63];
					local75 = local408.anInt9162;
					local77 = local408.anInt9165;
					@Pc(417) int local417 = local408.anInt9163;
					local85 = local408.anInt9161;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.c()) {
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
				local381.a();
				if (this.anInterface24_12.method4801()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class146 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!rba", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass43_Sub1_18.method4208();
		this.aClass43_Sub1_18.method4298(this.anInterface10_5);
		if (this.aBoolean578 || arg4) {
			this.aClass43_Sub1_18.method4253(Static587.aClass37_5, Static106.aClass37_2);
			this.aClass43_Sub1_18.method4251(0, Static88.aClass252_2);
			this.aClass43_Sub1_18.method4266(arg3);
		} else {
			this.aClass43_Sub1_18.method4253(Static587.aClass37_5, Static587.aClass37_5);
		}
		@Pc(43) Class109_Sub3 local43 = this.aClass43_Sub1_18.method4172();
		local43.NA(arg1, arg2, 0);
		this.aClass43_Sub1_18.method4287();
		this.aClass43_Sub1_18.method4181(0, this.anInterface24_12);
		this.aClass43_Sub1_18.method4196(this.aClass43_Sub1_18.aClass48_16);
		this.aClass43_Sub1_18.method4294(Static129.aClass319_2, arg0 * 4, 2);
		if (this.aBoolean578 || arg4) {
			this.aClass43_Sub1_18.method4251(0, Static74.aClass252_1);
		}
	}
}
