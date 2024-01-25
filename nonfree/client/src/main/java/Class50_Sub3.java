import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_9;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "Lclient!ch;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Lclient!ll;")
	private final Interface17 anInterface17_3;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!wu;Lclient!hia;[Lclient!fg;Z)V")
	public Class50_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class98[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass100_Sub1_9 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class98 local15 = arg2[local10];
			if (local15.anInt2799 > local8) {
				local8 = local15.anInt2799;
			}
			if (local15.anInt2796 > local8) {
				local8 = local15.anInt2796;
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
			@Pc(51) Class98 local51 = arg2[local46];
			local54 = local51.anInt2799;
			@Pc(57) int local57 = local51.anInt2796;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray44 == null) {
				local83 = local51.aByteArray45;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray44;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6050(Static409.aClass242_13, Static598.aClass250_15)) {
			this.anInterface3_3 = arg0.method6125(local37, false, local44, Static598.aClass250_15, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface3_3 = arg0.method6097(false, local37, local162, local37);
		}
		this.aBoolean188 = true;
		this.anInterface3_3.method7827(Static514.aClass82_10);
		this.anInterface17_3 = arg0.method6123(false);
		this.anInterface17_3.method8440(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface17_3.method8438();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass100_Sub1_9.method6131(local373);
				@Pc(391) float local391 = this.anInterface3_3.method7846((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface3_3.method7845((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class98 local408 = arg2[local63];
					local75 = local408.anInt2799;
					local77 = local408.anInt2796;
					@Pc(417) int local417 = local408.anInt2798;
					local85 = local408.anInt2797;
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
				if (this.anInterface17_3.method8439()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5738(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!ev", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub1_9.method6051();
		this.aClass100_Sub1_9.method6033(this.anInterface3_3);
		if (this.aBoolean188 || arg4) {
			this.aClass100_Sub1_9.method6039(Static266.aClass256_3, Static436.aClass256_4);
			this.aClass100_Sub1_9.method6068(0, Static456.aClass187_2);
			this.aClass100_Sub1_9.method6154(arg3);
		} else {
			this.aClass100_Sub1_9.method6039(Static436.aClass256_4, Static436.aClass256_4);
		}
		@Pc(43) Class154_Sub2 local43 = this.aClass100_Sub1_9.method6073();
		local43.method6559(arg1, arg2, 0);
		this.aClass100_Sub1_9.method6145();
		this.aClass100_Sub1_9.method6128(0, this.anInterface17_3);
		this.aClass100_Sub1_9.method6107(this.aClass100_Sub1_9.aClass293_16);
		this.aClass100_Sub1_9.method6147(Static364.aClass77_3, arg0 * 4, 2);
		if (this.aBoolean188 || arg4) {
			this.aClass100_Sub1_9.method6068(0, Static622.aClass187_4);
		}
	}
}
