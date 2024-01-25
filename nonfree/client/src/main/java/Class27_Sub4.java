import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class27_Sub4 extends Class27 {

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_18;

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "Lclient!jb;")
	private final Interface5 anInterface5_2;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "Lclient!ql;")
	private final Interface15 anInterface15_9;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!cb;Lclient!lg;[Lclient!qm;Z)V")
	public Class27_Sub4(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) Class242[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass9_Sub1_18 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class242 local15 = arg2[local10];
			if (local15.anInt6866 > local8) {
				local8 = local15.anInt6866;
			}
			if (local15.anInt6863 > local8) {
				local8 = local15.anInt6863;
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
			@Pc(51) Class242 local51 = arg2[local46];
			local54 = local51.anInt6866;
			@Pc(57) int local57 = local51.anInt6863;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray82 == null) {
				local83 = local51.aByteArray83;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray82;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7713(Static489.aClass289_13, Static97.aClass16_17)) {
			this.anInterface5_2 = arg0.method7702(false, local37, local44, local37, Static97.aClass16_17);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface5_2 = arg0.method7711(local37, local162, false, local37);
		}
		this.aBoolean477 = true;
		this.anInterface5_2.method7955(Static111.aClass234_4);
		this.anInterface15_9 = arg0.method7707(false);
		this.anInterface15_9.method6277(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface15_9.method7519();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass9_Sub1_18.method7677(local373);
				@Pc(391) float local391 = this.anInterface5_2.method7970((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface5_2.method7972((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class242 local408 = arg2[local63];
					local75 = local408.anInt6866;
					local77 = local408.anInt6863;
					@Pc(417) int local417 = local408.anInt6865;
					local85 = local408.anInt6862;
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
				if (this.anInterface15_9.method7521()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass9_Sub1_18.method7715();
		this.aClass9_Sub1_18.method7712(this.anInterface5_2);
		if (this.aBoolean477 || arg4) {
			this.aClass9_Sub1_18.method7723(Static74.aClass295_2, Static453.aClass295_5);
			this.aClass9_Sub1_18.method7678(Static349.aClass122_3, 0);
			this.aClass9_Sub1_18.method7768(arg3);
		} else {
			this.aClass9_Sub1_18.method7723(Static453.aClass295_5, Static453.aClass295_5);
		}
		@Pc(43) Class22_Sub3 local43 = this.aClass9_Sub1_18.method7760();
		local43.oa(arg1, arg2, 0);
		this.aClass9_Sub1_18.method7656();
		this.aClass9_Sub1_18.method7664(this.aClass9_Sub1_18.aClass265_17);
		this.aClass9_Sub1_18.method7697(this.anInterface15_9, 0);
		this.aClass9_Sub1_18.method7667(Static531.aClass102_6, 2, arg0 * 4);
		if (this.aBoolean477 || arg4) {
			this.aClass9_Sub1_18.method7678(Static197.aClass122_2, 0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7812(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class23 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
