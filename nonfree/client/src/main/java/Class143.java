import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class143 {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
	public boolean aBoolean271 = true;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
	private int anInt3812 = -1;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_23;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Lclient!eq;")
	private final Class97 aClass97_1;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	private final int anInt3809;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
	private final int anInt3814;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
	private final int anInt3819;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "Lclient!fba;")
	private Class94_Sub2 aClass94_Sub2_2;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "Lclient!pa;")
	private Interface17 anInterface17_4;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "Lclient!cb;")
	private Class41_Sub1 aClass41_Sub1_2;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!dw;Lclient!eq;Lclient!rq;IIIII)V")
	public Class143(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class91_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass82_Sub1_23 = arg0;
		this.aClass97_1 = arg1;
		this.anInt3809 = arg6;
		this.anInt3814 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt8983 * (local37 + local35) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray17[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt3819 = local27;
		if (local27 <= 0) {
			this.aClass94_Sub2_2 = null;
		} else {
			@Pc(93) Class3_Sub9 local93 = new Class3_Sub9(local27 * 2);
			@Pc(113) int local113;
			@Pc(121) short[] local121;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass82_Sub1_23.aBoolean174) {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = (local35 + local50) * arg2.anInt8983 + local31;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray17[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method5620(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = arg2.anInt8983 * (local35 + local50) + local31;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray17[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method5627(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface17_4 = this.aClass82_Sub1_23.method2044(local93.aByteArray51, local93.anInt6453, false);
			this.aClass41_Sub1_2 = new Class41_Sub1(this.aClass82_Sub1_23, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	public void method3265() {
		this.method3267(this.anInt3819, this.anInterface17_4);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIB[B)V")
	public void method3266(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass41_Sub1_2.method5960(arg0 * this.aClass82_Sub1_23.method2083(5123), arg1);
		this.method3267(arg0, this.aClass41_Sub1_2);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILclient!pa;)V")
	private void method3267(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (arg0 != 0) {
			this.method3269();
			this.aClass82_Sub1_23.method2029(this.aClass94_Sub2_2);
			this.aClass82_Sub1_23.method2036(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)V")
	private void method3269() {
		if (!this.aBoolean271) {
			return;
		}
		this.aBoolean271 = false;
		@Pc(16) byte[] local16 = this.aClass97_1.aByteArray27;
		@Pc(20) byte[] local20 = this.aClass82_Sub1_23.aByteArray22;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass97_1.anInt2839;
		@Pc(40) int local40 = this.anInt3809 + this.aClass97_1.anInt2839 * this.anInt3814;
		@Pc(52) int local52;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local22 = (local22 << 8) - local22;
			for (local52 = -128; local52 < 0; local52++) {
				if (local16[local40++] != 0) {
					local22++;
				}
			}
			local40 += local26 - 128;
		}
		if (this.aClass94_Sub2_2 != null && this.anInt3812 == local22) {
			this.aBoolean271 = false;
			return;
		}
		this.anInt3812 = local22;
		local40 = this.anInt3809 + this.anInt3814 * local26;
		local52 = 0;
		for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
			for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
				if (local16[local40] == 0) {
					@Pc(118) int local118 = 0;
					if (local16[local40 - 1] != 0) {
						local118++;
					}
					if (local16[local40 + 1] != 0) {
						local118++;
					}
					if (local16[local40 - local26] != 0) {
						local118++;
					}
					if (local16[local40 + local26] != 0) {
						local118++;
					}
					local20[local52++] = (byte) (local118 * 17);
				} else {
					local20[local52++] = 68;
				}
				local40++;
			}
			local40 += this.aClass97_1.anInt2839 - 128;
		}
		if (this.aClass94_Sub2_2 == null) {
			this.aClass94_Sub2_2 = new Class94_Sub2(this.aClass82_Sub1_23, 3553, 6406, 128, 128, false, this.aClass82_Sub1_23.aByteArray22, 6406, false);
			this.aClass94_Sub2_2.method3120(false, false);
			this.aClass94_Sub2_2.method4012(true);
		} else {
			this.aClass94_Sub2_2.method3125(this.aClass82_Sub1_23.aByteArray22, 128, false, 128, 6406);
		}
	}
}
