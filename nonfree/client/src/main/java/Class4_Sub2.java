import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
	public int anInt917;

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
	private int anInt912 = 0;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Lclient!rk;")
	public Class317 aClass317_1 = new Class317();

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "Lclient!rk;")
	private Class317 aClass317_2 = new Class317();

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "J")
	private final long aLong37;

	@OriginalMember(owner = "client!bw", name = "B", descriptor = "Lclient!tn;")
	public final Class4_Sub9 aClass4_Sub9_1;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "Lclient!ui;")
	public final Class363 aClass363_1;

	@OriginalMember(owner = "client!bw", name = "A", descriptor = "Lclient!nka;")
	public Class254 aClass254_1;

	@OriginalMember(owner = "client!bw", name = "D", descriptor = "Lclient!wc;")
	public final Class387 aClass387_1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!ha;Lclient!ui;Lclient!tn;J)V")
	public Class4_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class4_Sub9 arg2, @OriginalArg(3) long arg3) {
		this.aLong37 = arg3;
		this.aClass4_Sub9_1 = arg2;
		this.aClass363_1 = arg1;
		this.aClass254_1 = this.aClass363_1.method8303();
		if (!arg0.method8596() && this.aClass254_1.anInt6707 != -1) {
			this.aClass254_1 = Static416.method6120(this.aClass254_1.anInt6707);
		}
		this.aClass387_1 = new Class387();
		this.anInt912 = (int) ((double) this.anInt912 + Math.random() * 64.0D);
		this.method935();
		this.aClass317_2.anInt8325 = this.aClass317_1.anInt8325;
		this.aClass317_2.anInt8321 = this.aClass317_1.anInt8321;
		this.aClass317_2.anInt8329 = this.aClass317_1.anInt8329;
		this.aClass317_2.anInt8324 = this.aClass317_1.anInt8324;
		this.aClass317_2.anInt8315 = this.aClass317_1.anInt8315;
		this.aClass317_2.anInt8319 = this.aClass317_1.anInt8319;
		this.aClass317_2.anInt8318 = this.aClass317_1.anInt8318;
		this.aClass317_2.anInt8327 = this.aClass317_1.anInt8327;
		this.aClass317_2.anInt8314 = this.aClass317_1.anInt8314;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BZJILclient!ha;)V")
	public void method934(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3) {
		@Pc(53) int local53;
		if (this.aBoolean74) {
			arg0 = false;
		} else if (Static378.anInt6342 < this.aClass254_1.anInt6675) {
			arg0 = false;
		} else if (Static86.anIntArray75[Static378.anInt6342] < Static411.anInt6962) {
			arg0 = false;
		} else if (this.aBoolean75) {
			arg0 = false;
		} else if (this.aClass254_1.anInt6700 != -1) {
			local53 = (int) (arg1 - this.aLong37);
			if (this.aClass254_1.aBoolean438 || local53 <= this.aClass254_1.anInt6700) {
				local53 %= this.aClass254_1.anInt6700;
			} else {
				arg0 = false;
			}
			if (!this.aClass254_1.aBoolean442 && this.aClass254_1.anInt6710 > local53) {
				arg0 = false;
			}
			if (this.aClass254_1.aBoolean442 && local53 >= this.aClass254_1.anInt6710) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static548.anInt8694++;
			local53 = (this.aClass317_1.anInt8329 + this.aClass317_1.anInt8318 + this.aClass317_1.anInt8314) / 3;
			@Pc(151) int local151 = (this.aClass317_1.anInt8315 + this.aClass317_1.anInt8321 + this.aClass317_1.anInt8327) / 3;
			@Pc(165) int local165 = (this.aClass317_1.anInt8325 + this.aClass317_1.anInt8319 + this.aClass317_1.anInt8324) / 3;
			@Pc(213) int local213;
			@Pc(222) int local222;
			@Pc(231) int local231;
			@Pc(240) int local240;
			@Pc(249) int local249;
			@Pc(257) int local257;
			@Pc(367) int local367;
			@Pc(419) int local419;
			@Pc(440) int local440;
			if (local53 != this.aClass317_1.anInt8317 || local151 != this.aClass317_1.anInt8326 || this.aClass317_1.anInt8316 != local165) {
				this.aClass317_1.anInt8317 = local53;
				this.aClass317_1.anInt8316 = local165;
				this.aClass317_1.anInt8326 = local151;
				local213 = this.aClass317_1.anInt8318 - this.aClass317_1.anInt8329;
				local222 = this.aClass317_1.anInt8315 - this.aClass317_1.anInt8321;
				local231 = this.aClass317_1.anInt8324 - this.aClass317_1.anInt8319;
				local240 = this.aClass317_1.anInt8314 - this.aClass317_1.anInt8329;
				local249 = this.aClass317_1.anInt8327 - this.aClass317_1.anInt8321;
				local257 = this.aClass317_1.anInt8325 - this.aClass317_1.anInt8319;
				this.anInt921 = local222 * local257 - local231 * local249;
				this.anInt924 = local249 * local213 - local222 * local240;
				this.anInt922 = local240 * local231 - local213 * local257;
				while (true) {
					if (this.anInt921 <= 32767 && this.anInt922 <= 32767 && this.anInt924 <= 32767 && this.anInt921 >= -32767 && this.anInt922 >= -32767 && this.anInt924 >= -32767) {
						local367 = (int) Math.sqrt((double) (this.anInt924 * this.anInt924 + this.anInt921 * this.anInt921 + this.anInt922 * this.anInt922));
						if (local367 <= 0) {
							local367 = 1;
						}
						this.anInt921 = this.anInt921 * 32767 / local367;
						this.anInt924 = this.anInt924 * 32767 / local367;
						this.anInt922 = this.anInt922 * 32767 / local367;
						if (this.aClass254_1.aShort70 > 0 || this.aClass254_1.aShort71 > 0) {
							local419 = (int) (Math.atan2((double) this.anInt924, (double) this.anInt921) * 2607.5945876176133D);
							local440 = (int) (Math.atan2((double) this.anInt922, Math.sqrt((double) (this.anInt921 * this.anInt921 + this.anInt924 * this.anInt924))) * 2607.5945876176133D);
							this.anInt920 = this.aClass254_1.aShort70 - this.aClass254_1.aShort69;
							this.anInt925 = this.aClass254_1.aShort71 - this.aClass254_1.aShort68;
							this.anInt923 = local419 + this.aClass254_1.aShort69 - (this.anInt920 >> 1);
							this.anInt926 = this.aClass254_1.aShort68 + local440 - (this.anInt925 >> 1);
						}
						break;
					}
					this.anInt924 >>= 0x1;
					this.anInt921 >>= 0x1;
					this.anInt922 >>= 0x1;
				}
			}
			this.anInt912 += (int) ((double) arg2 * ((double) this.aClass254_1.anInt6717 + Math.random() * (double) (this.aClass254_1.anInt6692 - this.aClass254_1.anInt6717)));
			if (this.anInt912 > 63) {
				local213 = this.anInt912 >> 6;
				this.anInt912 &= 0x3F;
				for (local249 = 0; local249 < local213; local249++) {
					@Pc(588) int local588;
					@Pc(592) int local592;
					if (this.aClass254_1.aShort70 <= 0 && this.aClass254_1.aShort71 <= 0) {
						local231 = this.anInt922;
						local240 = this.anInt924;
						local222 = this.anInt921;
					} else {
						local257 = (int) ((double) this.anInt920 * Math.random()) + this.anInt923;
						local257 &= 0x3FFF;
						local367 = Class42.anIntArray51[local257];
						local419 = Class42.anIntArray52[local257];
						local440 = this.anInt926 + (int) ((double) this.anInt925 * Math.random());
						local440 &= 0x1FFF;
						local588 = Class42.anIntArray51[local440];
						local592 = Class42.anIntArray52[local440];
						local231 = (local592 << 1) * -1;
						local222 = local588 * local419 >> 13;
						local240 = local588 * local367 >> 13;
					}
					@Pc(626) float local626 = (float) Math.random();
					@Pc(629) float local629 = (float) Math.random();
					if (local629 + local626 > 1.0F) {
						local629 = 1.0F - local629;
						local626 = 1.0F - local626;
					}
					@Pc(649) float local649 = 1.0F - local629 - local626;
					local440 = (int) ((float) this.aClass317_1.anInt8314 * local649 + (float) this.aClass317_1.anInt8318 * local629 + local626 * (float) this.aClass317_1.anInt8329);
					local588 = (int) (local626 * (float) this.aClass317_1.anInt8321 + (float) this.aClass317_1.anInt8315 * local629 + (float) this.aClass317_1.anInt8327 * local649);
					local592 = (int) ((float) this.aClass317_1.anInt8325 * local649 + (float) this.aClass317_1.anInt8319 * local626 + (float) this.aClass317_1.anInt8324 * local629);
					@Pc(737) int local737 = (int) ((float) this.aClass317_2.anInt8314 * local649 + local626 * (float) this.aClass317_2.anInt8329 + local629 * (float) this.aClass317_2.anInt8318);
					@Pc(759) int local759 = (int) ((float) this.aClass317_2.anInt8327 * local649 + (float) this.aClass317_2.anInt8315 * local629 + (float) this.aClass317_2.anInt8321 * local626);
					@Pc(781) int local781 = (int) ((float) this.aClass317_2.anInt8325 * local649 + (float) this.aClass317_2.anInt8319 * local626 + (float) this.aClass317_2.anInt8324 * local629);
					@Pc(786) int local786 = local440 - local737;
					@Pc(791) int local791 = local588 - local759;
					@Pc(796) int local796 = local592 - local781;
					@Pc(805) int local805 = (int) (Math.random() * (double) local786 + (double) local737);
					@Pc(814) int local814 = (int) (Math.random() * (double) local791 + (double) local759);
					@Pc(823) int local823 = (int) ((double) local796 * Math.random() + (double) local781);
					@Pc(839) int local839 = this.aClass254_1.anInt6694 + (int) ((double) (this.aClass254_1.anInt6711 - this.aClass254_1.anInt6694) * Math.random());
					@Pc(856) int local856 = (int) ((double) (this.aClass254_1.anInt6696 - this.aClass254_1.anInt6716) * Math.random()) + this.aClass254_1.anInt6716;
					@Pc(872) int local872 = (int) (Math.random() * (double) (this.aClass254_1.anInt6695 - this.aClass254_1.anInt6673)) + this.aClass254_1.anInt6673;
					@Pc(934) int local934;
					if (this.aClass254_1.aBoolean440) {
						@Pc(938) double local938 = Math.random();
						local934 = (int) ((double) this.aClass254_1.anInt6684 + (double) this.aClass254_1.anInt6691 * Math.random()) << 24 | (int) (local938 * (double) this.aClass254_1.anInt6677 + (double) this.aClass254_1.anInt6693) << 8 | (int) ((double) this.aClass254_1.anInt6705 + (double) this.aClass254_1.anInt6703 * local938) << 16 | (int) ((double) this.aClass254_1.anInt6718 + (double) this.aClass254_1.anInt6689 * local938);
					} else {
						local934 = (int) ((double) this.aClass254_1.anInt6684 + (double) this.aClass254_1.anInt6691 * Math.random()) << 24 | (int) (Math.random() * (double) this.aClass254_1.anInt6677 + (double) this.aClass254_1.anInt6693) << 8 | (int) ((double) this.aClass254_1.anInt6703 * Math.random() + (double) this.aClass254_1.anInt6705) << 16 | (int) ((double) this.aClass254_1.anInt6718 + Math.random() * (double) this.aClass254_1.anInt6689);
					}
					@Pc(1000) int local1000 = this.aClass254_1.anInt6721;
					if (!arg3.method8596() && !this.aClass254_1.aBoolean436) {
						local1000 = -1;
					}
					if (Static250.anInt4568 == Static582.anInt9371) {
						new Class4_Sub4_Sub1_Sub1(this, local805, local814, local823, local222, local231, local240, local839, local856, local934, local872, local1000, this.aClass254_1.aBoolean439, this.aClass254_1.aBoolean437);
					} else {
						@Pc(1042) Class4_Sub4_Sub1_Sub1 local1042 = Static342.aClass4_Sub4_Sub1_Sub1Array1[Static250.anInt4568];
						Static250.anInt4568 = Static250.anInt4568 + 1 & 0x3FF;
						local1042.method6725(this, local805, local814, local823, local222, local231, local240, local839, local856, local934, local872, local1000, this.aClass254_1.aBoolean439, this.aClass254_1.aBoolean437);
					}
				}
			}
		}
		if (!this.aClass317_1.method7143(this.aClass317_2)) {
			@Pc(1084) Class317 local1084 = this.aClass317_2;
			this.aClass317_2 = this.aClass317_1;
			this.aClass317_1 = local1084;
			this.aClass317_1.anInt8314 = this.aClass363_1.anInt9750;
			this.aClass317_1.anInt8325 = this.aClass363_1.anInt9759;
			this.aClass317_1.anInt8318 = this.aClass363_1.anInt9762;
			this.aClass317_1.anInt8316 = this.aClass317_2.anInt8316;
			this.aClass317_1.anInt8326 = this.aClass317_2.anInt8326;
			this.aClass317_1.anInt8319 = this.aClass363_1.anInt9758;
			this.aClass317_1.anInt8315 = this.aClass363_1.anInt9760;
			this.aClass317_1.anInt8321 = this.aClass363_1.anInt9751;
			this.aClass317_1.anInt8317 = this.aClass317_2.anInt8317;
			this.aClass317_1.anInt8327 = this.aClass363_1.anInt9761;
			this.aClass317_1.anInt8324 = this.aClass363_1.anInt9748;
			this.aClass317_1.anInt8329 = this.aClass363_1.anInt9755;
		}
		this.anInt917 = 0;
		for (@Pc(1172) Class4_Sub4_Sub1_Sub1 local1172 = (Class4_Sub4_Sub1_Sub1) this.aClass387_1.method9018(); local1172 != null; local1172 = (Class4_Sub4_Sub1_Sub1) this.aClass387_1.method9016()) {
			local1172.method6727(arg1, arg2);
			this.anInt917++;
		}
		Static213.anInt3732 += this.anInt917;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method935() {
		this.aClass317_1.anInt8321 = this.aClass363_1.anInt9751;
		this.aClass317_1.anInt8318 = this.aClass363_1.anInt9762;
		this.aClass317_1.anInt8319 = this.aClass363_1.anInt9758;
		this.aClass317_1.anInt8315 = this.aClass363_1.anInt9760;
		this.aClass317_1.anInt8324 = this.aClass363_1.anInt9748;
		this.aClass317_1.anInt8325 = this.aClass363_1.anInt9759;
		this.aClass317_1.anInt8314 = this.aClass363_1.anInt9750;
		this.aClass317_1.anInt8329 = this.aClass363_1.anInt9755;
		this.aClass317_1.anInt8327 = this.aClass363_1.anInt9761;
		if (this.aClass317_1.anInt8318 == this.aClass317_1.anInt8329 && this.aClass317_1.anInt8318 == this.aClass317_1.anInt8314 && this.aClass317_1.anInt8321 == this.aClass317_1.anInt8315 && this.aClass317_1.anInt8327 == this.aClass317_1.anInt8315 && this.aClass317_1.anInt8319 == this.aClass317_1.anInt8324 && this.aClass317_1.anInt8325 == this.aClass317_1.anInt8324) {
			this.aBoolean75 = true;
		} else if (this.aBoolean75) {
			this.aClass317_2.anInt8321 = this.aClass317_1.anInt8321;
			this.aBoolean75 = false;
			this.aClass317_2.anInt8329 = this.aClass317_1.anInt8329;
			this.aClass317_2.anInt8314 = this.aClass317_1.anInt8314;
			this.aClass317_2.anInt8324 = this.aClass317_1.anInt8324;
			this.aClass317_2.anInt8318 = this.aClass317_1.anInt8318;
			this.aClass317_2.anInt8319 = this.aClass317_1.anInt8319;
			this.aClass317_2.anInt8315 = this.aClass317_1.anInt8315;
			this.aClass317_2.anInt8327 = this.aClass317_1.anInt8327;
			this.aClass317_2.anInt8325 = this.aClass317_1.anInt8325;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(JZLclient!ha;)V")
	public void method937(@OriginalArg(0) long arg0, @OriginalArg(2) Class100 arg1) {
		for (@Pc(12) Class4_Sub4_Sub1_Sub1 local12 = (Class4_Sub4_Sub1_Sub1) this.aClass387_1.method9018(); local12 != null; local12 = (Class4_Sub4_Sub1_Sub1) this.aClass387_1.method9016()) {
			local12.method6723(arg1, arg0);
		}
	}
}
