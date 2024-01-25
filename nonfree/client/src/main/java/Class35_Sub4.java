import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_15;

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "Lclient!gn;")
	private final Interface8 anInterface8_4;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "Lclient!wr;")
	private final Interface24 anInterface24_11;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!qq;Lclient!aga;[Lclient!tq;Z)V")
	public Class35_Sub4(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class318[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass12_Sub2_15 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class318 local15 = arg2[local10];
			if (local15.anInt8535 > local8) {
				local8 = local15.anInt8535;
			}
			if (local15.anInt8537 > local8) {
				local8 = local15.anInt8537;
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
			@Pc(51) Class318 local51 = arg2[local46];
			local54 = local51.anInt8535;
			@Pc(57) int local57 = local51.anInt8537;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray93 == null) {
				local83 = local51.aByteArray94;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray93;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6219(Static554.aClass340_14, Static257.aClass297_6)) {
			this.anInterface8_4 = arg0.method6217(Static257.aClass297_6, local37, local44, false, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface8_4 = arg0.method6229(local37, false, local37, local162);
		}
		this.aBoolean388 = true;
		this.anInterface8_4.method7669(Static324.aClass225_6);
		this.anInterface24_11 = arg0.method6176(false);
		this.anInterface24_11.method6518(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface24_11.method6519();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass12_Sub2_15.method6160(local373);
				@Pc(391) float local391 = this.anInterface8_4.method7326((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface8_4.method7325((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class318 local408 = arg2[local63];
					local75 = local408.anInt8535;
					local77 = local408.anInt8537;
					@Pc(417) int local417 = local408.anInt8534;
					local85 = local408.anInt8533;
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
				local381.a();
				if (this.anInterface24_11.method6520()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method4950(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!kp", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass12_Sub2_15.method6271();
		this.aClass12_Sub2_15.method6159(this.anInterface8_4);
		if (this.aBoolean388 || arg4) {
			this.aClass12_Sub2_15.method6241(Static9.aClass108_2, Static240.aClass108_5);
			this.aClass12_Sub2_15.method6179(Static135.aClass84_1, 0);
			this.aClass12_Sub2_15.method6259(arg3);
		} else {
			this.aClass12_Sub2_15.method6241(Static240.aClass108_5, Static240.aClass108_5);
		}
		@Pc(43) Class209_Sub2 local43 = this.aClass12_Sub2_15.method6245();
		local43.NA(arg1, arg2, 0);
		this.aClass12_Sub2_15.method6275();
		this.aClass12_Sub2_15.method6276(0, this.anInterface24_11);
		this.aClass12_Sub2_15.method6194(this.aClass12_Sub2_15.aClass331_19);
		this.aClass12_Sub2_15.method6167(2, Static450.aClass165_5, arg0 * 4);
		if (this.aBoolean388 || arg4) {
			this.aClass12_Sub2_15.method6179(Static587.aClass84_6, 0);
		}
	}
}
