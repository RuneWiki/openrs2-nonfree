import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class115 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	private int anInt3139;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "I")
	private int anInt3141;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public int anInt3143;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!l;")
	private Class11 aClass11_11;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "I")
	private int anInt3144;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	private int anInt3145;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	private final int anInt3137;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "I")
	private final int anInt3140;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	private final int anInt3147;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Z")
	private final boolean aBoolean189;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "I")
	private final int anInt3142;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	private final int anInt3136;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	private final int anInt3146;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	private final int anInt3138;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3137 = arg2;
		this.anInt3140 = arg3;
		this.anInt3147 = arg4;
		this.aBoolean189 = arg7;
		this.anInt3142 = arg1;
		this.anInt3136 = arg6;
		this.anInt3146 = arg5;
		this.anInt3138 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!ya;Lclient!il;)V")
	private void method2540(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class115 arg1) {
		@Pc(6) Class117 local6 = Static49.method625(Static124.aClass178_40, this.anInt3142);
		if (local6 == null) {
			return;
		}
		arg0.da(Static176.anIntArray272);
		arg0.OA(0, 0, this.anInt3141, this.anInt3141);
		arg0.O(0, 0, this.anInt3141, this.anInt3141, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean189) {
				local32 = -arg1.anInt3137;
				local34 = -arg1.anInt3140;
				local36 = -arg1.anInt3147;
			} else {
				local32 = this.anInt3137 - arg1.anInt3137;
				local34 = this.anInt3140 - arg1.anInt3140;
				local36 = this.anInt3147 - arg1.anInt3147;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3145 != 0) {
			local81 = -this.anInt3145 & 0x3FFF;
			local85 = Class22_Sub7.anIntArray411[local81];
			local89 = Class22_Sub7.anIntArray410[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3139 != 0) {
			local81 = -this.anInt3139 & 0x3FFF;
			local85 = Class22_Sub7.anIntArray411[local81];
			local89 = Class22_Sub7.anIntArray410[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class163 local172 = arg0.method5346(local6, 2048, 0, 64, 768);
		local85 = local172.NA() - local172.HA();
		local89 = local172.WA() - local172.MA();
		local99 = local172.HA() + local85 / 2;
		@Pc(198) int local198 = local172.MA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.H(local99, local198, local205, local205);
		arg0.ea(arg0.method5293());
		@Pc(218) Class33 local218 = arg0.method5285();
		local218.j(0, 0, arg0.a() - local172.PA());
		local172.method4650(local218, null, arg0.a());
		this.aClass11_11 = arg0.method5349(0, 0, this.anInt3141, this.anInt3141, true);
		this.aClass11_11.BA(0, 0, 3);
		arg0.OA(Static176.anIntArray272[0], Static176.anIntArray272[1], Static176.anIntArray272[2], Static176.anIntArray272[3]);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Lclient!ya;Lclient!il;)Z")
	private boolean method2542(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class115 arg1) {
		if (this.aClass11_11 == null) {
			if (this.anInt3138 == 0) {
				if (Static204.anInterface4_6.method3140(this.anInt3142)) {
					@Pc(23) int[] local23 = Static204.anInterface4_6.method3139(0.7F, this.anInt3142, this.anInt3141, this.anInt3141);
					this.aClass11_11 = arg0.method5310(local23, this.anInt3141, this.anInt3141, this.anInt3141);
				}
			} else if (this.anInt3138 == 2) {
				this.method2540(arg0, arg1);
			} else if (this.anInt3138 == 1) {
				this.method2547(arg0, arg1);
			}
		}
		return this.aClass11_11 != null;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
	public void method2543() {
		this.aClass11_11 = null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)Z")
	public boolean method2545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean189) {
			this.anInt3143 = 1073741823;
			local7 = this.anInt3137;
			local12 = this.anInt3140;
			local17 = this.anInt3147;
		} else {
			local7 = this.anInt3137 - arg0;
			local12 = this.anInt3140 - arg1;
			local17 = this.anInt3147 - arg2;
			this.anInt3143 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3143 == 0) {
				this.anInt3143 = 1;
			}
			local7 = (local7 << 8) / this.anInt3143;
			local12 = (local12 << 8) / this.anInt3143;
			local17 = (local17 << 8) / this.anInt3143;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3144 = this.anInt3146 * arg3 / (this.aBoolean189 ? 1024 : this.anInt3143);
		} else {
			this.anInt3144 = 0;
		}
		if (this.anInt3144 < 8) {
			this.aClass11_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static444.method5654(this.anInt3144);
		if (local143 > arg3) {
			local143 = Static154.method2310(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3141) {
			this.anInt3141 = local143;
		}
		this.anInt3145 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3139 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass11_11 = null;
		return true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!ya;IIIIII)V")
	public void method2546(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass11_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3145 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3139 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3144) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3144) / 2;
		if (local38 < arg4 && local38 + this.anInt3144 > 0 && local51 < arg3 && local51 + this.anInt3144 > 0) {
			this.aClass11_11.method4399(local51 + arg1, local38 + arg2, this.anInt3144, this.anInt3144);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(Lclient!ya;Lclient!il;)V")
	private void method2547(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class115 arg1) {
		Static176.method2541(arg0);
		Static176.method2544(arg0);
		arg0.da(Static176.anIntArray272);
		arg0.OA(0, 0, this.anInt3141, this.anInt3141);
		arg0.method5278();
		arg0.O(0, 0, this.anInt3141, this.anInt3141, this.anInt3136 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean189) {
				local31 = -arg1.anInt3137;
				local33 = -arg1.anInt3140;
				local35 = -arg1.anInt3147;
			} else {
				local31 = arg1.anInt3137 - this.anInt3137;
				local33 = arg1.anInt3140 - this.anInt3140;
				local35 = arg1.anInt3147 - this.anInt3147;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3145 != 0) {
			local79 = Class22_Sub7.anIntArray411[this.anInt3145];
			local84 = Class22_Sub7.anIntArray410[this.anInt3145];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3139 != 0) {
			local79 = Class22_Sub7.anIntArray411[this.anInt3139];
			local84 = Class22_Sub7.anIntArray410[this.anInt3139];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class163 local147 = Static176.aClass163_5.method4654((byte) 0, 51200, true);
		if (arg0.method5337()) {
			local147.I((short) 0, (short) this.anInt3142);
		} else {
			local147.BA((short) 127, Static204.anInterface4_6.method3138(this.anInt3142).aShort67);
			local147.I((short) 0, (short) -1);
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3141 * 1024 / (local147.NA() - local147.HA());
		if (this.anInt3136 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.H(this.anInt3141 / 2, this.anInt3141 / 2, local84, local84);
		arg0.ea(arg0.method5293());
		@Pc(223) Class33 local223 = arg0.method5293();
		local223.j(0, 0, arg0.a() - local147.PA());
		local147.method4650(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3141 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3141 - local245) / 2;
		Static176.aClass11_10.s(local252, local252, local245, local245, 0, this.anInt3136 | 0xFF000000, 1);
		this.aClass11_11 = arg0.method5349(0, 0, this.anInt3141, this.anInt3141, true);
		arg0.method5278();
		arg0.O(0, 0, this.anInt3141, this.anInt3141, 0, 0);
		Static176.aClass11_12.s(0, 0, this.anInt3141, this.anInt3141, 1, 0, 0);
		this.aClass11_11.BA(0, 0, 0);
		arg0.OA(Static176.anIntArray272[0], Static176.anIntArray272[1], Static176.anIntArray272[2], Static176.anIntArray272[3]);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(Lclient!ya;Lclient!il;)Z")
	public boolean method2548(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class115 arg1) {
		return this.aClass11_11 != null || this.method2542(arg0, arg1);
	}
}
