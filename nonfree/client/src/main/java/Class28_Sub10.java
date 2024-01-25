import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class28_Sub10 extends Class28 {

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
	public int anInt10851;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
	private int anInt10856;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
	private int anInt10857;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
	private int anInt10858;

	@OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
	private int anInt10859;

	@OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
	private int anInt10860;

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
	private int anInt10861;

	@OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
	private int anInt10862;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	private int anInt10847 = 0;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "Z")
	public boolean aBoolean921 = false;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "Lclient!dh;")
	public Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "Lclient!dh;")
	private Class83 aClass83_2 = new Class83();

	@OriginalMember(owner = "client!wt", name = "B", descriptor = "Z")
	private boolean aBoolean922 = false;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Lclient!sba;")
	public final Class313 aClass313_2;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!nia;")
	public final Class28_Sub5 aClass28_Sub5_8;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "J")
	private final long aLong306;

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "Lclient!vb;")
	public Class361 aClass361_1;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "Lclient!hv;")
	public final Class156 aClass156_10;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ha;Lclient!sba;Lclient!nia;J)V")
	public Class28_Sub10(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) Class28_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass313_2 = arg1;
		this.aClass28_Sub5_8 = arg2;
		this.aLong306 = arg3;
		this.aClass361_1 = this.aClass313_2.method7464();
		if (!arg0.method6887() && this.aClass361_1.anInt10126 != -1) {
			this.aClass361_1 = Static1.method8274(this.aClass361_1.anInt10126);
		}
		this.aClass156_10 = new Class156();
		this.anInt10847 = (int) ((double) this.anInt10847 + Math.random() * 64.0D);
		this.method9026();
		this.aClass83_2.anInt2270 = this.aClass83_1.anInt2270;
		this.aClass83_2.anInt2276 = this.aClass83_1.anInt2276;
		this.aClass83_2.anInt2274 = this.aClass83_1.anInt2274;
		this.aClass83_2.anInt2271 = this.aClass83_1.anInt2271;
		this.aClass83_2.anInt2269 = this.aClass83_1.anInt2269;
		this.aClass83_2.anInt2282 = this.aClass83_1.anInt2282;
		this.aClass83_2.anInt2278 = this.aClass83_1.anInt2278;
		this.aClass83_2.anInt2272 = this.aClass83_1.anInt2272;
		this.aClass83_2.anInt2281 = this.aClass83_1.anInt2281;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	public void method9026() {
		this.aClass83_1.anInt2276 = this.aClass313_2.anInt8790;
		this.aClass83_1.anInt2269 = this.aClass313_2.anInt8783;
		this.aClass83_1.anInt2271 = this.aClass313_2.anInt8789;
		this.aClass83_1.anInt2281 = this.aClass313_2.anInt8778;
		this.aClass83_1.anInt2282 = this.aClass313_2.anInt8784;
		this.aClass83_1.anInt2270 = this.aClass313_2.anInt8779;
		this.aClass83_1.anInt2272 = this.aClass313_2.anInt8788;
		this.aClass83_1.anInt2274 = this.aClass313_2.anInt8777;
		this.aClass83_1.anInt2278 = this.aClass313_2.anInt8780;
		if (this.aClass83_1.anInt2272 == this.aClass83_1.anInt2281 && this.aClass83_1.anInt2282 == this.aClass83_1.anInt2272 && this.aClass83_1.anInt2276 == this.aClass83_1.anInt2274 && this.aClass83_1.anInt2274 == this.aClass83_1.anInt2271 && this.aClass83_1.anInt2270 == this.aClass83_1.anInt2269 && this.aClass83_1.anInt2278 == this.aClass83_1.anInt2269) {
			this.aBoolean922 = true;
		} else if (this.aBoolean922) {
			this.aClass83_2.anInt2269 = this.aClass83_1.anInt2269;
			this.aClass83_2.anInt2270 = this.aClass83_1.anInt2270;
			this.aBoolean922 = false;
			this.aClass83_2.anInt2274 = this.aClass83_1.anInt2274;
			this.aClass83_2.anInt2271 = this.aClass83_1.anInt2271;
			this.aClass83_2.anInt2272 = this.aClass83_1.anInt2272;
			this.aClass83_2.anInt2276 = this.aClass83_1.anInt2276;
			this.aClass83_2.anInt2278 = this.aClass83_1.anInt2278;
			this.aClass83_2.anInt2282 = this.aClass83_1.anInt2282;
			this.aClass83_2.anInt2281 = this.aClass83_1.anInt2281;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIIJLclient!ha;)V")
	public void method9028(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class65 arg3) {
		@Pc(41) int local41;
		if (this.aBoolean921) {
			arg0 = false;
		} else if (this.aClass361_1.anInt10129 > Static537.anInt3990) {
			arg0 = false;
		} else if (Static48.anInt9831 > Static611.anIntArray551[Static537.anInt3990]) {
			arg0 = false;
		} else if (this.aBoolean922) {
			arg0 = false;
		} else if (this.aClass361_1.anInt10151 != -1) {
			local41 = (int) (arg2 - this.aLong306);
			if (this.aClass361_1.aBoolean859 || local41 <= this.aClass361_1.anInt10151) {
				local41 %= this.aClass361_1.anInt10151;
			} else {
				arg0 = false;
			}
			if (!this.aClass361_1.aBoolean861 && this.aClass361_1.anInt10130 > local41) {
				arg0 = false;
			}
			if (this.aClass361_1.aBoolean861 && local41 >= this.aClass361_1.anInt10130) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static496.anInt8307++;
			local41 = (this.aClass83_1.anInt2282 + this.aClass83_1.anInt2272 + this.aClass83_1.anInt2281) / 3;
			@Pc(136) int local136 = (this.aClass83_1.anInt2271 + this.aClass83_1.anInt2276 + this.aClass83_1.anInt2274) / 3;
			@Pc(150) int local150 = (this.aClass83_1.anInt2270 + this.aClass83_1.anInt2269 + this.aClass83_1.anInt2278) / 3;
			@Pc(186) int local186;
			@Pc(194) int local194;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(221) int local221;
			@Pc(230) int local230;
			@Pc(329) int local329;
			@Pc(382) int local382;
			@Pc(403) int local403;
			if (local41 != this.aClass83_1.anInt2284 || this.aClass83_1.anInt2283 != local136 || local150 != this.aClass83_1.anInt2268) {
				this.aClass83_1.anInt2268 = local150;
				this.aClass83_1.anInt2283 = local136;
				this.aClass83_1.anInt2284 = local41;
				local186 = this.aClass83_1.anInt2272 - this.aClass83_1.anInt2281;
				local194 = this.aClass83_1.anInt2274 - this.aClass83_1.anInt2276;
				local203 = this.aClass83_1.anInt2269 - this.aClass83_1.anInt2270;
				local212 = this.aClass83_1.anInt2282 - this.aClass83_1.anInt2281;
				local221 = this.aClass83_1.anInt2271 - this.aClass83_1.anInt2276;
				local230 = this.aClass83_1.anInt2278 - this.aClass83_1.anInt2270;
				this.anInt10862 = local203 * local212 - local186 * local230;
				this.anInt10861 = local186 * local221 - local194 * local212;
				this.anInt10856 = local230 * local194 - local221 * local203;
				while (true) {
					if (this.anInt10856 <= 32767 && this.anInt10862 <= 32767 && this.anInt10861 <= 32767 && this.anInt10856 >= -32767 && this.anInt10862 >= -32767 && this.anInt10861 >= -32767) {
						local329 = (int) Math.sqrt((double) (this.anInt10861 * this.anInt10861 + this.anInt10856 * this.anInt10856 + this.anInt10862 * this.anInt10862));
						if (local329 <= 0) {
							local329 = 1;
						}
						this.anInt10862 = this.anInt10862 * 32767 / local329;
						this.anInt10861 = this.anInt10861 * 32767 / local329;
						this.anInt10856 = this.anInt10856 * 32767 / local329;
						if (this.aClass361_1.aShort108 > 0 || this.aClass361_1.aShort109 > 0) {
							local382 = (int) (Math.atan2((double) this.anInt10861, (double) this.anInt10856) * 2607.5945876176133D);
							local403 = (int) (Math.atan2((double) this.anInt10862, Math.sqrt((double) (this.anInt10861 * this.anInt10861 + this.anInt10856 * this.anInt10856))) * 2607.5945876176133D);
							this.anInt10857 = this.aClass361_1.aShort108 - this.aClass361_1.aShort110;
							this.anInt10860 = this.aClass361_1.aShort109 - this.aClass361_1.lb;
							this.anInt10858 = local382 + this.aClass361_1.aShort110 - (this.anInt10857 >> 1);
							this.anInt10859 = this.aClass361_1.lb + local403 - (this.anInt10860 >> 1);
						}
						break;
					}
					this.anInt10861 >>= 0x1;
					this.anInt10862 >>= 0x1;
					this.anInt10856 >>= 0x1;
				}
			}
			this.anInt10847 += (int) ((double) arg1 * ((double) this.aClass361_1.anInt10162 + Math.random() * (double) (this.aClass361_1.anInt10154 - this.aClass361_1.anInt10162)));
			if (this.anInt10847 > 63) {
				local186 = this.anInt10847 >> 6;
				this.anInt10847 &= 0x3F;
				for (local221 = 0; local221 < local186; local221++) {
					@Pc(556) int local556;
					@Pc(560) int local560;
					if (this.aClass361_1.aShort108 <= 0 && this.aClass361_1.aShort109 <= 0) {
						local194 = this.anInt10856;
						local203 = this.anInt10862;
						local212 = this.anInt10861;
					} else {
						local230 = (int) (Math.random() * (double) this.anInt10857) + this.anInt10858;
						local230 &= 0x3FFF;
						local329 = Class200.anIntArray337[local230];
						local382 = Class200.anIntArray338[local230];
						local403 = (int) (Math.random() * (double) this.anInt10860) + this.anInt10859;
						local403 &= 0x1FFF;
						local556 = Class200.anIntArray337[local403];
						local560 = Class200.anIntArray338[local403];
						local203 = (local560 << 1) * -1;
						local194 = local556 * local382 >> 13;
						local212 = local556 * local329 >> 13;
					}
					@Pc(583) float local583 = (float) Math.random();
					@Pc(586) float local586 = (float) Math.random();
					if (local586 + local583 > 1.0F) {
						local586 = 1.0F - local586;
						local583 = 1.0F - local583;
					}
					@Pc(607) float local607 = 1.0F - local586 - local583;
					local403 = (int) ((float) this.aClass83_1.anInt2282 * local607 + local586 * (float) this.aClass83_1.anInt2272 + (float) this.aClass83_1.anInt2281 * local583);
					local556 = (int) ((float) this.aClass83_1.anInt2276 * local583 + local586 * (float) this.aClass83_1.anInt2274 + local607 * (float) this.aClass83_1.anInt2271);
					local560 = (int) (local607 * (float) this.aClass83_1.anInt2278 + local583 * (float) this.aClass83_1.anInt2270 + (float) this.aClass83_1.anInt2269 * local586);
					@Pc(695) int local695 = (int) ((float) this.aClass83_2.anInt2282 * local607 + local583 * (float) this.aClass83_2.anInt2281 + local586 * (float) this.aClass83_2.anInt2272);
					@Pc(717) int local717 = (int) (local607 * (float) this.aClass83_2.anInt2271 + (float) this.aClass83_2.anInt2276 * local583 + (float) this.aClass83_2.anInt2274 * local586);
					@Pc(739) int local739 = (int) ((float) this.aClass83_2.anInt2270 * local583 + (float) this.aClass83_2.anInt2269 * local586 + local607 * (float) this.aClass83_2.anInt2278);
					@Pc(744) int local744 = local403 - local695;
					@Pc(749) int local749 = local556 - local717;
					@Pc(754) int local754 = local560 - local739;
					@Pc(763) int local763 = (int) ((double) local695 + Math.random() * (double) local744);
					@Pc(772) int local772 = (int) (Math.random() * (double) local749 + (double) local717);
					@Pc(781) int local781 = (int) ((double) local739 + (double) local754 * Math.random());
					@Pc(799) int local799 = this.aClass361_1.anInt10133 + (int) (Math.random() * (double) (this.aClass361_1.anInt10127 - this.aClass361_1.anInt10133));
					@Pc(816) int local816 = this.aClass361_1.anInt10131 + (int) (Math.random() * (double) (this.aClass361_1.anInt10132 - this.aClass361_1.anInt10131));
					@Pc(832) int local832 = this.aClass361_1.anInt10123 + (int) ((double) (this.aClass361_1.anInt10147 - this.aClass361_1.anInt10123) * Math.random());
					@Pc(894) int local894;
					if (this.aClass361_1.aBoolean864) {
						@Pc(898) double local898 = Math.random();
						local894 = (int) (local898 * (double) this.aClass361_1.anInt10119 + (double) this.aClass361_1.anInt10145) << 8 | (int) ((double) this.aClass361_1.anInt10155 + local898 * (double) this.aClass361_1.anInt10124) << 16 | (int) (local898 * (double) this.aClass361_1.anInt10146 + (double) this.aClass361_1.anInt10157) | (int) ((double) this.aClass361_1.anInt10163 + Math.random() * (double) this.aClass361_1.anInt10140) << 24;
					} else {
						local894 = (int) ((double) this.aClass361_1.anInt10157 + (double) this.aClass361_1.anInt10146 * Math.random()) | (int) ((double) this.aClass361_1.anInt10119 * Math.random() + (double) this.aClass361_1.anInt10145) << 8 | (int) ((double) this.aClass361_1.anInt10124 * Math.random() + (double) this.aClass361_1.anInt10155) << 16 | (int) ((double) this.aClass361_1.anInt10163 + (double) this.aClass361_1.anInt10140 * Math.random()) << 24;
					}
					@Pc(960) int local960 = this.aClass361_1.anInt10112;
					if (!arg3.method6887() && !this.aClass361_1.aBoolean867) {
						local960 = -1;
					}
					if (Static162.anInt3301 == Static102.anInt2210) {
						new Class28_Sub3_Sub1_Sub1(this, local763, local772, local781, local194, local203, local212, local799, local816, local894, local832, local960, this.aClass361_1.aBoolean866, this.aClass361_1.aBoolean862);
					} else {
						@Pc(1004) Class28_Sub3_Sub1_Sub1 local1004 = Static133.aClass28_Sub3_Sub1_Sub1Array1[Static162.anInt3301];
						Static162.anInt3301 = Static162.anInt3301 + 1 & 0x3FF;
						local1004.method4631(this, local763, local772, local781, local194, local203, local212, local799, local816, local894, local832, local960, this.aClass361_1.aBoolean866, this.aClass361_1.aBoolean862);
					}
				}
			}
		}
		if (!this.aClass83_1.method2041(this.aClass83_2)) {
			@Pc(1044) Class83 local1044 = this.aClass83_2;
			this.aClass83_2 = this.aClass83_1;
			this.aClass83_1 = local1044;
			this.aClass83_1.anInt2270 = this.aClass313_2.anInt8779;
			this.aClass83_1.anInt2276 = this.aClass313_2.anInt8790;
			this.aClass83_1.anInt2269 = this.aClass313_2.anInt8783;
			this.aClass83_1.anInt2281 = this.aClass313_2.anInt8778;
			this.aClass83_1.anInt2283 = this.aClass83_2.anInt2283;
			this.aClass83_1.anInt2268 = this.aClass83_2.anInt2268;
			this.aClass83_1.anInt2272 = this.aClass313_2.anInt8788;
			this.aClass83_1.anInt2271 = this.aClass313_2.anInt8789;
			this.aClass83_1.anInt2282 = this.aClass313_2.anInt8784;
			this.aClass83_1.anInt2284 = this.aClass83_2.anInt2284;
			this.aClass83_1.anInt2278 = this.aClass313_2.anInt8780;
			this.aClass83_1.anInt2274 = this.aClass313_2.anInt8777;
		}
		this.anInt10851 = 0;
		for (@Pc(1144) Class28_Sub3_Sub1_Sub1 local1144 = (Class28_Sub3_Sub1_Sub1) this.aClass156_10.method3776(); local1144 != null; local1144 = (Class28_Sub3_Sub1_Sub1) this.aClass156_10.method3783()) {
			local1144.method4630(arg2, arg1);
			this.anInt10851++;
		}
		Static23.anInt331 += this.anInt10851;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!ha;J)V")
	public void method9030(@OriginalArg(1) Class65 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(9) Class28_Sub3_Sub1_Sub1 local9 = (Class28_Sub3_Sub1_Sub1) this.aClass156_10.method3776(); local9 != null; local9 = (Class28_Sub3_Sub1_Sub1) this.aClass156_10.method3783()) {
			local9.method4633(arg0, arg1);
		}
	}
}
