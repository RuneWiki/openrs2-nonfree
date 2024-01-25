import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_6;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "Lclient!js;")
	private final Interface15 anInterface15_1;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "Z")
	private final boolean aBoolean337;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "Lclient!tea;")
	private final Interface26 anInterface26_9;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!uv;Lclient!mv;[Lclient!tw;Z)V")
	public Class34_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) Class331[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass5_Sub2_6 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class331 local15 = arg2[local10];
			if (local15.anInt9648 > local8) {
				local8 = local15.anInt9648;
			}
			if (local15.anInt9650 > local8) {
				local8 = local15.anInt9650;
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
			@Pc(51) Class331 local51 = arg2[local46];
			local54 = local51.anInt9648;
			@Pc(57) int local57 = local51.anInt9650;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray94 == null) {
				local83 = local51.aByteArray93;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray94;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method3945(Static268.aClass178_6, Static302.aClass176_8)) {
			this.anInterface15_1 = arg0.method4056(local37, Static268.aClass178_6, local44, false, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface15_1 = arg0.method4015(local37, local37, local162, false);
		}
		this.aBoolean337 = true;
		this.anInterface15_1.method8610(Static581.aClass216_8);
		this.anInterface26_9 = arg0.method4063(false);
		this.anInterface26_9.method8109(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface26_9.method8110();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass5_Sub2_6.method4046(local373);
				@Pc(391) float local391 = this.anInterface15_1.method8448((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface15_1.method8451((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class331 local408 = arg2[local63];
					local75 = local408.anInt9648;
					local77 = local408.anInt9650;
					@Pc(417) int local417 = local408.anInt9649;
					local85 = local408.anInt9652;
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
				if (this.anInterface26_9.method8107()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8596(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!gq", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub2_6.method3952();
		this.aClass5_Sub2_6.method4008(this.anInterface15_1);
		if (this.aBoolean337 || arg4) {
			this.aClass5_Sub2_6.method4022(Static438.aClass144_3, Static503.aClass144_4);
			this.aClass5_Sub2_6.method4054(0, Static347.aClass80_2);
			this.aClass5_Sub2_6.method3987(arg3);
		} else {
			this.aClass5_Sub2_6.method4022(Static503.aClass144_4, Static503.aClass144_4);
		}
		@Pc(43) Class115_Sub3 local43 = this.aClass5_Sub2_6.method3981();
		local43.method6290(arg1, arg2, 0);
		this.aClass5_Sub2_6.method3938();
		this.aClass5_Sub2_6.method3974(0, this.anInterface26_9);
		this.aClass5_Sub2_6.method4045(this.aClass5_Sub2_6.aClass270_20);
		this.aClass5_Sub2_6.method4040(Static258.aClass248_6, arg0 * 4, 2);
		if (this.aBoolean337 || arg4) {
			this.aClass5_Sub2_6.method4054(0, Static522.aClass80_4);
		}
	}
}
