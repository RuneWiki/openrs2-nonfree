import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class19_Sub5 extends Class19 {

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	public int anInt3621;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private int anInt3631;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
	private int anInt3632;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
	private int anInt3633;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	private int anInt3634;

	@OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
	private int anInt3635;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	private int anInt3636;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	private int anInt3637;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Z")
	public boolean aBoolean293 = false;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	private int anInt3625 = 0;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "Lclient!qd;")
	public Class300 aClass300_1 = new Class300();

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "Lclient!qd;")
	private Class300 aClass300_2 = new Class300();

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "Z")
	private boolean aBoolean294 = false;

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "J")
	private final long aLong130;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "Lclient!oi;")
	public final Class19_Sub9 aClass19_Sub9_3;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!hl;")
	public final Class156 aClass156_1;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "Lclient!ila;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!dda;")
	public final Class66 aClass66_2;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ha;Lclient!hl;Lclient!oi;J)V")
	public Class19_Sub5(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Class19_Sub9 arg2, @OriginalArg(3) long arg3) {
		this.aLong130 = arg3;
		this.aClass19_Sub9_3 = arg2;
		this.aClass156_1 = arg1;
		this.aClass173_1 = this.aClass156_1.method3754();
		if (!arg0.method7711() && this.aClass173_1.anInt5090 != -1) {
			this.aClass173_1 = Static389.method5892(this.aClass173_1.anInt5090);
		}
		this.aClass66_2 = new Class66();
		this.anInt3625 = (int) ((double) this.anInt3625 + Math.random() * 64.0D);
		this.method3104();
		this.aClass300_2.anInt8666 = this.aClass300_1.anInt8666;
		this.aClass300_2.anInt8669 = this.aClass300_1.anInt8669;
		this.aClass300_2.anInt8668 = this.aClass300_1.anInt8668;
		this.aClass300_2.anInt8665 = this.aClass300_1.anInt8665;
		this.aClass300_2.anInt8673 = this.aClass300_1.anInt8673;
		this.aClass300_2.anInt8670 = this.aClass300_1.anInt8670;
		this.aClass300_2.anInt8667 = this.aClass300_1.anInt8667;
		this.aClass300_2.anInt8664 = this.aClass300_1.anInt8664;
		this.aClass300_2.anInt8671 = this.aClass300_1.anInt8671;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!ha;JZ)V")
	public void method3103(@OriginalArg(0) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		if (this.aBoolean293) {
			arg3 = false;
		} else if (this.aClass173_1.anInt5072 > Static284.anInt5151) {
			arg3 = false;
		} else if (Static709.anIntArray637[Static284.anInt5151] < Static125.anInt2388) {
			arg3 = false;
		} else if (this.aBoolean294) {
			arg3 = false;
		} else if (this.aClass173_1.anInt5064 != -1) {
			@Pc(54) int local54 = (int) (arg2 - this.aLong130);
			if (this.aClass173_1.aBoolean445 || local54 <= this.aClass173_1.anInt5064) {
				local54 %= this.aClass173_1.anInt5064;
			} else {
				arg3 = false;
			}
			if (!this.aClass173_1.aBoolean444 && local54 < this.aClass173_1.anInt5087) {
				arg3 = false;
			}
			if (this.aClass173_1.aBoolean444 && local54 >= this.aClass173_1.anInt5087) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static268.anInt4872++;
			@Pc(137) int local137 = (this.aClass300_1.anInt8665 + this.aClass300_1.anInt8667 + this.aClass300_1.anInt8670) / 3;
			@Pc(151) int local151 = (this.aClass300_1.anInt8666 + this.aClass300_1.anInt8671 + this.aClass300_1.anInt8669) / 3;
			@Pc(166) int local166 = (this.aClass300_1.anInt8673 + this.aClass300_1.anInt8664 + this.aClass300_1.anInt8668) / 3;
			@Pc(214) int local214;
			@Pc(223) int local223;
			@Pc(232) int local232;
			@Pc(240) int local240;
			@Pc(249) int local249;
			@Pc(258) int local258;
			@Pc(363) int local363;
			@Pc(418) int local418;
			@Pc(439) int local439;
			if (local137 != this.aClass300_1.anInt8674 || this.aClass300_1.anInt8663 != local151 || local166 != this.aClass300_1.anInt8675) {
				this.aClass300_1.anInt8674 = local137;
				this.aClass300_1.anInt8663 = local151;
				this.aClass300_1.anInt8675 = local166;
				local214 = this.aClass300_1.anInt8667 - this.aClass300_1.anInt8670;
				local223 = this.aClass300_1.anInt8666 - this.aClass300_1.anInt8671;
				local232 = this.aClass300_1.anInt8673 - this.aClass300_1.anInt8664;
				local240 = this.aClass300_1.anInt8665 - this.aClass300_1.anInt8670;
				local249 = this.aClass300_1.anInt8669 - this.aClass300_1.anInt8671;
				local258 = this.aClass300_1.anInt8668 - this.aClass300_1.anInt8664;
				this.anInt3636 = local258 * local223 - local232 * local249;
				this.anInt3632 = local240 * local232 - local214 * local258;
				this.anInt3634 = local214 * local249 - local240 * local223;
				while (true) {
					if (this.anInt3636 <= 32767 && this.anInt3632 <= 32767 && this.anInt3634 <= 32767 && this.anInt3636 >= -32767 && this.anInt3632 >= -32767 && this.anInt3634 >= -32767) {
						local363 = (int) Math.sqrt((double) (this.anInt3632 * this.anInt3632 + this.anInt3636 * this.anInt3636 + this.anInt3634 * this.anInt3634));
						if (local363 <= 0) {
							local363 = 1;
						}
						this.anInt3636 = this.anInt3636 * 32767 / local363;
						this.anInt3634 = this.anInt3634 * 32767 / local363;
						this.anInt3632 = this.anInt3632 * 32767 / local363;
						if (this.aClass173_1.aShort74 > 0 || this.aClass173_1.aShort72 > 0) {
							local418 = (int) (Math.atan2((double) this.anInt3634, (double) this.anInt3636) * 2607.5945876176133D);
							local439 = (int) (Math.atan2((double) this.anInt3632, Math.sqrt((double) (this.anInt3634 * this.anInt3634 + this.anInt3636 * this.anInt3636))) * 2607.5945876176133D);
							this.anInt3633 = this.aClass173_1.aShort74 - this.aClass173_1.lb;
							this.anInt3631 = this.aClass173_1.aShort72 - this.aClass173_1.aShort73;
							this.anInt3635 = this.aClass173_1.lb + local418 - (this.anInt3633 >> 1);
							this.anInt3637 = local439 + this.aClass173_1.aShort73 - (this.anInt3631 >> 1);
						}
						break;
					}
					this.anInt3632 >>= 0x1;
					this.anInt3634 >>= 0x1;
					this.anInt3636 >>= 0x1;
				}
			}
			this.anInt3625 += (int) ((double) arg0 * ((double) this.aClass173_1.anInt5111 + Math.random() * (double) (this.aClass173_1.anInt5069 - this.aClass173_1.anInt5111)));
			if (this.anInt3625 > 63) {
				local214 = this.anInt3625 >> 6;
				this.anInt3625 &= 0x3F;
				for (local249 = 0; local249 < local214; local249++) {
					@Pc(586) int local586;
					@Pc(590) int local590;
					if (this.aClass173_1.aShort74 <= 0 && this.aClass173_1.aShort72 <= 0) {
						local223 = this.anInt3636;
						local240 = this.anInt3634;
						local232 = this.anInt3632;
					} else {
						local258 = (int) (Math.random() * (double) this.anInt3633) + this.anInt3635;
						local258 &= 0x3FFF;
						local363 = Class3_Sub2_Sub21.anIntArray358[local258];
						local418 = Class3_Sub2_Sub21.anIntArray356[local258];
						local439 = (int) (Math.random() * (double) this.anInt3631) + this.anInt3637;
						local439 &= 0x1FFF;
						local586 = Class3_Sub2_Sub21.anIntArray358[local439];
						local590 = Class3_Sub2_Sub21.anIntArray356[local439];
						local223 = local418 * local586 >> 13;
						local232 = (local590 << 1) * -1;
						local240 = local363 * local586 >> 13;
					}
					@Pc(624) float local624 = (float) Math.random();
					@Pc(627) float local627 = (float) Math.random();
					if (local627 + local624 > 1.0F) {
						local624 = 1.0F - local624;
						local627 = 1.0F - local627;
					}
					@Pc(649) float local649 = 1.0F - local627 - local624;
					local439 = (int) ((float) this.aClass300_1.anInt8667 * local627 + local624 * (float) this.aClass300_1.anInt8670 + (float) this.aClass300_1.anInt8665 * local649);
					local586 = (int) ((float) this.aClass300_1.anInt8671 * local624 + local627 * (float) this.aClass300_1.anInt8666 + local649 * (float) this.aClass300_1.anInt8669);
					local590 = (int) ((float) this.aClass300_1.anInt8664 * local624 + (float) this.aClass300_1.anInt8673 * local627 + (float) this.aClass300_1.anInt8668 * local649);
					@Pc(737) int local737 = (int) ((float) this.aClass300_2.anInt8665 * local649 + (float) this.aClass300_2.anInt8670 * local624 + (float) this.aClass300_2.anInt8667 * local627);
					@Pc(759) int local759 = (int) ((float) this.aClass300_2.anInt8666 * local627 + (float) this.aClass300_2.anInt8671 * local624 + local649 * (float) this.aClass300_2.anInt8669);
					@Pc(781) int local781 = (int) ((float) this.aClass300_2.anInt8668 * local649 + local624 * (float) this.aClass300_2.anInt8664 + (float) this.aClass300_2.anInt8673 * local627);
					@Pc(785) int local785 = local439 - local737;
					@Pc(790) int local790 = local586 - local759;
					@Pc(795) int local795 = local590 - local781;
					@Pc(804) int local804 = (int) ((double) local785 * Math.random() + (double) local737);
					@Pc(813) int local813 = (int) ((double) local790 * Math.random() + (double) local759);
					@Pc(822) int local822 = (int) (Math.random() * (double) local795 + (double) local781);
					@Pc(839) int local839 = this.aClass173_1.anInt5082 + (int) (Math.random() * (double) (this.aClass173_1.anInt5108 - this.aClass173_1.anInt5082));
					@Pc(856) int local856 = (int) ((double) (this.aClass173_1.anInt5097 - this.aClass173_1.anInt5075) * Math.random()) + this.aClass173_1.anInt5075;
					@Pc(873) int local873 = (int) (Math.random() * (double) (this.aClass173_1.anInt5085 - this.aClass173_1.anInt5083)) + this.aClass173_1.anInt5083;
					@Pc(937) int local937;
					if (this.aClass173_1.aBoolean439) {
						@Pc(879) double local879 = Math.random();
						local937 = (int) (Math.random() * (double) this.aClass173_1.anInt5093 + (double) this.aClass173_1.anInt5101) << 24 | (int) ((double) this.aClass173_1.anInt5103 * local879 + (double) this.aClass173_1.anInt5071) | (int) ((double) this.aClass173_1.anInt5067 + (double) this.aClass173_1.anInt5100 * local879) << 16 | (int) ((double) this.aClass173_1.anInt5077 + (double) this.aClass173_1.anInt5099 * local879) << 8;
					} else {
						local937 = (int) ((double) this.aClass173_1.anInt5101 + (double) this.aClass173_1.anInt5093 * Math.random()) << 24 | (int) ((double) this.aClass173_1.anInt5103 * Math.random() + (double) this.aClass173_1.anInt5071) | (int) ((double) this.aClass173_1.anInt5067 + (double) this.aClass173_1.anInt5100 * Math.random()) << 16 | (int) ((double) this.aClass173_1.anInt5077 + (double) this.aClass173_1.anInt5099 * Math.random()) << 8;
					}
					@Pc(1001) int local1001 = this.aClass173_1.anInt5062;
					if (!arg1.method7711() && !this.aClass173_1.aBoolean441) {
						local1001 = -1;
					}
					if (Static545.anInt7061 == Static344.anInt5900) {
						new Class19_Sub4_Sub1_Sub1(this, local804, local813, local822, local223, local232, local240, local839, local856, local937, local873, local1001, this.aClass173_1.aBoolean440, this.aClass173_1.aBoolean446);
					} else {
						@Pc(1047) Class19_Sub4_Sub1_Sub1 local1047 = Static547.aClass19_Sub4_Sub1_Sub1Array2[Static545.anInt7061];
						Static545.anInt7061 = Static545.anInt7061 + 1 & 0x3FF;
						local1047.method2957(this, local804, local813, local822, local223, local232, local240, local839, local856, local937, local873, local1001, this.aClass173_1.aBoolean440, this.aClass173_1.aBoolean446);
					}
				}
			}
		}
		if (!this.aClass300_1.method7263(this.aClass300_2)) {
			@Pc(1089) Class300 local1089 = this.aClass300_2;
			this.aClass300_2 = this.aClass300_1;
			this.aClass300_1 = local1089;
			this.aClass300_1.anInt8675 = this.aClass300_2.anInt8675;
			this.aClass300_1.anInt8668 = this.aClass156_1.anInt4587;
			this.aClass300_1.anInt8667 = this.aClass156_1.anInt4596;
			this.aClass300_1.anInt8665 = this.aClass156_1.anInt4590;
			this.aClass300_1.anInt8673 = this.aClass156_1.anInt4598;
			this.aClass300_1.anInt8664 = this.aClass156_1.anInt4595;
			this.aClass300_1.anInt8666 = this.aClass156_1.anInt4599;
			this.aClass300_1.anInt8670 = this.aClass156_1.anInt4584;
			this.aClass300_1.anInt8674 = this.aClass300_2.anInt8674;
			this.aClass300_1.anInt8669 = this.aClass156_1.anInt4594;
			this.aClass300_1.anInt8663 = this.aClass300_2.anInt8663;
			this.aClass300_1.anInt8671 = this.aClass156_1.anInt4592;
		}
		this.anInt3621 = 0;
		for (@Pc(1177) Class19_Sub4_Sub1_Sub1 local1177 = (Class19_Sub4_Sub1_Sub1) this.aClass66_2.method1381(); local1177 != null; local1177 = (Class19_Sub4_Sub1_Sub1) this.aClass66_2.method1380()) {
			local1177.method2953(arg2, arg0);
			this.anInt3621++;
		}
		Static49.anInt835 += this.anInt3621;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public void method3104() {
		this.aClass300_1.anInt8667 = this.aClass156_1.anInt4596;
		this.aClass300_1.anInt8671 = this.aClass156_1.anInt4592;
		this.aClass300_1.anInt8666 = this.aClass156_1.anInt4599;
		this.aClass300_1.anInt8670 = this.aClass156_1.anInt4584;
		this.aClass300_1.anInt8673 = this.aClass156_1.anInt4598;
		this.aClass300_1.anInt8669 = this.aClass156_1.anInt4594;
		this.aClass300_1.anInt8665 = this.aClass156_1.anInt4590;
		this.aClass300_1.anInt8668 = this.aClass156_1.anInt4587;
		this.aClass300_1.anInt8664 = this.aClass156_1.anInt4595;
		if (this.aClass300_1.anInt8670 == this.aClass300_1.anInt8667 && this.aClass300_1.anInt8665 == this.aClass300_1.anInt8667 && this.aClass300_1.anInt8671 == this.aClass300_1.anInt8666 && this.aClass300_1.anInt8666 == this.aClass300_1.anInt8669 && this.aClass300_1.anInt8664 == this.aClass300_1.anInt8673 && this.aClass300_1.anInt8668 == this.aClass300_1.anInt8673) {
			this.aBoolean294 = true;
		} else if (this.aBoolean294) {
			this.aBoolean294 = false;
			this.aClass300_2.anInt8669 = this.aClass300_1.anInt8669;
			this.aClass300_2.anInt8667 = this.aClass300_1.anInt8667;
			this.aClass300_2.anInt8665 = this.aClass300_1.anInt8665;
			this.aClass300_2.anInt8671 = this.aClass300_1.anInt8671;
			this.aClass300_2.anInt8670 = this.aClass300_1.anInt8670;
			this.aClass300_2.anInt8668 = this.aClass300_1.anInt8668;
			this.aClass300_2.anInt8673 = this.aClass300_1.anInt8673;
			this.aClass300_2.anInt8664 = this.aClass300_1.anInt8664;
			this.aClass300_2.anInt8666 = this.aClass300_1.anInt8666;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(JLclient!ha;I)V")
	public void method3105(@OriginalArg(0) long arg0, @OriginalArg(1) Class67 arg1) {
		for (@Pc(7) Class19_Sub4_Sub1_Sub1 local7 = (Class19_Sub4_Sub1_Sub1) this.aClass66_2.method1381(); local7 != null; local7 = (Class19_Sub4_Sub1_Sub1) this.aClass66_2.method1380()) {
			local7.method2956(arg1, arg0);
		}
	}
}
