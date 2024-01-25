import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class57_Sub8 extends Class57 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public int anInt6447;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	private int anInt6448;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	public int anInt6449;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
	private int anInt6450;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
	private int anInt6451;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
	private int anInt6454;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	private int anInt6455;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
	private int anInt6456;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	private int anInt6457;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
	private int anInt6458;

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
	private int anInt6459;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
	private int anInt6466;

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
	private int anInt6468;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
	private int anInt6470;

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
	public int anInt6472;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
	private int anInt6473;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
	private int anInt6464 = 0;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "Z")
	private boolean aBoolean408 = false;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "Lclient!in;")
	public final Class119 aClass119_2;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "J")
	private final long aLong188;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "Lclient!ko;")
	public final Class57_Sub4 aClass57_Sub4_5;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "Lclient!ou;")
	public Class188 aClass188_1;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "Lclient!i;")
	public final Class111 aClass111_7;

	static {
		new Class267("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!eq;Lclient!in;Lclient!ko;J)V")
	public Class57_Sub8(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) Class57_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass119_2 = arg1;
		this.aLong188 = arg3;
		this.aClass57_Sub4_5 = arg2;
		this.aClass188_1 = this.aClass119_2.method2863();
		if (!arg0.method4985() && this.aClass188_1.anInt5235 != -1) {
			this.aClass188_1 = Static71.method1454(this.aClass188_1.anInt5235);
		}
		this.aClass111_7 = new Class111();
		this.anInt6464 = (int) ((double) this.anInt6464 + Math.random() * 64.0D);
		this.method5362();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(JI)V")
	public void method5360(@OriginalArg(0) long arg0) {
		for (@Pc(7) Class57_Sub1_Sub1_Sub1 local7 = (Class57_Sub1_Sub1_Sub1) this.aClass111_7.method2688(); local7 != null; local7 = (Class57_Sub1_Sub1_Sub1) this.aClass111_7.method2690()) {
			local7.method4337(arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public void method5362() {
		this.anInt6467 = this.aClass119_2.anInt3443;
		this.anInt6448 = this.aClass119_2.anInt3445;
		this.anInt6458 = this.aClass119_2.anInt3453;
		this.anInt6456 = this.aClass119_2.anInt3447;
		this.anInt6459 = this.aClass119_2.anInt3444;
		this.anInt6450 = this.aClass119_2.anInt3451;
		this.anInt6473 = this.aClass119_2.anInt3457;
		this.anInt6466 = this.aClass119_2.anInt3449;
		this.anInt6465 = this.aClass119_2.anInt3455;
		if (this.anInt6459 == this.anInt6458 && this.anInt6458 == this.anInt6456 && this.anInt6467 == this.anInt6448 && this.anInt6448 == this.anInt6450 && this.anInt6466 == this.anInt6465 && this.anInt6473 == this.anInt6466) {
			this.aBoolean408 = true;
			return;
		}
		this.aBoolean408 = false;
		@Pc(125) int local125 = (this.anInt6458 + this.anInt6459 + this.anInt6456) / 3;
		@Pc(136) int local136 = (this.anInt6450 + this.anInt6448 + this.anInt6467) / 3;
		@Pc(147) int local147 = (this.anInt6473 + this.anInt6466 + this.anInt6465) / 3;
		if (this.anInt6462 == local125 && local136 == this.anInt6449 && local147 == this.anInt6447) {
			return;
		}
		this.anInt6462 = local125;
		this.anInt6447 = local147;
		this.anInt6449 = local136;
		@Pc(184) int local184 = this.anInt6458 - this.anInt6459;
		@Pc(190) int local190 = this.anInt6448 - this.anInt6467;
		@Pc(196) int local196 = this.anInt6466 - this.anInt6465;
		@Pc(202) int local202 = this.anInt6456 - this.anInt6459;
		@Pc(209) int local209 = this.anInt6450 - this.anInt6467;
		@Pc(216) int local216 = this.anInt6473 - this.anInt6465;
		this.anInt6455 = local202 * local196 - local216 * local184;
		this.anInt6451 = local216 * local190 - local196 * local209;
		this.anInt6453 = local209 * local184 - local202 * local190;
		while (this.anInt6451 > 32767 || this.anInt6455 > 32767 || this.anInt6453 > 32767 || this.anInt6451 < -32767 || this.anInt6455 < -32767 || this.anInt6453 < -32767) {
			this.anInt6453 >>= 0x1;
			this.anInt6455 >>= 0x1;
			this.anInt6451 >>= 0x1;
		}
		@Pc(318) int local318 = (int) Math.sqrt((double) (this.anInt6455 * this.anInt6455 + this.anInt6451 * this.anInt6451 + this.anInt6453 * this.anInt6453));
		if (local318 <= 0) {
			local318 = 1;
		}
		this.anInt6451 = this.anInt6451 * 32767 / local318;
		this.anInt6453 = this.anInt6453 * 32767 / local318;
		this.anInt6455 = this.anInt6455 * 32767 / local318;
		if (this.aClass188_1.aShort76 <= 0 && this.aClass188_1.aShort75 <= 0) {
			return;
		}
		@Pc(371) int local371 = (int) (Math.atan2((double) this.anInt6453, (double) this.anInt6451) * 2607.5945876176133D);
		@Pc(392) int local392 = (int) (Math.atan2((double) this.anInt6455, Math.sqrt((double) (this.anInt6453 * this.anInt6453 + this.anInt6451 * this.anInt6451))) * 2607.5945876176133D);
		this.anInt6468 = this.aClass188_1.aShort76 - this.aClass188_1.aShort73;
		this.anInt6470 = this.aClass188_1.aShort75 - this.aClass188_1.aShort74;
		this.anInt6457 = this.aClass188_1.aShort73 + local371 - (this.anInt6468 >> 1);
		this.anInt6454 = this.aClass188_1.aShort74 + local392 - (this.anInt6470 >> 1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!eq;IZIJ)V")
	public void method5364(@OriginalArg(0) Class66 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(61) int local61;
		if (this.aBoolean409) {
			arg1 = false;
		} else if (this.aClass188_1.anInt5219 > Static111.anInt2357) {
			arg1 = false;
		} else if (Static396.anInt5084 > Static219.anIntArray287[Static111.anInt2357]) {
			arg1 = false;
		} else if (this.aBoolean408) {
			arg1 = false;
		} else if (this.aClass188_1.anInt5249 != -1) {
			local61 = (int) (arg3 - this.aLong188);
			if (this.aClass188_1.aBoolean339 || this.aClass188_1.anInt5249 >= local61) {
				local61 %= this.aClass188_1.anInt5249;
			} else {
				arg1 = false;
			}
			if (!this.aClass188_1.aBoolean333 && this.aClass188_1.anInt5261 > local61) {
				arg1 = false;
			}
			if (this.aClass188_1.aBoolean333 && local61 >= this.aClass188_1.anInt5261) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt6464 += (int) (((double) this.aClass188_1.anInt5264 + (double) (this.aClass188_1.anInt5258 - this.aClass188_1.anInt5264) * Math.random()) * (double) arg2);
			if (this.anInt6464 > 63) {
				local61 = this.anInt6464 >> 6;
				this.anInt6464 &= 0x3F;
				for (@Pc(158) int local158 = 0; local158 < local61; local158++) {
					@Pc(177) int local177;
					@Pc(174) int local174;
					@Pc(171) int local171;
					@Pc(189) int local189;
					@Pc(197) int local197;
					@Pc(201) int local201;
					@Pc(212) int local212;
					@Pc(220) int local220;
					@Pc(224) int local224;
					if (this.aClass188_1.aShort76 <= 0 && this.aClass188_1.aShort75 <= 0) {
						local171 = this.anInt6453;
						local174 = this.anInt6455;
						local177 = this.anInt6451;
					} else {
						local189 = this.anInt6457 + (int) ((double) this.anInt6468 * Math.random());
						@Pc(193) int local193 = local189 & 0x3FFF;
						local197 = Class145.anIntArray279[local193];
						local201 = Class145.anIntArray280[local193];
						local212 = this.anInt6454 + (int) ((double) this.anInt6470 * Math.random());
						@Pc(216) int local216 = local212 & 0x1FFF;
						local220 = Class145.anIntArray279[local216];
						local224 = Class145.anIntArray280[local216];
						local177 = local220 * local201 >> 15;
						local174 = (local224 << 0) * -1;
						local171 = local220 * local197 >> 15;
					}
					local189 = (int) (Math.random() * 65535.0D);
					local197 = (int) (Math.random() * 65535.0D);
					if (local189 + local197 > 65535) {
						local197 = 65535 - local197;
						local189 = 65535 - local189;
					}
					local201 = 65535 - local189 - local197;
					local212 = this.anInt6458 * local197 + this.anInt6459 * local189 + this.anInt6456 * local201 >> 16;
					local220 = local201 * this.anInt6450 + this.anInt6467 * local189 + local197 * this.anInt6448 >> 16;
					local224 = this.anInt6466 * local197 + this.anInt6465 * local189 + local201 * this.anInt6473 >> 16;
					@Pc(346) int local346 = this.aClass188_1.anInt5244 + (int) ((double) (this.aClass188_1.anInt5221 - this.aClass188_1.anInt5244) * Math.random());
					@Pc(363) int local363 = (int) ((double) (this.aClass188_1.anInt5234 - this.aClass188_1.anInt5215) * Math.random()) + this.aClass188_1.anInt5215;
					@Pc(380) int local380 = (int) ((double) (this.aClass188_1.lb - this.aClass188_1.anInt5227) * Math.random()) + this.aClass188_1.anInt5227;
					@Pc(442) int local442;
					if (this.aClass188_1.aBoolean336) {
						@Pc(446) double local446 = Math.random();
						local442 = (int) ((double) this.aClass188_1.anInt5224 + local446 * (double) this.aClass188_1.anInt5252) << 8 | (int) ((double) this.aClass188_1.anInt5213 * local446 + (double) this.aClass188_1.anInt5232) << 16 | (int) (local446 * (double) this.aClass188_1.anInt5229 + (double) this.aClass188_1.anInt5218) | (int) (Math.random() * (double) this.aClass188_1.anInt5254 + (double) this.aClass188_1.anInt5233) << 24;
					} else {
						local442 = (int) ((double) this.aClass188_1.anInt5218 + (double) this.aClass188_1.anInt5229 * Math.random()) | (int) (Math.random() * (double) this.aClass188_1.anInt5213 + (double) this.aClass188_1.anInt5232) << 16 | (int) ((double) this.aClass188_1.anInt5224 + (double) this.aClass188_1.anInt5252 * Math.random()) << 8 | (int) ((double) this.aClass188_1.anInt5254 * Math.random() + (double) this.aClass188_1.anInt5233) << 24;
					}
					@Pc(508) int local508 = this.aClass188_1.anInt5257;
					if (!arg0.method4985() && !this.aClass188_1.aBoolean338) {
						local508 = -1;
					}
					if (Static225.anInt4063 == Static82.anInt5145) {
						new Class57_Sub1_Sub1_Sub1(this, local212, local220, local224, local177, local174, local171, local346, local363, local442, local380, local508, this.aClass188_1.aBoolean337, this.aClass188_1.aBoolean335);
					} else {
						@Pc(552) Class57_Sub1_Sub1_Sub1 local552 = Static182.aClass57_Sub1_Sub1_Sub1Array1[Static82.anInt5145];
						Static82.anInt5145 = Static82.anInt5145 + 1 & 0x3FF;
						local552.method4339(this, local212, local220, local224, local177, local174, local171, local346, local363, local442, local380, local508, this.aClass188_1.aBoolean337, this.aClass188_1.aBoolean335);
					}
				}
			}
		}
		this.anInt6472 = 0;
		for (@Pc(591) Class57_Sub1_Sub1_Sub1 local591 = (Class57_Sub1_Sub1_Sub1) this.aClass111_7.method2688(); local591 != null; local591 = (Class57_Sub1_Sub1_Sub1) this.aClass111_7.method2690()) {
			local591.method4338(arg3, arg2);
			this.anInt6472++;
		}
		Static336.anInt5844 += this.anInt6472;
	}
}
