import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!dea", name = "B", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_6;

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "Lclient!co;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!dea", name = "x", descriptor = "Z")
	private final boolean aBoolean149;

	@OriginalMember(owner = "client!dea", name = "z", descriptor = "Lclient!el;")
	private final Interface9 anInterface9_5;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!ifa;Lclient!gda;[Lclient!pga;Z)V")
	public Class58_Sub2(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class261[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass44_Sub2_6 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class261 local15 = arg2[local10];
			if (local15.anInt7660 > local8) {
				local8 = local15.anInt7660;
			}
			if (local15.anInt7655 > local8) {
				local8 = local15.anInt7655;
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
			@Pc(51) Class261 local51 = arg2[local46];
			local54 = local51.anInt7660;
			@Pc(57) int local57 = local51.anInt7655;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray89 == null) {
				local83 = local51.aByteArray90;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray89;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method4311(Static362.aClass97_41, Static53.aClass42_4)) {
			this.anInterface6_1 = arg0.method4337(local37, false, local44, local37, Static362.aClass97_41);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface6_1 = arg0.method4250(local37, false, local162, local37);
		}
		this.aBoolean149 = true;
		this.anInterface6_1.method8268(Static307.aClass110_6);
		this.anInterface9_5 = arg0.method4286(false);
		this.anInterface9_5.method5102(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface9_5.method5100();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass44_Sub2_6.method4315(local373);
				@Pc(391) float local391 = this.anInterface6_1.method8282((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface6_1.method8285((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class261 local408 = arg2[local63];
					local75 = local408.anInt7660;
					local77 = local408.anInt7655;
					@Pc(417) int local417 = local408.anInt7656;
					local85 = local408.anInt7657;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.b()) {
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
				if (this.anInterface9_5.method5101()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method8163(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!dea", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass44_Sub2_6.method4274();
		this.aClass44_Sub2_6.method4265(this.anInterface6_1);
		if (this.aBoolean149 || arg4) {
			this.aClass44_Sub2_6.method4243(Static573.aClass117_9, Static379.aClass117_7);
			this.aClass44_Sub2_6.method4241(0, Static447.aClass328_3);
			this.aClass44_Sub2_6.method4285(arg3);
		} else {
			this.aClass44_Sub2_6.method4243(Static379.aClass117_7, Static379.aClass117_7);
		}
		@Pc(43) Class8_Sub3 local43 = this.aClass44_Sub2_6.method4281();
		local43.NA(arg1, arg2, 0);
		this.aClass44_Sub2_6.method4275();
		this.aClass44_Sub2_6.method4358(0, this.anInterface9_5);
		this.aClass44_Sub2_6.method4374(this.aClass44_Sub2_6.aClass3_17);
		this.aClass44_Sub2_6.method4262(2, arg0 * 4, Static344.aClass271_6);
		if (this.aBoolean149 || arg4) {
			this.aClass44_Sub2_6.method4241(0, Static519.aClass328_4);
		}
	}
}
