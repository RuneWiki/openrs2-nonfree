import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
	private int anInt6814;

	@OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
	private int anInt6815;

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
	private int anInt6816;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
	private int anInt6817;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	private int anInt6818;

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
	private int anInt6819;

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	private int anInt6820;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	private int anInt6806 = 0;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "Lclient!uw;")
	public Class369 aClass369_1 = new Class369();

	@OriginalMember(owner = "client!ms", name = "H", descriptor = "Lclient!uw;")
	private Class369 aClass369_2 = new Class369();

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Z")
	private boolean aBoolean486 = false;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!ui;")
	public final Class4_Sub8 aClass4_Sub8_7;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "Lclient!tm;")
	public final Class352 aClass352_1;

	@OriginalMember(owner = "client!ms", name = "C", descriptor = "J")
	private final long aLong180;

	@OriginalMember(owner = "client!ms", name = "E", descriptor = "Lclient!waa;")
	public Class385 aClass385_1;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!pda;")
	public final Class283 aClass283_8;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!ha;Lclient!tm;Lclient!ui;J)V")
	public Class4_Sub6(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) Class4_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass4_Sub8_7 = arg2;
		this.aClass352_1 = arg1;
		this.aLong180 = arg3;
		this.aClass385_1 = this.aClass352_1.method8403();
		if (!arg0.method6972() && this.aClass385_1.anInt10810 != -1) {
			this.aClass385_1 = Static194.method2929(this.aClass385_1.anInt10810);
		}
		this.aClass283_8 = new Class283();
		this.anInt6806 = (int) ((double) this.anInt6806 + Math.random() * 64.0D);
		this.method5934();
		this.aClass369_2.anInt10379 = this.aClass369_1.anInt10379;
		this.aClass369_2.anInt10385 = this.aClass369_1.anInt10385;
		this.aClass369_2.anInt10381 = this.aClass369_1.anInt10381;
		this.aClass369_2.anInt10378 = this.aClass369_1.anInt10378;
		this.aClass369_2.anInt10386 = this.aClass369_1.anInt10386;
		this.aClass369_2.anInt10376 = this.aClass369_1.anInt10376;
		this.aClass369_2.anInt10388 = this.aClass369_1.anInt10388;
		this.aClass369_2.anInt10382 = this.aClass369_1.anInt10382;
		this.aClass369_2.anInt10375 = this.aClass369_1.anInt10375;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public void method5934() {
		this.aClass369_1.anInt10382 = this.aClass352_1.anInt9766;
		this.aClass369_1.anInt10385 = this.aClass352_1.anInt9775;
		this.aClass369_1.anInt10379 = this.aClass352_1.anInt9778;
		this.aClass369_1.anInt10381 = this.aClass352_1.anInt9777;
		this.aClass369_1.anInt10378 = this.aClass352_1.anInt9768;
		this.aClass369_1.anInt10375 = this.aClass352_1.anInt9776;
		this.aClass369_1.anInt10386 = this.aClass352_1.anInt9780;
		this.aClass369_1.anInt10376 = this.aClass352_1.anInt9774;
		this.aClass369_1.anInt10388 = this.aClass352_1.anInt9769;
		if (this.aClass369_1.anInt10376 == this.aClass369_1.anInt10386 && this.aClass369_1.anInt10382 == this.aClass369_1.anInt10386 && this.aClass369_1.anInt10388 == this.aClass369_1.anInt10379 && this.aClass369_1.anInt10378 == this.aClass369_1.anInt10379 && this.aClass369_1.anInt10385 == this.aClass369_1.anInt10375 && this.aClass369_1.anInt10385 == this.aClass369_1.anInt10381) {
			this.aBoolean486 = true;
		} else if (this.aBoolean486) {
			this.aClass369_2.anInt10388 = this.aClass369_1.anInt10388;
			this.aBoolean486 = false;
			this.aClass369_2.anInt10385 = this.aClass369_1.anInt10385;
			this.aClass369_2.anInt10375 = this.aClass369_1.anInt10375;
			this.aClass369_2.anInt10376 = this.aClass369_1.anInt10376;
			this.aClass369_2.anInt10381 = this.aClass369_1.anInt10381;
			this.aClass369_2.anInt10379 = this.aClass369_1.anInt10379;
			this.aClass369_2.anInt10382 = this.aClass369_1.anInt10382;
			this.aClass369_2.anInt10378 = this.aClass369_1.anInt10378;
			this.aClass369_2.anInt10386 = this.aClass369_1.anInt10386;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZIJILclient!ha;)V")
	public void method5940(@OriginalArg(0) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class144 arg3) {
		@Pc(54) int local54;
		if (this.aBoolean485) {
			arg0 = false;
		} else if (this.aClass385_1.anInt10842 > Static173.anInt2826) {
			arg0 = false;
		} else if (Static323.anInt5614 > Static115.anIntArray108[Static173.anInt2826]) {
			arg0 = false;
		} else if (this.aBoolean486) {
			arg0 = false;
		} else if (this.aClass385_1.anInt10808 != -1) {
			local54 = (int) (arg1 - this.aLong180);
			if (this.aClass385_1.aBoolean749 || this.aClass385_1.anInt10808 >= local54) {
				local54 %= this.aClass385_1.anInt10808;
			} else {
				arg0 = false;
			}
			if (!this.aClass385_1.aBoolean751 && local54 < this.aClass385_1.anInt10818) {
				arg0 = false;
			}
			if (this.aClass385_1.aBoolean751 && local54 >= this.aClass385_1.anInt10818) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static620.anInt10185++;
			local54 = (this.aClass369_1.anInt10382 + this.aClass369_1.anInt10386 + this.aClass369_1.anInt10376) / 3;
			@Pc(147) int local147 = (this.aClass369_1.anInt10378 + this.aClass369_1.anInt10379 + this.aClass369_1.anInt10388) / 3;
			@Pc(161) int local161 = (this.aClass369_1.anInt10381 + this.aClass369_1.anInt10375 + this.aClass369_1.anInt10385) / 3;
			@Pc(205) int local205;
			@Pc(214) int local214;
			@Pc(223) int local223;
			@Pc(231) int local231;
			@Pc(239) int local239;
			@Pc(248) int local248;
			@Pc(356) int local356;
			@Pc(408) int local408;
			@Pc(429) int local429;
			if (this.aClass369_1.anInt10384 != local54 || this.aClass369_1.anInt10387 != local147 || local161 != this.aClass369_1.anInt10377) {
				this.aClass369_1.anInt10384 = local54;
				this.aClass369_1.anInt10387 = local147;
				this.aClass369_1.anInt10377 = local161;
				local205 = this.aClass369_1.anInt10386 - this.aClass369_1.anInt10376;
				local214 = this.aClass369_1.anInt10379 - this.aClass369_1.anInt10388;
				local223 = this.aClass369_1.anInt10385 - this.aClass369_1.anInt10375;
				local231 = this.aClass369_1.anInt10382 - this.aClass369_1.anInt10376;
				local239 = this.aClass369_1.anInt10378 - this.aClass369_1.anInt10388;
				local248 = this.aClass369_1.anInt10381 - this.aClass369_1.anInt10375;
				this.anInt6815 = local248 * local214 - local239 * local223;
				this.anInt6819 = local231 * local223 - local248 * local205;
				this.anInt6816 = local205 * local239 - local231 * local214;
				while (true) {
					if (this.anInt6815 <= 32767 && this.anInt6819 <= 32767 && this.anInt6816 <= 32767 && this.anInt6815 >= -32767 && this.anInt6819 >= -32767 && this.anInt6816 >= -32767) {
						local356 = (int) Math.sqrt((double) (this.anInt6816 * this.anInt6816 + this.anInt6819 * this.anInt6819 + this.anInt6815 * this.anInt6815));
						if (local356 <= 0) {
							local356 = 1;
						}
						this.anInt6819 = this.anInt6819 * 32767 / local356;
						this.anInt6815 = this.anInt6815 * 32767 / local356;
						this.anInt6816 = this.anInt6816 * 32767 / local356;
						if (this.aClass385_1.aShort116 > 0 || this.aClass385_1.lb > 0) {
							local408 = (int) (Math.atan2((double) this.anInt6816, (double) this.anInt6815) * 2607.5945876176133D);
							local429 = (int) (Math.atan2((double) this.anInt6819, Math.sqrt((double) (this.anInt6816 * this.anInt6816 + this.anInt6815 * this.anInt6815))) * 2607.5945876176133D);
							this.anInt6820 = this.aClass385_1.aShort116 - this.aClass385_1.aShort117;
							this.anInt6817 = this.aClass385_1.aShort117 + local408 - (this.anInt6820 >> 1);
							this.anInt6818 = this.aClass385_1.lb - this.aClass385_1.aShort118;
							this.anInt6814 = local429 + this.aClass385_1.aShort118 - (this.anInt6818 >> 1);
						}
						break;
					}
					this.anInt6816 >>= 0x1;
					this.anInt6815 >>= 0x1;
					this.anInt6819 >>= 0x1;
				}
			}
			this.anInt6806 += (int) ((double) arg2 * ((double) (this.aClass385_1.anInt10809 - this.aClass385_1.anInt10850) * Math.random() + (double) this.aClass385_1.anInt10850));
			if (this.anInt6806 > 63) {
				local205 = this.anInt6806 >> 6;
				this.anInt6806 &= 0x3F;
				for (local239 = 0; local239 < local205; local239++) {
					@Pc(584) int local584;
					@Pc(588) int local588;
					if (this.aClass385_1.aShort116 <= 0 && this.aClass385_1.lb <= 0) {
						local214 = this.anInt6815;
						local223 = this.anInt6819;
						local231 = this.anInt6816;
					} else {
						local248 = this.anInt6817 + (int) ((double) this.anInt6820 * Math.random());
						local248 &= 0x3FFF;
						local356 = Class141.anIntArray207[local248];
						local408 = Class141.anIntArray208[local248];
						local429 = this.anInt6814 + (int) (Math.random() * (double) this.anInt6818);
						local429 &= 0x1FFF;
						local584 = Class141.anIntArray207[local429];
						local588 = Class141.anIntArray208[local429];
						local223 = (local588 << 1) * -1;
						local214 = local408 * local584 >> 13;
						local231 = local356 * local584 >> 13;
					}
					@Pc(611) float local611 = (float) Math.random();
					@Pc(614) float local614 = (float) Math.random();
					if (local611 + local614 > 1.0F) {
						local611 = 1.0F - local611;
						local614 = 1.0F - local614;
					}
					@Pc(635) float local635 = 1.0F - local611 - local614;
					local429 = (int) (local635 * (float) this.aClass369_1.anInt10382 + (float) this.aClass369_1.anInt10376 * local611 + (float) this.aClass369_1.anInt10386 * local614);
					local584 = (int) ((float) this.aClass369_1.anInt10378 * local635 + local611 * (float) this.aClass369_1.anInt10388 + local614 * (float) this.aClass369_1.anInt10379);
					local588 = (int) (local635 * (float) this.aClass369_1.anInt10381 + (float) this.aClass369_1.anInt10375 * local611 + local614 * (float) this.aClass369_1.anInt10385);
					@Pc(723) int local723 = (int) (local635 * (float) this.aClass369_2.anInt10382 + local611 * (float) this.aClass369_2.anInt10376 + (float) this.aClass369_2.anInt10386 * local614);
					@Pc(745) int local745 = (int) (local614 * (float) this.aClass369_2.anInt10379 + local611 * (float) this.aClass369_2.anInt10388 + local635 * (float) this.aClass369_2.anInt10378);
					@Pc(767) int local767 = (int) (local635 * (float) this.aClass369_2.anInt10381 + (float) this.aClass369_2.anInt10385 * local614 + local611 * (float) this.aClass369_2.anInt10375);
					@Pc(772) int local772 = local429 - local723;
					@Pc(777) int local777 = local584 - local745;
					@Pc(782) int local782 = local588 - local767;
					@Pc(791) int local791 = (int) (Math.random() * (double) local772 + (double) local723);
					@Pc(800) int local800 = (int) ((double) local777 * Math.random() + (double) local745);
					@Pc(809) int local809 = (int) ((double) local767 + (double) local782 * Math.random());
					@Pc(827) int local827 = this.aClass385_1.anInt10857 + (int) ((double) (this.aClass385_1.anInt10854 - this.aClass385_1.anInt10857) * Math.random());
					@Pc(843) int local843 = this.aClass385_1.anInt10834 + (int) ((double) (this.aClass385_1.anInt10821 - this.aClass385_1.anInt10834) * Math.random());
					@Pc(861) int local861 = this.aClass385_1.anInt10815 + (int) ((double) (this.aClass385_1.anInt10829 - this.aClass385_1.anInt10815) * Math.random());
					@Pc(923) int local923;
					if (this.aClass385_1.aBoolean755) {
						@Pc(927) double local927 = Math.random();
						local923 = (int) ((double) this.aClass385_1.anInt10855 * local927 + (double) this.aClass385_1.anInt10837) << 8 | (int) (local927 * (double) this.aClass385_1.anInt10847 + (double) this.aClass385_1.anInt10823) << 16 | (int) ((double) this.aClass385_1.anInt10828 + local927 * (double) this.aClass385_1.anInt10816) | (int) ((double) this.aClass385_1.anInt10841 * Math.random() + (double) this.aClass385_1.anInt10856) << 24;
					} else {
						local923 = (int) (Math.random() * (double) this.aClass385_1.anInt10855 + (double) this.aClass385_1.anInt10837) << 8 | (int) (Math.random() * (double) this.aClass385_1.anInt10847 + (double) this.aClass385_1.anInt10823) << 16 | (int) (Math.random() * (double) this.aClass385_1.anInt10816 + (double) this.aClass385_1.anInt10828) | (int) ((double) this.aClass385_1.anInt10841 * Math.random() + (double) this.aClass385_1.anInt10856) << 24;
					}
					@Pc(989) int local989 = this.aClass385_1.anInt10824;
					if (!arg3.method6972() && !this.aClass385_1.aBoolean752) {
						local989 = -1;
					}
					if (Static297.anInt5329 == Static149.anInt2318) {
						new Class4_Sub4_Sub1_Sub1(this, local791, local800, local809, local214, local223, local231, local827, local843, local923, local861, local989, this.aClass385_1.aBoolean753, this.aClass385_1.aBoolean750);
					} else {
						@Pc(1007) Class4_Sub4_Sub1_Sub1 local1007 = Static34.aClass4_Sub4_Sub1_Sub1Array1[Static149.anInt2318];
						Static149.anInt2318 = Static149.anInt2318 + 1 & 0x3FF;
						local1007.method8330(this, local791, local800, local809, local214, local223, local231, local827, local843, local923, local861, local989, this.aClass385_1.aBoolean753, this.aClass385_1.aBoolean750);
					}
				}
			}
		}
		if (!this.aClass369_1.method8882(this.aClass369_2)) {
			@Pc(1077) Class369 local1077 = this.aClass369_2;
			this.aClass369_2 = this.aClass369_1;
			this.aClass369_1 = local1077;
			this.aClass369_1.anInt10375 = this.aClass352_1.anInt9776;
			this.aClass369_1.anInt10379 = this.aClass352_1.anInt9778;
			this.aClass369_1.anInt10376 = this.aClass352_1.anInt9774;
			this.aClass369_1.anInt10385 = this.aClass352_1.anInt9775;
			this.aClass369_1.anInt10386 = this.aClass352_1.anInt9780;
			this.aClass369_1.anInt10388 = this.aClass352_1.anInt9769;
			this.aClass369_1.anInt10382 = this.aClass352_1.anInt9766;
			this.aClass369_1.anInt10387 = this.aClass369_2.anInt10387;
			this.aClass369_1.anInt10381 = this.aClass352_1.anInt9777;
			this.aClass369_1.anInt10378 = this.aClass352_1.anInt9768;
			this.aClass369_1.anInt10384 = this.aClass369_2.anInt10384;
			this.aClass369_1.anInt10377 = this.aClass369_2.anInt10377;
		}
		this.anInt6807 = 0;
		for (@Pc(1170) Class4_Sub4_Sub1_Sub1 local1170 = (Class4_Sub4_Sub1_Sub1) this.aClass283_8.method6791(); local1170 != null; local1170 = (Class4_Sub4_Sub1_Sub1) this.aClass283_8.method6792()) {
			local1170.method8329(arg1, arg2);
			this.anInt6807++;
		}
		Static479.anInt8315 += this.anInt6807;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ha;JI)V")
	public void method5941(@OriginalArg(0) Class144 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(14) Class4_Sub4_Sub1_Sub1 local14 = (Class4_Sub4_Sub1_Sub1) this.aClass283_8.method6791(); local14 != null; local14 = (Class4_Sub4_Sub1_Sub1) this.aClass283_8.method6792()) {
			local14.method8327(arg0, arg1);
		}
	}
}
