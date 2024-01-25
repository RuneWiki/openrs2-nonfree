import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class183 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public int anInt5612;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!f;")
	private Class73 aClass73_30;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	private int anInt5617;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	private int anInt5619;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	private int anInt5623;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private final int anInt5613;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private final int anInt5622;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private final int anInt5616;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
	private final boolean aBoolean383;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private final int anInt5614;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	private final int anInt5621;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	private final int anInt5618;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	private final int anInt5620;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5613 = arg2;
		this.anInt5622 = arg3;
		this.anInt5616 = arg4;
		this.aBoolean383 = arg7;
		this.anInt5614 = arg1;
		this.anInt5621 = arg6;
		this.anInt5618 = arg5;
		this.anInt5620 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!r;Lclient!lc;)V")
	private void method4558(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class183 arg1) {
		@Pc(6) Class332 local6 = Static326.method4807(this.anInt5614, Static418.aClass284_120);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static301.anIntArray271);
		arg0.da(0, 0, this.anInt5615, this.anInt5615);
		arg0.J(0, 0, this.anInt5615, this.anInt5615, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean383) {
				local32 = -arg1.anInt5613;
				local34 = -arg1.anInt5622;
				local36 = -arg1.anInt5616;
			} else {
				local32 = this.anInt5613 - arg1.anInt5613;
				local34 = this.anInt5622 - arg1.anInt5622;
				local36 = this.anInt5616 - arg1.anInt5616;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt5619 != 0) {
			local81 = -this.anInt5619 & 0x3FFF;
			local85 = Class3_Sub28.anIntArray232[local81];
			local89 = Class3_Sub28.anIntArray231[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt5623 != 0) {
			local81 = -this.anInt5623 & 0x3FFF;
			local85 = Class3_Sub28.anIntArray232[local81];
			local89 = Class3_Sub28.anIntArray231[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class52 local172 = arg0.method8046(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method8062(arg0.method8031());
		@Pc(218) Class42 local218 = arg0.method8052();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7619(local218, null, arg0.BA(), 1);
		this.aClass73_30 = arg0.method8091(0, 0, this.anInt5615, this.anInt5615, true);
		this.aClass73_30.xa(0, 0, 3);
		arg0.da(Static301.anIntArray271[0], Static301.anIntArray271[1], Static301.anIntArray271[2], Static301.anIntArray271[3]);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)Z")
	public boolean method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean383) {
			this.anInt5612 = 1073741823;
			local7 = this.anInt5613;
			local12 = this.anInt5622;
			local17 = this.anInt5616;
		} else {
			local7 = this.anInt5613 - arg0;
			local12 = this.anInt5622 - arg1;
			local17 = this.anInt5616 - arg2;
			this.anInt5612 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5612 == 0) {
				this.anInt5612 = 1;
			}
			local7 = (local7 << 8) / this.anInt5612;
			local12 = (local12 << 8) / this.anInt5612;
			local17 = (local17 << 8) / this.anInt5612;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5617 = this.anInt5618 * arg3 / (this.aBoolean383 ? 1024 : this.anInt5612);
		} else {
			this.anInt5617 = 0;
		}
		if (this.anInt5617 < 8) {
			this.aClass73_30 = null;
			return false;
		}
		@Pc(143) int local143 = Static538.method7366(this.anInt5617);
		if (local143 > arg3) {
			local143 = Static49.method1209(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5615) {
			this.anInt5615 = local143;
		}
		this.anInt5619 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5623 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass73_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lclient!r;Lclient!lc;)V")
	private void method4560(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class183 arg1) {
		Static301.method4563(arg0);
		Static301.method4564(arg0);
		arg0.oa(Static301.anIntArray271);
		arg0.da(0, 0, this.anInt5615, this.anInt5615);
		arg0.ya();
		arg0.J(0, 0, this.anInt5615, this.anInt5615, this.anInt5621 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean383) {
				local31 = -arg1.anInt5613;
				local33 = -arg1.anInt5622;
				local35 = -arg1.anInt5616;
			} else {
				local31 = arg1.anInt5613 - this.anInt5613;
				local33 = arg1.anInt5622 - this.anInt5622;
				local35 = arg1.anInt5616 - this.anInt5616;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5619 != 0) {
			local79 = Class3_Sub28.anIntArray232[this.anInt5619];
			local84 = Class3_Sub28.anIntArray231[this.anInt5619];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt5623 != 0) {
			local79 = Class3_Sub28.anIntArray232[this.anInt5623];
			local84 = Class3_Sub28.anIntArray231[this.anInt5623];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class52 local147 = Static301.aClass52_6.method7618((byte) 0, 51200, true);
		if (arg0.method8040()) {
			local147.DA((short) 0, (short) this.anInt5614);
		} else {
			local147.d((short) 127, Static532.anInterface4_12.method7229(this.anInt5614).aShort66);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5615 * 1024 / (local147.l() - local147.KA());
		if (this.anInt5621 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt5615 / 2, this.anInt5615 / 2, local84, local84);
		arg0.method8062(arg0.method8031());
		@Pc(223) Class42 local223 = arg0.method8031();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7619(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt5615 * 13 / 16;
		@Pc(252) int local252 = (this.anInt5615 - local245) / 2;
		Static301.aClass73_32.method7949(local252, local252, local245, local245, 0, this.anInt5621 | 0xFF000000, 1);
		this.aClass73_30 = arg0.method8091(0, 0, this.anInt5615, this.anInt5615, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt5615, this.anInt5615, 0, 0);
		Static301.aClass73_31.method7949(0, 0, this.anInt5615, this.anInt5615, 1, 0, 0);
		this.aClass73_30.xa(0, 0, 0);
		arg0.da(Static301.anIntArray271[0], Static301.anIntArray271[1], Static301.anIntArray271[2], Static301.anIntArray271[3]);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(Lclient!r;Lclient!lc;)Z")
	public boolean method4561(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class183 arg1) {
		return this.aClass73_30 != null || this.method4567(arg0, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()V")
	public void method4562() {
		this.aClass73_30 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method4565(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass73_30 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt5619 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt5623 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt5617) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt5617) / 2;
		if (local38 < arg4 && local38 + this.anInt5617 > 0 && local51 < arg3 && local51 + this.anInt5617 > 0) {
			this.aClass73_30.method7955(local51 + arg1, local38 + arg2, this.anInt5617, this.anInt5617);
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(Lclient!r;Lclient!lc;)Z")
	private boolean method4567(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class183 arg1) {
		if (this.aClass73_30 == null) {
			if (this.anInt5620 == 0) {
				if (Static532.anInterface4_12.method7227(this.anInt5614)) {
					@Pc(23) int[] local23 = Static532.anInterface4_12.method7228(0.7F, this.anInt5614, this.anInt5615, this.anInt5615);
					this.aClass73_30 = arg0.method8033(local23, this.anInt5615, this.anInt5615, this.anInt5615);
				}
			} else if (this.anInt5620 == 2) {
				this.method4558(arg0, arg1);
			} else if (this.anInt5620 == 1) {
				this.method4560(arg0, arg1);
			}
		}
		return this.aClass73_30 != null;
	}
}
