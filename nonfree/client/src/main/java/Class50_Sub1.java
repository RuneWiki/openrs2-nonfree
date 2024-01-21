import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	private int anInt3142;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	private int anInt3141 = 1;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	private int anInt3146 = 0;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
	private int anInt3138 = 256;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "J")
	private long aLong94 = Static146.method2771();

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class50_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray3[local22] = this.aLong94;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3138;
		this.anInt3138 = 300;
		@Pc(14) int local14 = this.anInt3141;
		this.anInt3141 = 1;
		this.aLong94 = Static146.method2771();
		if (this.aLongArray3[this.anInt3142] == 0L) {
			this.anInt3138 = local8;
			this.anInt3141 = local14;
		} else if (this.aLong94 > this.aLongArray3[this.anInt3142]) {
			this.anInt3138 = (int) ((long) (arg1 * 2560) / (this.aLong94 - this.aLongArray3[this.anInt3142]));
		}
		if (this.anInt3138 < 25) {
			this.anInt3138 = 25;
		}
		if (this.anInt3138 > 256) {
			this.anInt3138 = 256;
			this.anInt3141 = (int) ((long) arg1 - (this.aLong94 - this.aLongArray3[this.anInt3142]) / 10L);
		}
		if (this.anInt3141 > arg1) {
			this.anInt3141 = arg1;
		}
		this.aLongArray3[this.anInt3142] = this.aLong94;
		this.anInt3142 = (this.anInt3142 + 1) % 10;
		@Pc(128) int local128;
		if (this.anInt3141 > 1) {
			for (local128 = 0; local128 < 10; local128++) {
				if (this.aLongArray3[local128] != 0L) {
					this.aLongArray3[local128] += this.anInt3141;
				}
			}
		}
		local128 = 0;
		if (this.anInt3141 < arg0) {
			this.anInt3141 = arg0;
		}
		Static114.method2304((long) this.anInt3141);
		while (this.anInt3146 < 256) {
			this.anInt3146 += this.anInt3138;
			local128++;
		}
		this.anInt3146 &= 0xFF;
		return local128;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void method2977() {
		for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
			this.aLongArray3[local19] = 0L;
		}
	}
}
