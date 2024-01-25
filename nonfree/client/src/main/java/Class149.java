import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class149 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Z")
	public boolean aBoolean304 = true;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
	private int anInt4154 = -1;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_23;

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
	private final int anInt4152;

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!gb;")
	private final Class89 aClass89_2;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
	private final int anInt4147;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	private final int anInt4146;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!rt;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Lclient!gu;")
	private Class41_Sub2 aClass41_Sub2_1;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!ml;")
	private Class55_Sub3 aClass55_Sub3_6;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!ef;Lclient!gb;Lclient!eg;IIIII)V")
	public Class149(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) Class64_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass49_Sub2_23 = arg0;
		this.anInt4152 = arg7;
		this.aClass89_2 = arg1;
		this.anInt4147 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = (local35 + local37) * arg2.anInt2934 + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4146 = local27;
		if (local27 <= 0) {
			this.aClass55_Sub3_6 = null;
		} else {
			@Pc(92) Class2_Sub23 local92 = new Class2_Sub23(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass49_Sub2_23.aBoolean111) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + arg2.anInt2934 * (local35 + local50);
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray3[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method5502(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = (local35 + local50) * arg2.anInt2934 + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray3[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method5457(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_4 = this.aClass49_Sub2_23.method1591(local92.anInt6952, false, local92.aByteArray130);
			this.aClass41_Sub2_1 = new Class41_Sub2(this.aClass49_Sub2_23, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	private void method3367() {
		if (!this.aBoolean304) {
			return;
		}
		this.aBoolean304 = false;
		@Pc(16) byte[] local16 = this.aClass89_2.aByteArray53;
		@Pc(26) byte[] local26 = Static333.aByteArray110;
		@Pc(28) int local28 = 0;
		@Pc(32) int local32 = this.aClass89_2.anInt2693;
		@Pc(43) int local43 = this.anInt4147 + this.aClass89_2.anInt2693 * this.anInt4152;
		@Pc(56) int local56;
		for (@Pc(45) int local45 = -128; local45 < 0; local45++) {
			local28 = (local28 << 8) - local28;
			for (local56 = -128; local56 < 0; local56++) {
				if (local16[local43++] != 0) {
					local28++;
				}
			}
			local43 += local32 - 128;
		}
		if (this.aClass55_Sub3_6 != null && local28 == this.anInt4154) {
			this.aBoolean304 = false;
			return;
		}
		this.anInt4154 = local28;
		local43 = this.anInt4147 + this.anInt4152 * local32;
		local56 = 0;
		for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
			for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
				if (local16[local43] == 0) {
					@Pc(121) int local121 = 0;
					if (local16[local43 - 1] != 0) {
						local121++;
					}
					if (local16[local43 + 1] != 0) {
						local121++;
					}
					if (local16[local43 - local32] != 0) {
						local121++;
					}
					if (local16[local43 + local32] != 0) {
						local121++;
					}
					local26[local56++] = (byte) (local121 * 17);
				} else {
					local26[local56++] = 68;
				}
				local43++;
			}
			local43 += this.aClass89_2.anInt2693 - 128;
		}
		if (this.aClass55_Sub3_6 == null) {
			this.aClass55_Sub3_6 = new Class55_Sub3(this.aClass49_Sub2_23, 3553, 6406, 128, 128, false, Static333.aByteArray110, 6406, false);
			this.aClass55_Sub3_6.method5116(false, false);
			this.aClass55_Sub3_6.method5553(true);
		} else {
			this.aClass55_Sub3_6.method5121(128, 6406, 128, false, Static333.aByteArray110);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBLclient!rt;)V")
	private void method3368(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg0 != 0) {
			this.method3367();
			this.aClass49_Sub2_23.method1646(this.aClass55_Sub3_6);
			this.aClass49_Sub2_23.method1631(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([BIII)V")
	public void method3370(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass41_Sub2_1.method2312(arg1 * this.aClass49_Sub2_23.method1596(5123), arg0);
		this.method3368(arg1, this.aClass41_Sub2_1);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	public void method3373() {
		this.method3368(this.anInt4146, this.anInterface10_4);
	}
}
