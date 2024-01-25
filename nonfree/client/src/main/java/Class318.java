import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class318 {

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Z")
	public boolean aBoolean671 = true;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	private int anInt9502 = -1;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_35;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!mha;")
	private final Class209 aClass209_2;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	private final int anInt9496;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	private final int anInt9495;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	private final int anInt9501;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!tp;")
	private Class85_Sub1 aClass85_Sub1_6;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!ni;")
	private Interface18 anInterface18_4;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!wv;")
	private Class67_Sub2 aClass67_Sub2_2;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!qo;Lclient!mha;Lclient!ed;IIIII)V")
	public Class318(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class65_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass20_Sub3_35 = arg0;
		this.aClass209_2 = arg1;
		this.anInt9496 = arg6;
		this.anInt9495 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = arg2.anInt9615 * (local35 + local37) + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray10[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt9501 = local27;
		if (local27 <= 0) {
			this.aClass85_Sub1_6 = null;
		} else {
			@Pc(99) Class2_Sub11 local99 = new Class2_Sub11(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass20_Sub3_35.aBoolean616) {
				for (local52 = 0; local52 < local25; local52++) {
					local118 = local31 + (local52 + local35) * arg2.anInt9615;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray10[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local99.method8333(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local118 = (local35 + local52) * arg2.anInt9615 + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray10[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local99.method8393(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface18_4 = this.aClass20_Sub3_35.method7320(local99.anInt10066, local99.aByteArray128, false);
			this.aClass67_Sub2_2 = new Class67_Sub2(this.aClass20_Sub3_35, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([BIIB)V")
	public void method7891(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass67_Sub2_2.method9227(arg0, this.aClass20_Sub3_35.method7372(5123) * arg1);
		this.method7894(this.aClass67_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public void method7892() {
		this.method7894(this.anInterface18_4, this.anInt9501);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ni;II)V")
	private void method7894(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method7896();
			this.aClass20_Sub3_35.method7358(this.aClass85_Sub1_6);
			this.aClass20_Sub3_35.method7346(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	private void method7896() {
		if (!this.aBoolean671) {
			return;
		}
		this.aBoolean671 = false;
		@Pc(16) byte[] local16 = this.aClass209_2.aByteArray92;
		@Pc(20) byte[] local20 = this.aClass20_Sub3_35.aByteArray111;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass209_2.anInt6955;
		@Pc(41) int local41 = this.anInt9496 + this.anInt9495 * this.aClass209_2.anInt6955;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local26 = (local26 << 8) - local26;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local41++] != 0) {
					local26++;
				}
			}
			local41 += local30 - 128;
		}
		if (this.aClass85_Sub1_6 != null && local26 == this.anInt9502) {
			this.aBoolean671 = false;
			return;
		}
		this.anInt9502 = local26;
		local41 = this.anInt9496 + local30 * this.anInt9495;
		local54 = 0;
		for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local16[local41] == 0) {
					@Pc(126) int local126 = 0;
					if (local16[local41 - 1] != 0) {
						local126++;
					}
					if (local16[local41 + 1] != 0) {
						local126++;
					}
					if (local16[local41 - local30] != 0) {
						local126++;
					}
					if (local16[local30 + local41] != 0) {
						local126++;
					}
					local20[local54++] = (byte) (local126 * 17);
				} else {
					local20[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass209_2.anInt6955 - 128;
		}
		if (this.aClass85_Sub1_6 == null) {
			this.aClass85_Sub1_6 = new Class85_Sub1(this.aClass20_Sub3_35, 3553, 6406, 128, 128, false, this.aClass20_Sub3_35.aByteArray111, 6406, false);
			this.aClass85_Sub1_6.method2893(false, false);
			this.aClass85_Sub1_6.method9102(true);
		} else {
			this.aClass85_Sub1_6.method2898(128, false, 128, 6406, this.aClass20_Sub3_35.aByteArray111);
		}
	}
}
