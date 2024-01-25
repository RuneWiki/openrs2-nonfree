import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!mea", name = "z", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_16;

	@OriginalMember(owner = "client!mea", name = "B", descriptor = "Lclient!cf;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!mea", name = "A", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!mea", name = "y", descriptor = "Lclient!bl;")
	private final Interface6 anInterface6_10;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!jj;Lclient!cd;[Lclient!cu;Z)V")
	public Class67_Sub2(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class64[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass75_Sub1_16 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class64 local15 = arg2[local10];
			if (local15.anInt1297 > local8) {
				local8 = local15.anInt1297;
			}
			if (local15.anInt1300 > local8) {
				local8 = local15.anInt1300;
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
			@Pc(51) Class64 local51 = arg2[local46];
			local54 = local51.anInt1297;
			@Pc(57) int local57 = local51.anInt1300;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray11 == null) {
				local83 = local51.aByteArray12;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray11;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6786(Static435.aClass274_13, Static212.aClass155_46)) {
			this.anInterface7_4 = arg0.method6825(local37, false, local44, Static212.aClass155_46, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface7_4 = arg0.method6727(local37, false, local162, local37);
		}
		this.aBoolean461 = true;
		this.anInterface7_4.method8704(Static389.aClass338_14);
		this.anInterface6_10 = arg0.method6768(false);
		this.anInterface6_10.method3659(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface6_10.method3658();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass75_Sub1_16.method6788(local373);
				@Pc(391) float local391 = this.anInterface7_4.method8719((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface7_4.method8720((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class64 local408 = arg2[local63];
					local75 = local408.anInt1297;
					local77 = local408.anInt1300;
					@Pc(417) int local417 = local408.anInt1301;
					local85 = local408.anInt1302;
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
				if (this.anInterface6_10.method3657()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mea", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass75_Sub1_16.method6738();
		this.aClass75_Sub1_16.method6814(this.anInterface7_4);
		if (this.aBoolean461 || arg4) {
			this.aClass75_Sub1_16.method6743(Static571.aClass344_5, Static257.aClass344_2);
			this.aClass75_Sub1_16.method6795(0, Static389.aClass261_8);
			this.aClass75_Sub1_16.method6801(arg3);
		} else {
			this.aClass75_Sub1_16.method6743(Static571.aClass344_5, Static571.aClass344_5);
		}
		@Pc(43) Class109_Sub3 local43 = this.aClass75_Sub1_16.method6734();
		local43.method4606(arg1, arg2, 0);
		this.aClass75_Sub1_16.method6820();
		this.aClass75_Sub1_16.method6827(this.anInterface6_10, 0);
		this.aClass75_Sub1_16.method6753(this.aClass75_Sub1_16.aClass207_20);
		this.aClass75_Sub1_16.method6853(Static492.aClass51_6, 2, arg0 * 4);
		if (this.aBoolean461 || arg4) {
			this.aClass75_Sub1_16.method6795(0, Static24.aClass261_1);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
