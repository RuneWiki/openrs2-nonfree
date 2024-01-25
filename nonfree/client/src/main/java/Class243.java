import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class243 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	private int anInt6538;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class243(@OriginalArg(0) Class115 arg0) {
		this.aLong186 = (long) arg0.anInt2910;
		this.anInt6538 = 1;
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([Lclient!ff;)V")
	public Class243(@OriginalArg(0) Class115[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method5861(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!ff;)V")
	private void method5861(@OriginalArg(1) Class115 arg0) {
		this.aLong186 |= (long) (arg0.anInt2910 << Static169.anInt2911 * this.anInt6538++);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!ff;")
	public Class115 method5862(@OriginalArg(1) int arg0) {
		return Static169.method2529(this.method5864(arg0));
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	public int method5863() {
		return this.anInt6538;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)I")
	private int method5864(@OriginalArg(0) int arg0) {
		return (int) (this.aLong186 >> Static169.anInt2911 * arg0) & 0xF;
	}
}
