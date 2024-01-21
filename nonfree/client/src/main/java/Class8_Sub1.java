import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	private int anInt3202;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
	private int anInt3204;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
	private int anInt3207;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	private int anInt3209;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class8_Sub1() {
		this.method2240();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method2240() {
		this.anInt3204 = 256;
		this.anInt3207 = 1;
		this.anInt3209 = 0;
		this.aLong94 = Static52.method906();
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			this.aLongArray5[local20] = this.aLong94;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	@Override
	public void method2245() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray5[local3] = 0L;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3204;
		this.anInt3204 = 300;
		@Pc(14) int local14 = this.anInt3207;
		this.anInt3207 = 1;
		this.aLong94 = Static52.method906();
		if (this.aLongArray5[this.anInt3202] == 0L) {
			this.anInt3207 = local14;
			this.anInt3204 = local8;
		} else if (this.aLongArray5[this.anInt3202] < this.aLong94) {
			this.anInt3204 = (int) ((long) (arg0 * 2560) / (this.aLong94 - this.aLongArray5[this.anInt3202]));
		}
		if (this.anInt3204 < 25) {
			this.anInt3204 = 25;
		}
		if (this.anInt3204 > 256) {
			this.anInt3204 = 256;
			this.anInt3207 = (int) ((long) arg0 - (this.aLong94 - this.aLongArray5[this.anInt3202]) / 10L);
		}
		if (this.anInt3207 > arg0) {
			this.anInt3207 = arg0;
		}
		this.aLongArray5[this.anInt3202] = this.aLong94;
		this.anInt3202 = (this.anInt3202 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt3207 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray5[local136] != 0L) {
					this.aLongArray5[local136] += this.anInt3207;
				}
			}
		}
		if (this.anInt3207 < arg1) {
			this.anInt3207 = arg1;
		}
		Static70.method1226((long) this.anInt3207);
		local136 = 0;
		while (this.anInt3209 < 256) {
			local136++;
			this.anInt3209 += this.anInt3204;
		}
		this.anInt3209 &= 0xFF;
		return local136;
	}
}
