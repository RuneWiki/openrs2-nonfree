import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class152 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
	public boolean aBoolean278 = true;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private int anInt4573 = -1;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Lclient!ku;")
	private final Class170 aClass170_1;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	private final int anInt4572;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	private final int anInt4570;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_20;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	private final int anInt4575;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!mj;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!oe;")
	private Class92_Sub2 aClass92_Sub2_2;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!ea;")
	private Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!te;Lclient!ku;Lclient!sb;IIIII)V")
	public Class152(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class10_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass170_1 = arg1;
		this.anInt4572 = arg6;
		this.anInt4570 = arg7;
		this.aClass9_Sub3_20 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = (local35 + local37) * arg2.anInt7412 + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray11[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt4575 = local27;
		if (local27 <= 0) {
			this.aClass20_Sub3_1 = null;
		} else {
			@Pc(91) Class1_Sub13 local91 = new Class1_Sub13(local27 * 2);
			@Pc(111) int local111;
			@Pc(119) short[] local119;
			@Pc(123) int local123;
			@Pc(109) int local109;
			if (this.aClass9_Sub3_20.aBoolean523) {
				for (local52 = 0; local52 < local25; local52++) {
					local109 = local31 + (local52 + local35) * arg2.anInt7412;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray11[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local91.method3038(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local109 = local31 + arg2.anInt7412 * (local35 + local52);
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray11[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local91.method3068(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface7_2 = this.aClass9_Sub3_20.method6687(local91.aByteArray45, local91.anInt3400, false);
			this.aClass92_Sub2_2 = new Class92_Sub2(this.aClass9_Sub3_20, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method3988() {
		this.method3992(this.anInterface7_2, this.anInt4575);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII[B)V")
	public void method3990(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass92_Sub2_2.method6741(this.aClass9_Sub3_20.method6714(5123) * arg0, arg1);
		this.method3992(this.aClass92_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
	private void method3991() {
		if (!this.aBoolean278) {
			return;
		}
		this.aBoolean278 = false;
		@Pc(16) byte[] local16 = this.aClass170_1.aByteArray69;
		@Pc(20) byte[] local20 = this.aClass9_Sub3_20.aByteArray95;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass170_1.anInt5133;
		@Pc(37) int local37 = this.anInt4572 + this.aClass170_1.anInt5133 * this.anInt4570;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass20_Sub3_1 != null && this.anInt4573 == local22) {
			this.aBoolean278 = false;
			return;
		}
		this.anInt4573 = local22;
		local50 = 0;
		local37 = local26 * this.anInt4570 + this.anInt4572;
		for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local16[local37] == 0) {
					@Pc(118) int local118 = 0;
					if (local16[local37 - 1] != 0) {
						local118++;
					}
					if (local16[local37 + 1] != 0) {
						local118++;
					}
					if (local16[local37 - local26] != 0) {
						local118++;
					}
					if (local16[local37 + local26] != 0) {
						local118++;
					}
					local20[local50++] = (byte) (local118 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass170_1.anInt5133 - 128;
		}
		if (this.aClass20_Sub3_1 == null) {
			this.aClass20_Sub3_1 = new Class20_Sub3(this.aClass9_Sub3_20, 3553, 6406, 128, 128, false, this.aClass9_Sub3_20.aByteArray95, 6406, false);
			this.aClass20_Sub3_1.method6253(false, false);
			this.aClass20_Sub3_1.method6237(true);
		} else {
			this.aClass20_Sub3_1.method6250(128, 128, false, this.aClass9_Sub3_20.aByteArray95, 6406);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!mj;BI)V")
	private void method3992(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method3991();
			this.aClass9_Sub3_20.method6701(this.aClass20_Sub3_1);
			this.aClass9_Sub3_20.method6719(0, arg1, arg0);
		}
	}
}
