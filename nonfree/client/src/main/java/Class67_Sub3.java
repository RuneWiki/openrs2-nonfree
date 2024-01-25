import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class67_Sub3 extends Class67 {

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_7;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Lclient!gq;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "Z")
	private final boolean aBoolean208;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "Lclient!lca;")
	private final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!re;Lclient!pe;[Lclient!ig;Z)V")
	public Class67_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class136[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass122_Sub2_7 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class136 local15 = arg2[local10];
			if (local15.anInt4054 > local8) {
				local8 = local15.anInt4054;
			}
			if (local15.anInt4055 > local8) {
				local8 = local15.anInt4055;
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
			@Pc(51) Class136 local51 = arg2[local46];
			local54 = local51.anInt4054;
			@Pc(57) int local57 = local51.anInt4055;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray53 == null) {
				local83 = local51.aByteArray52;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray53;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5618(Static431.aClass264_15, Static526.aClass292_15)) {
			this.anInterface3_3 = arg0.method5662(Static526.aClass292_15, local44, false, local37, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface3_3 = arg0.method5661(local37, false, local37, local162);
		}
		this.aBoolean208 = true;
		this.anInterface3_3.method7302(Static119.aClass113_4);
		this.anInterface5_3 = arg0.method5671(false);
		this.anInterface5_3.method5727(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface5_3.method5729();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass122_Sub2_7.method5555(local373);
				@Pc(391) float local391 = this.anInterface3_3.method7320((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface3_3.method7317((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class136 local408 = arg2[local63];
					local75 = local408.anInt4054;
					local77 = local408.anInt4055;
					@Pc(417) int local417 = local408.anInt4053;
					local85 = local408.anInt4052;
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
				local381.b();
				if (this.anInterface5_3.method5730()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass122_Sub2_7.method5616();
		this.aClass122_Sub2_7.method5651(this.anInterface3_3);
		if (this.aBoolean208 || arg4) {
			this.aClass122_Sub2_7.method5605(Static486.aClass271_5, Static449.aClass271_4);
			this.aClass122_Sub2_7.method5575(0, Static312.aClass181_4);
			this.aClass122_Sub2_7.method5634(arg3);
		} else {
			this.aClass122_Sub2_7.method5605(Static486.aClass271_5, Static486.aClass271_5);
		}
		@Pc(43) Class118_Sub3 local43 = this.aClass122_Sub2_7.method5654();
		local43.oa(arg1, arg2, 0);
		this.aClass122_Sub2_7.method5638();
		this.aClass122_Sub2_7.method5573(this.aClass122_Sub2_7.aClass170_14);
		this.aClass122_Sub2_7.method5665(this.anInterface5_3, 0);
		this.aClass122_Sub2_7.method5642(Static137.aClass22_1, arg0 * 4, 2);
		if (this.aBoolean208 || arg4) {
			this.aClass122_Sub2_7.method5575(0, Static162.aClass181_2);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7494(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class40 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
