import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class26 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "Lclient!o;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	private final int anInt661;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	private final int anInt671;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	private final int anInt664;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Z")
	private final boolean aBoolean61;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	private final int anInt666;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	private final int anInt669;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	private final int anInt665;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	private final int anInt667;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt661 = arg2;
		this.anInt671 = arg3;
		this.anInt664 = arg4;
		this.aBoolean61 = arg7;
		this.anInt666 = arg1;
		this.anInt669 = arg6;
		this.anInt665 = arg5;
		this.anInt667 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!za;Lclient!bm;)Z")
	public boolean method525(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class26 arg1) {
		return this.aClass13_7 != null || this.method529(arg0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!za;Lclient!bm;)V")
	private void method526(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class26 arg1) {
		Static35.method533(arg0);
		Static35.method527(arg0);
		arg0.MA(Static35.anIntArray64);
		arg0.ba(0, 0, this.anInt672, this.anInt672);
		arg0.method5559();
		arg0.P(0, 0, this.anInt672, this.anInt672, this.anInt669 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean61) {
				local31 = -arg1.anInt661;
				local33 = -arg1.anInt671;
				local35 = -arg1.anInt664;
			} else {
				local31 = arg1.anInt661 - this.anInt661;
				local33 = arg1.anInt671 - this.anInt671;
				local35 = arg1.anInt664 - this.anInt664;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt670 != 0) {
			local79 = Class155.anIntArray342[this.anInt670];
			local84 = Class155.anIntArray341[this.anInt670];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt662 != 0) {
			local79 = Class155.anIntArray342[this.anInt662];
			local84 = Class155.anIntArray341[this.anInt662];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class59 local147 = Static35.aClass59_1.method5737((byte) 0, 51200, true);
		if (arg0.method5548()) {
			local147.u((short) 0, (short) this.anInt666);
		} else {
			local147.q((short) 127, Static158.anInterface9_7.method1769(this.anInt666).aShort37);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt672 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt669 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt672 / 2, this.anInt672 / 2, local84, local84);
		arg0.SA(arg0.method5566());
		@Pc(223) Class31 local223 = arg0.method5566();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method5751(local223, null, 1024);
		@Pc(245) int local245 = this.anInt672 * 13 / 16;
		@Pc(252) int local252 = (this.anInt672 - local245) / 2;
		Static35.aClass13_5.ya(local252, local252, local245, local245, 0, this.anInt669 | 0xFF000000, 1);
		this.aClass13_7 = arg0.method5513(0, 0, this.anInt672, this.anInt672, true);
		arg0.method5559();
		arg0.P(0, 0, this.anInt672, this.anInt672, 0, 0);
		Static35.aClass13_6.ya(0, 0, this.anInt672, this.anInt672, 1, 0, 0);
		this.aClass13_7.oa(0, 0, 0);
		arg0.ba(Static35.anIntArray64[0], Static35.anIntArray64[1], Static35.anIntArray64[2], Static35.anIntArray64[3]);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method528(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass13_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt670 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt662 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt663) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt663) / 2;
		if (local38 < arg4 && local38 + this.anInt663 > 0 && local51 < arg3 && local51 + this.anInt663 > 0) {
			this.aClass13_7.method5665(local51 + arg1, local38 + arg2, this.anInt663, this.anInt663);
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lclient!za;Lclient!bm;)Z")
	private boolean method529(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class26 arg1) {
		if (this.aClass13_7 == null) {
			if (this.anInt667 == 0) {
				if (Static158.anInterface9_7.method1773(this.anInt666)) {
					@Pc(23) int[] local23 = Static158.anInterface9_7.method1772(this.anInt672, 0.7F, this.anInt666, this.anInt672);
					this.aClass13_7 = arg0.method5522(local23, this.anInt672, this.anInt672, this.anInt672);
				}
			} else if (this.anInt667 == 2) {
				this.method534(arg0, arg1);
			} else if (this.anInt667 == 1) {
				this.method526(arg0, arg1);
			}
		}
		return this.aClass13_7 != null;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()V")
	public void method531() {
		this.aClass13_7 = null;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)Z")
	public boolean method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean61) {
			this.anInt668 = 1073741823;
			local7 = this.anInt661;
			local12 = this.anInt671;
			local17 = this.anInt664;
		} else {
			local7 = this.anInt661 - arg0;
			local12 = this.anInt671 - arg1;
			local17 = this.anInt664 - arg2;
			this.anInt668 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt668 == 0) {
				this.anInt668 = 1;
			}
			local7 = (local7 << 8) / this.anInt668;
			local12 = (local12 << 8) / this.anInt668;
			local17 = (local17 << 8) / this.anInt668;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt663 = this.anInt665 * arg3 / (this.aBoolean61 ? 1024 : this.anInt668);
		} else {
			this.anInt663 = 0;
		}
		if (this.anInt663 < 8) {
			this.aClass13_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static29.method453(this.anInt663);
		if (local143 > arg3) {
			local143 = Static295.method3927(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt672) {
			this.anInt672 = local143;
		}
		this.anInt670 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt662 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass13_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(Lclient!za;Lclient!bm;)V")
	private void method534(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(6) Class205 local6 = Static278.method3725(Static209.aClass54_61, this.anInt666);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static35.anIntArray64);
		arg0.ba(0, 0, this.anInt672, this.anInt672);
		arg0.P(0, 0, this.anInt672, this.anInt672, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean61) {
				local32 = -arg1.anInt661;
				local34 = -arg1.anInt671;
				local36 = -arg1.anInt664;
			} else {
				local32 = this.anInt661 - arg1.anInt661;
				local34 = this.anInt671 - arg1.anInt671;
				local36 = this.anInt664 - arg1.anInt664;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt670 != 0) {
			local81 = -this.anInt670 & 0x3FFF;
			local85 = Class155.anIntArray342[local81];
			local89 = Class155.anIntArray341[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt662 != 0) {
			local81 = -this.anInt662 & 0x3FFF;
			local85 = Class155.anIntArray342[local81];
			local89 = Class155.anIntArray341[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class59 local172 = arg0.method5530(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method5566());
		@Pc(218) Class31 local218 = arg0.method5539();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method5751(local218, null, arg0.AA());
		this.aClass13_7 = arg0.method5513(0, 0, this.anInt672, this.anInt672, true);
		this.aClass13_7.oa(0, 0, 3);
		arg0.ba(Static35.anIntArray64[0], Static35.anIntArray64[1], Static35.anIntArray64[2], Static35.anIntArray64[3]);
	}
}
