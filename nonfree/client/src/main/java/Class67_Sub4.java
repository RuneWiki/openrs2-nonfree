import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class67_Sub4 extends Class67 {

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_13;

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "Lclient!fk;")
	private final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!km;")
	private final Interface15 anInterface15_7;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ee;Lclient!eb;[Lclient!vf;Z)V")
	public Class67_Sub4(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class370[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass95_Sub1_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class370 local15 = arg2[local10];
			if (local15.anInt10490 > local8) {
				local8 = local15.anInt10490;
			}
			if (local15.anInt10491 > local8) {
				local8 = local15.anInt10491;
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
			@Pc(51) Class370 local51 = arg2[local46];
			local54 = local51.anInt10490;
			@Pc(57) int local57 = local51.anInt10491;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray97 == null) {
				local83 = local51.aByteArray96;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray97;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method8151(Static666.aClass389_16, Static111.aClass122_5)) {
			this.anInterface8_5 = arg0.method8112(local37, local37, false, local44, Static111.aClass122_5);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface8_5 = arg0.method8103(local37, local37, local162, false);
		}
		this.aBoolean295 = true;
		this.anInterface8_5.method7462(Static241.aClass8_5);
		this.anInterface15_7 = arg0.method8090(false);
		this.anInterface15_7.method5530(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface15_7.method5529();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass95_Sub1_13.method8157(local373);
				@Pc(391) float local391 = this.anInterface8_5.method7067((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface8_5.method7065((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class370 local408 = arg2[local63];
					local75 = local408.anInt10490;
					local77 = local408.anInt10491;
					@Pc(417) int local417 = local408.anInt10494;
					local85 = local408.anInt10493;
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
				if (this.anInterface15_7.method5528()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass95_Sub1_13.method8155();
		this.aClass95_Sub1_13.method8147(this.anInterface8_5);
		if (this.aBoolean295 || arg4) {
			this.aClass95_Sub1_13.method8195(Static617.aClass112_28, Static134.aClass112_9);
			this.aClass95_Sub1_13.method8108(0, Static576.aClass235_3);
			this.aClass95_Sub1_13.method8078(arg3);
		} else {
			this.aClass95_Sub1_13.method8195(Static134.aClass112_9, Static134.aClass112_9);
		}
		@Pc(43) Class17_Sub2 local43 = this.aClass95_Sub1_13.method8119();
		local43.method6231(arg1, arg2, 0);
		this.aClass95_Sub1_13.method8098();
		this.aClass95_Sub1_13.method8133(this.anInterface15_7, 0);
		this.aClass95_Sub1_13.method8166(this.aClass95_Sub1_13.aClass94_21);
		this.aClass95_Sub1_13.method8182(arg0 * 4, 2, Static163.aClass115_2);
		if (this.aBoolean295 || arg4) {
			this.aClass95_Sub1_13.method8108(0, Static665.aClass235_4);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7677(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
