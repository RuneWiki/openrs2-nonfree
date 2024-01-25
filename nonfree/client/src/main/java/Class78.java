import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class78 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!iv;)V")
	public Class78(@OriginalArg(0) Class164 arg0) {
		this.aLong77 = arg0.anInt4713;
		this.anInt2580 = 1;
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([Lclient!iv;)V")
	public Class78(@OriginalArg(0) Class164[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method2279(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
	public int method2278() {
		return this.anInt2580;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!iv;)V")
	private void method2279(@OriginalArg(1) Class164 arg0) {
		this.aLong77 |= arg0.anInt4713 << this.anInt2580++ * Static231.anInt4715;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Lclient!iv;")
	public Class164 method2280(@OriginalArg(0) int arg0) {
		return Static231.method3968()[this.method2282(arg0)];
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	private int method2282(@OriginalArg(0) int arg0) {
		return (int) (this.aLong77 >> Static231.anInt4715 * arg0) & 0xF;
	}
}
