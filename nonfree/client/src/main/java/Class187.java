import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class187 {

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	public int anInt5690;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	public int anInt5692;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	public int anInt5695;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!bt;II)V")
	private void method4572(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5692 = arg0.method6004();
			this.anInt5690 = arg0.method6053();
			this.anInt5695 = arg0.method6053();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!bt;)V")
	public void method4573(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6053();
			if (local11 == 0) {
				return;
			}
			this.method4572(arg0, local11);
		}
	}
}
