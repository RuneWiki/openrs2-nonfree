import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public int anInt6181;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public int anInt6182;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private int anInt6184;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	private int anInt6185;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	private int anInt6186;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	private int anInt6187;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private int anInt6189;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	private int anInt6191;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private int anInt6192;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "I")
	private int anInt6193;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private int anInt6194;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	private int anInt6196;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "I")
	private int anInt6197;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	private int anInt6199;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "I")
	public int anInt6200;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	public int anInt6202;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	private int anInt6204;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	private int anInt6205;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "I")
	private int anInt6207;

	@OriginalMember(owner = "client!th", name = "R", descriptor = "I")
	private int anInt6208;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	private int anInt6183 = 0;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "Lclient!tn;")
	public final Class218 aClass218_1;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "J")
	private final long aLong182;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "Lclient!bt;")
	public final Class7_Sub3 aClass7_Sub3_6;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Lclient!dl;")
	public Class55 aClass55_1;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "Lclient!re;")
	public final Class199 aClass199_5;

	static {
		new Class62("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
		new Class62("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!oj;Lclient!tn;Lclient!bt;J)V")
	public Class7_Sub8(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class218 arg1, @OriginalArg(2) Class7_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass218_1 = arg1;
		this.aLong182 = arg3;
		this.aClass7_Sub3_6 = arg2;
		this.aClass55_1 = Static160.method2828(this.aClass218_1.anInt6291);
		if (!arg0.method2515() && this.aClass55_1.anInt1598 != -1) {
			this.aClass55_1 = Static160.method2828(this.aClass55_1.anInt1598);
		}
		this.aClass199_5 = new Class199();
		this.anInt6183 = (int) ((double) this.anInt6183 + Math.random() * 64.0D);
		this.method5405();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!oj;IZJ)V")
	public void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(41) int local41;
		if (this.aBoolean453) {
			arg2 = false;
		} else if (Static54.anInt1178 < this.aClass55_1.anInt1597) {
			arg2 = false;
		} else if (Static376.anIntArray569[Static54.anInt1178] < Static260.anInt4976) {
			arg2 = false;
		} else if (this.aBoolean454) {
			arg2 = false;
		} else if (this.aClass55_1.anInt1574 != -1) {
			local41 = (int) (arg3 - this.aLong182);
			if (this.aClass55_1.aBoolean124 || this.aClass55_1.anInt1574 >= local41) {
				local41 %= this.aClass55_1.anInt1574;
			} else {
				arg2 = false;
			}
			if (!this.aClass55_1.aBoolean121 && this.aClass55_1.anInt1593 > local41) {
				arg2 = false;
			}
			if (this.aClass55_1.aBoolean121 && local41 >= this.aClass55_1.anInt1593) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt6183 += (int) ((double) arg0 * (Math.random() * (double) (this.aClass55_1.lb - this.aClass55_1.anInt1610) + (double) this.aClass55_1.anInt1610));
			if (this.anInt6183 > 63) {
				local41 = this.anInt6183 >> 6;
				this.anInt6183 &= 0x3F;
				for (@Pc(143) int local143 = 0; local143 < local41; local143++) {
					@Pc(162) int local162;
					@Pc(165) int local165;
					@Pc(159) int local159;
					@Pc(177) int local177;
					@Pc(185) int local185;
					@Pc(189) int local189;
					@Pc(199) int local199;
					@Pc(207) int local207;
					@Pc(217) int local217;
					if (this.aClass55_1.aShort27 <= 0 && this.aClass55_1.aShort28 <= 0) {
						local159 = this.anInt6205;
						local162 = this.anInt6187;
						local165 = this.anInt6196;
					} else {
						local177 = this.anInt6197 + (int) (Math.random() * (double) this.anInt6207);
						@Pc(181) int local181 = local177 & 0x3FFF;
						local185 = Class106.anIntArray240[local181];
						local189 = Class106.anIntArray242[local181];
						local199 = (int) ((double) this.anInt6186 * Math.random()) + this.anInt6185;
						@Pc(203) int local203 = local199 & 0x1FFF;
						local207 = Class106.anIntArray240[local203];
						local162 = local189 * local207 >> 15;
						local217 = Class106.anIntArray242[local203];
						local165 = local217 * -1;
						local159 = local207 * local185 >> 15;
					}
					local177 = (int) (Math.random() * 65535.0D);
					local185 = (int) (Math.random() * 65535.0D);
					if (local177 + local185 > 65535) {
						local185 = 65535 - local185;
						local177 = 65535 - local177;
					}
					local189 = 65535 - local177 - local185;
					local199 = local177 * this.anInt6199 + this.anInt6194 * local185 + this.anInt6193 * local189 >> 16;
					local207 = this.anInt6192 * local177 + local185 * this.anInt6189 + local189 * this.anInt6191 >> 16;
					local217 = this.anInt6184 * local189 + this.anInt6204 * local185 + this.anInt6208 * local177 >> 16;
					@Pc(331) int local331 = (int) ((double) (this.aClass55_1.anInt1586 - this.aClass55_1.anInt1605) * Math.random()) + this.aClass55_1.anInt1605;
					@Pc(347) int local347 = this.aClass55_1.anInt1558 + (int) ((double) (this.aClass55_1.anInt1568 - this.aClass55_1.anInt1558) * Math.random());
					@Pc(363) int local363 = (int) (Math.random() * (double) (this.aClass55_1.anInt1573 - this.aClass55_1.anInt1566)) + this.aClass55_1.anInt1566;
					@Pc(427) int local427;
					if (this.aClass55_1.aBoolean119) {
						@Pc(369) double local369 = Math.random();
						local427 = (int) ((double) this.aClass55_1.anInt1561 * local369 + (double) this.aClass55_1.anInt1615) << 8 | (int) ((double) this.aClass55_1.anInt1590 * local369 + (double) this.aClass55_1.anInt1592) << 16 | (int) (local369 * (double) this.aClass55_1.anInt1601 + (double) this.aClass55_1.anInt1596) | (int) ((double) this.aClass55_1.anInt1576 + (double) this.aClass55_1.anInt1609 * Math.random()) << 24;
					} else {
						local427 = (int) ((double) this.aClass55_1.anInt1596 + Math.random() * (double) this.aClass55_1.anInt1601) | (int) ((double) this.aClass55_1.anInt1590 * Math.random() + (double) this.aClass55_1.anInt1592) << 16 | (int) ((double) this.aClass55_1.anInt1615 + Math.random() * (double) this.aClass55_1.anInt1561) << 8 | (int) (Math.random() * (double) this.aClass55_1.anInt1609 + (double) this.aClass55_1.anInt1576) << 24;
					}
					@Pc(491) int local491 = this.aClass55_1.anInt1588;
					if (!arg1.method2515() && !this.aClass55_1.aBoolean120) {
						local491 = -1;
					}
					if (Static263.anInt5012 == Static131.anInt2860) {
						new Class7_Sub1_Sub1_Sub1(this, local199, local207, local217, local162, local165, local159, local331, local347, local427, local363, local491, this.aClass55_1.aBoolean122);
					} else {
						@Pc(528) Class7_Sub1_Sub1_Sub1 local528 = Static222.aClass7_Sub1_Sub1_Sub1Array2[Static263.anInt5012];
						Static263.anInt5012 = Static263.anInt5012 + 1 & 0x3FF;
						local528.method380(this, local199, local207, local217, local162, local165, local159, local331, local347, local427, local363, local491, this.aClass55_1.aBoolean122);
					}
				}
			}
		}
		this.anInt6181 = 0;
		for (@Pc(568) Class7_Sub1_Sub1_Sub1 local568 = (Class7_Sub1_Sub1_Sub1) this.aClass199_5.method4896(); local568 != null; local568 = (Class7_Sub1_Sub1_Sub1) this.aClass199_5.method4902()) {
			local568.method384(arg3, arg0);
			this.anInt6181++;
		}
		Static300.anInt5587 += this.anInt6181;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method5405() {
		this.anInt6184 = this.aClass218_1.anInt6288;
		this.anInt6189 = this.aClass218_1.anInt6280;
		this.anInt6199 = this.aClass218_1.anInt6277;
		this.anInt6194 = this.aClass218_1.anInt6287;
		this.anInt6191 = this.aClass218_1.anInt6284;
		this.anInt6208 = this.aClass218_1.anInt6289;
		this.anInt6193 = this.aClass218_1.anInt6286;
		this.anInt6204 = this.aClass218_1.anInt6278;
		this.anInt6192 = this.aClass218_1.anInt6275;
		if (this.anInt6199 == this.anInt6194 && this.anInt6193 == this.anInt6194 && this.anInt6189 == this.anInt6192 && this.anInt6191 == this.anInt6189 && this.anInt6208 == this.anInt6204 && this.anInt6204 == this.anInt6184) {
			this.aBoolean454 = true;
			return;
		}
		this.aBoolean454 = false;
		@Pc(125) int local125 = (this.anInt6199 + this.anInt6194 + this.anInt6193) / 3;
		@Pc(136) int local136 = (this.anInt6191 + this.anInt6189 + this.anInt6192) / 3;
		@Pc(148) int local148 = (this.anInt6208 + this.anInt6204 + this.anInt6184) / 3;
		if (this.anInt6200 == local125 && local136 == this.anInt6202 && local148 == this.anInt6182) {
			return;
		}
		this.anInt6202 = local136;
		this.anInt6200 = local125;
		this.anInt6182 = local148;
		@Pc(185) int local185 = this.anInt6194 - this.anInt6199;
		@Pc(191) int local191 = this.anInt6189 - this.anInt6192;
		@Pc(198) int local198 = this.anInt6204 - this.anInt6208;
		@Pc(205) int local205 = this.anInt6193 - this.anInt6199;
		@Pc(212) int local212 = this.anInt6191 - this.anInt6192;
		@Pc(219) int local219 = this.anInt6184 - this.anInt6208;
		this.anInt6187 = local191 * local219 - local198 * local212;
		this.anInt6205 = local185 * local212 - local205 * local191;
		for (this.anInt6196 = local205 * local198 - local219 * local185; this.anInt6187 > 32767 || this.anInt6196 > 32767 || this.anInt6205 > 32767 || this.anInt6187 < -32767 || this.anInt6196 < -32767 || this.anInt6205 < -32767; this.anInt6196 >>= 0x1) {
			this.anInt6205 >>= 0x1;
			this.anInt6187 >>= 0x1;
		}
		@Pc(320) int local320 = (int) Math.sqrt((double) (this.anInt6196 * this.anInt6196 + this.anInt6187 * this.anInt6187 + this.anInt6205 * this.anInt6205));
		if (local320 <= 0) {
			local320 = 1;
		}
		this.anInt6196 = this.anInt6196 * 32767 / local320;
		this.anInt6187 = this.anInt6187 * 32767 / local320;
		this.anInt6205 = this.anInt6205 * 32767 / local320;
		if (this.aClass55_1.aShort27 <= 0 && this.aClass55_1.aShort28 <= 0) {
			return;
		}
		@Pc(370) int local370 = (int) (Math.atan2((double) this.anInt6205, (double) this.anInt6187) * 2607.5945876176133D);
		@Pc(392) int local392 = (int) (Math.atan2((double) this.anInt6196, Math.sqrt((double) (this.anInt6187 * this.anInt6187 + this.anInt6205 * this.anInt6205))) * 2607.5945876176133D);
		this.anInt6207 = this.aClass55_1.aShort27 - this.aClass55_1.aShort30;
		this.anInt6197 = local370 + this.aClass55_1.aShort30 - (this.anInt6207 >> 1);
		this.anInt6186 = this.aClass55_1.aShort28 - this.aClass55_1.aShort29;
		this.anInt6185 = this.aClass55_1.aShort29 + local392 - (this.anInt6186 >> 1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BJ)V")
	public void method5407(@OriginalArg(1) long arg0) {
		for (@Pc(7) Class7_Sub1_Sub1_Sub1 local7 = (Class7_Sub1_Sub1_Sub1) this.aClass199_5.method4896(); local7 != null; local7 = (Class7_Sub1_Sub1_Sub1) this.aClass199_5.method4902()) {
			local7.method381(arg0);
		}
	}
}
