import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class298 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "J")
	private long aLong249;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	private int anInt8248;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!gq;)V")
	public Class298(@OriginalArg(0) Class124 arg0) {
		this.aLong249 = (long) arg0.anInt3998;
		this.anInt8248 = 1;
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([Lclient!gq;)V")
	public Class298(@OriginalArg(0) Class124[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method7233(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!gq;")
	public Class124 method7230(@OriginalArg(0) int arg0) {
		return Static205.method3652(this.method7234(arg0));
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!gq;B)V")
	private void method7233(@OriginalArg(0) Class124 arg0) {
		this.aLong249 |= (long) (arg0.anInt3998 << Static205.anInt4002 * this.anInt8248++);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)I")
	private int method7234(@OriginalArg(0) int arg0) {
		return (int) (this.aLong249 >> arg0 * Static205.anInt4002) & 0xF;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I")
	public int method7235() {
		return this.anInt8248;
	}
}
