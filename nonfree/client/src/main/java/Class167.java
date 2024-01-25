import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class167 {

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "Z")
	public boolean aBoolean277 = true;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
	private int anInt3995 = -1;

	@OriginalMember(owner = "client!iia", name = "q", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_23;

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
	private final int anInt4001;

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "Lclient!at;")
	private final Class22 aClass22_1;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
	private final int anInt3998;

	@OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
	private final int anInt3994;

	@OriginalMember(owner = "client!iia", name = "f", descriptor = "Lclient!ho;")
	private Class44_Sub1 aClass44_Sub1_4;

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "Lclient!mda;")
	private Interface15 anInterface15_2;

	@OriginalMember(owner = "client!iia", name = "r", descriptor = "Lclient!vv;")
	private Class292_Sub1 aClass292_Sub1_2;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!kv;Lclient!at;Lclient!wr;IIIII)V")
	public Class167(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class88_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass143_Sub2_23 = arg0;
		this.anInt4001 = arg7;
		this.aClass22_1 = arg1;
		this.anInt3998 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt10541 * (local35 + local37);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray18[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt3994 = local27;
		if (local27 <= 0) {
			this.aClass44_Sub1_4 = null;
		} else {
			@Pc(92) Class5_Sub15 local92 = new Class5_Sub15(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass143_Sub2_23.aBoolean408) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = arg2.anInt10541 * (local50 + local35) + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray18[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method3660(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + (local50 + local35) * arg2.anInt10541;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray18[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method3668(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface15_2 = this.aClass143_Sub2_23.method4943(local92.aByteArray45, false, local92.anInt4144);
			this.aClass292_Sub1_2 = new Class292_Sub1(this.aClass143_Sub2_23, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public void method3518() {
		this.method3520(this.anInterface15_2, this.anInt3994);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ILclient!mda;I)V")
	private void method3520(@OriginalArg(1) Interface15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method3523();
			this.aClass143_Sub2_23.method4945(this.aClass44_Sub1_4);
			this.aClass143_Sub2_23.method5004(arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I[BIZ)V")
	public void method3521(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass292_Sub1_2.method8493(arg1 * this.aClass143_Sub2_23.method5002(5123), arg0);
		this.method3520(this.aClass292_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
	private void method3523() {
		if (!this.aBoolean277) {
			return;
		}
		this.aBoolean277 = false;
		@Pc(16) byte[] local16 = this.aClass22_1.aByteArray3;
		@Pc(20) byte[] local20 = this.aClass143_Sub2_23.aByteArray56;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass22_1.anInt390;
		@Pc(36) int local36 = this.anInt4001 * this.aClass22_1.anInt390 + this.anInt3998;
		@Pc(56) int local56;
		for (@Pc(46) int local46 = -128; local46 < 0; local46++) {
			local22 = (local22 << 8) - local22;
			for (local56 = -128; local56 < 0; local56++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass44_Sub1_4 != null && local22 == this.anInt3995) {
			this.aBoolean277 = false;
			return;
		}
		this.anInt3995 = local22;
		local36 = this.anInt4001 * local26 + this.anInt3998;
		local56 = 0;
		for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local16[local36] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local36 - 1] != 0) {
						local124++;
					}
					if (local16[local36 + 1] != 0) {
						local124++;
					}
					if (local16[local36 - local26] != 0) {
						local124++;
					}
					if (local16[local36 + local26] != 0) {
						local124++;
					}
					local20[local56++] = (byte) (local124 * 17);
				} else {
					local20[local56++] = 68;
				}
				local36++;
			}
			local36 += this.aClass22_1.anInt390 - 128;
		}
		if (this.aClass44_Sub1_4 == null) {
			this.aClass44_Sub1_4 = new Class44_Sub1(this.aClass143_Sub2_23, 3553, 6406, 128, 128, false, this.aClass143_Sub2_23.aByteArray56, 6406, false);
			this.aClass44_Sub1_4.method794(false, false);
			this.aClass44_Sub1_4.method6706(true);
		} else {
			this.aClass44_Sub1_4.method798(6406, 128, this.aClass143_Sub2_23.aByteArray56, 128, false);
		}
	}
}
