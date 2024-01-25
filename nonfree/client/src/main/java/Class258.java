import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class258 {

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	private int anInt7835;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	private int anInt7837;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!xa;")
	private Class119 aClass119_24;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	private int anInt7839;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public int anInt7840;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	private int anInt7841;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	private final int anInt7836;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	private final int anInt7844;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	private final int anInt7843;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Z")
	private final boolean aBoolean557;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	private final int anInt7838;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
	private final int anInt7833;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	private final int anInt7842;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	private final int anInt7834;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7836 = arg2;
		this.anInt7844 = arg3;
		this.anInt7843 = arg4;
		this.aBoolean557 = arg7;
		this.anInt7838 = arg1;
		this.anInt7833 = arg6;
		this.anInt7842 = arg5;
		this.anInt7834 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!oa;Lclient!rk;)V")
	private void method6485(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class258 arg1) {
		@Pc(6) Class222 local6 = Static264.method4649(this.anInt7838, Static254.aClass161_56);
		if (local6 == null) {
			return;
		}
		arg0.A(Static423.anIntArray668);
		arg0.ca(0, 0, this.anInt7839, this.anInt7839);
		arg0.C(0, 0, this.anInt7839, this.anInt7839, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean557) {
				local32 = -arg1.anInt7836;
				local34 = -arg1.anInt7844;
				local36 = -arg1.anInt7843;
			} else {
				local32 = this.anInt7836 - arg1.anInt7836;
				local34 = this.anInt7844 - arg1.anInt7844;
				local36 = this.anInt7843 - arg1.anInt7843;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7837 != 0) {
			local81 = -this.anInt7837 & 0x3FFF;
			local85 = Class5.anIntArray761[local81];
			local89 = Class5.anIntArray760[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt7835 != 0) {
			local81 = -this.anInt7835 & 0x3FFF;
			local85 = Class5.anIntArray761[local81];
			local89 = Class5.anIntArray760[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class2 local172 = arg0.method7443(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method7469(arg0.method7409());
		@Pc(218) Class205 local218 = arg0.method7448();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method5772(local218, null, arg0.U());
		this.aClass119_24 = arg0.method7457(0, 0, this.anInt7839, this.anInt7839, true);
		this.aClass119_24.t(0, 0, 3);
		arg0.ca(Static423.anIntArray668[0], Static423.anIntArray668[1], Static423.anIntArray668[2], Static423.anIntArray668[3]);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lclient!oa;Lclient!rk;)V")
	private void method6486(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class258 arg1) {
		Static423.method6489(arg0);
		Static423.method6494(arg0);
		arg0.A(Static423.anIntArray668);
		arg0.ca(0, 0, this.anInt7839, this.anInt7839);
		arg0.method7444();
		arg0.C(0, 0, this.anInt7839, this.anInt7839, this.anInt7833 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean557) {
				local31 = -arg1.anInt7836;
				local33 = -arg1.anInt7844;
				local35 = -arg1.anInt7843;
			} else {
				local31 = arg1.anInt7836 - this.anInt7836;
				local33 = arg1.anInt7844 - this.anInt7844;
				local35 = arg1.anInt7843 - this.anInt7843;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7837 != 0) {
			local79 = Class5.anIntArray761[this.anInt7837];
			local84 = Class5.anIntArray760[this.anInt7837];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt7835 != 0) {
			local79 = Class5.anIntArray761[this.anInt7835];
			local84 = Class5.anIntArray760[this.anInt7835];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class2 local147 = Static423.aClass2_6.method5775((byte) 0, 51200, true);
		if (arg0.method7421()) {
			local147.ka((short) 0, (short) this.anInt7838);
		} else {
			local147.UA((short) 127, Static488.anInterface4_13.method6712(this.anInt7838).aShort111);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7839 * 1024 / (local147.M() - local147.ha());
		if (this.anInt7833 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt7839 / 2, this.anInt7839 / 2, local84, local84);
		arg0.method7469(arg0.method7409());
		@Pc(223) Class205 local223 = arg0.method7409();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method5772(local223, null, 1024);
		@Pc(245) int local245 = this.anInt7839 * 13 / 16;
		@Pc(252) int local252 = (this.anInt7839 - local245) / 2;
		Static423.aClass119_22.KA(local252, local252, local245, local245, 0, this.anInt7833 | 0xFF000000, 1);
		this.aClass119_24 = arg0.method7457(0, 0, this.anInt7839, this.anInt7839, true);
		arg0.method7444();
		arg0.C(0, 0, this.anInt7839, this.anInt7839, 0, 0);
		Static423.aClass119_23.KA(0, 0, this.anInt7839, this.anInt7839, 1, 0, 0);
		this.aClass119_24.t(0, 0, 0);
		arg0.ca(Static423.anIntArray668[0], Static423.anIntArray668[1], Static423.anIntArray668[2], Static423.anIntArray668[3]);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)Z")
	public boolean method6487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean557) {
			this.anInt7840 = 1073741823;
			local7 = this.anInt7836;
			local12 = this.anInt7844;
			local17 = this.anInt7843;
		} else {
			local7 = this.anInt7836 - arg0;
			local12 = this.anInt7844 - arg1;
			local17 = this.anInt7843 - arg2;
			this.anInt7840 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7840 == 0) {
				this.anInt7840 = 1;
			}
			local7 = (local7 << 8) / this.anInt7840;
			local12 = (local12 << 8) / this.anInt7840;
			local17 = (local17 << 8) / this.anInt7840;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7841 = this.anInt7842 * arg3 / (this.aBoolean557 ? 1024 : this.anInt7840);
		} else {
			this.anInt7841 = 0;
		}
		if (this.anInt7841 < 8) {
			this.aClass119_24 = null;
			return false;
		}
		@Pc(143) int local143 = Static483.method7134(this.anInt7841);
		if (local143 > arg3) {
			local143 = Static27.method797(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7839) {
			this.anInt7839 = local143;
		}
		this.anInt7837 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt7835 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass119_24 = null;
		return true;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Lclient!oa;Lclient!rk;)Z")
	public boolean method6488(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class258 arg1) {
		return this.aClass119_24 != null || this.method6493(arg0, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "()V")
	public void method6490() {
		this.aClass119_24 = null;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(Lclient!oa;Lclient!rk;)Z")
	private boolean method6493(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class258 arg1) {
		if (this.aClass119_24 == null) {
			if (this.anInt7834 == 0) {
				if (Static488.anInterface4_13.method6708(this.anInt7838)) {
					@Pc(23) int[] local23 = Static488.anInterface4_13.method6707(this.anInt7839, this.anInt7838, this.anInt7839, 0.7F);
					this.aClass119_24 = arg0.method7483(local23, this.anInt7839, this.anInt7839, this.anInt7839);
				}
			} else if (this.anInt7834 == 2) {
				this.method6485(arg0, arg1);
			} else if (this.anInt7834 == 1) {
				this.method6486(arg0, arg1);
			}
		}
		return this.aClass119_24 != null;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method6495(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass119_24 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7837 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7835 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7841) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7841) / 2;
		if (local38 < arg4 && local38 + this.anInt7841 > 0 && local51 < arg3 && local51 + this.anInt7841 > 0) {
			this.aClass119_24.method6670(local51 + arg1, local38 + arg2, this.anInt7841, this.anInt7841);
		}
	}
}
