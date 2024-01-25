import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class96_Sub3 extends Class96 {

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_13;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!cm;")
	private final Interface5 anInterface5_4;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "Z")
	private final boolean aBoolean503;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Lclient!vc;")
	private final Interface23 anInterface23_11;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!nv;Lclient!vn;[Lclient!qga;Z)V")
	public Class96_Sub3(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) Class282[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass78_Sub1_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class282 local15 = arg2[local10];
			if (local15.anInt7493 > local8) {
				local8 = local15.anInt7493;
			}
			if (local15.anInt7490 > local8) {
				local8 = local15.anInt7490;
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
			@Pc(51) Class282 local51 = arg2[local46];
			local54 = local51.anInt7493;
			@Pc(57) int local57 = local51.anInt7490;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray73 == null) {
				local83 = local51.aByteArray74;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray73;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6869(Static243.aClass172_9, Static268.aClass271_7)) {
			this.anInterface5_4 = arg0.method6923(Static268.aClass271_7, local44, local37, false, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface5_4 = arg0.method6874(false, local162, local37, local37);
		}
		this.aBoolean503 = true;
		this.anInterface5_4.method7298(Static267.aClass54_5);
		this.anInterface23_11 = arg0.method6927(false);
		this.anInterface23_11.method5569(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface23_11.method5570();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass78_Sub1_13.method6925(local373);
				@Pc(391) float local391 = this.anInterface5_4.method7315((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface5_4.method7316((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class282 local408 = arg2[local63];
					local75 = local408.anInt7493;
					local77 = local408.anInt7490;
					@Pc(417) int local417 = local408.anInt7492;
					local85 = local408.anInt7491;
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
				local381.a();
				if (this.anInterface23_11.method5572()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass78_Sub1_13.method6878();
		this.aClass78_Sub1_13.method6931(this.anInterface5_4);
		if (this.aBoolean503 || arg4) {
			this.aClass78_Sub1_13.method6864(Static569.aClass118_4, Static31.aClass118_1);
			this.aClass78_Sub1_13.method6975(Static276.aClass148_4, 0);
			this.aClass78_Sub1_13.method6917(arg3);
		} else {
			this.aClass78_Sub1_13.method6864(Static569.aClass118_4, Static569.aClass118_4);
		}
		@Pc(43) Class34_Sub1 local43 = this.aClass78_Sub1_13.method6904();
		local43.NA(arg1, arg2, 0);
		this.aClass78_Sub1_13.method6895();
		this.aClass78_Sub1_13.method6965(this.anInterface23_11, 0);
		this.aClass78_Sub1_13.method6941(this.aClass78_Sub1_13.aClass185_19);
		this.aClass78_Sub1_13.method6966(arg0 * 4, Static528.aClass77_6, 2);
		if (this.aBoolean503 || arg4) {
			this.aClass78_Sub1_13.method6975(Static47.aClass148_1, 0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7245(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class181 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
