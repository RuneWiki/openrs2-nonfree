import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class294 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	public boolean aBoolean594 = true;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	private int anInt8424 = -1;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	private final int anInt8415;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!hha;")
	private final Class154 aClass154_2;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_33;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private final int anInt8413;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	private final int anInt8425;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!uka;")
	private Class86_Sub2 aClass86_Sub2_1;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!sb;")
	private Class161_Sub1 aClass161_Sub1_6;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!pi;Lclient!hha;Lclient!lja;IIIII)V")
	public Class294(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) Class159_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8415 = arg7;
		this.aClass154_2 = arg1;
		this.aClass144_Sub3_33 = arg0;
		this.anInt8413 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = local31 + (local35 + local37) * arg2.anInt9504;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray2[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt8425 = local27;
		if (local27 <= 0) {
			this.aClass161_Sub1_6 = null;
		} else {
			@Pc(101) Class14_Sub21 local101 = new Class14_Sub21(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass144_Sub3_33.aBoolean557) {
				for (local52 = 0; local52 < local25; local52++) {
					local118 = local31 + (local35 + local52) * arg2.anInt9504;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray2[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method7751(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local118 = arg2.anInt9504 * (local52 + local35) + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray2[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method7722(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface6_5 = this.aClass144_Sub3_33.method6991(false, local101.aByteArray99, local101.anInt8936);
			this.aClass86_Sub2_1 = new Class86_Sub2(this.aClass144_Sub3_33, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	private void method7336() {
		if (!this.aBoolean594) {
			return;
		}
		this.aBoolean594 = false;
		@Pc(17) byte[] local17 = this.aClass154_2.aByteArray53;
		@Pc(21) byte[] local21 = this.aClass144_Sub3_33.aByteArray85;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = this.aClass154_2.anInt4342;
		@Pc(37) int local37 = this.anInt8413 + this.aClass154_2.anInt4342 * this.anInt8415;
		@Pc(49) int local49;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local23 = (local23 << 8) - local23;
			for (local49 = -128; local49 < 0; local49++) {
				if (local17[local37++] != 0) {
					local23++;
				}
			}
			local37 += local27 - 128;
		}
		if (this.aClass161_Sub1_6 != null && this.anInt8424 == local23) {
			this.aBoolean594 = false;
			return;
		}
		this.anInt8424 = local23;
		local49 = 0;
		local37 = this.anInt8415 * local27 + this.anInt8413;
		for (@Pc(122) int local122 = -128; local122 < 0; local122++) {
			for (@Pc(126) int local126 = -128; local126 < 0; local126++) {
				if (local17[local37] == 0) {
					@Pc(148) int local148 = 0;
					if (local17[local37 - 1] != 0) {
						local148++;
					}
					if (local17[local37 + 1] != 0) {
						local148++;
					}
					if (local17[local37 - local27] != 0) {
						local148++;
					}
					if (local17[local37 + local27] != 0) {
						local148++;
					}
					local21[local49++] = (byte) (local148 * 17);
				} else {
					local21[local49++] = 68;
				}
				local37++;
			}
			local37 += this.aClass154_2.anInt4342 - 128;
		}
		if (this.aClass161_Sub1_6 == null) {
			this.aClass161_Sub1_6 = new Class161_Sub1(this.aClass144_Sub3_33, 3553, 6406, 128, 128, false, this.aClass144_Sub3_33.aByteArray85, 6406, false);
			this.aClass161_Sub1_6.method3971(false, false);
			this.aClass161_Sub1_6.method9173(true);
		} else {
			this.aClass161_Sub1_6.method3972(128, this.aClass144_Sub3_33.aByteArray85, 6406, false, 128);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public void method7338() {
		this.method7339(this.anInt8425, this.anInterface6_5);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!fb;)V")
	private void method7339(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		if (arg0 != 0) {
			this.method7336();
			this.aClass144_Sub3_33.method6982(this.aClass161_Sub1_6);
			this.aClass144_Sub3_33.method7029(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIIB)V")
	public void method7342(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub2_1.method8717(this.aClass144_Sub3_33.method6999(5123) * arg1, arg0);
		this.method7339(arg1, this.aClass86_Sub2_1);
	}
}
