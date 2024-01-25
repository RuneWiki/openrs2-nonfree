import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class63_Sub4 extends Class63 {

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_17;

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "Lclient!dg;")
	private final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "Z")
	private final boolean aBoolean502;

	@OriginalMember(owner = "client!ns", name = "C", descriptor = "Lclient!rv;")
	private final Interface22 anInterface22_18;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!rl;Lclient!ej;[Lclient!oia;Z)V")
	public Class63_Sub4(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class251[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass82_Sub3_17 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class251 local15 = arg2[local10];
			if (local15.anInt7184 > local8) {
				local8 = local15.anInt7184;
			}
			if (local15.anInt7185 > local8) {
				local8 = local15.anInt7185;
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
			@Pc(51) Class251 local51 = arg2[local46];
			local54 = local51.anInt7184;
			@Pc(57) int local57 = local51.anInt7185;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray64 == null) {
				local83 = local51.aByteArray65;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray64;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5005(Static280.aClass182_8, Static491.aClass168_11)) {
			this.anInterface6_3 = arg0.method4934(Static491.aClass168_11, local37, false, local44, local37);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface6_3 = arg0.method5022(local162, local37, false, local37);
		}
		this.aBoolean502 = true;
		this.anInterface6_3.method8487(Static47.aClass324_1);
		this.anInterface22_18 = arg0.method4925(false);
		this.anInterface22_18.method1387(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface22_18.method1389();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass82_Sub3_17.method4986(local373);
				@Pc(391) float local391 = this.anInterface6_3.method8502((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface6_3.method8503((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class251 local408 = arg2[local63];
					local75 = local408.anInt7184;
					local77 = local408.anInt7185;
					@Pc(417) int local417 = local408.anInt7180;
					local85 = local408.anInt7183;
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
				if (this.anInterface22_18.method1390()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass82_Sub3_17.method4989();
		this.aClass82_Sub3_17.method4972(this.anInterface6_3);
		if (this.aBoolean502 || arg4) {
			this.aClass82_Sub3_17.method4908(Static131.aClass88_1, Static443.aClass88_3);
			this.aClass82_Sub3_17.method4928(0, Static302.aClass165_1);
			this.aClass82_Sub3_17.method4933(arg3);
		} else {
			this.aClass82_Sub3_17.method4908(Static443.aClass88_3, Static443.aClass88_3);
		}
		@Pc(43) Class31_Sub2 local43 = this.aClass82_Sub3_17.method4944();
		local43.method7921(arg1, arg2, 0);
		this.aClass82_Sub3_17.method4961();
		this.aClass82_Sub3_17.method4995(0, this.anInterface22_18);
		this.aClass82_Sub3_17.method4960(this.aClass82_Sub3_17.aClass43_22);
		this.aClass82_Sub3_17.method5023(Static52.aClass376_1, 2, arg0 * 4);
		if (this.aBoolean502 || arg4) {
			this.aClass82_Sub3_17.method4928(0, Static527.aClass165_4);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7767(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
