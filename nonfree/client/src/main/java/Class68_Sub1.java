import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!naa", name = "B", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_16;

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "Lclient!gka;")
	private final Interface9 anInterface9_5;

	@OriginalMember(owner = "client!naa", name = "A", descriptor = "Z")
	private final boolean aBoolean490;

	@OriginalMember(owner = "client!naa", name = "y", descriptor = "Lclient!fea;")
	private final Interface7 anInterface7_14;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!he;Lclient!tja;[Lclient!oe;Z)V")
	public Class68_Sub1(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) Class266[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass144_Sub1_16 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class266 local15 = arg2[local10];
			if (local15.anInt7305 > local8) {
				local8 = local15.anInt7305;
			}
			if (local15.anInt7303 > local8) {
				local8 = local15.anInt7303;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class266 local51;
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
				local54 = local51.anInt7305;
				@Pc(57) int local57 = local51.anInt7303;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray80 == null) {
					local83 = local51.aByteArray79;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray80;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			if (arg0.method5757(Static18.aClass19_4, Static60.aClass260_3)) {
				this.anInterface9_5 = arg0.method5714(local44, local37, false, local37, Static60.aClass260_3);
			} else {
				@Pc(162) int[] local162 = new int[local44.length];
				for (local54 = 0; local54 < local44.length; local54++) {
					local162[local54] = local44[local54] << 24;
				}
				this.anInterface9_5 = arg0.method5687(local37, false, local37, local162);
			}
			this.aBoolean490 = true;
		} else {
			@Pc(207) int[] local207 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(217) int[] local217 = local51.anIntArray386;
				@Pc(220) byte[] local220 = local51.aByteArray80;
				@Pc(223) byte[] local223 = local51.aByteArray79;
				local69 = local51.anInt7305;
				local75 = local51.anInt7303;
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
			this.anInterface9_5 = arg0.method5687(local37, false, local37, local207);
			this.aBoolean490 = false;
		}
		this.anInterface9_5.method9349(Static488.aClass137_10);
		this.anInterface7_14 = arg0.method5780(false);
		this.anInterface7_14.method5841(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface7_14.method5840();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass144_Sub1_16.method5747(local373);
				@Pc(391) float local391 = this.anInterface9_5.method4772((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface9_5.method4770((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class266 local408 = arg2[local63];
					local75 = local408.anInt7305;
					local77 = local408.anInt7303;
					local241 = local408.anInt7308;
					local85 = local408.anInt7304;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.c()) {
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
					} else {
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
					}
				}
				local381.b();
				if (this.anInterface7_14.method5843()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass144_Sub1_16.method5744();
		this.aClass144_Sub1_16.method5643(this.anInterface9_5);
		if (this.aBoolean490 || arg4) {
			this.aClass144_Sub1_16.method5653(Static345.aClass287_2, Static284.aClass287_1);
			this.aClass144_Sub1_16.method5740(Static216.aClass138_5, 0);
			this.aClass144_Sub1_16.method5655(arg3);
		} else {
			this.aClass144_Sub1_16.method5653(Static284.aClass287_1, Static284.aClass287_1);
		}
		@Pc(43) Class263_Sub2 local43 = this.aClass144_Sub1_16.method5729();
		local43.method8444(arg1, arg2, 0);
		this.aClass144_Sub1_16.method5645();
		this.aClass144_Sub1_16.method5696(0, this.anInterface7_14);
		this.aClass144_Sub1_16.method5707(this.aClass144_Sub1_16.aClass119_17);
		this.aClass144_Sub1_16.method5698(arg0 * 4, Static378.aClass213_30, 2);
		if (this.aBoolean490 || arg4) {
			this.aClass144_Sub1_16.method5740(Static308.aClass138_4, 0);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method9434(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
