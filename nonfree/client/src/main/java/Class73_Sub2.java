import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_14;

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "Lclient!ae;")
	private final Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "Z")
	private final boolean aBoolean529;

	@OriginalMember(owner = "client!ov", name = "C", descriptor = "Lclient!tfa;")
	private final Interface20 anInterface20_9;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!fo;Lclient!ed;[Lclient!aaa;Z)V")
	public Class73_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class1[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass9_Sub3_14 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class1 local15 = arg2[local10];
			if (local15.anInt30 > local8) {
				local8 = local15.anInt30;
			}
			if (local15.anInt27 > local8) {
				local8 = local15.anInt27;
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
			@Pc(51) Class1 local51 = arg2[local46];
			local54 = local51.anInt30;
			@Pc(57) int local57 = local51.anInt27;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray1 == null) {
				local83 = local51.aByteArray2;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray1;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5567(Static451.aClass333_14, Static336.aClass220_12)) {
			this.anInterface1_2 = arg0.method5572(Static451.aClass333_14, false, local44, local37, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface1_2 = arg0.method5556(local162, local37, false, local37);
		}
		this.aBoolean529 = true;
		this.anInterface1_2.method7737(Static53.aClass321_1);
		this.anInterface20_9 = arg0.method5528(false);
		this.anInterface20_9.method6523(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface20_9.method6521();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass9_Sub3_14.method5524(local373);
				@Pc(391) float local391 = this.anInterface1_2.method7754((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface1_2.method7748((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class1 local408 = arg2[local63];
					local75 = local408.anInt30;
					local77 = local408.anInt27;
					@Pc(417) int local417 = local408.anInt31;
					local85 = local408.anInt29;
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
				if (this.anInterface20_9.method6524()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass9_Sub3_14.method5509();
		this.aClass9_Sub3_14.method5494(this.anInterface1_2);
		if (this.aBoolean529 || arg4) {
			this.aClass9_Sub3_14.method5598(Static477.aClass238_4, Static410.aClass238_3);
			this.aClass9_Sub3_14.method5596(Static140.aClass50_2, 0);
			this.aClass9_Sub3_14.method5536(arg3);
		} else {
			this.aClass9_Sub3_14.method5598(Static410.aClass238_3, Static410.aClass238_3);
		}
		@Pc(43) Class8_Sub3 local43 = this.aClass9_Sub3_14.method5590();
		local43.GA(arg1, arg2, 0);
		this.aClass9_Sub3_14.method5487();
		this.aClass9_Sub3_14.method5513(0, this.anInterface20_9);
		this.aClass9_Sub3_14.method5535(this.aClass9_Sub3_14.aClass88_13);
		this.aClass9_Sub3_14.method5571(arg0 * 4, 2, Static287.aClass328_3);
		if (this.aBoolean529 || arg4) {
			this.aClass9_Sub3_14.method5596(Static503.aClass50_4, 0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7900(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
