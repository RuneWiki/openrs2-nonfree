import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "Lclient!ls;")
	private final Interface14 anInterface14_2;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Lclient!nba;")
	private final Interface16 anInterface16_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!en;Lclient!sa;[Lclient!aga;Z)V")
	public Class29_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class294 arg1, @OriginalArg(2) Class13[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass100_Sub1_1 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class13 local15 = arg2[local10];
			if (local15.anInt428 > local8) {
				local8 = local15.anInt428;
			}
			if (local15.anInt427 > local8) {
				local8 = local15.anInt427;
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
			@Pc(51) Class13 local51 = arg2[local46];
			local54 = local51.anInt428;
			@Pc(57) int local57 = local51.anInt427;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray4 == null) {
				local83 = local51.aByteArray3;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray4;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method4794(Static47.aClass42_4, Static104.aClass88_3)) {
			this.anInterface14_2 = arg0.method4869(local44, local37, local37, Static104.aClass88_3, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface14_2 = arg0.method4838(local37, false, local37, local162);
		}
		this.aBoolean37 = true;
		this.anInterface14_2.method7050(Static118.aClass227_2);
		this.anInterface16_1 = arg0.method4837(false);
		this.anInterface16_1.method5776(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface16_1.method5775();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass100_Sub1_1.method4834(local373);
				@Pc(391) float local391 = this.anInterface14_2.method7070((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface14_2.method7065((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class13 local408 = arg2[local63];
					local75 = local408.anInt428;
					local77 = local408.anInt427;
					@Pc(417) int local417 = local408.anInt430;
					local85 = local408.anInt429;
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
				if (this.anInterface16_1.method5774()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7122(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!bb", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub1_1.method4848();
		this.aClass100_Sub1_1.method4876(this.anInterface14_2);
		if (this.aBoolean37 || arg4) {
			this.aClass100_Sub1_1.method4797(Static291.aClass236_2, Static458.aClass236_4);
			this.aClass100_Sub1_1.method4883(0, Static224.aClass119_18);
			this.aClass100_Sub1_1.method4877(arg3);
		} else {
			this.aClass100_Sub1_1.method4797(Static291.aClass236_2, Static291.aClass236_2);
		}
		@Pc(43) Class68_Sub2 local43 = this.aClass100_Sub1_1.method4878();
		local43.NA(arg1, arg2, 0);
		this.aClass100_Sub1_1.method4858();
		this.aClass100_Sub1_1.method4863(this.anInterface16_1, 0);
		this.aClass100_Sub1_1.method4757(this.aClass100_Sub1_1.aClass199_15);
		this.aClass100_Sub1_1.method4849(Static339.aClass213_3, arg0 * 4, 2);
		if (this.aBoolean37 || arg4) {
			this.aClass100_Sub1_1.method4883(0, Static325.aClass119_44);
		}
	}
}
