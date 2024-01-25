import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class148 {

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	private int anInt3641 = -1;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_27;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	private final int anInt3642;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!mk;")
	private final Class156 aClass156_2;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	private final int anInt3639;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	private final int anInt3640;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!hi;")
	private Class15_Sub2 aClass15_Sub2_4;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!gs;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!bb;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!nm;Lclient!mk;Lclient!lg;IIIII)V")
	public Class148(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Class42_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass164_Sub1_27 = arg0;
		this.anInt3642 = arg6;
		this.aClass156_2 = arg1;
		this.anInt3639 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local51 = local29 + (local35 + local33) * arg2.anInt3739;
			for (local53 = 0; local53 < local23; local53++) {
				@Pc(66) short[] local66 = arg2.aShortArrayArray7[local51++];
				if (local66 != null) {
					local25 += local66.length;
				}
			}
		}
		this.anInt3640 = local25;
		if (local25 <= 0) {
			this.aClass15_Sub2_4 = null;
		} else {
			@Pc(98) Class1_Sub33 local98 = new Class1_Sub33(local25 * 2);
			@Pc(128) short[] local128;
			@Pc(134) int local134;
			@Pc(119) int local119;
			if (this.aClass164_Sub1_27.aBoolean413) {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = (local33 + local51) * arg2.anInt3739 + local29;
					for (local119 = 0; local119 < local23; local119++) {
						local128 = arg2.aShortArrayArray7[local53++];
						if (local128 != null) {
							for (local134 = 0; local134 < local128.length; local134++) {
								local98.method5138(local128[local134] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = arg2.anInt3739 * (local51 + local33) + local29;
					for (local119 = 0; local119 < local23; local119++) {
						local128 = arg2.aShortArrayArray7[local53++];
						if (local128 != null) {
							for (local134 = 0; local134 < local128.length; local134++) {
								local98.method5169(local128[local134] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_3 = this.aClass164_Sub1_27.method3620(local98.aByteArray86, local98.lb, false);
			this.aClass21_Sub1_1 = new Class21_Sub1(this.aClass164_Sub1_27, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	private void method2963() {
		if (!this.aBoolean353) {
			return;
		}
		this.aBoolean353 = false;
		@Pc(16) byte[] local16 = this.aClass156_2.aByteArray68;
		@Pc(18) byte[] local18 = Static210.aByteArray61;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass156_2.anInt3809;
		@Pc(35) int local35 = this.anInt3642 + this.aClass156_2.anInt3809 * this.anInt3639;
		@Pc(37) int local37;
		@Pc(49) int local49;
		for (local37 = -128; local37 < 0; local37++) {
			local20 = (local20 << 8) - local20;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local35++] != 0) {
					local20++;
				}
			}
			local35 += local24 - 128;
		}
		if (this.aClass15_Sub2_4 != null && local20 == this.anInt3641) {
			this.aBoolean353 = false;
			return;
		}
		this.anInt3641 = local20;
		local35 = this.anInt3642 + local24 * this.anInt3639;
		local37 = 0;
		for (local49 = -128; local49 < 0; local49++) {
			for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
				if (local16[local35] == 0) {
					@Pc(111) int local111 = 0;
					if (local16[local35 - 1] != 0) {
						local111++;
					}
					if (local16[local35 + 1] != 0) {
						local111++;
					}
					if (local16[local35 - local24] != 0) {
						local111++;
					}
					if (local16[local24 + local35] != 0) {
						local111++;
					}
					local18[local37++] = (byte) (local111 * 17);
				} else {
					local18[local37++] = 68;
				}
				local35++;
			}
			local35 += this.aClass156_2.anInt3809 - 128;
		}
		if (this.aClass15_Sub2_4 == null) {
			this.aClass15_Sub2_4 = new Class15_Sub2(this.aClass164_Sub1_27, 3553, 6406, 128, 128, false, Static210.aByteArray61, 6406, false);
			this.aClass15_Sub2_4.method5042(false, false);
			this.aClass15_Sub2_4.method5556(true);
		} else {
			this.aClass15_Sub2_4.method5040(128, 128, Static210.aByteArray61, 6406, false);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!gs;IB)V")
	private void method2964(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method2963();
			this.aClass164_Sub1_27.method3603(this.aClass15_Sub2_4);
			this.aClass164_Sub1_27.method3614(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[BZ)V")
	public void method2965(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass21_Sub1_1.method3105(arg1, this.aClass164_Sub1_27.method3592(5123) * arg0);
		this.method2964(this.aClass21_Sub1_1, arg0);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public void method2966() {
		this.method2964(this.anInterface5_3, this.anInt3640);
	}
}
