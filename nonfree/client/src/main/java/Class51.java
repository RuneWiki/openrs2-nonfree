import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class51 {

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
	private int anInt1363;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "Lclient!ho;")
	private Class9 aClass9_11;

	@OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
	private int anInt1365;

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
	private int anInt1368;

	@OriginalMember(owner = "client!cfa", name = "r", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
	private final int anInt1361;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
	private final int anInt1359;

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
	private final int anInt1367;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "Z")
	private final boolean aBoolean72;

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
	private final int anInt1364;

	@OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
	private final int anInt1366;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
	private final int anInt1362;

	@OriginalMember(owner = "client!cfa", name = "q", descriptor = "I")
	private final int anInt1369;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1361 = arg2;
		this.anInt1359 = arg3;
		this.anInt1367 = arg4;
		this.aBoolean72 = arg7;
		this.anInt1364 = arg1;
		this.anInt1366 = arg6;
		this.anInt1362 = arg5;
		this.anInt1369 = arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method1250(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass9_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt1360 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt1368 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt1363) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt1363) / 2;
		if (local38 < arg4 && local38 + this.anInt1363 > 0 && local51 < arg3 && local51 + this.anInt1363 > 0) {
			this.aClass9_11.method8936(local51 + arg1, local38 + arg2, this.anInt1363, this.anInt1363);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!ha;Lclient!cfa;)Z")
	public boolean method1251(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class51 arg1) {
		return this.aClass9_11 != null || this.method1258(arg0, arg1);
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Lclient!ha;Lclient!cfa;)V")
	private void method1252(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(6) Class22 local6 = Static308.method4413(this.anInt1364, Static115.aClass8_31);
		if (local6 == null) {
			return;
		}
		arg0.K(Static72.anIntArray73);
		arg0.KA(0, 0, this.anInt1365, this.anInt1365);
		arg0.aa(0, 0, this.anInt1365, this.anInt1365, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean72) {
				local32 = -arg1.anInt1361;
				local34 = -arg1.anInt1359;
				local36 = -arg1.anInt1367;
			} else {
				local32 = this.anInt1361 - arg1.anInt1361;
				local34 = this.anInt1359 - arg1.anInt1359;
				local36 = this.anInt1367 - arg1.anInt1367;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt1360 != 0) {
			local81 = -this.anInt1360 & 0x3FFF;
			local85 = Class6_Sub1_Sub3.anIntArray56[local81];
			local89 = Class6_Sub1_Sub3.anIntArray58[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt1368 != 0) {
			local81 = -this.anInt1368 & 0x3FFF;
			local85 = Class6_Sub1_Sub3.anIntArray56[local81];
			local89 = Class6_Sub1_Sub3.anIntArray58[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class184 local172 = arg0.method7475(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7517(arg0.method7467());
		@Pc(218) Class207 local218 = arg0.method7456();
		local218.method8212(0, 0, arg0.i() - local172.HA());
		local172.method8658(local218, (Class2_Sub5) null, arg0.i(), 1);
		this.aClass9_11 = arg0.method7476(0, 0, this.anInt1365, this.anInt1365, true);
		this.aClass9_11.method8935(3);
		arg0.KA(Static72.anIntArray73[0], Static72.anIntArray73[1], Static72.anIntArray73[2], Static72.anIntArray73[3]);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)Z")
	public boolean method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean72) {
			this.anInt1370 = 1073741823;
			local7 = this.anInt1361;
			local12 = this.anInt1359;
			local17 = this.anInt1367;
		} else {
			local7 = this.anInt1361 - arg0;
			local12 = this.anInt1359 - arg1;
			local17 = this.anInt1367 - arg2;
			this.anInt1370 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt1370 == 0) {
				this.anInt1370 = 1;
			}
			local7 = (local7 << 8) / this.anInt1370;
			local12 = (local12 << 8) / this.anInt1370;
			local17 = (local17 << 8) / this.anInt1370;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt1363 = this.anInt1362 * arg3 / (this.aBoolean72 ? 1024 : this.anInt1370);
		} else {
			this.anInt1363 = 0;
		}
		if (this.anInt1363 < 8) {
			this.aClass9_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static655.method8912(this.anInt1363);
		if (local143 > arg3) {
			local143 = Static199.method2911(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt1365) {
			this.anInt1365 = local143;
		}
		this.anInt1360 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt1368 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass9_11 = null;
		return true;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(Lclient!ha;Lclient!cfa;)V")
	private void method1256(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class51 arg1) {
		Static72.method1259(arg0);
		Static72.method1255(arg0);
		arg0.K(Static72.anIntArray73);
		arg0.KA(0, 0, this.anInt1365, this.anInt1365);
		arg0.ya();
		arg0.aa(0, 0, this.anInt1365, this.anInt1365, this.anInt1366 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean72) {
				local31 = -arg1.anInt1361;
				local33 = -arg1.anInt1359;
				local35 = -arg1.anInt1367;
			} else {
				local31 = arg1.anInt1361 - this.anInt1361;
				local33 = arg1.anInt1359 - this.anInt1359;
				local35 = arg1.anInt1367 - this.anInt1367;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt1360 != 0) {
			local79 = Class6_Sub1_Sub3.anIntArray56[this.anInt1360];
			local84 = Class6_Sub1_Sub3.anIntArray58[this.anInt1360];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt1368 != 0) {
			local79 = Class6_Sub1_Sub3.anIntArray56[this.anInt1368];
			local84 = Class6_Sub1_Sub3.anIntArray58[this.anInt1368];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class184 local147 = Static72.aClass184_3.method8660((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt1364);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt1365 * 1024 / (local147.RA() - local147.V());
		if (this.anInt1366 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt1365 / 2, this.anInt1365 / 2, local84, local84);
		arg0.method7517(arg0.method7467());
		@Pc(206) Class207 local206 = arg0.method7467();
		local206.method8212(0, 0, arg0.i() - local147.HA());
		local147.method8658(local206, (Class2_Sub5) null, 1024, 1);
		@Pc(228) int local228 = this.anInt1365 * 13 / 16;
		@Pc(235) int local235 = (this.anInt1365 - local228) / 2;
		Static72.aClass9_12.method8924(local235, local235, local228, local228, 0, this.anInt1366 | 0xFF000000, 1);
		this.aClass9_11 = arg0.method7476(0, 0, this.anInt1365, this.anInt1365, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt1365, this.anInt1365, 0, 0);
		Static72.aClass9_10.method8924(0, 0, this.anInt1365, this.anInt1365, 1, 0, 0);
		this.aClass9_11.method8935(0);
		arg0.KA(Static72.anIntArray73[0], Static72.anIntArray73[1], Static72.anIntArray73[2], Static72.anIntArray73[3]);
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "()V")
	public void method1257() {
		this.aClass9_11 = null;
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "(Lclient!ha;Lclient!cfa;)Z")
	private boolean method1258(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class51 arg1) {
		if (this.aClass9_11 == null) {
			if (this.anInt1369 == 0) {
				if (Static131.anInterface6_2.method7090(this.anInt1364)) {
					@Pc(23) int[] local23 = Static131.anInterface6_2.method7089(this.anInt1364, 0.7F, this.anInt1365, this.anInt1365);
					this.aClass9_11 = arg0.method7444(local23, this.anInt1365, this.anInt1365, this.anInt1365);
				}
			} else if (this.anInt1369 == 2) {
				this.method1252(arg0, arg1);
			} else if (this.anInt1369 == 1) {
				this.method1256(arg0, arg1);
			}
		}
		return this.aClass9_11 != null;
	}
}
