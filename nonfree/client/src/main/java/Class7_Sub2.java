import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		this.method1657();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	@Override
	public void method1655() {
		this.method1657();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method1657() {
		this.aLong78 = System.nanoTime();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI)I")
	@Override
	public int method1652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong78 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static104.method1701(local9 / 1000000L);
		@Pc(27) long local27 = System.nanoTime();
		@Pc(29) int local29;
		for (local29 = 0; local29 < 10 && (local29 < 1 || local27 > this.aLong78); local29++) {
			this.aLong78 += (long) arg1 * 1000000L;
		}
		if (this.aLong78 < local27) {
			this.aLong78 = local27;
		}
		return local29;
	}
}
