import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_14;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!fj;")
	private final Interface11 anInterface11_4;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
	private final boolean aBoolean430;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!ega;")
	private final Interface8 anInterface8_10;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!um;Lclient!fo;[Lclient!ut;Z)V")
	public Class37_Sub3(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class344[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass162_Sub1_14 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class344 local15 = arg2[local10];
			if (local15.anInt8946 > local8) {
				local8 = local15.anInt8946;
			}
			if (local15.anInt8947 > local8) {
				local8 = local15.anInt8947;
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
			@Pc(51) Class344 local51 = arg2[local46];
			local54 = local51.anInt8946;
			@Pc(57) int local57 = local51.anInt8947;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray95 == null) {
				local83 = local51.aByteArray94;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray95;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method3847(Static398.aClass366_10, Static42.aClass35_4)) {
			this.anInterface11_4 = arg0.method3863(local44, local37, false, Static398.aClass366_10, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface11_4 = arg0.method3904(local37, local37, false, local162);
		}
		this.aBoolean430 = true;
		this.anInterface11_4.method7634(Static55.aClass195_1);
		this.anInterface8_10 = arg0.method3826(false);
		this.anInterface8_10.method5367(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface8_10.method5369();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass162_Sub1_14.method3907(local373);
				@Pc(391) float local391 = this.anInterface11_4.method7640((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface11_4.method7636((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class344 local408 = arg2[local63];
					local75 = local408.anInt8946;
					local77 = local408.anInt8947;
					@Pc(417) int local417 = local408.anInt8950;
					local85 = local408.anInt8948;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.b()) {
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
				local381.c();
				if (this.anInterface8_10.method5368()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass162_Sub1_14.method3950();
		this.aClass162_Sub1_14.method3865(this.anInterface11_4);
		if (this.aBoolean430 || arg4) {
			this.aClass162_Sub1_14.method3867(Static317.aClass247_2, Static460.aClass247_4);
			this.aClass162_Sub1_14.method3885(Static504.aClass263_4, 0);
			this.aClass162_Sub1_14.method3891(arg3);
		} else {
			this.aClass162_Sub1_14.method3867(Static317.aClass247_2, Static317.aClass247_2);
		}
		@Pc(43) Class25_Sub2 local43 = this.aClass162_Sub1_14.method3868();
		local43.NA(arg1, arg2, 0);
		this.aClass162_Sub1_14.method3825();
		this.aClass162_Sub1_14.method3954(this.anInterface8_10, 0);
		this.aClass162_Sub1_14.method3882(this.aClass162_Sub1_14.aClass59_13);
		this.aClass162_Sub1_14.method3854(Static248.aClass155_5, 2, arg0 * 4);
		if (this.aBoolean430 || arg4) {
			this.aClass162_Sub1_14.method3885(Static191.aClass263_2, 0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7722(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
