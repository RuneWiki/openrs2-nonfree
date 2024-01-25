import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_2;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!baa;")
	private final Interface2 anInterface2_1;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "Z")
	private final boolean aBoolean48;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Lclient!u;")
	private final Interface26 anInterface26_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!bm;Lclient!tba;[Lclient!be;Z)V")
	public Class25_Sub1(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class315 arg1, @OriginalArg(2) Class28[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass33_Sub1_2 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class28 local15 = arg2[local10];
			if (local15.anInt616 > local8) {
				local8 = local15.anInt616;
			}
			if (local15.anInt618 > local8) {
				local8 = local15.anInt618;
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
			@Pc(51) Class28 local51 = arg2[local46];
			local54 = local51.anInt616;
			@Pc(57) int local57 = local51.anInt618;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray3 == null) {
				local83 = local51.aByteArray2;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray3;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method2007(Static137.aClass89_8, Static104.aClass82_3)) {
			this.anInterface2_1 = arg0.method1992(local37, local37, local44, false, Static104.aClass82_3);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface2_1 = arg0.method2023(local162, false, local37, local37);
		}
		this.aBoolean48 = true;
		this.anInterface2_1.method7294(Static310.aClass26_7);
		this.anInterface26_1 = arg0.method2008(false);
		this.anInterface26_1.method7633(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface26_1.method7632();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass33_Sub1_2.method2092(local373);
				@Pc(391) float local391 = this.anInterface2_1.method6503((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface2_1.method6504((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class28 local408 = arg2[local63];
					local75 = local408.anInt616;
					local77 = local408.anInt618;
					@Pc(417) int local417 = local408.anInt614;
					local85 = local408.anInt617;
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
				local381.a();
				if (this.anInterface26_1.method7635()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5845(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!bb", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass33_Sub1_2.method2005();
		this.aClass33_Sub1_2.method1987(this.anInterface2_1);
		if (this.aBoolean48 || arg4) {
			this.aClass33_Sub1_2.method1983(Static25.aClass363_1, Static64.aClass363_7);
			this.aClass33_Sub1_2.method2098(0, Static139.aClass371_3);
			this.aClass33_Sub1_2.method1996(arg3);
		} else {
			this.aClass33_Sub1_2.method1983(Static64.aClass363_7, Static64.aClass363_7);
		}
		@Pc(43) Class47_Sub3 local43 = this.aClass33_Sub1_2.method2052();
		local43.method7863(arg1, arg2, 0);
		this.aClass33_Sub1_2.method2042();
		this.aClass33_Sub1_2.method2046(this.anInterface26_1, 0);
		this.aClass33_Sub1_2.method2003(this.aClass33_Sub1_2.aClass34_19);
		this.aClass33_Sub1_2.method2039(2, Static88.aClass304_2, arg0 * 4);
		if (this.aBoolean48 || arg4) {
			this.aClass33_Sub1_2.method2098(0, Static419.aClass371_4);
		}
	}
}
