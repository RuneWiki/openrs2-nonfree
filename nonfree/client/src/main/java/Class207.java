import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class207 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	private int anInt5638;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!aq;")
	private Class5 aClass5_11;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	public int anInt5644;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	private int anInt5646;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	private int anInt5649;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	private final int anInt5639;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	private final int anInt5641;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	private final int anInt5643;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	private final int anInt5640;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	private final int anInt5645;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	private final int anInt5642;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	private final int anInt5648;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5639 = arg2;
		this.anInt5641 = arg3;
		this.anInt5643 = arg4;
		this.aBoolean439 = arg7;
		this.anInt5640 = arg1;
		this.anInt5645 = arg6;
		this.anInt5642 = arg5;
		this.anInt5648 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Z")
	public boolean method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean439) {
			this.anInt5644 = 1073741823;
			local7 = this.anInt5639;
			local12 = this.anInt5641;
			local17 = this.anInt5643;
		} else {
			local7 = this.anInt5639 - arg0;
			local12 = this.anInt5641 - arg1;
			local17 = this.anInt5643 - arg2;
			this.anInt5644 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5644 == 0) {
				this.anInt5644 = 1;
			}
			local7 = (local7 << 8) / this.anInt5644;
			local12 = (local12 << 8) / this.anInt5644;
			local17 = (local17 << 8) / this.anInt5644;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5647 = this.anInt5642 * arg3 / (this.aBoolean439 ? 1024 : this.anInt5644);
		} else {
			this.anInt5647 = 0;
		}
		if (this.anInt5647 < 8) {
			this.aClass5_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static353.method5359(this.anInt5647);
		if (local143 > arg3) {
			local143 = Static321.method4947(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5638) {
			this.anInt5638 = local143;
		}
		this.anInt5649 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt5646 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass5_11 = null;
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!km;Lclient!sg;)Z")
	public boolean method4952(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class207 arg1) {
		return this.aClass5_11 != null || this.method4958(arg0, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lclient!km;Lclient!sg;)V")
	private void method4953(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class207 arg1) {
		@Pc(6) Class91 local6 = Static67.method1243(this.anInt5640, Static209.aClass71_51);
		if (local6 == null) {
			return;
		}
		arg0.method4523(Static322.anIntArray693);
		arg0.method4477(0, 0, this.anInt5638, this.anInt5638);
		arg0.method4482(0, 0, this.anInt5638, this.anInt5638, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean439) {
				local32 = -arg1.anInt5639;
				local34 = -arg1.anInt5641;
				local36 = -arg1.anInt5643;
			} else {
				local32 = this.anInt5639 - arg1.anInt5639;
				local34 = this.anInt5641 - arg1.anInt5641;
				local36 = this.anInt5643 - arg1.anInt5643;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt5649 != 0) {
			local81 = -this.anInt5649 & 0x3FFF;
			local85 = Class104.anIntArray705[local81];
			local89 = Class104.anIntArray706[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt5646 != 0) {
			local81 = -this.anInt5646 & 0x3FFF;
			local85 = Class104.anIntArray705[local81];
			local89 = Class104.anIntArray706[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4457(1.0F);
		arg0.method4520(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class3 local172 = arg0.method4466(local6, 1024, 0, 64, 768);
		local85 = local172.method3468() - local172.method3458();
		local89 = local172.method3471() - local172.method3459();
		local99 = local172.method3458() + local85 / 2;
		@Pc(198) int local198 = local172.method3459() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4506(local99, local198, local205, local205);
		arg0.method4533(arg0.method4493());
		@Pc(218) Class54 local218 = arg0.method4556();
		local218.method4789(0, 0, arg0.method4529() - local172.method3436());
		local172.method3465(local218, null, arg0.method4529());
		this.aClass5_11 = arg0.method4501(0, 0, this.anInt5638, this.anInt5638, true);
		this.aClass5_11.method4997(3);
		arg0.method4477(Static322.anIntArray693[0], Static322.anIntArray693[1], Static322.anIntArray693[2], Static322.anIntArray693[3]);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!km;IIIIII)V")
	public void method4955(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt5649 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt5646 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt5647) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt5647) / 2;
		if (local38 < arg4 && local38 + this.anInt5647 > 0 && local51 < arg3 && local51 + this.anInt5647 > 0) {
			this.aClass5_11.method4991(local51 + arg1, local38 + arg2, this.anInt5647, this.anInt5647);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lclient!km;Lclient!sg;)V")
	private void method4956(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class207 arg1) {
		Static322.method4950(arg0);
		Static322.method4954(arg0);
		arg0.method4523(Static322.anIntArray693);
		arg0.method4477(0, 0, this.anInt5638, this.anInt5638);
		arg0.method4458();
		arg0.method4482(0, 0, this.anInt5638, this.anInt5638, this.anInt5645 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean439) {
				local31 = -arg1.anInt5639;
				local33 = -arg1.anInt5641;
				local35 = -arg1.anInt5643;
			} else {
				local31 = arg1.anInt5639 - this.anInt5639;
				local33 = arg1.anInt5641 - this.anInt5641;
				local35 = arg1.anInt5643 - this.anInt5643;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5649 != 0) {
			local79 = Class104.anIntArray705[this.anInt5649];
			local84 = Class104.anIntArray706[this.anInt5649];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt5646 != 0) {
			local79 = Class104.anIntArray705[this.anInt5646];
			local84 = Class104.anIntArray706[this.anInt5646];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class3 local147 = Static322.aClass3_7.method3481((byte) 0, 25600, true);
		if (arg0.method4521()) {
			local147.method3467((short) 0, (short) this.anInt5640);
		} else {
			local147.method3440((short) 127, Static99.anInterface1_1.method2849(this.anInt5640).aShort70);
			local147.method3467((short) 0, (short) -1);
		}
		arg0.method4457(1.0F);
		arg0.method4520(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5638 * 1024 / (local147.method3468() - local147.method3458());
		if (this.anInt5645 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4506(this.anInt5638 / 2, this.anInt5638 / 2, local84, local84);
		arg0.method4533(arg0.method4493());
		@Pc(223) Class54 local223 = arg0.method4493();
		local223.method4789(0, 0, arg0.method4529() - local147.method3436());
		local147.method3465(local223, null, 1024);
		@Pc(245) int local245 = this.anInt5638 * 13 / 16;
		@Pc(252) int local252 = (this.anInt5638 - local245) / 2;
		Static322.aClass5_13.method5000(local252, local252, local245, local245, 1, this.anInt5645 | 0xFF000000, 1);
		this.aClass5_11 = arg0.method4501(0, 0, this.anInt5638, this.anInt5638, true);
		arg0.method4458();
		arg0.method4482(0, 0, this.anInt5638, this.anInt5638, 0, 0);
		Static322.aClass5_12.method5000(0, 0, this.anInt5638, this.anInt5638, 0, 0, 0);
		this.aClass5_11.method4997(0);
		arg0.method4477(Static322.anIntArray693[0], Static322.anIntArray693[1], Static322.anIntArray693[2], Static322.anIntArray693[3]);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(Lclient!km;Lclient!sg;)Z")
	private boolean method4958(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class207 arg1) {
		if (this.aClass5_11 == null) {
			if (this.anInt5648 == 0) {
				if (Static99.anInterface1_1.method2846(this.anInt5640)) {
					@Pc(23) int[] local23 = Static99.anInterface1_1.method2848(this.anInt5638, 0.7F, this.anInt5640, this.anInt5638);
					this.aClass5_11 = arg0.method4456(local23, this.anInt5638, this.anInt5638, this.anInt5638);
				}
			} else if (this.anInt5648 == 2) {
				this.method4953(arg0, arg1);
			} else if (this.anInt5648 == 1) {
				this.method4956(arg0, arg1);
			}
		}
		return this.aClass5_11 != null;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
	public void method4959() {
		this.aClass5_11 = null;
	}
}
