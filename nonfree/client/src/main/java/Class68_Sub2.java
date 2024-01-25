import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class68_Sub2 extends Class68 {

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_13;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Lclient!wfa;")
	private final Interface27 anInterface27_3;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Z")
	private final boolean aBoolean474;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "Lclient!tc;")
	private final Interface22 anInterface22_13;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!wga;Lclient!oea;[Lclient!rh;Z)V")
	public Class68_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) Class296[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass20_Sub2_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class296 local15 = arg2[local10];
			if (local15.anInt9024 > local8) {
				local8 = local15.anInt9024;
			}
			if (local15.anInt9028 > local8) {
				local8 = local15.anInt9028;
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
			@Pc(51) Class296 local51 = arg2[local46];
			local54 = local51.anInt9024;
			@Pc(57) int local57 = local51.anInt9028;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray116 == null) {
				local83 = local51.aByteArray117;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray116;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method1514(Static29.aClass26_4, Static155.aClass375_18)) {
			this.anInterface27_3 = arg0.method1578(local44, local37, Static155.aClass375_18, false, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface27_3 = arg0.method1473(local37, local37, false, local162);
		}
		this.aBoolean474 = true;
		this.anInterface27_3.method8287(Static486.aClass298_10);
		this.anInterface22_13 = arg0.method1523(false);
		this.anInterface22_13.method764(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface22_13.method763();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass20_Sub2_13.method1527(local373);
				@Pc(391) float local391 = this.anInterface27_3.method8301((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface27_3.method8305((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class296 local408 = arg2[local63];
					local75 = local408.anInt9024;
					local77 = local408.anInt9028;
					@Pc(417) int local417 = local408.anInt9026;
					local85 = local408.anInt9029;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.c()) {
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
				if (this.anInterface22_13.method762()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8109(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!kr", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass20_Sub2_13.method1561();
		this.aClass20_Sub2_13.method1484(this.anInterface27_3);
		if (this.aBoolean474 || arg4) {
			this.aClass20_Sub2_13.method1508(Static425.aClass315_3, Static492.aClass315_4);
			this.aClass20_Sub2_13.method1483(0, Static165.aClass177_3);
			this.aClass20_Sub2_13.method1528(arg3);
		} else {
			this.aClass20_Sub2_13.method1508(Static492.aClass315_4, Static492.aClass315_4);
		}
		@Pc(43) Class30_Sub2 local43 = this.aClass20_Sub2_13.method1568();
		local43.method4649(arg1, arg2, 0);
		this.aClass20_Sub2_13.method1549();
		this.aClass20_Sub2_13.method1559(this.anInterface22_13, 0);
		this.aClass20_Sub2_13.method1496(this.aClass20_Sub2_13.aClass22_19);
		this.aClass20_Sub2_13.method1533(2, arg0 * 4, Static150.aClass134_3);
		if (this.aBoolean474 || arg4) {
			this.aClass20_Sub2_13.method1483(0, Static118.aClass177_1);
		}
	}
}
