import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class8_Sub1() {
		this.method834();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I")
	@Override
	public int method831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) arg1 * 1000000L;
		@Pc(15) long local15 = this.aLong19 - System.nanoTime();
		if (local15 < local10) {
			local15 = local10;
		}
		@Pc(27) int local27 = 0;
		Static34.method698(local15 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || this.aLong19 < local34)) {
			local27++;
			this.aLong19 += (long) arg0 * 1000000L;
		}
		if (this.aLong19 < local34) {
			this.aLong19 = local34;
		}
		return local27;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	@Override
	public void method834() {
		this.aLong19 = System.nanoTime();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method838() {
		this.method834();
	}
}
