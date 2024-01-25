import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_10;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "Lclient!dea;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Z")
	private final boolean aBoolean268;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "Lclient!up;")
	private final Interface16 anInterface16_10;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!nd;Lclient!rl;[Lclient!fba;Z)V")
	public Class13_Sub2(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class96[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass62_Sub1_10 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class96 local15 = arg2[local10];
			if (local15.anInt2718 > local8) {
				local8 = local15.anInt2718;
			}
			if (local15.anInt2722 > local8) {
				local8 = local15.anInt2722;
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
			@Pc(51) Class96 local51 = arg2[local46];
			local54 = local51.anInt2718;
			@Pc(57) int local57 = local51.anInt2722;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray41 == null) {
				local83 = local51.aByteArray42;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray41;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method4739(Static523.aClass306_15, Static301.aClass174_10)) {
			this.anInterface3_3 = arg0.method4707(local37, local37, false, local44, Static301.aClass174_10);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface3_3 = arg0.method4692(false, local37, local162, local37);
		}
		this.aBoolean268 = true;
		this.anInterface3_3.method7438(Static269.aClass86_10);
		this.anInterface16_10 = arg0.method4702(false);
		this.anInterface16_10.method3464(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface16_10.method3487();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass62_Sub1_10.method4693(local373);
				@Pc(391) float local391 = this.anInterface3_3.method7449((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface3_3.method7456((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class96 local408 = arg2[local63];
					local75 = local408.anInt2718;
					local77 = local408.anInt2722;
					@Pc(417) int local417 = local408.anInt2720;
					local85 = local408.anInt2719;
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
				if (this.anInterface16_10.method3492()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass62_Sub1_10.method4665();
		this.aClass62_Sub1_10.method4676(this.anInterface3_3);
		if (this.aBoolean268 || arg4) {
			this.aClass62_Sub1_10.method4685(Static148.aClass98_1, Static165.aClass98_2);
			this.aClass62_Sub1_10.method4715(Static429.aClass63_6, 0);
			this.aClass62_Sub1_10.method4671(arg3);
		} else {
			this.aClass62_Sub1_10.method4685(Static148.aClass98_1, Static148.aClass98_1);
		}
		@Pc(43) Class78_Sub1 local43 = this.aClass62_Sub1_10.method4744();
		local43.oa(arg1, arg2, 0);
		this.aClass62_Sub1_10.method4679();
		this.aClass62_Sub1_10.method4713(this.aClass62_Sub1_10.aClass318_15);
		this.aClass62_Sub1_10.method4673(0, this.anInterface16_10);
		this.aClass62_Sub1_10.method4706(arg0 * 4, Static147.aClass228_4, 2);
		if (this.aBoolean268 || arg4) {
			this.aClass62_Sub1_10.method4715(Static24.aClass63_4, 0);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7218(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class87 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
