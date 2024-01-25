import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7 {

	@OriginalMember(owner = "client!af", name = "g", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ku;)V")
	public Class7(@OriginalArg(0) Class198 arg0) {
		this.aLong10 = arg0.anInt4930;
		this.anInt138 = 1;
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "([Lclient!ku;)V")
	public Class7(@OriginalArg(0) Class198[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method105(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	private int method104(@OriginalArg(0) int arg0) {
		return (int) (this.aLong10 >> arg0 * Static282.anInt4935) & 0xF;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ku;)V")
	private void method105(@OriginalArg(1) Class198 arg0) {
		this.aLong10 |= arg0.anInt4930 << Static282.anInt4935 * this.anInt138++;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Lclient!ku;")
	public Class198 method106(@OriginalArg(0) int arg0) {
		return Static282.method3946(this.method104(arg0));
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
	public int method109() {
		return this.anInt138;
	}
}
