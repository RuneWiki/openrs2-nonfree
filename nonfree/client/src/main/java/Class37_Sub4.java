import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class37_Sub4 extends Class37 {

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_6;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Lclient!wk;")
	private final Interface27 anInterface27_2;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "Z")
	private final boolean aBoolean299;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Lclient!ia;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ij;Lclient!jl;[Lclient!hb;Z)V")
	public Class37_Sub4(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) Class139[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass13_Sub3_6 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class139 local15 = arg2[local10];
			if (local15.anInt3983 > local8) {
				local8 = local15.anInt3983;
			}
			if (local15.anInt3984 > local8) {
				local8 = local15.anInt3984;
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
			@Pc(51) Class139 local51 = arg2[local46];
			local54 = local51.anInt3983;
			@Pc(57) int local57 = local51.anInt3984;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray31 == null) {
				local83 = local51.aByteArray32;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray31;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method8293(Static210.aClass104_18, Static638.aClass381_15)) {
			this.anInterface27_2 = arg0.method8198(local44, Static210.aClass104_18, local37, local37, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface27_2 = arg0.method8257(false, local162, local37, local37);
		}
		this.aBoolean299 = true;
		this.anInterface27_2.method8818(Static397.aClass54_6);
		this.anInterface10_5 = arg0.method8200(false);
		this.anInterface10_5.method8450(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface10_5.method8449();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass13_Sub3_6.method8260(local373);
				@Pc(391) float local391 = this.anInterface27_2.method7127((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface27_2.method7133((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class139 local408 = arg2[local63];
					local75 = local408.anInt3983;
					local77 = local408.anInt3984;
					@Pc(417) int local417 = local408.anInt3980;
					local85 = local408.anInt3981;
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
				if (this.anInterface10_5.method8448()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6087(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!hf", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass13_Sub3_6.method8275();
		this.aClass13_Sub3_6.method8234(this.anInterface27_2);
		if (this.aBoolean299 || arg4) {
			this.aClass13_Sub3_6.method8235(Static408.aClass269_3, Static259.aClass269_4);
			this.aClass13_Sub3_6.method8231(Static470.aClass43_5, 0);
			this.aClass13_Sub3_6.method8212(arg3);
		} else {
			this.aClass13_Sub3_6.method8235(Static408.aClass269_3, Static408.aClass269_3);
		}
		@Pc(43) Class51_Sub2 local43 = this.aClass13_Sub3_6.method8193();
		local43.method6705(arg1, arg2, 0);
		this.aClass13_Sub3_6.method8290();
		this.aClass13_Sub3_6.method8192(0, this.anInterface10_5);
		this.aClass13_Sub3_6.method8243(this.aClass13_Sub3_6.aClass258_17);
		this.aClass13_Sub3_6.method8211(Static206.aClass191_2, 2, arg0 * 4);
		if (this.aBoolean299 || arg4) {
			this.aClass13_Sub3_6.method8231(Static338.aClass43_3, 0);
		}
	}
}
