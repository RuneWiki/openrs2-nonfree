import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class184 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public int anInt5598;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!kh;")
	private Class54 aClass54_19;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	private int anInt5602;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	private int anInt5603;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	private int anInt5605;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private int anInt5606;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	private final int anInt5607;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	private final int anInt5600;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "I")
	private final int anInt5604;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "I")
	private final int anInt5596;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	private final int anInt5597;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	private final int anInt5599;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	private final int anInt5601;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5607 = arg2;
		this.anInt5600 = arg3;
		this.anInt5604 = arg4;
		this.aBoolean421 = arg7;
		this.anInt5596 = arg1;
		this.anInt5597 = arg6;
		this.anInt5599 = arg5;
		this.anInt5601 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "()V")
	public void method4957() {
		this.aClass54_19 = null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!en;IIIIII)V")
	public void method4958(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass54_19 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt5603 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt5606 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt5602) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt5602) / 2;
		if (local38 < arg4 && local38 + this.anInt5602 > 0 && local51 < arg3 && local51 + this.anInt5602 > 0) {
			this.aClass54_19.method5578(local51 + arg1, local38 + arg2, this.anInt5602, this.anInt5602);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!en;Lclient!si;)Z")
	private boolean method4962(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class184 arg1) {
		if (this.aClass54_19 == null) {
			if (this.anInt5601 == 0) {
				if (Static51.anInterface1_1.method2003(this.anInt5596)) {
					@Pc(23) int[] local23 = Static51.anInterface1_1.method2006(this.anInt5605, this.anInt5596, 0.7F, this.anInt5605);
					this.aClass54_19 = arg0.method4834(local23, this.anInt5605, this.anInt5605, this.anInt5605);
				}
			} else if (this.anInt5601 == 2) {
				this.method4965(arg0, arg1);
			} else if (this.anInt5601 == 1) {
				this.method4966(arg0, arg1);
			}
		}
		return this.aClass54_19 != null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)Z")
	public boolean method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean421) {
			this.anInt5598 = 1073741823;
			local7 = this.anInt5607;
			local12 = this.anInt5600;
			local17 = this.anInt5604;
		} else {
			local7 = this.anInt5607 - arg0;
			local12 = this.anInt5600 - arg1;
			local17 = this.anInt5604 - arg2;
			this.anInt5598 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5598 == 0) {
				this.anInt5598 = 1;
			}
			local7 = (local7 << 8) / this.anInt5598;
			local12 = (local12 << 8) / this.anInt5598;
			local17 = (local17 << 8) / this.anInt5598;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5602 = this.anInt5599 * arg3 / (this.aBoolean421 ? 1024 : this.anInt5598);
		} else {
			this.anInt5602 = 0;
		}
		if (this.anInt5602 < 8) {
			this.aClass54_19 = null;
			return false;
		}
		@Pc(143) int local143 = Static266.method4535(this.anInt5602);
		if (local143 > arg3) {
			local143 = Static7.method234(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5605) {
			this.anInt5605 = local143;
		}
		this.anInt5603 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt5606 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass54_19 = null;
		return true;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Lclient!en;Lclient!si;)Z")
	public boolean method4964(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class184 arg1) {
		return this.aClass54_19 != null || this.method4962(arg0, arg1);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(Lclient!en;Lclient!si;)V")
	private void method4965(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class184 arg1) {
		@Pc(6) Class150 local6 = Static17.method5326(this.anInt5596, Static175.aClass170_64);
		if (local6 == null) {
			return;
		}
		arg0.method4817(Static292.anIntArray425);
		arg0.method4795(0, 0, this.anInt5605, this.anInt5605);
		arg0.method4877(0, 0, this.anInt5605, this.anInt5605, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean421) {
				local32 = -arg1.anInt5607;
				local34 = -arg1.anInt5600;
				local36 = -arg1.anInt5604;
			} else {
				local32 = this.anInt5607 - arg1.anInt5607;
				local34 = this.anInt5600 - arg1.anInt5600;
				local36 = this.anInt5604 - arg1.anInt5604;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt5603 != 0) {
			local81 = -this.anInt5603 & 0x3FFF;
			local85 = Class5_Sub9_Sub12.anIntArray169[local81];
			local89 = Class5_Sub9_Sub12.anIntArray170[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt5606 != 0) {
			local81 = -this.anInt5606 & 0x3FFF;
			local85 = Class5_Sub9_Sub12.anIntArray169[local81];
			local89 = Class5_Sub9_Sub12.anIntArray170[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4791(1.0F);
		arg0.method4793(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class101 local172 = arg0.method4804(local6, 1024, 0, 64, 768);
		local85 = local172.method5152() - local172.method5165();
		local89 = local172.method5188() - local172.method5147();
		local99 = local172.method5165() + local85 / 2;
		@Pc(198) int local198 = local172.method5147() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4869(local99, local198, local205, local205);
		arg0.method4787(arg0.method4789());
		@Pc(218) Class112 local218 = arg0.method4798();
		local218.method3589(0, 0, arg0.method4839() - local172.method5162());
		local172.method5151(local218, null, arg0.method4839());
		this.aClass54_19 = arg0.method4794(0, 0, this.anInt5605, this.anInt5605, true);
		this.aClass54_19.method5566(3);
		arg0.method4795(Static292.anIntArray425[0], Static292.anIntArray425[1], Static292.anIntArray425[2], Static292.anIntArray425[3]);
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(Lclient!en;Lclient!si;)V")
	private void method4966(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class184 arg1) {
		Static292.method4961(arg0);
		Static292.method4959(arg0);
		arg0.method4817(Static292.anIntArray425);
		arg0.method4795(0, 0, this.anInt5605, this.anInt5605);
		arg0.method4860();
		arg0.method4877(0, 0, this.anInt5605, this.anInt5605, this.anInt5597 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean421) {
				local31 = -arg1.anInt5607;
				local33 = -arg1.anInt5600;
				local35 = -arg1.anInt5604;
			} else {
				local31 = arg1.anInt5607 - this.anInt5607;
				local33 = arg1.anInt5600 - this.anInt5600;
				local35 = arg1.anInt5604 - this.anInt5604;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5603 != 0) {
			local79 = Class5_Sub9_Sub12.anIntArray169[this.anInt5603];
			local84 = Class5_Sub9_Sub12.anIntArray170[this.anInt5603];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt5606 != 0) {
			local79 = Class5_Sub9_Sub12.anIntArray169[this.anInt5606];
			local84 = Class5_Sub9_Sub12.anIntArray170[this.anInt5606];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class101 local147 = Static292.aClass101_5.method5184((byte) 0, 25600, true);
		if (arg0.method4832()) {
			local147.method5153((short) 0, (short) this.anInt5596);
		} else {
			local147.method5159((short) 127, Static51.anInterface1_1.method2005(this.anInt5596).aShort30);
			local147.method5153((short) 0, (short) -1);
		}
		arg0.method4791(1.0F);
		arg0.method4793(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5605 * 1024 / (local147.method5152() - local147.method5165());
		if (this.anInt5597 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4869(this.anInt5605 / 2, this.anInt5605 / 2, local84, local84);
		arg0.method4787(arg0.method4789());
		@Pc(223) Class112 local223 = arg0.method4789();
		local223.method3589(0, 0, arg0.method4839() - local147.method5162());
		local147.method5151(local223, null, 1024);
		@Pc(245) int local245 = this.anInt5605 * 13 / 16;
		@Pc(252) int local252 = (this.anInt5605 - local245) / 2;
		Static292.aClass54_20.method5573(local252, local252, local245, local245, 1, this.anInt5597 | 0xFF000000, 1);
		this.aClass54_19 = arg0.method4794(0, 0, this.anInt5605, this.anInt5605, true);
		arg0.method4860();
		arg0.method4877(0, 0, this.anInt5605, this.anInt5605, 0, 0);
		Static292.aClass54_18.method5573(0, 0, this.anInt5605, this.anInt5605, 0, 0, 0);
		this.aClass54_19.method5566(0);
		arg0.method4795(Static292.anIntArray425[0], Static292.anIntArray425[1], Static292.anIntArray425[2], Static292.anIntArray425[3]);
	}
}
