import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class80_Sub3 extends Class80 {

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_12;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Lclient!wp;")
	private final Interface26 anInterface26_3;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Z")
	private final boolean aBoolean379;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Lclient!sfa;")
	private final Interface25 anInterface25_5;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!kd;Lclient!lq;[Lclient!iga;Z)V")
	public Class80_Sub3(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class173[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass57_Sub3_12 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class173 local15 = arg2[local10];
			if (local15.anInt4287 > local8) {
				local8 = local15.anInt4287;
			}
			if (local15.anInt4282 > local8) {
				local8 = local15.anInt4282;
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
			@Pc(51) Class173 local51 = arg2[local46];
			local54 = local51.anInt4287;
			@Pc(57) int local57 = local51.anInt4282;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray27 == null) {
				local83 = local51.aByteArray28;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray27;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7844(Static453.aClass278_13, Static78.aClass114_19)) {
			this.anInterface26_3 = arg0.method7788(false, Static78.aClass114_19, local37, local44, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface26_3 = arg0.method7787(local162, local37, local37, false);
		}
		this.aBoolean379 = true;
		this.anInterface26_3.method8306(Static551.aClass216_10);
		this.anInterface25_5 = arg0.method7784(false);
		this.anInterface25_5.method2907(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface25_5.method2909();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass57_Sub3_12.method7826(local373);
				@Pc(391) float local391 = this.anInterface26_3.method4353((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface26_3.method4346((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class173 local408 = arg2[local63];
					local75 = local408.anInt4287;
					local77 = local408.anInt4282;
					@Pc(417) int local417 = local408.anInt4286;
					local85 = local408.anInt4283;
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
				local381.c();
				if (this.anInterface25_5.method2908()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8794(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!ji", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass57_Sub3_12.method7805();
		this.aClass57_Sub3_12.method7813(this.anInterface26_3);
		if (this.aBoolean379 || arg4) {
			this.aClass57_Sub3_12.method7733(Static313.aClass34_88, Static362.aClass34_172);
			this.aClass57_Sub3_12.method7866(0, Static291.aClass312_3);
			this.aClass57_Sub3_12.method7806(arg3);
		} else {
			this.aClass57_Sub3_12.method7733(Static362.aClass34_172, Static362.aClass34_172);
		}
		@Pc(43) Class203_Sub1 local43 = this.aClass57_Sub3_12.method7815();
		local43.method8332(arg1, arg2, 0);
		this.aClass57_Sub3_12.method7735();
		this.aClass57_Sub3_12.method7807(0, this.anInterface25_5);
		this.aClass57_Sub3_12.method7745(this.aClass57_Sub3_12.aClass147_18);
		this.aClass57_Sub3_12.method7854(Static271.aClass85_4, arg0 * 4, 2);
		if (this.aBoolean379 || arg4) {
			this.aClass57_Sub3_12.method7866(0, Static57.aClass312_1);
		}
	}
}
