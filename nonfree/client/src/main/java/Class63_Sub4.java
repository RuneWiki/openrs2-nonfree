import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class63_Sub4 extends Class63 {

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_13;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "Lclient!mca;")
	private final Interface12 anInterface12_4;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "Lclient!og;")
	private final Interface15 anInterface15_9;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!rr;Lclient!ufa;[Lclient!wt;Z)V")
	public Class63_Sub4(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class365[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass31_Sub1_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class365 local15 = arg2[local10];
			if (local15.anInt10320 > local8) {
				local8 = local15.anInt10320;
			}
			if (local15.anInt10318 > local8) {
				local8 = local15.anInt10318;
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
			@Pc(51) Class365 local51 = arg2[local46];
			local54 = local51.anInt10320;
			@Pc(57) int local57 = local51.anInt10318;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray247 == null) {
				local83 = local51.aByteArray246;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray247;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method7080(Static331.aClass204_13, Static199.aClass245_11)) {
			this.anInterface12_4 = arg0.method7087(local44, false, Static199.aClass245_11, local37, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface12_4 = arg0.method7089(local162, local37, false, local37);
		}
		this.aBoolean451 = true;
		this.anInterface12_4.method7711(Static64.aClass65_5);
		this.anInterface15_9 = arg0.method7132(false);
		this.anInterface15_9.method5277(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface15_9.method5275();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass31_Sub1_13.method7154(local373);
				@Pc(391) float local391 = this.anInterface12_4.method2988((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface12_4.method2994((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class365 local408 = arg2[local63];
					local75 = local408.anInt10320;
					local77 = local408.anInt10318;
					@Pc(417) int local417 = local408.anInt10321;
					local85 = local408.anInt10316;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.a()) {
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
				if (this.anInterface15_9.method5276()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass31_Sub1_13.method7059();
		this.aClass31_Sub1_13.method7129(this.anInterface12_4);
		if (this.aBoolean451 || arg4) {
			this.aClass31_Sub1_13.method7136(Static486.aClass266_5, Static514.aClass266_6);
			this.aClass31_Sub1_13.method7155(0, Static438.aClass179_14);
			this.aClass31_Sub1_13.method7160(arg3);
		} else {
			this.aClass31_Sub1_13.method7136(Static514.aClass266_6, Static514.aClass266_6);
		}
		@Pc(43) Class42_Sub3 local43 = this.aClass31_Sub1_13.method7168();
		local43.NA(arg1, arg2, 0);
		this.aClass31_Sub1_13.method7128();
		this.aClass31_Sub1_13.method7113(this.anInterface15_9, 0);
		this.aClass31_Sub1_13.method7149(this.aClass31_Sub1_13.aClass1_17);
		this.aClass31_Sub1_13.method7057(2, arg0 * 4, Static87.aClass265_9);
		if (this.aBoolean451 || arg4) {
			this.aClass31_Sub1_13.method7155(0, Static402.aClass179_23);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method6896(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
