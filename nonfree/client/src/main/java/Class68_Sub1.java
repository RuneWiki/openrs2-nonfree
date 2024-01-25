import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_7;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Lclient!de;")
	private final Interface4 anInterface4_2;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "Z")
	private final boolean aBoolean195;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "Lclient!uh;")
	private final Interface24 anInterface24_3;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!lb;Lclient!pga;[Lclient!tia;Z)V")
	public Class68_Sub1(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class289 arg1, @OriginalArg(2) Class355[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass145_Sub1_7 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class355 local15 = arg2[local10];
			if (local15.anInt9470 > local8) {
				local8 = local15.anInt9470;
			}
			if (local15.anInt9469 > local8) {
				local8 = local15.anInt9469;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class355 local51;
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
				local54 = local51.anInt9470;
				@Pc(57) int local57 = local51.anInt9469;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray106 == null) {
					local83 = local51.aByteArray107;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray106;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			if (arg0.method9843(Static408.aClass295_11, Static243.aClass158_10)) {
				this.anInterface4_2 = arg0.method9841(local44, false, local37, local37, Static408.aClass295_11);
			} else {
				@Pc(162) int[] local162 = new int[local44.length];
				for (local54 = 0; local54 < local44.length; local54++) {
					local162[local54] = local44[local54] << 24;
				}
				this.anInterface4_2 = arg0.method9753(local162, false, local37, local37);
			}
			this.aBoolean195 = true;
		} else {
			@Pc(207) int[] local207 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(217) int[] local217 = local51.anIntArray689;
				@Pc(220) byte[] local220 = local51.aByteArray106;
				@Pc(223) byte[] local223 = local51.aByteArray107;
				local69 = local51.anInt9470;
				local75 = local51.anInt9469;
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
			this.anInterface4_2 = arg0.method9753(local207, false, local37, local37);
			this.aBoolean195 = false;
		}
		this.anInterface4_2.method8448(Static517.aClass400_29);
		this.anInterface24_3 = arg0.method9825(false);
		this.anInterface24_3.method9227(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface24_3.method9228();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass145_Sub1_7.method9844(local373);
				@Pc(391) float local391 = this.anInterface4_2.method6856((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface4_2.method6857((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class355 local408 = arg2[local63];
					local75 = local408.anInt9470;
					local77 = local408.anInt9469;
					local241 = local408.anInt9472;
					local85 = local408.anInt9468;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.b()) {
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
				local381.a();
				if (this.anInterface24_3.method9230()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7894(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!co", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass145_Sub1_7.method9838();
		this.aClass145_Sub1_7.method9754(this.anInterface4_2);
		if (this.aBoolean195 || arg4) {
			this.aClass145_Sub1_7.method9725(Static162.aClass293_4, Static105.aClass293_3);
			this.aClass145_Sub1_7.method9813(Static45.aClass352_1, 0);
			this.aClass145_Sub1_7.method9769(arg3);
		} else {
			this.aClass145_Sub1_7.method9725(Static162.aClass293_4, Static162.aClass293_4);
		}
		@Pc(43) Class86_Sub2 local43 = this.aClass145_Sub1_7.method9835();
		local43.method7026(arg1, arg2, 0);
		this.aClass145_Sub1_7.method9786();
		this.aClass145_Sub1_7.method9800(0, this.anInterface24_3);
		this.aClass145_Sub1_7.method9766(this.aClass145_Sub1_7.aClass277_22);
		this.aClass145_Sub1_7.method9772(arg0 * 4, 2, Static289.aClass317_4);
		if (this.aBoolean195 || arg4) {
			this.aClass145_Sub1_7.method9813(Static231.aClass352_5, 0);
		}
	}
}
