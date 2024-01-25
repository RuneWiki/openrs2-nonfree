import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_10;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "Lclient!ug;")
	private final Interface24 anInterface24_2;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
	private final boolean aBoolean287;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "Lclient!fg;")
	private final Interface11 anInterface11_12;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ch;Lclient!qt;[Lclient!ffa;Z)V")
	public Class62_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class282 arg1, @OriginalArg(2) Class107[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass5_Sub1_10 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class107 local15 = arg2[local10];
			if (local15.anInt3008 > local8) {
				local8 = local15.anInt3008;
			}
			if (local15.anInt3006 > local8) {
				local8 = local15.anInt3006;
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
			@Pc(51) Class107 local51 = arg2[local46];
			local54 = local51.anInt3008;
			@Pc(57) int local57 = local51.anInt3006;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray29 == null) {
				local83 = local51.aByteArray28;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray29;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5602(Static355.aClass182_12, Static637.aClass376_16)) {
			this.anInterface24_2 = arg0.method5662(local37, local44, false, local37, Static355.aClass182_12);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface24_2 = arg0.method5633(false, local37, local37, local162);
		}
		this.aBoolean287 = true;
		this.anInterface24_2.method7472(Static313.aClass339_9);
		this.anInterface11_12 = arg0.method5649(false);
		this.anInterface11_12.method6373(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface11_12.method6374();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass5_Sub1_10.method5647(local373);
				@Pc(391) float local391 = this.anInterface24_2.method7476((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface24_2.method7482((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class107 local408 = arg2[local63];
					local75 = local408.anInt3008;
					local77 = local408.anInt3006;
					@Pc(417) int local417 = local408.anInt3003;
					local85 = local408.anInt3005;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.a()) {
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
				if (this.anInterface11_12.method6375()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8371(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!ho", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub1_10.method5612();
		this.aClass5_Sub1_10.method5609(this.anInterface24_2);
		if (this.aBoolean287 || arg4) {
			this.aClass5_Sub1_10.method5682(Static514.aClass374_5, Static314.aClass374_2);
			this.aClass5_Sub1_10.method5583(Static161.aClass9_3, 0);
			this.aClass5_Sub1_10.method5574(arg3);
		} else {
			this.aClass5_Sub1_10.method5682(Static314.aClass374_2, Static314.aClass374_2);
		}
		@Pc(43) Class39_Sub1 local43 = this.aClass5_Sub1_10.method5658();
		local43.method7240(arg1, arg2, 0);
		this.aClass5_Sub1_10.method5680();
		this.aClass5_Sub1_10.method5692(this.anInterface11_12, 0);
		this.aClass5_Sub1_10.method5610(this.aClass5_Sub1_10.aClass46_19);
		this.aClass5_Sub1_10.method5688(Static62.aClass292_6, 2, arg0 * 4);
		if (this.aBoolean287 || arg4) {
			this.aClass5_Sub1_10.method5583(Static333.aClass9_2, 0);
		}
	}
}
