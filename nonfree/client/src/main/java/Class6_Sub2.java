import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_4;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Lclient!tr;")
	private final Interface25 anInterface25_2;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "Z")
	private final boolean aBoolean301;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "Lclient!am;")
	private final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!rv;Lclient!rc;[Lclient!jn;Z)V")
	public Class6_Sub2(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class298 arg1, @OriginalArg(2) Class176[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass126_Sub2_4 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class176 local15 = arg2[local10];
			if (local15.anInt4438 > local8) {
				local8 = local15.anInt4438;
			}
			if (local15.anInt4437 > local8) {
				local8 = local15.anInt4437;
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
			@Pc(51) Class176 local51 = arg2[local46];
			local54 = local51.anInt4438;
			@Pc(57) int local57 = local51.anInt4437;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray41 == null) {
				local83 = local51.aByteArray40;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray41;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method5453(Static385.aClass247_14, Static225.aClass281_13)) {
			this.anInterface25_2 = arg0.method5492(local44, local37, Static225.aClass281_13, local37, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface25_2 = arg0.method5553(local37, local162, false, local37);
		}
		this.aBoolean301 = true;
		this.anInterface25_2.method7609(Static86.aClass189_6);
		this.anInterface1_3 = arg0.method5530(false);
		this.anInterface1_3.method7715(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface1_3.method7714();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass126_Sub2_4.method5446(local373);
				@Pc(391) float local391 = this.anInterface25_2.method7624((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface25_2.method7631((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class176 local408 = arg2[local63];
					local75 = local408.anInt4438;
					local77 = local408.anInt4437;
					@Pc(417) int local417 = local408.anInt4439;
					local85 = local408.anInt4434;
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
				if (this.anInterface1_3.method7717()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass126_Sub2_4.method5510();
		this.aClass126_Sub2_4.method5449(this.anInterface25_2);
		if (this.aBoolean301 || arg4) {
			this.aClass126_Sub2_4.method5475(Static101.aClass10_2, Static247.aClass10_4);
			this.aClass126_Sub2_4.method5466(0, Static645.aClass294_5);
			this.aClass126_Sub2_4.method5496(arg3);
		} else {
			this.aClass126_Sub2_4.method5475(Static247.aClass10_4, Static247.aClass10_4);
		}
		@Pc(43) Class117_Sub2 local43 = this.aClass126_Sub2_4.method5472();
		local43.method7244(arg1, arg2, 0);
		this.aClass126_Sub2_4.method5468();
		this.aClass126_Sub2_4.method5451(0, this.anInterface1_3);
		this.aClass126_Sub2_4.method5524(this.aClass126_Sub2_4.aClass203_20);
		this.aClass126_Sub2_4.method5454(Static28.aClass23_1, 2, arg0 * 4);
		if (this.aBoolean301 || arg4) {
			this.aClass126_Sub2_4.method5466(0, Static256.aClass294_4);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7204(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
