import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class54_Sub4 extends Class54 {

	@OriginalMember(owner = "client!rq", name = "w", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_18;

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "Lclient!pm;")
	private final Interface17 anInterface17_4;

	@OriginalMember(owner = "client!rq", name = "v", descriptor = "Z")
	private final boolean aBoolean611;

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "Lclient!su;")
	private final Interface19 anInterface19_15;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!mj;Lclient!ho;[Lclient!qo;Z)V")
	public Class54_Sub4(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class279[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass45_Sub2_18 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class279 local15 = arg2[local10];
			if (local15.anInt7340 > local8) {
				local8 = local15.anInt7340;
			}
			if (local15.anInt7341 > local8) {
				local8 = local15.anInt7341;
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
			@Pc(51) Class279 local51 = arg2[local46];
			local54 = local51.anInt7340;
			@Pc(57) int local57 = local51.anInt7341;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray79 == null) {
				local83 = local51.aByteArray80;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray79;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method4955(Static471.aClass298_15, Static213.aClass314_19)) {
			this.anInterface17_4 = arg0.method5013(local37, local44, local37, Static213.aClass314_19, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface17_4 = arg0.method4904(false, local37, local37, local162);
		}
		this.aBoolean611 = true;
		this.anInterface17_4.method6963(Static347.aClass71_8);
		this.anInterface19_15 = arg0.method5009(false);
		this.anInterface19_15.method6255(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface19_15.method6252();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass45_Sub2_18.method4901(local373);
				@Pc(391) float local391 = this.anInterface17_4.method6970((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface17_4.method6972((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class279 local408 = arg2[local63];
					local75 = local408.anInt7340;
					local77 = local408.anInt7341;
					@Pc(417) int local417 = local408.anInt7338;
					local85 = local408.anInt7339;
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
				if (this.anInterface19_15.method6251()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7794(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class81 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!rq", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass45_Sub2_18.method4899();
		this.aClass45_Sub2_18.method4926(this.anInterface17_4);
		if (this.aBoolean611 || arg4) {
			this.aClass45_Sub2_18.method4921(Static19.aClass307_1, Static534.aClass307_7);
			this.aClass45_Sub2_18.method4953(0, Static62.aClass108_1);
			this.aClass45_Sub2_18.method4912(arg3);
		} else {
			this.aClass45_Sub2_18.method4921(Static534.aClass307_7, Static534.aClass307_7);
		}
		@Pc(43) Class11_Sub1 local43 = this.aClass45_Sub2_18.method4960();
		local43.NA(arg1, arg2, 0);
		this.aClass45_Sub2_18.method4992();
		this.aClass45_Sub2_18.method4910(this.anInterface19_15, 0);
		this.aClass45_Sub2_18.method4957(this.aClass45_Sub2_18.aClass7_20);
		this.aClass45_Sub2_18.method4927(Static24.aClass40_2, arg0 * 4, 2);
		if (this.aBoolean611 || arg4) {
			this.aClass45_Sub2_18.method4953(0, Static164.aClass108_3);
		}
	}
}
