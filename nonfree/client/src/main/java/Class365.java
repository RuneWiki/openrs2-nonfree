import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class365 {

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "I")
	private int anInt9780;

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "Lclient!hk;")
	private Class155 aClass155_34;

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "I")
	public int anInt9781;

	@OriginalMember(owner = "client!uja", name = "n", descriptor = "I")
	private int anInt9786;

	@OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
	private int anInt9789;

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
	private int anInt9790;

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "I")
	private final int anInt9782;

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "I")
	private final int anInt9785;

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "I")
	private final int anInt9791;

	@OriginalMember(owner = "client!uja", name = "o", descriptor = "Z")
	private final boolean aBoolean686;

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
	private final int anInt9783;

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
	private final int anInt9787;

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "I")
	private final int anInt9788;

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "I")
	private final int anInt9784;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9782 = arg2;
		this.anInt9785 = arg3;
		this.anInt9791 = arg4;
		this.aBoolean686 = arg7;
		this.anInt9783 = arg1;
		this.anInt9787 = arg6;
		this.anInt9788 = arg5;
		this.anInt9784 = arg0;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(Lclient!ha;Lclient!uja;)V")
	private void method8325(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class365 arg1) {
		@Pc(6) Class197 local6 = Static485.method8979(Static396.aClass126_185, this.anInt9783);
		if (local6 == null) {
			return;
		}
		arg0.K(Static607.anIntArray545);
		arg0.KA(0, 0, this.anInt9786, this.anInt9786);
		arg0.aa(0, 0, this.anInt9786, this.anInt9786, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean686) {
				local32 = -arg1.anInt9782;
				local34 = -arg1.anInt9785;
				local36 = -arg1.anInt9791;
			} else {
				local32 = this.anInt9782 - arg1.anInt9782;
				local34 = this.anInt9785 - arg1.anInt9785;
				local36 = this.anInt9791 - arg1.anInt9791;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9790 != 0) {
			local81 = -this.anInt9790 & 0x3FFF;
			local85 = Class42.anIntArray51[local81];
			local89 = Class42.anIntArray52[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt9789 != 0) {
			local81 = -this.anInt9789 & 0x3FFF;
			local85 = Class42.anIntArray51[local81];
			local89 = Class42.anIntArray52[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class43 local172 = arg0.method8588(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8590(arg0.method8623());
		@Pc(218) Class10 local218 = arg0.method8610();
		local218.method4214(0, 0, arg0.i() - local172.HA());
		local172.method8846(local218, (Class4_Sub8) null, arg0.i(), 1);
		this.aClass155_34 = arg0.method8643(0, 0, this.anInt9786, this.anInt9786, true);
		this.aClass155_34.method7212(3);
		arg0.KA(Static607.anIntArray545[0], Static607.anIntArray545[1], Static607.anIntArray545[2], Static607.anIntArray545[3]);
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(Lclient!ha;Lclient!uja;)Z")
	private boolean method8326(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class365 arg1) {
		if (this.aClass155_34 == null) {
			if (this.anInt9784 == 0) {
				if (Static211.anInterface7_7.method7421(this.anInt9783)) {
					@Pc(23) int[] local23 = Static211.anInterface7_7.method7419(this.anInt9783, 0.7F, this.anInt9786, this.anInt9786);
					this.aClass155_34 = arg0.method8645(this.anInt9786, this.anInt9786, local23, this.anInt9786);
				}
			} else if (this.anInt9784 == 2) {
				this.method8325(arg0, arg1);
			} else if (this.anInt9784 == 1) {
				this.method8332(arg0, arg1);
			}
		}
		return this.aClass155_34 != null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method8327(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass155_34 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9790 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9789 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9780) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9780) / 2;
		if (local38 < arg4 && local38 + this.anInt9780 > 0 && local51 < arg3 && local51 + this.anInt9780 > 0) {
			this.aClass155_34.method7192(local51 + arg1, local38 + arg2, this.anInt9780, this.anInt9780);
		}
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "()V")
	public void method8329() {
		this.aClass155_34 = null;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Lclient!ha;Lclient!uja;)Z")
	public boolean method8330(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class365 arg1) {
		return this.aClass155_34 != null || this.method8326(arg0, arg1);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ha;Lclient!uja;)V")
	private void method8332(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class365 arg1) {
		Static607.method8334(arg0);
		Static607.method8331(arg0);
		arg0.K(Static607.anIntArray545);
		arg0.KA(0, 0, this.anInt9786, this.anInt9786);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9786, this.anInt9786, this.anInt9787 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean686) {
				local31 = -arg1.anInt9782;
				local33 = -arg1.anInt9785;
				local35 = -arg1.anInt9791;
			} else {
				local31 = arg1.anInt9782 - this.anInt9782;
				local33 = arg1.anInt9785 - this.anInt9785;
				local35 = arg1.anInt9791 - this.anInt9791;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9790 != 0) {
			local79 = Class42.anIntArray51[this.anInt9790];
			local84 = Class42.anIntArray52[this.anInt9790];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt9789 != 0) {
			local79 = Class42.anIntArray51[this.anInt9789];
			local84 = Class42.anIntArray52[this.anInt9789];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class43 local147 = Static607.aClass43_6.method8840((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt9783);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9786 * 1024 / (local147.RA() - local147.V());
		if (this.anInt9787 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt9786 / 2, this.anInt9786 / 2, local84, local84);
		arg0.method8590(arg0.method8623());
		@Pc(206) Class10 local206 = arg0.method8623();
		local206.method4214(0, 0, arg0.i() - local147.HA());
		local147.method8846(local206, (Class4_Sub8) null, 1024, 1);
		@Pc(228) int local228 = this.anInt9786 * 13 / 16;
		@Pc(235) int local235 = (this.anInt9786 - local228) / 2;
		Static607.aClass155_35.method7200(local235, local235, local228, local228, 0, this.anInt9787 | 0xFF000000, 1);
		this.aClass155_34 = arg0.method8643(0, 0, this.anInt9786, this.anInt9786, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9786, this.anInt9786, 0, 0);
		Static607.aClass155_36.method7200(0, 0, this.anInt9786, this.anInt9786, 1, 0, 0);
		this.aClass155_34.method7212(0);
		arg0.KA(Static607.anIntArray545[0], Static607.anIntArray545[1], Static607.anIntArray545[2], Static607.anIntArray545[3]);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIII)Z")
	public boolean method8333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean686) {
			this.anInt9781 = 1073741823;
			local7 = this.anInt9782;
			local12 = this.anInt9785;
			local17 = this.anInt9791;
		} else {
			local7 = this.anInt9782 - arg0;
			local12 = this.anInt9785 - arg1;
			local17 = this.anInt9791 - arg2;
			this.anInt9781 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9781 == 0) {
				this.anInt9781 = 1;
			}
			local7 = (local7 << 8) / this.anInt9781;
			local12 = (local12 << 8) / this.anInt9781;
			local17 = (local17 << 8) / this.anInt9781;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9780 = this.anInt9788 * arg3 / (this.aBoolean686 ? 1024 : this.anInt9781);
		} else {
			this.anInt9780 = 0;
		}
		if (this.anInt9780 < 8) {
			this.aClass155_34 = null;
			return false;
		}
		@Pc(143) int local143 = Static146.method2737(this.anInt9780);
		if (local143 > arg3) {
			local143 = Static186.method3180(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9786) {
			this.anInt9786 = local143;
		}
		this.anInt9790 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt9789 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass155_34 = null;
		return true;
	}
}
