import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class59_Sub3 extends Class59 {

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_15;

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "Lclient!lba;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "Lclient!wba;")
	private final Interface25 anInterface25_11;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!mj;Lclient!rt;[Lclient!de;Z)V")
	public Class59_Sub3(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Class324 arg1, @OriginalArg(2) Class67[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass101_Sub1_15 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class67 local15 = arg2[local10];
			if (local15.anInt1759 > local8) {
				local8 = local15.anInt1759;
			}
			if (local15.anInt1761 > local8) {
				local8 = local15.anInt1761;
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
			@Pc(51) Class67 local51 = arg2[local46];
			local54 = local51.anInt1759;
			@Pc(57) int local57 = local51.anInt1761;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray20 == null) {
				local83 = local51.aByteArray19;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray20;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5850(Static612.aClass244_15, Static114.aClass79_7)) {
			this.anInterface10_5 = arg0.method5917(Static612.aClass244_15, false, local37, local44, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface10_5 = arg0.method5833(local37, local37, local162, false);
		}
		this.aBoolean440 = true;
		this.anInterface10_5.method9325(Static173.aClass315_8);
		this.anInterface25_11 = arg0.method5856(false);
		this.anInterface25_11.method9040(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface25_11.method9043();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass101_Sub1_15.method5942(local373);
				@Pc(391) float local391 = this.anInterface10_5.method9102((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface10_5.method9104((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class67 local408 = arg2[local63];
					local75 = local408.anInt1759;
					local77 = local408.anInt1761;
					@Pc(417) int local417 = local408.anInt1763;
					local85 = local408.anInt1760;
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
				if (this.anInterface25_11.method9041()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass101_Sub1_15.method5904();
		this.aClass101_Sub1_15.method5909(this.anInterface10_5);
		if (this.aBoolean440 || arg4) {
			this.aClass101_Sub1_15.method5891(Static512.aClass381_5, Static175.aClass381_3);
			this.aClass101_Sub1_15.method5954(0, Static660.aClass118_5);
			this.aClass101_Sub1_15.method5933(arg3);
		} else {
			this.aClass101_Sub1_15.method5891(Static512.aClass381_5, Static512.aClass381_5);
		}
		@Pc(43) Class76_Sub2 local43 = this.aClass101_Sub1_15.method5829();
		local43.method9639(arg1, arg2, 0);
		this.aClass101_Sub1_15.method5944();
		this.aClass101_Sub1_15.method5953(0, this.anInterface25_11);
		this.aClass101_Sub1_15.method5938(this.aClass101_Sub1_15.aClass167_19);
		this.aClass101_Sub1_15.method5853(arg0 * 4, Static70.aClass320_1, 2);
		if (this.aBoolean440 || arg4) {
			this.aClass101_Sub1_15.method5954(0, Static44.aClass118_1);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method9580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
