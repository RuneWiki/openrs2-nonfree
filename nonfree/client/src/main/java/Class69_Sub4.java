import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class69_Sub4 extends Class69 {

	@OriginalMember(owner = "client!po", name = "y", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_20;

	@OriginalMember(owner = "client!po", name = "A", descriptor = "Lclient!ec;")
	private final Interface7 anInterface7_5;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "Lclient!id;")
	private final Interface15 anInterface15_15;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!ai;Lclient!eia;[Lclient!eu;Z)V")
	public Class69_Sub4(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class97[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass13_Sub1_20 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class97 local15 = arg2[local10];
			if (local15.anInt2960 > local8) {
				local8 = local15.anInt2960;
			}
			if (local15.anInt2963 > local8) {
				local8 = local15.anInt2963;
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
			@Pc(51) Class97 local51 = arg2[local46];
			local54 = local51.anInt2960;
			@Pc(57) int local57 = local51.anInt2963;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray24 == null) {
				local83 = local51.aByteArray23;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray24;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7425(Static337.aClass327_12, Static246.aClass152_10)) {
			this.anInterface7_5 = arg0.method7446(local44, local37, local37, false, Static337.aClass327_12);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface7_5 = arg0.method7526(local37, local37, false, local162);
		}
		this.aBoolean569 = true;
		this.anInterface7_5.method8137(Static672.aClass385_43);
		this.anInterface15_15 = arg0.method7541(false);
		this.anInterface15_15.method8746(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface15_15.method8744();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass13_Sub1_20.method7409(local373);
				@Pc(391) float local391 = this.anInterface7_5.method5804((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface7_5.method5808((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class97 local408 = arg2[local63];
					local75 = local408.anInt2960;
					local77 = local408.anInt2963;
					@Pc(417) int local417 = local408.anInt2962;
					local85 = local408.anInt2964;
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
				local381.a();
				if (this.anInterface15_15.method8747()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass13_Sub1_20.method7489();
		this.aClass13_Sub1_20.method7530(this.anInterface7_5);
		if (this.aBoolean569 || arg4) {
			this.aClass13_Sub1_20.method7521(Static580.aClass203_4, Static265.aClass203_3);
			this.aClass13_Sub1_20.method7522(Static125.aClass326_1, 0);
			this.aClass13_Sub1_20.method7539(arg3);
		} else {
			this.aClass13_Sub1_20.method7521(Static265.aClass203_3, Static265.aClass203_3);
		}
		@Pc(43) Class239_Sub3 local43 = this.aClass13_Sub1_20.method7480();
		local43.method9234(arg1, arg2, 0);
		this.aClass13_Sub1_20.method7515();
		this.aClass13_Sub1_20.method7423(this.anInterface15_15, 0);
		this.aClass13_Sub1_20.method7472(this.aClass13_Sub1_20.aClass233_17);
		this.aClass13_Sub1_20.method7449(Static668.aClass393_6, 2, arg0 * 4);
		if (this.aBoolean569 || arg4) {
			this.aClass13_Sub1_20.method7522(Static523.aClass326_5, 0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8849(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
