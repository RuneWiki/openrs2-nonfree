import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!kia", name = "z", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_11;

	@OriginalMember(owner = "client!kia", name = "x", descriptor = "Lclient!oia;")
	private final Interface19 anInterface19_4;

	@OriginalMember(owner = "client!kia", name = "B", descriptor = "Z")
	private final boolean aBoolean352;

	@OriginalMember(owner = "client!kia", name = "y", descriptor = "Lclient!lk;")
	private final Interface16 anInterface16_4;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!pga;Lclient!oq;[Lclient!tba;Z)V")
	public Class62_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class329[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass95_Sub3_11 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class329 local15 = arg2[local10];
			if (local15.anInt8812 > local8) {
				local8 = local15.anInt8812;
			}
			if (local15.anInt8813 > local8) {
				local8 = local15.anInt8813;
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
			@Pc(51) Class329 local51 = arg2[local46];
			local54 = local51.anInt8812;
			@Pc(57) int local57 = local51.anInt8813;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray100 == null) {
				local83 = local51.aByteArray101;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray100;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7103(Static588.aClass188_15, Static290.aClass189_11)) {
			this.anInterface19_4 = arg0.method7031(false, local37, local37, local44, Static588.aClass188_15);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface19_4 = arg0.method7116(false, local37, local37, local162);
		}
		this.aBoolean352 = true;
		this.anInterface19_4.method7837(Static499.aClass328_9);
		this.anInterface16_4 = arg0.method7122(false);
		this.anInterface16_4.method7457(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface16_4.method7456();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass95_Sub3_11.method7086(local373);
				@Pc(391) float local391 = this.anInterface19_4.method3136((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface19_4.method3137((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class329 local408 = arg2[local63];
					local75 = local408.anInt8812;
					local77 = local408.anInt8813;
					@Pc(417) int local417 = local408.anInt8814;
					local85 = local408.anInt8816;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.a()) {
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
				if (this.anInterface16_4.method7458()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass95_Sub3_11.method7020();
		this.aClass95_Sub3_11.method7112(this.anInterface19_4);
		if (this.aBoolean352 || arg4) {
			this.aClass95_Sub3_11.method7023(Static483.aClass136_6, Static225.aClass136_3);
			this.aClass95_Sub3_11.method7139(0, Static185.aClass291_3);
			this.aClass95_Sub3_11.method7079(arg3);
		} else {
			this.aClass95_Sub3_11.method7023(Static225.aClass136_3, Static225.aClass136_3);
		}
		@Pc(43) Class177_Sub1 local43 = this.aClass95_Sub3_11.method7041();
		local43.method7869(arg1, arg2, 0);
		this.aClass95_Sub3_11.method7062();
		this.aClass95_Sub3_11.method7054(0, this.anInterface16_4);
		this.aClass95_Sub3_11.method7059(this.aClass95_Sub3_11.aClass72_19);
		this.aClass95_Sub3_11.method7114(arg0 * 4, 2, Static482.aClass30_5);
		if (this.aBoolean352 || arg4) {
			this.aClass95_Sub3_11.method7139(0, Static634.aClass291_4);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5696(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
