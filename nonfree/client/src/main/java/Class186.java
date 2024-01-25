import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class186 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
	public int anInt5339;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public int anInt5342;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
	public int anInt5345;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
	public int anInt5346;

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
	public int anInt5348;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public int anInt5340 = 16777215;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
	public int anInt5344 = 8;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!jr;I)V")
	private void method4414(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt5344 = arg1.method6044();
		} else if (arg0 == 2) {
			this.aBoolean374 = true;
		} else if (arg0 == 3) {
			this.anInt5345 = arg1.method6023();
			this.anInt5348 = arg1.method6023();
			this.anInt5339 = arg1.method6023();
		} else if (arg0 == 4) {
			this.anInt5346 = arg1.method6019();
		} else if (arg0 == 5) {
			this.anInt5342 = arg1.method6044();
		} else if (arg0 == 6) {
			this.anInt5340 = arg1.method6037();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method4415(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method4414(local9, arg0);
		}
	}
}
