import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class4_Sub3_Sub5 extends Class4_Sub3 {

	@OriginalMember(owner = "client!c", name = "V", descriptor = "[J")
	public static final long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!c", name = "T", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
	private int anInt514;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray8[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(17) int[][] local17 = this.method3150(0, arg0);
			@Pc(21) int[] local21 = local17[0];
			@Pc(25) int[] local25 = local17[1];
			@Pc(29) int[] local29 = local7[0];
			@Pc(33) int[] local33 = local17[2];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static134.anInt3188; local43++) {
				this.method330(local21[local43], local33[local43], local25[local43]);
				this.anInt513 += this.anInt515;
				this.anInt523 += this.anInt514;
				while (this.anInt513 < 0) {
					this.anInt513 += 4096;
				}
				this.anInt518 += this.anInt517;
				if (this.anInt518 < 0) {
					this.anInt518 = 0;
				}
				while (this.anInt513 > 4096) {
					this.anInt513 -= 4096;
				}
				if (this.anInt518 > 4096) {
					this.anInt518 = 4096;
				}
				if (this.anInt523 < 0) {
					this.anInt523 = 0;
				}
				if (this.anInt523 > 4096) {
					this.anInt523 = 4096;
				}
				this.method326(this.anInt513, this.anInt518, this.anInt523);
				local29[local43] = this.anInt510;
				local37[local43] = this.anInt524;
				local41[local43] = this.anInt522;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	private void method326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg1 + arg2 - (arg1 * arg2 >> 12);
		if (local33 <= 0) {
			this.anInt510 = this.anInt524 = this.anInt522 = arg1;
			return;
		}
		@Pc(52) int local52 = arg1 + arg1 - local33;
		@Pc(61) int local61 = (local33 - local52 << 12) / local33;
		@Pc(65) int local65 = arg0 * 6;
		@Pc(69) int local69 = local65 >> 12;
		@Pc(76) int local76 = local65 - (local69 << 12);
		@Pc(84) int local84 = local33 * local61 >> 12;
		@Pc(90) int local90 = local84 * local76 >> 12;
		@Pc(94) int local94 = local52 + local90;
		@Pc(99) int local99 = local33 - local90;
		if (local69 == 0) {
			this.anInt524 = local94;
			this.anInt522 = local52;
			this.anInt510 = local33;
		} else if (local69 == 1) {
			this.anInt510 = local99;
			this.anInt522 = local52;
			this.anInt524 = local33;
		} else if (local69 == 2) {
			this.anInt524 = local33;
			this.anInt522 = local94;
			this.anInt510 = local52;
		} else if (local69 == 3) {
			this.anInt510 = local52;
			this.anInt524 = local99;
			this.anInt522 = local33;
		} else if (local69 == 4) {
			this.anInt522 = local33;
			this.anInt510 = local94;
			this.anInt524 = local52;
		} else if (local69 == 5) {
			this.anInt510 = local33;
			this.anInt522 = local99;
			this.anInt524 = local52;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
	private void method330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(19) int local19 = arg0 < arg2 ? arg0 : arg2;
		@Pc(26) int local26 = arg1 <= local12 ? local12 : arg1;
		@Pc(47) int local47 = arg1 < local19 ? arg1 : local19;
		this.anInt518 = (local26 + local47) / 2;
		@Pc(58) int local58 = local26 - local47;
		if (local58 <= 0) {
			return;
		}
		if (this.anInt518 > 0 && this.anInt518 < 4096) {
			this.anInt523 = (local58 << 12) / (this.anInt518 <= 2048 ? this.anInt518 * 2 : 8192 - (this.anInt518 * 2));
		}
		@Pc(100) int local100 = (local26 - arg2 << 12) / local58;
		@Pc(108) int local108 = (local26 - arg0 << 12) / local58;
		@Pc(116) int local116 = (local26 - arg1 << 12) / local58;
		if (arg0 == local26) {
			this.anInt513 = arg2 == local47 ? local116 + 20480 : -local100 + 4096;
		} else if (arg2 == local26) {
			this.anInt513 = arg1 == local47 ? local108 + 4096 : 12288 - local116;
		} else {
			this.anInt513 = local47 == arg0 ? local100 + 12288 : 20480 - local108;
		}
		this.anInt513 /= 6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt515 = arg1.method1227();
		} else if (arg0 == 1) {
			this.anInt514 = (arg1.method1241() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt517 = (arg1.method1241() << 12) / 100;
		}
	}
}
