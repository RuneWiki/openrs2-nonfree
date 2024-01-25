import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class189 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	private int anInt6608;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
	private int anInt6610;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	private int anInt6612;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	public int anInt6613;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	private int anInt6614;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Lclient!ufa;")
	private Class4 aClass4_17;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	private final int anInt6619;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	private final int anInt6609;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	private final int anInt6615;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "Z")
	private final boolean aBoolean520;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	private final int anInt6617;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	private final int anInt6618;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	private final int anInt6616;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	private final int anInt6611;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6619 = arg2;
		this.anInt6609 = arg3;
		this.anInt6615 = arg4;
		this.aBoolean520 = arg7;
		this.anInt6617 = arg1;
		this.anInt6618 = arg6;
		this.anInt6616 = arg5;
		this.anInt6611 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ha;Lclient!ls;)Z")
	private boolean method5526(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class189 arg1) {
		if (this.aClass4_17 == null) {
			if (this.anInt6611 == 0) {
				if (Static132.anInterface7_6.method6928(this.anInt6617)) {
					@Pc(23) int[] local23 = Static132.anInterface7_6.method6933(this.anInt6608, this.anInt6617, 0.7F, this.anInt6608);
					this.aClass4_17 = arg0.method6111(this.anInt6608, this.anInt6608, local23, this.anInt6608);
				}
			} else if (this.anInt6611 == 2) {
				this.method5529(arg0, arg1);
			} else if (this.anInt6611 == 1) {
				this.method5533(arg0, arg1);
			}
		}
		return this.aClass4_17 != null;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	public void method5527() {
		this.aClass4_17 = null;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lclient!ha;Lclient!ls;)V")
	private void method5529(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class189 arg1) {
		@Pc(6) Class192 local6 = Static63.method1779(Static637.aClass223_143, this.anInt6617);
		if (local6 == null) {
			return;
		}
		arg0.K(Static331.anIntArray308);
		arg0.KA(0, 0, this.anInt6608, this.anInt6608);
		arg0.aa(0, 0, this.anInt6608, this.anInt6608, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean520) {
				local32 = -arg1.anInt6619;
				local34 = -arg1.anInt6609;
				local36 = -arg1.anInt6615;
			} else {
				local32 = this.anInt6619 - arg1.anInt6619;
				local34 = this.anInt6609 - arg1.anInt6609;
				local36 = this.anInt6615 - arg1.anInt6615;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6610 != 0) {
			local81 = -this.anInt6610 & 0x3FFF;
			local85 = Class78_Sub2_Sub2.anIntArray270[local81];
			local89 = Class78_Sub2_Sub2.anIntArray271[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt6614 != 0) {
			local81 = -this.anInt6614 & 0x3FFF;
			local85 = Class78_Sub2_Sub2.anIntArray270[local81];
			local89 = Class78_Sub2_Sub2.anIntArray271[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class92 local172 = arg0.method6153(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6122(arg0.method6184());
		@Pc(218) Class115 local218 = arg0.method6156();
		local218.method6290(0, 0, arg0.i() - local172.HA());
		local172.method7057(local218, (Class9_Sub6) null, arg0.i(), 1);
		this.aClass4_17 = arg0.method6160(0, 0, this.anInt6608, this.anInt6608, true);
		this.aClass4_17.method7705(3);
		arg0.KA(Static331.anIntArray308[0], Static331.anIntArray308[1], Static331.anIntArray308[2], Static331.anIntArray308[3]);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method5530(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass4_17 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6610 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6614 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6612) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6612) / 2;
		if (local38 < arg4 && local38 + this.anInt6612 > 0 && local51 < arg3 && local51 + this.anInt6612 > 0) {
			this.aClass4_17.method7689(local51 + arg1, local38 + arg2, this.anInt6612, this.anInt6612);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)Z")
	public boolean method5532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean520) {
			this.anInt6613 = 1073741823;
			local7 = this.anInt6619;
			local12 = this.anInt6609;
			local17 = this.anInt6615;
		} else {
			local7 = this.anInt6619 - arg0;
			local12 = this.anInt6609 - arg1;
			local17 = this.anInt6615 - arg2;
			this.anInt6613 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6613 == 0) {
				this.anInt6613 = 1;
			}
			local7 = (local7 << 8) / this.anInt6613;
			local12 = (local12 << 8) / this.anInt6613;
			local17 = (local17 << 8) / this.anInt6613;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6612 = this.anInt6616 * arg3 / (this.aBoolean520 ? 1024 : this.anInt6613);
		} else {
			this.anInt6612 = 0;
		}
		if (this.anInt6612 < 8) {
			this.aClass4_17 = null;
			return false;
		}
		@Pc(143) int local143 = Static101.method2622(this.anInt6612);
		if (local143 > arg3) {
			local143 = Static48.method1561(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6608) {
			this.anInt6608 = local143;
		}
		this.anInt6610 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt6614 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass4_17 = null;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(Lclient!ha;Lclient!ls;)V")
	private void method5533(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class189 arg1) {
		Static331.method5531(arg0);
		Static331.method5525(arg0);
		arg0.K(Static331.anIntArray308);
		arg0.KA(0, 0, this.anInt6608, this.anInt6608);
		arg0.ya();
		arg0.aa(0, 0, this.anInt6608, this.anInt6608, this.anInt6618 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean520) {
				local31 = -arg1.anInt6619;
				local33 = -arg1.anInt6609;
				local35 = -arg1.anInt6615;
			} else {
				local31 = arg1.anInt6619 - this.anInt6619;
				local33 = arg1.anInt6609 - this.anInt6609;
				local35 = arg1.anInt6615 - this.anInt6615;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6610 != 0) {
			local79 = Class78_Sub2_Sub2.anIntArray270[this.anInt6610];
			local84 = Class78_Sub2_Sub2.anIntArray271[this.anInt6610];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt6614 != 0) {
			local79 = Class78_Sub2_Sub2.anIntArray270[this.anInt6614];
			local84 = Class78_Sub2_Sub2.anIntArray271[this.anInt6614];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class92 local147 = Static331.aClass92_2.method7069((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt6617);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6608 * 1024 / (local147.RA() - local147.V());
		if (this.anInt6618 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt6608 / 2, this.anInt6608 / 2, local84, local84);
		arg0.method6122(arg0.method6184());
		@Pc(206) Class115 local206 = arg0.method6184();
		local206.method6290(0, 0, arg0.i() - local147.HA());
		local147.method7057(local206, (Class9_Sub6) null, 1024, 1);
		@Pc(228) int local228 = this.anInt6608 * 13 / 16;
		@Pc(235) int local235 = (this.anInt6608 - local228) / 2;
		Static331.aClass4_16.method7690(local235, local235, local228, local228, 0, this.anInt6618 | 0xFF000000, 1);
		this.aClass4_17 = arg0.method6160(0, 0, this.anInt6608, this.anInt6608, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt6608, this.anInt6608, 0, 0);
		Static331.aClass4_15.method7690(0, 0, this.anInt6608, this.anInt6608, 1, 0, 0);
		this.aClass4_17.method7705(0);
		arg0.KA(Static331.anIntArray308[0], Static331.anIntArray308[1], Static331.anIntArray308[2], Static331.anIntArray308[3]);
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(Lclient!ha;Lclient!ls;)Z")
	public boolean method5534(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class189 arg1) {
		return this.aClass4_17 != null || this.method5526(arg0, arg1);
	}
}
