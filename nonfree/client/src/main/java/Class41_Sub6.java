import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class41_Sub6 extends Class41 {

	@OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
	public int anInt7158;

	@OriginalMember(owner = "client!oea", name = "D", descriptor = "I")
	private int anInt7161;

	@OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
	private int anInt7162;

	@OriginalMember(owner = "client!oea", name = "G", descriptor = "I")
	private int anInt7163;

	@OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
	private int anInt7164;

	@OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
	private int anInt7165;

	@OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
	private int anInt7166;

	@OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
	private int anInt7167;

	@OriginalMember(owner = "client!oea", name = "u", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
	private int anInt7157 = 0;

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "Lclient!es;")
	public Class105 aClass105_1 = new Class105();

	@OriginalMember(owner = "client!oea", name = "C", descriptor = "Lclient!es;")
	private Class105 aClass105_2 = new Class105();

	@OriginalMember(owner = "client!oea", name = "E", descriptor = "Z")
	private boolean aBoolean513 = false;

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "Lclient!qo;")
	public final Class41_Sub7 aClass41_Sub7_5;

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "J")
	private final long aLong218;

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "Lclient!nha;")
	public final Class244 aClass244_2;

	@OriginalMember(owner = "client!oea", name = "y", descriptor = "Lclient!lh;")
	public Class217 aClass217_1;

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "Lclient!eo;")
	public final Class102 aClass102_4;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!ha;Lclient!nha;Lclient!qo;J)V")
	public Class41_Sub6(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class41_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass41_Sub7_5 = arg2;
		this.aLong218 = arg3;
		this.aClass244_2 = arg1;
		this.aClass217_1 = this.aClass244_2.method5736();
		if (!arg0.method6205() && this.aClass217_1.anInt6045 != -1) {
			this.aClass217_1 = Static362.method5338(this.aClass217_1.anInt6045);
		}
		this.aClass102_4 = new Class102();
		this.anInt7157 = (int) ((double) this.anInt7157 + Math.random() * 64.0D);
		this.method6169();
		this.aClass105_2.anInt2345 = this.aClass105_1.anInt2345;
		this.aClass105_2.anInt2356 = this.aClass105_1.anInt2356;
		this.aClass105_2.anInt2354 = this.aClass105_1.anInt2354;
		this.aClass105_2.anInt2349 = this.aClass105_1.anInt2349;
		this.aClass105_2.anInt2346 = this.aClass105_1.anInt2346;
		this.aClass105_2.anInt2355 = this.aClass105_1.anInt2355;
		this.aClass105_2.anInt2352 = this.aClass105_1.anInt2352;
		this.aClass105_2.anInt2344 = this.aClass105_1.anInt2344;
		this.aClass105_2.anInt2347 = this.aClass105_1.anInt2347;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!ha;JIIZ)V")
	public void method6168(@OriginalArg(0) Class143 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(45) int local45;
		if (this.aBoolean511) {
			arg3 = false;
		} else if (this.aClass217_1.anInt6072 > Static168.anInt2782) {
			arg3 = false;
		} else if (Static671.anIntArray613[Static168.anInt2782] < Static456.anInt7923) {
			arg3 = false;
		} else if (this.aBoolean513) {
			arg3 = false;
		} else if (this.aClass217_1.anInt6062 != -1) {
			local45 = (int) (arg1 - this.aLong218);
			if (this.aClass217_1.aBoolean447 || this.aClass217_1.anInt6062 >= local45) {
				local45 %= this.aClass217_1.anInt6062;
			} else {
				arg3 = false;
			}
			if (!this.aClass217_1.aBoolean448 && local45 < this.aClass217_1.anInt6093) {
				arg3 = false;
			}
			if (this.aClass217_1.aBoolean448 && this.aClass217_1.anInt6093 <= local45) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static124.anInt2151++;
			local45 = (this.aClass105_1.anInt2346 + this.aClass105_1.anInt2352 + this.aClass105_1.anInt2344) / 3;
			@Pc(133) int local133 = (this.aClass105_1.anInt2355 + this.aClass105_1.anInt2347 + this.aClass105_1.anInt2349) / 3;
			@Pc(147) int local147 = (this.aClass105_1.anInt2356 + this.aClass105_1.anInt2345 + this.aClass105_1.anInt2354) / 3;
			@Pc(191) int local191;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(218) int local218;
			@Pc(226) int local226;
			@Pc(235) int local235;
			@Pc(335) int local335;
			@Pc(382) int local382;
			@Pc(403) int local403;
			if (local45 != this.aClass105_1.anInt2348 || local133 != this.aClass105_1.anInt2351 || this.aClass105_1.anInt2350 != local147) {
				this.aClass105_1.anInt2350 = local147;
				this.aClass105_1.anInt2351 = local133;
				this.aClass105_1.anInt2348 = local45;
				local191 = this.aClass105_1.anInt2346 - this.aClass105_1.anInt2352;
				local200 = this.aClass105_1.anInt2355 - this.aClass105_1.anInt2347;
				local209 = this.aClass105_1.anInt2356 - this.aClass105_1.anInt2345;
				local218 = this.aClass105_1.anInt2344 - this.aClass105_1.anInt2352;
				local226 = this.aClass105_1.anInt2349 - this.aClass105_1.anInt2347;
				local235 = this.aClass105_1.anInt2354 - this.aClass105_1.anInt2345;
				this.anInt7166 = local191 * local226 - local218 * local200;
				this.anInt7165 = local218 * local209 - local235 * local191;
				this.anInt7164 = local200 * local235 - local209 * local226;
				while (true) {
					if (this.anInt7164 <= 32767 && this.anInt7165 <= 32767 && this.anInt7166 <= 32767 && this.anInt7164 >= -32767 && this.anInt7165 >= -32767 && this.anInt7166 >= -32767) {
						local335 = (int) Math.sqrt((double) (this.anInt7165 * this.anInt7165 + this.anInt7164 * this.anInt7164 + this.anInt7166 * this.anInt7166));
						if (local335 <= 0) {
							local335 = 1;
						}
						this.anInt7165 = this.anInt7165 * 32767 / local335;
						this.anInt7164 = this.anInt7164 * 32767 / local335;
						this.anInt7166 = this.anInt7166 * 32767 / local335;
						if (this.aClass217_1.aShort80 > 0 || this.aClass217_1.aShort81 > 0) {
							local382 = (int) (Math.atan2((double) this.anInt7166, (double) this.anInt7164) * 2607.5945876176133D);
							local403 = (int) (Math.atan2((double) this.anInt7165, Math.sqrt((double) (this.anInt7166 * this.anInt7166 + this.anInt7164 * this.anInt7164))) * 2607.5945876176133D);
							this.anInt7162 = this.aClass217_1.aShort80 - this.aClass217_1.aShort79;
							this.anInt7163 = this.aClass217_1.aShort81 - this.aClass217_1.aShort78;
							this.anInt7167 = this.aClass217_1.aShort79 + local382 - (this.anInt7162 >> 1);
							this.anInt7161 = this.aClass217_1.aShort78 + local403 - (this.anInt7163 >> 1);
						}
						break;
					}
					this.anInt7164 >>= 0x1;
					this.anInt7166 >>= 0x1;
					this.anInt7165 >>= 0x1;
				}
			}
			this.anInt7157 += (int) ((double) arg2 * ((double) this.aClass217_1.anInt6057 + Math.random() * (double) (this.aClass217_1.anInt6081 - this.aClass217_1.anInt6057)));
			if (this.anInt7157 > 63) {
				local191 = this.anInt7157 >> 6;
				this.anInt7157 &= 0x3F;
				for (local226 = 0; local226 < local191; local226++) {
					@Pc(556) int local556;
					@Pc(560) int local560;
					if (this.aClass217_1.aShort80 <= 0 && this.aClass217_1.aShort81 <= 0) {
						local209 = this.anInt7165;
						local200 = this.anInt7164;
						local218 = this.anInt7166;
					} else {
						local235 = this.anInt7167 + (int) ((double) this.anInt7162 * Math.random());
						local235 &= 0x3FFF;
						local335 = Class242.anIntArray384[local235];
						local382 = Class242.anIntArray383[local235];
						local403 = this.anInt7161 + (int) ((double) this.anInt7163 * Math.random());
						local403 &= 0x1FFF;
						local556 = Class242.anIntArray384[local403];
						local560 = Class242.anIntArray383[local403];
						local209 = (local560 << 1) * -1;
						local200 = local556 * local382 >> 13;
						local218 = local556 * local335 >> 13;
					}
					@Pc(583) float local583 = (float) Math.random();
					@Pc(586) float local586 = (float) Math.random();
					if (local583 + local586 > 1.0F) {
						local586 = 1.0F - local586;
						local583 = 1.0F - local583;
					}
					@Pc(609) float local609 = 1.0F - local586 - local583;
					local403 = (int) ((float) this.aClass105_1.anInt2344 * local609 + local583 * (float) this.aClass105_1.anInt2352 + local586 * (float) this.aClass105_1.anInt2346);
					local556 = (int) ((float) this.aClass105_1.anInt2347 * local583 + (float) this.aClass105_1.anInt2355 * local586 + (float) this.aClass105_1.anInt2349 * local609);
					local560 = (int) (local609 * (float) this.aClass105_1.anInt2354 + local586 * (float) this.aClass105_1.anInt2356 + (float) this.aClass105_1.anInt2345 * local583);
					@Pc(697) int local697 = (int) (local583 * (float) this.aClass105_2.anInt2352 + (float) this.aClass105_2.anInt2346 * local586 + (float) this.aClass105_2.anInt2344 * local609);
					@Pc(719) int local719 = (int) ((float) this.aClass105_2.anInt2347 * local583 + local586 * (float) this.aClass105_2.anInt2355 + local609 * (float) this.aClass105_2.anInt2349);
					@Pc(741) int local741 = (int) (local583 * (float) this.aClass105_2.anInt2345 + local586 * (float) this.aClass105_2.anInt2356 + (float) this.aClass105_2.anInt2354 * local609);
					@Pc(746) int local746 = local403 - local697;
					@Pc(751) int local751 = local556 - local719;
					@Pc(755) int local755 = local560 - local741;
					@Pc(764) int local764 = (int) ((double) local746 * Math.random() + (double) local697);
					@Pc(773) int local773 = (int) ((double) local751 * Math.random() + (double) local719);
					@Pc(782) int local782 = (int) ((double) local741 + (double) local755 * Math.random());
					@Pc(799) int local799 = (int) ((double) (this.aClass217_1.anInt6049 - this.aClass217_1.lb) * Math.random()) + this.aClass217_1.lb;
					@Pc(816) int local816 = (int) (Math.random() * (double) (this.aClass217_1.anInt6068 - this.aClass217_1.anInt6064)) + this.aClass217_1.anInt6064;
					@Pc(834) int local834 = this.aClass217_1.anInt6051 + (int) ((double) (this.aClass217_1.anInt6085 - this.aClass217_1.anInt6051) * Math.random());
					@Pc(896) int local896;
					if (this.aClass217_1.aBoolean441) {
						@Pc(900) double local900 = Math.random();
						local896 = (int) (local900 * (double) this.aClass217_1.anInt6089 + (double) this.aClass217_1.anInt6082) << 16 | (int) (local900 * (double) this.aClass217_1.anInt6046 + (double) this.aClass217_1.anInt6080) << 8 | (int) ((double) this.aClass217_1.anInt6058 + local900 * (double) this.aClass217_1.anInt6091) | (int) ((double) this.aClass217_1.anInt6047 + (double) this.aClass217_1.anInt6070 * Math.random()) << 24;
					} else {
						local896 = (int) ((double) this.aClass217_1.anInt6091 * Math.random() + (double) this.aClass217_1.anInt6058) | (int) ((double) this.aClass217_1.anInt6082 + Math.random() * (double) this.aClass217_1.anInt6089) << 16 | (int) ((double) this.aClass217_1.anInt6080 + (double) this.aClass217_1.anInt6046 * Math.random()) << 8 | (int) (Math.random() * (double) this.aClass217_1.anInt6070 + (double) this.aClass217_1.anInt6047) << 24;
					}
					@Pc(962) int local962 = this.aClass217_1.anInt6076;
					if (!arg0.method6205() && !this.aClass217_1.aBoolean442) {
						local962 = -1;
					}
					if (Static418.anInt7160 == Static57.anInt925) {
						new Class41_Sub4_Sub1_Sub1(this, local764, local773, local782, local200, local209, local218, local799, local816, local896, local834, local962, this.aClass217_1.aBoolean446, this.aClass217_1.aBoolean443);
					} else {
						@Pc(978) Class41_Sub4_Sub1_Sub1 local978 = Static578.aClass41_Sub4_Sub1_Sub1Array2[Static418.anInt7160];
						Static418.anInt7160 = Static418.anInt7160 + 1 & 0x3FF;
						local978.method3956(this, local764, local773, local782, local200, local209, local218, local799, local816, local896, local834, local962, this.aClass217_1.aBoolean446, this.aClass217_1.aBoolean443);
					}
				}
			}
		}
		if (!this.aClass105_1.method2115(this.aClass105_2)) {
			@Pc(1046) Class105 local1046 = this.aClass105_2;
			this.aClass105_2 = this.aClass105_1;
			this.aClass105_1 = local1046;
			this.aClass105_1.anInt2354 = this.aClass244_2.anInt6813;
			this.aClass105_1.anInt2346 = this.aClass244_2.anInt6812;
			this.aClass105_1.anInt2352 = this.aClass244_2.anInt6818;
			this.aClass105_1.anInt2345 = this.aClass244_2.anInt6820;
			this.aClass105_1.anInt2348 = this.aClass105_2.anInt2348;
			this.aClass105_1.anInt2349 = this.aClass244_2.anInt6810;
			this.aClass105_1.anInt2351 = this.aClass105_2.anInt2351;
			this.aClass105_1.anInt2356 = this.aClass244_2.anInt6809;
			this.aClass105_1.anInt2347 = this.aClass244_2.anInt6823;
			this.aClass105_1.anInt2344 = this.aClass244_2.anInt6807;
			this.aClass105_1.anInt2355 = this.aClass244_2.anInt6811;
			this.aClass105_1.anInt2350 = this.aClass105_2.anInt2350;
		}
		this.anInt7158 = 0;
		for (@Pc(1134) Class41_Sub4_Sub1_Sub1 local1134 = (Class41_Sub4_Sub1_Sub1) this.aClass102_4.method2062(); local1134 != null; local1134 = (Class41_Sub4_Sub1_Sub1) this.aClass102_4.method2054()) {
			local1134.method3958(arg1, arg2);
			this.anInt7158++;
		}
		Static512.anInt8632 += this.anInt7158;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	public void method6169() {
		this.aClass105_1.anInt2352 = this.aClass244_2.anInt6818;
		this.aClass105_1.anInt2349 = this.aClass244_2.anInt6810;
		this.aClass105_1.anInt2356 = this.aClass244_2.anInt6809;
		this.aClass105_1.anInt2345 = this.aClass244_2.anInt6820;
		this.aClass105_1.anInt2347 = this.aClass244_2.anInt6823;
		this.aClass105_1.anInt2346 = this.aClass244_2.anInt6812;
		this.aClass105_1.anInt2355 = this.aClass244_2.anInt6811;
		this.aClass105_1.anInt2354 = this.aClass244_2.anInt6813;
		this.aClass105_1.anInt2344 = this.aClass244_2.anInt6807;
		if (this.aClass105_1.anInt2352 == this.aClass105_1.anInt2346 && this.aClass105_1.anInt2344 == this.aClass105_1.anInt2346 && this.aClass105_1.anInt2355 == this.aClass105_1.anInt2347 && this.aClass105_1.anInt2349 == this.aClass105_1.anInt2355 && this.aClass105_1.anInt2345 == this.aClass105_1.anInt2356 && this.aClass105_1.anInt2356 == this.aClass105_1.anInt2354) {
			this.aBoolean513 = true;
		} else if (this.aBoolean513) {
			this.aBoolean513 = false;
			this.aClass105_2.anInt2356 = this.aClass105_1.anInt2356;
			this.aClass105_2.anInt2354 = this.aClass105_1.anInt2354;
			this.aClass105_2.anInt2355 = this.aClass105_1.anInt2355;
			this.aClass105_2.anInt2352 = this.aClass105_1.anInt2352;
			this.aClass105_2.anInt2349 = this.aClass105_1.anInt2349;
			this.aClass105_2.anInt2346 = this.aClass105_1.anInt2346;
			this.aClass105_2.anInt2344 = this.aClass105_1.anInt2344;
			this.aClass105_2.anInt2347 = this.aClass105_1.anInt2347;
			this.aClass105_2.anInt2345 = this.aClass105_1.anInt2345;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BLclient!ha;J)V")
	public void method6170(@OriginalArg(1) Class143 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(5) Class41_Sub4_Sub1_Sub1 local5 = (Class41_Sub4_Sub1_Sub1) this.aClass102_4.method2062(); local5 != null; local5 = (Class41_Sub4_Sub1_Sub1) this.aClass102_4.method2054()) {
			local5.method3960(arg0, arg1);
		}
	}
}
