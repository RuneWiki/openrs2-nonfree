import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class147 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	private int anInt4457;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!gm;)V")
	public Class147(@OriginalArg(0) Class134 arg0) {
		this.anInt4457 = 1;
		this.aLong151 = (long) arg0.anInt4249;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([Lclient!gm;)V")
	public Class147(@OriginalArg(0) Class134[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method3654(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Lclient!gm;")
	public Class134 method3649(@OriginalArg(1) int arg0) {
		return Static219.method3498(this.method3651(arg0));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	public int method3650() {
		return this.anInt4457;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
	private int method3651(@OriginalArg(1) int arg0) {
		return (int) (this.aLong151 >> Static219.anInt4250 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!gm;)V")
	private void method3654(@OriginalArg(1) Class134 arg0) {
		this.aLong151 |= (long) (arg0.anInt4249 << Static219.anInt4250 * this.anInt4457++);
	}
}
