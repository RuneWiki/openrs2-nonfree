import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!dca", name = "z", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_2;

	@OriginalMember(owner = "client!dca", name = "x", descriptor = "Lclient!ica;")
	private final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!dca", name = "y", descriptor = "Lclient!cca;")
	private final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!tu;Lclient!cq;[Lclient!af;Z)V")
	public Class59_Sub1(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class9[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass5_Sub3_2 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class9 local15 = arg2[local10];
			if (local15.anInt481 > local8) {
				local8 = local15.anInt481;
			}
			if (local15.anInt478 > local8) {
				local8 = local15.anInt478;
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
			@Pc(51) Class9 local51 = arg2[local46];
			local54 = local51.anInt481;
			@Pc(57) int local57 = local51.anInt478;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray12 == null) {
				local83 = local51.aByteArray13;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray12;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6310(Static212.aClass167_7, Static524.aClass310_16)) {
			this.anInterface9_1 = arg0.method6374(Static212.aClass167_7, local44, local37, local37, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface9_1 = arg0.method6373(local162, false, local37, local37);
		}
		this.aBoolean131 = true;
		this.anInterface9_1.method6468(Static302.aClass172_9);
		this.anInterface3_1 = arg0.method6422(false);
		this.anInterface3_1.method2580(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface3_1.method3136();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass5_Sub3_2.method6352(local373);
				@Pc(391) float local391 = this.anInterface9_1.method3275((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface9_1.method3277((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class9 local408 = arg2[local63];
					local75 = local408.anInt481;
					local77 = local408.anInt478;
					@Pc(417) int local417 = local408.anInt477;
					local85 = local408.anInt476;
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
				if (this.anInterface3_1.method3135()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub3_2.method6369();
		this.aClass5_Sub3_2.method6416(this.anInterface9_1);
		if (this.aBoolean131 || arg4) {
			this.aClass5_Sub3_2.method6320(Static130.aClass289_1, Static526.aClass289_5);
			this.aClass5_Sub3_2.method6415(Static144.aClass166_2, 0);
			this.aClass5_Sub3_2.method6363(arg3);
		} else {
			this.aClass5_Sub3_2.method6320(Static526.aClass289_5, Static526.aClass289_5);
		}
		@Pc(43) Class205_Sub1 local43 = this.aClass5_Sub3_2.method6297();
		local43.GA(arg1, arg2, 0);
		this.aClass5_Sub3_2.method6392();
		this.aClass5_Sub3_2.method6382(this.anInterface3_1, 0);
		this.aClass5_Sub3_2.method6333(this.aClass5_Sub3_2.aClass76_15);
		this.aClass5_Sub3_2.method6329(arg0 * 4, 2, Static328.aClass87_5);
		if (this.aBoolean131 || arg4) {
			this.aClass5_Sub3_2.method6415(Static213.aClass166_3, 0);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7273(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
