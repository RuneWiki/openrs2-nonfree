import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	private int anInt257 = 256;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	private int anInt256 = 0;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	private int anInt252 = 1;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "J")
	private long aLong21 = Static188.method2822();

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray5[local22] = this.aLong21;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)I")
	@Override
	public int method1024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt257;
		this.anInt257 = 300;
		@Pc(14) int local14 = this.anInt252;
		this.anInt252 = 1;
		this.aLong21 = Static188.method2822();
		if (this.aLongArray5[this.anInt255] == 0L) {
			this.anInt257 = local8;
			this.anInt252 = local14;
		} else if (this.aLongArray5[this.anInt255] < this.aLong21) {
			this.anInt257 = (int) ((long) (arg0 * 2560) / (this.aLong21 - this.aLongArray5[this.anInt255]));
		}
		if (this.anInt257 < 25) {
			this.anInt257 = 25;
		}
		if (this.anInt257 > 256) {
			this.anInt257 = 256;
			this.anInt252 = (int) ((long) arg0 - (this.aLong21 - this.aLongArray5[this.anInt255]) / 10L);
		}
		if (this.anInt252 > arg0) {
			this.anInt252 = arg0;
		}
		this.aLongArray5[this.anInt255] = this.aLong21;
		this.anInt255 = (this.anInt255 + 1) % 10;
		@Pc(141) int local141;
		if (this.anInt252 > 1) {
			for (local141 = 0; local141 < 10; local141++) {
				if (this.aLongArray5[local141] != 0L) {
					this.aLongArray5[local141] += this.anInt252;
				}
			}
		}
		if (arg1 > this.anInt252) {
			this.anInt252 = arg1;
		}
		Static210.method739((long) this.anInt252);
		local141 = 0;
		while (this.anInt256 < 256) {
			local141++;
			this.anInt256 += this.anInt257;
		}
		this.anInt256 &= 0xFF;
		return local141;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	@Override
	public void method1026() {
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray5[local15] = 0L;
		}
	}
}
