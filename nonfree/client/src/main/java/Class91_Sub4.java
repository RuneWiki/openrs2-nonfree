import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class91_Sub4 extends Class91 {

	@OriginalMember(owner = "client!tba", name = "A", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_13;

	@OriginalMember(owner = "client!tba", name = "z", descriptor = "Lclient!ak;")
	private final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!tba", name = "y", descriptor = "Z")
	private final boolean aBoolean600;

	@OriginalMember(owner = "client!tba", name = "x", descriptor = "Lclient!eu;")
	private final Interface4 anInterface4_15;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!ej;Lclient!kga;[Lclient!pga;Z)V")
	public Class91_Sub4(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class268[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass66_Sub1_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class268 local15 = arg2[local10];
			if (local15.anInt7060 > local8) {
				local8 = local15.anInt7060;
			}
			if (local15.anInt7058 > local8) {
				local8 = local15.anInt7058;
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
			@Pc(51) Class268 local51 = arg2[local46];
			local54 = local51.anInt7060;
			@Pc(57) int local57 = local51.anInt7058;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray92 == null) {
				local83 = local51.aByteArray93;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray92;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6969(Static106.aClass141_3, Static349.aClass239_12)) {
			this.anInterface2_3 = arg0.method6958(false, local37, local44, Static106.aClass141_3, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface2_3 = arg0.method6951(false, local37, local37, local162);
		}
		this.aBoolean600 = true;
		this.anInterface2_3.method6762(Static393.aClass46_12);
		this.anInterface4_15 = arg0.method6931(false);
		this.anInterface4_15.method3559(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface4_15.method7149();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass66_Sub1_13.method6978(local373);
				@Pc(391) float local391 = this.anInterface2_3.method6725((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface2_3.method6724((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class268 local408 = arg2[local63];
					local75 = local408.anInt7060;
					local77 = local408.anInt7058;
					@Pc(417) int local417 = local408.anInt7059;
					local85 = local408.anInt7057;
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
				if (this.anInterface4_15.method7150()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass66_Sub1_13.method6996();
		this.aClass66_Sub1_13.method6979(this.anInterface2_3);
		if (this.aBoolean600 || arg4) {
			this.aClass66_Sub1_13.method6997(Static174.aClass240_2, Static152.aClass240_1);
			this.aClass66_Sub1_13.method6923(Static19.aClass120_1, 0);
			this.aClass66_Sub1_13.method6932(arg3);
		} else {
			this.aClass66_Sub1_13.method6997(Static174.aClass240_2, Static174.aClass240_2);
		}
		@Pc(43) Class134_Sub1 local43 = this.aClass66_Sub1_13.method6919();
		local43.GA(arg1, arg2, 0);
		this.aClass66_Sub1_13.method6902();
		this.aClass66_Sub1_13.method6941(this.anInterface4_15, 0);
		this.aClass66_Sub1_13.method6890(this.aClass66_Sub1_13.aClass321_17);
		this.aClass66_Sub1_13.method6964(2, arg0 * 4, Static130.aClass247_2);
		if (this.aBoolean600 || arg4) {
			this.aClass66_Sub1_13.method6923(Static22.aClass120_2, 0);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7459(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
