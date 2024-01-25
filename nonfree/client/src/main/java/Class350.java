import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class350 {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!f;")
	private Class88 aClass88_35;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	public int anInt10289;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	private int anInt10291;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	private int anInt10294;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	private int anInt10296;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	private int anInt10297;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
	private final int anInt10298;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	private final int anInt10292;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	private final int anInt10293;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
	private final boolean aBoolean704;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	private final int anInt10287;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
	private final int anInt10288;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	private final int anInt10295;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	private final int anInt10290;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt10298 = arg2;
		this.anInt10292 = arg3;
		this.anInt10293 = arg4;
		this.aBoolean704 = arg7;
		this.anInt10287 = arg1;
		this.anInt10288 = arg6;
		this.anInt10295 = arg5;
		this.anInt10290 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "()V")
	public void method8006() {
		this.aClass88_35 = null;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)Z")
	public boolean method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean704) {
			this.anInt10289 = 1073741823;
			local7 = this.anInt10298;
			local12 = this.anInt10292;
			local17 = this.anInt10293;
		} else {
			local7 = this.anInt10298 - arg0;
			local12 = this.anInt10292 - arg1;
			local17 = this.anInt10293 - arg2;
			this.anInt10289 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt10289 == 0) {
				this.anInt10289 = 1;
			}
			local7 = (local7 << 8) / this.anInt10289;
			local12 = (local12 << 8) / this.anInt10289;
			local17 = (local17 << 8) / this.anInt10289;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt10297 = this.anInt10295 * arg3 / (this.aBoolean704 ? 1024 : this.anInt10289);
		} else {
			this.anInt10297 = 0;
		}
		if (this.anInt10297 < 8) {
			this.aClass88_35 = null;
			return false;
		}
		@Pc(143) int local143 = Static488.method7100(this.anInt10297);
		if (local143 > arg3) {
			local143 = Static205.method3349(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt10296) {
			this.anInt10296 = local143;
		}
		this.anInt10291 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt10294 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass88_35 = null;
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!r;Lclient!vs;)Z")
	public boolean method8008(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class350 arg1) {
		return this.aClass88_35 != null || this.method8009(arg0, arg1);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lclient!r;Lclient!vs;)Z")
	private boolean method8009(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class350 arg1) {
		if (this.aClass88_35 == null) {
			if (this.anInt10290 == 0) {
				if (Static99.anInterface7_4.method4463(this.anInt10287)) {
					@Pc(23) int[] local23 = Static99.anInterface7_4.method4464(this.anInt10296, this.anInt10287, 0.7F, this.anInt10296);
					this.aClass88_35 = arg0.method7838(local23, this.anInt10296, this.anInt10296, this.anInt10296);
				}
			} else if (this.anInt10290 == 2) {
				this.method8013(arg0, arg1);
			} else if (this.anInt10290 == 1) {
				this.method8011(arg0, arg1);
			}
		}
		return this.aClass88_35 != null;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method8010(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass88_35 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt10291 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt10294 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt10297) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt10297) / 2;
		if (local38 < arg4 && local38 + this.anInt10297 > 0 && local51 < arg3 && local51 + this.anInt10297 > 0) {
			this.aClass88_35.method8046(local51 + arg1, local38 + arg2, this.anInt10297, this.anInt10297);
		}
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(Lclient!r;Lclient!vs;)V")
	private void method8011(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class350 arg1) {
		Static567.method8004(arg0);
		Static567.method8012(arg0);
		arg0.oa(Static567.anIntArray578);
		arg0.da(0, 0, this.anInt10296, this.anInt10296);
		arg0.ya();
		arg0.J(0, 0, this.anInt10296, this.anInt10296, this.anInt10288 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean704) {
				local31 = -arg1.anInt10298;
				local33 = -arg1.anInt10292;
				local35 = -arg1.anInt10293;
			} else {
				local31 = arg1.anInt10298 - this.anInt10298;
				local33 = arg1.anInt10292 - this.anInt10292;
				local35 = arg1.anInt10293 - this.anInt10293;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt10291 != 0) {
			local79 = Class262.anIntArray420[this.anInt10291];
			local84 = Class262.anIntArray421[this.anInt10291];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt10294 != 0) {
			local79 = Class262.anIntArray420[this.anInt10294];
			local84 = Class262.anIntArray421[this.anInt10294];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class65 local147 = Static567.aClass65_7.method7682((byte) 0, 51200, true);
		if (arg0.method7820()) {
			local147.DA((short) 0, (short) this.anInt10287);
		} else {
			local147.d((short) 127, Static99.anInterface7_4.method4460(this.anInt10287).aShort21);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt10296 * 1024 / (local147.l() - local147.KA());
		if (this.anInt10288 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt10296 / 2, this.anInt10296 / 2, local84, local84);
		arg0.method7794(arg0.method7842());
		@Pc(223) Class81 local223 = arg0.method7842();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7686(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt10296 * 13 / 16;
		@Pc(252) int local252 = (this.anInt10296 - local245) / 2;
		Static567.aClass88_34.method8049(local252, local252, local245, local245, 0, this.anInt10288 | 0xFF000000, 1);
		this.aClass88_35 = arg0.method7788(0, 0, this.anInt10296, this.anInt10296, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt10296, this.anInt10296, 0, 0);
		Static567.aClass88_36.method8049(0, 0, this.anInt10296, this.anInt10296, 1, 0, 0);
		this.aClass88_35.xa(0, 0, 0);
		arg0.da(Static567.anIntArray578[0], Static567.anIntArray578[1], Static567.anIntArray578[2], Static567.anIntArray578[3]);
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(Lclient!r;Lclient!vs;)V")
	private void method8013(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class350 arg1) {
		@Pc(6) Class59 local6 = Static485.method7071(Static197.aClass348_50, this.anInt10287);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static567.anIntArray578);
		arg0.da(0, 0, this.anInt10296, this.anInt10296);
		arg0.J(0, 0, this.anInt10296, this.anInt10296, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean704) {
				local32 = -arg1.anInt10298;
				local34 = -arg1.anInt10292;
				local36 = -arg1.anInt10293;
			} else {
				local32 = this.anInt10298 - arg1.anInt10298;
				local34 = this.anInt10292 - arg1.anInt10292;
				local36 = this.anInt10293 - arg1.anInt10293;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt10291 != 0) {
			local81 = -this.anInt10291 & 0x3FFF;
			local85 = Class262.anIntArray420[local81];
			local89 = Class262.anIntArray421[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt10294 != 0) {
			local81 = -this.anInt10294 & 0x3FFF;
			local85 = Class262.anIntArray420[local81];
			local89 = Class262.anIntArray421[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class65 local172 = arg0.method7828(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method7794(arg0.method7842());
		@Pc(218) Class81 local218 = arg0.method7812();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7686(local218, null, arg0.BA(), 1);
		this.aClass88_35 = arg0.method7788(0, 0, this.anInt10296, this.anInt10296, true);
		this.aClass88_35.xa(0, 0, 3);
		arg0.da(Static567.anIntArray578[0], Static567.anIntArray578[1], Static567.anIntArray578[2], Static567.anIntArray578[3]);
	}
}
