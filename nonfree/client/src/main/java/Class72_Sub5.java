import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class72_Sub5 extends Class72 {

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_18;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!kt;")
	private final Interface12 anInterface12_4;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Z")
	private final boolean aBoolean588;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!fka;")
	private final Interface6 anInterface6_18;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!wk;Lclient!kf;[Lclient!re;Z)V")
	public Class72_Sub5(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class301[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass143_Sub1_18 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class301 local15 = arg2[local10];
			if (local15.anInt8497 > local8) {
				local8 = local15.anInt8497;
			}
			if (local15.anInt8501 > local8) {
				local8 = local15.anInt8501;
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
			@Pc(51) Class301 local51 = arg2[local46];
			local54 = local51.anInt8497;
			@Pc(57) int local57 = local51.anInt8501;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray81 == null) {
				local83 = local51.aByteArray82;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray81;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6304(Static83.aClass255_1, Static314.aClass206_12)) {
			this.anInterface12_4 = arg0.method6339(local44, local37, local37, Static83.aClass255_1, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface12_4 = arg0.method6292(false, local162, local37, local37);
		}
		this.aBoolean588 = true;
		this.anInterface12_4.method7435(Static76.aClass67_1);
		this.anInterface6_18 = arg0.method6373(false);
		this.anInterface6_18.method3123(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface6_18.method3120();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass143_Sub1_18.method6361(local373);
				@Pc(391) float local391 = this.anInterface12_4.method7450((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface12_4.method7455((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class301 local408 = arg2[local63];
					local75 = local408.anInt8497;
					local77 = local408.anInt8501;
					@Pc(417) int local417 = local408.anInt8499;
					local85 = local408.anInt8500;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.a()) {
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
				local381.c();
				if (this.anInterface6_18.method3121()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6910(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!qc", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass143_Sub1_18.method6318();
		this.aClass143_Sub1_18.method6338(this.anInterface12_4);
		if (this.aBoolean588 || arg4) {
			this.aClass143_Sub1_18.method6370(Static371.aClass6_2, Static600.aClass6_4);
			this.aClass143_Sub1_18.method6290(Static85.aClass90_1, 0);
			this.aClass143_Sub1_18.method6293(arg3);
		} else {
			this.aClass143_Sub1_18.method6370(Static371.aClass6_2, Static371.aClass6_2);
		}
		@Pc(43) Class56_Sub2 local43 = this.aClass143_Sub1_18.method6349();
		local43.method8395(arg1, arg2, 0);
		this.aClass143_Sub1_18.method6356();
		this.aClass143_Sub1_18.method6325(0, this.anInterface6_18);
		this.aClass143_Sub1_18.method6333(this.aClass143_Sub1_18.aClass48_17);
		this.aClass143_Sub1_18.method6381(Static672.aClass323_6, 2, arg0 * 4);
		if (this.aBoolean588 || arg4) {
			this.aClass143_Sub1_18.method6290(Static663.aClass90_4, 0);
		}
	}
}
