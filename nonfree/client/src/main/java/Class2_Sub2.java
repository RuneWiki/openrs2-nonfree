import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!q", name = "q", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class2_Sub2() {
		this.method1327();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void method1326() {
		this.method1327();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)I")
	@Override
	public int method1324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(6) long local6 = this.aLong64 - System.nanoTime();
		@Pc(11) long local11 = (long) arg1 * 1000000L;
		if (local6 < local11) {
			local6 = local11;
		}
		Static24.method505(local6 / 1000000L);
		@Pc(25) long local25 = System.nanoTime();
		while (local1 < 10 && (local1 < 1 || this.aLong64 < local25)) {
			local1++;
			this.aLong64 += (long) arg0 * 1000000L;
		}
		if (this.aLong64 < local25) {
			this.aLong64 = local25;
		}
		return local1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	@Override
	public void method1327() {
		this.aLong64 = System.nanoTime();
	}
}
