import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class55_Sub4 extends Class55 {

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_9;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!rm;")
	private final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
	private final boolean aBoolean412;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!fb;")
	private final Interface6 anInterface6_8;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!pj;Lclient!pia;[Lclient!gu;Z)V")
	public Class55_Sub4(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) Class131[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass133_Sub1_9 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class131 local15 = arg2[local10];
			if (local15.anInt3345 > local8) {
				local8 = local15.anInt3345;
			}
			if (local15.anInt3344 > local8) {
				local8 = local15.anInt3344;
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
			@Pc(51) Class131 local51 = arg2[local46];
			local54 = local51.anInt3345;
			@Pc(57) int local57 = local51.anInt3344;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray30 == null) {
				local83 = local51.aByteArray29;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray30;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6263(Static20.aClass19_4, Static356.aClass223_12)) {
			this.anInterface20_3 = arg0.method6257(local44, local37, false, Static356.aClass223_12, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface20_3 = arg0.method6181(local37, false, local37, local162);
		}
		this.aBoolean412 = true;
		this.anInterface20_3.method7905(Static197.aClass116_15);
		this.anInterface6_8 = arg0.method6196(false);
		this.anInterface6_8.method4124(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface6_8.method4126();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass133_Sub1_9.method6242(local373);
				@Pc(391) float local391 = this.anInterface20_3.method4640((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface20_3.method4641((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class131 local408 = arg2[local63];
					local75 = local408.anInt3345;
					local77 = local408.anInt3344;
					@Pc(417) int local417 = local408.anInt3343;
					local85 = local408.anInt3341;
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
				if (this.anInterface6_8.method4123()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass133_Sub1_9.method6166();
		this.aClass133_Sub1_9.method6153(this.anInterface20_3);
		if (this.aBoolean412 || arg4) {
			this.aClass133_Sub1_9.method6239(Static481.aClass151_8, Static524.aClass151_11);
			this.aClass133_Sub1_9.method6211(Static105.aClass236_1, 0);
			this.aClass133_Sub1_9.method6160(arg3);
		} else {
			this.aClass133_Sub1_9.method6239(Static481.aClass151_8, Static481.aClass151_8);
		}
		@Pc(43) Class113_Sub1 local43 = this.aClass133_Sub1_9.method6284();
		local43.method8458(arg1, arg2, 0);
		this.aClass133_Sub1_9.method6204();
		this.aClass133_Sub1_9.method6215(this.anInterface6_8, 0);
		this.aClass133_Sub1_9.method6217(this.aClass133_Sub1_9.aClass90_21);
		this.aClass133_Sub1_9.method6266(2, Static538.aClass303_6, arg0 * 4);
		if (this.aBoolean412 || arg4) {
			this.aClass133_Sub1_9.method6211(Static626.aClass236_6, 0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6007(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
