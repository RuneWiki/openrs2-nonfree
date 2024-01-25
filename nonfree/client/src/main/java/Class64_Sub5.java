import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class64_Sub5 extends Class64 {

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_20;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "Lclient!oi;")
	private final Interface14 anInterface14_5;

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "Z")
	private final boolean aBoolean628;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "Lclient!bca;")
	private final Interface4 anInterface4_13;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!hea;Lclient!uq;[Lclient!fg;Z)V")
	public Class64_Sub5(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Class334 arg1, @OriginalArg(2) Class102[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass134_Sub1_20 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class102 local15 = arg2[local10];
			if (local15.anInt2626 > local8) {
				local8 = local15.anInt2626;
			}
			if (local15.anInt2624 > local8) {
				local8 = local15.anInt2624;
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
			@Pc(51) Class102 local51 = arg2[local46];
			local54 = local51.anInt2626;
			@Pc(57) int local57 = local51.anInt2624;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray31 == null) {
				local83 = local51.aByteArray32;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray31;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6820(Static215.aClass155_10, Static194.aClass203_8)) {
			this.anInterface14_5 = arg0.method6753(false, Static194.aClass203_8, local37, local44, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface14_5 = arg0.method6821(local37, false, local162, local37);
		}
		this.aBoolean628 = true;
		this.anInterface14_5.method5452(Static167.aClass115_6);
		this.anInterface4_13 = arg0.method6805(false);
		this.anInterface4_13.method2468(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface4_13.method2465();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass134_Sub1_20.method6846(local373);
				@Pc(391) float local391 = this.anInterface14_5.method2128((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface14_5.method2133((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class102 local408 = arg2[local63];
					local75 = local408.anInt2626;
					local77 = local408.anInt2624;
					@Pc(417) int local417 = local408.anInt2625;
					local85 = local408.anInt2622;
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
				if (this.anInterface4_13.method2466()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass134_Sub1_20.method6826();
		this.aClass134_Sub1_20.method6766(this.anInterface14_5);
		if (this.aBoolean628 || arg4) {
			this.aClass134_Sub1_20.method6770(Static447.aClass82_5, Static292.aClass82_4);
			this.aClass134_Sub1_20.method6742(0, Static308.aClass192_1);
			this.aClass134_Sub1_20.method6738(arg3);
		} else {
			this.aClass134_Sub1_20.method6770(Static447.aClass82_5, Static447.aClass82_5);
		}
		@Pc(43) Class113_Sub3 local43 = this.aClass134_Sub1_20.method6764();
		local43.NA(arg1, arg2, 0);
		this.aClass134_Sub1_20.method6773();
		this.aClass134_Sub1_20.method6829(0, this.anInterface4_13);
		this.aClass134_Sub1_20.method6743(this.aClass134_Sub1_20.aClass284_19);
		this.aClass134_Sub1_20.method6723(Static567.aClass185_6, arg0 * 4, 2);
		if (this.aBoolean628 || arg4) {
			this.aClass134_Sub1_20.method6742(0, Static430.aClass192_2);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method6603(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class204 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
