import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "J")
	private long aLong78 = System.nanoTime();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	@Override
	public void method929() {
		this.aLong78 = System.nanoTime();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I")
	@Override
	public int method931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong78 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		Static155.method2675(local9 / 1000000L);
		@Pc(27) int local27 = 0;
		@Pc(29) long local29 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || this.aLong78 < local29)) {
			local27++;
			this.aLong78 += (long) arg1 * 1000000L;
		}
		if (this.aLong78 < local29) {
			this.aLong78 = local29;
		}
		return local27;
	}
}
