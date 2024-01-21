import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		this.method1653();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	@Override
	public void method1651() {
		this.method1653();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)I")
	@Override
	public int method1654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong7 - System.nanoTime();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		@Pc(19) int local19 = 0;
		if (local4 < local17) {
			local4 = local17;
		}
		Static9.method179(local4 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		while (local19 < 10 && (local19 < 1 || this.aLong7 < local32)) {
			local19++;
			this.aLong7 += (long) arg1 * 1000000L;
		}
		if (this.aLong7 < local32) {
			this.aLong7 = local32;
		}
		return local19;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	@Override
	public void method1653() {
		this.aLong7 = System.nanoTime();
	}
}
