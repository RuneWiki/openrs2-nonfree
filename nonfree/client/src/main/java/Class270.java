import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class270 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	private int anInt7290;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	public int anInt7294;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!it;")
	private Class28 aClass28_13;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	private int anInt7296;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	private int anInt7297;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	private int anInt7298;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	private final int anInt7293;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	private final int anInt7299;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	private final int anInt7291;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "Z")
	private final boolean aBoolean519;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	private final int anInt7292;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	private final int anInt7295;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	private final int anInt7289;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	private final int anInt7300;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7293 = arg2;
		this.anInt7299 = arg3;
		this.anInt7291 = arg4;
		this.aBoolean519 = arg7;
		this.anInt7292 = arg1;
		this.anInt7295 = arg6;
		this.anInt7289 = arg5;
		this.anInt7300 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ha;Lclient!pg;)V")
	private void method6407(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class270 arg1) {
		@Pc(6) Class26 local6 = Static623.method8839(Static406.aClass207_82, this.anInt7292);
		if (local6 == null) {
			return;
		}
		arg0.K(Static425.anIntArray398);
		arg0.KA(0, 0, this.anInt7296, this.anInt7296);
		arg0.aa(0, 0, this.anInt7296, this.anInt7296, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean519) {
				local32 = -arg1.anInt7293;
				local34 = -arg1.anInt7299;
				local36 = -arg1.anInt7291;
			} else {
				local32 = this.anInt7293 - arg1.anInt7293;
				local34 = this.anInt7299 - arg1.anInt7299;
				local36 = this.anInt7291 - arg1.anInt7291;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7297 != 0) {
			local81 = -this.anInt7297 & 0x3FFF;
			local85 = Class377.anIntArray600[local81];
			local89 = Class377.anIntArray601[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt7290 != 0) {
			local81 = -this.anInt7290 & 0x3FFF;
			local85 = Class377.anIntArray600[local81];
			local89 = Class377.anIntArray601[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class187 local172 = arg0.method7256(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7269(arg0.method7275());
		@Pc(218) Class113 local218 = arg0.method7262();
		local218.method8458(0, 0, arg0.i() - local172.HA());
		local172.method8654(local218, null, arg0.i(), 1);
		this.aClass28_13 = arg0.method7258(0, 0, this.anInt7296, this.anInt7296, true);
		this.aClass28_13.method4050(3);
		arg0.KA(Static425.anIntArray398[0], Static425.anIntArray398[1], Static425.anIntArray398[2], Static425.anIntArray398[3]);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method6408(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass28_13 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7297 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7290 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7298) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7298) / 2;
		if (local38 < arg4 && local38 + this.anInt7298 > 0 && local51 < arg3 && local51 + this.anInt7298 > 0) {
			this.aClass28_13.method4046(local51 + arg1, local38 + arg2, this.anInt7298, this.anInt7298);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
	public void method6409() {
		this.aClass28_13 = null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lclient!ha;Lclient!pg;)V")
	private void method6410(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class270 arg1) {
		Static425.method6413(arg0);
		Static425.method6416(arg0);
		arg0.K(Static425.anIntArray398);
		arg0.KA(0, 0, this.anInt7296, this.anInt7296);
		arg0.ya();
		arg0.aa(0, 0, this.anInt7296, this.anInt7296, this.anInt7295 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean519) {
				local31 = -arg1.anInt7293;
				local33 = -arg1.anInt7299;
				local35 = -arg1.anInt7291;
			} else {
				local31 = arg1.anInt7293 - this.anInt7293;
				local33 = arg1.anInt7299 - this.anInt7299;
				local35 = arg1.anInt7291 - this.anInt7291;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7297 != 0) {
			local79 = Class377.anIntArray600[this.anInt7297];
			local84 = Class377.anIntArray601[this.anInt7297];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt7290 != 0) {
			local79 = Class377.anIntArray600[this.anInt7290];
			local84 = Class377.anIntArray601[this.anInt7290];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class187 local147 = Static425.aClass187_4.method8656((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt7292);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7296 * 1024 / (local147.RA() - local147.V());
		if (this.anInt7295 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt7296 / 2, this.anInt7296 / 2, local84, local84);
		arg0.method7269(arg0.method7275());
		@Pc(206) Class113 local206 = arg0.method7275();
		local206.method8458(0, 0, arg0.i() - local147.HA());
		local147.method8654(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt7296 * 13 / 16;
		@Pc(235) int local235 = (this.anInt7296 - local228) / 2;
		Static425.aClass28_12.method4051(local235, local235, local228, local228, 0, this.anInt7295 | 0xFF000000, 1);
		this.aClass28_13 = arg0.method7258(0, 0, this.anInt7296, this.anInt7296, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt7296, this.anInt7296, 0, 0);
		Static425.aClass28_14.method4051(0, 0, this.anInt7296, this.anInt7296, 1, 0, 0);
		this.aClass28_13.method4050(0);
		arg0.KA(Static425.anIntArray398[0], Static425.anIntArray398[1], Static425.anIntArray398[2], Static425.anIntArray398[3]);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Lclient!ha;Lclient!pg;)Z")
	public boolean method6412(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class270 arg1) {
		return this.aClass28_13 != null || this.method6415(arg0, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)Z")
	public boolean method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean519) {
			this.anInt7294 = 1073741823;
			local7 = this.anInt7293;
			local12 = this.anInt7299;
			local17 = this.anInt7291;
		} else {
			local7 = this.anInt7293 - arg0;
			local12 = this.anInt7299 - arg1;
			local17 = this.anInt7291 - arg2;
			this.anInt7294 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7294 == 0) {
				this.anInt7294 = 1;
			}
			local7 = (local7 << 8) / this.anInt7294;
			local12 = (local12 << 8) / this.anInt7294;
			local17 = (local17 << 8) / this.anInt7294;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7298 = this.anInt7289 * arg3 / (this.aBoolean519 ? 1024 : this.anInt7294);
		} else {
			this.anInt7298 = 0;
		}
		if (this.anInt7298 < 8) {
			this.aClass28_13 = null;
			return false;
		}
		@Pc(143) int local143 = Static613.method8740(this.anInt7298);
		if (local143 > arg3) {
			local143 = Static460.method6846(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7296) {
			this.anInt7296 = local143;
		}
		this.anInt7297 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt7290 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass28_13 = null;
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(Lclient!ha;Lclient!pg;)Z")
	private boolean method6415(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class270 arg1) {
		if (this.aClass28_13 == null) {
			if (this.anInt7300 == 0) {
				if (Static116.anInterface3_7.method4654(this.anInt7292)) {
					@Pc(23) int[] local23 = Static116.anInterface3_7.method4658(0.7F, this.anInt7296, this.anInt7296, this.anInt7292);
					this.aClass28_13 = arg0.method7261(local23, this.anInt7296, this.anInt7296, this.anInt7296);
				}
			} else if (this.anInt7300 == 2) {
				this.method6407(arg0, arg1);
			} else if (this.anInt7300 == 1) {
				this.method6410(arg0, arg1);
			}
		}
		return this.aClass28_13 != null;
	}
}
