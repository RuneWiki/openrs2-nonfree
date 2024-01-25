import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class388 {

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	private int anInt11090;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "J")
	private long aLong300;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!iq;)V")
	public Class388(@OriginalArg(0) Class170 arg0) {
		this.anInt11090 = 1;
		this.aLong300 = (long) arg0.anInt4517;
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([Lclient!iq;)V")
	public Class388(@OriginalArg(0) Class170[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method9236(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Lclient!iq;")
	public Class170 method9233(@OriginalArg(0) int arg0) {
		return Static256.method3745(this.method9237(arg0));
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!iq;)V")
	private void method9236(@OriginalArg(1) Class170 arg0) {
		this.aLong300 |= (long) (arg0.anInt4517 << Static256.anInt4521 * this.anInt11090++);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I")
	private int method9237(@OriginalArg(1) int arg0) {
		return (int) (this.aLong300 >> arg0 * Static256.anInt4521) & 0xF;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I")
	public int method9238() {
		return this.anInt11090;
	}
}
