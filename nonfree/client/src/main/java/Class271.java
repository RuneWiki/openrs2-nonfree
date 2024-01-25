import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class271 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "J")
	private long aLong338;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
	private int anInt7695;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ko;)V")
	public Class271(@OriginalArg(0) Class193 arg0) {
		this.aLong338 = arg0.anInt5109;
		this.anInt7695 = 1;
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "([Lclient!ko;)V")
	public Class271(@OriginalArg(0) Class193[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6328(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!ko;)V")
	private void method6328(@OriginalArg(1) Class193 arg0) {
		this.aLong338 |= arg0.anInt5109 << this.anInt7695++ * Static278.anInt5110;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Lclient!ko;")
	public Class193 method6329(@OriginalArg(0) int arg0) {
		return Static278.method4291(this.method6332(arg0));
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)I")
	public int method6330() {
		return this.anInt7695;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)I")
	private int method6332(@OriginalArg(0) int arg0) {
		return (int) (this.aLong338 >> Static278.anInt5110 * arg0) & 0xF;
	}
}
