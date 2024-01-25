import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
	public int anInt8926;

	@OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
	private int anInt8930;

	@OriginalMember(owner = "client!rba", name = "D", descriptor = "I")
	private int anInt8931;

	@OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
	private int anInt8932;

	@OriginalMember(owner = "client!rba", name = "F", descriptor = "I")
	private int anInt8933;

	@OriginalMember(owner = "client!rba", name = "G", descriptor = "I")
	private int anInt8934;

	@OriginalMember(owner = "client!rba", name = "H", descriptor = "I")
	private int anInt8935;

	@OriginalMember(owner = "client!rba", name = "I", descriptor = "I")
	private int anInt8936;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
	private int anInt8920 = 0;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "Z")
	public boolean aBoolean646 = false;

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "Lclient!vha;")
	public Class360 aClass360_1 = new Class360();

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "Lclient!vha;")
	private Class360 aClass360_2 = new Class360();

	@OriginalMember(owner = "client!rba", name = "C", descriptor = "Z")
	private boolean aBoolean647 = false;

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "J")
	private final long aLong220;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Lclient!nn;")
	public final Class227 aClass227_2;

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "Lclient!uj;")
	public final Class3_Sub9 aClass3_Sub9_7;

	@OriginalMember(owner = "client!rba", name = "q", descriptor = "Lclient!qb;")
	public Class273 aClass273_1;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "Lclient!tca;")
	public final Class325 aClass325_6;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!ha;Lclient!nn;Lclient!uj;J)V")
	public Class3_Sub7(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class3_Sub9 arg2, @OriginalArg(3) long arg3) {
		this.aLong220 = arg3;
		this.aClass227_2 = arg1;
		this.aClass3_Sub9_7 = arg2;
		this.aClass273_1 = this.aClass227_2.method6274();
		if (!arg0.method7247() && this.aClass273_1.anInt8251 != -1) {
			this.aClass273_1 = Static169.method797(this.aClass273_1.anInt8251);
		}
		this.aClass325_6 = new Class325();
		this.anInt8920 = (int) ((double) this.anInt8920 + Math.random() * 64.0D);
		this.method7476();
		this.aClass360_2.anInt10574 = this.aClass360_1.anInt10574;
		this.aClass360_2.anInt10564 = this.aClass360_1.anInt10564;
		this.aClass360_2.anInt10563 = this.aClass360_1.anInt10563;
		this.aClass360_2.anInt10570 = this.aClass360_1.anInt10570;
		this.aClass360_2.anInt10565 = this.aClass360_1.anInt10565;
		this.aClass360_2.anInt10572 = this.aClass360_1.anInt10572;
		this.aClass360_2.anInt10561 = this.aClass360_1.anInt10561;
		this.aClass360_2.anInt10567 = this.aClass360_1.anInt10567;
		this.aClass360_2.anInt10573 = this.aClass360_1.anInt10573;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(Z)V")
	public void method7476() {
		this.aClass360_1.anInt10565 = this.aClass227_2.anInt7399;
		this.aClass360_1.anInt10561 = this.aClass227_2.anInt7398;
		this.aClass360_1.anInt10563 = this.aClass227_2.anInt7395;
		this.aClass360_1.anInt10564 = this.aClass227_2.anInt7388;
		this.aClass360_1.anInt10574 = this.aClass227_2.anInt7389;
		this.aClass360_1.anInt10573 = this.aClass227_2.anInt7392;
		this.aClass360_1.anInt10572 = this.aClass227_2.anInt7400;
		this.aClass360_1.anInt10567 = this.aClass227_2.anInt7396;
		this.aClass360_1.anInt10570 = this.aClass227_2.anInt7394;
		if (this.aClass360_1.anInt10570 == this.aClass360_1.anInt10563 && this.aClass360_1.anInt10574 == this.aClass360_1.anInt10563 && this.aClass360_1.anInt10572 == this.aClass360_1.anInt10565 && this.aClass360_1.anInt10565 == this.aClass360_1.anInt10564 && this.aClass360_1.anInt10573 == this.aClass360_1.anInt10561 && this.aClass360_1.anInt10573 == this.aClass360_1.anInt10567) {
			this.aBoolean647 = true;
		} else if (this.aBoolean647) {
			this.aClass360_2.anInt10572 = this.aClass360_1.anInt10572;
			this.aBoolean647 = false;
			this.aClass360_2.anInt10567 = this.aClass360_1.anInt10567;
			this.aClass360_2.anInt10561 = this.aClass360_1.anInt10561;
			this.aClass360_2.anInt10565 = this.aClass360_1.anInt10565;
			this.aClass360_2.anInt10563 = this.aClass360_1.anInt10563;
			this.aClass360_2.anInt10573 = this.aClass360_1.anInt10573;
			this.aClass360_2.anInt10570 = this.aClass360_1.anInt10570;
			this.aClass360_2.anInt10564 = this.aClass360_1.anInt10564;
			this.aClass360_2.anInt10574 = this.aClass360_1.anInt10574;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZLclient!ha;J)V")
	public void method7480(@OriginalArg(1) Class20 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(17) Class3_Sub2_Sub2_Sub1 local17 = (Class3_Sub2_Sub2_Sub1) this.aClass325_6.method8016(); local17 != null; local17 = (Class3_Sub2_Sub2_Sub1) this.aClass325_6.method8022()) {
			local17.method6953(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!ha;IJIZ)V")
	public void method7482(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(33) int local33;
		if (this.aBoolean646) {
			arg3 = false;
		} else if (Static173.anInt4169 < this.aClass273_1.anInt8246) {
			arg3 = false;
		} else if (Static616.anInt10777 > Static590.anIntArray671[Static173.anInt4169]) {
			arg3 = false;
		} else if (this.aBoolean647) {
			arg3 = false;
		} else if (this.aClass273_1.anInt8281 != -1) {
			local33 = (int) (arg2 - this.aLong220);
			if (this.aClass273_1.aBoolean588 || this.aClass273_1.anInt8281 >= local33) {
				local33 %= this.aClass273_1.anInt8281;
			} else {
				arg3 = false;
			}
			if (!this.aClass273_1.aBoolean587 && local33 < this.aClass273_1.anInt8257) {
				arg3 = false;
			}
			if (this.aClass273_1.aBoolean587 && this.aClass273_1.anInt8257 <= local33) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static370.anInt7342++;
			local33 = (this.aClass360_1.anInt10570 + this.aClass360_1.anInt10563 + this.aClass360_1.anInt10574) / 3;
			@Pc(128) int local128 = (this.aClass360_1.anInt10564 + this.aClass360_1.anInt10572 + this.aClass360_1.anInt10565) / 3;
			@Pc(142) int local142 = (this.aClass360_1.anInt10567 + this.aClass360_1.anInt10573 + this.aClass360_1.anInt10561) / 3;
			@Pc(186) int local186;
			@Pc(195) int local195;
			@Pc(204) int local204;
			@Pc(212) int local212;
			@Pc(220) int local220;
			@Pc(229) int local229;
			@Pc(330) int local330;
			@Pc(380) int local380;
			@Pc(401) int local401;
			if (this.aClass360_1.anInt10568 != local33 || local128 != this.aClass360_1.anInt10562 || this.aClass360_1.anInt10566 != local142) {
				this.aClass360_1.anInt10562 = local128;
				this.aClass360_1.anInt10568 = local33;
				this.aClass360_1.anInt10566 = local142;
				local186 = this.aClass360_1.anInt10563 - this.aClass360_1.anInt10570;
				local195 = this.aClass360_1.anInt10565 - this.aClass360_1.anInt10572;
				local204 = this.aClass360_1.anInt10573 - this.aClass360_1.anInt10561;
				local212 = this.aClass360_1.anInt10574 - this.aClass360_1.anInt10570;
				local220 = this.aClass360_1.anInt10564 - this.aClass360_1.anInt10572;
				local229 = this.aClass360_1.anInt10567 - this.aClass360_1.anInt10561;
				this.anInt8934 = local212 * local204 - local186 * local229;
				this.anInt8932 = local195 * local229 - local220 * local204;
				this.anInt8935 = local220 * local186 - local212 * local195;
				while (true) {
					if (this.anInt8932 <= 32767 && this.anInt8934 <= 32767 && this.anInt8935 <= 32767 && this.anInt8932 >= -32767 && this.anInt8934 >= -32767 && this.anInt8935 >= -32767) {
						local330 = (int) Math.sqrt((double) (this.anInt8932 * this.anInt8932 + this.anInt8934 * this.anInt8934 + this.anInt8935 * this.anInt8935));
						if (local330 <= 0) {
							local330 = 1;
						}
						this.anInt8932 = this.anInt8932 * 32767 / local330;
						this.anInt8935 = this.anInt8935 * 32767 / local330;
						this.anInt8934 = this.anInt8934 * 32767 / local330;
						if (this.aClass273_1.aShort109 > 0 || this.aClass273_1.aShort112 > 0) {
							local380 = (int) (Math.atan2((double) this.anInt8935, (double) this.anInt8932) * 2607.5945876176133D);
							local401 = (int) (Math.atan2((double) this.anInt8934, Math.sqrt((double) (this.anInt8935 * this.anInt8935 + this.anInt8932 * this.anInt8932))) * 2607.5945876176133D);
							this.anInt8933 = this.aClass273_1.aShort109 - this.aClass273_1.aShort111;
							this.anInt8936 = this.aClass273_1.aShort111 + local380 - (this.anInt8933 >> 1);
							this.anInt8931 = this.aClass273_1.aShort112 - this.aClass273_1.aShort110;
							this.anInt8930 = local401 + this.aClass273_1.aShort110 - (this.anInt8931 >> 1);
						}
						break;
					}
					this.anInt8935 >>= 0x1;
					this.anInt8934 >>= 0x1;
					this.anInt8932 >>= 0x1;
				}
			}
			this.anInt8920 += (int) (((double) (this.aClass273_1.anInt8253 - this.aClass273_1.anInt8255) * Math.random() + (double) this.aClass273_1.anInt8255) * (double) arg1);
			if (this.anInt8920 > 63) {
				local186 = this.anInt8920 >> 6;
				this.anInt8920 &= 0x3F;
				for (local220 = 0; local220 < local186; local220++) {
					@Pc(555) int local555;
					@Pc(559) int local559;
					if (this.aClass273_1.aShort109 <= 0 && this.aClass273_1.aShort112 <= 0) {
						local195 = this.anInt8932;
						local212 = this.anInt8935;
						local204 = this.anInt8934;
					} else {
						local229 = (int) (Math.random() * (double) this.anInt8933) + this.anInt8936;
						local229 &= 0x3FFF;
						local330 = Class177.anIntArray361[local229];
						local380 = Class177.anIntArray360[local229];
						local401 = this.anInt8930 + (int) ((double) this.anInt8931 * Math.random());
						local401 &= 0x1FFF;
						local555 = Class177.anIntArray361[local401];
						local559 = Class177.anIntArray360[local401];
						local195 = local555 * local380 >> 13;
						local204 = (local559 << 1) * -1;
						local212 = local555 * local330 >> 13;
					}
					@Pc(582) float local582 = (float) Math.random();
					@Pc(585) float local585 = (float) Math.random();
					if (local582 + local585 > 1.0F) {
						local585 = 1.0F - local585;
						local582 = 1.0F - local582;
					}
					@Pc(606) float local606 = 1.0F - local582 - local585;
					local401 = (int) ((float) this.aClass360_1.anInt10574 * local606 + local582 * (float) this.aClass360_1.anInt10570 + local585 * (float) this.aClass360_1.anInt10563);
					local555 = (int) (local582 * (float) this.aClass360_1.anInt10572 + (float) this.aClass360_1.anInt10565 * local585 + (float) this.aClass360_1.anInt10564 * local606);
					local559 = (int) ((float) this.aClass360_1.anInt10561 * local582 + (float) this.aClass360_1.anInt10573 * local585 + local606 * (float) this.aClass360_1.anInt10567);
					@Pc(694) int local694 = (int) ((float) this.aClass360_2.anInt10574 * local606 + local585 * (float) this.aClass360_2.anInt10563 + local582 * (float) this.aClass360_2.anInt10570);
					@Pc(716) int local716 = (int) ((float) this.aClass360_2.anInt10565 * local585 + (float) this.aClass360_2.anInt10572 * local582 + (float) this.aClass360_2.anInt10564 * local606);
					@Pc(738) int local738 = (int) ((float) this.aClass360_2.anInt10567 * local606 + (float) this.aClass360_2.anInt10561 * local582 + (float) this.aClass360_2.anInt10573 * local585);
					@Pc(742) int local742 = local401 - local694;
					@Pc(747) int local747 = local555 - local716;
					@Pc(752) int local752 = local559 - local738;
					@Pc(761) int local761 = (int) ((double) local742 * Math.random() + (double) local694);
					@Pc(770) int local770 = (int) ((double) local716 + (double) local747 * Math.random());
					@Pc(779) int local779 = (int) ((double) local738 + (double) local752 * Math.random());
					@Pc(796) int local796 = (int) (Math.random() * (double) (this.aClass273_1.anInt8291 - this.aClass273_1.anInt8256)) + this.aClass273_1.anInt8256;
					@Pc(813) int local813 = this.aClass273_1.anInt8258 + (int) ((double) (this.aClass273_1.anInt8267 - this.aClass273_1.anInt8258) * Math.random());
					@Pc(829) int local829 = (int) ((double) (this.aClass273_1.anInt8275 - this.aClass273_1.anInt8294) * Math.random()) + this.aClass273_1.anInt8294;
					@Pc(891) int local891;
					if (this.aClass273_1.aBoolean591) {
						@Pc(895) double local895 = Math.random();
						local891 = (int) (local895 * (double) this.aClass273_1.anInt8268 + (double) this.aClass273_1.anInt8261) | (int) ((double) this.aClass273_1.anInt8287 * local895 + (double) this.aClass273_1.anInt8285) << 16 | (int) ((double) this.aClass273_1.anInt8254 + (double) this.aClass273_1.anInt8264 * local895) << 8 | (int) ((double) this.aClass273_1.anInt8272 + (double) this.aClass273_1.anInt8270 * Math.random()) << 24;
					} else {
						local891 = (int) ((double) this.aClass273_1.anInt8270 * Math.random() + (double) this.aClass273_1.anInt8272) << 24 | (int) (Math.random() * (double) this.aClass273_1.anInt8287 + (double) this.aClass273_1.anInt8285) << 16 | (int) (Math.random() * (double) this.aClass273_1.anInt8264 + (double) this.aClass273_1.anInt8254) << 8 | (int) ((double) this.aClass273_1.anInt8268 * Math.random() + (double) this.aClass273_1.anInt8261);
					}
					@Pc(957) int local957 = this.aClass273_1.anInt8273;
					if (!arg0.method7247() && !this.aClass273_1.aBoolean585) {
						local957 = -1;
					}
					if (Static76.anInt2398 == Static40.anInt1337) {
						new Class3_Sub2_Sub2_Sub1(this, local761, local770, local779, local195, local204, local212, local796, local813, local891, local829, local957, this.aClass273_1.lb, this.aClass273_1.aBoolean590);
					} else {
						@Pc(973) Class3_Sub2_Sub2_Sub1 local973 = Static120.aClass3_Sub2_Sub2_Sub1Array1[Static40.anInt1337];
						Static40.anInt1337 = Static40.anInt1337 + 1 & 0x3FF;
						local973.method6954(this, local761, local770, local779, local195, local204, local212, local796, local813, local891, local829, local957, this.aClass273_1.lb, this.aClass273_1.aBoolean590);
					}
				}
			}
		}
		if (!this.aClass360_1.method8803(this.aClass360_2)) {
			@Pc(1041) Class360 local1041 = this.aClass360_2;
			this.aClass360_2 = this.aClass360_1;
			this.aClass360_1 = local1041;
			this.aClass360_1.anInt10572 = this.aClass227_2.anInt7400;
			this.aClass360_1.anInt10570 = this.aClass227_2.anInt7394;
			this.aClass360_1.anInt10565 = this.aClass227_2.anInt7399;
			this.aClass360_1.anInt10567 = this.aClass227_2.anInt7396;
			this.aClass360_1.anInt10574 = this.aClass227_2.anInt7389;
			this.aClass360_1.anInt10573 = this.aClass227_2.anInt7392;
			this.aClass360_1.anInt10561 = this.aClass227_2.anInt7398;
			this.aClass360_1.anInt10568 = this.aClass360_2.anInt10568;
			this.aClass360_1.anInt10564 = this.aClass227_2.anInt7388;
			this.aClass360_1.anInt10566 = this.aClass360_2.anInt10566;
			this.aClass360_1.anInt10562 = this.aClass360_2.anInt10562;
			this.aClass360_1.anInt10563 = this.aClass227_2.anInt7395;
		}
		this.anInt8926 = 0;
		for (@Pc(1131) Class3_Sub2_Sub2_Sub1 local1131 = (Class3_Sub2_Sub2_Sub1) this.aClass325_6.method8016(); local1131 != null; local1131 = (Class3_Sub2_Sub2_Sub1) this.aClass325_6.method8022()) {
			local1131.method6955(arg2, arg1);
			this.anInt8926++;
		}
		Static70.anInt2219 += this.anInt8926;
	}
}
