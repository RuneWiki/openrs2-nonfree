import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class114 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	private int anInt2439;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	private int anInt2441;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	private int anInt2442;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!f;")
	private Class38 aClass38_11;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public int anInt2445;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
	private int anInt2446;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	private final int anInt2443;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
	private final int anInt2438;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
	private final int anInt2444;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
	private final int anInt2448;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
	private final int anInt2449;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	private final int anInt2447;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	private final int anInt2440;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2443 = arg2;
		this.anInt2438 = arg3;
		this.anInt2444 = arg4;
		this.aBoolean170 = arg7;
		this.anInt2448 = arg1;
		this.anInt2449 = arg6;
		this.anInt2447 = arg5;
		this.anInt2440 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
	public void method2091() {
		this.aClass38_11 = null;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method2092(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass38_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2446 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2441 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2442) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2442) / 2;
		if (local38 < arg4 && local38 + this.anInt2442 > 0 && local51 < arg3 && local51 + this.anInt2442 > 0) {
			this.aClass38_11.method7466(local51 + arg1, local38 + arg2, this.anInt2442, this.anInt2442);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!r;Lclient!fq;)Z")
	public boolean method2094(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class114 arg1) {
		return this.aClass38_11 != null || this.method2101(arg0, arg1);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII)Z")
	public boolean method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean170) {
			this.anInt2445 = 1073741823;
			local7 = this.anInt2443;
			local12 = this.anInt2438;
			local17 = this.anInt2444;
		} else {
			local7 = this.anInt2443 - arg0;
			local12 = this.anInt2438 - arg1;
			local17 = this.anInt2444 - arg2;
			this.anInt2445 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2445 == 0) {
				this.anInt2445 = 1;
			}
			local7 = (local7 << 8) / this.anInt2445;
			local12 = (local12 << 8) / this.anInt2445;
			local17 = (local17 << 8) / this.anInt2445;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2442 = this.anInt2447 * arg3 / (this.aBoolean170 ? 1024 : this.anInt2445);
		} else {
			this.anInt2442 = 0;
		}
		if (this.anInt2442 < 8) {
			this.aClass38_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static355.method5078(this.anInt2442);
		if (local143 > arg3) {
			local143 = Static511.method7273(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2439) {
			this.anInt2439 = local143;
		}
		this.anInt2446 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2441 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass38_11 = null;
		return true;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Lclient!r;Lclient!fq;)V")
	private void method2097(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class114 arg1) {
		@Pc(6) Class13 local6 = Static25.method356(this.anInt2448, Static299.aClass229_69);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static152.anIntArray207);
		arg0.da(0, 0, this.anInt2439, this.anInt2439);
		arg0.J(0, 0, this.anInt2439, this.anInt2439, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean170) {
				local32 = -arg1.anInt2443;
				local34 = -arg1.anInt2438;
				local36 = -arg1.anInt2444;
			} else {
				local32 = this.anInt2443 - arg1.anInt2443;
				local34 = this.anInt2438 - arg1.anInt2438;
				local36 = this.anInt2444 - arg1.anInt2444;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2446 != 0) {
			local81 = -this.anInt2446 & 0x3FFF;
			local85 = Class285.anIntArray476[local81];
			local89 = Class285.anIntArray475[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt2441 != 0) {
			local81 = -this.anInt2441 & 0x3FFF;
			local85 = Class285.anIntArray476[local81];
			local89 = Class285.anIntArray475[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class33 local172 = arg0.method6839(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method6816(arg0.method6889());
		@Pc(218) Class25 local218 = arg0.method6862();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7183(local218, null, arg0.BA(), 1);
		this.aClass38_11 = arg0.method6868(0, 0, this.anInt2439, this.anInt2439, true);
		this.aClass38_11.xa(0, 0, 3);
		arg0.da(Static152.anIntArray207[0], Static152.anIntArray207[1], Static152.anIntArray207[2], Static152.anIntArray207[3]);
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(Lclient!r;Lclient!fq;)V")
	private void method2099(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class114 arg1) {
		Static152.method2095(arg0);
		Static152.method2098(arg0);
		arg0.oa(Static152.anIntArray207);
		arg0.da(0, 0, this.anInt2439, this.anInt2439);
		arg0.ya();
		arg0.J(0, 0, this.anInt2439, this.anInt2439, this.anInt2449 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean170) {
				local31 = -arg1.anInt2443;
				local33 = -arg1.anInt2438;
				local35 = -arg1.anInt2444;
			} else {
				local31 = arg1.anInt2443 - this.anInt2443;
				local33 = arg1.anInt2438 - this.anInt2438;
				local35 = arg1.anInt2444 - this.anInt2444;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2446 != 0) {
			local79 = Class285.anIntArray476[this.anInt2446];
			local84 = Class285.anIntArray475[this.anInt2446];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2441 != 0) {
			local79 = Class285.anIntArray476[this.anInt2441];
			local84 = Class285.anIntArray475[this.anInt2441];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class33 local147 = Static152.aClass33_3.method7200((byte) 0, 51200, true);
		if (arg0.method6818()) {
			local147.DA((short) 0, (short) this.anInt2448);
		} else {
			local147.d((short) 127, Static579.anInterface9_12.method1074(this.anInt2448).aShort88);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2439 * 1024 / (local147.l() - local147.KA());
		if (this.anInt2449 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt2439 / 2, this.anInt2439 / 2, local84, local84);
		arg0.method6816(arg0.method6889());
		@Pc(223) Class25 local223 = arg0.method6889();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7183(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt2439 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2439 - local245) / 2;
		Static152.aClass38_12.method7461(local252, local252, local245, local245, 0, this.anInt2449 | 0xFF000000, 1);
		this.aClass38_11 = arg0.method6868(0, 0, this.anInt2439, this.anInt2439, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt2439, this.anInt2439, 0, 0);
		Static152.aClass38_10.method7461(0, 0, this.anInt2439, this.anInt2439, 1, 0, 0);
		this.aClass38_11.xa(0, 0, 0);
		arg0.da(Static152.anIntArray207[0], Static152.anIntArray207[1], Static152.anIntArray207[2], Static152.anIntArray207[3]);
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(Lclient!r;Lclient!fq;)Z")
	private boolean method2101(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class114 arg1) {
		if (this.aClass38_11 == null) {
			if (this.anInt2440 == 0) {
				if (Static579.anInterface9_12.method1073(this.anInt2448)) {
					@Pc(23) int[] local23 = Static579.anInterface9_12.method1075(this.anInt2439, this.anInt2439, 0.7F, this.anInt2448);
					this.aClass38_11 = arg0.method6879(local23, this.anInt2439, this.anInt2439, this.anInt2439);
				}
			} else if (this.anInt2440 == 2) {
				this.method2097(arg0, arg1);
			} else if (this.anInt2440 == 1) {
				this.method2099(arg0, arg1);
			}
		}
		return this.aClass38_11 != null;
	}
}
