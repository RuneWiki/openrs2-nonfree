import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class217 {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Z")
	public boolean aBoolean421 = true;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "I")
	private int anInt5672 = -1;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	private final int anInt5676;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_25;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	private final int anInt5674;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!ko;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	private final int anInt5673;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!bp;")
	private Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!bda;")
	private Interface4 anInterface4_3;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!cm;")
	private Class59_Sub1 aClass59_Sub1_2;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!ml;Lclient!ko;Lclient!qd;IIIII)V")
	public Class217(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) Class96_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5676 = arg6;
		this.aClass75_Sub3_25 = arg0;
		this.anInt5674 = arg7;
		this.aClass213_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(53) int local53;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(51) int local51 = local31 + (local35 + local37) * arg2.anInt9255;
			for (local53 = 0; local53 < local25; local53++) {
				@Pc(61) short[] local61 = arg2.aShortArrayArray12[local51++];
				if (local61 != null) {
					local27 += local61.length;
				}
			}
		}
		this.anInt5673 = local27;
		if (local27 <= 0) {
			this.aClass44_Sub1_2 = null;
		} else {
			@Pc(107) Class6_Sub15 local107 = new Class6_Sub15(local27 * 2);
			@Pc(126) int local126;
			@Pc(134) short[] local134;
			@Pc(138) int local138;
			@Pc(124) int local124;
			if (this.aClass75_Sub3_25.aBoolean480) {
				for (local53 = 0; local53 < local25; local53++) {
					local124 = local31 + arg2.anInt9255 * (local53 + local35);
					for (local126 = 0; local126 < local25; local126++) {
						local134 = arg2.aShortArrayArray12[local124++];
						if (local134 != null) {
							for (local138 = 0; local138 < local134.length; local138++) {
								local107.method3040(local134[local138] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local53 = 0; local53 < local25; local53++) {
					local124 = (local35 + local53) * arg2.anInt9255 + local31;
					for (local126 = 0; local126 < local25; local126++) {
						local134 = arg2.aShortArrayArray12[local124++];
						if (local134 != null) {
							for (local138 = 0; local138 < local134.length; local138++) {
								local107.method3008(local134[local138] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_3 = this.aClass75_Sub3_25.method5768(local107.anInt3174, false, local107.aByteArray20);
			this.aClass59_Sub1_2 = new Class59_Sub1(this.aClass75_Sub3_25, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public void method5138() {
		this.method5141(this.anInt5673, this.anInterface4_3);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	private void method5140() {
		if (!this.aBoolean421) {
			return;
		}
		this.aBoolean421 = false;
		@Pc(17) byte[] local17 = this.aClass213_1.aByteArray53;
		@Pc(21) byte[] local21 = this.aClass75_Sub3_25.aByteArray57;
		@Pc(33) int local33 = 0;
		@Pc(37) int local37 = this.aClass213_1.anInt5537;
		@Pc(47) int local47 = this.aClass213_1.anInt5537 * this.anInt5674 + this.anInt5676;
		@Pc(60) int local60;
		for (@Pc(49) int local49 = -128; local49 < 0; local49++) {
			local33 = (local33 << 8) - local33;
			for (local60 = -128; local60 < 0; local60++) {
				if (local17[local47++] != 0) {
					local33++;
				}
			}
			local47 += local37 - 128;
		}
		if (this.aClass44_Sub1_2 != null && this.anInt5672 == local33) {
			this.aBoolean421 = false;
			return;
		}
		this.anInt5672 = local33;
		local60 = 0;
		local47 = local37 * this.anInt5674 + this.anInt5676;
		for (@Pc(129) int local129 = -128; local129 < 0; local129++) {
			for (@Pc(133) int local133 = -128; local133 < 0; local133++) {
				if (local17[local47] == 0) {
					@Pc(143) int local143 = 0;
					if (local17[local47 - 1] != 0) {
						local143++;
					}
					if (local17[local47 + 1] != 0) {
						local143++;
					}
					if (local17[local47 - local37] != 0) {
						local143++;
					}
					if (local17[local47 + local37] != 0) {
						local143++;
					}
					local21[local60++] = (byte) (local143 * 17);
				} else {
					local21[local60++] = 68;
				}
				local47++;
			}
			local47 += this.aClass213_1.anInt5537 - 128;
		}
		if (this.aClass44_Sub1_2 == null) {
			this.aClass44_Sub1_2 = new Class44_Sub1(this.aClass75_Sub3_25, 3553, 6406, 128, 128, false, this.aClass75_Sub3_25.aByteArray57, 6406, false);
			this.aClass44_Sub1_2.method3476(false, false);
			this.aClass44_Sub1_2.method9007(true);
		} else {
			this.aClass44_Sub1_2.method3475(this.aClass75_Sub3_25.aByteArray57, 6406, 128, false, 128);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BILclient!bda;)V")
	private void method5141(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		if (arg0 != 0) {
			this.method5140();
			this.aClass75_Sub3_25.method5774(this.aClass44_Sub1_2);
			this.aClass75_Sub3_25.method5803(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B[BII)V")
	public void method5142(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass59_Sub1_2.method5017(arg1 * this.aClass75_Sub3_25.method5821(5123), arg0);
		this.method5141(arg1, this.aClass59_Sub1_2);
	}
}
