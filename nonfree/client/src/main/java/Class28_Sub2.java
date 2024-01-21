import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class28_Sub2() {
		this.method716();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	@Override
	public int method715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong37 - System.nanoTime();
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		if (local4 < local9) {
			local4 = local9;
		}
		@Pc(18) int local18 = 0;
		Static62.method1070(local4 / 1000000L);
		@Pc(33) long local33 = System.nanoTime();
		while (local18 < 10 && (local18 < 1 || this.aLong37 < local33)) {
			this.aLong37 += (long) arg1 * 1000000L;
			local18++;
		}
		if (local33 > this.aLong37) {
			this.aLong37 = local33;
		}
		return local18;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	@Override
	public void method717() {
		this.method716();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	@Override
	public void method716() {
		this.aLong37 = System.nanoTime();
	}
}
