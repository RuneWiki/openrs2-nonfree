import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class179 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "Lclient!f;")
	private Class5 aClass5_16;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public int anInt4681;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	private int anInt4682;

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
	private int anInt4684;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
	private int anInt4685;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
	private int anInt4692;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	private final int anInt4688;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	private final int anInt4689;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
	private final int anInt4690;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Z")
	private final boolean aBoolean359;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	private final int anInt4683;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	private final int anInt4691;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	private final int anInt4687;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
	private final int anInt4686;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4688 = arg2;
		this.anInt4689 = arg3;
		this.anInt4690 = arg4;
		this.aBoolean359 = arg7;
		this.anInt4683 = arg1;
		this.anInt4691 = arg6;
		this.anInt4687 = arg5;
		this.anInt4686 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!r;Lclient!ju;)Z")
	private boolean method3719(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class179 arg1) {
		if (this.aClass5_16 == null) {
			if (this.anInt4686 == 0) {
				if (Static231.anInterface9_5.method949(this.anInt4683)) {
					@Pc(23) int[] local23 = Static231.anInterface9_5.method952(0.7F, this.anInt4684, this.anInt4684, this.anInt4683);
					this.aClass5_16 = arg0.method6842(local23, this.anInt4684, this.anInt4684, this.anInt4684);
				}
			} else if (this.anInt4686 == 2) {
				this.method3722(arg0, arg1);
			} else if (this.anInt4686 == 1) {
				this.method3727(arg0, arg1);
			}
		}
		return this.aClass5_16 != null;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method3721(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_16 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4682 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4692 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4685) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4685) / 2;
		if (local38 < arg4 && local38 + this.anInt4685 > 0 && local51 < arg3 && local51 + this.anInt4685 > 0) {
			this.aClass5_16.method7801(local51 + arg1, local38 + arg2, this.anInt4685, this.anInt4685);
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lclient!r;Lclient!ju;)V")
	private void method3722(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class179 arg1) {
		@Pc(6) Class231 local6 = Static317.method7563(this.anInt4683, Static81.aClass308_32);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static255.anIntArray257);
		arg0.da(0, 0, this.anInt4684, this.anInt4684);
		arg0.J(0, 0, this.anInt4684, this.anInt4684, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean359) {
				local32 = -arg1.anInt4688;
				local34 = -arg1.anInt4689;
				local36 = -arg1.anInt4690;
			} else {
				local32 = this.anInt4688 - arg1.anInt4688;
				local34 = this.anInt4689 - arg1.anInt4689;
				local36 = this.anInt4690 - arg1.anInt4690;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4682 != 0) {
			local81 = -this.anInt4682 & 0x3FFF;
			local85 = Class85_Sub8.anIntArray426[local81];
			local89 = Class85_Sub8.anIntArray427[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt4692 != 0) {
			local81 = -this.anInt4692 & 0x3FFF;
			local85 = Class85_Sub8.anIntArray426[local81];
			local89 = Class85_Sub8.anIntArray427[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class52 local172 = arg0.method6817(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method6812(arg0.method6833());
		@Pc(218) Class34 local218 = arg0.method6848();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7405(local218, null, arg0.BA(), 1);
		this.aClass5_16 = arg0.method6823(0, 0, this.anInt4684, this.anInt4684, true);
		this.aClass5_16.xa(0, 0, 3);
		arg0.da(Static255.anIntArray257[0], Static255.anIntArray257[1], Static255.anIntArray257[2], Static255.anIntArray257[3]);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(Lclient!r;Lclient!ju;)Z")
	public boolean method3723(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class179 arg1) {
		return this.aClass5_16 != null || this.method3719(arg0, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "()V")
	public void method3724() {
		this.aClass5_16 = null;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)Z")
	public boolean method3725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean359) {
			this.anInt4681 = 1073741823;
			local7 = this.anInt4688;
			local12 = this.anInt4689;
			local17 = this.anInt4690;
		} else {
			local7 = this.anInt4688 - arg0;
			local12 = this.anInt4689 - arg1;
			local17 = this.anInt4690 - arg2;
			this.anInt4681 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4681 == 0) {
				this.anInt4681 = 1;
			}
			local7 = (local7 << 8) / this.anInt4681;
			local12 = (local12 << 8) / this.anInt4681;
			local17 = (local17 << 8) / this.anInt4681;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4685 = this.anInt4687 * arg3 / (this.aBoolean359 ? 1024 : this.anInt4681);
		} else {
			this.anInt4685 = 0;
		}
		if (this.anInt4685 < 8) {
			this.aClass5_16 = null;
			return false;
		}
		@Pc(143) int local143 = Static122.method2187(this.anInt4685);
		if (local143 > arg3) {
			local143 = Static505.method7085(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4684) {
			this.anInt4684 = local143;
		}
		this.anInt4682 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4692 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass5_16 = null;
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(Lclient!r;Lclient!ju;)V")
	private void method3727(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class179 arg1) {
		Static255.method3726(arg0);
		Static255.method3728(arg0);
		arg0.oa(Static255.anIntArray257);
		arg0.da(0, 0, this.anInt4684, this.anInt4684);
		arg0.ya();
		arg0.J(0, 0, this.anInt4684, this.anInt4684, this.anInt4691 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean359) {
				local31 = -arg1.anInt4688;
				local33 = -arg1.anInt4689;
				local35 = -arg1.anInt4690;
			} else {
				local31 = arg1.anInt4688 - this.anInt4688;
				local33 = arg1.anInt4689 - this.anInt4689;
				local35 = arg1.anInt4690 - this.anInt4690;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4682 != 0) {
			local79 = Class85_Sub8.anIntArray426[this.anInt4682];
			local84 = Class85_Sub8.anIntArray427[this.anInt4682];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt4692 != 0) {
			local79 = Class85_Sub8.anIntArray426[this.anInt4692];
			local84 = Class85_Sub8.anIntArray427[this.anInt4692];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class52 local147 = Static255.aClass52_4.method7412((byte) 0, 51200, true);
		if (arg0.method6810()) {
			local147.DA((short) 0, (short) this.anInt4683);
		} else {
			local147.d((short) 127, Static231.anInterface9_5.method947(this.anInt4683).aShort19);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4684 * 1024 / (local147.l() - local147.KA());
		if (this.anInt4691 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt4684 / 2, this.anInt4684 / 2, local84, local84);
		arg0.method6812(arg0.method6833());
		@Pc(223) Class34 local223 = arg0.method6833();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7405(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt4684 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4684 - local245) / 2;
		Static255.aClass5_17.method7804(local252, local252, local245, local245, 0, this.anInt4691 | 0xFF000000, 1);
		this.aClass5_16 = arg0.method6823(0, 0, this.anInt4684, this.anInt4684, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt4684, this.anInt4684, 0, 0);
		Static255.aClass5_18.method7804(0, 0, this.anInt4684, this.anInt4684, 1, 0, 0);
		this.aClass5_16.xa(0, 0, 0);
		arg0.da(Static255.anIntArray257[0], Static255.anIntArray257[1], Static255.anIntArray257[2], Static255.anIntArray257[3]);
	}
}
