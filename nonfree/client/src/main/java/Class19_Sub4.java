import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_16;

	@OriginalMember(owner = "client!nca", name = "A", descriptor = "Lclient!bw;")
	private final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!nca", name = "z", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!nca", name = "y", descriptor = "Lclient!fw;")
	private final Interface12 anInterface12_9;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!lba;Lclient!hw;[Lclient!fm;Z)V")
	public Class19_Sub4(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class112[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass132_Sub1_16 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class112 local15 = arg2[local10];
			if (local15.anInt2740 > local8) {
				local8 = local15.anInt2740;
			}
			if (local15.anInt2743 > local8) {
				local8 = local15.anInt2743;
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
			@Pc(51) Class112 local51 = arg2[local46];
			local54 = local51.anInt2740;
			@Pc(57) int local57 = local51.anInt2743;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray30 == null) {
				local83 = local51.aByteArray31;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray30;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7634(Static417.aClass250_14, Static447.aClass265_15)) {
			this.anInterface2_4 = arg0.method7550(local37, local37, local44, false, Static447.aClass265_15);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface2_4 = arg0.method7590(local37, local37, false, local162);
		}
		this.aBoolean426 = true;
		this.anInterface2_4.method8893(Static403.aClass59_9);
		this.anInterface12_9 = arg0.method7564(false);
		this.anInterface12_9.method8889(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface12_9.method8888();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass132_Sub1_16.method7592(local373);
				@Pc(391) float local391 = this.anInterface2_4.method8898((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface2_4.method8900((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class112 local408 = arg2[local63];
					local75 = local408.anInt2740;
					local77 = local408.anInt2743;
					@Pc(417) int local417 = local408.anInt2741;
					local85 = local408.anInt2745;
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
				if (this.anInterface12_9.method8891()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass132_Sub1_16.method7522();
		this.aClass132_Sub1_16.method7635(this.anInterface2_4);
		if (this.aBoolean426 || arg4) {
			this.aClass132_Sub1_16.method7637(Static320.aClass322_5, Static131.aClass322_3);
			this.aClass132_Sub1_16.method7552(Static583.aClass378_3, 0);
			this.aClass132_Sub1_16.method7611(arg3);
		} else {
			this.aClass132_Sub1_16.method7637(Static320.aClass322_5, Static320.aClass322_5);
		}
		@Pc(43) Class207_Sub3 local43 = this.aClass132_Sub1_16.method7609();
		local43.method8212(arg1, arg2, 0);
		this.aClass132_Sub1_16.method7571();
		this.aClass132_Sub1_16.method7529(this.anInterface12_9, 0);
		this.aClass132_Sub1_16.method7628(this.aClass132_Sub1_16.aClass34_21);
		this.aClass132_Sub1_16.method7546(Static648.aClass60_6, arg0 * 4, 2);
		if (this.aBoolean426 || arg4) {
			this.aClass132_Sub1_16.method7552(Static368.aClass378_1, 0);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6337(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
