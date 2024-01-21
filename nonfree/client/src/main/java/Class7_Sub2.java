import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private int anInt965 = 1;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
	private int anInt964 = 0;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	private int anInt967 = 256;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "J")
	private long aLong29 = Static47.method763();

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong29;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	@Override
	public int method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt967;
		this.anInt967 = 300;
		@Pc(19) int local19 = this.anInt965;
		this.anInt965 = 1;
		this.aLong29 = Static47.method763();
		if (this.aLongArray1[this.anInt963] == 0L) {
			this.anInt967 = local8;
			this.anInt965 = local19;
		} else if (this.aLongArray1[this.anInt963] < this.aLong29) {
			this.anInt967 = (int) ((long) (arg0 * 2560) / (this.aLong29 - this.aLongArray1[this.anInt963]));
		}
		if (this.anInt967 < 25) {
			this.anInt967 = 25;
		}
		if (this.anInt967 > 256) {
			this.anInt967 = 256;
			this.anInt965 = (int) ((long) arg0 - (this.aLong29 - this.aLongArray1[this.anInt963]) / 10L);
		}
		if (arg0 < this.anInt965) {
			this.anInt965 = arg0;
		}
		this.aLongArray1[this.anInt963] = this.aLong29;
		this.anInt963 = (this.anInt963 + 1) % 10;
		@Pc(132) int local132;
		if (this.anInt965 > 1) {
			for (local132 = 0; local132 < 10; local132++) {
				if (this.aLongArray1[local132] != 0L) {
					this.aLongArray1[local132] -= -((long) this.anInt965);
				}
			}
		}
		local132 = 0;
		if (this.anInt965 < arg1) {
			this.anInt965 = arg1;
		}
		Static35.method583((long) this.anInt965);
		while (this.anInt964 < 256) {
			local132++;
			this.anInt964 += this.anInt967;
		}
		this.anInt964 &= 0xFF;
		return local132;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public void method578() {
		for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
			this.aLongArray1[local13] = 0L;
		}
	}
}
