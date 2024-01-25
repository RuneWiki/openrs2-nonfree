import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_7;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "Lclient!dca;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Lclient!wf;")
	private final Interface24 anInterface24_7;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nh;Lclient!ll;[Lclient!fda;Z)V")
	public Class45_Sub2(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class103[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass7_Sub1_7 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class103 local15 = arg2[local10];
			if (local15.anInt3041 > local8) {
				local8 = local15.anInt3041;
			}
			if (local15.anInt3039 > local8) {
				local8 = local15.anInt3039;
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
			@Pc(51) Class103 local51 = arg2[local46];
			local54 = local51.anInt3041;
			@Pc(57) int local57 = local51.anInt3039;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray22 == null) {
				local83 = local51.aByteArray23;
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
		if (arg0.method5660(Static129.aClass161_5, Static424.aClass273_12)) {
			this.anInterface4_3 = arg0.method5665(local44, local37, Static129.aClass161_5, local37, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface4_3 = arg0.method5699(local37, false, local37, local162);
		}
		this.aBoolean188 = true;
		this.anInterface4_3.method7869(Static47.aClass318_3);
		this.anInterface24_7 = arg0.method5704(false);
		this.anInterface24_7.method6549(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface24_7.method6550();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass7_Sub1_7.method5675(local373);
				@Pc(391) float local391 = this.anInterface4_3.method7374((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface4_3.method7377((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class103 local408 = arg2[local63];
					local75 = local408.anInt3041;
					local77 = local408.anInt3039;
					@Pc(417) int local417 = local408.anInt3038;
					local85 = local408.anInt3037;
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
				if (this.anInterface24_7.method6551()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass7_Sub1_7.method5782();
		this.aClass7_Sub1_7.method5694(this.anInterface4_3);
		if (this.aBoolean188 || arg4) {
			this.aClass7_Sub1_7.method5764(Static563.aClass95_5, Static468.aClass95_3);
			this.aClass7_Sub1_7.method5681(0, Static18.aClass61_1);
			this.aClass7_Sub1_7.method5712(arg3);
		} else {
			this.aClass7_Sub1_7.method5764(Static563.aClass95_5, Static563.aClass95_5);
		}
		@Pc(43) Class81_Sub1 local43 = this.aClass7_Sub1_7.method5695();
		local43.NA(arg1, arg2, 0);
		this.aClass7_Sub1_7.method5786();
		this.aClass7_Sub1_7.method5721(this.anInterface24_7, 0);
		this.aClass7_Sub1_7.method5754(this.aClass7_Sub1_7.aClass82_19);
		this.aClass7_Sub1_7.method5760(2, arg0 * 4, Static162.aClass119_1);
		if (this.aBoolean188 || arg4) {
			this.aClass7_Sub1_7.method5681(0, Static411.aClass61_5);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method4844(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class67 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
