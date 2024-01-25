import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class30_Sub8 extends Class30 {

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
	private int anInt7375;

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
	public int anInt7376;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
	private int anInt7377;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
	private int anInt7378;

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
	private int anInt7379;

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
	private int anInt7380;

	@OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
	private int anInt7382;

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
	private int anInt7383;

	@OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
	public int anInt7384;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
	private int anInt7385;

	@OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
	private int anInt7386;

	@OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
	private int anInt7387;

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
	private int anInt7388;

	@OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
	private int anInt7389;

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
	private int anInt7390;

	@OriginalMember(owner = "client!rba", name = "C", descriptor = "I")
	private int anInt7391;

	@OriginalMember(owner = "client!rba", name = "D", descriptor = "I")
	public int anInt7392;

	@OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
	private int anInt7393;

	@OriginalMember(owner = "client!rba", name = "F", descriptor = "I")
	private int anInt7394;

	@OriginalMember(owner = "client!rba", name = "Q", descriptor = "I")
	public int anInt7399;

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!rba", name = "H", descriptor = "I")
	private int anInt7396 = 0;

	@OriginalMember(owner = "client!rba", name = "P", descriptor = "Z")
	public boolean aBoolean528 = false;

	@OriginalMember(owner = "client!rba", name = "O", descriptor = "Lclient!on;")
	public final Class223 aClass223_2;

	@OriginalMember(owner = "client!rba", name = "K", descriptor = "J")
	private final long aLong206;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "Lclient!qp;")
	public final Class30_Sub7 aClass30_Sub7_5;

	@OriginalMember(owner = "client!rba", name = "I", descriptor = "Lclient!eg;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!rba", name = "B", descriptor = "Lclient!ed;")
	public final Class77 aClass77_11;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!qa;Lclient!on;Lclient!qp;J)V")
	public Class30_Sub8(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class30_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass223_2 = arg1;
		this.aLong206 = arg3;
		this.aClass30_Sub7_5 = arg2;
		this.aClass81_1 = this.aClass223_2.method5530();
		if (!arg0.method7053() && this.aClass81_1.anInt2459 != -1) {
			this.aClass81_1 = Static337.method5255(this.aClass81_1.anInt2459);
		}
		this.aClass77_11 = new Class77();
		this.anInt7396 = (int) ((double) this.anInt7396 + Math.random() * 64.0D);
		this.method6008();
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
	public void method6008() {
		this.anInt7391 = this.aClass223_2.anInt6750;
		this.anInt7383 = this.aClass223_2.anInt6749;
		this.anInt7378 = this.aClass223_2.anInt6761;
		this.anInt7394 = this.aClass223_2.anInt6762;
		this.anInt7377 = this.aClass223_2.anInt6751;
		this.anInt7393 = this.aClass223_2.anInt6757;
		this.anInt7385 = this.aClass223_2.anInt6755;
		this.anInt7386 = this.aClass223_2.anInt6763;
		this.anInt7380 = this.aClass223_2.anInt6759;
		if (this.anInt7394 == this.anInt7383 && this.anInt7394 == this.anInt7378 && this.anInt7380 == this.anInt7386 && this.anInt7386 == this.anInt7393 && this.anInt7385 == this.anInt7391 && this.anInt7391 == this.anInt7377) {
			this.aBoolean527 = true;
			return;
		}
		this.aBoolean527 = false;
		@Pc(125) int local125 = (this.anInt7383 + this.anInt7394 + this.anInt7378) / 3;
		@Pc(136) int local136 = (this.anInt7386 + this.anInt7380 + this.anInt7393) / 3;
		@Pc(148) int local148 = (this.anInt7385 + this.anInt7391 + this.anInt7377) / 3;
		if (this.anInt7376 == local125 && this.anInt7399 == local136 && this.anInt7384 == local148) {
			return;
		}
		this.anInt7384 = local148;
		this.anInt7399 = local136;
		this.anInt7376 = local125;
		@Pc(180) int local180 = this.anInt7394 - this.anInt7383;
		@Pc(187) int local187 = this.anInt7386 - this.anInt7380;
		@Pc(194) int local194 = this.anInt7391 - this.anInt7385;
		@Pc(201) int local201 = this.anInt7378 - this.anInt7383;
		@Pc(208) int local208 = this.anInt7393 - this.anInt7380;
		@Pc(214) int local214 = this.anInt7377 - this.anInt7385;
		this.anInt7379 = local214 * local187 - local208 * local194;
		this.anInt7388 = local194 * local201 - local180 * local214;
		this.anInt7389 = local180 * local208 - local201 * local187;
		while (this.anInt7379 > 32767 || this.anInt7388 > 32767 || this.anInt7389 > 32767 || this.anInt7379 < -32767 || this.anInt7388 < -32767 || this.anInt7389 < -32767) {
			this.anInt7388 >>= 0x1;
			this.anInt7389 >>= 0x1;
			this.anInt7379 >>= 0x1;
		}
		@Pc(313) int local313 = (int) Math.sqrt((double) (this.anInt7388 * this.anInt7388 + this.anInt7379 * this.anInt7379 + this.anInt7389 * this.anInt7389));
		if (local313 <= 0) {
			local313 = 1;
		}
		this.anInt7379 = this.anInt7379 * 32767 / local313;
		this.anInt7389 = this.anInt7389 * 32767 / local313;
		this.anInt7388 = this.anInt7388 * 32767 / local313;
		if (this.aClass81_1.aShort40 <= 0 && this.aClass81_1.aShort41 <= 0) {
			return;
		}
		@Pc(363) int local363 = (int) (Math.atan2((double) this.anInt7389, (double) this.anInt7379) * 2607.5945876176133D);
		@Pc(384) int local384 = (int) (Math.atan2((double) this.anInt7388, Math.sqrt((double) (this.anInt7379 * this.anInt7379 + this.anInt7389 * this.anInt7389))) * 2607.5945876176133D);
		this.anInt7390 = this.aClass81_1.aShort40 - this.aClass81_1.aShort42;
		this.anInt7387 = local363 + this.aClass81_1.aShort42 - (this.anInt7390 >> 1);
		this.anInt7382 = this.aClass81_1.aShort41 - this.aClass81_1.aShort39;
		this.anInt7375 = local384 + this.aClass81_1.aShort39 - (this.anInt7382 >> 1);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BLclient!qa;JZI)V")
	public void method6010(@OriginalArg(1) Class62 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(50) int local50;
		if (this.aBoolean528) {
			arg2 = false;
		} else if (this.aClass81_1.anInt2463 > Static490.anInt8412) {
			arg2 = false;
		} else if (Static132.anIntArray230[Static490.anInt8412] < Static252.anInt5082) {
			arg2 = false;
		} else if (this.aBoolean527) {
			arg2 = false;
		} else if (this.aClass81_1.anInt2456 != -1) {
			local50 = (int) (arg1 - this.aLong206);
			if (this.aClass81_1.aBoolean156 || local50 <= this.aClass81_1.anInt2456) {
				local50 %= this.aClass81_1.anInt2456;
			} else {
				arg2 = false;
			}
			if (!this.aClass81_1.aBoolean158 && this.aClass81_1.anInt2466 > local50) {
				arg2 = false;
			}
			if (this.aClass81_1.aBoolean158 && this.aClass81_1.anInt2466 <= local50) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt7396 += (int) (((double) this.aClass81_1.anInt2452 + Math.random() * (double) (this.aClass81_1.anInt2462 - this.aClass81_1.anInt2452)) * (double) arg3);
			if (this.anInt7396 > 63) {
				local50 = this.anInt7396 >> 6;
				this.anInt7396 &= 0x3F;
				for (@Pc(147) int local147 = 0; local147 < local50; local147++) {
					@Pc(215) int local215;
					@Pc(221) int local221;
					@Pc(227) int local227;
					@Pc(173) int local173;
					@Pc(181) int local181;
					@Pc(185) int local185;
					@Pc(195) int local195;
					@Pc(203) int local203;
					@Pc(207) int local207;
					if (this.aClass81_1.aShort40 <= 0 && this.aClass81_1.aShort41 <= 0) {
						local215 = this.anInt7379;
						local227 = this.anInt7389;
						local221 = this.anInt7388;
					} else {
						local173 = this.anInt7387 + (int) (Math.random() * (double) this.anInt7390);
						@Pc(177) int local177 = local173 & 0x3FFF;
						local181 = Class5_Sub2_Sub16.anIntArray411[local177];
						local185 = Class5_Sub2_Sub16.anIntArray410[local177];
						local195 = this.anInt7375 + (int) (Math.random() * (double) this.anInt7382);
						@Pc(199) int local199 = local195 & 0x1FFF;
						local203 = Class5_Sub2_Sub16.anIntArray411[local199];
						local207 = Class5_Sub2_Sub16.anIntArray410[local199];
						local215 = local185 * local203 >> 15;
						local221 = (local207 << 0) * -1;
						local227 = local203 * local181 >> 15;
					}
					local173 = (int) (Math.random() * 65535.0D);
					local181 = (int) (Math.random() * 65535.0D);
					if (local173 + local181 > 65535) {
						local173 = 65535 - local173;
						local181 = 65535 - local181;
					}
					local185 = 65535 - local181 - local173;
					local195 = (int) ((long) local185 * (long) this.anInt7378 + (long) this.anInt7394 * (long) local181 + (long) local173 * (long) this.anInt7383 >> 16);
					local203 = (int) ((long) local173 * (long) this.anInt7380 + (long) local181 * (long) this.anInt7386 + (long) this.anInt7393 * (long) local185 >> 16);
					local207 = (int) ((long) local181 * (long) this.anInt7391 + (long) this.anInt7385 * (long) local173 + (long) local185 * (long) this.anInt7377 >> 16);
					@Pc(363) int local363 = (int) ((double) (this.aClass81_1.anInt2451 - this.aClass81_1.anInt2480) * Math.random()) + this.aClass81_1.anInt2480;
					@Pc(380) int local380 = (int) (Math.random() * (double) (this.aClass81_1.anInt2468 - this.aClass81_1.anInt2438)) + this.aClass81_1.anInt2438;
					@Pc(396) int local396 = (int) ((double) (this.aClass81_1.lb - this.aClass81_1.anInt2439) * Math.random()) + this.aClass81_1.anInt2439;
					@Pc(460) int local460;
					if (this.aClass81_1.aBoolean153) {
						@Pc(402) double local402 = Math.random();
						local460 = (int) ((double) this.aClass81_1.anInt2476 * local402 + (double) this.aClass81_1.anInt2440) << 16 | (int) ((double) this.aClass81_1.anInt2432 * local402 + (double) this.aClass81_1.anInt2450) << 8 | (int) ((double) this.aClass81_1.anInt2437 + local402 * (double) this.aClass81_1.anInt2477) | (int) ((double) this.aClass81_1.anInt2465 + (double) this.aClass81_1.anInt2469 * Math.random()) << 24;
					} else {
						local460 = (int) ((double) this.aClass81_1.anInt2437 + Math.random() * (double) this.aClass81_1.anInt2477) | (int) ((double) this.aClass81_1.anInt2476 * Math.random() + (double) this.aClass81_1.anInt2440) << 16 | (int) (Math.random() * (double) this.aClass81_1.anInt2432 + (double) this.aClass81_1.anInt2450) << 8 | (int) (Math.random() * (double) this.aClass81_1.anInt2469 + (double) this.aClass81_1.anInt2465) << 24;
					}
					@Pc(524) int local524 = this.aClass81_1.anInt2474;
					if (!arg0.method7053() && !this.aClass81_1.aBoolean160) {
						local524 = -1;
					}
					if (Static21.anInt7324 == Static68.anInt1407) {
						new Class30_Sub2_Sub1_Sub1(this, local195, local203, local207, local215, local221, local227, local363, local380, local460, local396, local524, this.aClass81_1.aBoolean154, this.aClass81_1.aBoolean155);
					} else {
						@Pc(540) Class30_Sub2_Sub1_Sub1 local540 = Static500.aClass30_Sub2_Sub1_Sub1Array2[Static68.anInt1407];
						Static68.anInt1407 = Static68.anInt1407 + 1 & 0x3FF;
						local540.method2676(this, local195, local203, local207, local215, local221, local227, local363, local380, local460, local396, local524, this.aClass81_1.aBoolean154, this.aClass81_1.aBoolean155);
					}
				}
			}
		}
		this.anInt7392 = 0;
		for (@Pc(609) Class30_Sub2_Sub1_Sub1 local609 = (Class30_Sub2_Sub1_Sub1) this.aClass77_11.method2157(); local609 != null; local609 = (Class30_Sub2_Sub1_Sub1) this.aClass77_11.method2160()) {
			local609.method2678(arg1, arg3);
			this.anInt7392++;
		}
		Static81.anInt1560 += this.anInt7392;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(JLclient!qa;B)V")
	public void method6011(@OriginalArg(0) long arg0, @OriginalArg(1) Class62 arg1) {
		for (@Pc(7) Class30_Sub2_Sub1_Sub1 local7 = (Class30_Sub2_Sub1_Sub1) this.aClass77_11.method2157(); local7 != null; local7 = (Class30_Sub2_Sub1_Sub1) this.aClass77_11.method2160()) {
			local7.method2675(arg1, arg0);
		}
	}
}
