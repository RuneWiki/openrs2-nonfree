import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class318 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	private int anInt8751;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class318(@OriginalArg(0) Class174 arg0) {
		this.aLong237 = arg0.anInt4534;
		this.anInt8751 = 1;
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "([Lclient!jj;)V")
	public Class318(@OriginalArg(0) Class174[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method7062(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lclient!jj;")
	public Class174 method7060(@OriginalArg(0) int arg0) {
		return Static246.method3621(this.method7063(arg0));
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!jj;)V")
	private void method7062(@OriginalArg(1) Class174 arg0) {
		this.aLong237 |= arg0.anInt4534 << Static246.anInt4536 * this.anInt8751++;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)I")
	private int method7063(@OriginalArg(1) int arg0) {
		return (int) (this.aLong237 >> arg0 * Static246.anInt4536) & 0xF;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I")
	public int method7064() {
		return this.anInt8751;
	}
}
