import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class92_Sub5 extends Class92 {

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_13;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "Lclient!em;")
	private final Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "Z")
	private final boolean aBoolean550;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "Lclient!ii;")
	private final Interface13 anInterface13_13;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!kea;Lclient!ub;[Lclient!iba;Z)V")
	public Class92_Sub5(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class140[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass14_Sub2_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class140 local15 = arg2[local10];
			if (local15.anInt4129 > local8) {
				local8 = local15.anInt4129;
			}
			if (local15.anInt4127 > local8) {
				local8 = local15.anInt4127;
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
			@Pc(51) Class140 local51 = arg2[local46];
			local54 = local51.anInt4129;
			@Pc(57) int local57 = local51.anInt4127;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray38 == null) {
				local83 = local51.aByteArray39;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray38;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6924(Static239.aClass161_12, Static145.aClass219_10)) {
			this.anInterface6_2 = arg0.method6934(local37, local44, false, Static145.aClass219_10, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface6_2 = arg0.method6950(local37, local162, local37, false);
		}
		this.aBoolean550 = true;
		this.anInterface6_2.method7587(Static176.aClass164_9);
		this.anInterface13_13 = arg0.method7004(false);
		this.anInterface13_13.method1884(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface13_13.method4095();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass14_Sub2_13.method6939(local373);
				@Pc(391) float local391 = this.anInterface6_2.method7604((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface6_2.method7600((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class140 local408 = arg2[local63];
					local75 = local408.anInt4129;
					local77 = local408.anInt4127;
					@Pc(417) int local417 = local408.anInt4126;
					local85 = local408.anInt4125;
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
				if (this.anInterface13_13.method4094()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method6398(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class86 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass14_Sub2_13.method6929();
		this.aClass14_Sub2_13.method7034(this.anInterface6_2);
		if (this.aBoolean550 || arg4) {
			this.aClass14_Sub2_13.method6935(Static41.aClass228_10, Static568.aClass228_14);
			this.aClass14_Sub2_13.method6912(Static113.aClass138_2, 0);
			this.aClass14_Sub2_13.method7025(arg3);
		} else {
			this.aClass14_Sub2_13.method6935(Static568.aClass228_14, Static568.aClass228_14);
		}
		@Pc(43) Class54_Sub3 local43 = this.aClass14_Sub2_13.method7012();
		local43.GA(arg1, arg2, 0);
		this.aClass14_Sub2_13.method7033();
		this.aClass14_Sub2_13.method6994(0, this.anInterface13_13);
		this.aClass14_Sub2_13.method6944(this.aClass14_Sub2_13.aClass28_19);
		this.aClass14_Sub2_13.method6991(Static232.aClass311_6, 2, arg0 * 4);
		if (this.aBoolean550 || arg4) {
			this.aClass14_Sub2_13.method6912(Static185.aClass138_3, 0);
		}
	}
}
