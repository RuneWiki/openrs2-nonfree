import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class86 {

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
	public boolean aBoolean176 = true;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	private int anInt2250 = -1;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	private final int anInt2248;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "Lclient!c;")
	private final Class28 aClass28_2;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_17;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	private final int anInt2247;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!hm;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!kb;")
	private Class131_Sub1 aClass131_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!qi;Lclient!c;Lclient!ch;IIIII)V")
	public Class86(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class33_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2248 = arg6;
		this.aClass28_2 = arg1;
		this.aClass82_Sub2_17 = arg0;
		this.anInt2249 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(48) int local48;
		@Pc(50) int local50;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local48 = local29 + arg2.anInt4627 * (local33 + local35);
			for (local50 = 0; local50 < local23; local50++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray5[local48++];
				if (local59 != null) {
					local25 += local59.length;
				}
			}
		}
		this.anInt2247 = local25;
		if (local25 <= 0) {
			this.aClass7_Sub1_1 = null;
		} else {
			@Pc(88) Class2_Sub13 local88 = new Class2_Sub13(local25 * 2);
			@Pc(126) short[] local126;
			@Pc(131) int local131;
			@Pc(113) int local113;
			if (this.aClass82_Sub2_17.aBoolean403) {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = local29 + (local33 + local48) * arg2.anInt4627;
					for (local113 = 0; local113 < local23; local113++) {
						local126 = arg2.aShortArrayArray5[local50++];
						if (local126 != null) {
							for (local131 = 0; local131 < local126.length; local131++) {
								local88.method4199(local126[local131] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = local29 + arg2.anInt4627 * (local33 + local48);
					for (local113 = 0; local113 < local23; local113++) {
						local126 = arg2.aShortArrayArray5[local50++];
						if (local126 != null) {
							for (local131 = 0; local131 < local126.length; local131++) {
								local88.method4243(local126[local131] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface3_2 = this.aClass82_Sub2_17.method4567(local88.aByteArray77, local88.anInt4788, false);
			this.aClass131_Sub1_1 = new Class131_Sub1(this.aClass82_Sub2_17, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!hm;I)V")
	private void method2149(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method2150();
			this.aClass82_Sub2_17.method4614(this.aClass7_Sub1_1);
			this.aClass82_Sub2_17.method4595(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	private void method2150() {
		if (!this.aBoolean176) {
			return;
		}
		this.aBoolean176 = false;
		@Pc(20) byte[] local20 = this.aClass28_2.aByteArray15;
		@Pc(22) byte[] local22 = Static113.aByteArray33;
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = this.aClass28_2.anInt674;
		@Pc(39) int local39 = this.anInt2248 + this.aClass28_2.anInt674 * this.anInt2249;
		@Pc(41) int local41;
		@Pc(53) int local53;
		for (local41 = -128; local41 < 0; local41++) {
			local24 = (local24 << 8) - local24;
			for (local53 = -128; local53 < 0; local53++) {
				if (local20[local39++] != 0) {
					local24++;
				}
			}
			local39 += local28 - 128;
		}
		if (this.aClass7_Sub1_1 != null && local24 == this.anInt2250) {
			this.aBoolean176 = false;
			return;
		}
		this.anInt2250 = local24;
		local41 = 0;
		local39 = local28 * this.anInt2249 + this.anInt2248;
		for (local53 = -128; local53 < 0; local53++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local20[local39] == 0) {
					@Pc(127) int local127 = 0;
					if (local20[local39 - 1] != 0) {
						local127++;
					}
					if (local20[local39 + 1] != 0) {
						local127++;
					}
					if (local20[local39 - local28] != 0) {
						local127++;
					}
					if (local20[local28 + local39] != 0) {
						local127++;
					}
					local22[local41++] = (byte) (local127 * 17);
				} else {
					local22[local41++] = 68;
				}
				local39++;
			}
			local39 += this.aClass28_2.anInt674 - 128;
		}
		if (this.aClass7_Sub1_1 == null) {
			this.aClass7_Sub1_1 = new Class7_Sub1(this.aClass82_Sub2_17, 3553, 6406, 128, 128, false, Static113.aByteArray33, 6406, false);
			this.aClass7_Sub1_1.method4749(false, false);
			this.aClass7_Sub1_1.method4734(true);
		} else {
			this.aClass7_Sub1_1.method4747(128, 128, Static113.aByteArray33, 6406, false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method2151() {
		this.method2149(this.anInterface3_2, this.anInt2247);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([BIBI)V")
	public void method2152(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass131_Sub1_1.method3548(arg0, arg1 * this.aClass82_Sub2_17.method4578(5123));
		this.method2149(this.aClass131_Sub1_1, arg1);
	}
}
