import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class70_Sub5 extends Class70 {

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_20;

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "Lclient!ah;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "Z")
	private final boolean aBoolean695;

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "Lclient!fk;")
	private final Interface15 anInterface15_18;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!gca;Lclient!kaa;[Lclient!uh;Z)V")
	public Class70_Sub5(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class362[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass100_Sub1_20 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class362 local15 = arg2[local10];
			if (local15.anInt9728 > local8) {
				local8 = local15.anInt9728;
			}
			if (local15.anInt9727 > local8) {
				local8 = local15.anInt9727;
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
			@Pc(51) Class362 local51 = arg2[local46];
			local54 = local51.anInt9728;
			@Pc(57) int local57 = local51.anInt9727;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray99 == null) {
				local83 = local51.aByteArray98;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray99;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7885(Static104.aClass86_8, Static624.aClass358_16)) {
			this.anInterface2_6 = arg0.method7944(local44, local37, Static624.aClass358_16, local37, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface2_6 = arg0.method7875(false, local37, local162, local37);
		}
		this.aBoolean695 = true;
		this.anInterface2_6.method8896(Static78.aClass328_4);
		this.anInterface15_18 = arg0.method7920(false);
		this.anInterface15_18.method5733(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface15_18.method5735();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass100_Sub1_20.method7910(local373);
				@Pc(391) float local391 = this.anInterface2_6.method3681((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface2_6.method3685((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class362 local408 = arg2[local63];
					local75 = local408.anInt9728;
					local77 = local408.anInt9727;
					@Pc(417) int local417 = local408.anInt9725;
					local85 = local408.anInt9723;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.c()) {
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
				local381.b();
				if (this.anInterface15_18.method5734()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8425(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!ur", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub1_20.method7898();
		this.aClass100_Sub1_20.method7923(this.anInterface2_6);
		if (this.aBoolean695 || arg4) {
			this.aClass100_Sub1_20.method7904(Static653.aClass94_5, Static164.aClass94_1);
			this.aClass100_Sub1_20.method7970(Static520.aClass93_4, 0);
			this.aClass100_Sub1_20.method7873(arg3);
		} else {
			this.aClass100_Sub1_20.method7904(Static164.aClass94_1, Static164.aClass94_1);
		}
		@Pc(43) Class10_Sub2 local43 = this.aClass100_Sub1_20.method7956();
		local43.method4214(arg1, arg2, 0);
		this.aClass100_Sub1_20.method7992();
		this.aClass100_Sub1_20.method7868(this.anInterface15_18, 0);
		this.aClass100_Sub1_20.method7921(this.aClass100_Sub1_20.aClass124_17);
		this.aClass100_Sub1_20.method7986(Static37.aClass187_5, arg0 * 4, 2);
		if (this.aBoolean695 || arg4) {
			this.aClass100_Sub1_20.method7970(Static94.aClass93_2, 0);
		}
	}
}
