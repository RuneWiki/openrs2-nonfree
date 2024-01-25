import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class111_Sub2 extends Class111 {

	@OriginalMember(owner = "client!hba", name = "D", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_5;

	@OriginalMember(owner = "client!hba", name = "E", descriptor = "Lclient!qaa;")
	private final Interface14 anInterface14_2;

	@OriginalMember(owner = "client!hba", name = "C", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!hba", name = "F", descriptor = "Lclient!cu;")
	private final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!fc;Lclient!sga;[Lclient!aw;Z)V")
	public Class111_Sub2(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass15_Sub2_5 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class20 local15 = arg2[local10];
			if (local15.anInt706 > local8) {
				local8 = local15.anInt706;
			}
			if (local15.anInt707 > local8) {
				local8 = local15.anInt707;
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
			@Pc(51) Class20 local51 = arg2[local46];
			local54 = local51.anInt706;
			@Pc(57) int local57 = local51.anInt707;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray6 == null) {
				local83 = local51.aByteArray5;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray6;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5443(Static379.aClass261_10, Static302.aClass200_11)) {
			this.anInterface14_2 = arg0.method5484(local37, local44, false, local37, Static379.aClass261_10);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface14_2 = arg0.method5385(local162, local37, local37, false);
		}
		this.aBoolean285 = true;
		this.anInterface14_2.method8222(Static39.aClass130_7);
		this.anInterface2_3 = arg0.method5383(false);
		this.anInterface2_3.method5805(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface2_3.method6243();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass15_Sub2_5.method5409(local373);
				@Pc(391) float local391 = this.anInterface14_2.method8239((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface14_2.method8242((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class20 local408 = arg2[local63];
					local75 = local408.anInt706;
					local77 = local408.anInt707;
					@Pc(417) int local417 = local408.anInt708;
					local85 = local408.anInt705;
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
				if (this.anInterface2_3.method6241()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method6671(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class93 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass15_Sub2_5.method5433();
		this.aClass15_Sub2_5.method5414(this.anInterface14_2);
		if (this.aBoolean285 || arg4) {
			this.aClass15_Sub2_5.method5430(Static65.aClass120_1, Static490.aClass120_5);
			this.aClass15_Sub2_5.method5444(0, Static531.aClass85_5);
			this.aClass15_Sub2_5.method5487(arg3);
		} else {
			this.aClass15_Sub2_5.method5430(Static490.aClass120_5, Static490.aClass120_5);
		}
		@Pc(43) Class255_Sub3 local43 = this.aClass15_Sub2_5.method5431();
		local43.GA(arg1, arg2, 0);
		this.aClass15_Sub2_5.method5445();
		this.aClass15_Sub2_5.method5376(0, this.anInterface2_3);
		this.aClass15_Sub2_5.method5391(this.aClass15_Sub2_5.aClass142_16);
		this.aClass15_Sub2_5.method5420(arg0 * 4, 2, Static34.aClass32_3);
		if (this.aBoolean285 || arg4) {
			this.aClass15_Sub2_5.method5444(0, Static159.aClass85_1);
		}
	}
}
