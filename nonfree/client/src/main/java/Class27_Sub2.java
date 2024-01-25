import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!cia", name = "y", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_5;

	@OriginalMember(owner = "client!cia", name = "z", descriptor = "Lclient!oq;")
	private final Interface20 anInterface20_1;

	@OriginalMember(owner = "client!cia", name = "B", descriptor = "Z")
	private final boolean aBoolean139;

	@OriginalMember(owner = "client!cia", name = "x", descriptor = "Lclient!el;")
	private final Interface4 anInterface4_8;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lclient!ln;Lclient!ur;[Lclient!g;Z)V")
	public Class27_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class111[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass16_Sub1_5 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class111 local15 = arg2[local10];
			if (local15.anInt4053 > local8) {
				local8 = local15.anInt4053;
			}
			if (local15.anInt4054 > local8) {
				local8 = local15.anInt4054;
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
			@Pc(51) Class111 local51 = arg2[local46];
			local54 = local51.anInt4053;
			@Pc(57) int local57 = local51.anInt4054;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray28 == null) {
				local83 = local51.aByteArray27;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray28;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method3874(Static526.aClass366_11, Static258.aClass160_9)) {
			this.anInterface20_1 = arg0.method4005(local44, Static526.aClass366_11, local37, local37, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface20_1 = arg0.method3948(local162, local37, local37, false);
		}
		this.aBoolean139 = true;
		this.anInterface20_1.method8280(Static116.aClass277_4);
		this.anInterface4_8 = arg0.method3988(false);
		this.anInterface4_8.method6507(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface4_8.method6506();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass16_Sub1_5.method3981(local373);
				@Pc(391) float local391 = this.anInterface20_1.method6627((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface20_1.method6625((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class111 local408 = arg2[local63];
					local75 = local408.anInt4053;
					local77 = local408.anInt4054;
					@Pc(417) int local417 = local408.anInt4050;
					local85 = local408.anInt4055;
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
				local381.b();
				if (this.anInterface4_8.method6505()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6998(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!cia", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass16_Sub1_5.method3915();
		this.aClass16_Sub1_5.method3889(this.anInterface20_1);
		if (this.aBoolean139 || arg4) {
			this.aClass16_Sub1_5.method3924(Static402.aClass34_4, Static428.aClass34_5);
			this.aClass16_Sub1_5.method3946(0, Static190.aClass265_8);
			this.aClass16_Sub1_5.method3939(arg3);
		} else {
			this.aClass16_Sub1_5.method3924(Static428.aClass34_5, Static428.aClass34_5);
		}
		@Pc(43) Class54_Sub3 local43 = this.aClass16_Sub1_5.method3945();
		local43.method5128(arg1, arg2, 0);
		this.aClass16_Sub1_5.method3986();
		this.aClass16_Sub1_5.method3983(this.anInterface4_8, 0);
		this.aClass16_Sub1_5.method3967(this.aClass16_Sub1_5.aClass94_16);
		this.aClass16_Sub1_5.method3891(arg0 * 4, 2, Static573.aClass342_5);
		if (this.aBoolean139 || arg4) {
			this.aClass16_Sub1_5.method3946(0, Static625.aClass265_10);
		}
	}
}
