import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_13;

	@OriginalMember(owner = "client!jga", name = "w", descriptor = "Lclient!wda;")
	private final Interface26 anInterface26_3;

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!jga", name = "v", descriptor = "Lclient!caa;")
	private final Interface3 anInterface3_11;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!gt;Lclient!fp;[Lclient!fw;Z)V")
	public Class64_Sub1(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class120[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass87_Sub1_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class120 local15 = arg2[local10];
			if (local15.anInt3707 > local8) {
				local8 = local15.anInt3707;
			}
			if (local15.anInt3710 > local8) {
				local8 = local15.anInt3710;
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
			@Pc(51) Class120 local51 = arg2[local46];
			local54 = local51.anInt3707;
			@Pc(57) int local57 = local51.anInt3710;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray35 == null) {
				local83 = local51.aByteArray36;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray35;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5091(Static545.aClass324_12, Static249.aClass187_7)) {
			this.anInterface26_3 = arg0.method5113(local44, false, local37, Static249.aClass187_7, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface26_3 = arg0.method5098(false, local37, local37, local162);
		}
		this.aBoolean406 = true;
		this.anInterface26_3.method8046(Static159.aClass283_2);
		this.anInterface3_11 = arg0.method5043(false);
		this.anInterface3_11.method7186(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface3_11.method7189();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass87_Sub1_13.method5128(local373);
				@Pc(391) float local391 = this.anInterface26_3.method8056((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface26_3.method8049((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class120 local408 = arg2[local63];
					local75 = local408.anInt3707;
					local77 = local408.anInt3710;
					@Pc(417) int local417 = local408.anInt3705;
					local85 = local408.anInt3708;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.b()) {
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
				if (this.anInterface3_11.method7187()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7507(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!jga", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass87_Sub1_13.method5085();
		this.aClass87_Sub1_13.method5079(this.anInterface26_3);
		if (this.aBoolean406 || arg4) {
			this.aClass87_Sub1_13.method5133(Static40.aClass300_1, Static148.aClass300_3);
			this.aClass87_Sub1_13.method5131(0, Static358.aClass315_1);
			this.aClass87_Sub1_13.method5075(arg3);
		} else {
			this.aClass87_Sub1_13.method5133(Static148.aClass300_3, Static148.aClass300_3);
		}
		@Pc(43) Class6_Sub2 local43 = this.aClass87_Sub1_13.method5129();
		local43.method6701(arg1, arg2, 0);
		this.aClass87_Sub1_13.method5022();
		this.aClass87_Sub1_13.method5148(this.anInterface3_11, 0);
		this.aClass87_Sub1_13.method5110(this.aClass87_Sub1_13.aClass147_20);
		this.aClass87_Sub1_13.method5090(Static334.aClass334_6, 2, arg0 * 4);
		if (this.aBoolean406 || arg4) {
			this.aClass87_Sub1_13.method5131(0, Static516.aClass315_3);
		}
	}
}
