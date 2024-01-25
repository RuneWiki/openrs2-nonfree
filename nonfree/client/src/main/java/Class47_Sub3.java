import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_14;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Lclient!hc;")
	private final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Z")
	private final boolean aBoolean325;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "Lclient!tq;")
	private final Interface19 anInterface19_7;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!kw;Lclient!dd;[Lclient!qr;Z)V")
	public Class47_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class241[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass39_Sub2_14 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class241 local15 = arg2[local10];
			if (local15.anInt7604 > local8) {
				local8 = local15.anInt7604;
			}
			if (local15.anInt7606 > local8) {
				local8 = local15.anInt7606;
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
			@Pc(51) Class241 local51 = arg2[local46];
			local54 = local51.anInt7604;
			@Pc(57) int local57 = local51.anInt7606;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray101 == null) {
				local83 = local51.aByteArray102;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray101;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6103(Static268.aClass171_10, Static160.aClass150_3)) {
			this.anInterface8_3 = arg0.method6198(false, local44, local37, local37, Static160.aClass150_3);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface8_3 = arg0.method6106(local162, false, local37, local37);
		}
		this.aBoolean325 = true;
		this.anInterface8_3.method7130(Static442.aClass240_8);
		this.anInterface19_7 = arg0.method6100(false);
		this.anInterface19_7.method6493(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface19_7.method6952();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass39_Sub2_14.method6195(local373);
				@Pc(391) float local391 = this.anInterface8_3.method5781((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface8_3.method5777((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class241 local408 = arg2[local63];
					local75 = local408.anInt7604;
					local77 = local408.anInt7606;
					@Pc(417) int local417 = local408.anInt7605;
					local85 = local408.anInt7603;
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
				local381.c();
				if (this.anInterface19_7.method6954()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7615(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class209 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass39_Sub2_14.method6131();
		this.aClass39_Sub2_14.method6179(this.anInterface8_3);
		if (this.aBoolean325 || arg4) {
			this.aClass39_Sub2_14.method6093(Static99.aClass165_2, Static389.aClass165_3);
			this.aClass39_Sub2_14.method6192(0, Static254.aClass111_2);
			this.aClass39_Sub2_14.method6203(arg3);
		} else {
			this.aClass39_Sub2_14.method6093(Static99.aClass165_2, Static99.aClass165_2);
		}
		@Pc(43) Class181_Sub2 local43 = this.aClass39_Sub2_14.method6158();
		local43.oa(arg1, arg2, 0);
		this.aClass39_Sub2_14.method6089();
		this.aClass39_Sub2_14.method6200(this.aClass39_Sub2_14.aClass304_16);
		this.aClass39_Sub2_14.method6095(0, this.anInterface19_7);
		this.aClass39_Sub2_14.method6087(arg0 * 4, Static24.aClass281_1, 2);
		if (this.aBoolean325 || arg4) {
			this.aClass39_Sub2_14.method6192(0, Static132.aClass111_1);
		}
	}
}
