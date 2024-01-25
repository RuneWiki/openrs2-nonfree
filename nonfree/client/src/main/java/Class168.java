import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class168 {

	@OriginalMember(owner = "client!im", name = "d", descriptor = "J")
	private long aLong125;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	private int anInt4351;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class168(@OriginalArg(0) Class116 arg0) {
		this.aLong125 = (long) arg0.anInt2908;
		this.anInt4351 = 1;
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "([Lclient!gd;)V")
	public Class168(@OriginalArg(0) Class116[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method3645(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lclient!gd;")
	public Class116 method3644(@OriginalArg(1) int arg0) {
		return Static174.method2471(this.method3649(arg0));
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!gd;I)V")
	private void method3645(@OriginalArg(0) Class116 arg0) {
		this.aLong125 |= (long) (arg0.anInt2908 << Static174.anInt2909 * this.anInt4351++);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
	public int method3648() {
		return this.anInt4351;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)I")
	private int method3649(@OriginalArg(0) int arg0) {
		return (int) (this.aLong125 >> Static174.anInt2909 * arg0) & 0xF;
	}
}
