import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class142 {

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Z")
	public boolean aBoolean273 = true;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
	private int anInt3438 = -1;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_21;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	private final int anInt3433;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
	private final int anInt3434;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "Lclient!gf;")
	private final Class92 aClass92_1;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	private final int anInt3431;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!ah;")
	private Class5_Sub1 aClass5_Sub1_3;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!ap;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "Lclient!tj;")
	private Class154_Sub2 aClass154_Sub2_1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!od;Lclient!gf;Lclient!on;IIIII)V")
	public Class142(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class163_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass128_Sub2_21 = arg0;
		this.anInt3433 = arg7;
		this.anInt3434 = arg6;
		this.aClass92_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt5796;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray23[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt3431 = local27;
		if (local27 <= 0) {
			this.aClass5_Sub1_3 = null;
		} else {
			@Pc(101) Class1_Sub11 local101 = new Class1_Sub11(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass128_Sub2_21.aBoolean360) {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = local31 + (local35 + local51) * arg2.anInt5796;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray23[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method4448(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = arg2.anInt5796 * (local51 + local35) + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray23[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method4488(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface2_3 = this.aClass128_Sub2_21.method3618(local101.anInt5766, false, local101.aByteArray64);
			this.aClass154_Sub2_1 = new Class154_Sub2(this.aClass128_Sub2_21, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method2836() {
		this.method2837(this.anInterface2_3, this.anInt3431);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!ap;I)V")
	private void method2837(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method2839();
			this.aClass128_Sub2_21.method3691(this.aClass5_Sub1_3);
			this.aClass128_Sub2_21.method3627(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	private void method2839() {
		if (!this.aBoolean273) {
			return;
		}
		this.aBoolean273 = false;
		@Pc(16) byte[] local16 = this.aClass92_1.aByteArray19;
		@Pc(18) byte[] local18 = Static103.aByteArray11;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass92_1.anInt2270;
		@Pc(35) int local35 = this.anInt3434 + this.anInt3433 * this.aClass92_1.anInt2270;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = -128; local37 < 0; local37++) {
			local20 = (local20 << 8) - local20;
			for (local48 = -128; local48 < 0; local48++) {
				if (local16[local35++] != 0) {
					local20++;
				}
			}
			local35 += local24 - 128;
		}
		if (this.aClass5_Sub1_3 != null && this.anInt3438 == local20) {
			this.aBoolean273 = false;
			return;
		}
		this.anInt3438 = local20;
		local48 = 0;
		local35 = local24 * this.anInt3433 + this.anInt3434;
		for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
			for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
				if (local16[local35] == 0) {
					@Pc(119) int local119 = 0;
					if (local16[local35 - 1] != 0) {
						local119++;
					}
					if (local16[local35 + 1] != 0) {
						local119++;
					}
					if (local16[local35 - local24] != 0) {
						local119++;
					}
					if (local16[local24 + local35] != 0) {
						local119++;
					}
					local18[local48++] = (byte) (local119 * 17);
				} else {
					local18[local48++] = 68;
				}
				local35++;
			}
			local35 += this.aClass92_1.anInt2270 - 128;
		}
		if (this.aClass5_Sub1_3 == null) {
			this.aClass5_Sub1_3 = new Class5_Sub1(this.aClass128_Sub2_21, 3553, 6406, 128, 128, false, Static103.aByteArray11, 6406, false);
			this.aClass5_Sub1_3.method5547(false, false);
			this.aClass5_Sub1_3.method5540(true);
		} else {
			this.aClass5_Sub1_3.method5541(Static103.aByteArray11, 128, 128, 6406, false);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ[BI)V")
	public void method2840(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass154_Sub2_1.method4932(this.aClass128_Sub2_21.method3632(5123) * arg1, arg0);
		this.method2837(this.aClass154_Sub2_1, arg1);
	}
}
