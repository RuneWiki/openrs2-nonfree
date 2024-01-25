import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class336 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	private int anInt9294;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public int anInt9296;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	private int anInt9297;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	private int anInt9300;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	private int anInt9301;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!qda;")
	private Class59 aClass59_36;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	private final int anInt9302;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	private final int anInt9305;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	private final int anInt9295;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Z")
	private final boolean aBoolean676;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private final int anInt9303;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	private final int anInt9304;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	private final int anInt9298;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	private final int anInt9299;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9302 = arg2;
		this.anInt9305 = arg3;
		this.anInt9295 = arg4;
		this.aBoolean676 = arg7;
		this.anInt9303 = arg1;
		this.anInt9304 = arg6;
		this.anInt9298 = arg5;
		this.anInt9299 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ha;Lclient!th;)V")
	private void method7778(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class336 arg1) {
		@Pc(6) Class156 local6 = Static437.method6555(Static373.aClass50_109, this.anInt9303);
		if (local6 == null) {
			return;
		}
		arg0.K(Static567.anIntArray510);
		arg0.KA(0, 0, this.anInt9301, this.anInt9301);
		arg0.aa(0, 0, this.anInt9301, this.anInt9301, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean676) {
				local32 = -arg1.anInt9302;
				local34 = -arg1.anInt9305;
				local36 = -arg1.anInt9295;
			} else {
				local32 = this.anInt9302 - arg1.anInt9302;
				local34 = this.anInt9305 - arg1.anInt9305;
				local36 = this.anInt9295 - arg1.anInt9295;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9297 != 0) {
			local81 = -this.anInt9297 & 0x3FFF;
			local85 = Class242.anIntArray384[local81];
			local89 = Class242.anIntArray383[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt9294 != 0) {
			local81 = -this.anInt9294 & 0x3FFF;
			local85 = Class242.anIntArray384[local81];
			local89 = Class242.anIntArray383[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class114 local172 = arg0.method6203(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6222(arg0.method6232());
		@Pc(218) Class56 local218 = arg0.method6212();
		local218.method8395(0, 0, arg0.i() - local172.HA());
		local172.method8807(local218, (Class41_Sub9) null, arg0.i(), 1);
		this.aClass59_36 = arg0.method6265(0, 0, this.anInt9301, this.anInt9301, true);
		this.aClass59_36.method8066(3);
		arg0.KA(Static567.anIntArray510[0], Static567.anIntArray510[1], Static567.anIntArray510[2], Static567.anIntArray510[3]);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Lclient!ha;Lclient!th;)Z")
	public boolean method7780(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class336 arg1) {
		return this.aClass59_36 != null || this.method7788(arg0, arg1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)Z")
	public boolean method7784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean676) {
			this.anInt9296 = 1073741823;
			local7 = this.anInt9302;
			local12 = this.anInt9305;
			local17 = this.anInt9295;
		} else {
			local7 = this.anInt9302 - arg0;
			local12 = this.anInt9305 - arg1;
			local17 = this.anInt9295 - arg2;
			this.anInt9296 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9296 == 0) {
				this.anInt9296 = 1;
			}
			local7 = (local7 << 8) / this.anInt9296;
			local12 = (local12 << 8) / this.anInt9296;
			local17 = (local17 << 8) / this.anInt9296;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9300 = this.anInt9298 * arg3 / (this.aBoolean676 ? 1024 : this.anInt9296);
		} else {
			this.anInt9300 = 0;
		}
		if (this.anInt9300 < 8) {
			this.aClass59_36 = null;
			return false;
		}
		@Pc(143) int local143 = Static209.method2991(this.anInt9300);
		if (local143 > arg3) {
			local143 = Static630.method8378(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9301) {
			this.anInt9301 = local143;
		}
		this.anInt9297 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt9294 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass59_36 = null;
		return true;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "()V")
	public void method7785() {
		this.aClass59_36 = null;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(Lclient!ha;Lclient!th;)V")
	private void method7786(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class336 arg1) {
		Static567.method7782(arg0);
		Static567.method7783(arg0);
		arg0.K(Static567.anIntArray510);
		arg0.KA(0, 0, this.anInt9301, this.anInt9301);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9301, this.anInt9301, this.anInt9304 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean676) {
				local31 = -arg1.anInt9302;
				local33 = -arg1.anInt9305;
				local35 = -arg1.anInt9295;
			} else {
				local31 = arg1.anInt9302 - this.anInt9302;
				local33 = arg1.anInt9305 - this.anInt9305;
				local35 = arg1.anInt9295 - this.anInt9295;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9297 != 0) {
			local79 = Class242.anIntArray384[this.anInt9297];
			local84 = Class242.anIntArray383[this.anInt9297];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt9294 != 0) {
			local79 = Class242.anIntArray384[this.anInt9294];
			local84 = Class242.anIntArray383[this.anInt9294];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class114 local147 = Static567.aClass114_5.method8810((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt9303);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9301 * 1024 / (local147.RA() - local147.V());
		if (this.anInt9304 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt9301 / 2, this.anInt9301 / 2, local84, local84);
		arg0.method6222(arg0.method6232());
		@Pc(206) Class56 local206 = arg0.method6232();
		local206.method8395(0, 0, arg0.i() - local147.HA());
		local147.method8807(local206, (Class41_Sub9) null, 1024, 1);
		@Pc(228) int local228 = this.anInt9301 * 13 / 16;
		@Pc(235) int local235 = (this.anInt9301 - local228) / 2;
		Static567.aClass59_37.method8058(local235, local235, local228, local228, 0, this.anInt9304 | 0xFF000000, 1);
		this.aClass59_36 = arg0.method6265(0, 0, this.anInt9301, this.anInt9301, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9301, this.anInt9301, 0, 0);
		Static567.aClass59_35.method8058(0, 0, this.anInt9301, this.anInt9301, 1, 0, 0);
		this.aClass59_36.method8066(0);
		arg0.KA(Static567.anIntArray510[0], Static567.anIntArray510[1], Static567.anIntArray510[2], Static567.anIntArray510[3]);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method7787(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass59_36 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9297 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9294 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9300) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9300) / 2;
		if (local38 < arg4 && local38 + this.anInt9300 > 0 && local51 < arg3 && local51 + this.anInt9300 > 0) {
			this.aClass59_36.method8055(local51 + arg1, local38 + arg2, this.anInt9300, this.anInt9300);
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(Lclient!ha;Lclient!th;)Z")
	private boolean method7788(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class336 arg1) {
		if (this.aClass59_36 == null) {
			if (this.anInt9299 == 0) {
				if (Static400.anInterface3_9.method8500(this.anInt9303)) {
					@Pc(23) int[] local23 = Static400.anInterface3_9.method8497(this.anInt9303, this.anInt9301, 0.7F, this.anInt9301);
					this.aClass59_36 = arg0.method6241(this.anInt9301, this.anInt9301, this.anInt9301, local23);
				}
			} else if (this.anInt9299 == 2) {
				this.method7778(arg0, arg1);
			} else if (this.anInt9299 == 1) {
				this.method7786(arg0, arg1);
			}
		}
		return this.aClass59_36 != null;
	}
}
