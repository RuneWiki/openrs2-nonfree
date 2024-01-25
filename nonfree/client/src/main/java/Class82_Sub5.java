import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class82_Sub5 extends Class82 {

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_20;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "Lclient!hr;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Z")
	private final boolean aBoolean670;

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "Lclient!iq;")
	private final Interface8 anInterface8_15;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!gj;Lclient!mj;[Lclient!kq;Z)V")
	public Class82_Sub5(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class177[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass90_Sub3_20 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class177 local15 = arg2[local10];
			if (local15.anInt4884 > local8) {
				local8 = local15.anInt4884;
			}
			if (local15.anInt4887 > local8) {
				local8 = local15.anInt4887;
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
			@Pc(51) Class177 local51 = arg2[local46];
			local54 = local51.anInt4884;
			@Pc(57) int local57 = local51.anInt4887;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray67 == null) {
				local83 = local51.aByteArray66;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray67;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7556(Static357.aClass171_12, Static407.aClass254_14)) {
			this.anInterface7_4 = arg0.method7622(local44, local37, false, Static357.aClass171_12, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface7_4 = arg0.method7597(local37, local37, local162, false);
		}
		this.aBoolean670 = true;
		this.anInterface7_4.method7034(Static553.aClass257_11);
		this.anInterface8_15 = arg0.method7562(false);
		this.anInterface8_15.method6463(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface8_15.method6462();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass90_Sub3_20.method7595(local373);
				@Pc(391) float local391 = this.anInterface7_4.method7052((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface7_4.method7053((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class177 local408 = arg2[local63];
					local75 = local408.anInt4884;
					local77 = local408.anInt4887;
					@Pc(417) int local417 = local408.anInt4885;
					local85 = local408.anInt4886;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.a()) {
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
				local381.b();
				if (this.anInterface8_15.method6460()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass90_Sub3_20.method7555();
		this.aClass90_Sub3_20.method7624(this.anInterface7_4);
		if (this.aBoolean670 || arg4) {
			this.aClass90_Sub3_20.method7570(Static140.aClass214_2, Static547.aClass214_5);
			this.aClass90_Sub3_20.method7540(0, Static20.aClass150_1);
			this.aClass90_Sub3_20.method7650(arg3);
		} else {
			this.aClass90_Sub3_20.method7570(Static140.aClass214_2, Static140.aClass214_2);
		}
		@Pc(43) Class93_Sub3 local43 = this.aClass90_Sub3_20.method7602();
		local43.GA(arg1, arg2, 0);
		this.aClass90_Sub3_20.method7619();
		this.aClass90_Sub3_20.method7658(this.anInterface8_15, 0);
		this.aClass90_Sub3_20.method7553(this.aClass90_Sub3_20.aClass107_19);
		this.aClass90_Sub3_20.method7531(2, arg0 * 4, Static190.aClass321_6);
		if (this.aBoolean670 || arg4) {
			this.aClass90_Sub3_20.method7540(0, Static393.aClass150_6);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7879(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class17 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
