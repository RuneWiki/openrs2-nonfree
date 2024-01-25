import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_14;

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "Lclient!pt;")
	private final Interface16 anInterface16_3;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "Z")
	private final boolean aBoolean498;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "Lclient!lq;")
	private final Interface14 anInterface14_9;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!jca;Lclient!hw;[Lclient!tm;Z)V")
	public Class57_Sub2(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Class169 arg1, @OriginalArg(2) Class361[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass22_Sub2_14 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class361 local15 = arg2[local10];
			if (local15.anInt9707 > local8) {
				local8 = local15.anInt9707;
			}
			if (local15.anInt9706 > local8) {
				local8 = local15.anInt9706;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class361 local51;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(241) int local241;
		if (arg3) {
			@Pc(44) byte[] local44 = new byte[local37 * local37];
			@Pc(54) int local54;
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				local54 = local51.anInt9707;
				@Pc(57) int local57 = local51.anInt9706;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray91 == null) {
					local83 = local51.aByteArray90;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray91;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			if (arg0.method8953(Static259.aClass167_7, Static702.aClass335_19)) {
				this.anInterface16_3 = arg0.method8934(local37, local37, Static702.aClass335_19, local44, false);
			} else {
				@Pc(162) int[] local162 = new int[local44.length];
				for (local54 = 0; local54 < local44.length; local54++) {
					local162[local54] = local44[local54] << 24;
				}
				this.anInterface16_3 = arg0.method8950(local162, local37, local37, false);
			}
			this.aBoolean498 = true;
		} else {
			@Pc(207) int[] local207 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(217) int[] local217 = local51.anIntArray701;
				@Pc(220) byte[] local220 = local51.aByteArray91;
				@Pc(223) byte[] local223 = local51.aByteArray90;
				local69 = local51.anInt9707;
				local75 = local51.anInt9706;
				local77 = local46 % 16 * local8;
				local241 = local46 / 16 * local8;
				local85 = local241 * local37 + local77;
				local88 = 0;
				@Pc(253) int local253;
				@Pc(256) int local256;
				if (local220 == null) {
					for (local253 = 0; local253 < local69; local253++) {
						for (local256 = 0; local256 < local75; local256++) {
							@Pc(302) byte local302;
							if ((local302 = local223[local88++]) == 0) {
								local85++;
							} else {
								local207[local85++] = local217[local302 & 0xFF] | 0xFF000000;
							}
						}
						local85 += local37 - local75;
					}
				} else {
					for (local253 = 0; local253 < local69; local253++) {
						for (local256 = 0; local256 < local75; local256++) {
							local207[local85++] = local220[local88] << 24 | local217[local223[local88] & 0xFF];
							local88++;
						}
						local85 += local37 - local75;
					}
				}
			}
			this.anInterface16_3 = arg0.method8950(local207, local37, local37, false);
			this.aBoolean498 = false;
		}
		this.anInterface16_3.method9229(Static267.aClass280_5);
		this.anInterface14_9 = arg0.method8937(false);
		this.anInterface14_9.method6767(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface14_9.method6764();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass22_Sub2_14.method8918(local373);
				@Pc(391) float local391 = this.anInterface16_3.method8247((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface16_3.method8250((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class361 local408 = arg2[local63];
					local75 = local408.anInt9707;
					local77 = local408.anInt9706;
					local241 = local408.anInt9704;
					local85 = local408.anInt9703;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.c()) {
						local381.a((float) local85);
						local381.a((float) local241);
						local381.a(0.0F);
						local381.a(local438);
						local381.a(local442);
						local381.a((float) local85);
						local381.a((float) (local241 + local75));
						local381.a(0.0F);
						local381.a(local438);
						local381.a(local456);
						local381.a((float) (local85 + local77));
						local381.a((float) (local241 + local75));
						local381.a(0.0F);
						local381.a(local449);
						local381.a(local456);
						local381.a((float) (local85 + local77));
						local381.a((float) local241);
						local381.a(0.0F);
						local381.a(local449);
						local381.a(local442);
					} else {
						local381.b((float) local85);
						local381.b((float) local241);
						local381.b(0.0F);
						local381.b(local438);
						local381.b(local442);
						local381.b((float) local85);
						local381.b((float) (local241 + local75));
						local381.b(0.0F);
						local381.b(local438);
						local381.b(local456);
						local381.b((float) (local85 + local77));
						local381.b((float) (local241 + local75));
						local381.b(0.0F);
						local381.b(local449);
						local381.b(local456);
						local381.b((float) (local85 + local77));
						local381.b((float) local241);
						local381.b(0.0F);
						local381.b(local449);
						local381.b(local442);
					}
				}
				local381.b();
				if (this.anInterface14_9.method6766()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass22_Sub2_14.method8956();
		this.aClass22_Sub2_14.method8976(this.anInterface16_3);
		if (this.aBoolean498 || arg4) {
			this.aClass22_Sub2_14.method8914(Static503.aClass372_4, Static468.aClass372_3);
			this.aClass22_Sub2_14.method8962(Static547.aClass392_3, 0);
			this.aClass22_Sub2_14.method8930(arg3);
		} else {
			this.aClass22_Sub2_14.method8914(Static468.aClass372_3, Static468.aClass372_3);
		}
		@Pc(43) Class58_Sub2 local43 = this.aClass22_Sub2_14.method8965();
		local43.method9524(arg1, arg2, 0);
		this.aClass22_Sub2_14.method8926();
		this.aClass22_Sub2_14.method8912(this.anInterface14_9, 0);
		this.aClass22_Sub2_14.method8894(this.aClass22_Sub2_14.aClass36_22);
		this.aClass22_Sub2_14.method8904(arg0 * 4, Static339.aClass234_3, 2);
		if (this.aBoolean498 || arg4) {
			this.aClass22_Sub2_14.method8962(Static358.aClass392_1, 0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method9149(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
