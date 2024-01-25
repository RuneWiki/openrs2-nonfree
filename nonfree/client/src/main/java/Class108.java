import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class108 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	private int anInt3219;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!kb;")
	private Class52 aClass52_14;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	private int anInt3224;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public int anInt3227;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	private int anInt3228;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	private int anInt3230;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	private final int anInt3226;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	private final int anInt3220;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	private final int anInt3221;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	private final int anInt3223;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	private final int anInt3229;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	private final int anInt3222;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private final int anInt3225;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3226 = arg2;
		this.anInt3220 = arg3;
		this.anInt3221 = arg4;
		this.aBoolean243 = arg7;
		this.anInt3223 = arg1;
		this.anInt3229 = arg6;
		this.anInt3222 = arg5;
		this.anInt3225 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)Z")
	public boolean method2950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean243) {
			this.anInt3227 = 1073741823;
			local7 = this.anInt3226;
			local12 = this.anInt3220;
			local17 = this.anInt3221;
		} else {
			local7 = this.anInt3226 - arg0;
			local12 = this.anInt3220 - arg1;
			local17 = this.anInt3221 - arg2;
			this.anInt3227 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3227 == 0) {
				this.anInt3227 = 1;
			}
			local7 = (local7 << 8) / this.anInt3227;
			local12 = (local12 << 8) / this.anInt3227;
			local17 = (local17 << 8) / this.anInt3227;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3224 = this.anInt3222 * arg3 / (this.aBoolean243 ? 1024 : this.anInt3227);
		} else {
			this.anInt3224 = 0;
		}
		if (this.anInt3224 < 8) {
			this.aClass52_14 = null;
			return false;
		}
		@Pc(143) int local143 = Static271.method4522(this.anInt3224);
		if (local143 > arg3) {
			local143 = Static108.method1053(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3228) {
			this.anInt3228 = local143;
		}
		this.anInt3219 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3230 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass52_14 = null;
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	public void method2951() {
		this.aClass52_14 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!pe;Lclient!je;)Z")
	public boolean method2952(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class108 arg1) {
		return this.aClass52_14 != null || this.method2954(arg0, arg1);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Lclient!pe;Lclient!je;)Z")
	private boolean method2954(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class108 arg1) {
		if (this.aClass52_14 == null) {
			if (this.anInt3225 == 0) {
				if (Static12.anInterface6_1.method5615(this.anInt3223)) {
					@Pc(23) int[] local23 = Static12.anInterface6_1.method5613(0.7F, this.anInt3223, this.anInt3228, this.anInt3228);
					this.aClass52_14 = arg0.method5409(local23, this.anInt3228, this.anInt3228, this.anInt3228);
				}
			} else if (this.anInt3225 == 2) {
				this.method2958(arg0, arg1);
			} else if (this.anInt3225 == 1) {
				this.method2956(arg0, arg1);
			}
		}
		return this.aClass52_14 != null;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Lclient!pe;Lclient!je;)V")
	private void method2956(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class108 arg1) {
		Static148.method2955(arg0);
		Static148.method2953(arg0);
		arg0.method5421(Static148.anIntArray421);
		arg0.method5431(0, 0, this.anInt3228, this.anInt3228);
		arg0.method5480();
		arg0.method5439(0, 0, this.anInt3228, this.anInt3228, this.anInt3229 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean243) {
				local31 = -arg1.anInt3226;
				local33 = -arg1.anInt3220;
				local35 = -arg1.anInt3221;
			} else {
				local31 = arg1.anInt3226 - this.anInt3226;
				local33 = arg1.anInt3220 - this.anInt3220;
				local35 = arg1.anInt3221 - this.anInt3221;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3219 != 0) {
			local79 = Class147.anIntArray604[this.anInt3219];
			local84 = Class147.anIntArray603[this.anInt3219];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3230 != 0) {
			local79 = Class147.anIntArray604[this.anInt3230];
			local84 = Class147.anIntArray603[this.anInt3230];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class31 local147 = Static148.aClass31_4.method1917((byte) 0, 25600, true);
		if (arg0.method5465()) {
			local147.method1941((short) 0, (short) this.anInt3223);
		} else {
			local147.method1929((short) 127, Static12.anInterface6_1.method5614(this.anInt3223).aShort7);
			local147.method1941((short) 0, (short) -1);
		}
		arg0.method5456(1.0F);
		arg0.method5462(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3228 * 1024 / (local147.method1935() - local147.method1957());
		if (this.anInt3229 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method5416(this.anInt3228 / 2, this.anInt3228 / 2, local84, local84);
		arg0.method5467(arg0.method5438());
		@Pc(223) Class70 local223 = arg0.method5438();
		local223.method3707(0, 0, arg0.method5440() - local147.method1933());
		local147.method1939(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3228 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3228 - local245) / 2;
		Static148.aClass52_16.method4127(local252, local252, local245, local245, 1, this.anInt3229 | 0xFF000000, 1);
		this.aClass52_14 = arg0.method5468(0, 0, this.anInt3228, this.anInt3228, true);
		arg0.method5480();
		arg0.method5439(0, 0, this.anInt3228, this.anInt3228, 0, 0);
		Static148.aClass52_15.method4127(0, 0, this.anInt3228, this.anInt3228, 0, 0, 0);
		this.aClass52_14.method4135(0);
		arg0.method5431(Static148.anIntArray421[0], Static148.anIntArray421[1], Static148.anIntArray421[2], Static148.anIntArray421[3]);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!pe;IIIIII)V")
	public void method2957(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass52_14 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3219 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3230 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3224) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3224) / 2;
		if (local38 < arg4 && local38 + this.anInt3224 > 0 && local51 < arg3 && local51 + this.anInt3224 > 0) {
			this.aClass52_14.method4130(local51 + arg1, local38 + arg2, this.anInt3224, this.anInt3224);
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(Lclient!pe;Lclient!je;)V")
	private void method2958(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class108 arg1) {
		@Pc(6) Class140 local6 = Static233.method4073(this.anInt3223, Static122.aClass180_32);
		if (local6 == null) {
			return;
		}
		arg0.method5421(Static148.anIntArray421);
		arg0.method5431(0, 0, this.anInt3228, this.anInt3228);
		arg0.method5439(0, 0, this.anInt3228, this.anInt3228, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean243) {
				local32 = -arg1.anInt3226;
				local34 = -arg1.anInt3220;
				local36 = -arg1.anInt3221;
			} else {
				local32 = this.anInt3226 - arg1.anInt3226;
				local34 = this.anInt3220 - arg1.anInt3220;
				local36 = this.anInt3221 - arg1.anInt3221;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3219 != 0) {
			local81 = -this.anInt3219 & 0x3FFF;
			local85 = Class147.anIntArray604[local81];
			local89 = Class147.anIntArray603[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3230 != 0) {
			local81 = -this.anInt3230 & 0x3FFF;
			local85 = Class147.anIntArray604[local81];
			local89 = Class147.anIntArray603[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method5456(1.0F);
		arg0.method5462(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class31 local172 = arg0.method5475(local6, 1024, 0, 64, 768);
		local85 = local172.method1935() - local172.method1957();
		local89 = local172.method1947() - local172.method1920();
		local99 = local172.method1957() + local85 / 2;
		@Pc(198) int local198 = local172.method1920() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method5416(local99, local198, local205, local205);
		arg0.method5467(arg0.method5438());
		@Pc(218) Class70 local218 = arg0.method5427();
		local218.method3707(0, 0, arg0.method5440() - local172.method1933());
		local172.method1939(local218, null, arg0.method5440());
		this.aClass52_14 = arg0.method5468(0, 0, this.anInt3228, this.anInt3228, true);
		this.aClass52_14.method4135(3);
		arg0.method5431(Static148.anIntArray421[0], Static148.anIntArray421[1], Static148.anIntArray421[2], Static148.anIntArray421[3]);
	}
}
