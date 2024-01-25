import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!jfa", name = "y", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_12;

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lclient!gl;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!jfa", name = "z", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!jfa", name = "x", descriptor = "Lclient!mha;")
	private final Interface16 anInterface16_12;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!sf;Lclient!kc;[Lclient!gs;Z)V")
	public Class69_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class150[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass16_Sub1_12 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class150 local15 = arg2[local10];
			if (local15.anInt3828 > local8) {
				local8 = local15.anInt3828;
			}
			if (local15.anInt3831 > local8) {
				local8 = local15.anInt3831;
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
			@Pc(51) Class150 local51 = arg2[local46];
			local54 = local51.anInt3828;
			@Pc(57) int local57 = local51.anInt3831;
			local63 = local46 % 16 * local8;
			@Pc(69) int local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(88) int local88;
			if (local51.aByteArray33 == null) {
				local83 = local51.aByteArray34;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray33;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		if (arg0.method6292(Static553.aClass330_14, Static550.aClass361_15)) {
			this.anInterface11_1 = arg0.method6301(Static550.aClass361_15, local37, local37, local44, false);
		} else {
			@Pc(162) int[] local162 = new int[local44.length];
			for (local54 = 0; local54 < local44.length; local54++) {
				local162[local54] = local44[local54] << 24;
			}
			this.anInterface11_1 = arg0.method6276(local37, false, local37, local162);
		}
		this.aBoolean406 = true;
		this.anInterface11_1.method8758(Static268.aClass395_9);
		this.anInterface16_12 = arg0.method6244(false);
		this.anInterface16_12.method6040(20480, 20);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface16_12.method6041();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass16_Sub1_12.method6328(local373);
				@Pc(391) float local391 = this.anInterface11_1.method8762((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface11_1.method8766((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class150 local408 = arg2[local63];
					local75 = local408.anInt3828;
					local77 = local408.anInt3831;
					@Pc(417) int local417 = local408.anInt3826;
					local85 = local408.anInt3830;
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
				local381.b();
				if (this.anInterface16_12.method6039()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7459(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!jfa", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass16_Sub1_12.method6216();
		this.aClass16_Sub1_12.method6197(this.anInterface11_1);
		if (this.aBoolean406 || arg4) {
			this.aClass16_Sub1_12.method6241(Static458.aClass11_4, Static19.aClass11_1);
			this.aClass16_Sub1_12.method6284(Static262.aClass188_2, 0);
			this.aClass16_Sub1_12.method6263(arg3);
		} else {
			this.aClass16_Sub1_12.method6241(Static19.aClass11_1, Static19.aClass11_1);
		}
		@Pc(43) Class25_Sub3 local43 = this.aClass16_Sub1_12.method6207();
		local43.method4303(arg1, arg2, 0);
		this.aClass16_Sub1_12.method6256();
		this.aClass16_Sub1_12.method6257(0, this.anInterface16_12);
		this.aClass16_Sub1_12.method6287(this.aClass16_Sub1_12.aClass277_18);
		this.aClass16_Sub1_12.method6320(2, Static351.aClass44_3, arg0 * 4);
		if (this.aBoolean406 || arg4) {
			this.aClass16_Sub1_12.method6284(Static70.aClass188_1, 0);
		}
	}
}
