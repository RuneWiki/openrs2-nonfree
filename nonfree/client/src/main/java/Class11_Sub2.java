import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "J")
	private long aLong99 = System.nanoTime();

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII)I")
	@Override
	public int method2164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong99 - System.nanoTime();
		@Pc(12) int local12 = 0;
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (local4 < local17) {
			local4 = local17;
		}
		Static40.method783(local4 / 1000000L);
		@Pc(30) long local30 = System.nanoTime();
		while (local12 < 10 && (local12 < 1 || this.aLong99 < local30)) {
			local12++;
			this.aLong99 += (long) arg1 * 1000000L;
		}
		if (this.aLong99 < local30) {
			this.aLong99 = local30;
		}
		return local12;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	@Override
	public void method2158() {
		this.aLong99 = System.nanoTime();
	}
}
