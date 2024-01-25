import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_5;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "Lclient!wn;")
	private final Interface20 anInterface20_2;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!lu;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!wr;Lclient!pu;[Lclient!bt;Z)V")
	public Class80_Sub1(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class40[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass42_Sub1_5 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class40 local15 = arg2[local10];
			if (local15.anInt894 > local8) {
				local8 = local15.anInt894;
			}
			if (local15.anInt895 > local8) {
				local8 = local15.anInt895;
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
			@Pc(51) Class40 local51 = arg2[local46];
			local54 = local51.anInt894;
			@Pc(57) int local57 = local51.anInt895;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray22 == null) {
				local83 = local51.aByteArray21;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray22;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5911(Static61.aClass72_1, Static155.aClass114_6)) {
			this.anInterface20_2 = arg0.method5969(local37, Static61.aClass72_1, false, local37, local44);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface20_2 = arg0.method5960(local37, local162, local37, false);
		}
		this.aBoolean211 = true;
		this.anInterface20_2.method6968(Static227.aClass101_5);
		this.anInterface10_5 = arg0.method5930(false);
		this.anInterface10_5.method7897(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface10_5.method7895();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass42_Sub1_5.method5871(local373);
				@Pc(391) float local391 = this.anInterface20_2.method6987((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface20_2.method6984((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class40 local408 = arg2[local63];
					local75 = local408.anInt894;
					local77 = local408.anInt895;
					@Pc(417) int local417 = local408.anInt896;
					local85 = local408.anInt897;
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
				if (this.anInterface10_5.method7899()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass42_Sub1_5.method5888();
		this.aClass42_Sub1_5.method5868(this.anInterface20_2);
		if (this.aBoolean211 || arg4) {
			this.aClass42_Sub1_5.method5945(Static506.aClass129_5, Static191.aClass129_3);
			this.aClass42_Sub1_5.method5951(Static371.aClass302_2, 0);
			this.aClass42_Sub1_5.method5935(arg3);
		} else {
			this.aClass42_Sub1_5.method5945(Static191.aClass129_3, Static191.aClass129_3);
		}
		@Pc(43) Class91_Sub2 local43 = this.aClass42_Sub1_5.method5994();
		local43.oa(arg1, arg2, 0);
		this.aClass42_Sub1_5.method5899();
		this.aClass42_Sub1_5.method5999(this.aClass42_Sub1_5.aClass287_14);
		this.aClass42_Sub1_5.method5877(this.anInterface10_5, 0);
		this.aClass42_Sub1_5.method5937(arg0 * 4, 2, Static338.aClass147_3);
		if (this.aBoolean211 || arg4) {
			this.aClass42_Sub1_5.method5951(Static159.aClass302_1, 0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7777(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
