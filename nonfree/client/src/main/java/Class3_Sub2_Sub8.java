import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
	private int anInt3123;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	private int anInt3124;

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
	private int anInt3125;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	private int anInt3127;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
	private int anInt3138;

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	private int anInt3128 = 0;

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
	private int anInt3137 = 0;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	private int anInt3133 = 0;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3133 = arg1.method8444();
		} else if (arg0 == 1) {
			this.anInt3128 = (arg1.method8440() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3137 = (arg1.method8440() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIB)V")
	private void method2860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 < arg1 ? arg1 : arg2;
		@Pc(23) int local23 = local16 >= arg0 ? local16 : arg0;
		@Pc(34) int local34 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(45) int local45 = arg0 < local34 ? arg0 : local34;
		@Pc(62) int local62 = local23 - local45;
		this.anInt3130 = (local45 + local23) / 2;
		if (local62 <= 0) {
			this.anInt3127 = 0;
		} else {
			@Pc(86) int local86 = (local23 - arg1 << 12) / local62;
			@Pc(95) int local95 = (local23 - arg2 << 12) / local62;
			@Pc(104) int local104 = (local23 - arg0 << 12) / local62;
			if (local23 == arg1) {
				this.anInt3127 = arg2 == local45 ? local104 + 20480 : -local95 + 4096;
			} else if (local23 == arg2) {
				this.anInt3127 = local45 == arg0 ? local86 + 4096 : 12288 - local104;
			} else {
				this.anInt3127 = arg1 == local45 ? local95 + 12288 : -local86 + 20480;
			}
			this.anInt3127 /= 6;
		}
		if (this.anInt3130 > 0 && this.anInt3130 < 4096) {
			this.anInt3123 = (local62 << 12) / (this.anInt3130 > 2048 ? 8192 - (this.anInt3130 * 2) : this.anInt3130 * 2);
		} else {
			this.anInt3123 = 0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(23) int[][] local23 = this.method8337(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static164.anInt8839; local49++) {
				this.method2860(local35[local49], local27[local49], local31[local49]);
				this.anInt3130 += this.anInt3137;
				this.anInt3123 += this.anInt3128;
				for (this.anInt3127 += this.anInt3133; this.anInt3127 < 0; this.anInt3127 += 4096) {
				}
				while (this.anInt3127 > 4096) {
					this.anInt3127 -= 4096;
				}
				if (this.anInt3123 < 0) {
					this.anInt3123 = 0;
				}
				if (this.anInt3130 < 0) {
					this.anInt3130 = 0;
				}
				if (this.anInt3123 > 4096) {
					this.anInt3123 = 4096;
				}
				if (this.anInt3130 > 4096) {
					this.anInt3130 = 4096;
				}
				this.method2862(this.anInt3127, this.anInt3130, this.anInt3123);
				local39[local49] = this.anInt3124;
				local43[local49] = this.anInt3125;
				local47[local49] = this.anInt3138;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZI)V")
	private void method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg1 > 2048 ? arg1 + arg2 - (arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
		if (local33 <= 0) {
			this.anInt3124 = this.anInt3125 = this.anInt3138 = arg1;
			return;
		}
		@Pc(39) int local39 = arg0 * 6;
		@Pc(46) int local46 = arg1 + arg1 - local33;
		@Pc(55) int local55 = (local33 - local46 << 12) / local33;
		@Pc(59) int local59 = local39 >> 12;
		@Pc(66) int local66 = local39 - (local59 << 12);
		@Pc(74) int local74 = local55 * local33 >> 12;
		@Pc(80) int local80 = local74 * local66 >> 12;
		@Pc(84) int local84 = local80 + local46;
		@Pc(88) int local88 = local33 - local80;
		if (local59 == 0) {
			this.anInt3138 = local46;
			this.anInt3125 = local84;
			this.anInt3124 = local33;
			return;
		}
		if (local59 == 1) {
			this.anInt3138 = local46;
			this.anInt3124 = local88;
			this.anInt3125 = local33;
			return;
		}
		if (local59 == 2) {
			this.anInt3124 = local46;
			this.anInt3138 = local84;
			this.anInt3125 = local33;
			return;
		}
		if (local59 == 3) {
			this.anInt3138 = local33;
			this.anInt3124 = local46;
			this.anInt3125 = local88;
			return;
		}
		if (local59 == 4) {
			this.anInt3138 = local33;
			this.anInt3125 = local46;
			this.anInt3124 = local84;
			return;
		}
		if (local59 == 5) {
			this.anInt3138 = local88;
			this.anInt3125 = local46;
			this.anInt3124 = local33;
			return;
		}
	}
}
