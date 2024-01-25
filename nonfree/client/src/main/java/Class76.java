import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class76 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
	private int anInt1737;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class76(@OriginalArg(0) Class341 arg0) {
		this.aLong40 = arg0.anInt8925;
		this.anInt1737 = 1;
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "([Lclient!uq;)V")
	public Class76(@OriginalArg(0) Class341[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method1470(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)I")
	public int method1468() {
		return this.anInt1737;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lclient!uq;")
	public Class341 method1469(@OriginalArg(0) int arg0) {
		return Static545.method7113(this.method1471(arg0));
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!uq;I)V")
	private void method1470(@OriginalArg(0) Class341 arg0) {
		this.aLong40 |= arg0.anInt8925 << this.anInt1737++ * Static545.anInt8928;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)I")
	private int method1471(@OriginalArg(0) int arg0) {
		return (int) (this.aLong40 >> Static545.anInt8928 * arg0) & 0xF;
	}
}
