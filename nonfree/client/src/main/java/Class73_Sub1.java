import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_6;

	@OriginalMember(owner = "client!eca", name = "z", descriptor = "Lclient!w;")
	private final Interface27 anInterface27_1;

	@OriginalMember(owner = "client!eca", name = "x", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "Lclient!cq;")
	private final Interface3 anInterface3_10;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!gd;Lclient!ne;[Lclient!vi;Z)V")
	public Class73_Sub1(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) Class369[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass65_Sub2_6 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class369 local15 = arg2[local10];
			if (local15.anInt10307 > local8) {
				local8 = local15.anInt10307;
			}
			if (local15.anInt10309 > local8) {
				local8 = local15.anInt10309;
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
			@Pc(51) Class369 local51 = arg2[local46];
			local54 = local51.anInt10307;
			@Pc(57) int local57 = local51.anInt10309;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray103 == null) {
				local83 = local51.aByteArray104;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray103;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method4359(Static67.aClass339_4, Static120.aClass89_7)) {
			this.anInterface27_1 = arg0.method4422(local37, local44, local37, Static67.aClass339_4, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface27_1 = arg0.method4371(local37, local162, local37, false);
		}
		this.aBoolean232 = true;
		this.anInterface27_1.method7704(Static393.aClass294_6);
		this.anInterface3_10 = arg0.method4374(false);
		this.anInterface3_10.method8244(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface3_10.method8245();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass65_Sub2_6.method4457(local373);
				@Pc(391) float local391 = this.anInterface27_1.method5622((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface27_1.method5617((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class369 local408 = arg2[local63];
					local75 = local408.anInt10307;
					local77 = local408.anInt10309;
					@Pc(417) int local417 = local408.anInt10306;
					local85 = local408.anInt10308;
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
				if (this.anInterface3_10.method8243()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass65_Sub2_6.method4404();
		this.aClass65_Sub2_6.method4426(this.anInterface27_1);
		if (this.aBoolean232 || arg4) {
			this.aClass65_Sub2_6.method4432(Static138.aClass178_2, Static606.aClass178_4);
			this.aClass65_Sub2_6.method4400(Static413.aClass64_3, 0);
			this.aClass65_Sub2_6.method4455(arg3);
		} else {
			this.aClass65_Sub2_6.method4432(Static138.aClass178_2, Static138.aClass178_2);
		}
		@Pc(43) Class254_Sub2 local43 = this.aClass65_Sub2_6.method4471();
		local43.method7361(arg1, arg2, 0);
		this.aClass65_Sub2_6.method4434();
		this.aClass65_Sub2_6.method4427(0, this.anInterface3_10);
		this.aClass65_Sub2_6.method4447(this.aClass65_Sub2_6.aClass69_21);
		this.aClass65_Sub2_6.method4450(Static504.aClass155_6, arg0 * 4, 2);
		if (this.aBoolean232 || arg4) {
			this.aClass65_Sub2_6.method4400(Static536.aClass64_4, 0);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5786(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
