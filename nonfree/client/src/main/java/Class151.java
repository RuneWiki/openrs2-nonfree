import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class151 {

	@OriginalMember(owner = "client!it", name = "h", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	private int anInt5508;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class151(@OriginalArg(0) Class333 arg0) {
		this.aLong126 = arg0.anInt9674;
		this.anInt5508 = 1;
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "([Lclient!ug;)V")
	public Class151(@OriginalArg(0) Class333[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method4663(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	public int method4660() {
		return this.anInt5508;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ug;Z)V")
	private void method4663(@OriginalArg(0) Class333 arg0) {
		this.aLong126 |= arg0.anInt9674 << Static570.anInt9677 * this.anInt5508++;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I")
	private int method4664(@OriginalArg(0) int arg0) {
		return (int) (this.aLong126 >> arg0 * Static570.anInt9677) & 0xF;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(IB)Lclient!ug;")
	public Class333 method4666(@OriginalArg(0) int arg0) {
		return Static570.method7995(this.method4664(arg0));
	}
}
