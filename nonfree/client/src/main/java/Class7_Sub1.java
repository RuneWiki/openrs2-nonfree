import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		this.method200();
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	private void method200() {
		this.anInt303 = 1;
		this.anInt290 = 0;
		this.anInt293 = 256;
		this.aLong16 = System.currentTimeMillis();
		for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
			this.aLongArray1[local19] = this.aLong16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	@Override
	public void method474() {
		for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
			this.aLongArray1[local9] = 0L;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)I")
	@Override
	public int method473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt293;
		this.anInt293 = 300;
		@Pc(19) int local19 = this.anInt303;
		this.anInt303 = 1;
		this.aLong16 = System.currentTimeMillis();
		if (this.aLongArray1[this.anInt304] == 0L) {
			this.anInt303 = local19;
			this.anInt293 = local4;
		} else if (this.aLong16 > this.aLongArray1[this.anInt304]) {
			this.anInt293 = (int) ((long) (arg0 * 2560) / (this.aLong16 - this.aLongArray1[this.anInt304]));
		}
		if (this.anInt293 < 25) {
			this.anInt293 = 25;
		}
		if (this.anInt293 > 256) {
			this.anInt293 = 256;
			this.anInt303 = (int) ((long) arg0 - (this.aLong16 - this.aLongArray1[this.anInt304]) / 10L);
		}
		if (this.anInt303 > arg0) {
			this.anInt303 = arg0;
		}
		this.aLongArray1[this.anInt304] = this.aLong16;
		this.anInt304 = (this.anInt304 + 1) % 10;
		@Pc(134) int local134;
		if (this.anInt303 > 1) {
			for (local134 = 0; local134 < 10; local134++) {
				if (this.aLongArray1[local134] != 0L) {
					this.aLongArray1[local134] += this.anInt303;
				}
			}
		}
		if (arg1 > this.anInt303) {
			this.anInt303 = arg1;
		}
		local134 = 0;
		Static91.method1548((long) this.anInt303);
		while (this.anInt290 < 256) {
			local134++;
			this.anInt290 += this.anInt293;
		}
		this.anInt290 &= 0xFF;
		return local134;
	}
}
