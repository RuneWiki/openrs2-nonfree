import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	private int anInt3003;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
	private int anInt3004;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
	private int anInt3005;

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
	private int anInt3006;

	@OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	private int anInt2994 = 0;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "Lclient!di;")
	public Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "Lclient!di;")
	private Class74 aClass74_2 = new Class74();

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "Lclient!qi;")
	public final Class287 aClass287_1;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "Lclient!od;")
	public final Class16_Sub7 aClass16_Sub7_4;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "J")
	private final long aLong76;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "Lclient!bm;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Lclient!an;")
	public final Class19 aClass19_3;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!ha;Lclient!qi;Lclient!od;J)V")
	public Class16_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class287 arg1, @OriginalArg(2) Class16_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass287_1 = arg1;
		this.aClass16_Sub7_4 = arg2;
		this.aLong76 = arg3;
		this.aClass40_1 = this.aClass287_1.method6664();
		if (!arg0.method8145() && this.aClass40_1.anInt1251 != -1) {
			this.aClass40_1 = Static238.method6994(this.aClass40_1.anInt1251);
		}
		this.aClass19_3 = new Class19();
		this.anInt2994 = (int) ((double) this.anInt2994 + Math.random() * 64.0D);
		this.method2582();
		this.aClass74_2.anInt2322 = this.aClass74_1.anInt2322;
		this.aClass74_2.anInt2330 = this.aClass74_1.anInt2330;
		this.aClass74_2.anInt2323 = this.aClass74_1.anInt2323;
		this.aClass74_2.anInt2328 = this.aClass74_1.anInt2328;
		this.aClass74_2.anInt2321 = this.aClass74_1.anInt2321;
		this.aClass74_2.anInt2317 = this.aClass74_1.anInt2317;
		this.aClass74_2.anInt2329 = this.aClass74_1.anInt2329;
		this.aClass74_2.anInt2320 = this.aClass74_1.anInt2320;
		this.aClass74_2.anInt2324 = this.aClass74_1.anInt2324;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!ha;IJZI)V")
	public void method2578(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3) {
		@Pc(52) int local52;
		if (this.aBoolean234) {
			arg3 = false;
		} else if (Static626.anInt10188 < this.aClass40_1.anInt1268) {
			arg3 = false;
		} else if (Static452.anInt7372 > Static477.anIntArray557[Static626.anInt10188]) {
			arg3 = false;
		} else if (this.aBoolean235) {
			arg3 = false;
		} else if (this.aClass40_1.anInt1236 != -1) {
			local52 = (int) (arg2 - this.aLong76);
			if (this.aClass40_1.aBoolean112 || this.aClass40_1.anInt1236 >= local52) {
				local52 %= this.aClass40_1.anInt1236;
			} else {
				arg3 = false;
			}
			if (!this.aClass40_1.aBoolean113 && local52 < this.aClass40_1.anInt1244) {
				arg3 = false;
			}
			if (this.aClass40_1.aBoolean113 && this.aClass40_1.anInt1244 <= local52) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static357.anInt6184++;
			local52 = (this.aClass74_1.anInt2317 + this.aClass74_1.anInt2321 + this.aClass74_1.anInt2322) / 3;
			@Pc(134) int local134 = (this.aClass74_1.anInt2320 + this.aClass74_1.anInt2323 + this.aClass74_1.anInt2330) / 3;
			@Pc(149) int local149 = (this.aClass74_1.anInt2328 + this.aClass74_1.anInt2324 + this.aClass74_1.anInt2329) / 3;
			@Pc(189) int local189;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(215) int local215;
			@Pc(224) int local224;
			@Pc(232) int local232;
			@Pc(330) int local330;
			@Pc(383) int local383;
			@Pc(404) int local404;
			if (local52 != this.aClass74_1.anInt2319 || this.aClass74_1.anInt2326 != local134 || local149 != this.aClass74_1.anInt2325) {
				this.aClass74_1.anInt2325 = local149;
				this.aClass74_1.anInt2326 = local134;
				this.aClass74_1.anInt2319 = local52;
				local189 = this.aClass74_1.anInt2317 - this.aClass74_1.anInt2321;
				local197 = this.aClass74_1.anInt2323 - this.aClass74_1.anInt2320;
				local206 = this.aClass74_1.anInt2328 - this.aClass74_1.anInt2324;
				local215 = this.aClass74_1.anInt2322 - this.aClass74_1.anInt2321;
				local224 = this.aClass74_1.anInt2330 - this.aClass74_1.anInt2320;
				local232 = this.aClass74_1.anInt2329 - this.aClass74_1.anInt2324;
				this.anInt3004 = local189 * local224 - local197 * local215;
				this.anInt3001 = local215 * local206 - local232 * local189;
				this.anInt3000 = local197 * local232 - local224 * local206;
				while (true) {
					if (this.anInt3000 <= 32767 && this.anInt3001 <= 32767 && this.anInt3004 <= 32767 && this.anInt3000 >= -32767 && this.anInt3001 >= -32767 && this.anInt3004 >= -32767) {
						local330 = (int) Math.sqrt((double) (this.anInt3000 * this.anInt3000 + this.anInt3001 * this.anInt3001 + this.anInt3004 * this.anInt3004));
						if (local330 <= 0) {
							local330 = 1;
						}
						this.anInt3004 = this.anInt3004 * 32767 / local330;
						this.anInt3000 = this.anInt3000 * 32767 / local330;
						this.anInt3001 = this.anInt3001 * 32767 / local330;
						if (this.aClass40_1.aShort27 > 0 || this.aClass40_1.aShort24 > 0) {
							local383 = (int) (Math.atan2((double) this.anInt3004, (double) this.anInt3000) * 2607.5945876176133D);
							local404 = (int) (Math.atan2((double) this.anInt3001, Math.sqrt((double) (this.anInt3004 * this.anInt3004 + this.anInt3000 * this.anInt3000))) * 2607.5945876176133D);
							this.anInt3007 = this.aClass40_1.aShort27 - this.aClass40_1.aShort26;
							this.anInt3003 = this.aClass40_1.aShort26 + local383 - (this.anInt3007 >> 1);
							this.anInt3006 = this.aClass40_1.aShort24 - this.aClass40_1.aShort25;
							this.anInt3005 = this.aClass40_1.aShort25 + local404 - (this.anInt3006 >> 1);
						}
						break;
					}
					this.anInt3001 >>= 0x1;
					this.anInt3004 >>= 0x1;
					this.anInt3000 >>= 0x1;
				}
			}
			this.anInt2994 += (int) ((Math.random() * (double) (this.aClass40_1.anInt1231 - this.aClass40_1.lb) + (double) this.aClass40_1.lb) * (double) arg1);
			if (this.anInt2994 > 63) {
				local189 = this.anInt2994 >> 6;
				this.anInt2994 &= 0x3F;
				for (local224 = 0; local224 < local189; local224++) {
					@Pc(541) int local541;
					@Pc(545) int local545;
					if (this.aClass40_1.aShort27 <= 0 && this.aClass40_1.aShort24 <= 0) {
						local215 = this.anInt3004;
						local197 = this.anInt3000;
						local206 = this.anInt3001;
					} else {
						local232 = (int) (Math.random() * (double) this.anInt3007) + this.anInt3003;
						local232 &= 0x3FFF;
						local330 = Class290.anIntArray546[local232];
						local383 = Class290.anIntArray547[local232];
						local404 = (int) ((double) this.anInt3006 * Math.random()) + this.anInt3005;
						local404 &= 0x1FFF;
						local541 = Class290.anIntArray546[local404];
						local545 = Class290.anIntArray547[local404];
						local197 = local383 * local541 >> 13;
						local206 = (local545 << 1) * -1;
						local215 = local330 * local541 >> 13;
					}
					@Pc(579) float local579 = (float) Math.random();
					@Pc(582) float local582 = (float) Math.random();
					if (local579 + local582 > 1.0F) {
						local579 = 1.0F - local579;
						local582 = 1.0F - local582;
					}
					@Pc(604) float local604 = 1.0F - local582 - local579;
					local404 = (int) ((float) this.aClass74_1.anInt2322 * local604 + local579 * (float) this.aClass74_1.anInt2321 + (float) this.aClass74_1.anInt2317 * local582);
					local541 = (int) ((float) this.aClass74_1.anInt2330 * local604 + (float) this.aClass74_1.anInt2320 * local579 + (float) this.aClass74_1.anInt2323 * local582);
					local545 = (int) (local604 * (float) this.aClass74_1.anInt2329 + local579 * (float) this.aClass74_1.anInt2324 + (float) this.aClass74_1.anInt2328 * local582);
					@Pc(692) int local692 = (int) ((float) this.aClass74_2.anInt2317 * local582 + local579 * (float) this.aClass74_2.anInt2321 + (float) this.aClass74_2.anInt2322 * local604);
					@Pc(714) int local714 = (int) ((float) this.aClass74_2.anInt2330 * local604 + (float) this.aClass74_2.anInt2323 * local582 + (float) this.aClass74_2.anInt2320 * local579);
					@Pc(736) int local736 = (int) (local579 * (float) this.aClass74_2.anInt2324 + (float) this.aClass74_2.anInt2328 * local582 + local604 * (float) this.aClass74_2.anInt2329);
					@Pc(740) int local740 = local404 - local692;
					@Pc(745) int local745 = local541 - local714;
					@Pc(750) int local750 = local545 - local736;
					@Pc(759) int local759 = (int) ((double) local740 * Math.random() + (double) local692);
					@Pc(768) int local768 = (int) ((double) local745 * Math.random() + (double) local714);
					@Pc(777) int local777 = (int) ((double) local736 + (double) local750 * Math.random());
					@Pc(795) int local795 = this.aClass40_1.anInt1266 + (int) ((double) (this.aClass40_1.anInt1233 - this.aClass40_1.anInt1266) * Math.random());
					@Pc(811) int local811 = this.aClass40_1.anInt1243 + (int) (Math.random() * (double) (this.aClass40_1.anInt1278 - this.aClass40_1.anInt1243));
					@Pc(829) int local829 = this.aClass40_1.anInt1267 + (int) ((double) (this.aClass40_1.anInt1261 - this.aClass40_1.anInt1267) * Math.random());
					@Pc(891) int local891;
					if (this.aClass40_1.aBoolean119) {
						@Pc(895) double local895 = Math.random();
						local891 = (int) ((double) this.aClass40_1.anInt1252 + Math.random() * (double) this.aClass40_1.anInt1262) << 24 | (int) ((double) this.aClass40_1.anInt1248 * local895 + (double) this.aClass40_1.anInt1253) << 8 | (int) ((double) this.aClass40_1.anInt1264 + (double) this.aClass40_1.anInt1280 * local895) << 16 | (int) (local895 * (double) this.aClass40_1.anInt1245 + (double) this.aClass40_1.anInt1258);
					} else {
						local891 = (int) ((double) this.aClass40_1.anInt1262 * Math.random() + (double) this.aClass40_1.anInt1252) << 24 | (int) ((double) this.aClass40_1.anInt1253 + (double) this.aClass40_1.anInt1248 * Math.random()) << 8 | (int) (Math.random() * (double) this.aClass40_1.anInt1280 + (double) this.aClass40_1.anInt1264) << 16 | (int) ((double) this.aClass40_1.anInt1258 + Math.random() * (double) this.aClass40_1.anInt1245);
					}
					@Pc(957) int local957 = this.aClass40_1.anInt1254;
					if (!arg0.method8145() && !this.aClass40_1.aBoolean116) {
						local957 = -1;
					}
					if (Static69.anInt1872 == Static265.anInt4974) {
						new Class16_Sub6_Sub1_Sub1(this, local759, local768, local777, local197, local206, local215, local795, local811, local891, local829, local957, this.aClass40_1.aBoolean111, this.aClass40_1.aBoolean118);
					} else {
						@Pc(997) Class16_Sub6_Sub1_Sub1 local997 = Static148.aClass16_Sub6_Sub1_Sub1Array1[Static69.anInt1872];
						Static69.anInt1872 = Static69.anInt1872 + 1 & 0x3FF;
						local997.method8609(this, local759, local768, local777, local197, local206, local215, local795, local811, local891, local829, local957, this.aClass40_1.aBoolean111, this.aClass40_1.aBoolean118);
					}
				}
			}
		}
		if (!this.aClass74_1.method1950(this.aClass74_2)) {
			@Pc(1041) Class74 local1041 = this.aClass74_2;
			this.aClass74_2 = this.aClass74_1;
			this.aClass74_1 = local1041;
			this.aClass74_1.anInt2323 = this.aClass287_1.anInt7581;
			this.aClass74_1.anInt2321 = this.aClass287_1.anInt7580;
			this.aClass74_1.anInt2329 = this.aClass287_1.anInt7575;
			this.aClass74_1.anInt2322 = this.aClass287_1.anInt7584;
			this.aClass74_1.anInt2319 = this.aClass74_2.anInt2319;
			this.aClass74_1.anInt2328 = this.aClass287_1.anInt7571;
			this.aClass74_1.anInt2326 = this.aClass74_2.anInt2326;
			this.aClass74_1.anInt2317 = this.aClass287_1.anInt7586;
			this.aClass74_1.anInt2330 = this.aClass287_1.anInt7585;
			this.aClass74_1.anInt2325 = this.aClass74_2.anInt2325;
			this.aClass74_1.anInt2324 = this.aClass287_1.anInt7578;
			this.aClass74_1.anInt2320 = this.aClass287_1.anInt7579;
		}
		this.anInt2995 = 0;
		for (@Pc(1129) Class16_Sub6_Sub1_Sub1 local1129 = (Class16_Sub6_Sub1_Sub1) this.aClass19_3.method562(); local1129 != null; local1129 = (Class16_Sub6_Sub1_Sub1) this.aClass19_3.method558()) {
			local1129.method8611(arg2, arg1);
			this.anInt2995++;
		}
		Static439.anInt7221 += this.anInt2995;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!ha;JB)V")
	public void method2580(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(16) Class16_Sub6_Sub1_Sub1 local16 = (Class16_Sub6_Sub1_Sub1) this.aClass19_3.method562(); local16 != null; local16 = (Class16_Sub6_Sub1_Sub1) this.aClass19_3.method558()) {
			local16.method8608(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)V")
	public void method2582() {
		this.aClass74_1.anInt2330 = this.aClass287_1.anInt7585;
		this.aClass74_1.anInt2317 = this.aClass287_1.anInt7586;
		this.aClass74_1.anInt2324 = this.aClass287_1.anInt7578;
		this.aClass74_1.anInt2322 = this.aClass287_1.anInt7584;
		this.aClass74_1.anInt2329 = this.aClass287_1.anInt7575;
		this.aClass74_1.anInt2320 = this.aClass287_1.anInt7579;
		this.aClass74_1.anInt2328 = this.aClass287_1.anInt7571;
		this.aClass74_1.anInt2321 = this.aClass287_1.anInt7580;
		this.aClass74_1.anInt2323 = this.aClass287_1.anInt7581;
		if (this.aClass74_1.anInt2317 == this.aClass74_1.anInt2321 && this.aClass74_1.anInt2322 == this.aClass74_1.anInt2317 && this.aClass74_1.anInt2320 == this.aClass74_1.anInt2323 && this.aClass74_1.anInt2323 == this.aClass74_1.anInt2330 && this.aClass74_1.anInt2328 == this.aClass74_1.anInt2324 && this.aClass74_1.anInt2329 == this.aClass74_1.anInt2328) {
			this.aBoolean235 = true;
		} else if (this.aBoolean235) {
			this.aClass74_2.anInt2329 = this.aClass74_1.anInt2329;
			this.aClass74_2.anInt2323 = this.aClass74_1.anInt2323;
			this.aBoolean235 = false;
			this.aClass74_2.anInt2317 = this.aClass74_1.anInt2317;
			this.aClass74_2.anInt2320 = this.aClass74_1.anInt2320;
			this.aClass74_2.anInt2324 = this.aClass74_1.anInt2324;
			this.aClass74_2.anInt2322 = this.aClass74_1.anInt2322;
			this.aClass74_2.anInt2321 = this.aClass74_1.anInt2321;
			this.aClass74_2.anInt2328 = this.aClass74_1.anInt2328;
			this.aClass74_2.anInt2330 = this.aClass74_1.anInt2330;
		}
	}
}
